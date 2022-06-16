
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver35HiddenTest {


  @Test
  public void test_texas_holdem_8750_2d3d6dJdKc_4c7h_Tc3h_QdQs_5dJs_9c5h_AcAd_QhKs_Ah8s_Kh5s() {
    assertEquals(
      "4c7h 9c5h Ah8s Tc3h Kh5s QhKs 5dJs QdQs AcAd",
      Solver.process("texas-holdem 2d3d6dJdKc 4c7h Tc3h QdQs 5dJs 9c5h AcAd QhKs Ah8s Kh5s"));
  }

  @Test
  public void test_texas_holdem_8751_2d4s5s8dAc_Ah8c_3cAd_Kd2s() {
    assertEquals(
      "Kd2s Ah8c 3cAd",
      Solver.process("texas-holdem 2d4s5s8dAc Ah8c 3cAd Kd2s"));
  }

  @Test
  public void test_texas_holdem_8752_3d7d7sKdTs_5d9s_Qh8h() {
    assertEquals(
      "5d9s Qh8h",
      Solver.process("texas-holdem 3d7d7sKdTs 5d9s Qh8h"));
  }

  @Test
  public void test_texas_holdem_8753_5c6d8cJhTs_6c2d_8h7h_3hTh() {
    assertEquals(
      "6c2d 8h7h 3hTh",
      Solver.process("texas-holdem 5c6d8cJhTs 6c2d 8h7h 3hTh"));
  }

  @Test
  public void test_texas_holdem_8754_2h3d5d6dQs_Kd9c_Qh2d_Js6h_7hTc_4h8d_Kc3s() {
    assertEquals(
      "7hTc Kd9c Kc3s Js6h Qh2d 4h8d",
      Solver.process("texas-holdem 2h3d5d6dQs Kd9c Qh2d Js6h 7hTc 4h8d Kc3s"));
  }

  @Test
  public void test_texas_holdem_8755_4s6h8d9cQh_3d5c_KhAc_6s5h_8c2d_Ks3s_3c9s() {
    assertEquals(
      "3d5c Ks3s KhAc 6s5h 8c2d 3c9s",
      Solver.process("texas-holdem 4s6h8d9cQh 3d5c KhAc 6s5h 8c2d Ks3s 3c9s"));
  }

  @Test
  public void test_texas_holdem_8756_2s6c9cTcTh_2d8c_8sAd_Kh4s() {
    assertEquals(
      "Kh4s 8sAd 2d8c",
      Solver.process("texas-holdem 2s6c9cTcTh 2d8c 8sAd Kh4s"));
  }

  @Test
  public void test_texas_holdem_8757_2d4h7c8dJh_Kc8c_9s2c_7s9c_Jc6d_5h4s_2sTh_6sQc_AdQs() {
    assertEquals(
      "6sQc AdQs 9s2c 2sTh 5h4s 7s9c Kc8c Jc6d",
      Solver.process("texas-holdem 2d4h7c8dJh Kc8c 9s2c 7s9c Jc6d 5h4s 2sTh 6sQc AdQs"));
  }

  @Test
  public void test_texas_holdem_8758_3s5d8sQcQd_3c9h_Tc5c() {
    assertEquals(
      "3c9h Tc5c",
      Solver.process("texas-holdem 3s5d8sQcQd 3c9h Tc5c"));
  }

  @Test
  public void test_texas_holdem_8759_4c4d7sJsQh_Jd6d_9sQs_6c9d_2c7h_Jh6h_8s2s_QdTs_Ah3s() {
    assertEquals(
      "8s2s 6c9d Ah3s 2c7h Jd6d=Jh6h 9sQs=QdTs",
      Solver.process("texas-holdem 4c4d7sJsQh Jd6d 9sQs 6c9d 2c7h Jh6h 8s2s QdTs Ah3s"));
  }

  @Test
  public void test_texas_holdem_8760_4c4h5dJdQc_8hTd_Ah7d_5h6h_8d3c_8cJc_Js7s_4sKc_5sQs() {
    assertEquals(
      "8d3c 8hTd Ah7d 5h6h 8cJc=Js7s 5sQs 4sKc",
      Solver.process("texas-holdem 4c4h5dJdQc 8hTd Ah7d 5h6h 8d3c 8cJc Js7s 4sKc 5sQs"));
  }

  @Test
  public void test_texas_holdem_8761_3d3h7hJdKs_KdTd_7c9d() {
    assertEquals(
      "7c9d KdTd",
      Solver.process("texas-holdem 3d3h7hJdKs KdTd 7c9d"));
  }

  @Test
  public void test_texas_holdem_8762_2d6h8cKdKh_2c3c_3hTh_AhKs_2sAc_Ts7d() {
    assertEquals(
      "3hTh Ts7d 2c3c 2sAc AhKs",
      Solver.process("texas-holdem 2d6h8cKdKh 2c3c 3hTh AhKs 2sAc Ts7d"));
  }

  @Test
  public void test_texas_holdem_8763_2s5d6hQdQh_6dQc_9c5h_JsKc_Qs7h() {
    assertEquals(
      "JsKc 9c5h Qs7h 6dQc",
      Solver.process("texas-holdem 2s5d6hQdQh 6dQc 9c5h JsKc Qs7h"));
  }

  @Test
  public void test_texas_holdem_8764_6s9dAdAsTh_5sKd_Kc4h_8c4s_3s3d() {
    assertEquals(
      "8c4s 5sKd=Kc4h 3s3d",
      Solver.process("texas-holdem 6s9dAdAsTh 5sKd Kc4h 8c4s 3s3d"));
  }

  @Test
  public void test_texas_holdem_8765_3h8h9hKcQc_7h9d_3c6d_9sTh_7dTs_KdJh() {
    assertEquals(
      "7dTs 3c6d 7h9d 9sTh KdJh",
      Solver.process("texas-holdem 3h8h9hKcQc 7h9d 3c6d 9sTh 7dTs KdJh"));
  }

  @Test
  public void test_texas_holdem_8766_4h4s7sQhTc_5c3c_Kc4d_7hKs_6hQd() {
    assertEquals(
      "5c3c 7hKs 6hQd Kc4d",
      Solver.process("texas-holdem 4h4s7sQhTc 5c3c Kc4d 7hKs 6hQd"));
  }

  @Test
  public void test_texas_holdem_8767_2h3s5d6dTd_8s7s_4cAs_Ks8c_6hTh_9hKh_5h6c_JsQs_2cQc() {
    assertEquals(
      "8s7s JsQs Ks8c 9hKh 2cQc 5h6c 6hTh 4cAs",
      Solver.process("texas-holdem 2h3s5d6dTd 8s7s 4cAs Ks8c 6hTh 9hKh 5h6c JsQs 2cQc"));
  }

  @Test
  public void test_texas_holdem_8768_2s3cJcJhTc_8d4h_6dQh_9c6s_2d6h_5cKc_Kd3h_JsAs() {
    assertEquals(
      "8d4h 9c6s 6dQh 2d6h Kd3h JsAs 5cKc",
      Solver.process("texas-holdem 2s3cJcJhTc 8d4h 6dQh 9c6s 2d6h 5cKc Kd3h JsAs"));
  }

  @Test
  public void test_texas_holdem_8769_2c3h6d8cQs_5hQc_2h5d_4c2s_6c7s() {
    assertEquals(
      "2h5d=4c2s 6c7s 5hQc",
      Solver.process("texas-holdem 2c3h6d8cQs 5hQc 2h5d 4c2s 6c7s"));
  }

  @Test
  public void test_texas_holdem_8770_5c9hKhKsTh_Ts4h_Qs2h_9s7h() {
    assertEquals(
      "Qs2h 9s7h Ts4h",
      Solver.process("texas-holdem 5c9hKhKsTh Ts4h Qs2h 9s7h"));
  }

  @Test
  public void test_texas_holdem_8771_5c5dAcAsTs_6hJc_7sTh_6c2s_2d4c_9d4h_7c7d_9hJh() {
    assertEquals(
      "2d4c=6c2s=9d4h 6hJc=9hJh 7c7d 7sTh",
      Solver.process("texas-holdem 5c5dAcAsTs 6hJc 7sTh 6c2s 2d4c 9d4h 7c7d 9hJh"));
  }

  @Test
  public void test_texas_holdem_8772_3s5s7c8cQh_7hTc_4dAs_9d7s() {
    assertEquals(
      "4dAs 9d7s 7hTc",
      Solver.process("texas-holdem 3s5s7c8cQh 7hTc 4dAs 9d7s"));
  }

  @Test
  public void test_texas_holdem_8773_2c4s5dTdTh_8h9s_Jc9h_6h2d_Kc5s() {
    assertEquals(
      "8h9s Jc9h 6h2d Kc5s",
      Solver.process("texas-holdem 2c4s5dTdTh 8h9s Jc9h 6h2d Kc5s"));
  }

  @Test
  public void test_texas_holdem_8774_2h2s5sJhQh_9c8d_As6s_Qs6h() {
    assertEquals(
      "9c8d As6s Qs6h",
      Solver.process("texas-holdem 2h2s5sJhQh 9c8d As6s Qs6h"));
  }

  @Test
  public void test_texas_holdem_8775_3h6c9hKcKs_Ac7d_KdQd() {
    assertEquals(
      "Ac7d KdQd",
      Solver.process("texas-holdem 3h6c9hKcKs Ac7d KdQd"));
  }

  @Test
  public void test_texas_holdem_8776_3s4dAsKcQs_5h9h_Ad5d_Tc9d_8h4c() {
    assertEquals(
      "5h9h Tc9d 8h4c Ad5d",
      Solver.process("texas-holdem 3s4dAsKcQs 5h9h Ad5d Tc9d 8h4c"));
  }

  @Test
  public void test_texas_holdem_8777_7s9sAhJhQc_Qs7d_Kh6d_9h4s_AcAd_6c2h_Jc8h_3s3c_5d7h() {
    assertEquals(
      "6c2h Kh6d 3s3c 5d7h 9h4s Jc8h Qs7d AcAd",
      Solver.process("texas-holdem 7s9sAhJhQc Qs7d Kh6d 9h4s AcAd 6c2h Jc8h 3s3c 5d7h"));
  }

  @Test
  public void test_texas_holdem_8778_5c7hKdQhTc_Ah2c_QdKc_2sTh_8hTs_6hQs() {
    assertEquals(
      "Ah2c 2sTh 8hTs 6hQs QdKc",
      Solver.process("texas-holdem 5c7hKdQhTc Ah2c QdKc 2sTh 8hTs 6hQs"));
  }

  @Test
  public void test_texas_holdem_8779_3d3s5h6d7h_Kc7c_3hKs_7s6c_5s2h_TdTh() {
    assertEquals(
      "5s2h Kc7c 7s6c TdTh 3hKs",
      Solver.process("texas-holdem 3d3s5h6d7h Kc7c 3hKs 7s6c 5s2h TdTh"));
  }

  @Test
  public void test_texas_holdem_8780_2c4h8c8sKc_3c5s_7c4s() {
    assertEquals(
      "3c5s 7c4s",
      Solver.process("texas-holdem 2c4h8c8sKc 3c5s 7c4s"));
  }

  @Test
  public void test_texas_holdem_8781_2d7hJsKdTd_5cJh_6sQh_3s5s_2s6c_Tc3d_4sQs_Th8d_Ac9d() {
    assertEquals(
      "3s5s 4sQs=6sQh Ac9d 2s6c Tc3d Th8d 5cJh",
      Solver.process("texas-holdem 2d7hJsKdTd 5cJh 6sQh 3s5s 2s6c Tc3d 4sQs Th8d Ac9d"));
  }

  @Test
  public void test_texas_holdem_8782_4d5h7c9cKd_8c2c_Qc7s_Qs6s() {
    assertEquals(
      "8c2c Qs6s Qc7s",
      Solver.process("texas-holdem 4d5h7c9cKd 8c2c Qc7s Qs6s"));
  }

  @Test
  public void test_texas_holdem_8783_2c2d4hJhQd_AcTd_9hKd() {
    assertEquals(
      "9hKd AcTd",
      Solver.process("texas-holdem 2c2d4hJhQd AcTd 9hKd"));
  }

  @Test
  public void test_texas_holdem_8784_2s6c9sKdKh_6h4c_QsJc_6d5h_Js3s_AhJh_8sAd_5c6s_Qh2d() {
    assertEquals(
      "Js3s QsJc 8sAd AhJh Qh2d 5c6s=6d5h=6h4c",
      Solver.process("texas-holdem 2s6c9sKdKh 6h4c QsJc 6d5h Js3s AhJh 8sAd 5c6s Qh2d"));
  }

  @Test
  public void test_texas_holdem_8785_2c7s9cAsTs_Js8d_3h7c() {
    assertEquals(
      "3h7c Js8d",
      Solver.process("texas-holdem 2c7s9cAsTs Js8d 3h7c"));
  }

  @Test
  public void test_texas_holdem_8786_3c7s9hJcTd_8s7h_5d9c_6h7c() {
    assertEquals(
      "6h7c 5d9c 8s7h",
      Solver.process("texas-holdem 3c7s9hJcTd 8s7h 5d9c 6h7c"));
  }

  @Test
  public void test_texas_holdem_8787_2d3cAsQdTh_8cAh_5dTd_4d8h_Jc7c_5s5c_9s4s() {
    assertEquals(
      "4d8h 9s4s Jc7c 5s5c 5dTd 8cAh",
      Solver.process("texas-holdem 2d3cAsQdTh 8cAh 5dTd 4d8h Jc7c 5s5c 9s4s"));
  }

  @Test
  public void test_texas_holdem_8788_5d7d8s9cJd_QdKs_Qh6d_4s7h_9sTd_Qs3s_2h9h_Kh7s_7cTs() {
    assertEquals(
      "Qs3s QdKs 4s7h Kh7s 2h9h Qh6d 7cTs=9sTd",
      Solver.process("texas-holdem 5d7d8s9cJd QdKs Qh6d 4s7h 9sTd Qs3s 2h9h Kh7s 7cTs"));
  }

  @Test
  public void test_texas_holdem_8789_2h6c6hJdQd_7h7c_2c6s_Kd6d_8c7d_KhJc() {
    assertEquals(
      "8c7d 7h7c KhJc Kd6d 2c6s",
      Solver.process("texas-holdem 2h6c6hJdQd 7h7c 2c6s Kd6d 8c7d KhJc"));
  }

  @Test
  public void test_texas_holdem_8790_5s6h9hAdKh_8s3s_4hKs_Kd7h_7sQh_7d8c_5hQd_3c2s_4cAs() {
    assertEquals(
      "3c2s 8s3s 7sQh 5hQd 4hKs Kd7h 4cAs 7d8c",
      Solver.process("texas-holdem 5s6h9hAdKh 8s3s 4hKs Kd7h 7sQh 7d8c 5hQd 3c2s 4cAs"));
  }

  @Test
  public void test_texas_holdem_8791_3s6d6s9sKd_Qd8h_3cQh() {
    assertEquals(
      "Qd8h 3cQh",
      Solver.process("texas-holdem 3s6d6s9sKd Qd8h 3cQh"));
  }

  @Test
  public void test_texas_holdem_8792_2s8sAsKdQh_Th5d_3hQc_TsKh_8cJs_2d5h_Qd9h_2cAd_4sJd_7c4c() {
    assertEquals(
      "7c4c Th5d 4sJd 2d5h 8cJs 3hQc Qd9h TsKh 2cAd",
      Solver.process("texas-holdem 2s8sAsKdQh Th5d 3hQc TsKh 8cJs 2d5h Qd9h 2cAd 4sJd 7c4c"));
  }

  @Test
  public void test_texas_holdem_8793_5cKcKdQcTc_Ac7d_Ts8h_8cKh_9sJs_3c4c() {
    assertEquals(
      "Ts8h 9sJs 3c4c 8cKh Ac7d",
      Solver.process("texas-holdem 5cKcKdQcTc Ac7d Ts8h 8cKh 9sJs 3c4c"));
  }

  @Test
  public void test_texas_holdem_8794_3s8c8hAcTs_3d5c_6sJd() {
    assertEquals(
      "6sJd 3d5c",
      Solver.process("texas-holdem 3s8c8hAcTs 3d5c 6sJd"));
  }

  @Test
  public void test_texas_holdem_8795_5s6sJhKdTs_KhAd_JdAc_2sJs_9sQd_3c2c_8sQs() {
    assertEquals(
      "3c2c JdAc KhAd 9sQd 2sJs 8sQs",
      Solver.process("texas-holdem 5s6sJhKdTs KhAd JdAc 2sJs 9sQd 3c2c 8sQs"));
  }

  @Test
  public void test_texas_holdem_8796_2s3c5s6h7c_9sJd_KdAd() {
    assertEquals(
      "9sJd KdAd",
      Solver.process("texas-holdem 2s3c5s6h7c 9sJd KdAd"));
  }

  @Test
  public void test_texas_holdem_8797_6d7h9cJdTc_3d8s_JsKh_9s7d_4sQs_2hKd() {
    assertEquals(
      "4sQs 2hKd JsKh 9s7d 3d8s",
      Solver.process("texas-holdem 6d7h9cJdTc 3d8s JsKh 9s7d 4sQs 2hKd"));
  }

  @Test
  public void test_texas_holdem_8798_5h8dJcKhTh_Ts4d_7hTc_8cAd_6sKs() {
    assertEquals(
      "8cAd 7hTc=Ts4d 6sKs",
      Solver.process("texas-holdem 5h8dJcKhTh Ts4d 7hTc 8cAd 6sKs"));
  }

  @Test
  public void test_texas_holdem_8799_5s8dKdQhTh_5c9d_Kc4s() {
    assertEquals(
      "5c9d Kc4s",
      Solver.process("texas-holdem 5s8dKdQhTh 5c9d Kc4s"));
  }

  @Test
  public void test_texas_holdem_8800_2c2d6sJdKs_8c4h_6hAs_7cJs_5cJc_QdTh() {
    assertEquals(
      "8c4h QdTh 6hAs 5cJc=7cJs",
      Solver.process("texas-holdem 2c2d6sJdKs 8c4h 6hAs 7cJs 5cJc QdTh"));
  }

  @Test
  public void test_texas_holdem_8801_2h6c9cAsQd_Tc3h_Jc3d_TdKh() {
    assertEquals(
      "Tc3h Jc3d TdKh",
      Solver.process("texas-holdem 2h6c9cAsQd Tc3h Jc3d TdKh"));
  }

  @Test
  public void test_texas_holdem_8802_7c9cAcJdKs_7dQs_3cQc_8h5c_6h4c_ThQh_As6s_Jc9h_Ah6c_7h2h() {
    assertEquals(
      "6h4c 8h5c 7h2h 7dQs Ah6c=As6s Jc9h ThQh 3cQc",
      Solver.process("texas-holdem 7c9cAcJdKs 7dQs 3cQc 8h5c 6h4c ThQh As6s Jc9h Ah6c 7h2h"));
  }

  @Test
  public void test_texas_holdem_8803_2c4c5d7hKc_6s7s_2h3s_JdQd_JcKh_8d7c_6cKd_Js3h_QcAs() {
    assertEquals(
      "Js3h JdQd QcAs 2h3s 6s7s 8d7c 6cKd JcKh",
      Solver.process("texas-holdem 2c4c5d7hKc 6s7s 2h3s JdQd JcKh 8d7c 6cKd Js3h QcAs"));
  }

  @Test
  public void test_texas_holdem_8804_2d2s5s8cJd_7cAd_9hQd_Jh4d() {
    assertEquals(
      "9hQd 7cAd Jh4d",
      Solver.process("texas-holdem 2d2s5s8cJd 7cAd 9hQd Jh4d"));
  }

  @Test
  public void test_texas_holdem_8805_5h6hAsJdKd_QsJc_8s3h_TcQh_4d2h() {
    assertEquals(
      "4d2h 8s3h QsJc TcQh",
      Solver.process("texas-holdem 5h6hAsJdKd QsJc 8s3h TcQh 4d2h"));
  }

  @Test
  public void test_texas_holdem_8806_2c5c9cJhKh_5dQd_Ks9d_7h6s_6cTd() {
    assertEquals(
      "7h6s 6cTd 5dQd Ks9d",
      Solver.process("texas-holdem 2c5c9cJhKh 5dQd Ks9d 7h6s 6cTd"));
  }

  @Test
  public void test_texas_holdem_8807_5d8hAhJdQh_Qs7s_8sTc_JhKc_2sKh() {
    assertEquals(
      "2sKh 8sTc JhKc Qs7s",
      Solver.process("texas-holdem 5d8hAhJdQh Qs7s 8sTc JhKc 2sKh"));
  }

  @Test
  public void test_texas_holdem_8808_3s5d5h6dJs_2s9s_8dAh_3cTh() {
    assertEquals(
      "2s9s 8dAh 3cTh",
      Solver.process("texas-holdem 3s5d5h6dJs 2s9s 8dAh 3cTh"));
  }

  @Test
  public void test_texas_holdem_8809_2c3s8hJsTh_6h9s_KdAh_Kc5c_2d5d_5sAd_Td3c_3h8s() {
    assertEquals(
      "6h9s Kc5c 5sAd KdAh 2d5d 3h8s Td3c",
      Solver.process("texas-holdem 2c3s8hJsTh 6h9s KdAh Kc5c 2d5d 5sAd Td3c 3h8s"));
  }

  @Test
  public void test_texas_holdem_8810_6c7h8sJsKd_5h8c_8d4c_9sQs_AdAs_Qh7d_4dAh_5d4h_Th2h_8h6d() {
    assertEquals(
      "Th2h 9sQs 4dAh Qh7d 5h8c=8d4c AdAs 8h6d 5d4h",
      Solver.process("texas-holdem 6c7h8sJsKd 5h8c 8d4c 9sQs AdAs Qh7d 4dAh 5d4h Th2h 8h6d"));
  }

  @Test
  public void test_texas_holdem_8811_2s3s4sJsTs_3h7d_Ks2d_Td9c_4hQc_QdKd() {
    assertEquals(
      "3h7d=4hQc=QdKd=Td9c Ks2d",
      Solver.process("texas-holdem 2s3s4sJsTs 3h7d Ks2d Td9c 4hQc QdKd"));
  }

  @Test
  public void test_texas_holdem_8812_6s7d8h9dKs_5s6d_TcKd_3c2h_2s8s_QcAs_Ts3s_Ah9s_7s8c_Js3d() {
    assertEquals(
      "3c2h Js3d QcAs 2s8s Ah9s 7s8c 5s6d TcKd=Ts3s",
      Solver.process("texas-holdem 6s7d8h9dKs 5s6d TcKd 3c2h 2s8s QcAs Ts3s Ah9s 7s8c Js3d"));
  }

  @Test
  public void test_texas_holdem_8813_2s3d4sAhKh_6h5h_7c2d_7dQc_AcQh_Ks3h() {
    assertEquals(
      "7dQc 7c2d AcQh Ks3h 6h5h",
      Solver.process("texas-holdem 2s3d4sAhKh 6h5h 7c2d 7dQc AcQh Ks3h"));
  }

  @Test
  public void test_texas_holdem_8814_2c2s7s9cKh_6hAs_3s4d() {
    assertEquals(
      "3s4d 6hAs",
      Solver.process("texas-holdem 2c2s7s9cKh 6hAs 3s4d"));
  }

  @Test
  public void test_texas_holdem_8815_AdJcJdQdTd_8cKd_3c4c_KsQs_3s2h() {
    assertEquals(
      "3c4c=3s2h KsQs 8cKd",
      Solver.process("texas-holdem AdJcJdQdTd 8cKd 3c4c KsQs 3s2h"));
  }

  @Test
  public void test_texas_holdem_8816_3c3d4d8c9s_7h7c_3s6c_Kh2c_ThAh_8d8s_QsAs_6sTs() {
    assertEquals(
      "6sTs Kh2c ThAh QsAs 7h7c 3s6c 8d8s",
      Solver.process("texas-holdem 3c3d4d8c9s 7h7c 3s6c Kh2c ThAh 8d8s QsAs 6sTs"));
  }

  @Test
  public void test_texas_holdem_8817_2s8cJcKdQc_TsKh_AsTc_7cJs_9d6d_3dTd() {
    assertEquals(
      "9d6d 3dTd 7cJs TsKh AsTc",
      Solver.process("texas-holdem 2s8cJcKdQc TsKh AsTc 7cJs 9d6d 3dTd"));
  }

  @Test
  public void test_texas_holdem_8818_4s8cAdJdTd_6cQs_7c6s_3cKc_4d9h() {
    assertEquals(
      "7c6s 6cQs 3cKc 4d9h",
      Solver.process("texas-holdem 4s8cAdJdTd 6cQs 7c6s 3cKc 4d9h"));
  }

  @Test
  public void test_texas_holdem_8819_4d4s5h9hQc_KhTd_8hJs_2h3s_6hQh_5dTh_7s7c() {
    assertEquals(
      "2h3s 8hJs KhTd 5dTh 7s7c 6hQh",
      Solver.process("texas-holdem 4d4s5h9hQc KhTd 8hJs 2h3s 6hQh 5dTh 7s7c"));
  }

  @Test
  public void test_texas_holdem_8820_5h5s7d8cTh_8sAs_9cTd_KsQs_5cQc_Ad4h() {
    assertEquals(
      "KsQs Ad4h 8sAs 9cTd 5cQc",
      Solver.process("texas-holdem 5h5s7d8cTh 8sAs 9cTd KsQs 5cQc Ad4h"));
  }

  @Test
  public void test_texas_holdem_8821_3c4h6cKdQh_Kh9h_2h8d_7sTh_2d9c_6h2s_Ah8c_Js5h() {
    assertEquals(
      "2h8d 2d9c 7sTh Js5h Ah8c 6h2s Kh9h",
      Solver.process("texas-holdem 3c4h6cKdQh Kh9h 2h8d 7sTh 2d9c 6h2s Ah8c Js5h"));
  }

  @Test
  public void test_texas_holdem_8822_2c5c6hQcQs_8h8d_AcJc_Kh3c_8cTs_Tc4c_6c3h_6d5d_Jh6s() {
    assertEquals(
      "8cTs Kh3c 6c3h=6d5d Jh6s 8h8d Tc4c AcJc",
      Solver.process("texas-holdem 2c5c6hQcQs 8h8d AcJc Kh3c 8cTs Tc4c 6c3h 6d5d Jh6s"));
  }

  @Test
  public void test_texas_holdem_8823_5s7h8s9sKc_6h3d_Ac5c_8hTc_Jc5d_Ts2c_2s7s_2d9h() {
    assertEquals(
      "Ts2c Jc5d Ac5c 8hTc 2d9h 6h3d 2s7s",
      Solver.process("texas-holdem 5s7h8s9sKc 6h3d Ac5c 8hTc Jc5d Ts2c 2s7s 2d9h"));
  }

  @Test
  public void test_texas_holdem_8824_3s4h7dAhTh_5dQc_Qs2c_TcKh_Qd5c_AcKd() {
    assertEquals(
      "Qs2c 5dQc=Qd5c TcKh AcKd",
      Solver.process("texas-holdem 3s4h7dAhTh 5dQc Qs2c TcKh Qd5c AcKd"));
  }

  @Test
  public void test_texas_holdem_8825_3s6c8d9h9s_2h4d_9cTs_QdJc() {
    assertEquals(
      "2h4d QdJc 9cTs",
      Solver.process("texas-holdem 3s6c8d9h9s 2h4d 9cTs QdJc"));
  }

  @Test
  public void test_texas_holdem_8826_2h8c8s9cJc_AdKs_6h5s_Jh6d_3d8h_4dJd_5dQs_Kd4h_9sTh_5c6c() {
    assertEquals(
      "6h5s 5dQs Kd4h AdKs 9sTh 4dJd=Jh6d 3d8h 5c6c",
      Solver.process("texas-holdem 2h8c8s9cJc AdKs 6h5s Jh6d 3d8h 4dJd 5dQs Kd4h 9sTh 5c6c"));
  }

  @Test
  public void test_texas_holdem_8827_2dAsKdTdTh_5h3c_5sJh_Ah9d_JcJs() {
    assertEquals(
      "5h3c 5sJh JcJs Ah9d",
      Solver.process("texas-holdem 2dAsKdTdTh 5h3c 5sJh Ah9d JcJs"));
  }

  @Test
  public void test_texas_holdem_8828_7cKsQdQhTc_KdTs_Kc3c_4h8h_5c9c_4dAs_2cTh_5s3h() {
    assertEquals(
      "5s3h 4h8h 5c9c 4dAs 2cTh Kc3c=KdTs",
      Solver.process("texas-holdem 7cKsQdQhTc KdTs Kc3c 4h8h 5c9c 4dAs 2cTh 5s3h"));
  }

  @Test
  public void test_texas_holdem_8829_4h7h9c9sQs_JsAh_4d8s_QcKc_6sAs_4s3d() {
    assertEquals(
      "6sAs JsAh 4d8s=4s3d QcKc",
      Solver.process("texas-holdem 4h7h9c9sQs JsAh 4d8s QcKc 6sAs 4s3d"));
  }

  @Test
  public void test_texas_holdem_8830_3h6d6h7d8d_4dJd_3s5s_Qh6s_Js5h_7sAh_Qd3d_9s2c_9c7h_2s5d() {
    assertEquals(
      "2s5d 9s2c Js5h 3s5s 9c7h 7sAh Qh6s 4dJd Qd3d",
      Solver.process("texas-holdem 3h6d6h7d8d 4dJd 3s5s Qh6s Js5h 7sAh Qd3d 9s2c 9c7h 2s5d"));
  }

  @Test
  public void test_texas_holdem_8831_3d4c6h7hKh_8d7d_Qc8s_Qd6c_Jh7c() {
    assertEquals(
      "Qc8s Qd6c 8d7d Jh7c",
      Solver.process("texas-holdem 3d4c6h7hKh 8d7d Qc8s Qd6c Jh7c"));
  }

  @Test
  public void test_texas_holdem_8832_5s8hAhTdTs_5d4d_3s4h_AsQc_2s6s() {
    assertEquals(
      "3s4h 2s6s 5d4d AsQc",
      Solver.process("texas-holdem 5s8hAhTdTs 5d4d 3s4h AsQc 2s6s"));
  }

  @Test
  public void test_texas_holdem_8833_5s8c8d8hAc_JcKs_3c3h_QhJh_Th9s_2s9h() {
    assertEquals(
      "2s9h Th9s QhJh JcKs 3c3h",
      Solver.process("texas-holdem 5s8c8d8hAc JcKs 3c3h QhJh Th9s 2s9h"));
  }

  @Test
  public void test_texas_holdem_8834_3d3s5h7d8h_JcQh_AcKs_6c9s() {
    assertEquals(
      "JcQh AcKs 6c9s",
      Solver.process("texas-holdem 3d3s5h7d8h JcQh AcKs 6c9s"));
  }

  @Test
  public void test_texas_holdem_8835_3c4c4d5h9h_2hTs_2c2d_9sQc() {
    assertEquals(
      "2hTs 2c2d 9sQc",
      Solver.process("texas-holdem 3c4c4d5h9h 2hTs 2c2d 9sQc"));
  }

  @Test
  public void test_texas_holdem_8836_2s4d6c9dTc_9hKd_As4c_5s8c() {
    assertEquals(
      "5s8c As4c 9hKd",
      Solver.process("texas-holdem 2s4d6c9dTc 9hKd As4c 5s8c"));
  }

  @Test
  public void test_texas_holdem_8837_3c3s4h8hTs_7hJh_2cKh_9h6d_Qc4c() {
    assertEquals(
      "9h6d 7hJh 2cKh Qc4c",
      Solver.process("texas-holdem 3c3s4h8hTs 7hJh 2cKh 9h6d Qc4c"));
  }

  @Test
  public void test_texas_holdem_8838_3c5s6s7d7s_4cTc_QhAh() {
    assertEquals(
      "QhAh 4cTc",
      Solver.process("texas-holdem 3c5s6s7d7s 4cTc QhAh"));
  }

  @Test
  public void test_texas_holdem_8839_2s3s4h7hJd_4d9s_6s8s_7dQs_Jc9d_5cTs_AdJh_As9c() {
    assertEquals(
      "6s8s 5cTs As9c 4d9s 7dQs Jc9d AdJh",
      Solver.process("texas-holdem 2s3s4h7hJd 4d9s 6s8s 7dQs Jc9d 5cTs AdJh As9c"));
  }

  @Test
  public void test_texas_holdem_8840_5sAdAsQcTc_9c5d_4sJd_Kh6c_2h9d_5h6d_8hQd_3h7h_Kd8s_Qh9s() {
    assertEquals(
      "3h7h 2h9d 4sJd Kd8s=Kh6c 5h6d=9c5d 8hQd=Qh9s",
      Solver.process("texas-holdem 5sAdAsQcTc 9c5d 4sJd Kh6c 2h9d 5h6d 8hQd 3h7h Kd8s Qh9s"));
  }

  @Test
  public void test_texas_holdem_8841_5s6d9c9dJs_2hKh_3hQd_2s2c_6s7d_Qs7c() {
    assertEquals(
      "3hQd Qs7c 2hKh 2s2c 6s7d",
      Solver.process("texas-holdem 5s6d9c9dJs 2hKh 3hQd 2s2c 6s7d Qs7c"));
  }

  @Test
  public void test_texas_holdem_8842_3c3s9hKhTs_5d8c_2c8s_Qh4d_Qc6h_7hTd_4hJh_8dQs_2d9d_2hQd() {
    assertEquals(
      "2c8s=5d8c 4hJh 2hQd=8dQs=Qc6h=Qh4d 2d9d 7hTd",
      Solver.process("texas-holdem 3c3s9hKhTs 5d8c 2c8s Qh4d Qc6h 7hTd 4hJh 8dQs 2d9d 2hQd"));
  }

  @Test
  public void test_texas_holdem_8843_6h9hAcJcQc_7s3h_Tc9s_3s5h_2s3c_4s5d_Qh5s_JhTh_8hQd_5cJd() {
    assertEquals(
      "2s3c=3s5h=4s5d 7s3h Tc9s 5cJd JhTh 8hQd=Qh5s",
      Solver.process("texas-holdem 6h9hAcJcQc 7s3h Tc9s 3s5h 2s3c 4s5d Qh5s JhTh 8hQd 5cJd"));
  }

  @Test
  public void test_texas_holdem_8844_3s4c7sQcQh_9h8h_7cAs_Qs8d_9d2h_7h6d_2d9s() {
    assertEquals(
      "2d9s=9d2h 9h8h 7h6d 7cAs Qs8d",
      Solver.process("texas-holdem 3s4c7sQcQh 9h8h 7cAs Qs8d 9d2h 7h6d 2d9s"));
  }

  @Test
  public void test_texas_holdem_8845_3s7c8sAsKs_9h2d_JsAd_Jh5h_4c4d_7s5d_QcKd_QhQs_6dJc() {
    assertEquals(
      "9h2d 6dJc=Jh5h 4c4d QcKd 7s5d JsAd QhQs",
      Solver.process("texas-holdem 3s7c8sAsKs 9h2d JsAd Jh5h 4c4d 7s5d QcKd QhQs 6dJc"));
  }

  @Test
  public void test_texas_holdem_8846_4c5d6d9dTs_7hTh_Jd6h_5h5c_7c9s_QsQd_3c8h() {
    assertEquals(
      "3c8h Jd6h 7c9s 7hTh QsQd 5h5c",
      Solver.process("texas-holdem 4c5d6d9dTs 7hTh Jd6h 5h5c 7c9s QsQd 3c8h"));
  }

  @Test
  public void test_texas_holdem_8847_5h5s8h9dTd_6hQh_3h8d_KdAh_KcAc_3c9h_Tc2c_Ts6s_4c4d_AdJh() {
    assertEquals(
      "6hQh AdJh KcAc=KdAh 4c4d 3h8d 3c9h Tc2c=Ts6s",
      Solver.process("texas-holdem 5h5s8h9dTd 6hQh 3h8d KdAh KcAc 3c9h Tc2c Ts6s 4c4d AdJh"));
  }

  @Test
  public void test_texas_holdem_8848_4d5d6cQsTs_3sAc_9h5h_9dQh_7d7s_Qc3d_Th8s_4sKd_8dTd() {
    assertEquals(
      "3sAc 4sKd 9h5h 7d7s 8dTd=Th8s Qc3d 9dQh",
      Solver.process("texas-holdem 4d5d6cQsTs 3sAc 9h5h 9dQh 7d7s Qc3d Th8s 4sKd 8dTd"));
  }

  @Test
  public void test_texas_holdem_8849_3h6d6h7dKd_Kc4c_9sJd_4s9d_QcJc_5cKs_9h4d_8c8d_5h7c_Qd2h() {
    assertEquals(
      "4s9d=9h4d 9sJd Qd2h QcJc 5h7c 8c8d 5cKs=Kc4c",
      Solver.process("texas-holdem 3h6d6h7dKd Kc4c 9sJd 4s9d QcJc 5cKs 9h4d 8c8d 5h7c Qd2h"));
  }

  @Test
  public void test_texas_holdem_8850_4c4h7dAhTs_4dQs_4sQc_Td2s_7s9d_Jc3h_8h3s_6s9s() {
    assertEquals(
      "8h3s 6s9s Jc3h 7s9d Td2s 4dQs=4sQc",
      Solver.process("texas-holdem 4c4h7dAhTs 4dQs 4sQc Td2s 7s9d Jc3h 8h3s 6s9s"));
  }

  @Test
  public void test_texas_holdem_8851_2c3s6sAcQc_7h8c_JcJh_JdAh_Qs6c_Th3d_Ad9s() {
    assertEquals(
      "7h8c Th3d JcJh Ad9s JdAh Qs6c",
      Solver.process("texas-holdem 2c3s6sAcQc 7h8c JcJh JdAh Qs6c Th3d Ad9s"));
  }

  @Test
  public void test_texas_holdem_8852_2d3h5cJsTh_9cAs_Ac9s_2c3c_4d6h_KsJc_4h8d_KdKh_JdQc_Kc5h() {
    assertEquals(
      "4h8d 9cAs=Ac9s Kc5h JdQc KsJc KdKh 2c3c 4d6h",
      Solver.process("texas-holdem 2d3h5cJsTh 9cAs Ac9s 2c3c 4d6h KsJc 4h8d KdKh JdQc Kc5h"));
  }

  @Test
  public void test_texas_holdem_8853_3c6c8h9d9h_Ks6d_Ac6s_6h2h_5dAs_JhTc_7c5h_3s7d_AdKd_3hKc() {
    assertEquals(
      "JhTc 5dAs AdKd 3s7d 3hKc 6h2h Ks6d Ac6s 7c5h",
      Solver.process("texas-holdem 3c6c8h9d9h Ks6d Ac6s 6h2h 5dAs JhTc 7c5h 3s7d AdKd 3hKc"));
  }

  @Test
  public void test_texas_holdem_8854_4d5d6d8cJh_4hTd_4c5c_TsKc_Tc9d_Qh3s_Kh7d_Js9c() {
    assertEquals(
      "Tc9d Qh3s TsKc 4hTd Js9c 4c5c Kh7d",
      Solver.process("texas-holdem 4d5d6d8cJh 4hTd 4c5c TsKc Tc9d Qh3s Kh7d Js9c"));
  }

  @Test
  public void test_texas_holdem_8855_2s5d6c7dAs_KcQd_5s8h_5c6s() {
    assertEquals(
      "KcQd 5s8h 5c6s",
      Solver.process("texas-holdem 2s5d6c7dAs KcQd 5s8h 5c6s"));
  }

  @Test
  public void test_texas_holdem_8856_2h5d5h8c8d_2cKc_4hTs_5s9s_JhQd_Ac9d_Kh6d() {
    assertEquals(
      "4hTs JhQd 2cKc=Kh6d Ac9d 5s9s",
      Solver.process("texas-holdem 2h5d5h8c8d 2cKc 4hTs 5s9s JhQd Ac9d Kh6d"));
  }

  @Test
  public void test_texas_holdem_8857_3d5d8h8sKc_Jd2d_3cQh() {
    assertEquals(
      "Jd2d 3cQh",
      Solver.process("texas-holdem 3d5d8h8sKc Jd2d 3cQh"));
  }

  @Test
  public void test_texas_holdem_8858_3h7d8hJsKd_2cQs_2hKc_AcQh_Jc8d_6hTd_8s7h_Ks3s() {
    assertEquals(
      "6hTd 2cQs AcQh 2hKc 8s7h Jc8d Ks3s",
      Solver.process("texas-holdem 3h7d8hJsKd 2cQs 2hKc AcQh Jc8d 6hTd 8s7h Ks3s"));
  }

  @Test
  public void test_texas_holdem_8859_5h8d9sJhTd_Ac8s_4h7d_Ks2s_9dAd_9c2c_Kc6d_4s8c_QsKd() {
    assertEquals(
      "Kc6d=Ks2s 4s8c Ac8s 9c2c 9dAd 4h7d QsKd",
      Solver.process("texas-holdem 5h8d9sJhTd Ac8s 4h7d Ks2s 9dAd 9c2c Kc6d 4s8c QsKd"));
  }

  @Test
  public void test_texas_holdem_8860_2h5h9c9dJc_2s7c_5cTs_9s7h_3d8s_AdJd_As4s() {
    assertEquals(
      "3d8s As4s 2s7c 5cTs AdJd 9s7h",
      Solver.process("texas-holdem 2h5h9c9dJc 2s7c 5cTs 9s7h 3d8s AdJd As4s"));
  }

  @Test
  public void test_texas_holdem_8861_2c5c8hKcQc_3d9d_4dTd_Ks2h_3cTc_2d6d() {
    assertEquals(
      "3d9d 4dTd 2d6d Ks2h 3cTc",
      Solver.process("texas-holdem 2c5c8hKcQc 3d9d 4dTd Ks2h 3cTc 2d6d"));
  }

  @Test
  public void test_texas_holdem_8862_4c5c5h5sKh_8dKs_ThTs_2s6c() {
    assertEquals(
      "2s6c ThTs 8dKs",
      Solver.process("texas-holdem 4c5c5h5sKh 8dKs ThTs 2s6c"));
  }

  @Test
  public void test_texas_holdem_8863_4s5c9cKhQh_5h8h_Jh7s() {
    assertEquals(
      "Jh7s 5h8h",
      Solver.process("texas-holdem 4s5c9cKhQh 5h8h Jh7s"));
  }

  @Test
  public void test_texas_holdem_8864_3s4c8cAhTd_Js6c_QdKh() {
    assertEquals(
      "Js6c QdKh",
      Solver.process("texas-holdem 3s4c8cAhTd Js6c QdKh"));
  }

  @Test
  public void test_texas_holdem_8865_4h5hKhQhTh_6h6c_Ks2h_9d8s_3d2s_4c2d_5dKd_9s7c_2c7h() {
    assertEquals(
      "3d2s=4c2d=5dKd=9d8s=9s7c=Ks2h 6h6c 2c7h",
      Solver.process("texas-holdem 4h5hKhQhTh 6h6c Ks2h 9d8s 3d2s 4c2d 5dKd 9s7c 2c7h"));
  }

  @Test
  public void test_texas_holdem_8866_2h3h9dKhTs_8h2c_8s6s_Ad9c() {
    assertEquals(
      "8s6s 8h2c Ad9c",
      Solver.process("texas-holdem 2h3h9dKhTs 8h2c 8s6s Ad9c"));
  }

  @Test
  public void test_texas_holdem_8867_3d5s9hJdQs_AsAd_Tc2d_8c8s_7d9c_3hQh_6c7h() {
    assertEquals(
      "6c7h Tc2d 8c8s 7d9c AsAd 3hQh",
      Solver.process("texas-holdem 3d5s9hJdQs AsAd Tc2d 8c8s 7d9c 3hQh 6c7h"));
  }

  @Test
  public void test_texas_holdem_8868_4s5sAdKcKs_4c6h_Td3s_2c8d_8hAc() {
    assertEquals(
      "2c8d Td3s 4c6h 8hAc",
      Solver.process("texas-holdem 4s5sAdKcKs 4c6h Td3s 2c8d 8hAc"));
  }

  @Test
  public void test_texas_holdem_8869_4d6h9cAcKh_Qh3c_2h6s_7hAs_Ah4s_6dTd_4c7s_2s3d() {
    assertEquals(
      "2s3d Qh3c 4c7s 2h6s 6dTd 7hAs Ah4s",
      Solver.process("texas-holdem 4d6h9cAcKh Qh3c 2h6s 7hAs Ah4s 6dTd 4c7s 2s3d"));
  }

  @Test
  public void test_texas_holdem_8870_3h4s6h9hKs_8s4h_3d2d_Qc2s_QdTc_4d3c_8hKd_9cAd_Qs8d() {
    assertEquals(
      "Qc2s Qs8d QdTc 3d2d 8s4h 9cAd 8hKd 4d3c",
      Solver.process("texas-holdem 3h4s6h9hKs 8s4h 3d2d Qc2s QdTc 4d3c 8hKd 9cAd Qs8d"));
  }

  @Test
  public void test_texas_holdem_8871_2h4c6hAcQd_KsTs_7d4s_6s2c_Qc8s_5h4h_6d7s_7c3s() {
    assertEquals(
      "7c3s KsTs 5h4h 7d4s 6d7s Qc8s 6s2c",
      Solver.process("texas-holdem 2h4c6hAcQd KsTs 7d4s 6s2c Qc8s 5h4h 6d7s 7c3s"));
  }

  @Test
  public void test_texas_holdem_8872_4dAcJsKcKd_2c6s_7cQc_3h7d_8d7s_9sAs_6cTd_QhTc_Jd4c_5c8s() {
    assertEquals(
      "2c6s 3h7d 5c8s=8d7s 6cTd 7cQc Jd4c 9sAs QhTc",
      Solver.process("texas-holdem 4dAcJsKcKd 2c6s 7cQc 3h7d 8d7s 9sAs 6cTd QhTc Jd4c 5c8s"));
  }

  @Test
  public void test_texas_holdem_8873_2d3s8s9cKd_8h9d_7dKh() {
    assertEquals(
      "7dKh 8h9d",
      Solver.process("texas-holdem 2d3s8s9cKd 8h9d 7dKh"));
  }

  @Test
  public void test_texas_holdem_8874_4c6h9sAcKh_7dJh_As4h() {
    assertEquals(
      "7dJh As4h",
      Solver.process("texas-holdem 4c6h9sAcKh 7dJh As4h"));
  }

  @Test
  public void test_texas_holdem_8875_5h5s6d9dAs_7h8s_3s4c_9s2c_7cAh_6sKh_5cJd() {
    assertEquals(
      "3s4c 6sKh 9s2c 7cAh 5cJd 7h8s",
      Solver.process("texas-holdem 5h5s6d9dAs 7h8s 3s4c 9s2c 7cAh 6sKh 5cJd"));
  }

  @Test
  public void test_texas_holdem_8876_4d7hAsJsKc_5dQh_Ac8d_KdTc_2d6h_6c9d_5s5h() {
    assertEquals(
      "2d6h 6c9d 5dQh 5s5h KdTc Ac8d",
      Solver.process("texas-holdem 4d7hAsJsKc 5dQh Ac8d KdTc 2d6h 6c9d 5s5h"));
  }

  @Test
  public void test_texas_holdem_8877_2d2h6s9hTh_7cKd_6cAs_Ah8d_9sJs_Jh7d_5s9c_Qd4h_2sKh_4cQc() {
    assertEquals(
      "Jh7d 4cQc=Qd4h 7cKd Ah8d 6cAs 5s9c 9sJs 2sKh",
      Solver.process("texas-holdem 2d2h6s9hTh 7cKd 6cAs Ah8d 9sJs Jh7d 5s9c Qd4h 2sKh 4cQc"));
  }

  @Test
  public void test_texas_holdem_8878_2c3c7c9cKd_2hAc_Qs5s_4c5d_JcTc_Ts8d_Kc8c_7h5h_Ad3d_9h3h() {
    assertEquals(
      "Ts8d Qs5s Ad3d 7h5h 9h3h 4c5d JcTc Kc8c 2hAc",
      Solver.process("texas-holdem 2c3c7c9cKd 2hAc Qs5s 4c5d JcTc Ts8d Kc8c 7h5h Ad3d 9h3h"));
  }

  @Test
  public void test_texas_holdem_8879_5c6c8hAcAs_JhAd_8d2d_6h4c_9sTd_9cQc_4hTh_Js7s_Jc2c() {
    assertEquals(
      "4hTh 9sTd Js7s 6h4c 8d2d JhAd Jc2c 9cQc",
      Solver.process("texas-holdem 5c6c8hAcAs JhAd 8d2d 6h4c 9sTd 9cQc 4hTh Js7s Jc2c"));
  }

  @Test
  public void test_texas_holdem_8880_4h6c8s9sJh_5s2s_3s8c_4sAd_2h3h_Jd7s_5d7h_6dQd_TdTc() {
    assertEquals(
      "2h3h 5s2s 4sAd 6dQd 3s8c TdTc Jd7s 5d7h",
      Solver.process("texas-holdem 4h6c8s9sJh 5s2s 3s8c 4sAd 2h3h Jd7s 5d7h 6dQd TdTc"));
  }

  @Test
  public void test_texas_holdem_8881_3s4s5h6c9h_TdAh_7dQd() {
    assertEquals(
      "TdAh 7dQd",
      Solver.process("texas-holdem 3s4s5h6c9h TdAh 7dQd"));
  }

  @Test
  public void test_texas_holdem_8882_2h3d7h9sAc_6hJh_Qd8h_Ks9c_QhKd_4d6d_2d7d_3c8c() {
    assertEquals(
      "4d6d 6hJh Qd8h QhKd 3c8c Ks9c 2d7d",
      Solver.process("texas-holdem 2h3d7h9sAc 6hJh Qd8h Ks9c QhKd 4d6d 2d7d 3c8c"));
  }

  @Test
  public void test_texas_holdem_8883_3s4d6cKhKs_9dAd_8hKc() {
    assertEquals(
      "9dAd 8hKc",
      Solver.process("texas-holdem 3s4d6cKhKs 9dAd 8hKc"));
  }

  @Test
  public void test_texas_holdem_8884_2hJhKdQcQh_5c2d_Qd2s_8dTs_Ks7d() {
    assertEquals(
      "8dTs 5c2d Ks7d Qd2s",
      Solver.process("texas-holdem 2hJhKdQcQh 5c2d Qd2s 8dTs Ks7d"));
  }

  @Test
  public void test_texas_holdem_8885_2d6h9c9dKd_7cTh_5s6d_7d8d() {
    assertEquals(
      "7cTh 5s6d 7d8d",
      Solver.process("texas-holdem 2d6h9c9dKd 7cTh 5s6d 7d8d"));
  }

  @Test
  public void test_texas_holdem_8886_2s5cAcJdKc_Th3c_7c8d_AdQc_Ts4h_8h5d() {
    assertEquals(
      "7c8d Th3c=Ts4h 8h5d AdQc",
      Solver.process("texas-holdem 2s5cAcJdKc Th3c 7c8d AdQc Ts4h 8h5d"));
  }

  @Test
  public void test_texas_holdem_8887_3h3s9dJhQs_6cTh_4h6d_AhQd() {
    assertEquals(
      "4h6d 6cTh AhQd",
      Solver.process("texas-holdem 3h3s9dJhQs 6cTh 4h6d AhQd"));
  }

  @Test
  public void test_texas_holdem_8888_3h4h7c9sTc_Kh2d_Qc6d_5d3d_2s7h_Ah9c_8c5c() {
    assertEquals(
      "8c5c Qc6d Kh2d 5d3d 2s7h Ah9c",
      Solver.process("texas-holdem 3h4h7c9sTc Kh2d Qc6d 5d3d 2s7h Ah9c 8c5c"));
  }

  @Test
  public void test_texas_holdem_8889_2s3c7hKhQc_5cJs_4sAd_9cQd_4c6s() {
    assertEquals(
      "4c6s 5cJs 4sAd 9cQd",
      Solver.process("texas-holdem 2s3c7hKhQc 5cJs 4sAd 9cQd 4c6s"));
  }

  @Test
  public void test_texas_holdem_8890_3s7s8c8hAs_5h6c_5cQc_JcQh_7dKd_9h9c_4hJh() {
    assertEquals(
      "5h6c 4hJh 5cQc JcQh 7dKd 9h9c",
      Solver.process("texas-holdem 3s7s8c8hAs 5h6c 5cQc JcQh 7dKd 9h9c 4hJh"));
  }

  @Test
  public void test_texas_holdem_8891_6d9hAhKdQh_JhKs_3d3c_7s8h_5dJd_8s2d() {
    assertEquals(
      "7s8h=8s2d 5dJd 3d3c JhKs",
      Solver.process("texas-holdem 6d9hAhKdQh JhKs 3d3c 7s8h 5dJd 8s2d"));
  }

  @Test
  public void test_texas_holdem_8892_2c2d2s8s9s_Tc3d_4s4h() {
    assertEquals(
      "Tc3d 4s4h",
      Solver.process("texas-holdem 2c2d2s8s9s Tc3d 4s4h"));
  }

  @Test
  public void test_texas_holdem_8893_2s9cJdKdTh_6hAh_4sQc_Jh9d_6sAd_2h9s_4hTd_7s9h() {
    assertEquals(
      "6hAh=6sAd 7s9h 4hTd 2h9s Jh9d 4sQc",
      Solver.process("texas-holdem 2s9cJdKdTh 6hAh 4sQc Jh9d 6sAd 2h9s 4hTd 7s9h"));
  }

  @Test
  public void test_texas_holdem_8894_3d3s5h7s9c_2c4h_9d6s_Ks5c() {
    assertEquals(
      "2c4h Ks5c 9d6s",
      Solver.process("texas-holdem 3d3s5h7s9c 2c4h 9d6s Ks5c"));
  }

  @Test
  public void test_texas_holdem_8895_4c4h5s7sQs_9h3c_AsKh_6hKd_7cJc() {
    assertEquals(
      "9h3c 6hKd AsKh 7cJc",
      Solver.process("texas-holdem 4c4h5s7sQs 9h3c AsKh 6hKd 7cJc"));
  }

  @Test
  public void test_texas_holdem_8896_2h8s9sAcTc_AhJd_Qd6c_8hKc() {
    assertEquals(
      "Qd6c 8hKc AhJd",
      Solver.process("texas-holdem 2h8s9sAcTc AhJd Qd6c 8hKc"));
  }

  @Test
  public void test_texas_holdem_8897_5c5dJhKcKh_9s6c_Ks2c_Js6s_7h3c() {
    assertEquals(
      "7h3c=9s6c Js6s Ks2c",
      Solver.process("texas-holdem 5c5dJhKcKh 9s6c Ks2c Js6s 7h3c"));
  }

  @Test
  public void test_texas_holdem_8898_3c5c8h9c9s_JdTc_8sAd_3d5d_4sAh_QsAc() {
    assertEquals(
      "JdTc 4sAh QsAc 3d5d 8sAd",
      Solver.process("texas-holdem 3c5c8h9c9s JdTc 8sAd 3d5d 4sAh QsAc"));
  }

  @Test
  public void test_texas_holdem_8899_4c7c8d8hKh_6s2c_Ah7s_Kd9h() {
    assertEquals(
      "6s2c Ah7s Kd9h",
      Solver.process("texas-holdem 4c7c8d8hKh 6s2c Ah7s Kd9h"));
  }

  @Test
  public void test_texas_holdem_8900_2s3d9dQcQs_Ah9c_7s7d_Th5c_9s4c_7cQh_6d8s_5d2h_KhTd() {
    assertEquals(
      "6d8s Th5c KhTd 5d2h 7s7d 9s4c Ah9c 7cQh",
      Solver.process("texas-holdem 2s3d9dQcQs Ah9c 7s7d Th5c 9s4c 7cQh 6d8s 5d2h KhTd"));
  }

  @Test
  public void test_texas_holdem_8901_7s8sAcKdQd_5sTh_7h8c_Qc9s() {
    assertEquals(
      "5sTh Qc9s 7h8c",
      Solver.process("texas-holdem 7s8sAcKdQd 5sTh 7h8c Qc9s"));
  }

  @Test
  public void test_texas_holdem_8902_3d4s6h7h9h_5sAc_6s8s_3c6c_3h5c_2d8h_4d8d_Ad3s() {
    assertEquals(
      "2d8h Ad3s 4d8d 6s8s 3c6c 3h5c=5sAc",
      Solver.process("texas-holdem 3d4s6h7h9h 5sAc 6s8s 3c6c 3h5c 2d8h 4d8d Ad3s"));
  }

  @Test
  public void test_texas_holdem_8903_4d6c9cJdKh_6dAs_9dQd_AdAc_7hJc_Kd3s_6sTd_3c4h() {
    assertEquals(
      "3c4h 6sTd 6dAs 9dQd 7hJc Kd3s AdAc",
      Solver.process("texas-holdem 4d6c9cJdKh 6dAs 9dQd AdAc 7hJc Kd3s 6sTd 3c4h"));
  }

  @Test
  public void test_texas_holdem_8904_3c3h6hAhJs_5dAc_6s8c_Kc3d_6d5h_7s9c_Td9h_QcTh() {
    assertEquals(
      "7s9c Td9h QcTh 6d5h=6s8c 5dAc Kc3d",
      Solver.process("texas-holdem 3c3h6hAhJs 5dAc 6s8c Kc3d 6d5h 7s9c Td9h QcTh"));
  }

  @Test
  public void test_texas_holdem_8905_3d3s6hJdKh_3c4d_Jh7c_9h5c() {
    assertEquals(
      "9h5c Jh7c 3c4d",
      Solver.process("texas-holdem 3d3s6hJdKh 3c4d Jh7c 9h5c"));
  }

  @Test
  public void test_texas_holdem_8906_2h4c7sAcKc_TcKs_8dJs_6h5d() {
    assertEquals(
      "6h5d 8dJs TcKs",
      Solver.process("texas-holdem 2h4c7sAcKc TcKs 8dJs 6h5d"));
  }

  @Test
  public void test_texas_holdem_8907_2d7hQdQsTs_Jd4s_Qh4c_8sAc_Th5h_9c5s_9hAh_8c4h_As8h_6h9d() {
    assertEquals(
      "8c4h 6h9d=9c5s Jd4s 8sAc=As8h 9hAh Th5h Qh4c",
      Solver.process("texas-holdem 2d7hQdQsTs Jd4s Qh4c 8sAc Th5h 9c5s 9hAh 8c4h As8h 6h9d"));
  }

  @Test
  public void test_texas_holdem_8908_4s9d9hAdQd_8h2h_Js5d() {
    assertEquals(
      "8h2h Js5d",
      Solver.process("texas-holdem 4s9d9hAdQd 8h2h Js5d"));
  }

  @Test
  public void test_texas_holdem_8909_3d5cAdQdTc_2sJs_Th5s_8h2d_7h5h_3c9s_3s8s_6sAc() {
    assertEquals(
      "8h2d 2sJs 3c9s=3s8s 7h5h 6sAc Th5s",
      Solver.process("texas-holdem 3d5cAdQdTc 2sJs Th5s 8h2d 7h5h 3c9s 3s8s 6sAc"));
  }

  @Test
  public void test_texas_holdem_8910_2s5c6hAsJd_KhTh_4sTc_4hKc_4dQh_KdAd_Ts9c_3d8c_2hQc_Js8h() {
    assertEquals(
      "3d8c 4sTc Ts9c 4dQh 4hKc KhTh 2hQc Js8h KdAd",
      Solver.process("texas-holdem 2s5c6hAsJd KhTh 4sTc 4hKc 4dQh KdAd Ts9c 3d8c 2hQc Js8h"));
  }

  @Test
  public void test_texas_holdem_8911_2c3s6c7d8h_Ad4c_JhQd_5s3c_TcAc_ThKs_4dKh_6dTd_8dAs() {
    assertEquals(
      "JhQd 4dKh ThKs Ad4c TcAc 5s3c 6dTd 8dAs",
      Solver.process("texas-holdem 2c3s6c7d8h Ad4c JhQd 5s3c TcAc ThKs 4dKh 6dTd 8dAs"));
  }

  @Test
  public void test_texas_holdem_8912_2h4h9cTcTh_3h3s_8c6h() {
    assertEquals(
      "8c6h 3h3s",
      Solver.process("texas-holdem 2h4h9cTcTh 3h3s 8c6h"));
  }

  @Test
  public void test_texas_holdem_8913_3s5h6s9sQd_8hAd_Kh3h_5sAc_8s4h_2s5d_8c5c_7cTh() {
    assertEquals(
      "8s4h 7cTh 8hAd Kh3h 2s5d 8c5c 5sAc",
      Solver.process("texas-holdem 3s5h6s9sQd 8hAd Kh3h 5sAc 8s4h 2s5d 8c5c 7cTh"));
  }

  @Test
  public void test_texas_holdem_8914_6d7dAhKhTh_5s6c_7h9d_3cAd_7c5d() {
    assertEquals(
      "5s6c 7c5d=7h9d 3cAd",
      Solver.process("texas-holdem 6d7dAhKhTh 5s6c 7h9d 3cAd 7c5d"));
  }

  @Test
  public void test_texas_holdem_8915_3d4c6c9dQs_6hKd_KcKh_4d8h_5cQc() {
    assertEquals(
      "4d8h 6hKd 5cQc KcKh",
      Solver.process("texas-holdem 3d4c6c9dQs 6hKd KcKh 4d8h 5cQc"));
  }

  @Test
  public void test_texas_holdem_8916_2h6c6s7c7d_JhAd_3s2d_9s3h_JdKc() {
    assertEquals(
      "3s2d 9s3h JdKc JhAd",
      Solver.process("texas-holdem 2h6c6s7c7d JhAd 3s2d 9s3h JdKc"));
  }

  @Test
  public void test_texas_holdem_8917_5c5d6cKcQs_QhTc_8c2h_QdJd_7s5s_8sKd_8d2d_JhAh() {
    assertEquals(
      "8c2h=8d2d JhAh QdJd=QhTc 8sKd 7s5s",
      Solver.process("texas-holdem 5c5d6cKcQs QhTc 8c2h QdJd 7s5s 8sKd 8d2d JhAh"));
  }

  @Test
  public void test_texas_holdem_8918_6s9cAdJdJh_7h9s_8s5h() {
    assertEquals(
      "8s5h 7h9s",
      Solver.process("texas-holdem 6s9cAdJdJh 7h9s 8s5h"));
  }

  @Test
  public void test_texas_holdem_8919_2c5s9dAhQh_As9h_TdKd_3c4d_KcKh_3d8c_QcKs() {
    assertEquals(
      "3d8c TdKd QcKs KcKh As9h 3c4d",
      Solver.process("texas-holdem 2c5s9dAhQh As9h TdKd 3c4d KcKh 3d8c QcKs"));
  }

  @Test
  public void test_texas_holdem_8920_2c2h4h8cTd_KdTs_Kc3c_AdAc() {
    assertEquals(
      "Kc3c KdTs AdAc",
      Solver.process("texas-holdem 2c2h4h8cTd KdTs Kc3c AdAc"));
  }

  @Test
  public void test_texas_holdem_8921_4d5d8s9cTc_3sQh_7dKc_4c9d() {
    assertEquals(
      "3sQh 7dKc 4c9d",
      Solver.process("texas-holdem 4d5d8s9cTc 3sQh 7dKc 4c9d"));
  }

  @Test
  public void test_texas_holdem_8922_6c6sAdKdKs_7h5s_8h4c_4h7c_QcJc_Ac2h_Tc2c_6d5c() {
    assertEquals(
      "4h7c=7h5s=8h4c=QcJc=Tc2c Ac2h 6d5c",
      Solver.process("texas-holdem 6c6sAdKdKs 7h5s 8h4c 4h7c QcJc Ac2h Tc2c 6d5c"));
  }

  @Test
  public void test_texas_holdem_8923_2c4h5d9hJs_Kh8c_9s3s_Jh8d_2dTh_2s2h_5hKc_Qc6h() {
    assertEquals(
      "Qc6h Kh8c 2dTh 5hKc 9s3s Jh8d 2s2h",
      Solver.process("texas-holdem 2c4h5d9hJs Kh8c 9s3s Jh8d 2dTh 2s2h 5hKc Qc6h"));
  }

  @Test
  public void test_texas_holdem_8924_2sAcJcKhTd_TsJh_JsTh_Jd5d() {
    assertEquals(
      "Jd5d JsTh=TsJh",
      Solver.process("texas-holdem 2sAcJcKhTd TsJh JsTh Jd5d"));
  }

  @Test
  public void test_texas_holdem_8925_4s8dJhKhQh_8sTd_3c6h_9h4d_8cKs_2hQd() {
    assertEquals(
      "3c6h 9h4d 8sTd 2hQd 8cKs",
      Solver.process("texas-holdem 4s8dJhKhQh 8sTd 3c6h 9h4d 8cKs 2hQd"));
  }

  @Test
  public void test_texas_holdem_8926_4c7h7s9hTc_6c5c_7c5h_4hAh_2hTd_Jc5d_Js2s_3h9c_2cTs() {
    assertEquals(
      "6c5c Jc5d=Js2s 4hAh 3h9c 2cTs=2hTd 7c5h",
      Solver.process("texas-holdem 4c7h7s9hTc 6c5c 7c5h 4hAh 2hTd Jc5d Js2s 3h9c 2cTs"));
  }

  @Test
  public void test_texas_holdem_8927_3h7d7sJsQs_Kc6d_5c6c_2s9s_2dAs_2hJh() {
    assertEquals(
      "5c6c Kc6d 2dAs 2hJh 2s9s",
      Solver.process("texas-holdem 3h7d7sJsQs Kc6d 5c6c 2s9s 2dAs 2hJh"));
  }

  @Test
  public void test_texas_holdem_8928_6sAdAsJhKs_QdAc_5s5h_8h4c_Ts7d_Jc2c_4sKh_3hTc_5cJd() {
    assertEquals(
      "8h4c 3hTc=Ts7d 5s5h 5cJd=Jc2c 4sKh QdAc",
      Solver.process("texas-holdem 6sAdAsJhKs QdAc 5s5h 8h4c Ts7d Jc2c 4sKh 3hTc 5cJd"));
  }

  @Test
  public void test_texas_holdem_8929_4d6cAhKdTc_Js2h_5d9s_2dJc_5c7h_ThAd_Qd6h_3h9d_7c7d() {
    assertEquals(
      "5c7h 3h9d=5d9s 2dJc=Js2h Qd6h 7c7d ThAd",
      Solver.process("texas-holdem 4d6cAhKdTc Js2h 5d9s 2dJc 5c7h ThAd Qd6h 3h9d 7c7d"));
  }

  @Test
  public void test_texas_holdem_8930_4dAcQdTcTs_7s9d_5dQc_8sJh_Jc6c_9hTd_7d5h_AsKs_KhKd() {
    assertEquals(
      "7d5h 7s9d 8sJh=Jc6c 5dQc KhKd AsKs 9hTd",
      Solver.process("texas-holdem 4dAcQdTcTs 7s9d 5dQc 8sJh Jc6c 9hTd 7d5h AsKs KhKd"));
  }

  @Test
  public void test_texas_holdem_8931_8d9sJcQdTd_JsTc_6c8h_3h3s_AdKh_JhAs() {
    assertEquals(
      "3h3s=6c8h=JhAs=JsTc AdKh",
      Solver.process("texas-holdem 8d9sJcQdTd JsTc 6c8h 3h3s AdKh JhAs"));
  }

  @Test
  public void test_texas_holdem_8932_2d4cAcAhKh_8h2c_4sKd_Qh4d_7s6h_7c6s_Td3c_9h2s_Th3s() {
    assertEquals(
      "7c6s=7s6h Td3c=Th3s 8h2c=9h2s Qh4d 4sKd",
      Solver.process("texas-holdem 2d4cAcAhKh 8h2c 4sKd Qh4d 7s6h 7c6s Td3c 9h2s Th3s"));
  }

  @Test
  public void test_texas_holdem_8933_4s7h9dJdKs_3h2c_9hKc_4h4d_2h8h_TdJc_Qd3s_8dAd() {
    assertEquals(
      "3h2c 2h8h Qd3s 8dAd TdJc 9hKc 4h4d",
      Solver.process("texas-holdem 4s7h9dJdKs 3h2c 9hKc 4h4d 2h8h TdJc Qd3s 8dAd"));
  }

  @Test
  public void test_texas_holdem_8934_2d4c4d4s9h_8c2s_2hTs_7d5c_3d9s_3s9d_ThQc_JcJs() {
    assertEquals(
      "7d5c ThQc 2hTs=8c2s 3d9s=3s9d JcJs",
      Solver.process("texas-holdem 2d4c4d4s9h 8c2s 2hTs 7d5c 3d9s 3s9d ThQc JcJs"));
  }

  @Test
  public void test_texas_holdem_8935_4s8cAcJhKh_6c5s_6sJd_9hTc() {
    assertEquals(
      "6c5s 9hTc 6sJd",
      Solver.process("texas-holdem 4s8cAcJhKh 6c5s 6sJd 9hTc"));
  }

  @Test
  public void test_texas_holdem_8936_3s8d9dKdQd_AcJs_ThJh_6hAd_4h2h() {
    assertEquals(
      "4h2h AcJs ThJh 6hAd",
      Solver.process("texas-holdem 3s8d9dKdQd AcJs ThJh 6hAd 4h2h"));
  }

  @Test
  public void test_texas_holdem_8937_4h4s6s7c9c_8s5h_6cAd_5sAc_5d3d() {
    assertEquals(
      "5sAc 6cAd 5d3d 8s5h",
      Solver.process("texas-holdem 4h4s6s7c9c 8s5h 6cAd 5sAc 5d3d"));
  }

  @Test
  public void test_texas_holdem_8938_2s8s9cKhTd_Kd6d_Ah6s_QdTc_4s9s_5h8h_2c3s() {
    assertEquals(
      "Ah6s 2c3s 5h8h 4s9s QdTc Kd6d",
      Solver.process("texas-holdem 2s8s9cKhTd Kd6d Ah6s QdTc 4s9s 5h8h 2c3s"));
  }

  @Test
  public void test_texas_holdem_8939_3d6c7c7hTd_9d5h_KhJd_KsKc_3c2d_5cQc_2c4d_AsTh_Jc6d_9c7s() {
    assertEquals(
      "2c4d 9d5h 5cQc KhJd 3c2d Jc6d AsTh KsKc 9c7s",
      Solver.process("texas-holdem 3d6c7c7hTd 9d5h KhJd KsKc 3c2d 5cQc 2c4d AsTh Jc6d 9c7s"));
  }

  @Test
  public void test_texas_holdem_8940_2c6d8c9cJs_9s3c_5dTd_7c8s() {
    assertEquals(
      "5dTd 7c8s 9s3c",
      Solver.process("texas-holdem 2c6d8c9cJs 9s3c 5dTd 7c8s"));
  }

  @Test
  public void test_texas_holdem_8941_3h5hJcJhKc_KhQc_6c7d_Qs5c_3c9s_2dKs_Ts8c_6d6s() {
    assertEquals(
      "6c7d Ts8c 3c9s Qs5c 6d6s 2dKs KhQc",
      Solver.process("texas-holdem 3h5hJcJhKc KhQc 6c7d Qs5c 3c9s 2dKs Ts8c 6d6s"));
  }

  @Test
  public void test_texas_holdem_8942_2c8d8hKcKh_5hTh_4cAh_Js7h_Qs4s_Tc5d_Ad9c_4dTs_AcKs() {
    assertEquals(
      "4dTs=5hTh=Tc5d Js7h Qs4s 4cAh=Ad9c AcKs",
      Solver.process("texas-holdem 2c8d8hKcKh 5hTh 4cAh Js7h Qs4s Tc5d Ad9c 4dTs AcKs"));
  }

  @Test
  public void test_texas_holdem_8943_4d7s8h9sKd_4h5h_2hQc_5d8d_6dJh_Ac5c_Kc3h_Ad2s_Ks2d() {
    assertEquals(
      "6dJh 2hQc Ac5c=Ad2s 4h5h 5d8d Kc3h=Ks2d",
      Solver.process("texas-holdem 4d7s8h9sKd 4h5h 2hQc 5d8d 6dJh Ac5c Kc3h Ad2s Ks2d"));
  }

  @Test
  public void test_texas_holdem_8944_2s3d6s8dKd_5h8s_Ad6h_JsQh_2dTs_6dQs_JdQd_5s2h_4c4s() {
    assertEquals(
      "JsQh 5s2h 2dTs 4c4s 6dQs Ad6h 5h8s JdQd",
      Solver.process("texas-holdem 2s3d6s8dKd 5h8s Ad6h JsQh 2dTs 6dQs JdQd 5s2h 4c4s"));
  }

  @Test
  public void test_texas_holdem_8945_5c5h7cAhQc_Ad7d_4dTh() {
    assertEquals(
      "4dTh Ad7d",
      Solver.process("texas-holdem 5c5h7cAhQc Ad7d 4dTh"));
  }

  @Test
  public void test_texas_holdem_8946_3s4c5d9c9h_Ad7h_Js8d_Ah9s_9d5h_ThAs_Td7c_6hJd_3dKs_4dKd() {
    assertEquals(
      "Td7c 6hJd Js8d Ad7h ThAs 3dKs 4dKd Ah9s 9d5h",
      Solver.process("texas-holdem 3s4c5d9c9h Ad7h Js8d Ah9s 9d5h ThAs Td7c 6hJd 3dKs 4dKd"));
  }

  @Test
  public void test_texas_holdem_8947_3d4d7h8cJs_8sQh_4sAd_ThAs_7cTd_9h6c_7dQc() {
    assertEquals(
      "9h6c ThAs 4sAd 7cTd 7dQc 8sQh",
      Solver.process("texas-holdem 3d4d7h8cJs 8sQh 4sAd ThAs 7cTd 9h6c 7dQc"));
  }

  @Test
  public void test_texas_holdem_8948_5c9sAcJdKs_8h2c_3hAh_8sKh_6d9d_QdTh_QhKd_4s4d() {
    assertEquals(
      "8h2c 4s4d 6d9d 8sKh QhKd 3hAh QdTh",
      Solver.process("texas-holdem 5c9sAcJdKs 8h2c 3hAh 8sKh 6d9d QdTh QhKd 4s4d"));
  }

  @Test
  public void test_texas_holdem_8949_2h3c3d4h8s_9s4d_6h5s_Js9c() {
    assertEquals(
      "Js9c 9s4d 6h5s",
      Solver.process("texas-holdem 2h3c3d4h8s 9s4d 6h5s Js9c"));
  }

  @Test
  public void test_texas_holdem_8950_2h4h8dAcKd_4s2s_3d5s_8s5c_As7c_Tc9s_9d3c_8c6d_QhAd_5d7h() {
    assertEquals(
      "5d7h 9d3c Tc9s 8s5c 8c6d As7c QhAd 4s2s 3d5s",
      Solver.process("texas-holdem 2h4h8dAcKd 4s2s 3d5s 8s5c As7c Tc9s 9d3c 8c6d QhAd 5d7h"));
  }

  @Test
  public void test_texas_holdem_8951_2sAsJdTdTs_Qd8h_Qc4c_KcAh_Tc4h_7d9d_2h2c_AcQs_3cTh() {
    assertEquals(
      "7d9d Qc4c=Qd8h AcQs KcAh 3cTh=Tc4h 2h2c",
      Solver.process("texas-holdem 2sAsJdTdTs Qd8h Qc4c KcAh Tc4h 7d9d 2h2c AcQs 3cTh"));
  }

  @Test
  public void test_texas_holdem_8952_5s7dAsJdKc_6cAc_8c6h_4c9d_9s2d_9cAd_Qd8d_JhTh_7cTd_Ks6d() {
    assertEquals(
      "8c6h 4c9d=9s2d Qd8d 7cTd JhTh Ks6d 6cAc 9cAd",
      Solver.process("texas-holdem 5s7dAsJdKc 6cAc 8c6h 4c9d 9s2d 9cAd Qd8d JhTh 7cTd Ks6d"));
  }

  @Test
  public void test_texas_holdem_8953_3h4s5h8dQs_3sQd_KcJd_Ac4h_Jc7d_5d2s() {
    assertEquals(
      "Jc7d KcJd Ac4h 5d2s 3sQd",
      Solver.process("texas-holdem 3h4s5h8dQs 3sQd KcJd Ac4h Jc7d 5d2s"));
  }

  @Test
  public void test_texas_holdem_8954_2d2h3s5h9h_3c4h_9sJh_4dTd() {
    assertEquals(
      "4dTd 3c4h 9sJh",
      Solver.process("texas-holdem 2d2h3s5h9h 3c4h 9sJh 4dTd"));
  }

  @Test
  public void test_texas_holdem_8955_7hAhAsKsQc_6c4d_8c6s_JsTs_ThAc() {
    assertEquals(
      "6c4d 8c6s ThAc JsTs",
      Solver.process("texas-holdem 7hAhAsKsQc 6c4d 8c6s JsTs ThAc"));
  }

  @Test
  public void test_texas_holdem_8956_5d6s7c7hAh_8c4h_2h7d_Ks2d_Ad3h_Tc2c_6d8h() {
    assertEquals(
      "Tc2c Ks2d 6d8h Ad3h 2h7d 8c4h",
      Solver.process("texas-holdem 5d6s7c7hAh 8c4h 2h7d Ks2d Ad3h Tc2c 6d8h"));
  }

  @Test
  public void test_texas_holdem_8957_2d5s8s9d9h_6c6d_TcAd_3cAs_Qs6s() {
    assertEquals(
      "Qs6s 3cAs TcAd 6c6d",
      Solver.process("texas-holdem 2d5s8s9d9h 6c6d TcAd 3cAs Qs6s"));
  }

  @Test
  public void test_texas_holdem_8958_2d8c9sAdAs_5d5h_3c7c_9d8h_7dTc_6h4c() {
    assertEquals(
      "6h4c 3c7c 7dTc 5d5h 9d8h",
      Solver.process("texas-holdem 2d8c9sAdAs 5d5h 3c7c 9d8h 7dTc 6h4c"));
  }

  @Test
  public void test_texas_holdem_8959_2h4d8sAdKc_5s4s_TsJd_3sQc_2sKs() {
    assertEquals(
      "TsJd 3sQc 5s4s 2sKs",
      Solver.process("texas-holdem 2h4d8sAdKc 5s4s TsJd 3sQc 2sKs"));
  }

  @Test
  public void test_texas_holdem_8960_6c6sAhAsTd_JhTs_Ac7c_9d5c() {
    assertEquals(
      "9d5c JhTs Ac7c",
      Solver.process("texas-holdem 6c6sAhAsTd JhTs Ac7c 9d5c"));
  }

  @Test
  public void test_texas_holdem_8961_5s7s9dAhQd_4d4s_TdJc_7cTc_9s6d_9hJd_3hAc_2hKc() {
    assertEquals(
      "TdJc 2hKc 4d4s 7cTc 9s6d 9hJd 3hAc",
      Solver.process("texas-holdem 5s7s9dAhQd 4d4s TdJc 7cTc 9s6d 9hJd 3hAc 2hKc"));
  }

  @Test
  public void test_texas_holdem_8962_2c4d7h9sJc_Qd8d_3sAc_6d9c_Qh2s_AdKs_3c5d_QsQc() {
    assertEquals(
      "3c5d Qd8d 3sAc AdKs Qh2s 6d9c QsQc",
      Solver.process("texas-holdem 2c4d7h9sJc Qd8d 3sAc 6d9c Qh2s AdKs 3c5d QsQc"));
  }

  @Test
  public void test_texas_holdem_8963_2h5h7cQhQs_ThQc_9c7h_Kh2s_9sAd_7sAs_3h5d_8d3d_Js6d_5sTs() {
    assertEquals(
      "8d3d Js6d 9sAd Kh2s 3h5d 5sTs 9c7h 7sAs ThQc",
      Solver.process("texas-holdem 2h5h7cQhQs ThQc 9c7h Kh2s 9sAd 7sAs 3h5d 8d3d Js6d 5sTs"));
  }

  @Test
  public void test_texas_holdem_8964_5cJcKdQdQs_2d2c_4sJs() {
    assertEquals(
      "2d2c 4sJs",
      Solver.process("texas-holdem 5cJcKdQdQs 2d2c 4sJs"));
  }

  @Test
  public void test_texas_holdem_8965_9hAcAhKsQh_3cQs_8dJh_6c3d_2dQd_6h6d_QcJs_ThKh() {
    assertEquals(
      "6c3d 8dJh 6h6d 2dQd=3cQs=QcJs ThKh",
      Solver.process("texas-holdem 9hAcAhKsQh 3cQs 8dJh 6c3d 2dQd 6h6d QcJs ThKh"));
  }

  @Test
  public void test_texas_holdem_8966_6d6h9cKcQs_5s5d_4cJs_7cAd_8cTc_Qd3h() {
    assertEquals(
      "8cTc 4cJs 7cAd 5s5d Qd3h",
      Solver.process("texas-holdem 6d6h9cKcQs 5s5d 4cJs 7cAd 8cTc Qd3h"));
  }

  @Test
  public void test_texas_holdem_8967_AcJsKcKdQd_2c4d_7d7h() {
    assertEquals(
      "2c4d 7d7h",
      Solver.process("texas-holdem AcJsKcKdQd 2c4d 7d7h"));
  }

  @Test
  public void test_texas_holdem_8968_5d5s7c8d9s_Tc7d_3c7h_Qd3h_3d4h_Ac2s_7s2d() {
    assertEquals(
      "3d4h Qd3h Ac2s 3c7h=7s2d Tc7d",
      Solver.process("texas-holdem 5d5s7c8d9s Tc7d 3c7h Qd3h 3d4h Ac2s 7s2d"));
  }

  @Test
  public void test_texas_holdem_8969_4s6sAsJhKc_7cAd_KhTh_6d2h() {
    assertEquals(
      "6d2h KhTh 7cAd",
      Solver.process("texas-holdem 4s6sAsJhKc 7cAd KhTh 6d2h"));
  }

  @Test
  public void test_texas_holdem_8970_2c8sAhJdQd_Jh6s_Qh8h() {
    assertEquals(
      "Jh6s Qh8h",
      Solver.process("texas-holdem 2c8sAhJdQd Jh6s Qh8h"));
  }

  @Test
  public void test_texas_holdem_8971_2c4h7s8hJs_ThQh_7c8c_Ac3c_Jc6h_Qc2d_5c2h() {
    assertEquals(
      "ThQh Ac3c 5c2h Qc2d Jc6h 7c8c",
      Solver.process("texas-holdem 2c4h7s8hJs ThQh 7c8c Ac3c Jc6h Qc2d 5c2h"));
  }

  @Test
  public void test_texas_holdem_8972_3d5cAdKcQc_6c4s_7sQh_3s3c() {
    assertEquals(
      "6c4s 7sQh 3s3c",
      Solver.process("texas-holdem 3d5cAdKcQc 6c4s 7sQh 3s3c"));
  }

  @Test
  public void test_texas_holdem_8973_2d5s8sAdAh_7c3d_7dJs_7sKs_3c3s_6cQs_ThJh() {
    assertEquals(
      "7c3d 7dJs ThJh 6cQs 7sKs 3c3s",
      Solver.process("texas-holdem 2d5s8sAdAh 7c3d 7dJs 7sKs 3c3s 6cQs ThJh"));
  }

  @Test
  public void test_texas_holdem_8974_4d5s7sAdTs_KdKh_6hAc_KcTc_Qh8c_2h9h_Td5d_6d6s() {
    assertEquals(
      "2h9h Qh8c 6d6s KcTc KdKh 6hAc Td5d",
      Solver.process("texas-holdem 4d5s7sAdTs KdKh 6hAc KcTc Qh8c 2h9h Td5d 6d6s"));
  }

  @Test
  public void test_texas_holdem_8975_2d6c8cQhTh_6dAd_4h2h_Jc7s() {
    assertEquals(
      "Jc7s 4h2h 6dAd",
      Solver.process("texas-holdem 2d6c8cQhTh 6dAd 4h2h Jc7s"));
  }

  @Test
  public void test_texas_holdem_8976_4d4h6d9hJs_JhAs_3sAc_8s2h() {
    assertEquals(
      "8s2h 3sAc JhAs",
      Solver.process("texas-holdem 4d4h6d9hJs JhAs 3sAc 8s2h"));
  }

  @Test
  public void test_texas_holdem_8977_4h8c9dJsTd_AdKs_4d2h_7hQc_Qd9h_AsTs() {
    assertEquals(
      "AdKs 4d2h AsTs 7hQc=Qd9h",
      Solver.process("texas-holdem 4h8c9dJsTd AdKs 4d2h 7hQc Qd9h AsTs"));
  }

  @Test
  public void test_texas_holdem_8978_3s4d6c7cKs_AsTd_JsKd_2d2h_Qd9c_4cJc_9d5h_7hTh_2sAd_Ac9s() {
    assertEquals(
      "Qd9c 2sAd Ac9s AsTd 2d2h 4cJc 7hTh JsKd 9d5h",
      Solver.process("texas-holdem 3s4d6c7cKs AsTd JsKd 2d2h Qd9c 4cJc 9d5h 7hTh 2sAd Ac9s"));
  }

  @Test
  public void test_texas_holdem_8979_3h4c7sJcKd_2dKs_6hQd_3sJs_TcTs_Ac9d() {
    assertEquals(
      "6hQd Ac9d TcTs 2dKs 3sJs",
      Solver.process("texas-holdem 3h4c7sJcKd 2dKs 6hQd 3sJs TcTs Ac9d"));
  }

  @Test
  public void test_texas_holdem_8980_2d2h4c5hAs_3c4d_7h8c_QhJh_9c8h_Kc9s_2cQc_Ts6d_ThJs() {
    assertEquals(
      "7h8c 9c8h Ts6d ThJs QhJh Kc9s 2cQc 3c4d",
      Solver.process("texas-holdem 2d2h4c5hAs 3c4d 7h8c QhJh 9c8h Kc9s 2cQc Ts6d ThJs"));
  }

  @Test
  public void test_texas_holdem_8981_2s3s6cJcKd_TsTh_KsAc_9dTc_9c8d_5cAs() {
    assertEquals(
      "9c8d 9dTc 5cAs TsTh KsAc",
      Solver.process("texas-holdem 2s3s6cJcKd TsTh KsAc 9dTc 9c8d 5cAs"));
  }

  @Test
  public void test_texas_holdem_8982_3s4d5sTcTs_QdJc_5h3c_2dQs_2c8s() {
    assertEquals(
      "2c8s 2dQs QdJc 5h3c",
      Solver.process("texas-holdem 3s4d5sTcTs QdJc 5h3c 2dQs 2c8s"));
  }

  @Test
  public void test_texas_holdem_8983_2c7c7h8sTh_KsTc_9hJh() {
    assertEquals(
      "KsTc 9hJh",
      Solver.process("texas-holdem 2c7c7h8sTh KsTc 9hJh"));
  }

  @Test
  public void test_texas_holdem_8984_2s5c8sJdTd_5hQs_Qh8h_7s9d_AsQd_3hTh() {
    assertEquals(
      "AsQd 5hQs Qh8h 3hTh 7s9d",
      Solver.process("texas-holdem 2s5c8sJdTd 5hQs Qh8h 7s9d AsQd 3hTh"));
  }

  @Test
  public void test_texas_holdem_8985_2h4s7h8sQh_6dKs_2d3h_3c9h_6s4h_9dTh_Jd8h_Kc7s_JhAc() {
    assertEquals(
      "3c9h 9dTh 6dKs JhAc 2d3h 6s4h Kc7s Jd8h",
      Solver.process("texas-holdem 2h4s7h8sQh 6dKs 2d3h 3c9h 6s4h 9dTh Jd8h Kc7s JhAc"));
  }

  @Test
  public void test_texas_holdem_8986_2c4s6h7h9s_6d6s_Jh9h_7dKc_8cQc_TcAd_Ac4h() {
    assertEquals(
      "8cQc TcAd Ac4h 7dKc Jh9h 6d6s",
      Solver.process("texas-holdem 2c4s6h7h9s 6d6s Jh9h 7dKc 8cQc TcAd Ac4h"));
  }

  @Test
  public void test_texas_holdem_8987_2s3s8h9hTh_3d3h_8s7d_TsKd() {
    assertEquals(
      "8s7d TsKd 3d3h",
      Solver.process("texas-holdem 2s3s8h9hTh 3d3h 8s7d TsKd"));
  }

  @Test
  public void test_texas_holdem_8988_4c6h8sQcQd_Td8h_7c4s() {
    assertEquals(
      "7c4s Td8h",
      Solver.process("texas-holdem 4c6h8sQcQd Td8h 7c4s"));
  }

  @Test
  public void test_texas_holdem_8989_4s7s8c9hTh_4cKc_Kd5d_6cAc_2s2c_4dQs_7c2h_QcQh_3cJc() {
    assertEquals(
      "Kd5d 2s2c 4dQs 4cKc 7c2h QcQh 6cAc 3cJc",
      Solver.process("texas-holdem 4s7s8c9hTh 4cKc Kd5d 6cAc 2s2c 4dQs 7c2h QcQh 3cJc"));
  }

  @Test
  public void test_texas_holdem_8990_2s8sQcQhTh_AsKc_Td5d_Ah3h_7h9s() {
    assertEquals(
      "7h9s Ah3h AsKc Td5d",
      Solver.process("texas-holdem 2s8sQcQhTh AsKc Td5d Ah3h 7h9s"));
  }

  @Test
  public void test_texas_holdem_8991_4s8dKdTcTd_3hTs_9c5c_4h2s_8c7s_QsAs_Jd7h_Qc2d_3d6h_2c2h() {
    assertEquals(
      "3d6h 9c5c Jd7h Qc2d QsAs 2c2h 4h2s 8c7s 3hTs",
      Solver.process("texas-holdem 4s8dKdTcTd 3hTs 9c5c 4h2s 8c7s QsAs Jd7h Qc2d 3d6h 2c2h"));
  }

  @Test
  public void test_texas_holdem_8992_2c4s6h8d9d_Jh9h_6s5h_Ad3d_6dQs_7dTd() {
    assertEquals(
      "Ad3d 6s5h 6dQs Jh9h 7dTd",
      Solver.process("texas-holdem 2c4s6h8d9d Jh9h 6s5h Ad3d 6dQs 7dTd"));
  }

  @Test
  public void test_texas_holdem_8993_7h8cAhKcKh_TdQc_8d2c_Ks4d_6dAs_7c4s() {
    assertEquals(
      "TdQc 7c4s 8d2c 6dAs Ks4d",
      Solver.process("texas-holdem 7h8cAhKcKh TdQc 8d2c Ks4d 6dAs 7c4s"));
  }

  @Test
  public void test_texas_holdem_8994_2c2d4hAhTs_As9d_Tc8d_ThTd() {
    assertEquals(
      "Tc8d As9d ThTd",
      Solver.process("texas-holdem 2c2d4hAhTs As9d Tc8d ThTd"));
  }

  @Test
  public void test_texas_holdem_8995_2s3d3h4s7s_4dJc_6hJh_Tc9d_8c5c_5hKc_6d8s_2d7d() {
    assertEquals(
      "8c5c 6d8s Tc9d 6hJh 5hKc 4dJc 2d7d",
      Solver.process("texas-holdem 2s3d3h4s7s 4dJc 6hJh Tc9d 8c5c 5hKc 6d8s 2d7d"));
  }

  @Test
  public void test_texas_holdem_8996_6s9hJcQhTh_Td9s_2s3d_5h8c_8d5s_4h2d_Ts7s_AhQc_Kc9c_5cAc() {
    assertEquals(
      "2s3d=4h2d 5cAc Ts7s AhQc Td9s 5h8c=8d5s Kc9c",
      Solver.process("texas-holdem 6s9hJcQhTh Td9s 2s3d 5h8c 8d5s 4h2d Ts7s AhQc Kc9c 5cAc"));
  }

  @Test
  public void test_texas_holdem_8997_5s8c9c9sKh_2hTd_3sJd_Kd5h_8d3h() {
    assertEquals(
      "2hTd 3sJd 8d3h Kd5h",
      Solver.process("texas-holdem 5s8c9c9sKh 2hTd 3sJd Kd5h 8d3h"));
  }

  @Test
  public void test_texas_holdem_8998_4c4h8sAhKs_6cJd_7c7h_Ac4s_9cQd_8hJs_7dQh_9h3s_2h9d_8d2d() {
    assertEquals(
      "2h9d=9h3s 6cJd 7dQh=9cQd 7c7h 8d2d=8hJs Ac4s",
      Solver.process("texas-holdem 4c4h8sAhKs 6cJd 7c7h Ac4s 9cQd 8hJs 7dQh 9h3s 2h9d 8d2d"));
  }

  @Test
  public void test_texas_holdem_8999_2d3d4h5d5h_Qc6s_Qh8d_6h3h_8s5s_8cAs_6dTh_QsKh_7s5c() {
    assertEquals(
      "Qh8d QsKh 7s5c 8s5s 8cAs 6dTh=6h3h=Qc6s",
      Solver.process("texas-holdem 2d3d4h5d5h Qc6s Qh8d 6h3h 8s5s 8cAs 6dTh QsKh 7s5c"));
  }

}
