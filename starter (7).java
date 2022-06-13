import pkg.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class Scale{
	String[] DataBase = new String[]{"C", "C#", "D","D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
	int i;

	public String MajorChord(String type){		//Ex: type C
	String FirstDegree = type;
	// String End; 
	int count = 0;
	
	
	for(i = 0; i<= 11; i++){
	if(DataBase[i].equals(FirstDegree)){			//%2 = 0
		System.out.print(DataBase[i] + " ");
		try {	
		System.out.print(DataBase[i + 4] + " ");
		System.out.println(DataBase[i + 7]);
		}	catch(Exception e){
		try {
		System.out.print(DataBase[(4 + i) - DataBase.length] + " ");	
			
		}	catch(Exception d){}
		System.out.println(DataBase[(7 + i) - DataBase.length]);	
		}
		break ; 
		// End = FirstDegree + 
		// System.out.println(Arrays.toString(DataBase));    to print 
		// count = i;
		// System.out.println("This is the number: " + count);
	}
	}
	
	// for(i = count; i <= 11; i++){
	// 	System.out.print(DataBase[i] + " " );
	// 	if(i == 11){
	// 		int x;
	// 		for(x = 0; x <= count; x++)
	// 		{
	// 		System.out.print(DataBase[x] + " " );
	// 		}
	// 		i = 12;
	// 	}
	// }
	
	return "";	
	}
	
	public String MinorChord(String type2){		//Ex: type c
	String[] DataBase2 = new String[]{"c", "c#", "d","d#", "e", "f", "f#", "g", "g#", "a", "a#", "b"};
	String FirstDegree2 = type2;
	int count = 0;
	
	for(i = 0; i<= 11; i++){
	if(DataBase2[i].equals(FirstDegree2)){			//%2 = 0
		System.out.print(DataBase2[i] + " ");
		try {	
		System.out.print(DataBase2[i + 3] + " ");
		System.out.println(DataBase2[i + 7]);
		}	catch(Exception e){
		try {
		System.out.print(DataBase2[(3 + i) - DataBase2.length] + " ");	
			
		}	catch(Exception d){}
		System.out.println(DataBase2[(7 + i) - DataBase2.length]);	
		}
		break ; 
	}
	}
	return "";	
	}
	
	public String DiminishedChord(String type3){		//Ex: type Cdim
	String[] DataBase3 = new String[]{"Cdim", "C#dim", "Ddim","D#dim", "Edim", "Fdim", "F#dim", "Gdim", "G#dim", "Adim", "A#dim", "Bdim"};
	String FirstDegree3 = type3;
	int count = 0;
	
	for(i = 0; i<= 11; i++){
	if(DataBase3[i].equals(FirstDegree3)){			//%2 = 0
		System.out.print(DataBase3[i] + " ");
		try {	
		System.out.print(DataBase3[i + 3] + " ");
		System.out.println(DataBase3[i + 6]);
		}	catch(Exception e){
		try {
		System.out.print(DataBase3[(3 + i) - DataBase3.length] + " ");	
			
		}	catch(Exception d){}
		System.out.println(DataBase3[(6 + i) - DataBase3.length]);	
		}
		break ; 
	}
	}
	return "";	
	}
	
	public String AugmentedChord(String type4){		//Ex: type Caug
	String[] DataBase4 = new String[]{"Caug", "C#aug", "Daug","D#aug", "Eaug", "Faug", "F#aug", "Gaug", "G#aug", "Aaug", "A#aug", "Baug"};
	String FirstDegree4 = type4;
	int count = 0;
	
	for(i = 0; i<= 11; i++){
	if(DataBase4[i].equals(FirstDegree4)){			//%2 = 0
		System.out.print(DataBase4[i] + " ");
		try {	
		System.out.print(DataBase4[i + 4] + " ");
		System.out.println(DataBase4[i + 8]);
		}	catch(Exception e){
		try {
		System.out.print(DataBase4[(4 + i) - DataBase4.length] + " ");	
			
		}	catch(Exception d){}
		System.out.println(DataBase4[(8 + i) - DataBase4.length]);	
		}
		break ; 
	}
	}
	return "";	
	}
	
	public String Major7thChord(String type5){		//Ex: type Cmaj7
	String[] DataBase5 = new String[]{"Cmaj7", "C#maj7", "Dmaj7","D#maj7", "Emaj7", "Fmaj7", "F#maj7", "Gmaj7", "G#maj7", "Amaj7", "A#maj7", "Bmaj7"};
	String FirstDegree5 = type5;
	int count = 0;
	
	for(i = 0; i<= 11; i++){
	if(DataBase5[i].equals(FirstDegree5)){			//%2 = 0
		System.out.print(DataBase5[i] + " ");
		try {	
		System.out.print(DataBase5[i + 4] + " ");
		System.out.print(DataBase5[i + 7] + " ");
		System.out.println(DataBase5[i + 11]);
		}	catch(Exception e){
		try {
		System.out.print(DataBase5[(4 + i) - DataBase5.length] + " ");	
			
		}	catch(Exception d){}
		System.out.print(DataBase5[(7 + i) - DataBase5.length]);
		System.out.println(DataBase5[(11 + i) - DataBase5.length]);
		}
		break ; 
	}
	}
	return "";	
	}
	
	public String Dominant7thChord(String type6){		//Ex: type C7
	String[] DataBase6 = new String[]{"C7", "C#7", "D7","D#7", "E7", "F7", "F#7", "G7", "G#7", "A7", "A#7", "B7"};
	String FirstDegree6 = type6;
	int count = 0;
	
	for(i = 0; i<= 11; i++){
	if(DataBase6[i].equals(FirstDegree6)){			//%2 = 0
		System.out.print(DataBase6[i] + " ");
		try {	
		System.out.print(DataBase6[i + 4] + " ");
		System.out.print(DataBase6[i + 7] + " ");
		System.out.println(DataBase6[i + 10]);
		}	catch(Exception e){
		try {
		System.out.print(DataBase6[(4 + i) - DataBase6.length] + " ");	
		
		}	catch(Exception d){}
		System.out.print(DataBase6[(7 + i) - DataBase6.length]);
		System.out.println(DataBase6[(10 + i) - DataBase6.length]);
		}
		break ; 
	}
	}
	return "";	
	}
	
	}
class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in); 
	
	System.out.println("If input is invalid(not a note), code will not run. ");
	System.out.println("Options - Major (Ex: C), Minor (Ex: c), Diminished (Ex: Cdim), Augmented (Ex: Caug), Major7th (Ex: Cmaj7), Dominant7th (Ex: C7)");
	System.out.print("Chord type: ");
	String type = sc.nextLine();
	
	Scale trial = new Scale();
	System.out.print(trial.MajorChord(type));
	System.out.print(trial.MinorChord(type));
	// Next Step Expand to Diminished and Augmented chords
	System.out.print(trial.DiminishedChord(type));
	System.out.print(trial.AugmentedChord(type));
	// Expanding to 7th(4 note) chords
	System.out.print(trial.Major7thChord(type));	 //Fix, works only for some cases; problem has to do with root note
	System.out.print(trial.Dominant7thChord(type));  //Fix, works only for some cases; problem has to do with root note
	
	}
	
}

