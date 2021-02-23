package no.nordicsemi.android.mesh.sensorutils;

import java.nio.ByteBuffer;
import java.util.Arrays;

import androidx.annotation.NonNull;

import static java.nio.ByteOrder.BIG_ENDIAN;

public class Temperature8 extends DevicePropertyCharacteristic<Float> {
    public Temperature8(@NonNull final byte[] data, final int offset) {
        super(data, offset);
        this.value = (float) ByteBuffer.wrap(Arrays.copyOfRange(data, offset, offset + getLength())).order(BIG_ENDIAN).getShort();
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int getLength() {
        return 1;
    }

    @Override
    public Float getValue() {
        return value;
    }
}
