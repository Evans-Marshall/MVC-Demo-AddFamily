package AddFamily;

public class FamilyController {

	private AddFamily model;
	private ViewFamily view;
	
	public FamilyController(AddFamily model, ViewFamily view) {
		this.model = model;
		this.view = view;
	}
		
		public void setFullName(String fullName) {
			model.setFullName(fullName);
		}
		public String getFullName() {
			return model.getFullName();
		}
		public void setTitle(String title) {
			model.setTitle(title);
		}
		public String getTitle() {
			return model.getTitle();
		}
		public void updateView() {
			view.printFamily(model.getFullName(), model.getTitle());
		}
}
