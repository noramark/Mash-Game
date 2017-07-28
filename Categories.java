public class Categories {

	private String name;
	private String[] categories;

		public Categories(){}
		public void setName(String theName){
			name=theName;
		}
		public String getName(){
			return name;
		}
		public void setOptions(String[] theCategories){
			categories=theCategories;
		}
		public String[] getOptions(){
			return categories;
		}
}
