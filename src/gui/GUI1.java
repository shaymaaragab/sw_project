package gui;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class GUI1 extends Application {


  private String ss="";

   
  public static void main(String[] args) { launch(args); }

  @Override 
  public void start(Stage stage) {
	  Label screen  = new Label(); 
	  
	  screen.setStyle("-fx-background-color:lightgray;-fx-border-color:green;");
	  stage.setWidth(300);
	  stage.setHeight(300);
	  
     GridPane  calc = createButtons(screen);
    stage.setTitle("Calc");
    stage.setScene(new Scene(createLayout(screen, calc)));
    stage.show();
  }

  private BorderPane createLayout(Label screen1, GridPane buttons) {
     BorderPane show = new BorderPane();
     show.setTop(screen1);
     show.setStyle("-fx-background-color:white;-fx-padding:5;-fx-font-size:10;");
     show.setCenter(buttons);
     screen1.setPrefSize(300, 200);
    screen1.prefHeightProperty().bind(show.heightProperty().divide(5));
    return show;
  }



private GridPane createButtons(Label screen){
	GridPane pane=new GridPane();
	pane.setAlignment(Pos.CENTER);
	pane.setPadding(new Insets(15, 5, 5, 5));
	 pane.setHgap(5);
	 pane.setVgap(5);
	 
Button b1=new Button("1");b1.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button b2=new Button("2");b2.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button b3=new Button("3");b3.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button b4=new Button("4");b4.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button b5=new Button("5");b5.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button b6=new Button("6");b6.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button b7=new Button("7");b7.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button b8=new Button("8");b8.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button b9=new Button("9");b9.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button b0=new Button("0");b0.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");

Button o1=new Button("CE"); o1.setStyle("-fx-base: slategray;-fx-font-weight: bold");
Button o8=new Button("C"); o8.setStyle("-fx-base:slategray;");

Button op1=new Button("sin");op1.setStyle("-fx-base: lightgray;-fx-font-weight: bold");
Button op2=new Button("cos");op2.setStyle("-fx-base: lightgray;-fx-font-weight: bold");
Button op3=new Button("tan");op3.setStyle("-fx-base: lightgray;-fx-font-weight: bold");
Button op4=new Button("x^y");op4.setStyle("-fx-base: lightgray;-fx-font-weight: bold");
Button op5=new Button("?");op5.setStyle("-fx-base: lightgray;-fx-font-weight: bold");

Button o2=new Button("-");o2.setStyle("-fx-base: lightgray; -fx-font-weight: bold;");
Button o3=new Button("*");o3.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button o4=new Button("/");o4.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button o5=new Button("Log");o5.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button o7=new Button("%");o7.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button o10=new Button("(");o10.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button o11=new Button(")");o11.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button o12=new Button("+");o12.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button o13=new Button("x^2");o13.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button o14=new Button("!");o14.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button o15=new Button("root");o15.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");

Button o6=new Button("=");o6.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");
Button o9=new Button(".");o9.setStyle("-fx-base: lightgray;-fx-font-weight: bold;");

b1.setOnAction(e-> {ss=ss+'1';screen.setText(ss);});
b2.setOnAction(e-> {ss=ss+'2';screen.setText(ss);});
b3.setOnAction(e-> {ss=ss+'3';screen.setText(ss);});
b4.setOnAction(e-> {ss=ss+'4';screen.setText(ss);});
b5.setOnAction(e-> {ss=ss+'5';screen.setText(ss);});
b6.setOnAction(e-> {ss=ss+'6';screen.setText(ss);});
b7.setOnAction(e-> {ss=ss+'7';screen.setText(ss);});
b8.setOnAction(e-> {ss=ss+'8';screen.setText(ss);});
b9.setOnAction(e-> {ss=ss+'9';screen.setText(ss);});
b0.setOnAction(e-> {ss=ss+"0";screen.setText(ss);});

op1.setOnAction(e-> {ss=ss+"sin(";screen.setText(ss);});
op2.setOnAction(e-> {ss=ss+"cos(";screen.setText(ss);});
op3.setOnAction(e-> {ss=ss+"tan(";screen.setText(ss);});
op4.setOnAction(e-> {ss=ss+"^";screen.setText(ss);});
op5.setOnAction(e-> {ss=ss+"?";screen.setText(ss);});


o1.setOnAction(e-> {ss="";screen.setText(ss);});
o2.setOnAction(e-> {ss=ss+" - ";screen.setText(ss);});
o3.setOnAction(e-> {ss=ss+" * ";screen.setText(ss);});
o4.setOnAction(e-> {ss=ss+" / ";screen.setText(ss);});
o5.setOnAction(e-> {ss=ss+"Log(";screen.setText(ss);});
    
     //add class fun semon //
//o6.setOnAction(e-> {ss= ""+evaluateExp(ss);screen.setText(ss);});
o7.setOnAction(e-> {ss=ss+'%';screen.setText(ss);});
o8.setOnAction(e-> {

	if(ss.length()>=3&&ss.charAt(ss.length()-1)=='t')
	{ss=ss.substring(0,ss.length()-4);screen.setText(ss);}
	else if(ss.length()>=2&&ss.charAt(ss.length()-2)=='^')
	{ss=ss.substring(0,ss.length()-2);screen.setText(ss);}
	else if(ss.length()>=3&&ss.charAt(ss.length()-1)=='G')
	{ss=ss.substring(0,ss.length()-3);screen.setText(ss);}
	else if (ss.length()>=1&&ss.length()>0)
{
	ss=ss.substring(0,ss.length()-1);
	screen.setText(ss);
	
}}
);
o9.setOnAction(e-> {ss=ss+'.';screen.setText(ss);});
o10.setOnAction(e-> {ss=ss+" ( ";screen.setText(ss);});
o11.setOnAction(e-> {ss=ss+" ) " ;screen.setText(ss);});
o12.setOnAction(e-> {ss=ss+" + ";screen.setText(ss);});
o13.setOnAction(e-> {ss=ss+"^2";screen.setText(ss);});
o14.setOnAction(e-> {ss=ss+'!';screen.setText(ss);});
o15.setOnAction(e-> {ss=ss+"root(";screen.setText(ss);});

b1.prefWidthProperty().bind(pane.widthProperty().divide(6));
b2.prefWidthProperty().bind(pane.widthProperty().divide(6));
b3.prefWidthProperty().bind(pane.widthProperty().divide(6));
b4.prefWidthProperty().bind(pane.widthProperty().divide(6));
b5.prefWidthProperty().bind(pane.widthProperty().divide(6));
b6.prefWidthProperty().bind(pane.widthProperty().divide(6));
b7.prefWidthProperty().bind(pane.widthProperty().divide(6));
b8.prefWidthProperty().bind(pane.widthProperty().divide(6));
b9.prefWidthProperty().bind(pane.widthProperty().divide(6));
b0.prefWidthProperty().bind(pane.widthProperty().divide(6));


o1.prefWidthProperty().bind(pane.widthProperty().divide(6));
o2.prefWidthProperty().bind(pane.widthProperty().divide(6));
o3.prefWidthProperty().bind(pane.widthProperty().divide(6));
o4.prefWidthProperty().bind(pane.widthProperty().divide(6));
o5.prefWidthProperty().bind(pane.widthProperty().divide(6));
o6.prefWidthProperty().bind(pane.widthProperty().divide(6));
o7.prefWidthProperty().bind(pane.widthProperty().divide(6));
o8.prefWidthProperty().bind(pane.widthProperty().divide(6));
o9.prefWidthProperty().bind(pane.widthProperty().divide(6));
o10.prefWidthProperty().bind(pane.widthProperty().divide(6));
o11.prefWidthProperty().bind(pane.widthProperty().divide(6));
o12.prefWidthProperty().bind(pane.widthProperty().divide(6));
o13.prefWidthProperty().bind(pane.widthProperty().divide(6));
o14.prefWidthProperty().bind(pane.widthProperty().divide(6));
o15.prefWidthProperty().bind(pane.widthProperty().divide(6));
  
op1.prefWidthProperty().bind(pane.widthProperty().divide(6));
op2.prefWidthProperty().bind(pane.widthProperty().divide(6));
op3.prefWidthProperty().bind(pane.widthProperty().divide(6));
op4.prefWidthProperty().bind(pane.widthProperty().divide(6));
op5.prefWidthProperty().bind(pane.widthProperty().divide(6));


b1.prefHeightProperty().bind(pane.heightProperty().divide(6));
b2.prefHeightProperty().bind(pane.heightProperty().divide(6));
b3.prefHeightProperty().bind(pane.heightProperty().divide(6));
b4.prefHeightProperty().bind(pane.heightProperty().divide(6));
b5.prefHeightProperty().bind(pane.heightProperty().divide(6));
b6.prefHeightProperty().bind(pane.heightProperty().divide(6));
b7.prefHeightProperty().bind(pane.heightProperty().divide(6));
b8.prefHeightProperty().bind(pane.heightProperty().divide(6));
b9.prefHeightProperty().bind(pane.heightProperty().divide(6));
b0.prefHeightProperty().bind(pane.heightProperty().divide(6));

op1.prefHeightProperty().bind(pane.heightProperty().divide(6));
op2.prefHeightProperty().bind(pane.heightProperty().divide(6));
op3.prefHeightProperty().bind(pane.heightProperty().divide(6));
op4.prefHeightProperty().bind(pane.heightProperty().divide(6));
op5.prefHeightProperty().bind(pane.heightProperty().divide(6));


o1.prefHeightProperty().bind(pane.heightProperty().divide(6));
o2.prefHeightProperty().bind(pane.heightProperty().divide(6));
o3.prefHeightProperty().bind(pane.heightProperty().divide(6));
o4.prefHeightProperty().bind(pane.heightProperty().divide(6));
o5.prefHeightProperty().bind(pane.heightProperty().divide(6));
o6.prefHeightProperty().bind(pane.heightProperty().divide(6));
o7.prefHeightProperty().bind(pane.heightProperty().divide(6));
o8.prefHeightProperty().bind(pane.heightProperty().divide(6));
o9.prefHeightProperty().bind(pane.heightProperty().divide(6));
o10.prefHeightProperty().bind(pane.heightProperty().divide(6));
o11.prefHeightProperty().bind(pane.heightProperty().divide(6));
o12.prefHeightProperty().bind(pane.heightProperty().divide(6));
o13.prefHeightProperty().bind(pane.heightProperty().divide(6));
o14.prefHeightProperty().bind(pane.heightProperty().divide(6));
o15.prefHeightProperty().bind(pane.heightProperty().divide(6));


pane.add(op1, 0, 0);
pane.add(op2, 1, 0);
pane.add(op3, 2, 0);
pane.add(op4, 3, 0);
pane.add(op5, 4, 0);

pane.add(o1, 0, 1);
pane.add(o8, 1, 1);
pane.add(o10, 2, 1);
pane.add(o11, 3, 1);
pane.add(o5, 4, 1);

pane.add(b1, 0, 2);
pane.add(b2, 1, 2);
pane.add(b3, 2, 2);
pane.add(o4, 3, 2);
pane.add(o7, 4, 2); 

pane.add(b4, 0, 3);
pane.add(b5, 1, 3);
pane.add(b6, 2, 3);
pane.add(o3, 3, 3);
pane.add(o13, 4, 3);

pane.add(b7, 0, 4);
pane.add(b8, 1, 4);
pane.add(b9, 2, 4);
pane.add(o2, 3, 4);
pane.add(o14, 4, 4);

pane.add(o9, 0, 5);
pane.add(b0, 1, 5);
pane.add(o6, 2, 5);
pane.add(o12, 3, 5);
pane.add(o15, 4, 5);



return pane;
	
}



}