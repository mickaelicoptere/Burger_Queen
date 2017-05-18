package project.Model;

public class APasCher extends Item {
	private String description;

	public APasCher() { this.description = null; }
	public APasCher(String description) { this.description = description; }

	public String getDescription() { return this.description; }

	public void setDescription(String Description) {
		this.description = Description;
	}
}