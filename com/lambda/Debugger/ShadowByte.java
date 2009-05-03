/*                        ShadowByte.java

  Copyright 2003, Bil Lewis

  This program is free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation; either version 2 of the License, or
  (at your option) any later version.
  
  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.
  
  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA   
*/

package com.lambda.Debugger;

public class ShadowByte implements ShadowPrimitive {
    private static int			MAX = 256;
    private static ShadowByte[] 		canonical = new ShadowByte[MAX];
    static {for (int i=-(MAX/2); i < MAX/2; i++) canonical[i+MAX/2] = new ShadowByte((byte)i);}

    private byte value;
    private String printString;

  ShadowByte(byte i) {
    value = i;
  }

  public static ShadowByte createShadowByte(byte b) {
    return canonical[b+MAX/2];
  }

  public String toString() {
    char c = (char)value;
    return "'" + c + "' ("+ value + ")";  // + " == 0x" + Integer.toHexString(0x0000FFFF & value).toUpperCase();;
  }
  public byte byteValue() {
    return value;
  }
    public Class getType() {return byte.class;}

}
