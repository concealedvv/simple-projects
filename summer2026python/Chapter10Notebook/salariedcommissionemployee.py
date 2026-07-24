# salariedcommissionemployee.py
"""SalariedCommissionEmployee derived from CommissionEmployee."""
from commissionemployee import CommissionEmployee
from decimal import Decimal

class SalariedCommissionEmployee(CommissionEmployee):
    """An employee who gets paid a salary plus 
    commission based on gross sales."""

    def __init__(self, first_name, last_name, ssn, 
                 gross_sales, commission_rate, base_salary):
        """Initialize SalariedCommissionEmployee's attributes."""
        super().__init__(first_name, last_name, ssn, 
                         gross_sales, commission_rate)
        self.base_salary = base_salary  # validate via property

    @property
    def base_salary(self):
        return self._base_salary

    @base_salary.setter
    def base_salary(self, salary):
        """Set base salary or raise ValueError if invalid."""
        if salary < Decimal('0.00'):
            raise ValueError('Base salary must be >= to 0')
        
        self._base_salary = salary

    def earnings(self):
        """Calculate earnings."""   
        return super().earnings() + self.base_salary

    def __repr__(self):
        """Return string representation for repr()."""
        return ('Salaried' + super().__repr__() +      
            f'\n  : {self.base_salary:.2f}')
        
salariedCommEmployee = SalariedCommissionEmployee('Suri', 'Nguyen', '41-32-5601', Decimal('16400.00'), Decimal('0.05'), Decimal('10000'))

print(salariedCommEmployee.first_name, salariedCommEmployee.last_name, salariedCommEmployee.ssn, salariedCommEmployee.gross_sales, salariedCommEmployee.commission_rate, salariedCommEmployee.base_salary)

print(f"{salariedCommEmployee.earnings(): .2f}")

print(issubclass(SalariedCommissionEmployee, CommissionEmployee))

print(isinstance(salariedCommEmployee, CommissionEmployee))
print(isinstance(salariedCommEmployee, SalariedCommissionEmployee))