characterTable: list = []

for index in range(256):
    character = chr(index)
    characterTable.append(character)
    #print(f'added {character} to characterTable list')
    

print(characterTable)