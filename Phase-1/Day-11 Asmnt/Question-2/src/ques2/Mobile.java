package ques2;

public class Mobile {
	
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		
		m1.searchOutdatedModel("Nokia","note4","note5","note6","note8","maxpro M1");
	}
	
	void searchOutdatedModel(String...name) {
		String[] outdatedModels = {"note4","note5","note6","note7"};
		for(int i=0; i<name.length; i++) {
			for(int j=0;j<outdatedModels.length; j++) {
				if(name[i]==outdatedModels[j]) {
					System.out.println(outdatedModels[j]+"_OUTDATED");
				}
			}
		}
	}
}
