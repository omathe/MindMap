module diagram {
	
	requires javafx.fxml;
	requires javafx.base;
	requires transitive javafx.graphics;
	requires javafx.controls;
	
	opens fr.caratcode.mindmap.main.controller to javafx.fxml;
	
	exports fr.caratcode.mindmap.main to javafx.graphics;
}