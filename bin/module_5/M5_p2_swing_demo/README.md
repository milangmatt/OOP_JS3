 # Swing Demo

This is a simple Java program that demonstrates the use of the Swing package to create a JFrame and a JLabel.

## Step-by-Step Explanation

### 1. Import the necessary packages

```java
import javax.swing.*;
```

This line imports the Swing package, which contains the classes and interfaces needed to create graphical user interfaces (GUIs) in Java.

### 2. Create a JFrame

```java
JFrame jfrm = new JFrame("A Simple Swing");
```

This line creates a new JFrame object, which is the main window of a Swing application. The title of the frame is set to "A Simple Swing".

### 3. Set the size of the JFrame

```java
jfrm.setSize(275, 100);
```

This line sets the size of the JFrame to 275 pixels wide and 100 pixels high.

### 4. Set the default close operation for the JFrame

```java
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```

This line sets the default close operation for the JFrame to EXIT_ON_CLOSE, which means that the application will exit when the user clicks the close button on the frame.

### 5. Create a JLabel

```java
JLabel jlab = new JLabel("Hello welcome to a simple swing program");
```

This line creates a new JLabel object, which is used to display text on the frame. The text of the label is set to "Hello welcome to a simple swing program".
***JLabel is the simplest*** of all components of Swing as it has ***no interaction with the user*** and is ***passive***

### 6. Add the JLabel to the JFrame

```java
jfrm.add(jlab);
```

This line adds the JLabel to the JFrame.

### 7. Make the JFrame visible

```java
jfrm.setVisible(true);
```

This line makes the JFrame visible on the screen.

### 8. Schedule a job for the event-dispatching thread

```java
SwingUtilities.invokeLater(new Runnable() {
    public void run() {
        new Swing_demo();
    }
});
```

This line schedules a job for the event-dispatching thread, which is responsible for handling all GUI events. The job is to create a new instance of the Swing_demo class.

## Conclusion

This is a simple example of how to use the Swing package to create a JFrame and a JLabel. By following the steps in this
