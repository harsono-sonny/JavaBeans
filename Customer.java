public class Customer{
	String name;
	int age;
	double years;

	public Customer(String aName,int anAge,double someYears){
		this.name = aName;
		this.age = anAge;
		this.years = someYears;

	}
	public static void main(String[] args) {
        Customer cheapCustomer = new Customer("sally",45,5.25);
            cheapCustomer.name = "sally";
            cheapCustomer.age = 45;
            cheapCustomer.years = 5.25;

}
}
