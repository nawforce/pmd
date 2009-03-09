package net.sourceforge.pmd.eclipse.ui.preferences.editors;

import net.sourceforge.pmd.PropertyDescriptor;
import net.sourceforge.pmd.Rule;
import net.sourceforge.pmd.eclipse.ui.preferences.br.SizeChangeListener;
import net.sourceforge.pmd.eclipse.ui.preferences.br.ValueChangeListener;
import net.sourceforge.pmd.lang.rule.properties.DoubleProperty;
import net.sourceforge.pmd.lang.rule.properties.PropertyDescriptorWrapper;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Spinner;

/**
 * 
 * @author Brian Remedios
 */
public class DoubleEditorFactory extends AbstractRealNumberEditor {

	public static final DoubleEditorFactory instance = new DoubleEditorFactory();
			
	private DoubleEditorFactory() { }

    public PropertyDescriptor<?> createDescriptor(String name, String description, Control[] otherData) {
        
        return new DoubleProperty(
                name, 
                description,
                defaultIn(otherData).doubleValue(),
                minimumIn(otherData).doubleValue(),
                maximumIn(otherData).doubleValue(),
                0.0f
                );
    }
	
    private static DoubleProperty doublePropertyFrom(PropertyDescriptor<?> desc) {
        
        if (desc instanceof PropertyDescriptorWrapper) {
           return (DoubleProperty) ((PropertyDescriptorWrapper<?>)desc).getPropertyDescriptor();
        } else {
            return (DoubleProperty)desc;
        }
    }
	
    protected Object valueFrom(Control valueControl) {
        
        return Double.valueOf(((Spinner)valueControl).getSelection() / scale);
    }
    
	public Control newEditorOn(Composite parent, final PropertyDescriptor<?> desc, final Rule rule, final ValueChangeListener listener, SizeChangeListener sizeListener) {

        final DoubleProperty dp = doublePropertyFrom(desc);            
        final Spinner spinner = newSpinnerFor(parent, rule, dp);
                                                
        spinner.addListener(SWT.FocusOut, new Listener() {
            public void handleEvent(Event event) {
                Double newValue = Double.valueOf(spinner.getSelection() / scale);
                if (newValue.equals(valueFor(rule, dp))) return;
                    
                rule.setProperty(dp, newValue);
                listener.changed(rule, dp, newValue);

                adjustRendering(rule, desc, spinner);
             }
         });
           
        return spinner;
     }
}
