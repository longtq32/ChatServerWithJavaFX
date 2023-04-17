module com.chatclientserver {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.chatclientserver to javafx.fxml;
    exports com.chatclientserver;
}