
public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product("Yaz�l�m geli�tirme kamp�(C# + Angular)" ,"Engin Demirog","%24");
		Product product2 = new Product("Yaz�l�m geli�tirme kamp�(Java + React)" ,"Engin Demirog","%22");
		Product product3 = new Product("Programlamaya giri� i�in temel kurs" ,"Engin Demirog","�cretsiz");
		
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
