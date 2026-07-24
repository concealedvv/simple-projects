# salariedemployee.py
"""SalariedEmployee concrete subclass of Employee."""
from decimal import Decimal
from employee import Employee

#I was confused on how to approach this, as there are really no examples in the book explaining the Employee class. I made my own class.
class SalariedEmployee(Employee):
    """Class representing an employee who gets paid a weekly salary."""

    def __init__(self, first_name, last_name, ssn, weekly_salary):
        """Initialize SalariedEmployee attributes."""
        super().__init__(first_name, last_name, ssn) 
        self.weekly_salary = weekly_salary

    @property
    def weekly_salary(self):
        return self._weekly_salary

    @weekly_salary.setter
    def weekly_salary(self, salary):
        """Set weekly_salary or raise ValueError if invalid."""
        if salary < Decimal('0.0'):
            raise ValueError('salary worked must be >= 0.0')
        
        self._weekly_salary = salary
        
    def earnings(self):
        """Calculate earnings."""
        return self.weekly_salary

    def __repr__(self):
        """Return string representation for repr()."""
        return ('SalariedEmployee: ' + super().__repr__() + 
                f'\n and a weekly salary: {self.weekly_salary:.2f}')

salariedEmployee = SalariedEmployee('Jill','Bill','98-78-4563',12000)

salariedEmployee.weekly_salary = Decimal(20000)
print("changed the weekly salary")