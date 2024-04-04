/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.herumi.bls;

public class PublicKey {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PublicKey(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PublicKey obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BlsJNI.delete_PublicKey(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PublicKey() {
    this(BlsJNI.new_PublicKey__SWIG_0(), true);
  }

  public PublicKey(PublicKey rhs) {
    this(BlsJNI.new_PublicKey__SWIG_1(PublicKey.getCPtr(rhs), rhs), true);
  }

  public boolean equals(PublicKey rhs) {
    return BlsJNI.PublicKey_equals(swigCPtr, this, PublicKey.getCPtr(rhs), rhs);
  }

  public boolean isZero() {
    return BlsJNI.PublicKey_isZero(swigCPtr, this);
  }

  public void setStr(String str) {
    BlsJNI.PublicKey_setStr(swigCPtr, this, str);
  }

  public void clear() {
    BlsJNI.PublicKey_clear(swigCPtr, this);
  }

  public String toString() {
    return BlsJNI.PublicKey_toString(swigCPtr, this);
  }

  public void deserialize(byte[] cbuf) {
    BlsJNI.PublicKey_deserialize(swigCPtr, this, cbuf);
  }

  public byte[] serialize() { return BlsJNI.PublicKey_serialize(swigCPtr, this); }

  public void add(PublicKey rhs) {
    BlsJNI.PublicKey_add(swigCPtr, this, PublicKey.getCPtr(rhs), rhs);
  }

  public void sub(PublicKey rhs) {
    BlsJNI.PublicKey_sub(swigCPtr, this, PublicKey.getCPtr(rhs), rhs);
  }

  public void mul(SecretKey rhs) {
    BlsJNI.PublicKey_mul(swigCPtr, this, SecretKey.getCPtr(rhs), rhs);
  }

  public void neg() {
    BlsJNI.PublicKey_neg(swigCPtr, this);
  }

  public void share(PublicKeyVec secVec, SecretKey id) {
    BlsJNI.PublicKey_share(swigCPtr, this, PublicKeyVec.getCPtr(secVec), secVec, SecretKey.getCPtr(id), id);
  }

  public void recover(PublicKeyVec secVec, SecretKeyVec idVec) {
    BlsJNI.PublicKey_recover(swigCPtr, this, PublicKeyVec.getCPtr(secVec), secVec, SecretKeyVec.getCPtr(idVec), idVec);
  }

}