package com.williballenthin.rejistry;

import java.nio.ByteBuffer;

public class LFRecord extends DirectSubkeyListRecord {
    public static final String MAGIC = "lf";

    /**
     * @throws RegistryParseException if the magic header is not the ASCII string "lf".
     */
    public LFRecord(ByteBuffer buf, int offset) throws RegistryParseException {
        super(buf, offset, 0x8);

        if (!this.getMagic().equals(LFRecord.MAGIC)) {
            throw new RegistryParseException("LFRecord invalid magic header, expected \"lf\", got: " + this.getMagic());
        }
    }
}
