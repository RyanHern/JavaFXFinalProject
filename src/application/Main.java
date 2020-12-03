/**
 * 
 * Death Eaters: Charles Jiron, Thomas Balaki, and Ryan Hern
 * Title: Only Death Awaits!
 * Course: COP1800 : Intro to Java
 * 
 */

package application;
	

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.effect.Glow;
import javafx.scene.effect.SepiaTone;
import javafx.scene.effect.DropShadow;


public class Main extends Application 
{
	/**
	 * @author Charles Jiron
	 * 
	 *  Field for the Scene control
	 */
	
	Scene Scene1, Scene2, Scene3, Scene4, Scene5;
	Scene Scene4B, Scene4K, Scene4L, Scene4B2, Scene4BRC, Scene4LIVING, SceneAttic, SceneBasement, SceneOutside;
	Scene DeathScene, DeathScene2, DeathScene3;
	Scene Scene3A, Scene3K, Scene3L, Scene3D, Scene3DF, MainChoiceScene1, Scene3RunAway, Scene3WalkTowards, Scene3ClimbTree, Scene3DyingSceneQ1, SurvivalScene3Y2, DyingDeadScene3;
	Scene Scene5C, Scene5S, Scene5P, SceneDeathS5, DeathSceneS52;
	/**
	 * @author Charles Jiron
	 * 
	 * The whole process will be a Horror story base concept game
	 * The user will have to go through path of the story to find the right way to survive.
	 * If not they die; however, you may not know which path is the right one.
	 * Therefore, i advise to choose your option or paths wisely!!!
	 * The user also have to input their name and gender to be save for the game.
	 * The game will be simple and your only enemy is yourself and your choices.
	 * 
	 * Good Luck!!!
	 *
	 */
	
	public static void main(String[] args) 
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{

		// Set the windows title
		primaryStage.setTitle("Only Death Awaits!");
		
		/**
		 * 
		 * This Imports a Image for the first scene and uses an object to call it to make it easier to use.
		 * 
		 */
		
		// New VBox for the Image Scene 1
		VBox MainMenu = new VBox();
		
		// Image Object of Scene 1
		Image Death = new Image("https://torteenblog.com/wp-content/uploads/2019/04/SmallTownBigMystery.jpg");
		
		// Create an Image View of Scene 1
		ImageView DeathView = new ImageView(Death);
		MainMenu.getChildren().addAll(DeathView);
		MainMenu.setAlignment(Pos.CENTER);
		
		/**
		 * 
		 * We are using the some special effects for the title in Scene 1
		 * 
		 */
		
		// Creating a Glow effect for the title in all Scenes
		Glow Reflect = new Glow();
		
		// Creating a DropShadow effect for the title in all Scenes
		DropShadow Shadow = new DropShadow();
		
		/**
		 * 
		 * This creates the title label for Scene 1 and it also adds a specific font and size
		 * It also adds color and the special effect
		 * 
		 */
		
		// Create a title Label and Adding color / effect for Scene 1
		Label Title1 = new Label("ONLY DEATH AWAITS");
		Title1.setFont(new Font("Bahnschrift", 35));
		Title1.setTextFill(Color.BLACK);
		Title1.setEffect(Reflect);
		Title1.setEffect(Shadow);
		
		/**
		 * 
		 * 
		 * This creates many label controls with their respectful text field for user input like their name and Gender
		 * It also added a specific font and size with their respectful colors.
		 * 
		 * 
		 */
		
		// Create  a label control and Adding color for Scene 1
		Label Welcome = new Label("Welcome to the Main Menu");
		Label PlayLabel = new Label("Click to Play!");
		Label ExitLabel = new Label("Click to Exit!");
		Label SubmitSave = new Label("Submit to Save:");
		Label FirstNameLabel = new Label("First Name: ");
		Label LastNameLabel = new Label("Last Name: ");
		Label GenderLabel = new Label("Gender: ");
		TextField FirstNameText = new TextField();
		TextField LastNameText = new TextField();
		TextField GenderText = new TextField();
		PlayLabel.setTextFill(Color.BLACK);
		PlayLabel.setFont(new Font("Bahnschrift", 11));
		ExitLabel.setTextFill(Color.BLACK);
		ExitLabel.setFont(new Font("Bahnschrift", 11));
		SubmitSave.setTextFill(Color.BLUE);
		SubmitSave.setFont(new Font("Bahnschrift", 11));
		FirstNameLabel.setTextFill(Color.BROWN);
		FirstNameLabel.setFont(new Font("Bahnschrift", 11));
		LastNameLabel.setTextFill(Color.BROWN);
		LastNameLabel.setFont(new Font("Bahnschrift", 11));
		GenderLabel.setTextFill(Color.BROWN);
		GenderLabel.setFont(new Font("Bahnschrift", 11));
		
		
		
		
		/**
		 * 
		 * 
		 * Creating many buttons for the Main Menu like
		 * Having Play Button to go to the next Scene 
		 * Having Quit Button to exit the program
		 * Having Submit Button to submit and save the user name and gender
		 * 
		 * Quit Button - Uses an action event to make the platform exit
		 * 
		 */
		
		// Control Button of Play and Quit for Scene1
		Button PlayButton = new Button("Play");
		Button QuitButton = new Button("Quit");
		Button SubmitButton = new Button("Submit");
		PlayButton.setStyle("-fx-text-fill: #0a9118");
		QuitButton.setStyle("-fx-text-fill: #e6109c");
		
		/**
		 * 
		 * Imports a second image for Scene 2 and uses an object to call it to make it easier to use.
		 * 
		 */
		
		// New VBox for Scene 2 image
		VBox ImageScene2 = new VBox();
		
		// Image Object of Scene 2
		Image Path = new Image("https://i.pinimg.com/736x/6f/a6/0e/6fa60ebb4dd2bde05735167b3a1837ca.jpg");
		
		// Create an Image View of Scene 2
		ImageView PathView = new ImageView(Path);
		ImageScene2.getChildren().addAll(PathView);
		ImageScene2.setAlignment(Pos.CENTER);
		
		/**
		 * 
		 * Creates a new title called path selection to tell the user to select a path.
		 * Creates new buttons to make the buttons work and go to the next scene.
		 * They have their own respectful colors as well
		 * 
		 * Forest Button - Goes to next Scene for the Forest Path
		 * House Button - Goes to next Scene for the House Path
		 * Village Button - Goes to next Scene for the Village Path
		 * 
		 */
		
		// Button two and Color for Scene 2
		Button Forest = new Button("Forest Path");
		Forest.setTextFill(Color.GREEN);
		Button House = new Button("House Path");
		House.setTextFill(Color.BLUE);
		Button Town = new Button("Town Path");
		Town.setTextFill(Color.BROWN);
		Button Exit = new Button("Quit");
		Exit.setTextFill(Color.PURPLE);
		
		// Exit Button set action to exit the platform or quit the game.
		Exit.setOnAction(new ButtonClickHandlerExit());
		
		// Title Label for Scene 2
		Label TitleScene2 = new Label("Path Selection");
		TitleScene2.setFont(new Font("Bahnschrift", 35));
		TitleScene2.setTextFill(Color.BLACK);
		TitleScene2.setEffect(Reflect);
		TitleScene2.setEffect(Shadow);
		
		/**
		 * 
		 * 
		 * This is just for the layout and Alignment for each part in Scene 2. While also creating the Scene
		 * 
		 */
		
		// LayOut for Scene 2 and Alignment for Scene 2
		HBox SelectionPath = new HBox(55, House, Town, Forest, Exit);
		SelectionPath.setAlignment(Pos.CENTER);
		VBox IMAGESCENE2 = new VBox(20, ImageScene2);
		IMAGESCENE2.setAlignment(Pos.CENTER);
		VBox Title = new VBox(20, TitleScene2);
		Title.setAlignment(Pos.CENTER);
		VBox LayOut2 = new VBox(10, Title, SelectionPath, IMAGESCENE2);
		Scene2 = new Scene(LayOut2, 800, 800);
		
		/**
		 * Author: Charles 
		 * 
		 * Title Label for Scene Four with their respectful font, size, color, and special effect.
		 * 
		 * Dialogue
		 */
		
		// Title Label and Dialogue for Scene 4
		Label HouseTitle = new Label("House Path");	
		Label DialogueScene4P1 = new Label("You're starting to wake up");
		Label DialogueScene4P2 = new Label("You believe it will be a lovely day");
		Label DialogueScene4P3 = new Label("Therefore, to start off the day");
		Label DialogueScene4P4 = new Label("You decide to go to the bathroom and brush your teeth");
		HouseTitle.setFont(new Font("Bahnschrift", 35));
		HouseTitle.setTextFill(Color.BLACK);
		HouseTitle.setEffect(Reflect);
		HouseTitle.setEffect(Shadow);
		DialogueScene4P1.setFont(new Font("Bahnschrift", 11));
		DialogueScene4P2.setFont(new Font("Bahnschrift", 11));
		DialogueScene4P3.setFont(new Font("Bahnschrift", 11));
		DialogueScene4P4.setFont(new Font("Bahnschrift", 11));
		DialogueScene4P1.setTextFill(Color.BLACK);
		DialogueScene4P2.setTextFill(Color.BLACK);
		DialogueScene4P3.setTextFill(Color.BLACK);
		DialogueScene4P4.setTextFill(Color.BLACK);
		DialogueScene4P1.setEffect(Reflect);
		DialogueScene4P1.setEffect(Shadow);
		DialogueScene4P2.setEffect(Reflect);
		DialogueScene4P2.setEffect(Shadow);
		DialogueScene4P3.setEffect(Reflect);
		DialogueScene4P3.setEffect(Shadow);
		DialogueScene4P4.setEffect(Reflect);
		DialogueScene4P4.setEffect(Shadow);
		
		// Creating a Button to go from Scene 4 bedroom to Scene 4B Bathroom.
		Button Bathroom = new Button("Bathroom");
		Bathroom.setTextFill(Color.BLUE);
		Bathroom.setFont(new Font("Bahnscrift", 11));
		
		// Button Action to the Kitchen Scene
		Bathroom.setOnAction(e -> primaryStage.setScene(Scene4B));
		
		/**
		 * 
		 * Creating a new Scene for the bathroom after Scene 4
		 * 
		 * Author: Charles jiron
		 * 
		 */
		
		// Scene 4B Bathroom
		Label BathroomTitle = new Label("Bathroom");
		BathroomTitle.setFont(new Font("Bahnschrift", 35));
		BathroomTitle.setTextFill(Color.BLACK);
		BathroomTitle.setEffect(Reflect);
		BathroomTitle.setEffect(Shadow);
		Label DialogueScene4K = new Label("While looking at the mirror, you appear to be looking very sluggish");
		Label DialogueScene4K2 = new Label("You thought you might have been working late at night far too many times");
		Label DialogueScene4K3 = new Label("Regardless, you wash your face and start to brush your teeth");
		Label DialogueScene4K4 = new Label("Once you have come to your senses and have washed your teeth");
		Label DialogueScene4K5 = new Label("You decide to head to the kitchen for some breakfast");
		DialogueScene4K.setFont(new Font("Bahnschrift", 11));
		DialogueScene4K2.setFont(new Font("Bahnschrift", 11));
		DialogueScene4K3.setFont(new Font("Bahnschrift", 11));
		DialogueScene4K4.setFont(new Font("Bahnschrift", 11));
		DialogueScene4K5.setFont(new Font("Bahnschrift", 11));
		DialogueScene4K.setTextFill(Color.BLACK);
		DialogueScene4K2.setTextFill(Color.BLACK);
		DialogueScene4K3.setTextFill(Color.BLACK);
		DialogueScene4K4.setTextFill(Color.BLACK);
		DialogueScene4K5.setTextFill(Color.BLACK);
		DialogueScene4K.setEffect(Shadow);
		DialogueScene4K.setEffect(Reflect);
		DialogueScene4K2.setEffect(Shadow);
		DialogueScene4K2.setEffect(Reflect);
		DialogueScene4K3.setEffect(Shadow);
		DialogueScene4K3.setEffect(Reflect);
		DialogueScene4K4.setEffect(Shadow);
		DialogueScene4K4.setEffect(Reflect);
		DialogueScene4K5.setEffect(Shadow);
		DialogueScene4K5.setEffect(Reflect);
		
		// Create a Button to go from the Bathroom scenes of 4B to Kitchen scene of 4K
		Button Kitchen = new Button("Kitchen");
		Kitchen.setTextFill(Color.BLUE);
		Kitchen.setFont(new Font("Bahnscrift", 11));
	
		
		// Button Action to go from Scene 4B to 4K
		Kitchen.setOnAction(e -> primaryStage.setScene(Scene4K));
		
		
		// Importing an image for Scene 4B
		VBox ImagesS4B = new VBox();
		
		// Image Object for Scene 4B image
		Image IMAGES4B = new Image("https://www.lushome.com/wp-content/uploads/2013/10/small-bathroom-decorating-ideas-7.jpg");
		
		// Create an Image view with special effects for the image
		SepiaTone BATH = new SepiaTone();
		ImageView S4BView = new ImageView(IMAGES4B);
		ImagesS4B.getChildren().addAll(S4BView);
		ImagesS4B.setEffect(BATH);
		ImagesS4B.setAlignment(Pos.CENTER);
		
		// Creating the scene
		VBox dialogue4K = new VBox(10, DialogueScene4K, DialogueScene4K2, DialogueScene4K3, DialogueScene4K4, DialogueScene4K5);
		dialogue4K.setAlignment(Pos.CENTER);
		HBox KButton = new HBox(20, Kitchen);
		KButton.setAlignment(Pos.CENTER);
		HBox Bathtitle = new HBox(20, BathroomTitle);
		Bathtitle.setAlignment(Pos.CENTER);
		VBox BATHROOM = new VBox(15, ImagesS4B);
		BATHROOM.setAlignment(Pos.CENTER);
		VBox S4BATH = new VBox(10, Bathtitle, BATHROOM, dialogue4K, KButton);
		Scene4B = new Scene(S4BATH, 850, 850);
		
		// Scene 4K Kitchen
		Label KitchenTitle = new Label("Kitchen");
		KitchenTitle.setFont(new Font("Bahnschrift", 35));
		KitchenTitle.setTextFill(Color.BLACK);
		KitchenTitle.setEffect(Reflect);
		KitchenTitle.setEffect(Shadow);
		Label DialogueScene4L = new Label("In the Kitchen, you decide to cook an omelet with some toast");
		Label DialogueScene4L2 = new Label("While cooking your food, you notice that the kitchen window is surprisingly open");
		Label DialogueScene4L3 = new Label("This gives you the impression that it must have been your parents who got up early for work and forgot to close the window");
		Label DialogueScene4L4 = new Label("Regardless, your food was made and ready to be eaten");
		Label DialogueScene4L5 = new Label("You grab a plate, coffee, and decide to eat in the living room");
		DialogueScene4L.setFont(new Font("Bahnschrift", 11));
		DialogueScene4L2.setFont(new Font("Bahnschrift", 11));
		DialogueScene4L3.setFont(new Font("Bahnschrift", 11));
		DialogueScene4L4.setFont(new Font("Bahnschrift", 11));
		DialogueScene4L5.setFont(new Font("Bahnschrift", 11));
		DialogueScene4L.setTextFill(Color.BLACK);
		DialogueScene4L2.setTextFill(Color.BLACK);
		DialogueScene4L3.setTextFill(Color.BLACK);
		DialogueScene4L4.setTextFill(Color.BLACK);
		DialogueScene4L5.setTextFill(Color.BLACK);
		DialogueScene4L.setEffect(Shadow);
		DialogueScene4L.setEffect(Reflect);
		DialogueScene4L2.setEffect(Shadow);
		DialogueScene4L2.setEffect(Reflect);
		DialogueScene4L3.setEffect(Shadow);
		DialogueScene4L3.setEffect(Reflect);
		DialogueScene4L4.setEffect(Shadow);
		DialogueScene4L4.setEffect(Reflect);
		DialogueScene4L5.setEffect(Shadow);
		DialogueScene4L5.setEffect(Reflect);
		
		// Create a Button to go from the Kitchen scene of 4K to Living room scene of 4L
		Button LivingRoom = new Button("Living Room");
		LivingRoom.setTextFill(Color.BLUE);
		LivingRoom.setFont(new Font("Bahnscrift", 11));
		
		// Button Action to go from Scene 4K to 4L
		LivingRoom.setOnAction(e -> primaryStage.setScene(Scene4L));
		
		// Import an Image for the Kitchen Scene
		VBox ImagesS4K = new VBox();
		
		// Image Object for Scene 4K image
		Image IMAGES4K = new Image("http://cdn.homedit.com/wp-content/uploads/2015/06/blue-and-white-two-toned-kitchen-design.jpg");
		
		// Create an Image view with special effects for the image
		SepiaTone KITCHEN = new SepiaTone();
		ImageView S4KView = new ImageView(IMAGES4K);
		ImagesS4K.getChildren().addAll(S4KView);
		ImagesS4K.setEffect(KITCHEN);
		ImagesS4K.setAlignment(Pos.CENTER);
		
		
		// Creating the scene
		VBox dialogue4L = new VBox(10, DialogueScene4L, DialogueScene4L2, DialogueScene4L3, DialogueScene4L4, DialogueScene4L5);
		dialogue4L.setAlignment(Pos.CENTER);
		HBox LButton = new HBox(20, LivingRoom);
		LButton.setAlignment(Pos.CENTER);
		HBox Kitchentitle = new HBox(20, KitchenTitle);
		Kitchentitle.setAlignment(Pos.CENTER);
		VBox kitchen = new VBox(15, ImagesS4K);
		kitchen.setAlignment(Pos.CENTER);
		VBox S4KITCHEN = new VBox(10, Kitchentitle, kitchen, dialogue4L, LButton);
		Scene4K = new Scene(S4KITCHEN, 800, 1000);
		
		
		// Scene 4L Living Room
		Label LivingRoomTitle = new Label("Living Room");
		LivingRoomTitle.setFont(new Font("Bahnschrift", 35));
		LivingRoomTitle.setTextFill(Color.BLACK);
		LivingRoomTitle.setEffect(Reflect);
		LivingRoomTitle.setEffect(Shadow);
		Label DialogueScene4BP2 = new Label("You decide to sit on couch to watch some TV and eat your breakfast");
		Label DialogueScene4BP22 = new Label("Two minutes have passed and you notice that it started to pour outside");
		Label DialogueScene4BP23 = new Label("You brush it off stating that it will be nothing and continue to watch some TV");
		Label DialogueScene4BP24 = new Label("A few more minutes have pass and you notice that it's almost time for work");
		Label DialogueScene4BP25 = new Label("Once done with your meal, you place the plate in the dishwasher and head back to the bathroom for a shower and prepare yourself for work");
		DialogueScene4BP2.setFont(new Font("Bahnschrift", 11));
		DialogueScene4BP22.setFont(new Font("Bahnschrift", 11));
		DialogueScene4BP23.setFont(new Font("Bahnschrift", 11));
		DialogueScene4BP24.setFont(new Font("Bahnschrift", 11));
		DialogueScene4BP25.setFont(new Font("Bahnschrift", 11));
		DialogueScene4BP2.setTextFill(Color.BLACK);
		DialogueScene4BP22.setTextFill(Color.BLACK);
		DialogueScene4BP23.setTextFill(Color.BLACK);
		DialogueScene4BP24.setTextFill(Color.BLACK);
		DialogueScene4BP25.setTextFill(Color.BLACK);
		DialogueScene4BP2.setEffect(Shadow);
		DialogueScene4BP2.setEffect(Reflect);
		DialogueScene4BP22.setEffect(Shadow);
		DialogueScene4BP22.setEffect(Reflect);
		DialogueScene4BP23.setEffect(Shadow);
		DialogueScene4BP23.setEffect(Reflect);
		DialogueScene4BP24.setEffect(Shadow);
		DialogueScene4BP24.setEffect(Reflect);
		DialogueScene4BP25.setEffect(Shadow);
		DialogueScene4BP25.setEffect(Reflect);
		
		// Create a Button to go from the Living Room scene of 4L to Bathroom Scene 2 of Scene4B2
		Button Shower = new Button("Shower");
		Shower.setTextFill(Color.BLUE);
		Shower.setFont(new Font("Bahnscrift", 11));
		
		// Button Action to go from Scene 4L to 4B2
		Shower.setOnAction(e -> primaryStage.setScene(Scene4B2));
				
		// Importing an image for Scene 4L
		VBox ImagesS4LR = new VBox();
				
		// Image Object for Scene 4L image
		Image IMAGES4LR = new Image("https://www.homestratosphere.com/wp-content/uploads/2019/05/modern-black-livingroom-may222019-min-870x580.jpg");
				
		// Create an Image view with special effects for the image
		SepiaTone LR = new SepiaTone();
		ImageView S4LRView = new ImageView(IMAGES4LR);
		ImagesS4LR.getChildren().addAll(S4LRView);
		ImagesS4LR.setEffect(LR);
		ImagesS4LR.setAlignment(Pos.CENTER);
		
		// creating the scene
		
		VBox dialogueBathroomTwo = new VBox(10, DialogueScene4BP2, DialogueScene4BP22, DialogueScene4BP23, DialogueScene4BP24, DialogueScene4BP25);
		dialogueBathroomTwo.setAlignment(Pos.CENTER);
		HBox SButton = new HBox(20, Shower);
		SButton.setAlignment(Pos.CENTER);
		VBox Living = new VBox(15, ImagesS4LR);
		Living.setAlignment(Pos.CENTER);
		HBox LIVINGROOM = new HBox(20, LivingRoomTitle);
		LIVINGROOM.setAlignment(Pos.CENTER);
		VBox FINALR= new VBox(10, LIVINGROOM, Living, dialogueBathroomTwo, SButton);
		Scene4L = new Scene(FINALR, 800, 900);
		
		
		// Scene 4B2 Shower Scene
		Label ShowerTitle = new Label("Bathroom");
		ShowerTitle.setFont(new Font("Bahnschrift", 35));
		ShowerTitle.setTextFill(Color.BLACK);
		ShowerTitle.setEffect(Reflect);
		ShowerTitle.setEffect(Shadow);
		Label DialogueScene4BR = new Label("While in the Bathroom, you decide to play some music and you get in the shower");
		Label DialogueScene4BR2 = new Label("Once in the shower, you felt the nice cold water that sent a chill down your spine");
		Label DialogueScene4BR3 = new Label("While enjoying the shower, you thought about your presentation that you had to present today at work");
		Label DialogueScene4BR4 = new Label("Distracted by such thoughts, you suddenly noticed that the power went out");
		Label DialogueScene4BR5 = new Label("Out of shock, you step out of the shower to turn off the music and grab some clothes from the closet to check out the power outage");
		DialogueScene4BR.setFont(new Font("Bahnschrift", 11));
		DialogueScene4BR2.setFont(new Font("Bahnschrift", 11));
		DialogueScene4BR3.setFont(new Font("Bahnschrift", 11));
		DialogueScene4BR4.setFont(new Font("Bahnschrift", 11));
		DialogueScene4BR5.setFont(new Font("Bahnschrift", 11));
		DialogueScene4BR.setTextFill(Color.BLACK);
		DialogueScene4BR2.setTextFill(Color.BLACK);
		DialogueScene4BR3.setTextFill(Color.BLACK);
		DialogueScene4BR4.setTextFill(Color.BLACK);
		DialogueScene4BR5.setTextFill(Color.BLACK);
		DialogueScene4BR.setEffect(Shadow);
		DialogueScene4BR.setEffect(Reflect);
		DialogueScene4BR2.setEffect(Shadow);
		DialogueScene4BR2.setEffect(Reflect);
		DialogueScene4BR3.setEffect(Shadow);
		DialogueScene4BR3.setEffect(Reflect);
		DialogueScene4BR4.setEffect(Shadow);
		DialogueScene4BR4.setEffect(Reflect);
		DialogueScene4BR5.setEffect(Shadow);
		DialogueScene4BR5.setEffect(Reflect);
		
		// Create a Button to go from the Living Room scene of 4L to Bathroom Scene 2 of Scene4B2
		Button Closet = new Button("Bedroom Closet");
		Closet.setTextFill(Color.BLUE);
		Closet.setFont(new Font("Bahnscrift", 11));
		
		// Button Action to go from Scene 4L to 4B2
		Closet.setOnAction(e -> primaryStage.setScene(Scene4BRC));
		
		// Importing an image for Scene 4L
		VBox ImagesS4S = new VBox();
						
		// Image Object for Scene 4L image
		Image IMAGES4S = new Image("https://www.lushome.com/wp-content/uploads/2013/10/small-bathroom-decorating-ideas-7.jpg");
						
		// Create an Image view with special effects for the image
		SepiaTone CBR = new SepiaTone();
		ImageView S4CBRView = new ImageView(IMAGES4S);
		ImagesS4S.getChildren().addAll(S4CBRView);
		ImagesS4S.setEffect(CBR);
		ImagesS4S.setAlignment(Pos.CENTER);
		
		// Creating the Scene
		VBox dialogueClosetBedroom = new VBox(10, DialogueScene4BR, DialogueScene4BR2, DialogueScene4BR3, DialogueScene4BR4, DialogueScene4BR5);
		dialogueClosetBedroom.setAlignment(Pos.CENTER);
		HBox CButton = new HBox(20, Closet);
		CButton.setAlignment(Pos.CENTER);
		VBox CLOSET = new VBox(15, ImagesS4S);
		CLOSET.setAlignment(Pos.CENTER);
		HBox SHOWERTitle = new HBox(20, ShowerTitle);
		SHOWERTitle.setAlignment(Pos.CENTER);
		VBox CLOSETFINAL = new VBox(10, SHOWERTitle, ImagesS4S, dialogueClosetBedroom, CButton);
		Scene4B2 = new Scene(CLOSETFINAL, 900, 900);
		
		// Scene 4BRC Bedroom Closet Scene
		Label ClosetTitle = new Label("BedRoom Closet");
		ClosetTitle.setFont(new Font("Bahnschrift", 35));
		ClosetTitle.setTextFill(Color.BLACK);
		ClosetTitle.setEffect(Reflect);
		ClosetTitle.setEffect(Shadow);
		Label DialogueSceneLVP2 = new Label("It was dark, therefore you needed a flashlight from the closet and some clothes to wear");
		Label DialogueSceneLVP22 = new Label("You found the flashlight in the corner surrounded by many boxes");
		Label DialogueSceneLVP23 = new Label("Once the flashlight is in hand, you search for some comfortable clothes to wear and decide to head to the living room");
		DialogueSceneLVP2.setFont(new Font("Bahnschrift", 11));
		DialogueSceneLVP22.setFont(new Font("Bahnschrift", 11));
		DialogueSceneLVP23.setFont(new Font("Bahnschrift", 11));
		DialogueSceneLVP2.setTextFill(Color.BLACK);
		DialogueSceneLVP22.setTextFill(Color.BLACK);
		DialogueSceneLVP23.setTextFill(Color.BLACK);
		DialogueSceneLVP2.setEffect(Shadow);
		DialogueSceneLVP2.setEffect(Reflect);
		DialogueSceneLVP22.setEffect(Shadow);
		DialogueSceneLVP22.setEffect(Reflect);
		DialogueSceneLVP23.setEffect(Shadow);
		DialogueSceneLVP23.setEffect(Reflect);
		
		// Create a Button to go from the Closet Room scene of 4BRC to Livng Room Scene 2 of Scene4LIVING or Living Room
		Button Livingroom = new Button("Living Room");
		Livingroom.setTextFill(Color.BLUE);
		Livingroom.setFont(new Font("Bahnscrift", 11));
		
		// Button Action to go from Scene 4BRC to 4LIVING2
		Livingroom.setOnAction(e -> primaryStage.setScene(Scene4LIVING));
		
		
		// Importing an image for Scene 4BRC
		VBox ImagesS4C = new VBox();
								
		// Image Object for Scene 4BRC image
		Image IMAGES4C = new Image("https://www.closetworks.com/images/reach-in_closets/ginger-root_reach-in_closet_full-view.jpg");
								
		// Create an Image view with special effects for the image
		SepiaTone C = new SepiaTone();
		ImageView S4ClosetView = new ImageView(IMAGES4C);
		ImagesS4C.getChildren().addAll(S4ClosetView);
		ImagesS4C.setEffect(C);
		ImagesS4C.setAlignment(Pos.CENTER);
		
		// Creating the Scene
		VBox dialogueLV = new VBox(10, DialogueSceneLVP2, DialogueSceneLVP22, DialogueSceneLVP23);
		dialogueLV.setAlignment(Pos.CENTER);
		HBox LVP2Button = new HBox(20, Livingroom);
		LVP2Button.setAlignment(Pos.CENTER);
		VBox closet = new VBox(15, ImagesS4C);
		closet.setAlignment(Pos.CENTER);
		HBox CLOSETTitle = new HBox(20, ClosetTitle);
		CLOSETTitle.setAlignment(Pos.CENTER);
		VBox BRCloset = new VBox(10, ClosetTitle, ImagesS4C, dialogueLV, LVP2Button);
		BRCloset.setAlignment(Pos.CENTER);
		Scene4BRC = new Scene(BRCloset, 800, 800);
		
		// Scene 4LIVING Living Room Choice Scene
		Label LivingRoom2 = new Label("Living Room");
		LivingRoom2.setFont(new Font("Bahnschrift", 35));
		LivingRoom2.setTextFill(Color.BLACK);
		LivingRoom2.setEffect(Reflect);
		LivingRoom2.setEffect(Shadow);
		Label DialogueSceneC = new Label("You reach the living room, you notice that it was dark... too dark");
		Label DialogueSceneC2 = new Label("Your flashlight came in handy to save the day so far; However, it was quiet ... too quiet");
		Label DialogueSceneC3 = new Label("You suddenly hear the rain, you turn your head and noticed the door was slightly open, bringing in the rain from outside");
		Label DialogueSceneC4 = new Label("You walk slowly towards the door to check if anything was strange, you notice that the lock was busted");
		Label DialogueSceneC5 = new Label("Terrified, you close the door slowly and walk towards the center of the living room with thoughts of the broken lock and no power");
		Label DialogueSceneC6 = new Label("You took the time to think about the broken power box and broken lock because this was not your house, it was your parents house");
		Label DialogueSceneC7 = new Label("Therefore, you came to three choices on what you could do: go to the attic, go to the basement, or go outside");
		DialogueSceneC.setFont(new Font("Bahnschrift", 11));
		DialogueSceneC2.setFont(new Font("Bahnschrift", 11));
		DialogueSceneC3.setFont(new Font("Bahnschrift", 11));
		DialogueSceneC4.setFont(new Font("Bahnschrift", 11));
		DialogueSceneC5.setFont(new Font("Bahnschrift", 11));
		DialogueSceneC6.setFont(new Font("Bahnschrift", 11));
		DialogueSceneC7.setFont(new Font("Bahnschrift", 11));
		DialogueSceneC.setTextFill(Color.BLACK);
		DialogueSceneC2.setTextFill(Color.BLACK);
		DialogueSceneC3.setTextFill(Color.BLACK);
		DialogueSceneC4.setTextFill(Color.BLACK);
		DialogueSceneC5.setTextFill(Color.BLACK);
		DialogueSceneC6.setTextFill(Color.BLACK);
		DialogueSceneC7.setTextFill(Color.BLACK);
		DialogueSceneC.setEffect(Shadow);
		DialogueSceneC.setEffect(Reflect);
		DialogueSceneC2.setEffect(Shadow);
		DialogueSceneC2.setEffect(Reflect);
		DialogueSceneC3.setEffect(Shadow);
		DialogueSceneC3.setEffect(Reflect);
		DialogueSceneC4.setEffect(Shadow);
		DialogueSceneC4.setEffect(Reflect);
		DialogueSceneC5.setEffect(Shadow);
		DialogueSceneC5.setEffect(Reflect);
		DialogueSceneC6.setEffect(Shadow);
		DialogueSceneC6.setEffect(Reflect);
		DialogueSceneC7.setEffect(Shadow);
		DialogueSceneC7.setEffect(Reflect);
		
		// Create a Button to go from the LIVING Room Choice scene of 4LIVING to three different scenes
		Button Attic = new Button("Go to Attic");
		Attic.setTextFill(Color.BLUE);
		Attic.setFont(new Font("Bahnscrift", 11));
		Button Basement = new Button("Go to Basement");
		Basement.setTextFill(Color.CRIMSON);
		Basement.setFont(new Font("Bahnscrift", 11));
		Button Outside = new Button("Go Outside");
		Outside.setTextFill(Color.BROWN);
		Outside.setFont(new Font("Bahnscrift", 11));
		
		// Button Action to go from Scene 4LIVING to Three different scenes
		Attic.setOnAction(e -> primaryStage.setScene(SceneAttic));
		Basement.setOnAction(e -> primaryStage.setScene(SceneBasement));
		Outside.setOnAction(e -> primaryStage.setScene(SceneOutside));
		
		// Importing an image for Scene 4LIVING
		VBox ImagesS4LVP2 = new VBox();
										
		// Image Object for Scene 4LIVING image
		Image IMAGES4LVP2 = new Image("https://www.homestratosphere.com/wp-content/uploads/2019/05/modern-black-livingroom-may222019-min-870x580.jpg");
										
		// Create an Image view with special effects for the image
		SepiaTone LV = new SepiaTone();
		ImageView S4LivingRoomView = new ImageView(IMAGES4LVP2);
		ImagesS4LVP2.getChildren().addAll(S4LivingRoomView);
		ImagesS4LVP2.setEffect(LV);
		ImagesS4LVP2.setAlignment(Pos.CENTER);
		
		
		// Creating the Scene
		VBox dialogueLVP2 = new VBox(10, DialogueSceneC, DialogueSceneC2, DialogueSceneC3, DialogueSceneC4, DialogueSceneC5, DialogueSceneC6, DialogueSceneC7);
		dialogueLVP2.setAlignment(Pos.CENTER);
		HBox CHButton = new HBox(20, Attic, Outside, Basement);
		CHButton.setAlignment(Pos.CENTER);
		VBox threechoiceimage = new VBox(15, ImagesS4LVP2);
		threechoiceimage.setAlignment(Pos.CENTER);
		HBox LivingTitle = new HBox(20, LivingRoom2);
		LivingTitle.setAlignment(Pos.CENTER);
		VBox LivingChoices = new VBox(10, LivingTitle, threechoiceimage, dialogueLVP2, CHButton);
		LivingChoices.setAlignment(Pos.CENTER);
		Scene4LIVING = new Scene(LivingChoices, 900, 900);
		
		// Scene Attic Scene into a death scene
		Label AtticTitle = new Label("House Attic");
		AtticTitle.setFont(new Font("Bahnschrift", 35));
		AtticTitle.setTextFill(Color.BLACK);
		AtticTitle.setEffect(Reflect);
		AtticTitle.setEffect(Shadow);
		Label DialogueSceneA = new Label("You decide to head towards the attic to find the light box so that you can fix it");
		Label DialogueSceneA2 = new Label("Once climbing the stairs that leads to the attic, you notice how dark and dusty it was");
		Label DialogueSceneA3 = new Label("To prevent lung damage, you choose to wear a mask to protect yourself from mold and dust");
		Label DialogueSceneA4 = new Label("Once in the Attic, you kept searching through loads of stuff to find the light box, but is was nowhere to be found");
		Label DialogueSceneA5 = new Label("Once your search was done, you decide to head back to the living room, however you realize that the door to leave the attic was closed shut");
		Label DialogueSceneA6 = new Label("You started to panic because the door only open from the outside; therefore, you were trapped inside the attic");
		Label DialogueSceneA7 = new Label("While inside, you notice that maybe their was someone or something in here with you");
		Label DialogueSceneA8 = new Label("You grab your flashlight to protect yourself and search around for anything suspicious");
		Label DialogueSceneA9 = new Label("The search was going well, until your flashlight ran out of batteries and you were in the dark without any light to see");
		Label DialogueSceneA10 = new Label("Waiting in the dark, you heard a noise that sounded like an animal or something similar to it");
		Label DialogueSceneA11 = new Label("The sound kept getting closer and closer until you heard breathing behind and then suddenly...");
		DialogueSceneA.setFont(new Font("Bahnschrift", 11));
		DialogueSceneA2.setFont(new Font("Bahnschrift", 11));
		DialogueSceneA3.setFont(new Font("Bahnschrift", 11));
		DialogueSceneA4.setFont(new Font("Bahnschrift", 11));
		DialogueSceneA5.setFont(new Font("Bahnschrift", 11));
		DialogueSceneA6.setFont(new Font("Bahnschrift", 11));
		DialogueSceneA7.setFont(new Font("Bahnschrift", 11));
		DialogueSceneA8.setFont(new Font("Bahnschrift", 11));
		DialogueSceneA9.setFont(new Font("Bahnschrift", 11));
		DialogueSceneA10.setFont(new Font("Bahnschrift", 11));
		DialogueSceneA11.setFont(new Font("Bahnschrift", 11));
		DialogueSceneA.setTextFill(Color.BLACK);
		DialogueSceneA2.setTextFill(Color.BLACK);
		DialogueSceneA3.setTextFill(Color.BLACK);
		DialogueSceneA4.setTextFill(Color.BLACK);
		DialogueSceneA5.setTextFill(Color.BLACK);
		DialogueSceneA6.setTextFill(Color.BLACK);
		DialogueSceneA7.setTextFill(Color.BLACK);
		DialogueSceneA8.setTextFill(Color.BLACK);
		DialogueSceneA9.setTextFill(Color.BLACK);
		DialogueSceneA10.setTextFill(Color.BLACK);
		DialogueSceneA11.setTextFill(Color.BLACK);
		DialogueSceneA.setEffect(Shadow);
		DialogueSceneA.setEffect(Reflect);
		DialogueSceneA2.setEffect(Shadow);
		DialogueSceneA2.setEffect(Reflect);
		DialogueSceneA3.setEffect(Shadow);
		DialogueSceneA3.setEffect(Reflect);
		DialogueSceneA4.setEffect(Shadow);
		DialogueSceneA4.setEffect(Reflect);
		DialogueSceneA5.setEffect(Shadow);
		DialogueSceneA5.setEffect(Reflect);
		DialogueSceneA6.setEffect(Shadow);
		DialogueSceneA6.setEffect(Reflect);
		DialogueSceneA7.setEffect(Shadow);
		DialogueSceneA7.setEffect(Reflect);
		DialogueSceneA8.setEffect(Shadow);
		DialogueSceneA8.setEffect(Reflect);
		DialogueSceneA9.setEffect(Shadow);
		DialogueSceneA9.setEffect(Reflect);
		DialogueSceneA10.setEffect(Shadow);
		DialogueSceneA10.setEffect(Reflect);
		DialogueSceneA11.setEffect(Shadow);
		DialogueSceneA11.setEffect(Reflect);
		
		
		// Create a Button to go from the Attic Room scene of 4A to Death Scene 1 of DeathScene
		Button Continue = new Button("Continue");
		Continue.setTextFill(Color.BLUE);
		Continue.setFont(new Font("Bahnscrift", 11));
				
		
		// Button Action to go from Scene 4A to DeathScene
		Continue.setOnAction(e -> primaryStage.setScene(DeathScene));
		
		// Importing an image for Scene 4a
		VBox ImagesS4Attic = new VBox();
												
		// Image Object for Scene 4A image
		Image IMAGES4Attic = new Image("http://abnf.co/PA-Poe%20house%20in%20PA/poehousebarn.jpg");
												
		// Create an Image view with special effects for the image
		SepiaTone A = new SepiaTone();
		ImageView S4AtticView = new ImageView(IMAGES4Attic);
		ImagesS4Attic.getChildren().addAll(S4AtticView);
		ImagesS4Attic.setEffect(A);
		ImagesS4Attic.setAlignment(Pos.CENTER);
		
		
		// Creating the Scene
		VBox dialogueAttic = new VBox(10, DialogueSceneA, DialogueSceneA2, DialogueSceneA3, DialogueSceneA4, DialogueSceneA5, DialogueSceneA6, DialogueSceneA7, DialogueSceneA8, DialogueSceneA9, DialogueSceneA10, DialogueSceneA11);
		dialogueAttic.setAlignment(Pos.CENTER);
		HBox ContinueButton = new HBox(20, Continue);
		ContinueButton.setAlignment(Pos.CENTER);
		VBox AtticImage = new VBox(15, ImagesS4Attic);
		AtticImage.setAlignment(Pos.CENTER);
		HBox ATitle = new HBox(20, AtticTitle);
		ATitle.setAlignment(Pos.CENTER);
		VBox ChoiceOne = new VBox(10, ATitle, AtticImage, dialogueAttic, ContinueButton);
		ChoiceOne.setAlignment(Pos.CENTER);
		SceneAttic = new Scene(ChoiceOne, 1000, 1000);
		
		// Scene Basement Scene into a death scene
		Label BasementTitle = new Label("House Basement");
		BasementTitle.setFont(new Font("Bahnschrift", 35));
		BasementTitle.setTextFill(Color.BLACK);
		BasementTitle.setEffect(Reflect);
		BasementTitle.setEffect(Shadow);
		Label DialogueSceneB = new Label("You decide to head to the basement and attempt to search for a generator you think is hidden somewhere");
		Label DialogueSceneB2 = new Label("Once in the basement, it  was very dark and cold");
		Label DialogueSceneB3 = new Label("Regardless, you were determined to find the generator at any and all cost");
		Label DialogueSceneB4 = new Label("You search around the basement, finally you find the generator stored deep in the back");
		Label DialogueSceneB5 = new Label("You check the generator's wire circuits and notice that some wires are old and rusted; therefore, your best solution was to disconnect it from the source and re-connect it to see if that will do the trick");
		Label DialogueSceneB6 = new Label("With caution, you disconnect it from the generator when suddenly...");
		DialogueSceneB.setFont(new Font("Bahnschrift", 11));
		DialogueSceneB2.setFont(new Font("Bahnschrift", 11));
		DialogueSceneB3.setFont(new Font("Bahnschrift", 11));
		DialogueSceneB4.setFont(new Font("Bahnschrift", 11));
		DialogueSceneB5.setFont(new Font("Bahnschrift", 11));
		DialogueSceneB6.setFont(new Font("Bahnschrift", 11));
		DialogueSceneB.setTextFill(Color.BLACK);
		DialogueSceneB2.setTextFill(Color.BLACK);
		DialogueSceneB3.setTextFill(Color.BLACK);
		DialogueSceneB4.setTextFill(Color.BLACK);
		DialogueSceneB5.setTextFill(Color.BLACK);
		DialogueSceneB6.setTextFill(Color.BLACK);
		DialogueSceneB.setEffect(Shadow);
		DialogueSceneB.setEffect(Reflect);
		DialogueSceneB2.setEffect(Shadow);
		DialogueSceneB2.setEffect(Reflect);
		DialogueSceneB3.setEffect(Shadow);
		DialogueSceneB3.setEffect(Reflect);
		DialogueSceneB4.setEffect(Shadow);
		DialogueSceneB4.setEffect(Reflect);
		DialogueSceneB5.setEffect(Shadow);
		DialogueSceneB5.setEffect(Reflect);
		DialogueSceneB6.setEffect(Shadow);
		DialogueSceneB6.setEffect(Reflect);
		
		// Create a Button to go from the Basement Room scene of 4B to Death Scene 2 of DeathScene2
		Button Continue1 = new Button("Continue");
		Continue1.setTextFill(Color.BLUE);
		Continue1.setFont(new Font("Bahnscrift", 11));
		
		
		// Button Action to go from Scene 4B to DeathScene2
		Continue1.setOnAction(e -> primaryStage.setScene(DeathScene2));
		
		// Importing an image for Scene 4B
		VBox ImagesS4Basement = new VBox();
														
		// Image Object for Scene 4B image
		Image IMAGES4Basement = new Image("https://media.moddb.com/cache/images/mods/1/21/20539/thumb_620x2000/screen12.JPG");
														
		// Create an Image view with special effects for the image
		SepiaTone B = new SepiaTone();
		ImageView S4BasementView = new ImageView(IMAGES4Basement);
		ImagesS4Basement.getChildren().addAll(S4BasementView);
		ImagesS4Basement.setEffect(B);
		ImagesS4Basement.setAlignment(Pos.CENTER);
		
		// Creating the Scene
		VBox dialogueBasement = new VBox(10, DialogueSceneB, DialogueSceneB2, DialogueSceneB3, DialogueSceneB4, DialogueSceneB5, DialogueSceneB6);
		dialogueBasement.setAlignment(Pos.CENTER);
		HBox Continue1Button = new HBox(20, Continue1);
		Continue1Button.setAlignment(Pos.CENTER);
		VBox BasementImage = new VBox(15, ImagesS4Basement);
		BasementImage.setAlignment(Pos.CENTER);
		HBox BTitle = new HBox(20, BasementTitle);
		BTitle.setAlignment(Pos.CENTER);
		VBox ChoiceTwo = new VBox(10, BTitle, BasementImage, dialogueBasement, Continue1Button);
		ChoiceTwo.setAlignment(Pos.CENTER);
		SceneBasement = new Scene(ChoiceTwo, 1000, 1000);
		
		
		// Scene Outside to DeathScene 3
		Label OutsideTitle = new Label("Outside of the House");
		OutsideTitle.setFont(new Font("Bahnschrift", 35));
		OutsideTitle.setTextFill(Color.BLACK);
		OutsideTitle.setEffect(Reflect);
		OutsideTitle.setEffect(Shadow);
		Label DialogueSceneO = new Label("You decide to take an umbrella and head outside in the rain to see if anything else is broken and to hopefuly find out who or what broke the door");
		Label DialogueSceneO2 = new Label("While outside with your umbrella in hand, you check the perimeter to see if anything else was broken");
		Label DialogueSceneO3 = new Label("You check around the house and everything seems fine, all of the sudden the rain and wind starts to pick up speed");
		Label DialogueSceneO4 = new Label("You tried to go back inside but then you notice someone standing in front of the entrance");
		Label DialogueSceneO5 = new Label("The person you saw is your friend named Kevin and he was waiting to show you something");
		Label DialogueSceneO6 = new Label("Suddenly, he grabs your hand and sprints accross the yard into a small shed and closses the door preventing heavy wind and rain from entering the shed");
		Label DialogueSceneO7 = new Label("While in the shed, you both were soaked from the rain");
		Label DialogueSceneO8 = new Label("Shivering from the cold, you talk with Kevin about the thing he wanted to show you, suddenly...");
		DialogueSceneO.setFont(new Font("Bahnschrift", 11));
		DialogueSceneO2.setFont(new Font("Bahnschrift", 11));
		DialogueSceneO3.setFont(new Font("Bahnschrift", 11));
		DialogueSceneO4.setFont(new Font("Bahnschrift", 11));
		DialogueSceneO5.setFont(new Font("Bahnschrift", 11));
		DialogueSceneO6.setFont(new Font("Bahnschrift", 11));
		DialogueSceneO7.setFont(new Font("Bahnschrift", 11));
		DialogueSceneO8.setFont(new Font("Bahnschrift", 11));
		DialogueSceneO.setTextFill(Color.BLACK);
		DialogueSceneO2.setTextFill(Color.BLACK);
		DialogueSceneO3.setTextFill(Color.BLACK);
		DialogueSceneO4.setTextFill(Color.BLACK);
		DialogueSceneO5.setTextFill(Color.BLACK);
		DialogueSceneO6.setTextFill(Color.BLACK);
		DialogueSceneO7.setTextFill(Color.BLACK);
		DialogueSceneO8.setTextFill(Color.BLACK);
		DialogueSceneO.setEffect(Shadow);
		DialogueSceneO.setEffect(Reflect);
		DialogueSceneO2.setEffect(Shadow);
		DialogueSceneO2.setEffect(Reflect);
		DialogueSceneO3.setEffect(Shadow);
		DialogueSceneO3.setEffect(Reflect);
		DialogueSceneO4.setEffect(Shadow);
		DialogueSceneO4.setEffect(Reflect);
		DialogueSceneO5.setEffect(Shadow);
		DialogueSceneO5.setEffect(Reflect);
		DialogueSceneO6.setEffect(Shadow);
		DialogueSceneO6.setEffect(Reflect);
		DialogueSceneO7.setEffect(Shadow);
		DialogueSceneO7.setEffect(Reflect);
		DialogueSceneO8.setEffect(Shadow);
		DialogueSceneO8.setEffect(Reflect);
		
				
		// Create a Button to go from the Outside scene to Death Scene 3 of DeathScene3
		Button Continue2 = new Button("Continue");
		Continue2.setTextFill(Color.BLUE);
		Continue2.setFont(new Font("Bahnscrift", 11));
		
		
		// Button Action to go from Outside Scene to DeathScene3
		Continue2.setOnAction(e -> primaryStage.setScene(DeathScene3));
		
		// Importing an image for Scene 4O
		VBox ImagesS4Outside = new VBox();
																
		// Image Object for Scene 4O image
		Image IMAGES4Outside = new Image("http://2.bp.blogspot.com/-g5XX-nQxaYc/U6nE01UxH6I/AAAAAAAAEB4/o_eJlj1IZmA/s1600/Beautiful-Rain-Pictures-32.jpg");
																
		// Create an Image view with special effects for the image
		SepiaTone O = new SepiaTone();
		ImageView S4OutsideView = new ImageView(IMAGES4Outside);
		ImagesS4Outside.getChildren().addAll(S4OutsideView);
		ImagesS4Outside.setEffect(O);
		ImagesS4Outside.setAlignment(Pos.CENTER);
		
		// Creating the Scene
		VBox dialogueOutside = new VBox(10, DialogueSceneO, DialogueSceneO2, DialogueSceneO3, DialogueSceneO4, DialogueSceneO5, DialogueSceneO6, DialogueSceneO7, DialogueSceneO8);
		dialogueOutside.setAlignment(Pos.CENTER);
		HBox Continue2Button = new HBox(20, Continue2);
		Continue2Button.setAlignment(Pos.CENTER);
		VBox OutsideImage = new VBox(15, ImagesS4Outside);
		OutsideImage.setAlignment(Pos.CENTER);
		HBox OTitle = new HBox(20, OutsideTitle);
		OTitle.setAlignment(Pos.CENTER);
		VBox ChoiceThree = new VBox(10, OTitle, OutsideImage, dialogueOutside, Continue2Button);
		ChoiceThree.setAlignment(Pos.CENTER);
		SceneOutside = new Scene(ChoiceThree, 1000, 1000);
		
		// Death Scene
		Label DeathTitle = new Label("DEATH BY DECAPITATION");
		DeathTitle.setFont(new Font("Bahnschrift", 35));
		DeathTitle.setTextFill(Color.BLACK);
		DeathTitle.setEffect(Reflect);
		DeathTitle.setEffect(Shadow);
		Label DialogueSceneD1 = new Label("The mysterious breathing was from a creature you have not seen before, it grabbed you and started to devour you piece by piece");
		Label DialogueSceneD2 = new Label("The creature was hungry and angry because you stayed in the attic longer than intended");
		Label DialogueSceneD3 = new Label("It compleltly devoured you without leaving a single trace... you have died");
		DialogueSceneD1.setFont(new Font("Bahnschrift", 11));
		DialogueSceneD2.setFont(new Font("Bahnschrift", 11));
		DialogueSceneD3.setFont(new Font("Bahnschrift", 11));
		DialogueSceneD1.setTextFill(Color.BLACK);
		DialogueSceneD2.setTextFill(Color.BLACK);
		DialogueSceneD3.setTextFill(Color.BLACK);
		DialogueSceneD1.setEffect(Shadow);
		DialogueSceneD1.setEffect(Reflect);
		DialogueSceneD2.setEffect(Shadow);
		DialogueSceneD2.setEffect(Reflect);
		DialogueSceneD3.setEffect(Shadow);
		DialogueSceneD3.setEffect(Reflect);
		
		
		// Create a Button to go from the DeathScene to one different scenes
		Button Achievement = new Button("Achievement Unlock: Head's Up!");
		Achievement.setTextFill(Color.BLUE);
		Achievement.setFont(new Font("Bahnscrift", 14));
		Button GoBack = new Button("Try Again");
		GoBack.setTextFill(Color.BROWN);
		GoBack.setFont(new Font("Bahnscrift", 11));
		
		// Button Action to a previous
		GoBack.setOnAction(e -> primaryStage.setScene(Scene2));
		
		// Importing an image for Scene Death One
		VBox ImageDeath = new VBox();
																		
		// Image Object for Scene Death One image
		Image IMAGEDEATH = new Image("https://www.thumbsticks.com/wp-content/uploads/2017/03/You-Died.jpg");
																		
		// Create an Image view with special effects for the image
		SepiaTone D = new SepiaTone();
		ImageView S4DeathView = new ImageView(IMAGEDEATH);
		ImageDeath.getChildren().addAll(S4DeathView);
		ImageDeath.setEffect(D);
		ImageDeath.setAlignment(Pos.CENTER);
		
		// Creating the Scene
		VBox dialogueDeath = new VBox(10, DialogueSceneD1, DialogueSceneD2, DialogueSceneD3);
		dialogueDeath.setAlignment(Pos.CENTER);
		HBox DeathButton = new HBox(20, Achievement, GoBack);
		DeathButton.setAlignment(Pos.CENTER);
		VBox DeathImage = new VBox(15, ImageDeath);
		DeathImage.setAlignment(Pos.CENTER);
		HBox DTitle = new HBox(20, DeathTitle);
		DTitle.setAlignment(Pos.CENTER);
		VBox DeathOne = new VBox(10, DTitle, DeathImage, dialogueDeath, DeathButton);
		DeathOne.setAlignment(Pos.CENTER);
		DeathScene = new Scene(DeathOne, 1000, 1000);
		
		// Death Scene 2
		Label DeathTitle2 = new Label("DEATH BY ELECTRIC SHOCK");
		DeathTitle2.setFont(new Font("Bahnschrift", 35));
		DeathTitle2.setTextFill(Color.BLACK);
		DeathTitle2.setEffect(Reflect);
		DeathTitle2.setEffect(Shadow);
		Label DialogueSceneDES = new Label("the moment the cord was disconnected, you were giving a shock of at least 42 volts");
		Label DialogueSceneDES2 = new Label("Cause of death: Electric Shock and Unchecked wires");	
		DialogueSceneDES.setFont(new Font("Bahnschrift", 11));
		DialogueSceneDES2.setFont(new Font("Bahnschrift", 11));
		DialogueSceneDES.setTextFill(Color.BLACK);
		DialogueSceneDES2.setTextFill(Color.BLACK);
		DialogueSceneDES.setEffect(Shadow);
		DialogueSceneDES.setEffect(Reflect);
		DialogueSceneDES2.setEffect(Shadow);
		DialogueSceneDES2.setEffect(Reflect);
		
		// Create a Button to go from the DeathScene2 to one different scenes
		Button Achievement2 = new Button("Achievement Unlock: Shock Therapy!");
		Achievement2.setTextFill(Color.BLUE);
		Achievement2.setFont(new Font("Bahnscrift", 14));
		Button GoBack2 = new Button("Try Again");
		GoBack2.setTextFill(Color.BROWN);
		GoBack2.setFont(new Font("Bahnscrift", 11));
		
		// Button Action to a previous
		GoBack2.setOnAction(e -> primaryStage.setScene(Scene2));
		
		// Importing an image for Scene Death Two
		VBox ImageDeathS4 = new VBox();
																				
		// Image Object for Scene Death Two image
		Image IMAGEDEATHS4 = new Image("https://www.thumbsticks.com/wp-content/uploads/2017/03/You-Died.jpg");
																				
		// Create an Image view with special effects for the image
		SepiaTone D2 = new SepiaTone();
		ImageView S4DeathView2 = new ImageView(IMAGEDEATHS4);
		ImageDeathS4.getChildren().addAll(S4DeathView2);
		ImageDeathS4.setEffect(D2);
		ImageDeathS4.setAlignment(Pos.CENTER);
		
		// Creating the Scene
		VBox dialogueDeath2 = new VBox(10, DialogueSceneDES, DialogueSceneDES2);
		dialogueDeath2.setAlignment(Pos.CENTER);
		HBox Death2Button = new HBox(20, Achievement2, GoBack2);
		Death2Button.setAlignment(Pos.CENTER);
		VBox DeathImage2 = new VBox(15, ImageDeathS4);
		DeathImage2.setAlignment(Pos.CENTER);
		HBox D2Title = new HBox(20, DeathTitle2);
		D2Title.setAlignment(Pos.CENTER);
		VBox DeathTwo = new VBox(10, D2Title, DeathImage2, dialogueDeath2, Death2Button);
		DeathTwo.setAlignment(Pos.CENTER);
		DeathScene2 = new Scene(DeathTwo, 1000, 1000);
		
		// Death Scene 3
		Label DeathTitle3 = new Label("DEATH BY MULTIPLE STAB WOUNDS");
		DeathTitle3.setFont(new Font("Bahnschrift", 35));
		DeathTitle3.setTextFill(Color.BLACK);
		DeathTitle3.setEffect(Reflect);
		DeathTitle3.setEffect(Shadow);
		Label DialogueSceneDSW = new Label("Kevin suddenly pulls an item from his pocket, showing his brand new pocket knife that he just bought");
		Label DialogueSceneDSW2 = new Label("You start to realize that your so called friend is not what he seems, suddenly the door starts to rumble as you hear the sound of lighting strikes");
		Label DialogueSceneDSW3 = new Label("Turning your body facing the door, you suddenly feel a sharp pain in your back, without any warning Kevin had plunged his knife into your back which caused you to fall to the ground and slowly bleed out");
		DialogueSceneDSW.setFont(new Font("Bahnschrift", 11));
		DialogueSceneDSW2.setFont(new Font("Bahnschrift", 11));
		DialogueSceneDSW3.setFont(new Font("Bahnschrift", 11));
		DialogueSceneDSW.setTextFill(Color.BLACK);
		DialogueSceneDSW2.setTextFill(Color.BLACK);
		DialogueSceneDSW3.setTextFill(Color.BLACK);
		DialogueSceneDSW.setEffect(Shadow);
		DialogueSceneDSW.setEffect(Reflect);
		DialogueSceneDSW2.setEffect(Shadow);
		DialogueSceneDSW2.setEffect(Reflect);
		DialogueSceneDSW3.setEffect(Shadow);
		DialogueSceneDSW3.setEffect(Reflect);
		
		// Create a Button to go from the DeathScene2 to one different scenes
		Button Achievement3 = new Button("Achievement Unlock: Two Face!");
		Achievement3.setTextFill(Color.BLUE);
		Achievement3.setFont(new Font("Bahnscrift", 14));
		Button GoBack3 = new Button("Try Again");
		GoBack3.setTextFill(Color.BROWN);
		GoBack3.setFont(new Font("Bahnscrift", 11));
		
		// Button Action to a previous
		GoBack3.setOnAction(e -> primaryStage.setScene(Scene2));
		
		// Importing an image for Scene Death Two
		VBox ImageDeath3 = new VBox();
																						
		// Image Object for Scene Death Two image
		Image IMAGEDEATH3 = new Image("https://www.thumbsticks.com/wp-content/uploads/2017/03/You-Died.jpg");
																						
		// Create an Image view with special effects for the image
		SepiaTone D3 = new SepiaTone();
		ImageView S4DeathView3 = new ImageView(IMAGEDEATH3);
		ImageDeath3.getChildren().addAll(S4DeathView3);
		ImageDeath3.setEffect(D3);
		ImageDeath3.setAlignment(Pos.CENTER);
		
		// Creating the Scene
		VBox dialogueDeath3 = new VBox(10, DialogueSceneDSW, DialogueSceneDSW2, DialogueSceneDSW3);
		dialogueDeath3.setAlignment(Pos.CENTER);
		HBox Death3Button = new HBox(20, Achievement3, GoBack3);
		Death3Button.setAlignment(Pos.CENTER);
		VBox DeathImage3 = new VBox(15, ImageDeath3);
		DeathImage3.setAlignment(Pos.CENTER);
		HBox D3Title = new HBox(20, DeathTitle3);
		D3Title.setAlignment(Pos.CENTER);
		VBox DeathThree = new VBox(10, D3Title, DeathImage3, dialogueDeath3, Death3Button);
		DeathThree.setAlignment(Pos.CENTER);
		DeathScene3 = new Scene(DeathThree, 1000, 1000);
		
		
		
		/**
		 * 
		 * 
		 * Title Label for Scene Five with their respectful font, size, color, and special effect.
		 * 
		 * 
		 */
		
		// Title Label for Scene 5
		// Ryan Hern
		
		Label TownTitle = new Label("Town Path");
		TownTitle.setFont(new Font("Bahnschrift", 35));
		TownTitle.setTextFill(Color.BLACK);
		TownTitle.setEffect(Reflect);
		TownTitle.setEffect(Shadow);
		
		/**
		 * 
		 * 
		 * Button Action events for Scene 2 to make to go to the next scene or to make them work
		 * 
		 * For example - Forest will go to Scene 3
		 * 
		 */
		
		
		//Scene 2 Button Event to other Scenes
		Forest.setOnAction(e -> primaryStage.setScene(Scene3));
		House.setOnAction(e -> primaryStage.setScene(Scene4));
		Town.setOnAction(e -> primaryStage.setScene(Scene5));
		
		/**
		 * 
		 * @Author: Charles Jiron
		 * 
		 *  Imports a third image for Scene 4 and uses an object to call it to make it easier to use.
		 * 
		 */
		
		// New VBox for Scene 4 image
		VBox ImagesS4 = new VBox();
				
		// Image Object of Scene 4
		Image PathSceneFour = new Image("https://images.designtrends.com/wp-content/uploads/2017/01/19165321/Small-Apartment-Bedroom-Wall-Color-Idea.jpg");
		
		/**
		 * 
		 * Creates an Image View to that it may be used in javafx and was added a special effect
		 * 
		 */
		
		// Create an Image View of Scene 4
		// Scene 4 Effects
		SepiaTone PicInnerShadow = new SepiaTone();
		ImageView ImageS4View = new ImageView(PathSceneFour);
		ImagesS4.getChildren().addAll(ImageS4View);
		ImagesS4.setEffect(PicInnerShadow);
		ImagesS4.setAlignment(Pos.CENTER);
		
		/**
		 * 
		 * This is just for the layout and Alignment for each part in Scene 3. While also creating the Scene.
		 * 
		 */
		
		// Layout for each Scene for each title
		// Scene 3
		//  Author : Thomas Balaki
		
		/**
		 * 
		 * @Author:  Thomas Balaki
		 * 
		 * Title Label for Scene three with their respectful font, size, color, and special effect.
		 * 
		 */
	    
		//*********************************************************************************************************
		//*********************************** THOMAS CODE **********************************************************
		//**********************************************************************************************************
		
		/**
		 * 
		 * 
		 * Title Label for Scene Three with their respectful font, size, color, and special effect.
		 * 
		 * 
		 */
		
		// Title Label for Scene 3
		Label ForestTitle = new Label("Forest Path");
		ForestTitle.setFont(new Font("Bahnschrift", 35));
		ForestTitle.setTextFill(Color.BLACK);
		ForestTitle.setEffect(Reflect);
		ForestTitle.setEffect(Shadow);
		
		// Title Label and Dialogue for Scene 3 in the forest
		Label ForestScene3P1 = new Label("You just left your house to go for a jog");
		Label ForestScene3P2 = new Label("It is currently 5:00 PM and you hope to finish your jog at 6:30 PM");
		Label ForestScene3P3 = new Label("You take nothing but a small string bag equipt with a towel, water bottle, and your phone");
		Label ForestScene3P4 = new Label("With all of that, you take your leave and begin to start your jog");
		ForestScene3P1.setFont(new Font("Bahnschrift", 11));
		ForestScene3P2.setFont(new Font("Bahnschrift", 11));
		ForestScene3P3.setFont(new Font("Bahnschrift", 11));
		ForestScene3P4.setFont(new Font("Bahnschrift", 11));
		ForestScene3P1.setTextFill(Color.BLACK);
		ForestScene3P2.setTextFill(Color.BLACK);
		ForestScene3P3.setTextFill(Color.BLACK);
		ForestScene3P4.setTextFill(Color.BLACK);
		ForestScene3P1.setEffect(Reflect);
		ForestScene3P1.setEffect(Shadow);
		ForestScene3P2.setEffect(Reflect);
		ForestScene3P2.setEffect(Shadow);
		ForestScene3P3.setEffect(Reflect);
		ForestScene3P3.setEffect(Shadow);
		ForestScene3P4.setEffect(Reflect);
		ForestScene3P4.setEffect(Shadow);
				
		// Making a Button to go from Scene 3 to the start of forest scene of jogging of Scene3A.
		Button Jogging = new Button("Jogging");
		Jogging.setTextFill(Color.BLUE);
		Jogging.setFont(new Font("Bahnscrift", 11));
				
		// Button Action to Scene 3A
		Jogging.setOnAction(e -> primaryStage.setScene(Scene3A));
		
		// New VBox for Scene 3 image
		VBox ImagesS3 = new VBox();
		
		// Importing a image to showed that we left the house towards scene 3A
		Image IMAGES3 = new Image("https://oldstonehouses.files.wordpress.com/2016/03/istkz1v9dcpp030000000000.jpg");
																								
		// Create an Image view with special effects for the image
		SepiaTone S3 = new SepiaTone();
		ImageView S3HOUSEVIEW = new ImageView(IMAGES3);
		ImagesS3.getChildren().addAll(S3HOUSEVIEW);
		ImagesS3.setEffect(S3);
		ImagesS3.setAlignment(Pos.CENTER);
		
		
		// Creating the scene for Scene 3
		
		HBox FTitle = new HBox(20, ForestTitle);
		FTitle.setAlignment(Pos.CENTER);
		VBox dialogueS3 = new VBox(10, ForestScene3P1, ForestScene3P2, ForestScene3P3, ForestScene3P4);
		dialogueS3.setAlignment(Pos.CENTER);
		HBox FirstButton = new HBox(20, Jogging);
		FirstButton.setAlignment(Pos.CENTER);
		VBox HouseImageS3 = new VBox(15, ImagesS3);
		HouseImageS3.setAlignment(Pos.CENTER);
		VBox FinalS3 = new VBox(10, FTitle, HouseImageS3, dialogueS3, FirstButton);
		FinalS3.setAlignment(Pos.CENTER);
		Scene3 = new Scene(FinalS3, 1000, 1000);
						
		/**
		 * 
		 * Creating a new Scene for the jogging scene after Scene 3
		 * 
		 * Author: Thomas Balaki
		 * 
		*/
				

		// Scene 3A Jogging
		Label JoggingTitle = new Label("Jogging");
		JoggingTitle.setFont(new Font("Bahnschrift", 35));
		JoggingTitle.setTextFill(Color.BLACK);
		JoggingTitle.setEffect(Reflect);
	    JoggingTitle.setEffect(Shadow);
		Label JoggingScene3A = new Label("You start to jog at a steady pace, you also manage to keep a steady rhythm in order to preserve your stamina");
		Label JoggingScene3A2 = new Label("As you keep running, you notice that the sun is starting to set, displaying a beautiful view for you to gaze upon");
		Label JoggingScene3A3 = new Label("Suddenly within a distance, you overhear an animal let out a loud cry, it appears to be a dog. ");
		Label JoggingScene3A4 = new Label("Upon closer inspection, you notice that the dog is injured and is in great pain. Worried for the dog's safety, you run after the dog in an attempt to help it");
		Label JoggingScene3A5 = new Label("Frightened, the scared dog shrieks as you approach it, the dog flees and runs towards a nearby forest");
		JoggingScene3A.setFont(new Font("Bahnschrift", 11));
		JoggingScene3A2.setFont(new Font("Bahnschrift", 11));
		JoggingScene3A3.setFont(new Font("Bahnschrift", 11));
		JoggingScene3A4.setFont(new Font("Bahnschrift", 11));
		JoggingScene3A5.setFont(new Font("Bahnschrift", 11));
		JoggingScene3A.setTextFill(Color.BLACK);
		JoggingScene3A2.setTextFill(Color.BLACK);
		JoggingScene3A3.setTextFill(Color.BLACK);
		JoggingScene3A4.setTextFill(Color.BLACK);
		JoggingScene3A5.setTextFill(Color.BLACK);
		JoggingScene3A.setEffect(Shadow);
		JoggingScene3A.setEffect(Reflect);
		JoggingScene3A2.setEffect(Shadow);
		JoggingScene3A2.setEffect(Reflect);
		JoggingScene3A3.setEffect(Shadow);
		JoggingScene3A3.setEffect(Reflect);
		JoggingScene3A4.setEffect(Shadow);
		JoggingScene3A4.setEffect(Reflect);
		JoggingScene3A5.setEffect(Shadow);
		JoggingScene3A5.setEffect(Reflect);
				
		// Making a Button to go from the jogging scene of Scene 3 to the dog scene of 3K
		Button Inspect = new Button("Injured Dog");
		Inspect.setTextFill(Color.BLUE);
		Inspect.setFont(new Font("Bahnscrift", 11));
			
				
		// Button Action to go from Scene 3A to 3K
		Inspect.setOnAction(e -> primaryStage.setScene(Scene3K));
			
	
		// Importing an image for Scene 3A
		VBox ImagesS3A = new VBox();
				
		// Image Object for Scene 3A image
		Image IMAGES3A = new Image("https://www.mayoclinichealthsystem.org/-/media/national-files/images/hometown-health/2019/running-shoes-on-paved-trail.jpg?h=370&w=660&la=en&hash=EF0A1D8B952FBA06002A40167735BF14");
				
		// Create an Image view with special effects for the image
		SepiaTone DOG = new SepiaTone();
		ImageView S3AView = new ImageView(IMAGES3A);
		ImagesS3A.getChildren().addAll(S3AView );
		ImagesS3A.setEffect(DOG);
		ImagesS3A.setAlignment(Pos.CENTER);
				
		// Creating the scene
		HBox JTitle = new HBox(20, JoggingTitle);
		JTitle.setAlignment(Pos.CENTER);
		VBox dialogueS3A = new VBox(10, JoggingScene3A, JoggingScene3A2, JoggingScene3A3, JoggingScene3A4, JoggingScene3A5);
		dialogueS3A.setAlignment(Pos.CENTER);
		HBox InspectButton = new HBox(20, Inspect);
		InspectButton.setAlignment(Pos.CENTER);
		VBox DogImage = new VBox(15, ImagesS3A);
		DogImage.setAlignment(Pos.CENTER);
		VBox FinalS3A = new VBox(10, JTitle, DogImage,  dialogueS3A, InspectButton);
		Scene3A = new Scene(FinalS3A, 1000, 1000);
						
		// Scene 3K Forest
		Label TreeTitle = new Label("Forest");
		TreeTitle.setFont(new Font("Bahnschrift", 35));
		TreeTitle.setTextFill(Color.BLACK);
		TreeTitle.setEffect(Reflect);
		TreeTitle.setEffect(Shadow);
		Label ForestScene3K = new Label("The dog is so scared, it begins to run even faster leaving trails of blood for you to follow throughout the forest");
		Label ForestScene3K2 = new Label("Keeping your steady trail on the dog's blood, you run past ood looking trees with strage marks engraved on them");
		Label ForestScene3K3 = new Label("The dog seems to be running in odd patterns, crossing small creaks, traversing through thick muds, and trotting ontop of slippery stones ");
		Label ForestScene3K4 = new Label("Attempting to keep up with the dog, you slip and slam into a tree which causes thousands of crows flocking and fleeing the area of impact");
		Label ForestScene3K5 = new Label("Upon recovering from your fall, you hear the dog start to howl, you immedietly start to get up and continue on after the dog");
		ForestScene3K.setFont(new Font("Bahnschrift", 11));
		ForestScene3K2.setFont(new Font("Bahnschrift", 11));
		ForestScene3K3.setFont(new Font("Bahnschrift", 11));
		ForestScene3K4.setFont(new Font("Bahnschrift", 11));
		ForestScene3K5.setFont(new Font("Bahnschrift", 11));
		ForestScene3K.setTextFill(Color.BLACK);
		ForestScene3K2.setTextFill(Color.BLACK);
		ForestScene3K3.setTextFill(Color.BLACK);
		ForestScene3K4.setTextFill(Color.BLACK);
		ForestScene3K5.setTextFill(Color.BLACK);
		ForestScene3K.setEffect(Shadow);
		ForestScene3K.setEffect(Reflect);
		ForestScene3K2.setEffect(Shadow);
		ForestScene3K2.setEffect(Reflect);
		ForestScene3K3.setEffect(Shadow);
		ForestScene3K3.setEffect(Reflect);
		ForestScene3K4.setEffect(Shadow);
		ForestScene3K4.setEffect(Reflect);
		ForestScene3K5.setEffect(Shadow);
		ForestScene3K5.setEffect(Reflect);
				
		// Create a Button to go from the Dog scene of 3K to Bloody Dog scene of 3L
		Button BloodyDog = new Button("Bloody Dog");
		BloodyDog.setTextFill(Color.RED);
		BloodyDog.setFont(new Font("Bahnscrift", 11));
				
		// Button Action to go from Scene 3K to 3L
		BloodyDog.setOnAction(e -> primaryStage.setScene(Scene3L));
				
		// Import an Image for the Dog Scene
		VBox Image3K = new VBox();
				
		// Image Object for Scene 3K image
		Image IMAGE3K = new Image("https://i.pinimg.com/originals/96/76/37/9676372494ff13468565013d42c1ae81.jpg");
				
		// Create an Image view with special effects for the image
		SepiaTone TR = new SepiaTone();
		ImageView LookView = new ImageView(IMAGE3K);
		Image3K.getChildren().addAll(LookView);
		Image3K.setEffect(TR);
		Image3K.setAlignment(Pos.CENTER);
				
				
		// Creating the scene
		VBox dialogue3K = new VBox(10, ForestScene3K, ForestScene3K2, ForestScene3K3, ForestScene3K4, ForestScene3K5);
		dialogue3K.setAlignment(Pos.CENTER);
		HBox BDButton = new HBox(20, BloodyDog);
		BDButton.setAlignment(Pos.CENTER);
		HBox TTitle = new HBox(20, TreeTitle);
		TTitle.setAlignment(Pos.CENTER);
		VBox dogImage = new VBox(15, Image3K);
		dogImage.setAlignment(Pos.CENTER);
		VBox FinalS3K = new VBox(10, TTitle, dogImage, dialogue3K, BDButton);
		FinalS3K.setAlignment(Pos.CENTER);
		Scene3K = new Scene(FinalS3K, 1000, 1000);
				
	
		// Scene 3L Bloody Dog
		Label BloodyDogTitle = new Label("Bloody Dog");
		BloodyDogTitle.setFont(new Font("Bahnschrift", 35));
		BloodyDogTitle.setTextFill(Color.BLACK);
		BloodyDogTitle.setEffect(Reflect);
		BloodyDogTitle.setEffect(Shadow);
		Label ForestScene3L = new Label("Attempting to keep up with the poor lost dog, you try your hardest to catch up to it");
		Label ForestScene3L2 = new Label("As minutes pass, the dog starts to slow down and eventually comes to a hault");
		Label ForestScene3L3 = new Label("Upon reaching the dog's destination, you notice there is a large open wound on the side of it's ribecage");
		Label ForestScene3L4 = new Label("You soon understand that the dog has been shot, after a few seconds have passed the dog let out a small cry and breathed it's last, the dog was of no more");
		Label ForestScene3L5 = new Label("Wiping the tears of your cheeks, you carefully inspect the dog's collar, only to discover the dog belonged to your nebihor Suzan. You grab some nearby leaves and braches to cover the dog's body");
		ForestScene3L.setFont(new Font("Bahnschrift", 11));
		ForestScene3L2.setFont(new Font("Bahnschrift", 11));
		ForestScene3L3.setFont(new Font("Bahnschrift", 11));
		ForestScene3L4.setFont(new Font("Bahnschrift", 11));
		ForestScene3L5.setFont(new Font("Bahnschrift", 11));
		ForestScene3L.setTextFill(Color.BLACK);
		ForestScene3L2.setTextFill(Color.BLACK);
		ForestScene3L3.setTextFill(Color.BLACK);
		ForestScene3L4.setTextFill(Color.BLACK);
		ForestScene3L5.setTextFill(Color.BLACK);
		ForestScene3L.setEffect(Shadow);
		ForestScene3L.setEffect(Reflect);
		ForestScene3L2.setEffect(Shadow);
		ForestScene3L2.setEffect(Reflect);
		ForestScene3L3.setEffect(Shadow);
		ForestScene3L3.setEffect(Reflect);
		ForestScene3L4.setEffect(Shadow);
		ForestScene3L4.setEffect(Reflect);
		ForestScene3L5.setEffect(Shadow);
		ForestScene3L5.setEffect(Reflect);
				
				
		// Create a Button to go from the Bloody Dog scene of 3L to Scene 3D 
		Button Dark = new Button("Dark Forest");
		Dark.setTextFill(Color.BLUE);
		Dark.setFont(new Font("Bahnscrift", 11));
				
		// Button Action to go from Scene 3L to 3D
		Dark.setOnAction(e -> primaryStage.setScene(Scene3D));
						
		// Importing an image for Scene 3L
		VBox ImageS3L = new VBox();
					
		// Image Object for Scene 3L image
		Image IMAGES3L = new Image("https://thumbs.dreamstime.com/b/lonely-dog-sleeping-outside-garden-132957750.jpg");
						
		// Create an Image view with special effects for the image
		SepiaTone L = new SepiaTone();
		ImageView S3LView = new ImageView(IMAGES3L);
		ImageS3L.getChildren().addAll(S3LView);
		ImageS3L.setEffect(L);
		ImageS3L.setAlignment(Pos.CENTER);
				
		// creating the scene	
		VBox dialogue3L = new VBox(10, ForestScene3L, ForestScene3L2, ForestScene3L3, ForestScene3L4, ForestScene3L5);
		dialogue3L.setAlignment(Pos.CENTER);
		HBox DButton = new HBox(20, Dark);
		DButton.setAlignment(Pos.CENTER);
		VBox BloodyDOG = new VBox(15, ImageS3L);
		BloodyDOG.setAlignment(Pos.CENTER);
		HBox BLOODYDOGT = new HBox(20, BloodyDogTitle);
		BLOODYDOGT.setAlignment(Pos.CENTER);
		VBox FinalS3L = new VBox(10, BLOODYDOGT, BloodyDOG, dialogue3L, DButton);
		FinalS3L.setAlignment(Pos.CENTER);
		Scene3L = new Scene(FinalS3L, 1000, 1000);
				
		
		// Scene 3D Dark Scene
		Label DeerTitle = new Label("Deer Chase");
		DeerTitle.setFont(new Font("Bahnschrift", 35));
		DeerTitle.setTextFill(Color.BLACK);
		DeerTitle.setEffect(Reflect);
		DeerTitle.setEffect(Shadow);
		Label ForestScene3D = new Label("After your concern for the dog slowly fades away, you notice that you're in the heart of the forest with no exit in sight");
		Label ForestScene3D2 = new Label("Time slips away and you notice the sky is getting darker and darker by the minute");
		Label ForestScene3D3 = new Label("Concerned for your safty, you start to look around to try and find someone");
		Label ForestScene3D4 = new Label("After not seeing anyone in sight, you start to panic when suddenly you hear a noise behind you, you are startled by a flock of deer who appear to be running right towards you");
		Label ForestScene3D5 = new Label("You start to run in an attempt to avoid getting trampled by the flock of deer, you just managed to leap to safty and avoid getting trammpled");
		ForestScene3D.setFont(new Font("Bahnschrift", 11));
		ForestScene3D2.setFont(new Font("Bahnschrift", 11));
		ForestScene3D3.setFont(new Font("Bahnschrift", 11));
		ForestScene3D4.setFont(new Font("Bahnschrift", 11));
		ForestScene3D5.setFont(new Font("Bahnschrift", 11));
		ForestScene3D.setTextFill(Color.BLACK);
		ForestScene3D2.setTextFill(Color.BLACK);
		ForestScene3D3.setTextFill(Color.BLACK);
		ForestScene3D4.setTextFill(Color.BLACK);
		ForestScene3D5.setTextFill(Color.BLACK);
		ForestScene3D.setEffect(Shadow);
		ForestScene3D.setEffect(Reflect);
		ForestScene3D2.setEffect(Shadow);
		ForestScene3D2.setEffect(Reflect);
		ForestScene3D3.setEffect(Shadow);
		ForestScene3D3.setEffect(Reflect);
		ForestScene3D4.setEffect(Shadow);
		ForestScene3D4.setEffect(Reflect);
		ForestScene3D5.setEffect(Shadow);
		ForestScene3D5.setEffect(Reflect);
				
		// Create a Button to go from the 3D to 3DF
		Button Chase = new Button("Forest Chase");
		Chase.setTextFill(Color.GREEN);
		Chase.setFont(new Font("Bahnscrift", 11));
				
		// Button Action to go from Scene 3D to 3DF
		Chase.setOnAction(e -> primaryStage.setScene(Scene3DF));
				
		// Importing an image for Scene 3D
		VBox ImagesS3DeerChase = new VBox();
								
		// Image Object for Scene 3D image
		Image IMAGES3DeerChase = new Image("https://i.pinimg.com/originals/7b/20/f0/7b20f05afcf87b76f1ad42c24cc0c805.jpg");
								
		// Create an Image view with special effects for the image
		SepiaTone DARK = new SepiaTone();
		ImageView S3DView = new ImageView(IMAGES3DeerChase);
		ImagesS3DeerChase.getChildren().addAll(S3DView);
		ImagesS3DeerChase.setEffect(DARK);
		ImagesS3DeerChase.setAlignment(Pos.CENTER);
				
		// Creating the Scene
		VBox dialogue3D = new VBox(10, ForestScene3D, ForestScene3D2, ForestScene3D3, ForestScene3D4, ForestScene3D5);
		dialogue3D.setAlignment(Pos.CENTER);
		HBox DCButton = new HBox(20, Chase);
		DCButton.setAlignment(Pos.CENTER);
		VBox DEEPF = new VBox(15, ImagesS3DeerChase);
		DEEPF.setAlignment(Pos.CENTER);
		HBox DARKTitle = new HBox(20, DeerTitle);
		DARKTitle.setAlignment(Pos.CENTER);
		VBox Final3D = new VBox(10, DARKTitle, DEEPF, dialogue3D, DCButton);
		Final3D.setAlignment(Pos.CENTER);
		Scene3D = new Scene(Final3D, 1000, 1000);
				
				
		// Scene 3DF
		Label ChaseTitle = new Label("Dark Forest");
		ChaseTitle.setFont(new Font("Bahnschrift", 35));
		ChaseTitle.setTextFill(Color.BLACK);
		ChaseTitle.setEffect(Reflect);
		ChaseTitle.setEffect(Shadow);
		Label Dialogue3DF = new Label("After leaping to safty from the suprised flock of deer, you attempt to get up, patting the dust and dirt off your clothes");
		Label Dialogue3DF2 = new Label("You notice an object on the floor, upon closer inspection you realize that it's your string bag, it must have fallen off when you fell to the ground");
		Label Dialogue3DF3 = new Label("Rummaging through your bag, you forgot that you brought your cell phone, however upon closer inspection you notice that you have no service");
		Dialogue3DF.setFont(new Font("Bahnschrift", 11));
		Dialogue3DF2.setFont(new Font("Bahnschrift", 11));
		Dialogue3DF3.setFont(new Font("Bahnschrift", 11));
		Dialogue3DF.setTextFill(Color.BLACK);
		Dialogue3DF2.setTextFill(Color.BLACK);
		Dialogue3DF3.setTextFill(Color.BLACK);
		Dialogue3DF.setEffect(Shadow);
		Dialogue3DF.setEffect(Reflect);
		Dialogue3DF2.setEffect(Shadow);
		Dialogue3DF2.setEffect(Reflect);
		Dialogue3DF3.setEffect(Shadow);
		Dialogue3DF3.setEffect(Reflect);
				
		// Create a Button to go from the 3DF to MainChoiceScene1
		Button Choice = new Button("Pick your Poison");
		Choice.setTextFill(Color.BLUE);
		Choice.setFont(new Font("Bahnscrift", 11));
				
		// Button Action to go from Scene 3DF to MainChoiceScene1
		Choice.setOnAction(e -> primaryStage.setScene(MainChoiceScene1));
				
				
		// Importing an image for Scene 3DF
		VBox ImagesS3DF = new VBox();
										
		// Image Object for Scene 3DF image
		Image IMAGES3DF = new Image("https://media.istockphoto.com/photos/backpack-on-a-ground-in-a-coniferous-forest-picture-id1003272498");
										
		// Create an Image view with special effects for the image
		SepiaTone DF = new SepiaTone();
		ImageView S3DFView = new ImageView(IMAGES3DF);
		ImagesS3DF.getChildren().addAll(S3DFView);
		ImagesS3DF.setEffect(DF);
		ImagesS3DF.setAlignment(Pos.CENTER);
				
		// Creating the Scene
		VBox dialogue3DF = new VBox(10, Dialogue3DF, Dialogue3DF2,Dialogue3DF3);
		dialogue3DF.setAlignment(Pos.CENTER);
		HBox CHoiceButton = new HBox(20, Choice);
		CHoiceButton.setAlignment(Pos.CENTER);
		VBox S3DF = new VBox(15, ImagesS3DF);
		S3DF.setAlignment(Pos.CENTER);
		HBox CHASETitle = new HBox(20, ChaseTitle);
		CHASETitle.setAlignment(Pos.CENTER);
		VBox FinalS3DF = new VBox(10, CHASETitle, ImagesS3DF, dialogue3DF, CHoiceButton);
		FinalS3DF.setAlignment(Pos.CENTER);
		Scene3DF = new Scene(FinalS3DF, 1500, 1000);
				
				
		// MainChoiceScene1
		Label ChoicesTab = new Label("Choices");
		ChoicesTab.setFont(new Font("Bahnschrift", 35));
		ChoicesTab.setTextFill(Color.BLACK);
		ChoicesTab.setEffect(Reflect);
		ChoicesTab.setEffect(Shadow);
		Label ForestSceneC = new Label("After realizing your phone has no service and is completely useless, you slip your phone into your pocket for safe keeping");
		Label ForestSceneC2 = new Label("You continue walking to hopefully find a way out of this dreaded forest");
		Label ForestSceneC3 = new Label("After minutes of walking have passed, you notice the air beginning to thicken");
		Label ForestSceneC4 = new Label("A dense fog begins to fill the atmosphere, you are beginning to worry that you will never find your way out of the forest");
		Label ForestSceneC5 = new Label("Suddenly, you see a mysterious shadow in the distance standing behind the fog");
		Label ForestSceneC6 = new Label("Without warning, you suddenly hear whispers of some sort, the shadow is attempting to speak with you");
		Label ForestSceneC7 = new Label("You are faced with three choices: run away and don't look back, walk towards the shadowy figure, or climb a nearby tree ");
		ForestSceneC.setFont(new Font("Bahnschrift", 11));
		ForestSceneC2.setFont(new Font("Bahnschrift", 11));
		ForestSceneC3.setFont(new Font("Bahnschrift", 11));
		ForestSceneC4.setFont(new Font("Bahnschrift", 11));
	    ForestSceneC5.setFont(new Font("Bahnschrift", 11));
		ForestSceneC6.setFont(new Font("Bahnschrift", 11));
		ForestSceneC7.setFont(new Font("Bahnschrift", 11));
		ForestSceneC.setTextFill(Color.BLACK);
		ForestSceneC2.setTextFill(Color.BLACK);
		ForestSceneC3.setTextFill(Color.BLACK);
		ForestSceneC4.setTextFill(Color.BLACK);
		ForestSceneC5.setTextFill(Color.BLACK);
		ForestSceneC6.setTextFill(Color.BLACK);
		ForestSceneC7.setTextFill(Color.BLACK);
		ForestSceneC.setEffect(Shadow);
		ForestSceneC.setEffect(Reflect);
		ForestSceneC2.setEffect(Shadow);
		ForestSceneC2.setEffect(Reflect);
		ForestSceneC3.setEffect(Shadow);
		ForestSceneC3.setEffect(Reflect);
		ForestSceneC4.setEffect(Shadow);
		ForestSceneC4.setEffect(Reflect);
		ForestSceneC5.setEffect(Shadow);
		ForestSceneC5.setEffect(Reflect);
		ForestSceneC6.setEffect(Shadow);
		ForestSceneC6.setEffect(Reflect);
		ForestSceneC7.setEffect(Shadow);
		ForestSceneC7.setEffect(Reflect);
				
		// Create a Button to go from the MainChoiceScene1 to three different scenes
		Button Run_Away = new Button("Run Away");
		Run_Away.setTextFill(Color.BLUE);
		Run_Away.setFont(new Font("Bahnscrift", 11));
		Button Walk_Towards = new Button("Walk Towards");
		Walk_Towards.setTextFill(Color.CRIMSON);
		Walk_Towards.setFont(new Font("Bahnscrift", 11));
		Button Climb_Tree = new Button("Climb Tree");
		Climb_Tree.setTextFill(Color.BROWN);
		Climb_Tree.setFont(new Font("Bahnscrift", 11));
				
		// Button Action to go from Scene MainChoiceScene1 to Three different scenes
		Run_Away.setOnAction(e -> primaryStage.setScene(Scene3RunAway));
		Walk_Towards.setOnAction(e -> primaryStage.setScene(Scene3WalkTowards));
		Climb_Tree.setOnAction(e -> primaryStage.setScene(Scene3ClimbTree));
				
		// Importing an image for Scene MainChoiceScene1
		VBox ChoiceImageS3Q1 = new VBox();
												
		// Image Object for Scene MainChoiceScene1 image
		Image CHOICEIMAGES3Q1 = new Image("https://blogmedia.dealerfire.com/wp-content/uploads/sites/376/2018/09/Haunted-Halloween-2018-Tours-in-Chicago-IL-b_b.jpg");
												
		// Create an Image view with special effects for the image
		SepiaTone ChoiceOption = new SepiaTone();
		ImageView ChoiceViewK1 = new ImageView(CHOICEIMAGES3Q1);
		ChoiceImageS3Q1.getChildren().addAll(ChoiceViewK1);
		ChoiceImageS3Q1.setEffect(ChoiceOption);
		ChoiceImageS3Q1.setAlignment(Pos.CENTER);
				
				
		// Creating the Scene
		VBox ForestChoiceG2 = new VBox(10, ForestSceneC, ForestSceneC2, ForestSceneC3, ForestSceneC4, ForestSceneC5, ForestSceneC6, ForestSceneC7);
		ForestChoiceG2.setAlignment(Pos.CENTER);
		HBox ButtonChoiceR1 = new HBox(20, Run_Away, Walk_Towards, Climb_Tree);
		ButtonChoiceR1.setAlignment(Pos.CENTER);
		VBox ImageThreeChoiceQ3= new VBox(15, ChoiceImageS3Q1);
		ImageThreeChoiceQ3.setAlignment(Pos.CENTER);
		HBox TitleChoice2 = new HBox(20, ChoicesTab);
		TitleChoice2.setAlignment(Pos.CENTER);
		VBox LiveChoice3= new VBox(10, TitleChoice2, ImageThreeChoiceQ3, ForestChoiceG2, ButtonChoiceR1);
		LiveChoice3.setAlignment(Pos.CENTER);
		MainChoiceScene1 = new Scene(LiveChoice3, 900, 900);
		
		
		// Scene RunAway
		Label RunAway = new Label("Run Away");
		RunAway.setFont(new Font("Bahnschrift", 35));
		RunAway.setTextFill(Color.BLACK);
		RunAway.setEffect(Reflect);
		RunAway.setEffect(Shadow);
		Label ForestSceneA = new Label("You decide to turn around and run far away as possbile from that shadowy figure");
		Label ForestSceneA2 = new Label("Scared for your life, you break out in a full sprint in an attempt to outrun the shadowy figure");
		Label ForestSceneA3 = new Label("The fog seems to thicken by the second, not seeing where you are going, you are blindly running through the forest mindlessly");
		Label ForestSceneA4 = new Label("Thoughts of your beloved family flash before your eyes, disstarcted in thoughts, you slam into a large bolder blocking the way");
		Label ForestSceneA5 = new Label("You fall to the ground after colliding with the boulder, trembling in fear you begin to hyperventilate");
		Label ForestSceneA6 = new Label("After collecting your thoughts, you notice the shadowy figure getting closser and closser when suddenly...");
		ForestSceneA.setFont(new Font("Bahnschrift", 11));
		ForestSceneA2.setFont(new Font("Bahnschrift", 11));
		ForestSceneA3.setFont(new Font("Bahnschrift", 11));
		ForestSceneA4.setFont(new Font("Bahnschrift", 11));
		ForestSceneA5.setFont(new Font("Bahnschrift", 11));
		ForestSceneA6.setFont(new Font("Bahnschrift", 11));
		ForestSceneA.setTextFill(Color.BLACK);
		ForestSceneA2.setTextFill(Color.BLACK);
		ForestSceneA3.setTextFill(Color.BLACK);
		ForestSceneA4.setTextFill(Color.BLACK);
		ForestSceneA5.setTextFill(Color.BLACK);
		ForestSceneA6.setTextFill(Color.BLACK);
		ForestSceneA.setEffect(Shadow);
		ForestSceneA.setEffect(Reflect);
		ForestSceneA2.setEffect(Shadow);
		ForestSceneA2.setEffect(Reflect);
		ForestSceneA3.setEffect(Shadow);
		ForestSceneA3.setEffect(Reflect);
		ForestSceneA4.setEffect(Shadow);
		ForestSceneA4.setEffect(Reflect);
		ForestSceneA5.setEffect(Shadow);
		ForestSceneA5.setEffect(Reflect);
		ForestSceneA6.setEffect(Shadow);
		ForestSceneA6.setEffect(Reflect);
				
				
		// Create a Button to go from the RunAway to Scene3DyingSceneQ1
		Button NextR3 = new Button("Continue");
		NextR3.setTextFill(Color.BLUE);
		NextR3.setFont(new Font("Bahnscrift", 11));
						
				
		// Button Action to go from Scene Run Away to DyingSceneQ1
		NextR3.setOnAction(e -> primaryStage.setScene(Scene3DyingSceneQ1));
				
		// Importing an image for Scene Run Away
		VBox RunningImageA1 = new VBox();
														
		// Image Object for Scene 4A image
		Image RUNNINGIMAGEA1 = new Image("https://st2.depositphotos.com/1445720/12284/i/950/depositphotos_122842618-stock-photo-rocky-path-through-old-foggy.jpg");
														
		// Create an Image view with special effects for the image
		SepiaTone RUNA3 = new SepiaTone();
		ImageView RunAwayX1 = new ImageView(RUNNINGIMAGEA1);
		RunningImageA1.getChildren().addAll(RunAwayX1);
		RunningImageA1.setEffect(RUNA3);
		RunningImageA1.setAlignment(Pos.CENTER);
				
				
		// Creating the Scene
		VBox ForestRunG1 = new VBox(10, ForestSceneA, ForestSceneA2, ForestSceneA3, ForestSceneA4, ForestSceneA5, ForestSceneA6);
		ForestRunG1.setAlignment(Pos.CENTER);
		HBox NextSceneK2 = new HBox(20, NextR3);
		NextSceneK2.setAlignment(Pos.CENTER);
		VBox ImageRunningQ1 = new VBox(15, RunningImageA1);
		ImageRunningQ1.setAlignment(Pos.CENTER);
		HBox RUNA3Title = new HBox(20, RunAway);
		RUNA3Title.setAlignment(Pos.CENTER);
		VBox FirstChoiceQ1 = new VBox(10, RUNA3Title, ImageRunningQ1, ForestRunG1, NextSceneK2);
		FirstChoiceQ1.setAlignment(Pos.CENTER);
		Scene3RunAway = new Scene(FirstChoiceQ1, 1000, 1000);

			
		// Scene Walk Towards into SurvivalSceneY2
		Label CuriousTitle1 = new Label("Forest Walk");
		CuriousTitle1.setFont(new Font("Bahnschrift", 35));
		CuriousTitle1.setTextFill(Color.BLACK);
		CuriousTitle1.setEffect(Reflect);
		CuriousTitle1.setEffect(Shadow);
		Label ForestSceneB = new Label("You decide to walk towards the shadowy figure, anxious to see someone in the forest for help");
		Label ForestSceneB2 = new Label("After walking a short distance, you notice that you are almost near the mysterious shadow");
		Label ForestSceneB3 = new Label("Shortly after, you start to have second thoughts and think this is a bad idea");
		Label ForestSceneB4 = new Label("You pause, attempting to turn back when suddenlly you hear a voice");
		Label ForestSceneB5 = new Label("The voice cuts you off guard, and you reply: (Hello is anyone there?)");
		Label ForestSceneB6 = new Label("Suddenly, you see the shadow moving towards you as it gets closer and closer when finally...");
		ForestSceneB.setFont(new Font("Bahnschrift", 11));
		ForestSceneB2.setFont(new Font("Bahnschrift", 11));
		ForestSceneB3.setFont(new Font("Bahnschrift", 11));
		ForestSceneB4.setFont(new Font("Bahnschrift", 11));
		ForestSceneB5.setFont(new Font("Bahnschrift", 11));
		ForestSceneB6.setFont(new Font("Bahnschrift", 11));
		ForestSceneB.setTextFill(Color.BLACK);
		ForestSceneB2.setTextFill(Color.BLACK);
		ForestSceneB3.setTextFill(Color.BLACK);
		ForestSceneB4.setTextFill(Color.BLACK);
		ForestSceneB5.setTextFill(Color.BLACK);
		ForestSceneB6.setTextFill(Color.BLACK);
		ForestSceneB.setEffect(Shadow);
		ForestSceneB.setEffect(Reflect);
		ForestSceneB2.setEffect(Shadow);
		ForestSceneB2.setEffect(Reflect);
		ForestSceneB3.setEffect(Shadow);
		ForestSceneB3.setEffect(Reflect);
		ForestSceneB4.setEffect(Shadow);
		ForestSceneB4.setEffect(Reflect);
		ForestSceneB5.setEffect(Shadow);
		ForestSceneB5.setEffect(Reflect);
		ForestSceneB6.setEffect(Shadow);
		ForestSceneB6.setEffect(Reflect);
				
		// Create a Button to go from the Walking towards scene to SurvivalSceneY2
		Button NextR2 = new Button("Continue");
		NextR2.setTextFill(Color.BLUE);
		NextR2.setFont(new Font("Bahnscrift", 11));
				
				
		// Button Action to go from Scene Walking Towards to SurvivalSceneY2
		NextR2.setOnAction(e -> primaryStage.setScene(SurvivalScene3Y2));
				
		// Importing an image for Scene 3WT
		VBox CuriousPicH1 = new VBox();
																
		// Image Object for Scene 3WT image
		Image CURIOUSPICH1 = new Image("https://i.pinimg.com/originals/ba/c1/bb/bac1bbb26c2a567c73d8867d57edf3d3.jpg");
																
		// Create an Image view with special effects for the image
		SepiaTone CURIOUDPATHK2 = new SepiaTone();
		ImageView WalkingCuriousX1 = new ImageView(CURIOUSPICH1);
		CuriousPicH1.getChildren().addAll(WalkingCuriousX1);
		CuriousPicH1.setEffect(CURIOUDPATHK2);
		CuriousPicH1.setAlignment(Pos.CENTER);
				
		// Creating the Scene
		VBox CuriousForestM1 = new VBox(10, ForestSceneB, ForestSceneB2, ForestSceneB3, ForestSceneB4, ForestSceneB5, ForestSceneB6);
		CuriousForestM1.setAlignment(Pos.CENTER);
		HBox NextSceneA3 = new HBox(20, NextR2);
		NextSceneA3.setAlignment(Pos.CENTER);
		VBox ImageCuriousY3 = new VBox(15, CuriousPicH1);
		ImageCuriousY3.setAlignment(Pos.CENTER);
		HBox CURIOUDPATHK2Title = new HBox(20, CuriousTitle1);
		CURIOUDPATHK2Title.setAlignment(Pos.CENTER);
		VBox SecondChoiceQ1 = new VBox(10, CURIOUDPATHK2Title, ImageCuriousY3, CuriousForestM1, NextSceneA3);
		SecondChoiceQ1.setAlignment(Pos.CENTER);
		Scene3WalkTowards = new Scene(SecondChoiceQ1, 1000, 1000);

		// Scene ClimbingTree to DyingDead2
		Label TreeA1 = new Label("Climb The Tree");
		TreeA1.setFont(new Font("Bahnschrift", 35));
		TreeA1.setTextFill(Color.BLACK);
		TreeA1.setEffect(Reflect);
		TreeA1.setEffect(Shadow);
		Label ForestSceneO = new Label("You have made up your mind and attempt to climb a tree in an effort to gain the high ground");
		Label ForestSceneO2 = new Label("As you touch the tree to begin climbing, you notice there are strage slashes on this tree's bark");
		Label ForestSceneO3 = new Label("Upon closer inspection, you notice that the group of trees sourounding you also have similar slashes on them");
		Label ForestSceneO4 = new Label("Regardless of the strange markings, you proceed to climb the tree, one arm after the other, slowly making your way up");
		Label ForestSceneO5 = new Label("Shortly after climbing, you notice a thick and long branch at the top of the tree, you think you will get a good view there");
		Label ForestSceneO6 = new Label("Finally, you reach the tallest branch and sat down with your leggs hanging from the branch, suddenly you hear whistling");
		Label ForestSceneO7 = new Label("The whistling was strangly in tune to a rhythm, following the strange tune appeared a ghostly figure behind the thick fog");
		Label ForestSceneO8 = new Label("The shadowy figure apperead walking accross from you, upon further inspection you notice that it was carrying an object, then suddenly...");
		ForestSceneO.setFont(new Font("Bahnschrift", 11));
		ForestSceneO2.setFont(new Font("Bahnschrift", 11));
		ForestSceneO3.setFont(new Font("Bahnschrift", 11));
		ForestSceneO4.setFont(new Font("Bahnschrift", 11));
		ForestSceneO5.setFont(new Font("Bahnschrift", 11));
		ForestSceneO6.setFont(new Font("Bahnschrift", 11));
		ForestSceneO7.setFont(new Font("Bahnschrift", 11));
		ForestSceneO8.setFont(new Font("Bahnschrift", 11));
		ForestSceneO.setTextFill(Color.BLACK);
		ForestSceneO2.setTextFill(Color.BLACK);
		ForestSceneO3.setTextFill(Color.BLACK);
		ForestSceneO4.setTextFill(Color.BLACK);
		ForestSceneO5.setTextFill(Color.BLACK);
		ForestSceneO6.setTextFill(Color.BLACK);
		ForestSceneO7.setTextFill(Color.BLACK);
		ForestSceneO8.setTextFill(Color.BLACK);
		ForestSceneO.setEffect(Shadow);
		ForestSceneO.setEffect(Reflect);
		ForestSceneO2.setEffect(Shadow);
		ForestSceneO2.setEffect(Reflect);
		ForestSceneO3.setEffect(Shadow);
		ForestSceneO3.setEffect(Reflect);
		ForestSceneO4.setEffect(Shadow);
		ForestSceneO4.setEffect(Reflect);
		ForestSceneO5.setEffect(Shadow);
		ForestSceneO5.setEffect(Reflect);
		ForestSceneO6.setEffect(Shadow);
		ForestSceneO6.setEffect(Reflect);
		ForestSceneO7.setEffect(Shadow);
		ForestSceneO7.setEffect(Reflect);
		ForestSceneO8.setEffect(Shadow);
		ForestSceneO8.setEffect(Reflect);
				
						
		// Create a Button to go from the Outside scene to Death Scene 3 of DyingDead2
		Button NextR1 = new Button("Continue");
		NextR1.setTextFill(Color.BLUE);
		NextR1.setFont(new Font("Bahnscrift", 11));
				
				
	    // Button Action to go from Outside Scene to DyingDead2
	    NextR1.setOnAction(e -> primaryStage.setScene(DyingDeadScene3));
				
		// Importing an image for Scene 4O
		VBox TreePicK1 = new VBox();
																		
		// Image Object for Scene 4O image
		Image TREEPICK1 = new Image("https://sixlegsphoto.files.wordpress.com/2012/09/forest.jpg");
																		
		// Create an Image view with special effects for the image
		SepiaTone TREETALKF1 = new SepiaTone();
		ImageView TreeViewC1 = new ImageView(TREEPICK1);
		TreePicK1.getChildren().addAll(TreeViewC1);
		TreePicK1.setEffect(TREETALKF1);
		TreePicK1.setAlignment(Pos.CENTER);
				
		// Creating the Scene
		VBox TreeSceneH2 = new VBox(10, ForestSceneO, ForestSceneO2, ForestSceneO3, ForestSceneO4, ForestSceneO5, ForestSceneO6, ForestSceneO7, ForestSceneO8);
		TreeSceneH2.setAlignment(Pos.CENTER);
		HBox NextSceneTreeY1 = new HBox(20, NextR1);
		NextSceneTreeY1.setAlignment(Pos.CENTER);
		VBox TreePic2= new VBox(15, TreePicK1);
		TreePic2.setAlignment(Pos.CENTER);
		HBox TREETALKF1Title = new HBox(20, TreeA1);
		TREETALKF1Title.setAlignment(Pos.CENTER);
		VBox ThirdChoice = new VBox(10, TREETALKF1Title, TreePic2, TreeSceneH2, NextSceneTreeY1);
		ThirdChoice.setAlignment(Pos.CENTER);
		Scene3ClimbTree = new Scene(ThirdChoice, 1000, 1000);

		// Death Scene
		Label DyingA1 = new Label("DEATH BY GUNSHOT");
		DyingA1.setFont(new Font("Bahnschrift", 35));
		DyingA1.setTextFill(Color.BLACK);
		DyingA1.setEffect(Reflect);
		DyingA1.setEffect(Shadow);
		Label ForestSceneD1 = new Label("An old man appears at the sharp end of the fog, as you gaze into his eyes your heart starts to beat faster and faster");
		Label ForestSceneD2 = new Label("Without a single word, the old man gazzes upon your motionless body and smirks, upon inspection he appears to be carrying a loaded hunting rifle");
		Label ForestSceneD3 = new Label("The old man reaches into his pocket and throws 2 pictures on the ground, one of you and the other a dog with a red X scribbled with red pen");
		Label ForestSceneD4 = new Label("Without a single word, he cocks his gun, aims it right you and without a moments notice he pulls the trigger, the bullet percies straight through your heart as you breathe your last breath");
		ForestSceneD1.setFont(new Font("Bahnschrift", 11));
		ForestSceneD2.setFont(new Font("Bahnschrift", 11));
		ForestSceneD3.setFont(new Font("Bahnschrift", 11));
		ForestSceneD4.setFont(new Font("Bahnschrift", 11));
		ForestSceneD1.setTextFill(Color.BLACK);
		ForestSceneD2.setTextFill(Color.BLACK);
		ForestSceneD3.setTextFill(Color.BLACK);
		ForestSceneD4.setTextFill(Color.BLACK);
		ForestSceneD1.setEffect(Shadow);
		ForestSceneD1.setEffect(Reflect);
		ForestSceneD2.setEffect(Shadow);
		ForestSceneD2.setEffect(Reflect);
		ForestSceneD3.setEffect(Shadow);
		ForestSceneD3.setEffect(Reflect);
		ForestSceneD4.setEffect(Shadow);
		ForestSceneD4.setEffect(Reflect);
				
		// Create a Button to go from the DyingF2 to previous scenes
		Button Prize1 = new Button("Achievement Unlocked: Here Doggy Doggy!");
		Prize1.setTextFill(Color.BLUE);
		Prize1.setFont(new Font("Bahnscrift", 14));
		Button BackPrevious = new Button("Try Again");
		BackPrevious.setTextFill(Color.BROWN);
		BackPrevious.setFont(new Font("Bahnscrift", 11));
				
		// Button Action to a previous
		BackPrevious.setOnAction(e -> primaryStage.setScene(Scene2));
				
		// Importing an image for Scene Death One
		VBox DyingR1 = new VBox();
																				
		// Image Object for Scene Death One image
		Image DYINGR1 = new Image("https://www.thumbsticks.com/wp-content/uploads/2017/03/You-Died.jpg");
																				
		// Create an Image view with special effects for the image
		SepiaTone DEATHK1 = new SepiaTone();
		ImageView DyingB1 = new ImageView(DYINGR1);
		DyingR1.getChildren().addAll(DyingB1);
		DyingR1.setEffect(DEATHK1);
		DyingR1.setAlignment(Pos.CENTER);
				
		// Creating the Scene
		VBox DyingG1 = new VBox(10, ForestSceneD1, ForestSceneD2, ForestSceneD3, ForestSceneD4);
		DyingG1.setAlignment(Pos.CENTER);
		HBox DyingButton1 = new HBox(20, Prize1, BackPrevious);
		DyingButton1.setAlignment(Pos.CENTER);
		VBox DyingPic1 = new VBox(15, DyingR1);
		DyingPic1.setAlignment(Pos.CENTER);
		HBox DEATHK1Title = new HBox(20, DyingA1);
		DEATHK1Title.setAlignment(Pos.CENTER);
		VBox DeadR1 = new VBox(10, DEATHK1Title, DyingPic1, DyingG1, DyingButton1);
		DeadR1.setAlignment(Pos.CENTER);
		Scene3DyingSceneQ1 = new Scene(DeadR1, 1000, 1000);

		// Survival Scene
		Label Survival100 = new Label("SURVIVAL");
		Survival100.setFont(new Font("Bahnschrift", 35));
		Survival100.setTextFill(Color.BLACK);
		Survival100.setEffect(Reflect);
		Survival100.setEffect(Shadow);
		Label ForestSceneDES = new Label("It appears to be your father, the fog suddenly vanishes as if all your troubles have disappeared");
		Label ForestSceneDES2 = new Label("Your father runs to embrace you, he further explains that he's been searching for you ever since he saw you enter the forest");	
		Label ForestSceneDES3 = new Label("He then explains that your mother has been home worried sick and is awaiting your arrival, fianlly he points you to his car and you both set off for home");
		ForestSceneDES.setFont(new Font("Bahnschrift", 11));
		ForestSceneDES2.setFont(new Font("Bahnschrift", 11));
		ForestSceneDES3.setFont(new Font("Bahnschrift", 11));
		ForestSceneDES.setTextFill(Color.BLACK);
		ForestSceneDES2.setTextFill(Color.BLACK);
		ForestSceneDES3.setTextFill(Color.BLACK);
		ForestSceneDES.setEffect(Shadow);
		ForestSceneDES.setEffect(Reflect);
		ForestSceneDES2.setEffect(Shadow);
		ForestSceneDES2.setEffect(Reflect);
		ForestSceneDES3.setEffect(Shadow);
		ForestSceneDES3.setEffect(Reflect);
				
		// Create a Button to go from the LiveSceneY1 to one different scenes
		Button WinQ1 = new Button("Achievement Unlocked: Only Survival Awaits!");
		WinQ1.setTextFill(Color.BLUE);
		WinQ1.setFont(new Font("Bahnscrift", 14));
		Button BackPrevious2 = new Button("Try Again");
		BackPrevious2.setTextFill(Color.BROWN);
		BackPrevious2.setFont(new Font("Bahnscrift", 11));
				
		// Button Action to a previous
		BackPrevious2.setOnAction(e -> primaryStage.setScene(Scene2));
				
		// Importing an image for Scene Death Two
		VBox SurvivalP1 = new VBox();
																						
		// Image Object for Scene Death Two image
		Image SURVIVALP1 = new Image("https://cdn5.vectorstock.com/i/1000x1000/78/49/survivor-rubber-stamp-vector-16817849.jpg");
																						
		// Create an Image view with special effects for the image
		SepiaTone SURVH2 = new SepiaTone();
		ImageView SurvivalU = new ImageView(SURVIVALP1);
		SurvivalP1.getChildren().addAll(SurvivalU);
		SurvivalP1.setEffect(SURVH2);
		SurvivalP1.setAlignment(Pos.CENTER);
				
		// Creating the Scene
		VBox LivingProudJ2 = new VBox(10, ForestSceneDES, ForestSceneDES2, ForestSceneDES3);
		LivingProudJ2.setAlignment(Pos.CENTER);
		HBox ButtonSurvivalA1 = new HBox(20, WinQ1, BackPrevious2);
		ButtonSurvivalA1.setAlignment(Pos.CENTER);
		VBox LiveLife1 = new VBox(15, SurvivalP1);
		LiveLife1.setAlignment(Pos.CENTER);
		HBox SURVH2Title = new HBox(20, Survival100);
		SURVH2Title.setAlignment(Pos.CENTER);
		VBox SurvivorU2 = new VBox(10, SURVH2Title, LiveLife1, LivingProudJ2, ButtonSurvivalA1);
		SurvivorU2.setAlignment(Pos.CENTER);
		SurvivalScene3Y2 = new Scene(SurvivorU2, 1000, 1000);
		
				
		// Death Scene 2
		Label ForestDeth2 = new Label("DEATH BY AXE ");
		ForestDeth2.setFont(new Font("Bahnschrift", 35));
		ForestDeth2.setTextFill(Color.BLACK);
		ForestDeth2.setEffect(Reflect);
		ForestDeth2.setEffect(Shadow);
		Label ForestSceneDSW = new Label("The shadowy figure appeared from the fog, It appeared to be a woman wearing a face mask, you now see she is carrying an axe");
		Label ForestSceneDSW2 = new Label("You soon realize that she was the one slashing the trees surrouding you, it appears she is offended that you entered her domain");
		Label ForestSceneDSW3 = new Label("She glares at you as complete silence fills the air, without any warning she lauches her axe right at you, decapitating your head from your body as your lifeless body drops from the tree");
		ForestSceneDSW.setFont(new Font("Bahnschrift", 11));
		ForestSceneDSW2.setFont(new Font("Bahnschrift", 11));
		ForestSceneDSW3.setFont(new Font("Bahnschrift", 11));
		ForestSceneDSW.setTextFill(Color.BLACK);
		ForestSceneDSW2.setTextFill(Color.BLACK);
		ForestSceneDSW3.setTextFill(Color.BLACK);
		ForestSceneDSW.setEffect(Shadow);
		ForestSceneDSW.setEffect(Reflect);
		ForestSceneDSW2.setEffect(Shadow);
		ForestSceneDSW2.setEffect(Reflect);
		ForestSceneDSW3.setEffect(Shadow);
		ForestSceneDSW3.setEffect(Reflect);
				
		// Create a Button to go from the DyingDead2 to one different scenes
		Button Prize3 = new Button("Achievement Unlocked: The executioner!");
		Prize3.setTextFill(Color.BLUE);
		Prize3.setFont(new Font("Bahnscrift", 14));
		Button BackPrevious3 = new Button("Try Again");
		BackPrevious3.setTextFill(Color.BROWN);
		BackPrevious3.setFont(new Font("Bahnscrift", 11));
				
		// Button Action to a previous
		BackPrevious3.setOnAction(e -> primaryStage.setScene(Scene2));
				
		// Importing an image for Scene Death Two
		VBox DyingScene2 = new VBox();
																								
		// Image Object for Scene Death Two image
		Image DEATH2 = new Image("https://www.thumbsticks.com/wp-content/uploads/2017/03/You-Died.jpg");
																								
		// Create an Image view with special effects for the image
		SepiaTone T2 = new SepiaTone();
		ImageView DyingFast2 = new ImageView(DEATH2);
		DyingScene2.getChildren().addAll(DyingFast2);
		DyingScene2.setEffect(T2);
		DyingScene2.setAlignment(Pos.CENTER);
				
		// Creating the Scene
		VBox ForestingDeath2 = new VBox(10, ForestSceneDSW, ForestSceneDSW2, ForestSceneDSW3);
		ForestingDeath2.setAlignment(Pos.CENTER);
		HBox SmartDeath3 = new HBox(20, Prize3, BackPrevious3);
		SmartDeath3.setAlignment(Pos.CENTER);
		VBox DYS = new VBox(15, DyingScene2);
		DYS.setAlignment(Pos.CENTER);
		HBox T2Title = new HBox(20, ForestDeth2);
		T2Title.setAlignment(Pos.CENTER);
		VBox Death02 = new VBox(10, T2Title, DyingScene2, ForestingDeath2, SmartDeath3);
		Death02.setAlignment(Pos.CENTER);
		DyingDeadScene3 = new Scene(Death02, 1000, 1000);
		
		
		
		//*********************************************************************************************************
		//********************************** END OF THOMAS CODE ***************************************************
		//*********************************************************************************************************
		
		//*********************************************************************************************************
		//********************************** Start of Ryan Code ***************************************************
		//*********************************************************************************************************
		
		/**
		 * @Author: Ryan Hern 
		 * 
		 * Beginning menu of the Town Pathway
		 * 
		 * Dialogue
		 */
		
		// Creatin dialogue for Scene 5
		
		Label DialogueScene5 = new Label("You're making your way to the door.");
		Label DialogueScene52 = new Label("You twist the handle, and open the door..");
		Label DialogueScene53 = new Label("You're walking through the door, and out on the street.");
		Label DialogueScene54 = new Label("You decided to walk through the streets...");
		DialogueScene5.setFont(new Font("Bahnschrift", 11));
		DialogueScene52.setFont(new Font("Bahnschrift", 11));
		DialogueScene53.setFont(new Font("Bahnschrift", 11));
		DialogueScene54.setFont(new Font("Bahnschrift", 11));
		DialogueScene5.setTextFill(Color.BLACK);
		DialogueScene52.setTextFill(Color.BLACK);
		DialogueScene53.setTextFill(Color.BLACK);
		DialogueScene54.setTextFill(Color.BLACK);
		DialogueScene5.setEffect(Reflect);
		DialogueScene5.setEffect(Shadow);
		DialogueScene52.setEffect(Reflect);
		DialogueScene52.setEffect(Shadow);
		DialogueScene53.setEffect(Reflect);
		DialogueScene53.setEffect(Shadow);
		DialogueScene54.setEffect(Reflect);
		DialogueScene54.setEffect(Shadow);
		
		// Button to Scene5 Choice
		Button Choice5 = new Button("Choose");
		Choice5.setTextFill(Color.BLUE);
		Choice5.setTextFill(Color.BROWN);
		
		// Set Action to the next scene
		Choice5.setOnAction(e -> primaryStage.setScene(Scene5C));
		
		// Import an Image to Scene 5
		// Create an Image Object
		
		VBox Scene5PIC = new VBox();
		
		// Importing the Image
		Image CHOICES5 = new Image("https://ronkitchens.com/wp-content/uploads/2013/09/Two-Choices.jpg");
		
		// Create an Image view with special effects for the image
		SepiaTone CH5 = new SepiaTone();
		ImageView CH5View = new ImageView(CHOICES5);
		Scene5PIC.getChildren().addAll(CH5View);
		Scene5PIC.setEffect(CH5);
		Scene5PIC.setAlignment(Pos.CENTER);
		
	
		/**
		 * 
		 * 
		 * This is just for the layout and Alignment for each part in Scene 5. While also creating the Scene.
		 * 
		 * 
		 */
		
	
		// Scene 5
		HBox VTitle = new HBox(20, TownTitle);
		VTitle.setAlignment(Pos.CENTER);
		VBox TownDialogue = new VBox(10, DialogueScene5, DialogueScene52, DialogueScene53, DialogueScene54);
		TownDialogue.setAlignment(Pos.CENTER);
		HBox CHOICEButton = new HBox(20, Choice5);
		CHOICEButton.setAlignment(Pos.CENTER);
		VBox ChoiceImage = new VBox(15, Scene5PIC);
		ChoiceImage.setAlignment(Pos.CENTER);
		VBox FinalS5 = new VBox(10, TownTitle, ChoiceImage, TownDialogue, CHOICEButton);
		FinalS5.setAlignment(Pos.CENTER);
		Scene5 = new Scene(FinalS5, 1000, 1000);
		
		 /**
		 * 
		 * @Author: Ryan Hern
		 * 
		 * Choices for the streets
		 *
		 * Choices
		 * 
		 * 
		 */
		
		// Scene 5C On the Street Choosing the your choice
		Label StreetsA1 = new Label("Streets");
		StreetsA1.setFont(new Font("Bahnschrift", 35));
		StreetsA1.setTextFill(Color.BLACK);
		StreetsA1.setEffect(Reflect);
		StreetsA1.setEffect(Shadow);
		Label TalkSceneCC = new Label("Nice! You've made it out of your house!");
		Label TalkSceneCC2 = new Label("Although, you got places to be and things to do...");
		Label TalkSceneCC3 = new Label("You see someone behind you and when you get worried, time to get a move on. You have two options, either go to the store or the park...");
		TalkSceneCC.setFont(new Font("Bahnschrift", 11));
		TalkSceneCC2.setFont(new Font("Bahnschrift", 11));
		TalkSceneCC3.setFont(new Font("Bahnschrift", 11));
		TalkSceneCC.setTextFill(Color.BLACK);
		TalkSceneCC2.setTextFill(Color.BLACK);
		TalkSceneCC3.setTextFill(Color.BLACK);
		TalkSceneCC.setEffect(Shadow);
		TalkSceneCC.setEffect(Reflect);
		TalkSceneCC2.setEffect(Shadow);
		TalkSceneCC2.setEffect(Reflect);
		TalkSceneCC3.setEffect(Shadow);
		TalkSceneCC3.setEffect(Reflect);
		
		/** 
		* Author: Ryan Hern
		* Navigate where you want to go
		*
		* Navigator
		*/ 
		
		// Use your navigator to choice where to go
		Button Store = new Button("Go to the Store");
		Store.setTextFill(Color.GREEN);
		Store.setFont(new Font("Bahnscrift", 11));
		Button Park = new Button("Go to the Park");
		Park.setTextFill(Color.BLUE);
		Park.setFont(new Font("Bahnscrift", 11));
		
		// Actioning button for the three choices
		Store.setOnAction(e -> primaryStage.setScene(Scene5S));
		Park.setOnAction(e -> primaryStage.setScene(Scene5P));
		
		// Importing an image for Scene 3 Streets
		VBox ImagesS5C = new VBox();
												
		// Image Object for Scene 3 Streets image
		Image ImagesS5CIMAGE = new Image("https://rvahub.com/wp-content/uploads/2020/03/downtown-2.jpg");
		
		// Create an Image view with special effects for the image
		SepiaTone S5C = new SepiaTone();
		ImageView S5CView = new ImageView(ImagesS5CIMAGE);
		ImagesS5C.getChildren().addAll(S5CView);
		ImagesS5C.setEffect(S5C);
		ImagesS5C.setAlignment(Pos.CENTER);
				
		
		// Scene 5C
		HBox StreetsTitle = new HBox(20, StreetsA1);
		StreetsTitle.setAlignment(Pos.CENTER);
		VBox StreetDialogue = new VBox(10, TalkSceneCC, TalkSceneCC2, TalkSceneCC3);
		StreetDialogue.setAlignment(Pos.CENTER);
		HBox MUTIPLEButton = new HBox(20, Store, Park);
		MUTIPLEButton.setAlignment(Pos.CENTER);
		VBox MChoiceImage = new VBox(15, ImagesS5C );
		MChoiceImage.setAlignment(Pos.CENTER);
		VBox FinalS5C = new VBox(10, StreetsA1, MChoiceImage, StreetDialogue, MUTIPLEButton);
		FinalS5C.setAlignment(Pos.CENTER);
		Scene5C = new Scene(FinalS5C, 1000, 1000);
		
		/**
		 * 
		 * @author Ryan Hern
		 * 
		 * In the Store Scene
		 * 
		 * Store
		 * 
		 * 
		 */
		
		// Scene 5S
		// Scene Store Scene into a death scene
		Label StoreTitle = new Label("Store");
		StoreTitle.setFont(new Font("Bahnschrift", 35));
		StoreTitle.setTextFill(Color.BLACK);
		StoreTitle.setEffect(Reflect);
		StoreTitle.setEffect(Shadow);
		Label TalkingSceneW = new Label("You decided to go to the store..");
		Label TalkingSceneW2 = new Label("You're currently shopping around for stuff around the house");
		Label TalkingSceneW3 = new Label("BANG! BANG! THERES A ROBBER IN THE STORE!!!");
		Label TalkingSceneW4 = new Label("The robber gets in your face and...");
		TalkingSceneW.setFont(new Font("Bahnschrift", 11));
		TalkingSceneW2.setFont(new Font("Bahnschrift", 11));
		TalkingSceneW3.setFont(new Font("Bahnschrift", 11));
		TalkingSceneW4.setFont(new Font("Bahnschrift", 11));
		TalkingSceneW.setTextFill(Color.BLACK);
		TalkingSceneW2.setTextFill(Color.BLACK);
		TalkingSceneW3.setTextFill(Color.BLACK);
		TalkingSceneW4.setTextFill(Color.BLACK);
		TalkingSceneW.setEffect(Shadow);
		TalkingSceneW.setEffect(Reflect);
		TalkingSceneW2.setEffect(Shadow);
		TalkingSceneW2.setEffect(Reflect);
		TalkingSceneW3.setEffect(Shadow);
		TalkingSceneW3.setEffect(Reflect);
		TalkingSceneW4.setEffect(Shadow);
		TalkingSceneW4.setEffect(Reflect);
		
		// Create a Button to go from scene S5S to Death Scene51 or SceneDeathS5
		Button S5SContinue = new Button("Continue");
		S5SContinue.setTextFill(Color.BLUE);
		S5SContinue.setFont(new Font("Bahnscrift", 11));
		
		// Button Action to go from Scene S5S to SceneDeathS5
		S5SContinue.setOnAction(e -> primaryStage.setScene(SceneDeathS5));
		
		// Importing an image for Scene S5S
		VBox ImagesS5Store = new VBox();
														
		// Image Object for Scene S5S image
		Image IMAGES5Store = new Image("https://media.istockphoto.com/photos/new-business-building-for-rent-or-lease-picture-id171264602?k=6&m=171264602&s=612x612&w=0&h=yksE75HMLzEB6HEDkzz8zX9ZWMHkvfJBBxRv6X5Y5iQ=");
		
		// Create an Image view with special effects for the image
		SepiaTone S5S = new SepiaTone();
		ImageView S5SView = new ImageView(IMAGES5Store);
		ImagesS5Store.getChildren().addAll(S5SView);
		ImagesS5Store.setEffect(S5S);
		ImagesS5Store.setAlignment(Pos.CENTER);
		
		
		// Scene 5C
		HBox STTitle = new HBox(20, StoreTitle);
		STTitle.setAlignment(Pos.CENTER);
		VBox TalkingDialogue = new VBox(10,  TalkingSceneW,  TalkingSceneW2,  TalkingSceneW3,  TalkingSceneW4);
		TalkingDialogue.setAlignment(Pos.CENTER);
		HBox S5CButton = new HBox(20, S5SContinue);
		S5CButton.setAlignment(Pos.CENTER);
		VBox StoreImage = new VBox(15, ImagesS5Store);
		StoreImage.setAlignment(Pos.CENTER);
		VBox FinalS5S = new VBox(10, STTitle, StoreImage, TalkingDialogue, S5CButton);
		FinalS5S.setAlignment(Pos.CENTER);
		Scene5S = new Scene(FinalS5S, 1000, 1000);
	
		 /** 
			* @Author: Ryan Hern
			* 
			* Going through the Park Scene
			*
			* Park
			*/ 
			
		// Scene Park Scene into a deathSceneS52
		Label ParkTitle = new Label("Park Path");
		ParkTitle.setFont(new Font("Bahnschrift", 35));
		ParkTitle.setTextFill(Color.BLACK);
	    ParkTitle.setEffect(Reflect);
	    ParkTitle.setEffect(Shadow);
	    Label TalkingSceneT = new Label("You decided to go to the park, although the park is full mysteries..");
	    Label TalkingSceneT2 = new Label("In the park, it was dark and cold, and you see a man and you beging to talk to him.");
		Label TalkingSceneT3 = new Label("YUCK! He starts to cough in your face and you then...");
	    TalkingSceneT.setFont(new Font("Bahnschrift", 11));
		TalkingSceneT2.setFont(new Font("Bahnschrift", 11));
	    TalkingSceneT3.setFont(new Font("Bahnschrift", 11));
	    TalkingSceneT.setTextFill(Color.BLACK);
	    TalkingSceneT2.setTextFill(Color.BLACK);
	    TalkingSceneT3.setTextFill(Color.BLACK);
	    TalkingSceneT.setEffect(Shadow);
		TalkingSceneT.setEffect(Reflect);
		TalkingSceneT2.setEffect(Shadow);
		TalkingSceneT2.setEffect(Reflect);
		TalkingSceneT3.setEffect(Shadow);
		TalkingSceneT3.setEffect(Reflect);
			
		// Create a Button to go from S5P to Death Scene 2 of DeathSceneS52
		Button S5PContinue = new Button("Continue");
		S5PContinue.setTextFill(Color.BLUE);
		S5PContinue.setFont(new Font("Bahnscrift", 11));
			
		// Button Action to go from Scene 4B to DeathScene2
		S5PContinue.setOnAction(e -> primaryStage.setScene(DeathSceneS52));
			
		// Importing an image for Scene 4B
		VBox ImagesS5Park = new VBox();
																	
		// Image Object for Scene 4B image
		Image IMAGES5Park = new Image("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/d4e6ff63-02d0-4b8f-baeb-bb499566d691/d1qze5l-7d96b580-7003-495f-8869-ba36c0b7948c.jpg/v1/fill/w_900,h_603,q_75,strp/dark_park_by_dev_matus_d1qze5l-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOiIsImlzcyI6InVybjphcHA6Iiwib2JqIjpbW3siaGVpZ2h0IjoiPD02MDMiLCJwYXRoIjoiXC9mXC9kNGU2ZmY2My0wMmQwLTRiOGYtYmFlYi1iYjQ5OTU2NmQ2OTFcL2QxcXplNWwtN2Q5NmI1ODAtNzAwMy00OTVmLTg4NjktYmEzNmMwYjc5NDhjLmpwZyIsIndpZHRoIjoiPD05MDAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.Nf-cw8jAGDR0HHNBxzMFpJ6p0NlrxvfAmSpddmT6CA4");
																	
		// Create an Image view with special effects for the image
		SepiaTone S5P = new SepiaTone();
		ImageView S5PView = new ImageView(IMAGES5Park);
		ImagesS5Park.getChildren().addAll(S5PView);
		ImagesS5Park.setEffect(S5P);
		ImagesS5Park.setAlignment(Pos.CENTER);
			
		// Creating the Scene
		VBox talkPark = new VBox(10, TalkingSceneT, TalkingSceneT2, TalkingSceneT3);
		talkPark.setAlignment(Pos.CENTER);
		HBox ContinueS5PButton = new HBox(20, S5PContinue);
		ContinueS5PButton.setAlignment(Pos.CENTER);
		VBox ParkImage = new VBox(15, ImagesS5Park);
		ParkImage.setAlignment(Pos.CENTER);
		HBox PTitle = new HBox(20, ParkTitle);
		PTitle.setAlignment(Pos.CENTER);
		VBox CHoicePark = new VBox(10, PTitle, ParkImage, talkPark, ContinueS5PButton);
		CHoicePark.setAlignment(Pos.CENTER);
		Scene5P = new Scene(CHoicePark, 1000, 1000);
		
		  /** 
		   * Author: Ryan Hern
		   * Death Scene for Store Option
		   *
		   * Store Death
		   * 
		   * SceneDeathS5
		   * 
		   */ 
		
		// Death Scene
		Label DeathS5Title = new Label("YOU GOT SHOT!");
		DeathS5Title.setFont(new Font("Bahnschrift", 35));
		DeathS5Title.setTextFill(Color.BLACK);
		DeathS5Title.setEffect(Reflect);
		DeathS5Title.setEffect(Shadow);
		Label DialogueSceneS5D = new Label("The robber point the gun to your face, and pulls the trigger!");
		DialogueSceneS5D.setFont(new Font("Bahnschrift", 11));
		DialogueSceneS5D.setTextFill(Color.BLACK);
		DialogueSceneS5D.setEffect(Shadow);
		DialogueSceneS5D.setEffect(Reflect);
		
		// Create a Button to go from the DeathScene to one different scenes
		Button AchievementS5D = new Button("Unlocked: Look for more details!");
		AchievementS5D.setTextFill(Color.PURPLE);
		AchievementS5D.setFont(new Font("Bahnscrift", 14));
		Button GoBackS5D = new Button("Try Again");
		GoBackS5D.setTextFill(Color.BROWN);
		GoBackS5D.setFont(new Font("Bahnscrift", 11));
		
		// Button Action to a previous
		GoBackS5D.setOnAction(e -> primaryStage.setScene(Scene2));
		
		// Importing an image for Scene Death One
		VBox ImageDeathS5D = new VBox();
																				
		// Image Object for Scene Death One image
		Image IMAGEDEATHS5D = new Image("https://image.pngaaa.com/268/246268-small.png");
				
		// Create an Image view with special effects for the image
		SepiaTone S5D = new SepiaTone();
		ImageView S5DView = new ImageView(IMAGEDEATHS5D);
		ImageDeathS5D .getChildren().addAll(S5DView);
		ImageDeathS5D .setEffect(S5D);
		ImageDeathS5D .setAlignment(Pos.CENTER);
		
		// Creating the Scene
		VBox dialogueDeathS5D = new VBox(10, DialogueSceneS5D);
		dialogueDeathS5D.setAlignment(Pos.CENTER);
		HBox DeathS5DButton = new HBox(20, AchievementS5D, GoBackS5D);
		DeathS5DButton.setAlignment(Pos.CENTER);
		VBox DeathS5DImage = new VBox(15, ImageDeathS5D);
		DeathS5DImage.setAlignment(Pos.CENTER);
		HBox S5DTitle = new HBox(20, DeathS5Title);
		S5DTitle.setAlignment(Pos.CENTER);
		VBox DeathS5One = new VBox(10, S5DTitle, DeathS5DImage, dialogueDeathS5D, DeathS5DButton);
		DeathS5One.setAlignment(Pos.CENTER);
		SceneDeathS5 = new Scene(DeathS5One, 1000, 1000);
		

		  /** 
			* @Author: Ryan Hern
			* 
			* Park Death Scene
			*
			* Park Death
			* 
			* 
			* DeathSceneS52
			* 
			*/ 
			
			// Virus Death
			Label VirusTitle = new Label("YOU GOT A DEATHLY VIRUS");
			VirusTitle.setFont(new Font("Bahnschrift", 35));
			VirusTitle.setTextFill(Color.BLACK);
			VirusTitle.setEffect(Reflect);
			VirusTitle.setEffect(Shadow);
			Label DialogueSceneS5D2 = new Label("The man in the park gave you a deathly virus!");	
			DialogueSceneS5D2.setFont(new Font("Bahnschrift", 11));
			DialogueSceneS5D2.setTextFill(Color.BLACK);
			DialogueSceneS5D2.setEffect(Shadow);
			DialogueSceneS5D2.setEffect(Reflect);
			
			
			// Create a Button to go from the Park Scene to Death Scene 2 of Scene 5
			Button AchievementS5D2 = new Button("Unlocked: The Spread!");
			AchievementS5D2.setTextFill(Color.GREEN);
			AchievementS5D2.setFont(new Font("Bahnscrift", 14));
			Button GoBackS5D2 = new Button("Try Again");
			GoBackS5D2.setTextFill(Color.BROWN);
			GoBackS5D2.setFont(new Font("Bahnscrift", 11));
			
			// Button Action to a previous
			GoBackS5D2.setOnAction(e -> primaryStage.setScene(Scene2));
			
			
			// Importing an image for Scene Death Two
			VBox ImageDeathS5D2 = new VBox();
																					
			// Image Object for Scene Death Two image
			Image IMAGEDEATHS5D2 = new Image("https://steamuserimages-a.akamaihd.net/ugc/1011526469362154720/0BCAF6AE349CA97BE68C973248E3D26F7A908E48/?imw=637&imh=358&ima=fit&impolicy=Letterbox&imcolor=%23000000&letterbox=true");
																					
					
			// Create an Image view with special effects for the image
			SepiaTone S5D2 = new SepiaTone();
			ImageView S5D2View = new ImageView(IMAGEDEATHS5D2);
			ImageDeathS5D2.getChildren().addAll(S5D2View);
			ImageDeathS5D2.setEffect(S5D2);
			ImageDeathS5D2.setAlignment(Pos.CENTER);
			
			// Creating the Scene
			VBox dialogueDeathS5D2 = new VBox(10, DialogueSceneS5D2);
			dialogueDeathS5D2.setAlignment(Pos.CENTER);
			HBox DeathS5D2Button = new HBox(20, AchievementS5D2, GoBackS5D2);
			DeathS5D2Button.setAlignment(Pos.CENTER);
			VBox DeathImageS5D2 = new VBox(15, ImageDeathS5D2);
			DeathImageS5D2.setAlignment(Pos.CENTER);
			HBox S5D2Title = new HBox(20, VirusTitle);
			S5D2Title.setAlignment(Pos.CENTER);
			VBox DeathS5Two = new VBox(10, S5D2Title, DeathImageS5D2, dialogueDeathS5D2, DeathS5D2Button);
			DeathS5Two.setAlignment(Pos.CENTER);
			DeathSceneS52 = new Scene(DeathS5Two, 1000, 1000);
		
				
		//*********************************************************************************************************
		//********************************  END OF RYAN CODE *****************************************************
		//*********************************************************************************************************
		

		/**
		 * 
		 * @Author: Charles Jiron
		 * 
		 * 
		 * This is just for the layout and Alignment for each part in Scene 4.
		 * 
		 * However, we added the imported image into this scene.
		 * 
		 * While also creating the Scene
		 */
		
		// Scene 4
		HBox BButton = new HBox(20, Bathroom);
		BButton.setAlignment(Pos.CENTER);
		VBox Dialogue = new VBox(10, DialogueScene4P1, DialogueScene4P2, DialogueScene4P3, DialogueScene4P4);
		Dialogue.setAlignment(Pos.CENTER);
		VBox Image = new VBox(15,ImagesS4);
		Image.setAlignment(Pos.CENTER);
		HBox HTitle = new HBox(20, HouseTitle);
		HTitle.setAlignment(Pos.CENTER);
		VBox FINAL = new VBox(10, HTitle, Image, Dialogue, BButton);
		Scene4 = new Scene(FINAL, 610, 750);
		
		
		/**
		 * 
		 * 
		 * Here it will register that an event handler was created for the quit button work, especially for the platform to exit.
		 * Also it will register the play button to go to the next scene where you will be able to choose a path.
		 * 
		 * The submit button will register your first name, last name, and gender. It also save it in java eclipse in the console section.
		 * It will be saved like this because saving information will ruin the format of everything in the scene, especially the image.
		 * 
		 */
	
		// Register Event Handler for Scene 1
		PlayButton.setOnAction(e -> primaryStage.setScene(Scene2));
		QuitButton.setOnAction(new ButtonClickHandlerQuit());
		SubmitButton.setOnAction(e-> System.out.println("First Name : " + FirstNameText.getText() + 
														" \nLast Name: " + LastNameText.getText() + 
														" \nGender: " + GenderText.getText()));
		
	
		
		/**
		 * 
		 * 
		 * 
		 * This was used for spacing and to put specific pices into a vertical layout or horizontal layout.
		 * 
		 * 
		 * 
		 */

		
		// New VBox for Spacing and Image for Scene 1
		HBox OneButton = new HBox(15, SubmitSave, SubmitButton);
		HBox TextEntry = new HBox(10, FirstNameLabel, FirstNameText, LastNameLabel, LastNameText, GenderLabel, GenderText);
		HBox Button = new HBox(15, PlayLabel, PlayButton, ExitLabel, QuitButton);
		VBox Spacing1 = new VBox(10, Welcome, Title1, MainMenu, TextEntry, SubmitSave, SubmitButton, Button);
		
		/**
		 * 
		 * 
		 * This was used for scene alignment to make everything look good and fit in the proper format.
		 * 
		 * 
		 */
		
		// Set the scene's alignment to center for the Scene 
		Spacing1.setAlignment(Pos.CENTER);
		TextEntry.setAlignment(Pos.CENTER);
		OneButton.setAlignment(Pos.CENTER);
		Button.setAlignment(Pos.CENTER);
		Spacing1.setPadding(new Insets(15));
		TextEntry.setPadding(new Insets(10));
		Button.setPadding(new Insets(10));
		
		/**
		 * 
		 *  Adds the first scene to the stage or window
		 */
							
		// Add the First Scene to the Stage
		Scene1 = new Scene(Spacing1, 865, 800);
		
		/**
		 * 
		 * Sets the first window to the first scene
		 */
		
		// Set Scene 1
		primaryStage.setScene(Scene1);
		
		
		/**
		 * Shows the window of the first scene and others
		 */
		
		
		// Show the window.
		primaryStage.show();
	}
	
	
	
	
	/**
	 * 
	 * Event Handler class for the ExitButton and QuitButton
	 * 
	 */

	class ButtonClickHandlerQuit implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			// Exit the Program.
			Platform.exit();
		
		}
	}
	
	class ButtonClickHandlerExit implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			// Exit the Program.
			Platform.exit();
		
		}
	}
}
