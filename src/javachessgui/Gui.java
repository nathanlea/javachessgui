package javachessgui;

import javafx.stage.*;

import javafx.scene.layout.HBox;


public class Gui {
    
    private Board b;
    private Game g;
    private Stage s;
    
    public HBox horizontal_box=new HBox(2);
    
    public void shutdown()
    {
        b.stop_engine_process();
    }
    
    public Gui(Stage set_s)
    {
              
        s=set_s;
        
        b=new Board(true);
        g=new Game(s,b);
        b.g=g;
        
        b.record_position();
        
        horizontal_box.getChildren().add(b.main_box);
        horizontal_box.getChildren().add(g.vertical_box);
        
    }
    
}
