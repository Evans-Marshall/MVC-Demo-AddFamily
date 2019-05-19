package AddFamily;

public class MVCDemo {
	public static void main (String[] args) {
		
		//find a family member based on their title
		AddFamily model = retriveFamilyMember();
		
		// create a view to write Family Member to console
		ViewFamily view = new ViewFamily();
		
		FamilyController controller = new FamilyController(model, view);
				
		controller.updateView();
		
	}
	
	private static AddFamily retriveFamilyMember() {
		AddFamily member = new AddFamily();
		member.setFullName("Marshall Evans");
		member.setTitle("Father");
		return member;
	}
}
