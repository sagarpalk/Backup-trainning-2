var Employee = /** @class */ (function () {
    function Employee(empId, name) {
        this.empId = empId;
        this.name = name;
    }
    Employee.prototype.getEmpInfo = function () {
        return "ID" + this.empId + "name" + this.name;
    };
    return Employee;
}());
var emp = new Employee(101, "Sagar");
console.log(emp.getEmpInfo());
