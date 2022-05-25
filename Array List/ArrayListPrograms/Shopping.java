package ArrayListPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Shopping 
{
	public static void main(String args[])throws Exception
	{
		Shopping shopping=new Shopping();
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		FileReader fr=new FileReader("shoppingcart.txt");
		BufferedReader br=new BufferedReader(fr);
		String s="";
		ArrayList<CartItem> items=new ArrayList<CartItem>();
		while((s=br.readLine())!=null)
		{
			StringTokenizer obj=new StringTokenizer(s,"\t");
			while(obj.hasMoreTokens())
			{
				String productId=obj.nextToken();
				String name=obj.nextToken();
				float price=Float.parseFloat(obj.nextToken());
				int quantity=Integer.parseInt(obj.nextToken());
				items.add(new CartItem(productId,name,price,quantity));
			}
		}
		System.out.println("- - -Befor adding item to Cart List - - -\n");
		shopping.showItems(items);
		shopping.addItem(items, new CartItem("C15","Carbon15",6899,29));
		System.out.println("\n- - -after adding one item to Cart List - - -\n");
		shopping.showItems(items);
		System.out.println("Enter itemname to remove: ");
		String removeitem=br1.readLine();
		//REMOVING ITEM
		items.remove(shopping.removeItem(items, removeitem));
		System.out.println("\n- - -after removing one item from  Cart List - - -\n");
		shopping.showItems(items);
		System.out.println("Enter item name to search: ");
		String searchcartitem=br1.readLine();
		if(shopping.searchItem(items,searchcartitem))
		{
			System.out.println(searchcartitem+" found in list");
		}
		else
		{
			System.out.println(searchcartitem+" not found in the lsit");
		}
		//FOR UPDATING PRODUCT NAME
		System.out.println("- - Enter what you want to update- - - ");
		String update=br1.readLine();
		shopping.updateItem(items,update);
		//CART ITEMS DETAILS AFTER UDATING
		for(CartItem cartitem:items)
		{
			System.out.println(cartitem);
		}
	}
	//TO SHOW THE ITEMS IN CART
	public void showItems(ArrayList<CartItem> itemlist)
	{
		for(CartItem cartitem:itemlist)
		{
			System.out.println(cartitem);
		}
	}
	//TO ADD THE ITEMS TO THE CART
	public void addItem(ArrayList<CartItem>itemlist,CartItem item)
	{
		itemlist.add(item);
	}
	//TO REMOVE THE ITEM FROM CART
	public int removeItem(ArrayList<CartItem> itemlist,String removeitem)
	{
		int k=0;
		for(CartItem cartitem:itemlist)
		{
			if(cartitem.name.equalsIgnoreCase(removeitem))
			{
				break;
			}
			else
			{
				k++;
			}
		}
		return k;
			
		
	}
	private void updateItem(ArrayList<CartItem> items, String update) 
	{
		// TODO Auto-generated method stub
		for(CartItem cartitem:items)
		{
			if(cartitem.name.equalsIgnoreCase(update))
			{
				cartitem.setName(update+" New");
				cartitem.setPrice(cartitem.getPrice()+1000);
			}
		}
		
	}
	private boolean searchItem(ArrayList<CartItem> items, String searchcartitem) {
		// TODO Auto-generated method stub
		for(CartItem cartitem:items)
		{
			if(cartitem.name.equals(searchcartitem))
			{
				return true;
			}
		}
		return false;
	}
}



class CartItem
{
	String productId;
	String name;
	float price;
	int quantity;
	public CartItem(String productId,String name,float price,int quantity)
	{
		this.productId=productId;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public String getproductId()
	{
		return productId;
	}
	public String getName()
	{
		return name;
	}
	public float getPrice()
	{
		return price;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	public String toString()
	{
		return "Product Id: "+productId+"\tProductName: "+name+"\tPrice: "+price+"\tQuantity: "+quantity;
	}
}