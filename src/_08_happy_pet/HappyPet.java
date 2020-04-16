package _08_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line:
	static int happinessLevel = 0;
	// this will be used to store the happiness of your pet


	public static void main(String[] args) {
		
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet=JOptionPane.showInputDialog(null, "WHAT KIND OF PET DO YOU WANT MY CHILD??? A DOGGO OR A KITTY???");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 11; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "WHAT DO YOU WANT TO DO TO MAKE YOUR PET HAPPY?", "happy pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"water", "feed"}, null);

			// 5. Use user input to call the appropriate method created in step 4.
if (task==0) {
	water(pet);
}
if (task==1) {
	feed(pet);
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happinessLevel==10) {
	break;
}
	}
	}

	static // 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	void water(String pet) {
		if (pet.equals("kitty")) {
			JOptionPane.showMessageDialog(null,"the cat purrrrs");
		happinessLevel++;
	}else {
		JOptionPane.showMessageDialog(null, "The doggo wags its tail");
	}
	}
	static void feed(String pet){
		if(pet.equals("doggo")) {
			JOptionPane.showMessageDialog(null, "The doggo sprints to the food and gobbles it down");
		}else {
			JOptionPane.showMessageDialog(null, "The cat licks you and eats its food");
		}
	
	
		}
}