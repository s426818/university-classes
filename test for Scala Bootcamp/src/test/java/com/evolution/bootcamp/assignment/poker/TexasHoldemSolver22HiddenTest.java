
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver22HiddenTest {


  @Test
  public void test_texas_holdem_5500_2d4dAdJhQs_5sQc_6s5d() {
    assertEquals(
      "6s5d 5sQc",
      Solver.process("texas-holdem 2d4dAdJhQs 5sQc 6s5d"));
  }

  @Test
  public void test_texas_holdem_5501_3d3h3s5dAh_2h8c_9dKd() {
    assertEquals(
      "2h8c 9dKd",
      Solver.process("texas-holdem 3d3h3s5dAh 2h8c 9dKd"));
  }

  @Test
  public void test_texas_holdem_5502_3s9sJcQsTc_5hJd_5s2c() {
    assertEquals(
      "5s2c 5hJd",
      Solver.process("texas-holdem 3s9sJcQsTc 5hJd 5s2c"));
  }

  @Test
  public void test_texas_holdem_5503_5s6h8dAhJh_3dAd_5h9c_KhJs_3sTd_Th3h_7d3c() {
    assertEquals(
      "7d3c 3sTd 5h9c KhJs 3dAd Th3h",
      Solver.process("texas-holdem 5s6h8dAhJh 3dAd 5h9c KhJs 3sTd Th3h 7d3c"));
  }

  @Test
  public void test_texas_holdem_5504_7sJhKhKsTd_4c4d_Qc9h_6c2h_5c3h_7h2s_7d5s_7c9d() {
    assertEquals(
      "5c3h=6c2h 4c4d 7c9d=7d5s=7h2s Qc9h",
      Solver.process("texas-holdem 7sJhKhKsTd 4c4d Qc9h 6c2h 5c3h 7h2s 7d5s 7c9d"));
  }

  @Test
  public void test_texas_holdem_5505_2c3s9sAhJs_9c7d_Qs4c_QdJh() {
    assertEquals(
      "Qs4c 9c7d QdJh",
      Solver.process("texas-holdem 2c3s9sAhJs 9c7d Qs4c QdJh"));
  }

  @Test
  public void test_texas_holdem_5506_4c4s8sKdQs_6s6c_QhKs_6dKh() {
    assertEquals(
      "6s6c 6dKh QhKs",
      Solver.process("texas-holdem 4c4s8sKdQs 6s6c QhKs 6dKh"));
  }

  @Test
  public void test_texas_holdem_5507_2c5s9cAhJs_4sKd_8cAd_9hQd_6h3d_8dTh_Tc2s_Kc4c() {
    assertEquals(
      "6h3d 8dTh 4sKd=Kc4c Tc2s 9hQd 8cAd",
      Solver.process("texas-holdem 2c5s9cAhJs 4sKd 8cAd 9hQd 6h3d 8dTh Tc2s Kc4c"));
  }

  @Test
  public void test_texas_holdem_5508_5c8s9cJhJs_6h2s_4d2d_5d7s_3h7d_Kd6s_2hAc_3d5h_3s9d_9s4s() {
    assertEquals(
      "4d2d 6h2s 3h7d Kd6s 2hAc 3d5h=5d7s 3s9d=9s4s",
      Solver.process("texas-holdem 5c8s9cJhJs 6h2s 4d2d 5d7s 3h7d Kd6s 2hAc 3d5h 3s9d 9s4s"));
  }

  @Test
  public void test_texas_holdem_5509_5h8hKhKsQh_KdAh_2d5c_Ac3c_8cAd_As6c() {
    assertEquals(
      "Ac3c=As6c 2d5c 8cAd KdAh",
      Solver.process("texas-holdem 5h8hKhKsQh KdAh 2d5c Ac3c 8cAd As6c"));
  }

  @Test
  public void test_texas_holdem_5510_7s8c8dJcTh_9d2h_6dQs_3d3c_9sTc_Ac7d_Qh6s_5s4c_2c5d_2d8h() {
    assertEquals(
      "2c5d=5s4c 6dQs=Qh6s 3d3c Ac7d 2d8h 9d2h=9sTc",
      Solver.process("texas-holdem 7s8c8dJcTh 9d2h 6dQs 3d3c 9sTc Ac7d Qh6s 5s4c 2c5d 2d8h"));
  }

  @Test
  public void test_texas_holdem_5511_2d6h8sQdQs_3s5c_7d8h_JcKd_9s4c_2hJs_Tc8d_4hKh_7sTd() {
    assertEquals(
      "3s5c 9s4c 7sTd 4hKh JcKd 2hJs 7d8h Tc8d",
      Solver.process("texas-holdem 2d6h8sQdQs 3s5c 7d8h JcKd 9s4c 2hJs Tc8d 4hKh 7sTd"));
  }

  @Test
  public void test_texas_holdem_5512_3c8d9hJhQc_Kh6s_3h2s_4h2d_9c7d_4d3s_QdQh_9sTs_4s3d_6cAh() {
    assertEquals(
      "4h2d Kh6s 6cAh 3h2s=4d3s=4s3d 9c7d QdQh 9sTs",
      Solver.process("texas-holdem 3c8d9hJhQc Kh6s 3h2s 4h2d 9c7d 4d3s QdQh 9sTs 4s3d 6cAh"));
  }

  @Test
  public void test_texas_holdem_5513_5c6d6h8cTc_Td4d_Qh9h_7hJc_As4c_TsAc_2dAh_7c4s() {
    assertEquals(
      "7hJc Qh9h 2dAh=As4c Td4d TsAc 7c4s",
      Solver.process("texas-holdem 5c6d6h8cTc Td4d Qh9h 7hJc As4c TsAc 2dAh 7c4s"));
  }

  @Test
  public void test_texas_holdem_5514_4s6h8c9sTh_7hTc_2hTd_Qh7d_9c2s_Ad6s_3s7s_Jh9h() {
    assertEquals(
      "Ad6s 9c2s Jh9h 2hTd 3s7s=7hTc=Qh7d",
      Solver.process("texas-holdem 4s6h8c9sTh 7hTc 2hTd Qh7d 9c2s Ad6s 3s7s Jh9h"));
  }

  @Test
  public void test_texas_holdem_5515_3s8h9cQdTs_JcAc_5d2c_3hJd_7c4h_4cKc_Qh5s_2s6c_4d4s_KhAs() {
    assertEquals(
      "5d2c 2s6c 7c4h 4cKc KhAs 4d4s Qh5s 3hJd=JcAc",
      Solver.process("texas-holdem 3s8h9cQdTs JcAc 5d2c 3hJd 7c4h 4cKc Qh5s 2s6c 4d4s KhAs"));
  }

  @Test
  public void test_texas_holdem_5516_2d3h3sKcTs_Tc6d_9hQd_9dTh_4c6s_9s3c_7cKs() {
    assertEquals(
      "4c6s 9hQd 9dTh=Tc6d 7cKs 9s3c",
      Solver.process("texas-holdem 2d3h3sKcTs Tc6d 9hQd 9dTh 4c6s 9s3c 7cKs"));
  }

  @Test
  public void test_texas_holdem_5517_2d5c5s6c8h_4sJh_TcQs_Jc6d_3sKd_KcAh_Qd4d_2c4c_Td3c() {
    assertEquals(
      "Td3c 4sJh Qd4d TcQs 3sKd KcAh 2c4c Jc6d",
      Solver.process("texas-holdem 2d5c5s6c8h 4sJh TcQs Jc6d 3sKd KcAh Qd4d 2c4c Td3c"));
  }

  @Test
  public void test_texas_holdem_5518_2dAsKdKhQh_7dTc_6sTd_9d4c_7h8c_5hKc_5s9c_Ad2c() {
    assertEquals(
      "7h8c 5s9c=9d4c 6sTd=7dTc Ad2c 5hKc",
      Solver.process("texas-holdem 2dAsKdKhQh 7dTc 6sTd 9d4c 7h8c 5hKc 5s9c Ad2c"));
  }

  @Test
  public void test_texas_holdem_5519_2s5c6d8sAc_7c9h_4dAh() {
    assertEquals(
      "4dAh 7c9h",
      Solver.process("texas-holdem 2s5c6d8sAc 7c9h 4dAh"));
  }

  @Test
  public void test_texas_holdem_5520_2d3h8dAsQh_Jc2c_4c6c_5hAd_7h9d_7sTh_Ks9s_6d8c() {
    assertEquals(
      "4c6c 7h9d 7sTh Ks9s Jc2c 6d8c 5hAd",
      Solver.process("texas-holdem 2d3h8dAsQh Jc2c 4c6c 5hAd 7h9d 7sTh Ks9s 6d8c"));
  }

  @Test
  public void test_texas_holdem_5521_3s5dJhKdKs_3d3c_Ad9h_2dJd_7dQs_3h9d() {
    assertEquals(
      "7dQs Ad9h 3h9d 2dJd 3d3c",
      Solver.process("texas-holdem 3s5dJhKdKs 3d3c Ad9h 2dJd 7dQs 3h9d"));
  }

  @Test
  public void test_texas_holdem_5522_3d6c7c7dTc_3cTh_3s2s_Jd5c_Ah9d() {
    assertEquals(
      "Jd5c Ah9d 3s2s 3cTh",
      Solver.process("texas-holdem 3d6c7c7dTc 3cTh 3s2s Jd5c Ah9d"));
  }

  @Test
  public void test_texas_holdem_5523_4c5s8cJcKs_As9c_7sJs_Kc4s_6h9s_3c2h_Ad5h_9dQh() {
    assertEquals(
      "3c2h 6h9s 9dQh As9c Ad5h 7sJs Kc4s",
      Solver.process("texas-holdem 4c5s8cJcKs As9c 7sJs Kc4s 6h9s 3c2h Ad5h 9dQh"));
  }

  @Test
  public void test_texas_holdem_5524_3c4h5hQhTc_Kd8h_KsKh_JsJd_AdAh_8s7h() {
    assertEquals(
      "8s7h Kd8h JsJd KsKh AdAh",
      Solver.process("texas-holdem 3c4h5hQhTc Kd8h KsKh JsJd AdAh 8s7h"));
  }

  @Test
  public void test_texas_holdem_5525_2c2d7dJhQh_Js9d_7h7c_9cAc_3hTh_8s9h_Ts8h_3sJd_AdKh_Qd2s() {
    assertEquals(
      "8s9h 3hTh=Ts8h 9cAc AdKh 3sJd=Js9d Qd2s 7h7c",
      Solver.process("texas-holdem 2c2d7dJhQh Js9d 7h7c 9cAc 3hTh 8s9h Ts8h 3sJd AdKh Qd2s"));
  }

  @Test
  public void test_texas_holdem_5526_2h6d9dQdTh_As5s_7d2d_Td4s_KdQh() {
    assertEquals(
      "As5s Td4s KdQh 7d2d",
      Solver.process("texas-holdem 2h6d9dQdTh As5s 7d2d Td4s KdQh"));
  }

  @Test
  public void test_texas_holdem_5527_2s7c8h8sTh_9dTs_QcKh() {
    assertEquals(
      "QcKh 9dTs",
      Solver.process("texas-holdem 2s7c8h8sTh 9dTs QcKh"));
  }

  @Test
  public void test_texas_holdem_5528_2d7s9sKsQs_9c2c_Qc4h_Ts3s() {
    assertEquals(
      "Qc4h 9c2c Ts3s",
      Solver.process("texas-holdem 2d7s9sKsQs 9c2c Qc4h Ts3s"));
  }

  @Test
  public void test_texas_holdem_5529_2c2s3s4c6d_8d9h_6sQc_7h7c_5h3h() {
    assertEquals(
      "8d9h 6sQc 7h7c 5h3h",
      Solver.process("texas-holdem 2c2s3s4c6d 8d9h 6sQc 7h7c 5h3h"));
  }

  @Test
  public void test_texas_holdem_5530_3c5s9c9dQh_9sTs_KhQd_AdAh_Qc6s_2dKd_8d7h_4hTd_Qs8h() {
    assertEquals(
      "8d7h 4hTd 2dKd Qc6s Qs8h KhQd AdAh 9sTs",
      Solver.process("texas-holdem 3c5s9c9dQh 9sTs KhQd AdAh Qc6s 2dKd 8d7h 4hTd Qs8h"));
  }

  @Test
  public void test_texas_holdem_5531_3h5h7c7sAh_KsKc_8s9s_6hTs_3d3c_8c4d_2hAc_QcQs_5c9d_4s9h() {
    assertEquals(
      "8c4d 4s9h 8s9s 6hTs 5c9d QcQs KsKc 2hAc 3d3c",
      Solver.process("texas-holdem 3h5h7c7sAh KsKc 8s9s 6hTs 3d3c 8c4d 2hAc QcQs 5c9d 4s9h"));
  }

  @Test
  public void test_texas_holdem_5532_2h8h9hAsJh_5dTd_Ac8s_3cQs_Ks4c_9c5s_6cQc_2s5h_Jc7h() {
    assertEquals(
      "5dTd 3cQs=6cQc Ks4c 9c5s Ac8s 2s5h Jc7h",
      Solver.process("texas-holdem 2h8h9hAsJh 5dTd Ac8s 3cQs Ks4c 9c5s 6cQc 2s5h Jc7h"));
  }

  @Test
  public void test_texas_holdem_5533_3d6c9h9sQh_4d9d_8s7s_3s7h_JdKd_7d5h_8h7c() {
    assertEquals(
      "7d5h 8h7c=8s7s JdKd 3s7h 4d9d",
      Solver.process("texas-holdem 3d6c9h9sQh 4d9d 8s7s 3s7h JdKd 7d5h 8h7c"));
  }

  @Test
  public void test_texas_holdem_5534_2h2s9c9sJh_3d5s_Ac3c_Jc3s() {
    assertEquals(
      "3d5s Ac3c Jc3s",
      Solver.process("texas-holdem 2h2s9c9sJh 3d5s Ac3c Jc3s"));
  }

  @Test
  public void test_texas_holdem_5535_8dAhKcKhQd_7h4s_6s9c_9d5d_8h2s() {
    assertEquals(
      "7h4s 6s9c=9d5d 8h2s",
      Solver.process("texas-holdem 8dAhKcKhQd 7h4s 6s9c 9d5d 8h2s"));
  }

  @Test
  public void test_texas_holdem_5536_4c4d6d9sTs_Ad3d_Td7s_Js8h_2s6c() {
    assertEquals(
      "Js8h Ad3d 2s6c Td7s",
      Solver.process("texas-holdem 4c4d6d9sTs Ad3d Td7s Js8h 2s6c"));
  }

  @Test
  public void test_texas_holdem_5537_6c8c9h9sTc_4c5c_As2c_8dTd_2h7c() {
    assertEquals(
      "As2c 8dTd 2h7c 4c5c",
      Solver.process("texas-holdem 6c8c9h9sTc 4c5c As2c 8dTd 2h7c"));
  }

  @Test
  public void test_texas_holdem_5538_3c4c7sKdTc_9h5d_AdJc_4s2d_9c5h_2hKs_6h4h() {
    assertEquals(
      "9c5h=9h5d AdJc 4s2d=6h4h 2hKs",
      Solver.process("texas-holdem 3c4c7sKdTc 9h5d AdJc 4s2d 9c5h 2hKs 6h4h"));
  }

  @Test
  public void test_texas_holdem_5539_3c3s5d6cAh_5cQs_7h7c_2h7d_5hKs_Ts8s_2dTd_4dQd_2c8h_Ac9h() {
    assertEquals(
      "2h7d 2c8h 2dTd Ts8s 4dQd 5cQs=5hKs 7h7c Ac9h",
      Solver.process("texas-holdem 3c3s5d6cAh 5cQs 7h7c 2h7d 5hKs Ts8s 2dTd 4dQd 2c8h Ac9h"));
  }

  @Test
  public void test_texas_holdem_5540_2h4s5h7hJs_8dJd_As3c_7dKc_AcTd_7s4c_9hTc_7c2d_TsQs() {
    assertEquals(
      "9hTc TsQs AcTd 7dKc 8dJd 7c2d 7s4c As3c",
      Solver.process("texas-holdem 2h4s5h7hJs 8dJd As3c 7dKc AcTd 7s4c 9hTc 7c2d TsQs"));
  }

  @Test
  public void test_texas_holdem_5541_5c7cAsKcKd_5sTh_Td7d_Qc4d_AhKs_2d3d_2cKh_4cJh_2h8d() {
    assertEquals(
      "2d3d 2h8d 4cJh Qc4d 5sTh Td7d 2cKh AhKs",
      Solver.process("texas-holdem 5c7cAsKcKd 5sTh Td7d Qc4d AhKs 2d3d 2cKh 4cJh 2h8d"));
  }

  @Test
  public void test_texas_holdem_5542_6dKdTdThTs_2d4c_2h5h_As8c_Qs6h_Kc7s_2s8h_7c2c() {
    assertEquals(
      "2d4c=2h5h 7c2c 2s8h As8c Qs6h Kc7s",
      Solver.process("texas-holdem 6dKdTdThTs 2d4c 2h5h As8c Qs6h Kc7s 2s8h 7c2c"));
  }

  @Test
  public void test_texas_holdem_5543_2c5h7d7h8c_3h5c_KdQc_6s2s() {
    assertEquals(
      "KdQc 6s2s 3h5c",
      Solver.process("texas-holdem 2c5h7d7h8c 3h5c KdQc 6s2s"));
  }

  @Test
  public void test_texas_holdem_5544_3c5h8d9dKs_Kc9s_Kd7c_4c5d_4s2c() {
    assertEquals(
      "4s2c 4c5d Kd7c Kc9s",
      Solver.process("texas-holdem 3c5h8d9dKs Kc9s Kd7c 4c5d 4s2c"));
  }

  @Test
  public void test_texas_holdem_5545_3h3s8d9dAd_6sTs_8cTh() {
    assertEquals(
      "6sTs 8cTh",
      Solver.process("texas-holdem 3h3s8d9dAd 6sTs 8cTh"));
  }

  @Test
  public void test_texas_holdem_5546_3d3h6h7cKd_5h8c_6cAs_2d4h_2h3c_5cTc_7s4s() {
    assertEquals(
      "2d4h 5h8c 5cTc 6cAs 7s4s 2h3c",
      Solver.process("texas-holdem 3d3h6h7cKd 5h8c 6cAs 2d4h 2h3c 5cTc 7s4s"));
  }

  @Test
  public void test_texas_holdem_5547_4h5c6d6sQc_4sQh_7hJc_KdAd() {
    assertEquals(
      "7hJc KdAd 4sQh",
      Solver.process("texas-holdem 4h5c6d6sQc 4sQh 7hJc KdAd"));
  }

  @Test
  public void test_texas_holdem_5548_4s7s8d9cJd_5h9h_5c7d_4hJs_Tc3d_Qc4d_Ks8s_2cKh() {
    assertEquals(
      "2cKh Qc4d 5c7d Ks8s 5h9h 4hJs Tc3d",
      Solver.process("texas-holdem 4s7s8d9cJd 5h9h 5c7d 4hJs Tc3d Qc4d Ks8s 2cKh"));
  }

  @Test
  public void test_texas_holdem_5549_3h4c6s7s8s_8d2c_As8h_Th6c_JcQc_Jh7h_9c4s_7dQs_6d3s_2sJd() {
    assertEquals(
      "2sJd JcQc 9c4s Th6c Jh7h 7dQs 8d2c As8h 6d3s",
      Solver.process("texas-holdem 3h4c6s7s8s 8d2c As8h Th6c JcQc Jh7h 9c4s 7dQs 6d3s 2sJd"));
  }

  @Test
  public void test_texas_holdem_5550_4s7cJcKcQd_TdKs_Ac8d_7h3d_Th9s() {
    assertEquals(
      "Ac8d 7h3d TdKs Th9s",
      Solver.process("texas-holdem 4s7cJcKcQd TdKs Ac8d 7h3d Th9s"));
  }

  @Test
  public void test_texas_holdem_5551_2h6h9hJsQh_4sAh_2s9s_7h7s_QdJh_3c3s_KsJd_5s8h_TdKc() {
    assertEquals(
      "3c3s KsJd 2s9s TdKc 7h7s 5s8h QdJh 4sAh",
      Solver.process("texas-holdem 2h6h9hJsQh 4sAh 2s9s 7h7s QdJh 3c3s KsJd 5s8h TdKc"));
  }

  @Test
  public void test_texas_holdem_5552_7c7dAdJsTs_Td6h_5h3c() {
    assertEquals(
      "5h3c Td6h",
      Solver.process("texas-holdem 7c7dAdJsTs Td6h 5h3c"));
  }

  @Test
  public void test_texas_holdem_5553_3h3sKsQhTs_9d4d_5s5d_Kd7s_5hKc_Td3d_As8s() {
    assertEquals(
      "9d4d 5s5d 5hKc=Kd7s As8s Td3d",
      Solver.process("texas-holdem 3h3sKsQhTs 9d4d 5s5d Kd7s 5hKc Td3d As8s"));
  }

  @Test
  public void test_texas_holdem_5554_5h6d9sJcKd_4d8h_KsTd_8s5s() {
    assertEquals(
      "4d8h 8s5s KsTd",
      Solver.process("texas-holdem 5h6d9sJcKd 4d8h KsTd 8s5s"));
  }

  @Test
  public void test_texas_holdem_5555_2c2h6s7dAc_8d5d_8s6h_ThAh_Jc3s_Kc8h_JsQh_3d2d_5s3h() {
    assertEquals(
      "5s3h 8d5d Jc3s JsQh Kc8h 8s6h ThAh 3d2d",
      Solver.process("texas-holdem 2c2h6s7dAc 8d5d 8s6h ThAh Jc3s Kc8h JsQh 3d2d 5s3h"));
  }

  @Test
  public void test_texas_holdem_5556_4c7s9cAhJc_3d6d_Tc2s_KdQh_Th8h_Qd8s_6s8c() {
    assertEquals(
      "3d6d 6s8c Tc2s Qd8s KdQh Th8h",
      Solver.process("texas-holdem 4c7s9cAhJc 3d6d Tc2s KdQh Th8h Qd8s 6s8c"));
  }

  @Test
  public void test_texas_holdem_5557_7d7sAsJcKc_7c5c_3h6d() {
    assertEquals(
      "3h6d 7c5c",
      Solver.process("texas-holdem 7d7sAsJcKc 7c5c 3h6d"));
  }

  @Test
  public void test_texas_holdem_5558_3d6dAsKsTs_9c7s_6h8c_KhAd_JhKc_5c4h_Ah2c() {
    assertEquals(
      "5c4h 9c7s 6h8c JhKc Ah2c KhAd",
      Solver.process("texas-holdem 3d6dAsKsTs 9c7s 6h8c KhAd JhKc 5c4h Ah2c"));
  }

  @Test
  public void test_texas_holdem_5559_5s6c9cAdQs_5h3d_TcQh_6s3s_AhJs() {
    assertEquals(
      "5h3d 6s3s TcQh AhJs",
      Solver.process("texas-holdem 5s6c9cAdQs 5h3d TcQh 6s3s AhJs"));
  }

  @Test
  public void test_texas_holdem_5560_4h6h7sQdQh_5c3c_Jd3s_8s7h_9sTs_Jc9d_QcJs_Ah7d_ThKc_AcKs() {
    assertEquals(
      "9sTs Jd3s Jc9d ThKc AcKs 8s7h Ah7d QcJs 5c3c",
      Solver.process("texas-holdem 4h6h7sQdQh 5c3c Jd3s 8s7h 9sTs Jc9d QcJs Ah7d ThKc AcKs"));
  }

  @Test
  public void test_texas_holdem_5561_3s7s8cQcTh_Ad7c_4h2s_6sTs_Qs7d() {
    assertEquals(
      "4h2s Ad7c 6sTs Qs7d",
      Solver.process("texas-holdem 3s7s8cQcTh Ad7c 4h2s 6sTs Qs7d"));
  }

  @Test
  public void test_texas_holdem_5562_9hAhKhTdTh_8dJd_7c8s_Qh6d_3dQs_4h6c() {
    assertEquals(
      "7c8s 8dJd 3dQs 4h6c Qh6d",
      Solver.process("texas-holdem 9hAhKhTdTh 8dJd 7c8s Qh6d 3dQs 4h6c"));
  }

  @Test
  public void test_texas_holdem_5563_3s4s6d8dJc_7h8c_7sTc_4cJs() {
    assertEquals(
      "7sTc 7h8c 4cJs",
      Solver.process("texas-holdem 3s4s6d8dJc 7h8c 7sTc 4cJs"));
  }

  @Test
  public void test_texas_holdem_5564_2h6s7dQdQh_9h5c_2dQs_TcTh() {
    assertEquals(
      "9h5c TcTh 2dQs",
      Solver.process("texas-holdem 2h6s7dQdQh 9h5c 2dQs TcTh"));
  }

  @Test
  public void test_texas_holdem_5565_3c7s9dQdTc_3hKc_8d6h() {
    assertEquals(
      "3hKc 8d6h",
      Solver.process("texas-holdem 3c7s9dQdTc 3hKc 8d6h"));
  }

  @Test
  public void test_texas_holdem_5566_5s6dAcJhTh_3h5d_2c7s_2sJd_8d6s_9hJs_4sKh() {
    assertEquals(
      "2c7s 4sKh 3h5d 8d6s 2sJd 9hJs",
      Solver.process("texas-holdem 5s6dAcJhTh 3h5d 2c7s 2sJd 8d6s 9hJs 4sKh"));
  }

  @Test
  public void test_texas_holdem_5567_6d7h9dJsTd_4c4s_AdKh_AsJh() {
    assertEquals(
      "AdKh 4c4s AsJh",
      Solver.process("texas-holdem 6d7h9dJsTd 4c4s AdKh AsJh"));
  }

  @Test
  public void test_texas_holdem_5568_5d6d9hJsTd_8sJc_8hTc_AhKd_3h9d_Qd3s_8dJd_6c2s_7s5h() {
    assertEquals(
      "Qd3s AhKd 7s5h 6c2s 3h9d 8hTc 8sJc 8dJd",
      Solver.process("texas-holdem 5d6d9hJsTd 8sJc 8hTc AhKd 3h9d Qd3s 8dJd 6c2s 7s5h"));
  }

  @Test
  public void test_texas_holdem_5569_2c3c3h8sAd_6h6s_Qs9d_4sTd_Kc4c_5h9c_8c4h_2dJc_Tc6d() {
    assertEquals(
      "5h9c 4sTd=Tc6d Qs9d Kc4c 2dJc 6h6s 8c4h",
      Solver.process("texas-holdem 2c3c3h8sAd 6h6s Qs9d 4sTd Kc4c 5h9c 8c4h 2dJc Tc6d"));
  }

  @Test
  public void test_texas_holdem_5570_5s6h8hAcTs_Kc2s_9s5d_4hTc() {
    assertEquals(
      "Kc2s 9s5d 4hTc",
      Solver.process("texas-holdem 5s6h8hAcTs Kc2s 9s5d 4hTc"));
  }

  @Test
  public void test_texas_holdem_5571_2c5c5h7sTc_8d4h_QcKd() {
    assertEquals(
      "8d4h QcKd",
      Solver.process("texas-holdem 2c5c5h7sTc 8d4h QcKd"));
  }

  @Test
  public void test_texas_holdem_5572_3hAdJsKcTc_JhQc_TsJd_AcJc() {
    assertEquals(
      "TsJd AcJc JhQc",
      Solver.process("texas-holdem 3hAdJsKcTc JhQc TsJd AcJc"));
  }

  @Test
  public void test_texas_holdem_5573_6c6h7d8cQs_As8d_2sTd_Jc4c_7sQh_Ks2c() {
    assertEquals(
      "2sTd Jc4c Ks2c As8d 7sQh",
      Solver.process("texas-holdem 6c6h7d8cQs As8d 2sTd Jc4c 7sQh Ks2c"));
  }

  @Test
  public void test_texas_holdem_5574_3d8c9sKhTs_7sAc_7cTh_5s2c() {
    assertEquals(
      "5s2c 7sAc 7cTh",
      Solver.process("texas-holdem 3d8c9sKhTs 7sAc 7cTh 5s2c"));
  }

  @Test
  public void test_texas_holdem_5575_3d8c8s9dAh_7dJh_7s6h_KhAd() {
    assertEquals(
      "7s6h 7dJh KhAd",
      Solver.process("texas-holdem 3d8c8s9dAh 7dJh 7s6h KhAd"));
  }

  @Test
  public void test_texas_holdem_5576_7c7h8d8sKh_TcAc_5sQh_3sJh_As3h_7sKc_4dKd() {
    assertEquals(
      "3sJh=5sQh As3h=TcAc 4dKd 7sKc",
      Solver.process("texas-holdem 7c7h8d8sKh TcAc 5sQh 3sJh As3h 7sKc 4dKd"));
  }

  @Test
  public void test_texas_holdem_5577_4h8dJhKsQh_Ad8c_9c5d_7s3s_5s6s_6h8s_4cTd_7dTc() {
    assertEquals(
      "5s6s 7s3s 9c5d 7dTc 4cTd 6h8s Ad8c",
      Solver.process("texas-holdem 4h8dJhKsQh Ad8c 9c5d 7s3s 5s6s 6h8s 4cTd 7dTc"));
  }

  @Test
  public void test_texas_holdem_5578_2c3d3h6dQh_Tc8s_KhQc_Qs6c_Ac7c_Ah3s() {
    assertEquals(
      "Tc8s Ac7c KhQc Qs6c Ah3s",
      Solver.process("texas-holdem 2c3d3h6dQh Tc8s KhQc Qs6c Ac7c Ah3s"));
  }

  @Test
  public void test_texas_holdem_5579_4c4s9sKdKs_JdQh_Ad2s_8s8c_Jc3s_7s3c_Kh6c_6dAc_5d5c_AhKc() {
    assertEquals(
      "7s3c Jc3s JdQh 6dAc=Ad2s 5d5c 8s8c AhKc=Kh6c",
      Solver.process("texas-holdem 4c4s9sKdKs JdQh Ad2s 8s8c Jc3s 7s3c Kh6c 6dAc 5d5c AhKc"));
  }

  @Test
  public void test_texas_holdem_5580_4s5d7sJdJs_3s8h_ThAs_8sTs() {
    assertEquals(
      "3s8h ThAs 8sTs",
      Solver.process("texas-holdem 4s5d7sJdJs 3s8h ThAs 8sTs"));
  }

  @Test
  public void test_texas_holdem_5581_5h6sAsJhJs_AdJd_Ks6h_2cQd_5d8d_7c7h() {
    assertEquals(
      "2cQd 5d8d Ks6h 7c7h AdJd",
      Solver.process("texas-holdem 5h6sAsJhJs AdJd Ks6h 2cQd 5d8d 7c7h"));
  }

  @Test
  public void test_texas_holdem_5582_2c3h5c7c9c_Qc7h_QdKh_9dTh_AhAd_KcJc_8s6d_Qs7s() {
    assertEquals(
      "QdKh Qs7s 9dTh AhAd 8s6d Qc7h KcJc",
      Solver.process("texas-holdem 2c3h5c7c9c Qc7h QdKh 9dTh AhAd KcJc 8s6d Qs7s"));
  }

  @Test
  public void test_texas_holdem_5583_3d4hJdQhTd_AdQd_Qc9c_5c9d_TcTs_6hJs() {
    assertEquals(
      "5c9d 6hJs Qc9c TcTs AdQd",
      Solver.process("texas-holdem 3d4hJdQhTd AdQd Qc9c 5c9d TcTs 6hJs"));
  }

  @Test
  public void test_texas_holdem_5584_2d3s5s8s9c_Qc7d_2s4h_5hTd_2hQh() {
    assertEquals(
      "Qc7d 2s4h 2hQh 5hTd",
      Solver.process("texas-holdem 2d3s5s8s9c Qc7d 2s4h 5hTd 2hQh"));
  }

  @Test
  public void test_texas_holdem_5585_3s5h9c9dJc_Kc6s_Qs8d() {
    assertEquals(
      "Qs8d Kc6s",
      Solver.process("texas-holdem 3s5h9c9dJc Kc6s Qs8d"));
  }

  @Test
  public void test_texas_holdem_5586_2d6c6d7sTh_5s4d_8c5h_5cJc_4sTc_QcQd() {
    assertEquals(
      "5s4d 8c5h 5cJc 4sTc QcQd",
      Solver.process("texas-holdem 2d6c6d7sTh 5s4d 8c5h 5cJc 4sTc QcQd"));
  }

  @Test
  public void test_texas_holdem_5587_2c3h6c9dKh_Jc6h_9c7s_Qd5h_Ts3c() {
    assertEquals(
      "Qd5h Ts3c Jc6h 9c7s",
      Solver.process("texas-holdem 2c3h6c9dKh Jc6h 9c7s Qd5h Ts3c"));
  }

  @Test
  public void test_texas_holdem_5588_5h8cAcJhKd_JsQs_7c5s_6d4s_9d2c() {
    assertEquals(
      "6d4s 9d2c 7c5s JsQs",
      Solver.process("texas-holdem 5h8cAcJhKd JsQs 7c5s 6d4s 9d2c"));
  }

  @Test
  public void test_texas_holdem_5589_4h5c6d7dJh_6sQh_8h4s_9d7c_QsKc_6h2d_5dTd_Qc9h_Jd4d() {
    assertEquals(
      "Qc9h QsKc 5dTd 6h2d 6sQh 9d7c Jd4d 8h4s",
      Solver.process("texas-holdem 4h5c6d7dJh 6sQh 8h4s 9d7c QsKc 6h2d 5dTd Qc9h Jd4d"));
  }

  @Test
  public void test_texas_holdem_5590_4d5hJsQsTd_6d8c_8sAh_6c5s() {
    assertEquals(
      "6d8c 8sAh 6c5s",
      Solver.process("texas-holdem 4d5hJsQsTd 6d8c 8sAh 6c5s"));
  }

  @Test
  public void test_texas_holdem_5591_5d6s7dQcTs_9h8s_2s3s_8h9d() {
    assertEquals(
      "2s3s 8h9d=9h8s",
      Solver.process("texas-holdem 5d6s7dQcTs 9h8s 2s3s 8h9d"));
  }

  @Test
  public void test_texas_holdem_5592_3h6h6s7c8s_ThKc_AhTc_2h3d_5s7d_Kd2c() {
    assertEquals(
      "Kd2c ThKc AhTc 2h3d 5s7d",
      Solver.process("texas-holdem 3h6h6s7c8s ThKc AhTc 2h3d 5s7d Kd2c"));
  }

  @Test
  public void test_texas_holdem_5593_5h7hJhKcKd_6h5d_As4c_2h4d_2sQd_Js6s_9c8d_7d3d() {
    assertEquals(
      "2h4d 9c8d 2sQd As4c 6h5d 7d3d Js6s",
      Solver.process("texas-holdem 5h7hJhKcKd 6h5d As4c 2h4d 2sQd Js6s 9c8d 7d3d"));
  }

  @Test
  public void test_texas_holdem_5594_4c6c9dKdTs_Td7h_Qh4s_Ks6d_ThJh_2d6h_9s9h_Qd2h() {
    assertEquals(
      "Qd2h Qh4s 2d6h Td7h ThJh Ks6d 9s9h",
      Solver.process("texas-holdem 4c6c9dKdTs Td7h Qh4s Ks6d ThJh 2d6h 9s9h Qd2h"));
  }

  @Test
  public void test_texas_holdem_5595_2d3c7c8sQh_JdKs_9h6h_7hAc_Js2c_QcJh_9cKc_2h6s_8hTd_4sQs() {
    assertEquals(
      "9h6h 9cKc JdKs 2h6s Js2c 7hAc 8hTd 4sQs QcJh",
      Solver.process("texas-holdem 2d3c7c8sQh JdKs 9h6h 7hAc Js2c QcJh 9cKc 2h6s 8hTd 4sQs"));
  }

  @Test
  public void test_texas_holdem_5596_5s9sAhKhQc_4s5c_Kc9h_7c4c_6s3s_8s3d() {
    assertEquals(
      "6s3s 7c4c 8s3d 4s5c Kc9h",
      Solver.process("texas-holdem 5s9sAhKhQc 4s5c Kc9h 7c4c 6s3s 8s3d"));
  }

  @Test
  public void test_texas_holdem_5597_3s4h7c9sKs_6c6h_QhTs_5sAc_QcKc_QdJc_5cAd_8h8c() {
    assertEquals(
      "QhTs QdJc 5cAd=5sAc 6c6h 8h8c QcKc",
      Solver.process("texas-holdem 3s4h7c9sKs 6c6h QhTs 5sAc QcKc QdJc 5cAd 8h8c"));
  }

  @Test
  public void test_texas_holdem_5598_2c3c5s7hJc_8dJs_KhJh_QdKd_8c4h_9dTc_2h5d_5cTd() {
    assertEquals(
      "8c4h 9dTc QdKd 5cTd 8dJs KhJh 2h5d",
      Solver.process("texas-holdem 2c3c5s7hJc 8dJs KhJh QdKd 8c4h 9dTc 2h5d 5cTd"));
  }

  @Test
  public void test_texas_holdem_5599_3d4s7c8dTh_7d3h_8sTc() {
    assertEquals(
      "7d3h 8sTc",
      Solver.process("texas-holdem 3d4s7c8dTh 7d3h 8sTc"));
  }

  @Test
  public void test_texas_holdem_5600_2d4hAhQhTs_7hTh_6hKh_Tc4s_Ad9h() {
    assertEquals(
      "Ad9h Tc4s 7hTh 6hKh",
      Solver.process("texas-holdem 2d4hAhQhTs 7hTh 6hKh Tc4s Ad9h"));
  }

  @Test
  public void test_texas_holdem_5601_2h5d5hQcQs_9sKs_3cQd_8hKh_5cAd() {
    assertEquals(
      "8hKh=9sKs 5cAd 3cQd",
      Solver.process("texas-holdem 2h5d5hQcQs 9sKs 3cQd 8hKh 5cAd"));
  }

  @Test
  public void test_texas_holdem_5602_2c3c8sJdKc_7cTc_Ts2d_5d7h_AsTh_3hQh_6s5s_7s9d_6c7d_6h5h() {
    assertEquals(
      "6h5h=6s5s 5d7h 6c7d 7s9d AsTh Ts2d 3hQh 7cTc",
      Solver.process("texas-holdem 2c3c8sJdKc 7cTc Ts2d 5d7h AsTh 3hQh 6s5s 7s9d 6c7d 6h5h"));
  }

  @Test
  public void test_texas_holdem_5603_3d6d7c7h8d_5s6h_3s2c_2h8c_2sKc_3h9h() {
    assertEquals(
      "2sKc 3s2c 3h9h 5s6h 2h8c",
      Solver.process("texas-holdem 3d6d7c7h8d 5s6h 3s2c 2h8c 2sKc 3h9h"));
  }

  @Test
  public void test_texas_holdem_5604_2s4h9sAdJd_6hQc_4s3d_5h3s_3h8s_3c8d_7cTd_Kc9h() {
    assertEquals(
      "3c8d=3h8s 7cTd 6hQc 4s3d Kc9h 5h3s",
      Solver.process("texas-holdem 2s4h9sAdJd 6hQc 4s3d 5h3s 3h8s 3c8d 7cTd Kc9h"));
  }

  @Test
  public void test_texas_holdem_5605_4h7h8d8sTd_2sJd_2cQc_7s3s_6cQs_5hKh_5s7d_8cTc_6s5c() {
    assertEquals(
      "2sJd 2cQc=6cQs 5hKh 5s7d=7s3s 6s5c 8cTc",
      Solver.process("texas-holdem 4h7h8d8sTd 2sJd 2cQc 7s3s 6cQs 5hKh 5s7d 8cTc 6s5c"));
  }

  @Test
  public void test_texas_holdem_5606_5c8hAcKcTc_6c2s_6h2d_7c7s_Jc7d_3s3c() {
    assertEquals(
      "6h2d 3s3c 6c2s 7c7s Jc7d",
      Solver.process("texas-holdem 5c8hAcKcTc 6c2s 6h2d 7c7s Jc7d 3s3c"));
  }

  @Test
  public void test_texas_holdem_5607_2d4dKdKsTs_KcTd_8dAd_5d4h() {
    assertEquals(
      "5d4h 8dAd KcTd",
      Solver.process("texas-holdem 2d4dKdKsTs KcTd 8dAd 5d4h"));
  }

  @Test
  public void test_texas_holdem_5608_2d5d6d8cQs_Js5h_2sTc_3cTd_5s9d_2cKc_7s4h_5cTh() {
    assertEquals(
      "3cTd 2sTc 2cKc 5s9d 5cTh Js5h 7s4h",
      Solver.process("texas-holdem 2d5d6d8cQs Js5h 2sTc 3cTd 5s9d 2cKc 7s4h 5cTh"));
  }

  @Test
  public void test_texas_holdem_5609_3s7cAcJdQc_8h6c_Kd4d_TdJh_3hJc_9cKs_Ts5c() {
    assertEquals(
      "8h6c Ts5c Kd4d 9cKs TdJh 3hJc",
      Solver.process("texas-holdem 3s7cAcJdQc 8h6c Kd4d TdJh 3hJc 9cKs Ts5c"));
  }

  @Test
  public void test_texas_holdem_5610_2d6s8sJsQs_2sAh_7cTh_4c8d_3sAc_6cQc_4s3c_Ts2h_Qh5c() {
    assertEquals(
      "7cTh 4c8d Qh5c 6cQc 2sAh 3sAc 4s3c Ts2h",
      Solver.process("texas-holdem 2d6s8sJsQs 2sAh 7cTh 4c8d 3sAc 6cQc 4s3c Ts2h Qh5c"));
  }

  @Test
  public void test_texas_holdem_5611_9c9hAdAsQc_QsKs_3c2c_8cTh() {
    assertEquals(
      "3c2c=8cTh QsKs",
      Solver.process("texas-holdem 9c9hAdAsQc QsKs 3c2c 8cTh"));
  }

  @Test
  public void test_texas_holdem_5612_3c3hJcJdJs_Kd8s_3d5s_Ah4d() {
    assertEquals(
      "3d5s=Ah4d=Kd8s",
      Solver.process("texas-holdem 3c3hJcJdJs Kd8s 3d5s Ah4d"));
  }

  @Test
  public void test_texas_holdem_5613_3c6s7sAcKs_2h4d_Jc6c_Th6h_3d8h_2s3s() {
    assertEquals(
      "2h4d 3d8h Th6h Jc6c 2s3s",
      Solver.process("texas-holdem 3c6s7sAcKs 2h4d Jc6c Th6h 3d8h 2s3s"));
  }

  @Test
  public void test_texas_holdem_5614_2c2h6h7sJd_Tc9s_4c4s_7dKs() {
    assertEquals(
      "Tc9s 4c4s 7dKs",
      Solver.process("texas-holdem 2c2h6h7sJd Tc9s 4c4s 7dKs"));
  }

  @Test
  public void test_texas_holdem_5615_3s6hAsTcTh_9d5h_2cQd_5d7d_3dKd_2h4h() {
    assertEquals(
      "2h4h 5d7d 9d5h 2cQd 3dKd",
      Solver.process("texas-holdem 3s6hAsTcTh 9d5h 2cQd 5d7d 3dKd 2h4h"));
  }

  @Test
  public void test_texas_holdem_5616_2d5c5dKsQc_QsAc_3d9c_5h8s_Qd2s_Js8h() {
    assertEquals(
      "3d9c Js8h Qd2s QsAc 5h8s",
      Solver.process("texas-holdem 2d5c5dKsQc QsAc 3d9c 5h8s Qd2s Js8h"));
  }

  @Test
  public void test_texas_holdem_5617_2d3c4hKsQd_Jd9d_9sQs() {
    assertEquals(
      "Jd9d 9sQs",
      Solver.process("texas-holdem 2d3c4hKsQd Jd9d 9sQs"));
  }

  @Test
  public void test_texas_holdem_5618_3c3d6c8sQs_7d4d_7cTc_9dJs() {
    assertEquals(
      "7d4d 7cTc 9dJs",
      Solver.process("texas-holdem 3c3d6c8sQs 7d4d 7cTc 9dJs"));
  }

  @Test
  public void test_texas_holdem_5619_3h8hAdJdTs_Kh4h_Jh9c_9d8d_6dAc_5dJs_5h2c_4dTd_6s3s_7d4c() {
    assertEquals(
      "5h2c 7d4c Kh4h 6s3s 9d8d 4dTd 5dJs Jh9c 6dAc",
      Solver.process("texas-holdem 3h8hAdJdTs Kh4h Jh9c 9d8d 6dAc 5dJs 5h2c 4dTd 6s3s 7d4c"));
  }

  @Test
  public void test_texas_holdem_5620_3c4d7hAdTc_2h3s_JsTd_8cQc_8s3d_6h9d_3hQh() {
    assertEquals(
      "6h9d 8cQc 2h3s 8s3d 3hQh JsTd",
      Solver.process("texas-holdem 3c4d7hAdTc 2h3s JsTd 8cQc 8s3d 6h9d 3hQh"));
  }

  @Test
  public void test_texas_holdem_5621_3d5h8d9sAh_4s9c_TdAd() {
    assertEquals(
      "4s9c TdAd",
      Solver.process("texas-holdem 3d5h8d9sAh 4s9c TdAd"));
  }

  @Test
  public void test_texas_holdem_5622_4d5s6s7sKh_Qd7h_3s4s_2dAs_TdAc_Ts8d_2cQc() {
    assertEquals(
      "2cQc 2dAs TdAc Qd7h Ts8d 3s4s",
      Solver.process("texas-holdem 4d5s6s7sKh Qd7h 3s4s 2dAs TdAc Ts8d 2cQc"));
  }

  @Test
  public void test_texas_holdem_5623_3d4c8hQhTh_Jh2h_TsTc_3h7c() {
    assertEquals(
      "3h7c TsTc Jh2h",
      Solver.process("texas-holdem 3d4c8hQhTh Jh2h TsTc 3h7c"));
  }

  @Test
  public void test_texas_holdem_5624_2c4h9hQcTh_Jh6d_5s3d_7s9c_AhKs_3sAs_QdJc_9d7d_6c7c() {
    assertEquals(
      "5s3d 6c7c Jh6d 3sAs AhKs 7s9c=9d7d QdJc",
      Solver.process("texas-holdem 2c4h9hQcTh Jh6d 5s3d 7s9c AhKs 3sAs QdJc 9d7d 6c7c"));
  }

  @Test
  public void test_texas_holdem_5625_2h5s7d7hQc_As7s_TdQd_KdQs_2cJh_Jd8s_8dKc_QhAd_6dKs_6s7c() {
    assertEquals(
      "Jd8s 6dKs 8dKc 2cJh TdQd KdQs QhAd 6s7c As7s",
      Solver.process("texas-holdem 2h5s7d7hQc As7s TdQd KdQs 2cJh Jd8s 8dKc QhAd 6dKs 6s7c"));
  }

  @Test
  public void test_texas_holdem_5626_2c3s6hJhKh_Kc3h_9sAd_KdQs_Td7s_9c4c_QdTh_4s2s_6d4d_6cAc() {
    assertEquals(
      "9c4c Td7s QdTh 9sAd 4s2s 6d4d 6cAc KdQs Kc3h",
      Solver.process("texas-holdem 2c3s6hJhKh Kc3h 9sAd KdQs Td7s 9c4c QdTh 4s2s 6d4d 6cAc"));
  }

  @Test
  public void test_texas_holdem_5627_4s5c8hJsKd_9s2d_8cTh_2c6d_7d4c_QhJd_2h6s() {
    assertEquals(
      "2c6d=2h6s 9s2d 7d4c 8cTh QhJd",
      Solver.process("texas-holdem 4s5c8hJsKd 9s2d 8cTh 2c6d 7d4c QhJd 2h6s"));
  }

  @Test
  public void test_texas_holdem_5628_4d7sKsTdTs_JcAd_9cKc_Qd2c() {
    assertEquals(
      "Qd2c JcAd 9cKc",
      Solver.process("texas-holdem 4d7sKsTdTs JcAd 9cKc Qd2c"));
  }

  @Test
  public void test_texas_holdem_5629_5d7cQcTcTd_2c8s_AdQd_8d4h_4c2d_JhAh_5c3c() {
    assertEquals(
      "4c2d 2c8s=8d4h JhAh AdQd 5c3c",
      Solver.process("texas-holdem 5d7cQcTcTd 2c8s AdQd 8d4h 4c2d JhAh 5c3c"));
  }

  @Test
  public void test_texas_holdem_5630_AcAsJdTcTh_8h6h_8c5h_8d7h_9s5c_Js6d() {
    assertEquals(
      "8c5h=8d7h=8h6h=9s5c Js6d",
      Solver.process("texas-holdem AcAsJdTcTh 8h6h 8c5h 8d7h 9s5c Js6d"));
  }

  @Test
  public void test_texas_holdem_5631_5d6d9cAcKh_8hJd_4dTs_9h2c_6sTd_4sAs_8c9s() {
    assertEquals(
      "4dTs 8hJd 6sTd 9h2c 8c9s 4sAs",
      Solver.process("texas-holdem 5d6d9cAcKh 8hJd 4dTs 9h2c 6sTd 4sAs 8c9s"));
  }

  @Test
  public void test_texas_holdem_5632_4c4d7s8dKc_Jc2s_9sKd_Jh7c_2d8c_5s2h_Jd6d_8sQs_3dTs() {
    assertEquals(
      "5s2h 3dTs Jc2s=Jd6d Jh7c 2d8c=8sQs 9sKd",
      Solver.process("texas-holdem 4c4d7s8dKc Jc2s 9sKd Jh7c 2d8c 5s2h Jd6d 8sQs 3dTs"));
  }

  @Test
  public void test_texas_holdem_5633_2h4h5sKcTd_As2c_4d3c_4c9h_8cQc_2s9s_QsKd_7d5d_3sAc_6c7s() {
    assertEquals(
      "6c7s 8cQc 2s9s As2c 4d3c 4c9h 7d5d QsKd 3sAc",
      Solver.process("texas-holdem 2h4h5sKcTd As2c 4d3c 4c9h 8cQc 2s9s QsKd 7d5d 3sAc 6c7s"));
  }

  @Test
  public void test_texas_holdem_5634_5c5s7c9c9h_Kc3s_7h5d_2hTc_AdJd_Qc6h_4hKd_3h8s() {
    assertEquals(
      "3h8s 2hTc Qc6h 4hKd=Kc3s AdJd 7h5d",
      Solver.process("texas-holdem 5c5s7c9c9h Kc3s 7h5d 2hTc AdJd Qc6h 4hKd 3h8s"));
  }

  @Test
  public void test_texas_holdem_5635_2d8sJcJhKh_5s7d_QsJd() {
    assertEquals(
      "5s7d QsJd",
      Solver.process("texas-holdem 2d8sJcJhKh 5s7d QsJd"));
  }

  @Test
  public void test_texas_holdem_5636_4s8d9hAsQd_Kh8s_2h3d_Jh3s_Qs4h_Kc3h_QhAd_4dKd_6sTs_7h2s() {
    assertEquals(
      "2h3d 7h2s 6sTs Jh3s Kc3h 4dKd Kh8s Qs4h QhAd",
      Solver.process("texas-holdem 4s8d9hAsQd Kh8s 2h3d Jh3s Qs4h Kc3h QhAd 4dKd 6sTs 7h2s"));
  }

  @Test
  public void test_texas_holdem_5637_2h5hAhKsTc_9s2d_JcTd_3sQh() {
    assertEquals(
      "3sQh 9s2d JcTd",
      Solver.process("texas-holdem 2h5hAhKsTc 9s2d JcTd 3sQh"));
  }

  @Test
  public void test_texas_holdem_5638_3s4sAsJsTh_TsQc_5h8c_7sQs_Ad4c_9cTc() {
    assertEquals(
      "5h8c 9cTc Ad4c TsQc 7sQs",
      Solver.process("texas-holdem 3s4sAsJsTh TsQc 5h8c 7sQs Ad4c 9cTc"));
  }

  @Test
  public void test_texas_holdem_5639_4c6s7h9hQd_5sJc_5c3c_5d2d_Kc7s_Jh7d_3d5h_9s2s_6d6h_Qc4d() {
    assertEquals(
      "5d2d 5sJc Jh7d Kc7s 9s2s Qc4d 6d6h 3d5h=5c3c",
      Solver.process("texas-holdem 4c6s7h9hQd 5sJc 5c3c 5d2d Kc7s Jh7d 3d5h 9s2s 6d6h Qc4d"));
  }

  @Test
  public void test_texas_holdem_5640_9h9sAsTdTh_3h7h_JhKc_4c2s_2dAd_4d2c_5cTs() {
    assertEquals(
      "3h7h=4c2s=4d2c=JhKc 2dAd 5cTs",
      Solver.process("texas-holdem 9h9sAsTdTh 3h7h JhKc 4c2s 2dAd 4d2c 5cTs"));
  }

  @Test
  public void test_texas_holdem_5641_3s7h9hAdQs_5d7c_5c4h_8d8h_4s8s_9c6s() {
    assertEquals(
      "5c4h 4s8s 5d7c 8d8h 9c6s",
      Solver.process("texas-holdem 3s7h9hAdQs 5d7c 5c4h 8d8h 4s8s 9c6s"));
  }

  @Test
  public void test_texas_holdem_5642_5s7sJhKhTd_Ks4s_5h2s_2c2h_8h8d_8cAc_Kc3c_4hAd() {
    assertEquals(
      "4hAd 8cAc 2c2h 5h2s 8h8d Kc3c=Ks4s",
      Solver.process("texas-holdem 5s7sJhKhTd Ks4s 5h2s 2c2h 8h8d 8cAc Kc3c 4hAd"));
  }

  @Test
  public void test_texas_holdem_5643_7d8cJcKcTs_8d5d_5s7s_9cKs_7cJd() {
    assertEquals(
      "5s7s 8d5d 7cJd 9cKs",
      Solver.process("texas-holdem 7d8cJcKcTs 8d5d 5s7s 9cKs 7cJd"));
  }

  @Test
  public void test_texas_holdem_5644_3d4d5c7sQs_AsKc_2cTc_Kd8c_7cQd_Th9c_Jc5h_7h6d_4c4h_2h3s() {
    assertEquals(
      "2cTc Th9c Kd8c AsKc 2h3s Jc5h 7cQd 4c4h 7h6d",
      Solver.process("texas-holdem 3d4d5c7sQs AsKc 2cTc Kd8c 7cQd Th9c Jc5h 7h6d 4c4h 2h3s"));
  }

  @Test
  public void test_texas_holdem_5645_2s4s7h8cTc_Kd5s_4h9s_KsTh_Ah6s() {
    assertEquals(
      "Kd5s Ah6s 4h9s KsTh",
      Solver.process("texas-holdem 2s4s7h8cTc Kd5s 4h9s KsTh Ah6s"));
  }

  @Test
  public void test_texas_holdem_5646_4c9cJhQhQs_5dAs_8s6c_Kd3c_8hQc_4h7d_AcTh_5h9d_Ts6d() {
    assertEquals(
      "8s6c Ts6d Kd3c 5dAs AcTh 4h7d 5h9d 8hQc",
      Solver.process("texas-holdem 4c9cJhQhQs 5dAs 8s6c Kd3c 8hQc 4h7d AcTh 5h9d Ts6d"));
  }

  @Test
  public void test_texas_holdem_5647_4h6s7sKcTd_2d8c_7hTs_8s3h() {
    assertEquals(
      "2d8c=8s3h 7hTs",
      Solver.process("texas-holdem 4h6s7sKcTd 2d8c 7hTs 8s3h"));
  }

  @Test
  public void test_texas_holdem_5648_2c2d4h9dQd_Qs5h_AcKh() {
    assertEquals(
      "AcKh Qs5h",
      Solver.process("texas-holdem 2c2d4h9dQd Qs5h AcKh"));
  }

  @Test
  public void test_texas_holdem_5649_3d4h8hAhKh_6c9c_2hKs_JhTs_ThAc_6sQd_Tc5h() {
    assertEquals(
      "6c9c 6sQd 2hKs Tc5h ThAc JhTs",
      Solver.process("texas-holdem 3d4h8hAhKh 6c9c 2hKs JhTs ThAc 6sQd Tc5h"));
  }

  @Test
  public void test_texas_holdem_5650_2h4d5d9cQs_Th7s_5h8c_6s6c_Ad9s_QcKs_JsTc() {
    assertEquals(
      "Th7s JsTc 5h8c 6s6c Ad9s QcKs",
      Solver.process("texas-holdem 2h4d5d9cQs Th7s 5h8c 6s6c Ad9s QcKs JsTc"));
  }

  @Test
  public void test_texas_holdem_5651_3h5d8dJhQh_Td2d_9s8h_Jd2h_8sKc_Js3d_2s3s_Ks9c_Ad9h_AsQs() {
    assertEquals(
      "Td2d Ks9c Ad9h 2s3s 9s8h 8sKc Jd2h AsQs Js3d",
      Solver.process("texas-holdem 3h5d8dJhQh Td2d 9s8h Jd2h 8sKc Js3d 2s3s Ks9c Ad9h AsQs"));
  }

  @Test
  public void test_texas_holdem_5652_2s3c7h9cAh_9h9d_JdKs_7s7c_3hTs_KhTh_6cJh_TcQd_7d6s() {
    assertEquals(
      "6cJh TcQd KhTh JdKs 3hTs 7d6s 7s7c 9h9d",
      Solver.process("texas-holdem 2s3c7h9cAh 9h9d JdKs 7s7c 3hTs KhTh 6cJh TcQd 7d6s"));
  }

  @Test
  public void test_texas_holdem_5653_6c6d6s7cAh_5sAd_5hTh_Tc8h() {
    assertEquals(
      "5hTh=Tc8h 5sAd",
      Solver.process("texas-holdem 6c6d6s7cAh 5sAd 5hTh Tc8h"));
  }

  @Test
  public void test_texas_holdem_5654_2s4s6sJcTc_6cJh_Kh5c_Js3h_2h9s_5dKd_2d3s() {
    assertEquals(
      "5dKd=Kh5c 2d3s 2h9s Js3h 6cJh",
      Solver.process("texas-holdem 2s4s6sJcTc 6cJh Kh5c Js3h 2h9s 5dKd 2d3s"));
  }

  @Test
  public void test_texas_holdem_5655_5h7d9dQsTc_2sJh_4sKs_JdKc_2dKd_Ad4d_Js9s() {
    assertEquals(
      "2sJh 2dKd=4sKs Ad4d Js9s JdKc",
      Solver.process("texas-holdem 5h7d9dQsTc 2sJh 4sKs JdKc 2dKd Ad4d Js9s"));
  }

  @Test
  public void test_texas_holdem_5656_3h4h5h9hQs_9d7d_AhKh_6c8h_4d3d_KcTd_6h5d() {
    assertEquals(
      "KcTd 9d7d 4d3d 6h5d 6c8h AhKh",
      Solver.process("texas-holdem 3h4h5h9hQs 9d7d AhKh 6c8h 4d3d KcTd 6h5d"));
  }

  @Test
  public void test_texas_holdem_5657_2d2s4h5d8c_ThAh_8dTd_JcAs_9d5c_6d7h_6h7d_Qc4s() {
    assertEquals(
      "ThAh JcAs Qc4s 9d5c 8dTd 6d7h=6h7d",
      Solver.process("texas-holdem 2d2s4h5d8c ThAh 8dTd JcAs 9d5c 6d7h 6h7d Qc4s"));
  }

  @Test
  public void test_texas_holdem_5658_6d9cAhQcQs_8cKd_5hQd_5dJs_KhAc_3dTh() {
    assertEquals(
      "3dTh 5dJs 8cKd KhAc 5hQd",
      Solver.process("texas-holdem 6d9cAhQcQs 8cKd 5hQd 5dJs KhAc 3dTh"));
  }

  @Test
  public void test_texas_holdem_5659_6c8hJsKsQc_Ad7c_6d8d_2s3c_6hKh_JhTs_7hAc_5h4s_Th3h_Jc5d() {
    assertEquals(
      "2s3c=5h4s Th3h 7hAc=Ad7c Jc5d JhTs 6d8d 6hKh",
      Solver.process("texas-holdem 6c8hJsKsQc Ad7c 6d8d 2s3c 6hKh JhTs 7hAc 5h4s Th3h Jc5d"));
  }

  @Test
  public void test_texas_holdem_5660_5h6s8h9dAc_9h8s_4sQh_2s6c_5cAs_8cTc() {
    assertEquals(
      "4sQh 2s6c 8cTc 9h8s 5cAs",
      Solver.process("texas-holdem 5h6s8h9dAc 9h8s 4sQh 2s6c 5cAs 8cTc"));
  }

  @Test
  public void test_texas_holdem_5661_3d3s5h8h9h_Qh9d_6c2c_8c4s_3hAs_Qs8s() {
    assertEquals(
      "6c2c 8c4s Qs8s Qh9d 3hAs",
      Solver.process("texas-holdem 3d3s5h8h9h Qh9d 6c2c 8c4s 3hAs Qs8s"));
  }

  @Test
  public void test_texas_holdem_5662_3h5h7cTdTs_Ad3c_8dJh_3sTc() {
    assertEquals(
      "8dJh Ad3c 3sTc",
      Solver.process("texas-holdem 3h5h7cTdTs Ad3c 8dJh 3sTc"));
  }

  @Test
  public void test_texas_holdem_5663_4c4s8sJcQs_8h6d_Td9c_9d7s() {
    assertEquals(
      "9d7s 8h6d Td9c",
      Solver.process("texas-holdem 4c4s8sJcQs 8h6d Td9c 9d7s"));
  }

  @Test
  public void test_texas_holdem_5664_3h4h7hAcJd_Th7d_6h6c_As5c_9cAd_5dJs_Qh3s_JhKc() {
    assertEquals(
      "Qh3s 6h6c Th7d 5dJs JhKc As5c 9cAd",
      Solver.process("texas-holdem 3h4h7hAcJd Th7d 6h6c As5c 9cAd 5dJs Qh3s JhKc"));
  }

  @Test
  public void test_texas_holdem_5665_2d3c7dKdQc_5d5s_4cKh_6hAh_Jd4h_As6c_3h5h_8h8s_Js7s() {
    assertEquals(
      "Jd4h 6hAh=As6c 3h5h 5d5s Js7s 8h8s 4cKh",
      Solver.process("texas-holdem 2d3c7dKdQc 5d5s 4cKh 6hAh Jd4h As6c 3h5h 8h8s Js7s"));
  }

  @Test
  public void test_texas_holdem_5666_3h3s7h9cTd_4dAh_2hKs_Kc4c_8d4s_6d9s() {
    assertEquals(
      "8d4s 2hKs=Kc4c 4dAh 6d9s",
      Solver.process("texas-holdem 3h3s7h9cTd 4dAh 2hKs Kc4c 8d4s 6d9s"));
  }

  @Test
  public void test_texas_holdem_5667_2d6c8dJsTc_4d7h_QsQc_2h5c_KcQh_5d3d_Td9h_6h9c() {
    assertEquals(
      "5d3d 4d7h KcQh 2h5c 6h9c Td9h QsQc",
      Solver.process("texas-holdem 2d6c8dJsTc 4d7h QsQc 2h5c KcQh 5d3d Td9h 6h9c"));
  }

  @Test
  public void test_texas_holdem_5668_2s5s7s8s9d_8dAc_7h5c_AhKs_5h8c_5dTh_9hQc_6d4h_2cJs_QsKc() {
    assertEquals(
      "5dTh 8dAc 9hQc 7h5c 5h8c 6d4h 2cJs QsKc AhKs",
      Solver.process("texas-holdem 2s5s7s8s9d 8dAc 7h5c AhKs 5h8c 5dTh 9hQc 6d4h 2cJs QsKc"));
  }

  @Test
  public void test_texas_holdem_5669_3c5d8sQcTd_ThAd_Jd7h_2s2c_KcAc() {
    assertEquals(
      "Jd7h KcAc 2s2c ThAd",
      Solver.process("texas-holdem 3c5d8sQcTd ThAd Jd7h 2s2c KcAc"));
  }

  @Test
  public void test_texas_holdem_5670_3d3s8cAsQd_5h6h_QcJs_2h2s_4d2c() {
    assertEquals(
      "4d2c=5h6h 2h2s QcJs",
      Solver.process("texas-holdem 3d3s8cAsQd 5h6h QcJs 2h2s 4d2c"));
  }

  @Test
  public void test_texas_holdem_5671_4c4h6c6d9h_7c8h_3dJd() {
    assertEquals(
      "7c8h 3dJd",
      Solver.process("texas-holdem 4c4h6c6d9h 7c8h 3dJd"));
  }

  @Test
  public void test_texas_holdem_5672_8s9dAhQhTc_KsJc_6dJs_7d3d_6s3h_5h7c() {
    assertEquals(
      "5h7c=6s3h=7d3d 6dJs KsJc",
      Solver.process("texas-holdem 8s9dAhQhTc KsJc 6dJs 7d3d 6s3h 5h7c"));
  }

  @Test
  public void test_texas_holdem_5673_4s6d7s8sJc_Jh2s_QdTc_QcQs_5c6s_Td3c_9h5d_6h8c_4cAh_4hJd() {
    assertEquals(
      "Td3c QdTc 4cAh Jh2s QcQs 6h8c 4hJd 5c6s 9h5d",
      Solver.process("texas-holdem 4s6d7s8sJc Jh2s QdTc QcQs 5c6s Td3c 9h5d 6h8c 4cAh 4hJd"));
  }

  @Test
  public void test_texas_holdem_5674_3h6c9hQhTs_9sTc_7dAs_KcJd_Ks6s_8dAc() {
    assertEquals(
      "7dAs 8dAc Ks6s 9sTc KcJd",
      Solver.process("texas-holdem 3h6c9hQhTs 9sTc 7dAs KcJd Ks6s 8dAc"));
  }

  @Test
  public void test_texas_holdem_5675_3h9dAdJdTc_5s7h_9h3c_4dKh_4s6h_KcQd_Jc2d_9c5h_Td6c_QsJh() {
    assertEquals(
      "4s6h 5s7h 4dKh 9c5h Td6c Jc2d QsJh 9h3c KcQd",
      Solver.process("texas-holdem 3h9dAdJdTc 5s7h 9h3c 4dKh 4s6h KcQd Jc2d 9c5h Td6c QsJh"));
  }

  @Test
  public void test_texas_holdem_5676_2d6d6h6sQs_9d7d_2s4d() {
    assertEquals(
      "9d7d 2s4d",
      Solver.process("texas-holdem 2d6d6h6sQs 9d7d 2s4d"));
  }

  @Test
  public void test_texas_holdem_5677_6c6h7dQdTd_Ks7s_QcKc() {
    assertEquals(
      "Ks7s QcKc",
      Solver.process("texas-holdem 6c6h7dQdTd Ks7s QcKc"));
  }

  @Test
  public void test_texas_holdem_5678_5h6d8s9sAs_8d3s_AhJd_4d3h() {
    assertEquals(
      "4d3h 8d3s AhJd",
      Solver.process("texas-holdem 5h6d8s9sAs 8d3s AhJd 4d3h"));
  }

  @Test
  public void test_texas_holdem_5679_7s8hJhQcTd_7cTh_JcAd_Ks4c_QsAc_Qd9c_3dAh_4s9d() {
    assertEquals(
      "Ks4c 3dAh JcAd QsAc 7cTh 4s9d=Qd9c",
      Solver.process("texas-holdem 7s8hJhQcTd 7cTh JcAd Ks4c QsAc Qd9c 3dAh 4s9d"));
  }

  @Test
  public void test_texas_holdem_5680_2s4h5s6s9h_3h8d_As8c_TcJh_Ad9d_Ts2d_4cTh_Kc7h() {
    assertEquals(
      "TcJh Kc7h As8c Ts2d 4cTh Ad9d 3h8d",
      Solver.process("texas-holdem 2s4h5s6s9h 3h8d As8c TcJh Ad9d Ts2d 4cTh Kc7h"));
  }

  @Test
  public void test_texas_holdem_5681_4s9cKsQcQs_Ac3d_6s2h_3sTh_9h2s_5c5d_Ah9s_5s3c_Td2c() {
    assertEquals(
      "5s3c 6s2h 3sTh=Td2c Ac3d 5c5d 9h2s Ah9s",
      Solver.process("texas-holdem 4s9cKsQcQs Ac3d 6s2h 3sTh 9h2s 5c5d Ah9s 5s3c Td2c"));
  }

  @Test
  public void test_texas_holdem_5682_2c3c3dJsKd_KsAc_7hKc_Qd3s_4d5c_6h2h_8h8d() {
    assertEquals(
      "4d5c 6h2h 8h8d 7hKc KsAc Qd3s",
      Solver.process("texas-holdem 2c3c3dJsKd KsAc 7hKc Qd3s 4d5c 6h2h 8h8d"));
  }

  @Test
  public void test_texas_holdem_5683_3c4c7hJhQh_Kh4s_3s2s_6sJc_5hQs_Js2c_TsAs_8h9s() {
    assertEquals(
      "8h9s TsAs 3s2s Kh4s Js2c 6sJc 5hQs",
      Solver.process("texas-holdem 3c4c7hJhQh Kh4s 3s2s 6sJc 5hQs Js2c TsAs 8h9s"));
  }

  @Test
  public void test_texas_holdem_5684_2d2h8hQdTc_5h3d_9hAd_4hJs() {
    assertEquals(
      "5h3d 4hJs 9hAd",
      Solver.process("texas-holdem 2d2h8hQdTc 5h3d 9hAd 4hJs"));
  }

  @Test
  public void test_texas_holdem_5685_2d7dAcTcTh_5h2c_AhKc_8dTs_9h9d_3hKs_6s2s() {
    assertEquals(
      "3hKs 5h2c=6s2s 9h9d AhKc 8dTs",
      Solver.process("texas-holdem 2d7dAcTcTh 5h2c AhKc 8dTs 9h9d 3hKs 6s2s"));
  }

  @Test
  public void test_texas_holdem_5686_3s7d8cQdTs_5dQc_6d7c() {
    assertEquals(
      "6d7c 5dQc",
      Solver.process("texas-holdem 3s7d8cQdTs 5dQc 6d7c"));
  }

  @Test
  public void test_texas_holdem_5687_3d6c6sQdQs_2c4s_TcKd() {
    assertEquals(
      "2c4s TcKd",
      Solver.process("texas-holdem 3d6c6sQdQs 2c4s TcKd"));
  }

  @Test
  public void test_texas_holdem_5688_5d7hJhKsTs_6d3s_5h8h() {
    assertEquals(
      "6d3s 5h8h",
      Solver.process("texas-holdem 5d7hJhKsTs 6d3s 5h8h"));
  }

  @Test
  public void test_texas_holdem_5689_2d6c8dAsKd_3s6d_Jh4h_3hAc_Th5c_Kc2h_2c9c_5s8c_8hJs() {
    assertEquals(
      "Th5c Jh4h 2c9c 3s6d 5s8c 8hJs 3hAc Kc2h",
      Solver.process("texas-holdem 2d6c8dAsKd 3s6d Jh4h 3hAc Th5c Kc2h 2c9c 5s8c 8hJs"));
  }

  @Test
  public void test_texas_holdem_5690_2c5d8cAsKd_Ad7d_JcAh_2s6h() {
    assertEquals(
      "2s6h Ad7d JcAh",
      Solver.process("texas-holdem 2c5d8cAsKd Ad7d JcAh 2s6h"));
  }

  @Test
  public void test_texas_holdem_5691_4d5h8d8hTd_4h3d_Ah3c_Ad5s_5cQs_9dJc_ThTc_6cJd_4c9s() {
    assertEquals(
      "6cJd 9dJc Ah3c 4c9s=4h3d 5cQs Ad5s ThTc",
      Solver.process("texas-holdem 4d5h8d8hTd 4h3d Ah3c Ad5s 5cQs 9dJc ThTc 6cJd 4c9s"));
  }

  @Test
  public void test_texas_holdem_5692_6c7s8dJhJs_4d5h_5s9d_Qc8s_Kc7h_5d2d_2cKd() {
    assertEquals(
      "5d2d 2cKd Kc7h Qc8s 4d5h 5s9d",
      Solver.process("texas-holdem 6c7s8dJhJs 4d5h 5s9d Qc8s Kc7h 5d2d 2cKd"));
  }

  @Test
  public void test_texas_holdem_5693_6h8c8sKcQc_2sTd_Jd2h_5hKs_6s8h_4hTh() {
    assertEquals(
      "2sTd=4hTh Jd2h 5hKs 6s8h",
      Solver.process("texas-holdem 6h8c8sKcQc 2sTd Jd2h 5hKs 6s8h 4hTh"));
  }

  @Test
  public void test_texas_holdem_5694_4h6c6dAhQc_6hAs_8d5s_5c9c_Qd8s_4s3c_3s8h() {
    assertEquals(
      "3s8h=8d5s 5c9c 4s3c Qd8s 6hAs",
      Solver.process("texas-holdem 4h6c6dAhQc 6hAs 8d5s 5c9c Qd8s 4s3c 3s8h"));
  }

  @Test
  public void test_texas_holdem_5695_3s4c9cAhQd_KhQs_8d6c_2d7s_5s3c_Jh2h_4d7h_KdTs_2s8c() {
    assertEquals(
      "2d7s 2s8c 8d6c Jh2h KdTs 5s3c 4d7h KhQs",
      Solver.process("texas-holdem 3s4c9cAhQd KhQs 8d6c 2d7s 5s3c Jh2h 4d7h KdTs 2s8c"));
  }

  @Test
  public void test_texas_holdem_5696_2s6c7cQhQs_3cKd_8dTh_3dTs_6hJs_8sQd_8c9h_9sKc_KsQc_2dAs() {
    assertEquals(
      "8c9h 3dTs 8dTh 3cKd 9sKc 2dAs 6hJs 8sQd KsQc",
      Solver.process("texas-holdem 2s6c7cQhQs 3cKd 8dTh 3dTs 6hJs 8sQd 8c9h 9sKc KsQc 2dAs"));
  }

  @Test
  public void test_texas_holdem_5697_8c9hJcJsQd_3c6s_4hTs_8d9d_9c3s_QcTh_Kc4s_AcAs_7hTc_Td2c() {
    assertEquals(
      "3c6s Kc4s 8d9d=9c3s AcAs 4hTs=7hTc=QcTh=Td2c",
      Solver.process("texas-holdem 8c9hJcJsQd 3c6s 4hTs 8d9d 9c3s QcTh Kc4s AcAs 7hTc Td2c"));
  }

  @Test
  public void test_texas_holdem_5698_4c4s6d9cTh_Ks5s_Jh8d_7h2s_3d3c_Kh7s_2cAc_8hJs_7dJc() {
    assertEquals(
      "7h2s 7dJc=8hJs=Jh8d Kh7s=Ks5s 2cAc 3d3c",
      Solver.process("texas-holdem 4c4s6d9cTh Ks5s Jh8d 7h2s 3d3c Kh7s 2cAc 8hJs 7dJc"));
  }

  @Test
  public void test_texas_holdem_5699_3s7s9hAsTh_7dJd_2d6c_9d4d_9sKd_Ad8c_4h2h() {
    assertEquals(
      "4h2h 2d6c 7dJd 9d4d 9sKd Ad8c",
      Solver.process("texas-holdem 3s7s9hAsTh 7dJd 2d6c 9d4d 9sKd Ad8c 4h2h"));
  }

  @Test
  public void test_texas_holdem_5700_4d7cJdThTs_3sKs_QcKh() {
    assertEquals(
      "3sKs QcKh",
      Solver.process("texas-holdem 4d7cJdThTs 3sKs QcKh"));
  }

  @Test
  public void test_texas_holdem_5701_3d3s8h8s9c_2c2d_Th3c_Ac4h_Kc8c_Qh8d_5sTd() {
    assertEquals(
      "2c2d 5sTd Ac4h Th3c Kc8c=Qh8d",
      Solver.process("texas-holdem 3d3s8h8s9c 2c2d Th3c Ac4h Kc8c Qh8d 5sTd"));
  }

  @Test
  public void test_texas_holdem_5702_4c4h7hAdJs_Qs2c_9cQd_5h2d_6d5d_5s9d_5c2s_3d6s_8cTd_Jd8d() {
    assertEquals(
      "3d6s=5c2s=5h2d=6d5d 5s9d 8cTd 9cQd=Qs2c Jd8d",
      Solver.process("texas-holdem 4c4h7hAdJs Qs2c 9cQd 5h2d 6d5d 5s9d 5c2s 3d6s 8cTd Jd8d"));
  }

  @Test
  public void test_texas_holdem_5703_3h4c7hAsKh_6s7d_3cKs_Qh2d_QcJs_8d9c_Ah5c() {
    assertEquals(
      "8d9c Qh2d QcJs 6s7d Ah5c 3cKs",
      Solver.process("texas-holdem 3h4c7hAsKh 6s7d 3cKs Qh2d QcJs 8d9c Ah5c"));
  }

  @Test
  public void test_texas_holdem_5704_7dAdJhKsQd_Tc6c_2h9c_Qc3s() {
    assertEquals(
      "2h9c Qc3s Tc6c",
      Solver.process("texas-holdem 7dAdJhKsQd Tc6c 2h9c Qc3s"));
  }

  @Test
  public void test_texas_holdem_5705_4s6d6h7sAd_5d5c_AcQc_5h3h() {
    assertEquals(
      "5d5c AcQc 5h3h",
      Solver.process("texas-holdem 4s6d6h7sAd 5d5c AcQc 5h3h"));
  }

  @Test
  public void test_texas_holdem_5706_3c4d4hQcTd_Ad8c_QsTh_4s7s_2d6c_JdQh_8hJh_3s9c_8dJs_9d5d() {
    assertEquals(
      "2d6c 9d5d 8dJs=8hJh Ad8c 3s9c JdQh QsTh 4s7s",
      Solver.process("texas-holdem 3c4d4hQcTd Ad8c QsTh 4s7s 2d6c JdQh 8hJh 3s9c 8dJs 9d5d"));
  }

  @Test
  public void test_texas_holdem_5707_2hAsKsQhTs_AdKd_AcTh_TdAh() {
    assertEquals(
      "AcTh=TdAh AdKd",
      Solver.process("texas-holdem 2hAsKsQhTs AdKd AcTh TdAh"));
  }

  @Test
  public void test_texas_holdem_5708_5d7h8sAdKd_9c2h_7dQs() {
    assertEquals(
      "9c2h 7dQs",
      Solver.process("texas-holdem 5d7h8sAdKd 9c2h 7dQs"));
  }

  @Test
  public void test_texas_holdem_5709_5c6hJcQhTc_Ac6s_Kh4c_2d4s_3d2s_4d9h_8cTh_Kc8d() {
    assertEquals(
      "2d4s=3d2s 4d9h Kh4c Kc8d Ac6s 8cTh",
      Solver.process("texas-holdem 5c6hJcQhTc Ac6s Kh4c 2d4s 3d2s 4d9h 8cTh Kc8d"));
  }

  @Test
  public void test_texas_holdem_5710_2d4c8cQdQs_5cTh_3cTd_Ad9c_4sTs_Ks3h_Js9h_4d2s_6s9s() {
    assertEquals(
      "6s9s 3cTd 5cTh Js9h Ks3h Ad9c 4d2s 4sTs",
      Solver.process("texas-holdem 2d4c8cQdQs 5cTh 3cTd Ad9c 4sTs Ks3h Js9h 4d2s 6s9s"));
  }

  @Test
  public void test_texas_holdem_5711_2d8c8s9dJh_Kh2s_5hQd_Qs6h_Jc7c_2c7h_4h8d_QhAs() {
    assertEquals(
      "5hQd=Qs6h QhAs 2c7h Kh2s Jc7c 4h8d",
      Solver.process("texas-holdem 2d8c8s9dJh Kh2s 5hQd Qs6h Jc7c 2c7h 4h8d QhAs"));
  }

  @Test
  public void test_texas_holdem_5712_2s3c3h5hKs_5d3d_KdJh_KhAd_5sJc_Ts6c_Jd4c_Qc6s() {
    assertEquals(
      "Ts6c Jd4c Qc6s 5sJc KdJh KhAd 5d3d",
      Solver.process("texas-holdem 2s3c3h5hKs 5d3d KdJh KhAd 5sJc Ts6c Jd4c Qc6s"));
  }

  @Test
  public void test_texas_holdem_5713_5s6h7dAcTc_Js2c_KsTh_7sJh_QdKh_8sTs_9h3s_Kd4c_Qc4h() {
    assertEquals(
      "9h3s Js2c Qc4h Kd4c QdKh 7sJh 8sTs KsTh",
      Solver.process("texas-holdem 5s6h7dAcTc Js2c KsTh 7sJh QdKh 8sTs 9h3s Kd4c Qc4h"));
  }

  @Test
  public void test_texas_holdem_5714_2h6c7hTcTh_KsJs_4cTd_3h6d_Jd6h_5hJh_7c8c_Ts9d() {
    assertEquals(
      "KsJs 3h6d Jd6h 7c8c 4cTd Ts9d 5hJh",
      Solver.process("texas-holdem 2h6c7hTcTh KsJs 4cTd 3h6d Jd6h 5hJh 7c8c Ts9d"));
  }

  @Test
  public void test_texas_holdem_5715_4c8cKdQdQh_JdKs_AhTc_6cTs_As9c_7s8h_Jc7c_9d4h() {
    assertEquals(
      "6cTs Jc7c As9c AhTc 9d4h 7s8h JdKs",
      Solver.process("texas-holdem 4c8cKdQdQh JdKs AhTc 6cTs As9c 7s8h Jc7c 9d4h"));
  }

  @Test
  public void test_texas_holdem_5716_2h6h7hJdKh_4h4c_QcKd_6s3h_3s4d_8h9d() {
    assertEquals(
      "3s4d QcKd 6s3h 4h4c 8h9d",
      Solver.process("texas-holdem 2h6h7hJdKh 4h4c QcKd 6s3h 3s4d 8h9d"));
  }

  @Test
  public void test_texas_holdem_5717_4c7h9hJsTc_Kd4d_Ad5h_4hQd() {
    assertEquals(
      "Ad5h 4hQd Kd4d",
      Solver.process("texas-holdem 4c7h9hJsTc Kd4d Ad5h 4hQd"));
  }

  @Test
  public void test_texas_holdem_5718_5c5sKcTcTd_5dQc_3sAs_9dJs_7d6s_9s9h_8h2d_AhJh_4s6c_8d4d() {
    assertEquals(
      "4s6c=7d6s=8d4d=8h2d=9dJs 3sAs=AhJh 9s9h 5dQc",
      Solver.process("texas-holdem 5c5sKcTcTd 5dQc 3sAs 9dJs 7d6s 9s9h 8h2d AhJh 4s6c 8d4d"));
  }

  @Test
  public void test_texas_holdem_5719_2d9cKhQdTc_KcAs_TsAh_4sQc() {
    assertEquals(
      "TsAh 4sQc KcAs",
      Solver.process("texas-holdem 2d9cKhQdTc KcAs TsAh 4sQc"));
  }

  @Test
  public void test_texas_holdem_5720_2h4sKcQsTc_6cTh_3dJd_3sQc_2cJc_As6s_8hTs_Ac9c() {
    assertEquals(
      "3dJd As6s Ac9c 2cJc 6cTh 8hTs 3sQc",
      Solver.process("texas-holdem 2h4sKcQsTc 6cTh 3dJd 3sQc 2cJc As6s 8hTs Ac9c"));
  }

  @Test
  public void test_texas_holdem_5721_4s5h8h8sQc_6d2d_Qs8c_ThQh_JsKc_JdTc_Jc3h_Ac4h() {
    assertEquals(
      "6d2d Jc3h JdTc JsKc Ac4h ThQh Qs8c",
      Solver.process("texas-holdem 4s5h8h8sQc 6d2d Qs8c ThQh JsKc JdTc Jc3h Ac4h"));
  }

  @Test
  public void test_texas_holdem_5722_3c4h4s8hAs_9c2s_4cTd_5d6s_Ad2c_7c7d_8dKh_Qs4d_QhQc_TcAc() {
    assertEquals(
      "5d6s 9c2s 7c7d 8dKh QhQc Ad2c TcAc 4cTd Qs4d",
      Solver.process("texas-holdem 3c4h4s8hAs 9c2s 4cTd 5d6s Ad2c 7c7d 8dKh Qs4d QhQc TcAc"));
  }

  @Test
  public void test_texas_holdem_5723_4h6h9dAhKs_3cTd_8s5s_KdAs() {
    assertEquals(
      "8s5s 3cTd KdAs",
      Solver.process("texas-holdem 4h6h9dAhKs 3cTd 8s5s KdAs"));
  }

  @Test
  public void test_texas_holdem_5724_8d9hAhKsTs_4c6h_8h2d_5d2s_Td2c_6sJd_3h7s_KcJs_ThQs_Qh8s() {
    assertEquals(
      "3h7s=4c6h=5d2s 6sJd 8h2d Qh8s Td2c ThQs KcJs",
      Solver.process("texas-holdem 8d9hAhKsTs 4c6h 8h2d 5d2s Td2c 6sJd 3h7s KcJs ThQs Qh8s"));
  }

  @Test
  public void test_texas_holdem_5725_4d6d7c7h8h_7dTh_5dAs_7s9d_QcAh() {
    assertEquals(
      "QcAh 7s9d 7dTh 5dAs",
      Solver.process("texas-holdem 4d6d7c7h8h 7dTh 5dAs 7s9d QcAh"));
  }

  @Test
  public void test_texas_holdem_5726_4h9cAhQsTs_Ad4s_Jd9s_Th7s_2sKs_2d7c_2c6c() {
    assertEquals(
      "2c6c 2d7c 2sKs Jd9s Th7s Ad4s",
      Solver.process("texas-holdem 4h9cAhQsTs Ad4s Jd9s Th7s 2sKs 2d7c 2c6c"));
  }

  @Test
  public void test_texas_holdem_5727_2s3c3d5c7h_9cKh_2dAc_2c6c_QhAs_4c7s() {
    assertEquals(
      "9cKh QhAs 2c6c 2dAc 4c7s",
      Solver.process("texas-holdem 2s3c3d5c7h 9cKh 2dAc 2c6c QhAs 4c7s"));
  }

  @Test
  public void test_texas_holdem_5728_4dAcAsKhTd_6c9d_Jh9s() {
    assertEquals(
      "6c9d Jh9s",
      Solver.process("texas-holdem 4dAcAsKhTd 6c9d Jh9s"));
  }

  @Test
  public void test_texas_holdem_5729_2s3s6c8hAc_Jd2h_6h4h_5d5c_AhAd_8cTd_Jc5h_Tc7d() {
    assertEquals(
      "Tc7d Jc5h Jd2h 5d5c 6h4h 8cTd AhAd",
      Solver.process("texas-holdem 2s3s6c8hAc Jd2h 6h4h 5d5c AhAd 8cTd Jc5h Tc7d"));
  }

  @Test
  public void test_texas_holdem_5730_2d3s5c9dAh_9sJd_5sQd() {
    assertEquals(
      "5sQd 9sJd",
      Solver.process("texas-holdem 2d3s5c9dAh 9sJd 5sQd"));
  }

  @Test
  public void test_texas_holdem_5731_3h5h6c8s9c_8c5s_8hKd_7c4s_AhJh_Jd6h_9h4c_3c9s() {
    assertEquals(
      "AhJh Jd6h 8hKd 9h4c 8c5s 3c9s 7c4s",
      Solver.process("texas-holdem 3h5h6c8s9c 8c5s 8hKd 7c4s AhJh Jd6h 9h4c 3c9s"));
  }

  @Test
  public void test_texas_holdem_5732_2s3h4h8cJd_5h6c_As5s_7d9h_AhAd_9cJh_9sTc() {
    assertEquals(
      "7d9h 9sTc 9cJh AhAd As5s 5h6c",
      Solver.process("texas-holdem 2s3h4h8cJd 5h6c As5s 7d9h AhAd 9cJh 9sTc"));
  }

  @Test
  public void test_texas_holdem_5733_5h8sQhQsTc_8dTh_3dTd_8cKc() {
    assertEquals(
      "8cKc 3dTd=8dTh",
      Solver.process("texas-holdem 5h8sQhQsTc 8dTh 3dTd 8cKc"));
  }

  @Test
  public void test_texas_holdem_5734_5d5s8h9cKs_4c5c_6hTs_8sQs_7sTh_8c9d() {
    assertEquals(
      "6hTs=7sTh 8sQs 8c9d 4c5c",
      Solver.process("texas-holdem 5d5s8h9cKs 4c5c 6hTs 8sQs 7sTh 8c9d"));
  }

  @Test
  public void test_texas_holdem_5735_3c3s6s7hAs_KcJd_2c4c() {
    assertEquals(
      "2c4c KcJd",
      Solver.process("texas-holdem 3c3s6s7hAs KcJd 2c4c"));
  }

  @Test
  public void test_texas_holdem_5736_5d6c9dAhKs_Qs9c_6hTs_Jd7c() {
    assertEquals(
      "Jd7c 6hTs Qs9c",
      Solver.process("texas-holdem 5d6c9dAhKs Qs9c 6hTs Jd7c"));
  }

  @Test
  public void test_texas_holdem_5737_2d2h6d7dAd_TcTh_Jd2s_QcKs_4sTs() {
    assertEquals(
      "4sTs QcKs TcTh Jd2s",
      Solver.process("texas-holdem 2d2h6d7dAd TcTh Jd2s QcKs 4sTs"));
  }

  @Test
  public void test_texas_holdem_5738_2s5c6h7hKh_Qs9s_Ad2d_4cJd_5sJc() {
    assertEquals(
      "4cJd Qs9s Ad2d 5sJc",
      Solver.process("texas-holdem 2s5c6h7hKh Qs9s Ad2d 4cJd 5sJc"));
  }

  @Test
  public void test_texas_holdem_5739_4d4h5hJcTc_3hTh_KhAs_Kc8d_QsJh_9c7s_Ks3s_7d6h() {
    assertEquals(
      "7d6h 9c7s Kc8d=Ks3s KhAs 3hTh QsJh",
      Solver.process("texas-holdem 4d4h5hJcTc 3hTh KhAs Kc8d QsJh 9c7s Ks3s 7d6h"));
  }

  @Test
  public void test_texas_holdem_5740_3d5s6hJsTs_7h6d_3s3h_TcTd_9dJd_7sKh_5cJc() {
    assertEquals(
      "7sKh 7h6d 9dJd 5cJc 3s3h TcTd",
      Solver.process("texas-holdem 3d5s6hJsTs 7h6d 3s3h TcTd 9dJd 7sKh 5cJc"));
  }

  @Test
  public void test_texas_holdem_5741_2h6h9cAdAs_Qs8c_7cJs_Kd8s_7h4s_9hQd_2c7d() {
    assertEquals(
      "7h4s 7cJs Qs8c Kd8s 2c7d 9hQd",
      Solver.process("texas-holdem 2h6h9cAdAs Qs8c 7cJs Kd8s 7h4s 9hQd 2c7d"));
  }

  @Test
  public void test_texas_holdem_5742_5h6d9sJsTc_Ad6s_4h2s_4d8h() {
    assertEquals(
      "4h2s 4d8h Ad6s",
      Solver.process("texas-holdem 5h6d9sJsTc Ad6s 4h2s 4d8h"));
  }

  @Test
  public void test_texas_holdem_5743_5h8d9cAhTc_3d2s_7s2c_6c6h_2d3h_6dTh_Td4h_9dAc_Qc8c() {
    assertEquals(
      "2d3h=3d2s 7s2c 6c6h Qc8c 6dTh=Td4h 9dAc",
      Solver.process("texas-holdem 5h8d9cAhTc 3d2s 7s2c 6c6h 2d3h 6dTh Td4h 9dAc Qc8c"));
  }

  @Test
  public void test_texas_holdem_5744_4c6d7c7d9s_Ad5c_8sJh() {
    assertEquals(
      "8sJh Ad5c",
      Solver.process("texas-holdem 4c6d7c7d9s Ad5c 8sJh"));
  }

  @Test
  public void test_texas_holdem_5745_3h6h8h9dQh_ThTs_4d7s_Ad6c_4cJc() {
    assertEquals(
      "4d7s 4cJc Ad6c ThTs",
      Solver.process("texas-holdem 3h6h8h9dQh ThTs 4d7s Ad6c 4cJc"));
  }

  @Test
  public void test_texas_holdem_5746_6s7cAdJdTh_2s6d_Kc9d_6cKd_Ts6h() {
    assertEquals(
      "Kc9d 2s6d 6cKd Ts6h",
      Solver.process("texas-holdem 6s7cAdJdTh 2s6d Kc9d 6cKd Ts6h"));
  }

  @Test
  public void test_texas_holdem_5747_3c8s9hJcTc_QhJh_8hAs_2sQc_KdTd_5s8d_9c3s_2dKh_Ad9d() {
    assertEquals(
      "2dKh 5s8d 8hAs Ad9d KdTd 9c3s 2sQc=QhJh",
      Solver.process("texas-holdem 3c8s9hJcTc QhJh 8hAs 2sQc KdTd 5s8d 9c3s 2dKh Ad9d"));
  }

  @Test
  public void test_texas_holdem_5748_5d6h8sAdAs_6cQh_Qc8c_TcQd_9dQs_3cAc_TdKh_2s2d_AhJd() {
    assertEquals(
      "9dQs TcQd TdKh 2s2d 6cQh Qc8c 3cAc AhJd",
      Solver.process("texas-holdem 5d6h8sAdAs 6cQh Qc8c TcQd 9dQs 3cAc TdKh 2s2d AhJd"));
  }

  @Test
  public void test_texas_holdem_5749_5cAdJsQcTs_9hTd_Qh9s_9d4h_Ah2d_KsKd_7s4c_8s2c_7h8d() {
    assertEquals(
      "7s4c 7h8d=8s2c 9d4h 9hTd Qh9s Ah2d KsKd",
      Solver.process("texas-holdem 5cAdJsQcTs 9hTd Qh9s 9d4h Ah2d KsKd 7s4c 8s2c 7h8d"));
  }

}
