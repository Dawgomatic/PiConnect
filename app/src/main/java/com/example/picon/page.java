package com.example.picon;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.UUID;

import androidx.appcompat.app.AppCompatActivity;


public class page extends AppCompatActivity {
    Button add;
    BluetoothSocket mmSocket;
    BluetoothDevice mmDevice;
    final byte delimiter = 33;
    int readBufferPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        add = findViewById(R.id.add);
        add.setOnClickListener(new class workerThread implements Runnable {

            private String btMsg;

            public workerThread(String msg) {
                btMsg = msg;
            }

            public void run() {
                sendBtMsg(btMsg);
                {
                    int bytesAvailable;
                    boolean workDone = true;

                    try {
                        final InputStream mmInputStream;
                        mmInputStream = mmSocket.getInputStream();
                        bytesAvailable = mmInputStream.available();
                        if (bytesAvailable > -1) {

                            byte[] packetBytes = new byte[bytesAvailable];
                            Log.e("Picon recv bt", "bytes available");
                            byte[] readBuffer = new byte[1024];
                            mmInputStream.read(packetBytes);

                            for (int i = 0; i < bytesAvailable; i++) {
                                byte b = packetBytes[i];
                                if (b == delimiter) {
                                    byte[] encodedBytes = new byte[readBufferPosition];
                                    System.arraycopy(readBuffer, 0, encodedBytes, 0, encodedBytes.length);
                                    final String data = new String(encodedBytes, StandardCharsets.US_ASCII);
                                    readBufferPosition = 0;

                                    //The variable data now contains our full command
                                    workDone = true;
                                    break;
                                } else {
                                    readBuffer[readBufferPosition++] = b;
                                }
                            }
                            if (workDone == true) {
                                mmSocket.close();
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });


        //controls to populate add buttons
        Boolean gpiotb1 = getIntent().getBooleanExtra("chk1", false);
        Button gpiot1 = findViewById(R.id.gpiot1);
        if (gpiotb1) {
            //For Displaying Button
            gpiot1.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb2 = getIntent().getBooleanExtra("chk2", false);
        Button gpiot2 = findViewById(R.id.gpiot2);
        if (gpiotb2) {
            //For Displaying Button
            gpiot2.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb3 = getIntent().getBooleanExtra("chk3", false);
        Button gpiot3 = findViewById(R.id.gpiot3);
        if (gpiotb3) {
            //For Displaying Button
            gpiot3.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb4 = getIntent().getBooleanExtra("chk4", false);
        Button gpiot4 = findViewById(R.id.gpiot4);
        if (gpiotb4) {
            //For Displaying Button
            gpiot4.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb5 = getIntent().getBooleanExtra("chk5", false);
        Button gpiot5 = findViewById(R.id.gpiot5);
        if (gpiotb5) {
            //For Displaying Button
            gpiot5.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb6 = getIntent().getBooleanExtra("chk6", false);
        Button gpiot6 = findViewById(R.id.gpiot6);
        if (gpiotb6) {
            //For Displaying Button
            gpiot6.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb7 = getIntent().getBooleanExtra("chk7", false);
        Button gpiot7 = findViewById(R.id.gpiot7);
        if (gpiotb7) {
            //For Displaying Button
            gpiot7.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb8 = getIntent().getBooleanExtra("chk8", false);
        Button gpiot8 = findViewById(R.id.gpiot8);
        if (gpiotb8) {
            //For Displaying Button
            gpiot8.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb9 = getIntent().getBooleanExtra("chk9", false);
        Button gpiot9 = findViewById(R.id.gpiot9);
        if (gpiotb9) {
            //For Displaying Button
            gpiot9.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb10 = getIntent().getBooleanExtra("chk10", false);
        Button gpiot10 = findViewById(R.id.gpiot10);
        if (gpiotb10) {
            //For Displaying Button
            gpiot10.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb11 = getIntent().getBooleanExtra("chk11", false);
        Button gpiot11 = findViewById(R.id.gpiot11);
        if (gpiotb11) {
            //For Displaying Button
            gpiot11.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb12 = getIntent().getBooleanExtra("chk12", false);
        Button gpiot12 = findViewById(R.id.gpiot12);
        if (gpiotb12) {
            //For Displaying Button
            gpiot12.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb13 = getIntent().getBooleanExtra("chk13", false);
        Button gpiot13 = findViewById(R.id.gpiot13);
        if (gpiotb13) {
            //For Displaying Button
            gpiot13.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb14 = getIntent().getBooleanExtra("chk14", false);
        Button gpiot14 = findViewById(R.id.gpiot14);
        if (gpiotb14) {
            //For Displaying Button
            gpiot12.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb15 = getIntent().getBooleanExtra("chk15", false);
        Button gpiot15 = findViewById(R.id.gpiot15);
        if (gpiotb15) {
            //For Displaying Button
            gpiot15.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb16 = getIntent().getBooleanExtra("chk16", false);
        Button gpiot16 = findViewById(R.id.gpiot16);
        if (gpiotb16) {
            //For Displaying Button
            gpiot16.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb17 = getIntent().getBooleanExtra("chk17", false);
        Button gpiot17 = findViewById(R.id.gpiot17);
        if (gpiotb17) {
            //For Displaying Button
            gpiot17.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb18 = getIntent().getBooleanExtra("chk18", false);
        Button gpiot18 = findViewById(R.id.gpiot18);
        if (gpiotb18) {
            //For Displaying Button
            gpiot18.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb19 = getIntent().getBooleanExtra("chk19", false);
        Button gpiot19 = findViewById(R.id.gpiot19);
        if (gpiotb19) {
            //For Displaying Button
            gpiot19.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb20 = getIntent().getBooleanExtra("chk20", false);
        Button gpiot20 = findViewById(R.id.gpiot20);
        if (gpiotb20) {
            //For Displaying Button
            gpiot20.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb21 = getIntent().getBooleanExtra("chk21", false);
        Button gpiot21 = findViewById(R.id.gpiot21);
        if (gpiotb21) {
            //For Displaying Button
            gpiot21.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb22 = getIntent().getBooleanExtra("chk22", false);
        Button gpiot22 = findViewById(R.id.gpiot22);
        if (gpiotb22) {
            //For Displaying Button
            gpiot22.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb23 = getIntent().getBooleanExtra("chk23", false);
        Button gpiot23 = findViewById(R.id.gpiot23);
        if (gpiotb23) {
            //For Displaying Button
            gpiot23.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb24 = getIntent().getBooleanExtra("chk24", false);
        Button gpiot24 = findViewById(R.id.gpiot24);
        if (gpiotb24) {
            //For Displaying Button
            gpiot24.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb25 = getIntent().getBooleanExtra("chk25", false);
        Button gpiot25 = findViewById(R.id.gpiot25);
        if (gpiotb25) {
            //For Displaying Button
            gpiot25.setVisibility(View.VISIBLE);
        }

        Boolean gpiotb26 = getIntent().getBooleanExtra("chk26", false);
        Button gpiot26 = findViewById(R.id.gpiot26);
        if (gpiotb26) {
            //For Displaying Button
            gpiot26.setVisibility(View.VISIBLE);
        }


        final BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        View.OnClickListener() {
            public void onClick (View view){
                Intent intent = new Intent(page.this, addgpio.class);
                startActivity(intent);
            }
        }

        ToggleButton tbutton1 = findViewById(R.id.gpiot1);
        tbutton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio1on")).start();
                } else {
                    new Thread(new workerThread("gpio1off")).start();
                }
            }
        });

        ToggleButton tbutton2 = findViewById(R.id.gpiot2);
        tbutton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio2on")).start();
                } else {
                    new Thread(new workerThread("gpio2off")).start();
                }
            }
        });

        ToggleButton tbutton3 = findViewById(R.id.gpiot3);
        tbutton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio3on")).start();
                } else {
                    new Thread(new workerThread("gpio3off")).start();
                }
            }
        });

        ToggleButton tbutton4 = findViewById(R.id.gpiot4);
        tbutton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio4on")).start();
                } else {
                    new Thread(new workerThread("gpio4off")).start();
                }
            }
        });

        ToggleButton tbutton5 = findViewById(R.id.gpiot5);
        tbutton5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio5on")).start();
                } else {
                    new Thread(new workerThread("gpio5off")).start();
                }
            }
        });

        ToggleButton tbutton6 = findViewById(R.id.gpiot6);
        tbutton6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio6on")).start();
                } else {
                    new Thread(new workerThread("gpio6off")).start();
                }
            }
        });

        ToggleButton tbutton7 = findViewById(R.id.gpiot7);
        tbutton7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio7on")).start();
                } else {
                    new Thread(new workerThread("gpio7off")).start();
                }
            }
        });

        ToggleButton tbutton8 = findViewById(R.id.gpiot8);
        tbutton8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio8on")).start();
                } else {
                    new Thread(new workerThread("gpio8off")).start();
                }
            }
        });

        ToggleButton tbutton9 = findViewById(R.id.gpiot9);
        tbutton9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio9on")).start();
                } else {
                    new Thread(new workerThread("gpio9off")).start();
                }
            }
        });

        ToggleButton tbutton10 = findViewById(R.id.gpiot10);
        tbutton10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio10on")).start();
                } else {
                    new Thread(new workerThread("gpio10off")).start();
                }
            }
        });

        ToggleButton tbutton11 = findViewById(R.id.gpiot11);
        tbutton11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio11on")).start();
                } else {
                    new Thread(new workerThread("gpio11off")).start();
                }
            }
        });

        ToggleButton tbutton12 = findViewById(R.id.gpiot12);
        tbutton12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio12on")).start();
                } else {
                    new Thread(new workerThread("gpio12off")).start();
                }
            }
        });

        ToggleButton tbutton13 = findViewById(R.id.gpiot13);
        tbutton13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio13on")).start();
                } else {
                    new Thread(new workerThread("gpio13off")).start();
                }
            }
        });

        ToggleButton tbutton14 = findViewById(R.id.gpiot14);
        tbutton14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio14on")).start();
                } else {
                    new Thread(new workerThread("gpio14off")).start();
                }
            }
        });

        ToggleButton tbutton15 = findViewById(R.id.gpiot15);
        tbutton15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio15on")).start();
                } else {
                    new Thread(new workerThread("gpio15off")).start();
                }
            }
        });

        ToggleButton tbutton16 = findViewById(R.id.gpiot16);
        tbutton16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio16on")).start();
                } else {
                    new Thread(new workerThread("gpio16off")).start();
                }
            }
        });

        ToggleButton tbutton17 = findViewById(R.id.gpiot17);
        tbutton17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio17on")).start();
                } else {
                    new Thread(new workerThread("gpio17off")).start();
                }
            }
        });

        ToggleButton tbutton18 = findViewById(R.id.gpiot18);
        tbutton18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio18on")).start();
                } else {
                    new Thread(new workerThread("gpio18off")).start();
                }
            }
        });

        ToggleButton tbutton19 = findViewById(R.id.gpiot19);
        tbutton19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio19on")).start();
                } else {
                    new Thread(new workerThread("gpio19off")).start();
                }
            }
        });

        ToggleButton tbutton20 = findViewById(R.id.gpiot20);
        tbutton20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio20on")).start();
                } else {
                    new Thread(new workerThread("gpio20off")).start();
                }
            }
        });

        ToggleButton tbutton21 = findViewById(R.id.gpiot21);
        tbutton21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio21on")).start();
                } else {
                    new Thread(new workerThread("gpio21off")).start();
                }
            }
        });

        ToggleButton tbutton22 = findViewById(R.id.gpiot22);
        tbutton22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio22on")).start();
                } else {
                    new Thread(new workerThread("gpio22off")).start();
                }
            }
        });

        ToggleButton tbutton23 = findViewById(R.id.gpiot23);
        tbutton23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio23on")).start();
                } else {
                    new Thread(new workerThread("gpio23off")).start();
                }
            }
        });

        ToggleButton tbutton24 = findViewById(R.id.gpiot24);
        tbutton24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio24on")).start();
                } else {
                    new Thread(new workerThread("gpio24off")).start();
                }
            }
        });

        ToggleButton tbutton25 = findViewById(R.id.gpiot25);
        tbutton25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio25on")).start();
                } else {
                    new Thread(new workerThread("gpio25off")).start();
                }
            }
        });

        ToggleButton tbutton26 = findViewById(R.id.gpiot26);
        tbutton26.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new Thread(new workerThread("gpio26on")).start();
                } else {
                    new Thread(new workerThread("gpio26off")).start();
                }
            }
        });


        Set<BluetoothDevice> pairedDevices = mBluetoothAdapter.getBondedDevices();
        if (pairedDevices.size() > 0) {
            for (BluetoothDevice device : pairedDevices) {
                if (device.getName().equals("PiConnect")) // you will need to change this to match the name of your device
                {
                    Log.e("PiConnect", device.getName());
                    mmDevice = device;
                }
            }
        }
    }

    public void sendBtMsg(String msg2send) {

        UUID uuid = UUID.fromString("f57f47cf-bf8e-4834-b5be-1b93fa33f756"); //Standard SerialPortService ID, change for your device

        try {
            mmSocket = mmDevice.createInsecureRfcommSocketToServiceRecord(uuid);
            if (!mmSocket.isConnected()) {
                mmSocket.connect();
            }

            String msg = msg2send;
            OutputStream mmOutputStream = mmSocket.getOutputStream();
            mmOutputStream.write(msg.getBytes());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }


}