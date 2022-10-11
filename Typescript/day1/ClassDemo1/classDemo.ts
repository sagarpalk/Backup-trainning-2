class Employee
{
    empId:number;
    name:string;
    constructor(empId:number,name:string)
    {
        this.empId=empId;
        this.name=name;
    }
    getEmpInfo()
    {
        return "ID"+" "+this.empId+ "name"+" "+this.name;
    }
}
let emp:Employee=new Employee(101,"Sagar");
console.log(emp.getEmpInfo());