# Swing Components Demo

This is a program written to demonstrate different components in Swing library. 

## Components used

## Step by Step explanation

### Importing Packages

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
```

Every required package is imported<br>
The swing and awt packages are imported for the components and their event subclasses has bee imported to implement there events and perform necessary action.

### Creating the constructor

```java
SwingComponentsDemo() {
    //app body
    ...
}
```

The `SwingComponentDemo` constructor is used in the main method of the class to start the app

### JFrame creation and setting properties

```java
JFrame frame = new JFrame("Swing Components Demo");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```

A `JFrame` object named "frame" is created with title as "Swing Components Demo". The default close operation is set to exit.

### Function calls for creating Panels for different components

```java
//panel for JLabel
JPanel labelPanel = createLabelPanel("Label Panel");
//panel for JButton
JPanel buttonPanel = createButtonPanel("Button Panel");
//panel for JToggleButton
JPanel toggleButtonPanel = createToggleButtonPanel("Toggle Button Panel");
//panel for JCheckbox
JPanel checkBoxPanel = createCheckBoxPanel("Checkbox Panel");
//panel for JRadioButton
JPanel radioButtonPanel = createRadioButtonPanel("Radio Button Panel");
//panel for JTextField
JPanel textFieldPanel = createTextFieldPanel("Text Field Panel");
//panel for JList
JPanel listPanel = createListPanel("List Panel");
//panle for JComboBox
JPanel comboBoxPanel = createComboBoxPanel("Combo Box Panel");
```

These panels are created using methods that will be explained later on.<br><br>

### Setting a Layout for the Frame

```java
frame.setLayout(new GridLayout(4, 2));
```

A `GridLayout` with 4 rows and 2 columns is set as the layout manager for the `JFrame`.

### Adding panels to the frame's content pane

```java
frame.add(labelPanel);
frame.add(buttonPanel);
frame.add(toggleButtonPanel);
frame.add(checkBoxPanel);
frame.add(radioButtonPanel);
frame.add(textFieldPanel);
frame.add(listPanel);
frame.add(comboBoxPanel);
```

Each panel is added to the `contentPane` of the `JFrame`, so they appear side by side below each other.

### Setting preferred size for all panels

```java
frame.setSize(500, 400);
```

The `preferredSize` property of each panel is set to `(500, 400)`.

### Setting the Frame to be visible

```java
frame.setVisible(true);
```

Finally, the visibility of the `JFrame` is set to true, making it visible on the screen.
<hr>

## Methods for Creating Panels

All these methods return an instance of `JPanel`. Each method creates a specific type of component.

### 1. Label Panel

Creates a `JLabel` in the center of the panel. The text "This is a label" appears next to the label.
```java
private JPanel createLabelPanel(String panelName) {
    JPanel panel = new JPanel();
    JLabel label = new JLabel(panelName);
    panel.add(label);
    return panel;
}
```

### 2. Button Panel

Creates two buttons: `Button 1` and `Button 2`. When either button is clicked, a message box with the corresponding button shows the event output.

```java
private JPanel createButtonPanel(String panelName) {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Event: ");
    JButton button = new JButton("Click Me");
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Event: Button Clicked!");
        }
    });
    panel.add(label);
    panel.add(button);
    return panel;
}
```

An `ActionListener` is registered to the button to track an `ActionEvent` which changes the text in label using `setText()` method.

```java
button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Event: Button Clicked!");
    }
});
```

The `actionPerformed()` method inside the anonymous class is called when the button is clicked. It changes the text of the associated `JLabel`. <br>
Adding multiple listeners to one component will cause each listener to be called when the event occurs.
<br>
<br><br><br><br>

<h1 style="color:#BDF492">
Adding the rest shortly ....
</h1>