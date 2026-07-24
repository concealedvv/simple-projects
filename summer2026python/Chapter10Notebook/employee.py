from decimal import Decimal

class Employee:
    def __init__(self, first_name, last_name, ssn):
        """Initalize Employee with attributes to use for the derived salaried employee"""
        self.first_name = first_name
        self.last_name = last_name
        self.ssn = ssn
        
    def getFirst_Name(self):
        return self.first_name
    
    def getLast_Name(self):
        return self.last_name
    
    def getSSN(self):
        return self.ssn
    
    def __repr__(self):
        return f'{self.first_name} {self.last_name} has a ssn of {self.ssn}'