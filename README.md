# PiConnect
<div align="center">
    <img src="/.github/piconlogo.png" width="300">
</div>
     
</p>
<p align="center">
    <a href="https://github.com/badges/shields/graphs/contributors" alt="Contributors">
        <img src="https://img.shields.io/badge/Version-0.0.1-blue" /></a>
    <a href="https://github.com/badges/shields/graphs/contributors" alt="Contributors">
        <img src="https://img.shields.io/badge/Android App-Experimental Stable-green" /></a>
    <a href="https://github.com/badges/shields/graphs/contributors" alt="Contributors">
        <img src="https://img.shields.io/badge/Rpi3 B+ image-Stable-green" /></a>
    <a href="https://github.com/badges/shields/graphs/contributors" alt="Contributors">
        <img src="https://img.shields.io/badge/Rpi Zero image-Stable-green" /></a>
    <a href="https://github.com/badges/shields/graphs/contributors" alt="Contributors">
        <img src="https://img.shields.io/badge/Rpi3 A+ image-Non working-red" /></a>
    <a href="https://github.com/badges/shields/graphs/contributors" alt="Contributors">
        <img src="https://img.shields.io/badge/Rpi4 image-Non working-red" /></a>

</p>
	
# What is PiConnect
Piconnet is a quick way to baseline control of all the gpio pins on a Rasberry Pi via bluetooth and an android app. Im assuming whoever wants to use this has some coding experience, If you want more functionality copy the code and go from there.

# What should i know?
The way the app functions is it sends a bluetooth message that the Raspberry Pi recieves. Once recieved the Raspberry Pi executes codes based on the message that is recieved. To customize functionality of the gpio pin you need to place the code in the pyconnect.py file. This file is to be executed on the Raspberry Pi. The image provided serves as a quikstart for the Raspbery Pi 3 B+ and Raspberry Pi zero, python code and bluetooth broadcast are executed on startup. Since the image is based on the last update of Raspbian Jesse it will not work with the Rasberry Pi 3 A+(Raspbian Image ≥ Raspbian Stretch) or the Rasberry Pi 4( Raspbain Image ≥ Raspbian Buster). For anything but the image provided you will need to do the bluetooth connection portion yourself, however, the executing the python file will still work. 

# Contact
If you have questions or want help feel free to email me at jeremyruroede@gmail.com. i will try to get back to you as soon as possible.
	
# License
MIT License
  


