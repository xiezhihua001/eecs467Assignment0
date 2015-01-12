/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package eecs467.lcmtypes;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class maebot_motor_feedback_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public int encoder_left_ticks;
    public int encoder_right_ticks;
    public int motor_current_left;
    public int motor_current_right;
    public float motor_left_commanded_speed;
    public float motor_right_commanded_speed;
    public float motor_left_actual_speed;
    public float motor_right_actual_speed;
 
    public maebot_motor_feedback_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0xc6e2d0147e5217fcL;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(eecs467.lcmtypes.maebot_motor_feedback_t.class))
            return 0L;
 
        classes.add(eecs467.lcmtypes.maebot_motor_feedback_t.class);
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
 
        outs.writeInt(this.encoder_left_ticks); 
 
        outs.writeInt(this.encoder_right_ticks); 
 
        outs.writeInt(this.motor_current_left); 
 
        outs.writeInt(this.motor_current_right); 
 
        outs.writeFloat(this.motor_left_commanded_speed); 
 
        outs.writeFloat(this.motor_right_commanded_speed); 
 
        outs.writeFloat(this.motor_left_actual_speed); 
 
        outs.writeFloat(this.motor_right_actual_speed); 
 
    }
 
    public maebot_motor_feedback_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public maebot_motor_feedback_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static eecs467.lcmtypes.maebot_motor_feedback_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        eecs467.lcmtypes.maebot_motor_feedback_t o = new eecs467.lcmtypes.maebot_motor_feedback_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.utime = ins.readLong();
 
        this.encoder_left_ticks = ins.readInt();
 
        this.encoder_right_ticks = ins.readInt();
 
        this.motor_current_left = ins.readInt();
 
        this.motor_current_right = ins.readInt();
 
        this.motor_left_commanded_speed = ins.readFloat();
 
        this.motor_right_commanded_speed = ins.readFloat();
 
        this.motor_left_actual_speed = ins.readFloat();
 
        this.motor_right_actual_speed = ins.readFloat();
 
    }
 
    public eecs467.lcmtypes.maebot_motor_feedback_t copy()
    {
        eecs467.lcmtypes.maebot_motor_feedback_t outobj = new eecs467.lcmtypes.maebot_motor_feedback_t();
        outobj.utime = this.utime;
 
        outobj.encoder_left_ticks = this.encoder_left_ticks;
 
        outobj.encoder_right_ticks = this.encoder_right_ticks;
 
        outobj.motor_current_left = this.motor_current_left;
 
        outobj.motor_current_right = this.motor_current_right;
 
        outobj.motor_left_commanded_speed = this.motor_left_commanded_speed;
 
        outobj.motor_right_commanded_speed = this.motor_right_commanded_speed;
 
        outobj.motor_left_actual_speed = this.motor_left_actual_speed;
 
        outobj.motor_right_actual_speed = this.motor_right_actual_speed;
 
        return outobj;
    }
 
}

