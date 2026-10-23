public class LibrarySection{
	private String sectionName;
	private LibraryItem[] items;
	private int count;
	
	public LibrarySection(String sectionName){
		this.sectionName = sectionName;
		this.items = new LibraryItem[4];
		this.count = 0;
}
public void addItem(LibraryItem item){
	if(item == null){
	return;
}
	if ( count < items.length){
	items[count] = item;
	count++;
	System.out.println("Added: " + item.getTitle());
}	else{
		System.out.println("Section full! cannot add " + item.getTitle());
}
}
public void displayItems(){
	System.out.println("\n--- Section: " + sectionName + "---");
	for(int i = 0 ; i<count ; i++){
		items[i].displayInfo();
}
}
}