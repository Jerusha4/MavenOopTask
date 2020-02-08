package maven.maven_project;
import java.util.Collections;


import java.util.ArrayList;
public class NewYearGift extends Sweet implements Chocolates
{
	public static void main(String args[])
	{
		int total_weight=0;                         
		ArrayList<Integer> chocolates_object=new ArrayList<Integer>();
		ArrayList<Integer> candy_list=new ArrayList<Integer>();
		ArrayList<Integer> result_CandyList=new ArrayList<Integer>();
		Chocolates DairyMilk=new NewYearGift();
		int DairyMilk_weight=DairyMilk.TotalChocalates(5,10);
		Candies MilkyWayCandyBar=new Candies();
		int MilkyWayCandy_Weight=MilkyWayCandyBar.Candy(1,20);
		candy_list.add(MilkyWayCandy_Weight);
		Sweet Laduu=new Sweet();
		int Laduu_weight=Laduu.Sweet_weight(5,100);
		total_weight=DairyMilk_weight+Laduu_weight+MilkyWayCandy_Weight;



		System.out.println("Weight of Gift1 is "+total_weight);
		chocolates_object.add(DairyMilk_weight);
		Chocolates MilkyBar=new NewYearGift();
		int MilkyBar_Weight=MilkyBar.TotalChocalates(3,5);
		Candies SwedishCandy=new Candies();
		int SwedishCandy_Weight=SwedishCandy.Candy(3,40);
		candy_list.add(SwedishCandy_Weight);
		Sweet Barfi=new Sweet();
		int Barfi_Weight=Barfi.Sweet_weight(5,10);
		total_weight=MilkyBar_Weight+Barfi_Weight+SwedishCandy_Weight;
		chocolates_object.add(MilkyBar_Weight);
		System.out.println("Weight of Gift2 is "+total_weight);
		Chocolates KitKat=new NewYearGift();
		int KitKat_Weight=KitKat.TotalChocalates(4,8);
		Candies HersheyKisses=new Candies();
		int HersheyKisses_Weight=HersheyKisses.Candy(2,20);
		candy_list.add(HersheyKisses_Weight);
		Sweet Halwa=new Sweet();
		int Halwa_weight=Halwa.Sweet_weight(2,50);
		total_weight=KitKat_Weight+Halwa_weight+HersheyKisses_Weight;
		System.out.println("Weight of Gift3 is "+total_weight);
		chocolates_object.add(KitKat_Weight);
		Collections.sort(chocolates_object);
		System.out.println("Chocolates Weight in gifts are"+chocolates_object);
		int size_candy=candy_list.size();
		for(int i=0;i<size_candy;i++)
		{
			if(candy_list.get(i)>=20 && candy_list.get(i)<=50)
			{
				result_CandyList.add(candy_list.get(i));
			}
		}
		System.out.println("Weight Of Candies That Satisfying Condition are "+result_CandyList);
		
	}
	public int TotalChocalates(int no_of_chocalates,int weight)
	{
		int total_weight=0;
		total_weight=no_of_chocalates*weight;
		return total_weight;
		
	}

}
				