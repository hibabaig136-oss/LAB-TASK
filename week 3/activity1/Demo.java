public class Demo{
	public static void main(String args[]){
	Cart cart = new Cart();
	cart.addItem(120);
	cart.addItem(50,3);
	
	System.out.println("Cart total: " + cart.getTotal());
	cart.addItem(-10);
	cart.addItem(10,0);

	System.out.println("After invalid calls: " + cart.getTotal());
	
	}
}