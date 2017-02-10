package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Ufixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link org.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Ufixed72x128 extends Ufixed {
  public static final Ufixed72x128 DEFAULT = new Ufixed72x128(BigInteger.ZERO);

  public Ufixed72x128(BigInteger value) {
    super(72, 128, value);
  }

  public Ufixed72x128(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
    super(72, 128, m, n);
  }
}