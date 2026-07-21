import random
import matplotlib.pyplot as plt
import numpy as np
import seaborn as sns
from matplotlib import animation
from IPython.display import HTML

sns.set_style("whitegrid")
figure, axes = plt.subplots()

def rollCoin(frame, simulationCount=1000):
    heads, tails = 1, 2

    axes.cla()  

    rolls = [random.randrange(heads, tails + 1) for _ in range(simulationCount)]
    values, frequencies = np.unique(rolls, return_counts=True)

    sns.barplot(x=values, y=frequencies, palette="bright", ax=axes)  
    axes.set(xlabel="Flips", ylabel="Frequencies")
    axes.set_ylim(top=max(frequencies) * 1.25)

    for bar, frequency in zip(axes.patches, frequencies):
        xText = bar.get_x() + bar.get_width() / 2
        yText = bar.get_height()
        displayText = f" {frequency:,} \n {frequency / len(rolls): .3%}"
        axes.text(xText, yText, displayText, ha="center", va="bottom")
        

coin_animation = animation.FuncAnimation(figure, rollCoin, frames=20, interval=500)
HTML(coin_animation.to_jshtml())