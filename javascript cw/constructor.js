class Employee
{
    constructor(name,address)
    {
        this.name=name;
        this.address=address;
    }
    getEmpInfo()
    {
        return "Name"+" "+this.name+ "Address"+"  "+ this.address;

    }
}
let res=new Employee("Sagar","Kolhapur");
console.log(res.getEmpInfo());