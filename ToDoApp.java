import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ToDoApp extends JFrame {
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;
    private JTextField taskField;
    private JButton addButton, deleteButton;

    public ToDoApp() {
        // Frame setup
        setTitle("To-Do List App");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        // Layout setup
        setLayout(new BorderLayout(10, 10));

        //panel setup
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        taskField = new JTextField(20);
        addButton = new JButton("Add Task");
        deleteButton = new JButton("Delete Selected");

        inputPanel.add(taskField);
        inputPanel.add(addButton);
        inputPanel.add(deleteButton);

        // ==== Center Panel (Task List) ====
        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        taskList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(taskList);

        // ==== Add components to Frame ====
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // ==== Button Actions ====
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = taskField.getText().trim();
                if (!task.isEmpty()) {
                    taskListModel.addElement(task);
                    taskField.setText(""); // Clear field
                } else {
                    JOptionPane.showMessageDialog(ToDoApp.this,
                            "Please enter a task!", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    taskListModel.remove(selectedIndex);
                } else {
                    JOptionPane.showMessageDialog(ToDoApp.this,
                            "Please select a task to delete!", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Make visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run app on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new ToDoApp());
    }
}
