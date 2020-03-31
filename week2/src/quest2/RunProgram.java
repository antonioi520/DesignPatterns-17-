package quest2;

import java.util.Scanner;

public class RunProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NPC frontGuard = new FrontGuard();
		NPC sideGuard = new SideGuard();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Interact with front or side guard? Type 'a' for front guard or 'b' for side guard");
		String option = keyboard.nextLine();
		if(option.equals("a")){
			System.out.println("Type 'a' to attack, 'b' to try to reason with the guard, or 'c' to try to chamr the guard");
			option = keyboard.nextLine();
			if(option.equals("a")){
				frontGuard.attack();
			}
			if(option.equals("b")){
				frontGuard.reason();
			}
			if(option.equals("c")){
				frontGuard.charm();
			}
		}
		else{
			System.out.println("Type 'a' to attack, 'b' to try to reason with the guard, or 'c' to try to chamr the guard");
			String option2 = keyboard.nextLine();
			if(option2.equals("a")){
				sideGuard.attack();
			}
			if(option2.equals("b")){
				sideGuard.reason();
			}
			if(option2.equals("c")){
				sideGuard.charm();
			}
		}
		
		
		System.out.println();
		System.out.print("Testing changing behaviors:");
		frontGuard.setcharmBehavior(new CharmDeny());
		frontGuard.charm();
		
		
		
		sideGuard.setreasonBehavior(new ReasonDeny());
		sideGuard.reason();
	}

}
