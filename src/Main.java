
public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product("Yazýlým geliþtirme kampý(C# + Angular)" ,"Engin Demirog","%24");
		Product product2 = new Product("Yazýlým geliþtirme kampý(Java + React)" ,"Engin Demirog","%22");
		Product product3 = new Product("Programlamaya giriþ için temel kurs" ,"Engin Demirog","Ücretsiz");
		
		Product [] products = {product1,product2,product3};
		
		System.out.println("List of Courses");
		
		for(Product product:products) {
			System.out.println("- "+product.name);
		}
		
		System.out.println("\n**************************************\n");
		
		Work work= new Work();
		work.complete();
		work.next();
	}
}
