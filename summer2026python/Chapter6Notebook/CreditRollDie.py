import random
import matplotlib.pyplot as plt
import numpy as np
import seaborn as sns
from matplotlib import animation
from IPython.display import HTML

sns.set_style("whitegrid")
figure, axes = plt.subplots()

def rollDie(frame, simulationCount=1000):
    

    axes.cla()  

    rolls = [random.randrange(1, 7) for _ in range(simulationCount)]
    values, frequencies = np.unique(rolls, return_counts=True)

    sns.barplot(x=values, y=frequencies, palette="bright", ax=axes)  
    axes.set(xlabel="DieRolls", ylabel="Frequencies")
    axes.set_ylim(top=max(frequencies) * 1.25)

    for bar, frequency in zip(axes.patches, frequencies):
        xText = bar.get_x() + bar.get_width() / 2
        yText = bar.get_height()
        displayText = f" {frequency:,} \n {frequency / len(rolls): .3%}"
        axes.text(xText, yText, displayText, ha="center", va="bottom")
        

die_animation = animation.FuncAnimation(figure, rollDie, frames=20, interval=500)
HTML(die_animation.to_jshtml())