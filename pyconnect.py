

import RPi.GPIO as GPIO
import time
from bluetooth import *

# initialize GPIO pins
# go to https://www.raspberrypi-spy.co.uk/2012/06/simple-guide-to-the-rpi-gpio-header-and-pins/#prettyPhoto to see header pinout.
# certains pins double as GPIO as well as specific pins for specific protocol i.e I2C,SPIO,etc.
# make sure you understand the difference between GPIO.BCM and GPIO.BOARD. This is a good article (https://raspi.tv/2013/rpi-gpio-basics-4-setting-up-rpi-gpio-numbering-systems-and-inputs)

GPIO.setmode(GPIO.BOARD)
GPIO.setwarnings(False)

pin3=[3]
pin5=[5]
pin7=[7]
pin8=[8]
pin10=[10]
pin11=[11]
pin12=[12]
pin13=[13]
pin15=[15]
pin16=[16]
pin18=[18]
pin19=[19]
pin21=[21]
pin22=[22]
pin23=[23]
pin24=[24]
pin26=[26]
pin29=[29]
pin31=[31]
pin32=[32]
pin33=[33]
pin35=[35]
pin36=[36]
pin37=[37]
pin38=[38]
pin40=[40]

#initialize output setup mode
for i in pin3:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin5:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin7:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin8:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin10:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin11:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin12:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin13:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin15:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin16:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin18:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin19:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin21:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin22:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin22:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin23:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin24:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin26:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin29:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin31:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin32:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin33:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin35:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin36:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin37:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)
	
for i in pin38:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)

for i in pin40:
        GPIO.setup(i, GPIO.OUT)
        GPIO.output(i, GPIO.HIGH)

#ble connect

server_sock=BluetoothSocket( RFCOMM )
server_sock.bind(("",PORT_ANY))
server_sock.listen(1)

port = server_sock.getsockname()[1]

# must go to this website(https://www.uuidgenerator.net/version4) to generate your own uuid. 

uuid = "f57f47cf-bf8e-4834-b5be-1b93fa33f756"

advertise_service( server_sock, "PiConnect",
                   service_id = uuid,
                   service_classes = [ uuid, SERIAL_PORT_CLASS ],
                   profiles = [ SERIAL_PORT_PROFILE ],
			            #protocols = [ OBEX_UUID ]
                    )

while True:
	print ("Waiting for connection on RFCOMM channel %d" % port)
	client_sock, client_info = server_sock.accept()
	print ("Accepted connection from ", client_info)
	print ("starting program" )
	try:
		data = client_sock.recv(1024)
		if len(data) == 0:
			print ("received [%s]" % data)

		if data == 'gpio1on':
			#put funtionality here
			GPIO.output(pin3,GPIO.LOW)
		if data == 'gpio1off':
			GPIO.output(pin3,GPIO.HIGH)
			
		if data == 'gpio2on':
			GPIO.output(pin5,GPIO.LOW)
		if data == 'gpio2off':
			GPIO.output(pin5,GPIO.HIGH)
			
		if data == 'gpio3on':
			GPIO.output(pin7,GPIO.LOW)
		if data == 'gpio3off':
			GPIO.output(pin7,GPIO.HIGH)
			
		if data == 'gpio4on':
			GPIO.output(pin8,GPIO.LOW)
		if data == 'gpio4off':
			GPIO.output(pin8,GPIO.HIGH)
			
		if data == 'gpio5on':
			GPIO.output(pin10,GPIO.LOW)
		if data == 'gpio5off':
			GPIO.output(pin10,GPIO.HIGH)
			
		if data == 'gpio6on':
			GPIO.output(pin11,GPIO.LOW)
		if data == 'gpio6off':
			GPIO.output(pin11,GPIO.HIGH)
			
		if data == 'gpio7on':
			GPIO.output(pin12,GPIO.LOW)
		if data == 'gpio7off':
			GPIO.output(pin12,GPIO.HIGH)
			
		if data == 'gpio8on':
			GPIO.output(pin13,GPIO.LOW)
		if data == 'gpio8off':
			GPIO.output(pin13,GPIO.HIGH)
			
		if data == 'gpio9on':
			GPIO.output(pin15,GPIO.LOW)
		if data == 'gpio9off':
			GPIO.output(pin15,GPIO.HIGH)
			
		if data == 'gpio10on':
			GPIO.output(pin16,GPIO.LOW)
		if data == 'gpio10off':
			GPIO.output(pin16,GPIO.HIGH)
			
		if data == 'gpio11on':
			GPIO.output(pin18,GPIO.LOW)
		if data == 'gpio11off':
			GPIO.output(pin18,GPIO.HIGH)
			
		if data == 'gpio12on':
			GPIO.output(pin19,GPIO.LOW)
		if data == 'gpio12off':
			GPIO.output(pin19,GPIO.HIGH)
			
		if data == 'gpio13on':
			GPIO.output(pin21,GPIO.LOW)
		if data == 'gpio13off':
			GPIO.output(pin21,GPIO.HIGH)
			
		if data == 'gpio14on':
			GPIO.output(pin22,GPIO.LOW)
		if data == 'gpio14off':
			GPIO.output(pin22,GPIO.HIGH)
			
		if data == 'gpio15on':
			GPIO.output(pin23,GPIO.LOW)
		if data == 'gpio15off':
			GPIO.output(pin23,GPIO.HIGH)
			
		if data == 'gpio16on':
			GPIO.output(pin24,GPIO.LOW)
		if data == 'gpio16off':
			GPIO.output(pin24,GPIO.HIGH)
			
		if data == 'gpio17on':
			GPIO.output(pin26,GPIO.LOW)
		if data == 'gpio17off':
			GPIO.output(pin26,GPIO.HIGH)
			
		if data == 'gpio18on':
			GPIO.output(pin29,GPIO.LOW)
		if data == 'gpio18off':
			GPIO.output(pin29,GPIO.HIGH)
			
		if data == 'gpio19on':
			GPIO.output(pin31,GPIO.LOW)
		if data == 'gpio19off':
			GPIO.output(pin31,GPIO.HIGH)
			
		if data == 'gpio20on':
			GPIO.output(pin32,GPIO.LOW)
		if data == 'gpio20off':
			GPIO.output(pin32,GPIO.HIGH)
			
		if data == 'gpio21on':
			GPIO.output(pin33,GPIO.LOW)
		if data == 'gpio21off':
			GPIO.output(pin33,GPIO.HIGH)
			
		if data == 'gpio22on':
			GPIO.output(pin35,GPIO.LOW)
		if data == 'gpio22off':
			GPIO.output(pin35,GPIO.HIGH)
			
		if data == 'gpio23on':
			GPIO.output(pin36,GPIO.LOW)
		if data == 'gpio23off':
			GPIO.output(pin36,GPIO.HIGH)
			
		if data == 'gpio24on':
			GPIO.output(pin37,GPIO.LOW)
		if data == 'gpio24off':
			GPIO.output(pin37,GPIO.HIGH)
			
		if data == 'gpio25on':
			GPIO.output(pin38,GPIO.LOW)
		if data == 'gpio25off':
			GPIO.output(pin38,GPIO.HIGH)
			
		if data == 'gpio26on':
			GPIO.output(pin40,GPIO.LOW)
		if data == 'gpio26off':
			GPIO.output(pin40,GPIO.HIGH)

	except IOError:
		pass

	except KeyboardInterrupt:
			print ("end")

