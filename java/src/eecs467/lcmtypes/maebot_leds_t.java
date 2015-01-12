/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package eecs467.lcmtypes;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class maebot_leds_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public int top_rgb_led_left;
    public int top_rgb_led_right;
    public boolean bottom_led_left;
    public boolean bottom_led_middle;
    public boolean bottom_led_right;
    public boolean line_sensor_leds;
 
    public maebot_leds_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0xef3c45edcb6dd02aL;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(eecs467.lcmtypes.maebot_leds_t.class))
            return 0L;
 
        classes.add(eecs467.lcmtypes.maebot_leds_t.class);
        long hash = LCM_FINGERPRINT_BASE
            ;
        classes.remove(classes.size() - 1);
        return (hash<<1) + ((hash>>63)&1);
    }
 
    public void encode(DataOutput outs) throws IOException
    {
        outs.writeLong(LCM_FINGERPRINT);
        _encodeRecursive(outs);
    }
 
    public void _encodeRecursive(DataOutput outs) throws IOException
    {
        outs.writeLong(this.utime); 
 
        outs.writeInt(this.top_rgb_led_left); 
 
        outs.writeInt(this.top_rgb_led_right); 
 
        outs.writeByte( this.bottom_led_left ? 1 : 0); 
 
        outs.writeByte( this.bottom_led_middle ? 1 : 0); 
 
        outs.writeByte( this.bottom_led_right ? 1 : 0); 
 
        outs.writeByte( this.line_sensor_leds ? 1 : 0); 
 
    }
 
    public maebot_leds_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public maebot_leds_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static eecs467.lcmtypes.maebot_leds_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        eecs467.lcmtypes.maebot_leds_t o = new eecs467.lcmtypes.maebot_leds_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.utime = ins.readLong();
 
        this.top_rgb_led_left = ins.readInt();
 
        this.top_rgb_led_right = ins.readInt();
 
        this.bottom_led_left = ins.readByte()!=0;
 
        this.bottom_led_middle = ins.readByte()!=0;
 
        this.bottom_led_right = ins.readByte()!=0;
 
        this.line_sensor_leds = ins.readByte()!=0;
 
    }
 
    public eecs467.lcmtypes.maebot_leds_t copy()
    {
        eecs467.lcmtypes.maebot_leds_t outobj = new eecs467.lcmtypes.maebot_leds_t();
        outobj.utime = this.utime;
 
        outobj.top_rgb_led_left = this.top_rgb_led_left;
 
        outobj.top_rgb_led_right = this.top_rgb_led_right;
 
        outobj.bottom_led_left = this.bottom_led_left;
 
        outobj.bottom_led_middle = this.bottom_led_middle;
 
        outobj.bottom_led_right = this.bottom_led_right;
 
        outobj.line_sensor_leds = this.line_sensor_leds;
 
        return outobj;
    }
 
}

