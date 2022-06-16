
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver25HiddenTest {


  @Test
  public void test_texas_holdem_6250_3c5c5d8dTd_QcKs_7dAh() {
    assertEquals(
      "QcKs 7dAh",
      Solver.process("texas-holdem 3c5c5d8dTd QcKs 7dAh"));
  }

  @Test
  public void test_texas_holdem_6251_4d6dAsJhJs_9hKc_8hTc_5dQh_3hKs_5sQs_8s6c_7h4h_Td3s() {
    assertEquals(
      "Td3s 8hTc 5dQh=5sQs 3hKs 9hKc 7h4h 8s6c",
      Solver.process("texas-holdem 4d6dAsJhJs 9hKc 8hTc 5dQh 3hKs 5sQs 8s6c 7h4h Td3s"));
  }

  @Test
  public void test_texas_holdem_6252_4dAsJsKhTc_4s2c_6hKc_JcAh_2d2s_Qc8s_3d5d() {
    assertEquals(
      "3d5d 2d2s 4s2c 6hKc JcAh Qc8s",
      Solver.process("texas-holdem 4dAsJsKhTc 4s2c 6hKc JcAh 2d2s Qc8s 3d5d"));
  }

  @Test
  public void test_texas_holdem_6253_5s6d9dKcKh_5hAs_3d7d_TcQc_Ad6c_2s4d_7hJd_KsJs_QdJc() {
    assertEquals(
      "2s4d 3d7d 7hJd TcQc QdJc 5hAs Ad6c KsJs",
      Solver.process("texas-holdem 5s6d9dKcKh 5hAs 3d7d TcQc Ad6c 2s4d 7hJd KsJs QdJc"));
  }

  @Test
  public void test_texas_holdem_6254_2d6sJcJsQs_5h9s_AcAs() {
    assertEquals(
      "5h9s AcAs",
      Solver.process("texas-holdem 2d6sJcJsQs 5h9s AcAs"));
  }

  @Test
  public void test_texas_holdem_6255_3d3h5s8cTd_8s2s_Ad7s_Ac7h_4d6s_9d5h_Jd5d_3s2c_Kh6c_9cKs() {
    assertEquals(
      "4d6s Kh6c 9cKs Ac7h=Ad7s 9d5h Jd5d 8s2s 3s2c",
      Solver.process("texas-holdem 3d3h5s8cTd 8s2s Ad7s Ac7h 4d6s 9d5h Jd5d 3s2c Kh6c 9cKs"));
  }

  @Test
  public void test_texas_holdem_6256_6c9c9hJdJh_6dKc_3dJc_As8d_4sAd_3s4c_AhTs() {
    assertEquals(
      "3s4c 6dKc 4sAd=AhTs=As8d 3dJc",
      Solver.process("texas-holdem 6c9c9hJdJh 6dKc 3dJc As8d 4sAd 3s4c AhTs"));
  }

  @Test
  public void test_texas_holdem_6257_6d6s8s9d9h_6hTc_2sAs_2d4c_2c6c_3d2h_Qh7s() {
    assertEquals(
      "2d4c=3d2h Qh7s 2sAs 2c6c=6hTc",
      Solver.process("texas-holdem 6d6s8s9d9h 6hTc 2sAs 2d4c 2c6c 3d2h Qh7s"));
  }

  @Test
  public void test_texas_holdem_6258_3d4h7c8dAc_6hTh_Ks4d_Qh8c_2dQs_TdAs_3c5h_Jh9h_8h2c_9d7h() {
    assertEquals(
      "6hTh Jh9h 2dQs 3c5h Ks4d 9d7h 8h2c Qh8c TdAs",
      Solver.process("texas-holdem 3d4h7c8dAc 6hTh Ks4d Qh8c 2dQs TdAs 3c5h Jh9h 8h2c 9d7h"));
  }

  @Test
  public void test_texas_holdem_6259_2d4h9sAcQc_Kd7d_7c6c_5cAh_9c3c_Kc9d_QdJc_5d5s_Js5h() {
    assertEquals(
      "7c6c Js5h Kd7d 5d5s 9c3c Kc9d QdJc 5cAh",
      Solver.process("texas-holdem 2d4h9sAcQc Kd7d 7c6c 5cAh 9c3c Kc9d QdJc 5d5s Js5h"));
  }

  @Test
  public void test_texas_holdem_6260_3c7d8cAhJd_Kh5d_5h2h_2sTd() {
    assertEquals(
      "5h2h 2sTd Kh5d",
      Solver.process("texas-holdem 3c7d8cAhJd Kh5d 5h2h 2sTd"));
  }

  @Test
  public void test_texas_holdem_6261_5h6d8dKsTd_3cTh_Qh6s_4h4s_6cAc_Ts2c() {
    assertEquals(
      "4h4s Qh6s 6cAc 3cTh=Ts2c",
      Solver.process("texas-holdem 5h6d8dKsTd 3cTh Qh6s 4h4s 6cAc Ts2c"));
  }

  @Test
  public void test_texas_holdem_6262_4s6hJhKdTs_TdKc_3hKs_5dQd_3s2c_6s8d_Qc7c_8h5s() {
    assertEquals(
      "3s2c 8h5s 5dQd Qc7c 6s8d 3hKs TdKc",
      Solver.process("texas-holdem 4s6hJhKdTs TdKc 3hKs 5dQd 3s2c 6s8d Qc7c 8h5s"));
  }

  @Test
  public void test_texas_holdem_6263_3c4c7dJhTd_5cQd_Kc2s_6s9d_As9s_Js3s_QsJc_2dTh() {
    assertEquals(
      "6s9d 5cQd Kc2s As9s 2dTh QsJc Js3s",
      Solver.process("texas-holdem 3c4c7dJhTd 5cQd Kc2s 6s9d As9s Js3s QsJc 2dTh"));
  }

  @Test
  public void test_texas_holdem_6264_3h4d5s6hTs_6c3d_3c4h_7d8h_KcQh_3sKs_2sJd() {
    assertEquals(
      "KcQh 3sKs 3c4h 6c3d 2sJd 7d8h",
      Solver.process("texas-holdem 3h4d5s6hTs 6c3d 3c4h 7d8h KcQh 3sKs 2sJd"));
  }

  @Test
  public void test_texas_holdem_6265_5cAcJcKdTh_5s4h_Ad8h_8d3s() {
    assertEquals(
      "8d3s 5s4h Ad8h",
      Solver.process("texas-holdem 5cAcJcKdTh 5s4h Ad8h 8d3s"));
  }

  @Test
  public void test_texas_holdem_6266_4c4d7h9hQs_Kc8c_3hAs_2c6c_QhJs_7c6d_Kh5h_Ts5c_7s9s() {
    assertEquals(
      "2c6c Ts5c Kc8c=Kh5h 3hAs 7c6d 7s9s QhJs",
      Solver.process("texas-holdem 4c4d7h9hQs Kc8c 3hAs 2c6c QhJs 7c6d Kh5h Ts5c 7s9s"));
  }

  @Test
  public void test_texas_holdem_6267_3c8dAdQhTd_Kh8s_4c7h_6c3h_4s2s_Jh2c_7s7c_Ac5c_9dTc() {
    assertEquals(
      "4s2s 4c7h Jh2c 6c3h 7s7c Kh8s 9dTc Ac5c",
      Solver.process("texas-holdem 3c8dAdQhTd Kh8s 4c7h 6c3h 4s2s Jh2c 7s7c Ac5c 9dTc"));
  }

  @Test
  public void test_texas_holdem_6268_4h5d7sAcQs_3sKc_5cJc_8d4s_2s6h_7h9d_6cKd_5h8h_3c4d() {
    assertEquals(
      "2s6h 3sKc 6cKd 3c4d 8d4s 5h8h 5cJc 7h9d",
      Solver.process("texas-holdem 4h5d7sAcQs 3sKc 5cJc 8d4s 2s6h 7h9d 6cKd 5h8h 3c4d"));
  }

  @Test
  public void test_texas_holdem_6269_4d5s6d9hQh_Td6h_8s5h_4h3s_TsQd_3d6s_JcJd_8dTh() {
    assertEquals(
      "8dTh 4h3s 8s5h 3d6s Td6h JcJd TsQd",
      Solver.process("texas-holdem 4d5s6d9hQh Td6h 8s5h 4h3s TsQd 3d6s JcJd 8dTh"));
  }

  @Test
  public void test_texas_holdem_6270_2c3h4h6dJc_6s7c_Qd9s() {
    assertEquals(
      "Qd9s 6s7c",
      Solver.process("texas-holdem 2c3h4h6dJc 6s7c Qd9s"));
  }

  @Test
  public void test_texas_holdem_6271_2s4h5cAcQh_9hQc_As3h_8d3s() {
    assertEquals(
      "9hQc 8d3s=As3h",
      Solver.process("texas-holdem 2s4h5cAcQh 9hQc As3h 8d3s"));
  }

  @Test
  public void test_texas_holdem_6272_2d8sAhAsJh_Kc9s_Th4s_4d9c_3sAc_5sJc_7dQh() {
    assertEquals(
      "4d9c Th4s 7dQh Kc9s 5sJc 3sAc",
      Solver.process("texas-holdem 2d8sAhAsJh Kc9s Th4s 4d9c 3sAc 5sJc 7dQh"));
  }

  @Test
  public void test_texas_holdem_6273_4h5s6s8sAs_7c5d_2sQs_Ad3d_2d3s_2h6h_KdAh_9s4c_4dKh() {
    assertEquals(
      "4dKh 2h6h Ad3d KdAh 7c5d 2d3s 9s4c 2sQs",
      Solver.process("texas-holdem 4h5s6s8sAs 7c5d 2sQs Ad3d 2d3s 2h6h KdAh 9s4c 4dKh"));
  }

  @Test
  public void test_texas_holdem_6274_2s3d9dJsKd_Tc5d_Jd7d_7hKh_2dAs_ThAh_5h9h_4c9s_8cJc_Qd6d() {
    assertEquals(
      "Tc5d ThAh 2dAs 4c9s 5h9h 8cJc 7hKh Jd7d Qd6d",
      Solver.process("texas-holdem 2s3d9dJsKd Tc5d Jd7d 7hKh 2dAs ThAh 5h9h 4c9s 8cJc Qd6d"));
  }

  @Test
  public void test_texas_holdem_6275_4d5h7h8hTd_9cTc_Qc7c_3h3d_JsAs() {
    assertEquals(
      "JsAs 3h3d Qc7c 9cTc",
      Solver.process("texas-holdem 4d5h7h8hTd 9cTc Qc7c 3h3d JsAs"));
  }

  @Test
  public void test_texas_holdem_6276_2s5c6hJsTc_4c7c_7s5h_5dKc_Ac8h_Ad5s_4dKs_Ts9h_JcQc_4hJh() {
    assertEquals(
      "4c7c 4dKs Ac8h 7s5h 5dKc Ad5s Ts9h 4hJh JcQc",
      Solver.process("texas-holdem 2s5c6hJsTc 4c7c 7s5h 5dKc Ac8h Ad5s 4dKs Ts9h JcQc 4hJh"));
  }

  @Test
  public void test_texas_holdem_6277_9hAhJdJsTs_8h8c_Ad6d() {
    assertEquals(
      "8h8c Ad6d",
      Solver.process("texas-holdem 9hAhJdJsTs 8h8c Ad6d"));
  }

  @Test
  public void test_texas_holdem_6278_4c7dKcQcTh_Ad2d_Kh5d_5s8h_As8s_Qh9h_TcAh() {
    assertEquals(
      "5s8h Ad2d As8s TcAh Qh9h Kh5d",
      Solver.process("texas-holdem 4c7dKcQcTh Ad2d Kh5d 5s8h As8s Qh9h TcAh"));
  }

  @Test
  public void test_texas_holdem_6279_AdAsJhKcQh_8s3c_2hKs_5c8c_Kh4s_2d7s_4h6c_4c8d_7c5s_3s7d() {
    assertEquals(
      "2d7s=3s7d=4c8d=4h6c=5c8c=7c5s=8s3c 2hKs=Kh4s",
      Solver.process("texas-holdem AdAsJhKcQh 8s3c 2hKs 5c8c Kh4s 2d7s 4h6c 4c8d 7c5s 3s7d"));
  }

  @Test
  public void test_texas_holdem_6280_6h7c9cJhKc_JdAd_Ac2s_As7h_5h6d_5cQd_3h3c_2d3s() {
    assertEquals(
      "2d3s 5cQd Ac2s 3h3c 5h6d As7h JdAd",
      Solver.process("texas-holdem 6h7c9cJhKc JdAd Ac2s As7h 5h6d 5cQd 3h3c 2d3s"));
  }

  @Test
  public void test_texas_holdem_6281_2h3c8dQsTs_5dTc_8cAs_3hKs_Ah2c_4hKh_7dJs() {
    assertEquals(
      "7dJs 4hKh Ah2c 3hKs 8cAs 5dTc",
      Solver.process("texas-holdem 2h3c8dQsTs 5dTc 8cAs 3hKs Ah2c 4hKh 7dJs"));
  }

  @Test
  public void test_texas_holdem_6282_4s9hAhJdTh_7c6d_4d6s_KhQc_JsKd_TsTd() {
    assertEquals(
      "7c6d 4d6s JsKd TsTd KhQc",
      Solver.process("texas-holdem 4s9hAhJdTh 7c6d 4d6s KhQc JsKd TsTd"));
  }

  @Test
  public void test_texas_holdem_6283_2s3c3d7d7s_5s8d_JsAd_3s2h_5cAc_5hAh() {
    assertEquals(
      "5s8d 5cAc=5hAh=JsAd 3s2h",
      Solver.process("texas-holdem 2s3c3d7d7s 5s8d JsAd 3s2h 5cAc 5hAh"));
  }

  @Test
  public void test_texas_holdem_6284_2c3h9dAdTd_8dAs_9sQc_Ah2d_4s7h_Jd6s_Js6h_4dKd_2s7d() {
    assertEquals(
      "4s7h Jd6s=Js6h 2s7d 9sQc 8dAs Ah2d 4dKd",
      Solver.process("texas-holdem 2c3h9dAdTd 8dAs 9sQc Ah2d 4s7h Jd6s Js6h 4dKd 2s7d"));
  }

  @Test
  public void test_texas_holdem_6285_3c6d8hKdTs_5d5s_7d2h_Qd7h_8sKc_AcQs_9d3h_8d4s_9hKh() {
    assertEquals(
      "7d2h Qd7h AcQs 9d3h 5d5s 8d4s 9hKh 8sKc",
      Solver.process("texas-holdem 3c6d8hKdTs 5d5s 7d2h Qd7h 8sKc AcQs 9d3h 8d4s 9hKh"));
  }

  @Test
  public void test_texas_holdem_6286_3c4h7hQdTs_Jh2s_QcTh_5sTd_Js6s_Ks7c_4s7d() {
    assertEquals(
      "Jh2s Js6s Ks7c 5sTd 4s7d QcTh",
      Solver.process("texas-holdem 3c4h7hQdTs Jh2s QcTh 5sTd Js6s Ks7c 4s7d"));
  }

  @Test
  public void test_texas_holdem_6287_6d7sJcTdTh_5c9s_5h2d_8sQc_4hTs_6c4c_2c6h_Ah3h() {
    assertEquals(
      "5h2d 5c9s 8sQc Ah3h 2c6h=6c4c 4hTs",
      Solver.process("texas-holdem 6d7sJcTdTh 5c9s 5h2d 8sQc 4hTs 6c4c 2c6h Ah3h"));
  }

  @Test
  public void test_texas_holdem_6288_2c6h7sKcTs_Kd8d_2s2d_7dQs_2hQd_9hAs_3dAd_3s5s() {
    assertEquals(
      "3s5s 3dAd 9hAs 2hQd 7dQs Kd8d 2s2d",
      Solver.process("texas-holdem 2c6h7sKcTs Kd8d 2s2d 7dQs 2hQd 9hAs 3dAd 3s5s"));
  }

  @Test
  public void test_texas_holdem_6289_4h5c7hAhJc_2c7c_4c9h_JdQc_Jh5s_TcQh_9s2s() {
    assertEquals(
      "9s2s TcQh 4c9h 2c7c JdQc Jh5s",
      Solver.process("texas-holdem 4h5c7hAhJc 2c7c 4c9h JdQc Jh5s TcQh 9s2s"));
  }

  @Test
  public void test_texas_holdem_6290_4s6c7s8dQs_TsKs_6dJh_6sJc_AhTh_Qc3d_Kd5d_2s3c_8sKc_8hAs() {
    assertEquals(
      "2s3c AhTh 6dJh=6sJc 8sKc 8hAs Qc3d Kd5d TsKs",
      Solver.process("texas-holdem 4s6c7s8dQs TsKs 6dJh 6sJc AhTh Qc3d Kd5d 2s3c 8sKc 8hAs"));
  }

  @Test
  public void test_texas_holdem_6291_7c8d9sJhQh_9hQs_3hAs() {
    assertEquals(
      "3hAs 9hQs",
      Solver.process("texas-holdem 7c8d9sJhQh 9hQs 3hAs"));
  }

  @Test
  public void test_texas_holdem_6292_7hJdQhTdTs_Js5c_KsAc_9dQs_Ad8h_Jc5d_Jh8s() {
    assertEquals(
      "Ad8h Jc5d=Jh8s=Js5c 9dQs KsAc",
      Solver.process("texas-holdem 7hJdQhTdTs Js5c KsAc 9dQs Ad8h Jc5d Jh8s"));
  }

  @Test
  public void test_texas_holdem_6293_5d6h8s9hAs_Th5h_2dJc_QcAh_4cQh_6dKh_KdKc_4s7c() {
    assertEquals(
      "2dJc 4cQh Th5h 6dKh KdKc QcAh 4s7c",
      Solver.process("texas-holdem 5d6h8s9hAs Th5h 2dJc QcAh 4cQh 6dKh KdKc 4s7c"));
  }

  @Test
  public void test_texas_holdem_6294_2h5s7s8sTd_4dQc_4h3d_Jh2s() {
    assertEquals(
      "4h3d 4dQc Jh2s",
      Solver.process("texas-holdem 2h5s7s8sTd 4dQc 4h3d Jh2s"));
  }

  @Test
  public void test_texas_holdem_6295_2h8d9sQdTh_Ah9h_2dTs_Jh4s_3sQc_8hKd_5hTc() {
    assertEquals(
      "8hKd Ah9h 5hTc 3sQc 2dTs Jh4s",
      Solver.process("texas-holdem 2h8d9sQdTh Ah9h 2dTs Jh4s 3sQc 8hKd 5hTc"));
  }

  @Test
  public void test_texas_holdem_6296_6hJhKsTdTh_Tc7s_5s8d_8sJd_KcJc_Ad3c() {
    assertEquals(
      "5s8d Ad3c 8sJd KcJc Tc7s",
      Solver.process("texas-holdem 6hJhKsTdTh Tc7s 5s8d 8sJd KcJc Ad3c"));
  }

  @Test
  public void test_texas_holdem_6297_3h6h7h8sAc_Kh2d_3c3s_4s5c() {
    assertEquals(
      "Kh2d 3c3s 4s5c",
      Solver.process("texas-holdem 3h6h7h8sAc Kh2d 3c3s 4s5c"));
  }

  @Test
  public void test_texas_holdem_6298_7c7sKdTcTs_8sQc_Td5d_QdAc_5h4d_6dQh_3c3h_AhJh() {
    assertEquals(
      "3c3h=5h4d=6dQh=8sQc AhJh=QdAc Td5d",
      Solver.process("texas-holdem 7c7sKdTcTs 8sQc Td5d QdAc 5h4d 6dQh 3c3h AhJh"));
  }

  @Test
  public void test_texas_holdem_6299_2h4c6d9hTc_3dTh_Kd6c_KcAc_7d7c_6s2s_AhAs_KsQc() {
    assertEquals(
      "KsQc KcAc Kd6c 7d7c 3dTh AhAs 6s2s",
      Solver.process("texas-holdem 2h4c6d9hTc 3dTh Kd6c KcAc 7d7c 6s2s AhAs KsQc"));
  }

  @Test
  public void test_texas_holdem_6300_2h3h3s4c6h_2dTh_6s9d_2cAh_7d8h_JdKd_6dKs_4dTc() {
    assertEquals(
      "7d8h JdKd 2dTh 2cAh 4dTc 6s9d 6dKs",
      Solver.process("texas-holdem 2h3h3s4c6h 2dTh 6s9d 2cAh 7d8h JdKd 6dKs 4dTc"));
  }

  @Test
  public void test_texas_holdem_6301_7d8cAcJsTc_2s4s_Qd8d() {
    assertEquals(
      "2s4s Qd8d",
      Solver.process("texas-holdem 7d8cAcJsTc 2s4s Qd8d"));
  }

  @Test
  public void test_texas_holdem_6302_3c4s6s9d9s_4h5h_Jc5s_2hAh_5c7h_6d7d_6cKc() {
    assertEquals(
      "Jc5s 2hAh 4h5h 6d7d 6cKc 5c7h",
      Solver.process("texas-holdem 3c4s6s9d9s 4h5h Jc5s 2hAh 5c7h 6d7d 6cKc"));
  }

  @Test
  public void test_texas_holdem_6303_8d8sAcAdJc_AhQs_Kc4d_8h3d_Ks3s_Qh5s_KdQc() {
    assertEquals(
      "Qh5s Kc4d=KdQc=Ks3s 8h3d AhQs",
      Solver.process("texas-holdem 8d8sAcAdJc AhQs Kc4d 8h3d Ks3s Qh5s KdQc"));
  }

  @Test
  public void test_texas_holdem_6304_2c7h9dJhQs_6sAh_3dJc_Ks2d_8hTd() {
    assertEquals(
      "6sAh Ks2d 3dJc 8hTd",
      Solver.process("texas-holdem 2c7h9dJhQs 6sAh 3dJc Ks2d 8hTd"));
  }

  @Test
  public void test_texas_holdem_6305_6h9h9sAcAd_8cTs_QdKs_8d9c_2hQs_2dAh_4s6c_5h6d_JcTc() {
    assertEquals(
      "4s6c=5h6d 8cTs JcTc 2hQs QdKs 8d9c 2dAh",
      Solver.process("texas-holdem 6h9h9sAcAd 8cTs QdKs 8d9c 2hQs 2dAh 4s6c 5h6d JcTc"));
  }

  @Test
  public void test_texas_holdem_6306_2c4c4d7dTh_8sJc_Kc4h() {
    assertEquals(
      "8sJc Kc4h",
      Solver.process("texas-holdem 2c4c4d7dTh 8sJc Kc4h"));
  }

  @Test
  public void test_texas_holdem_6307_3s7c9cAcJh_QdQh_8s7s_AsTh_QcAh() {
    assertEquals(
      "8s7s QdQh AsTh QcAh",
      Solver.process("texas-holdem 3s7c9cAcJh QdQh 8s7s AsTh QcAh"));
  }

  @Test
  public void test_texas_holdem_6308_2h5d8h9d9h_TdTh_5cKc_TsAh_2cKs_4cAs_9sTc_3c6h_Ad7c_8c6s() {
    assertEquals(
      "3c6h 4cAs Ad7c TsAh 2cKs 5cKc 8c6s TdTh 9sTc",
      Solver.process("texas-holdem 2h5d8h9d9h TdTh 5cKc TsAh 2cKs 4cAs 9sTc 3c6h Ad7c 8c6s"));
  }

  @Test
  public void test_texas_holdem_6309_5c8c9c9dTh_Kd6h_QdTc() {
    assertEquals(
      "Kd6h QdTc",
      Solver.process("texas-holdem 5c8c9c9dTh Kd6h QdTc"));
  }

  @Test
  public void test_texas_holdem_6310_5h5s7sJdKs_2dQc_8hJc_Ad5c_4c6s_8s6d_3hKc() {
    assertEquals(
      "4c6s 8s6d 2dQc 8hJc 3hKc Ad5c",
      Solver.process("texas-holdem 5h5s7sJdKs 2dQc 8hJc Ad5c 4c6s 8s6d 3hKc"));
  }

  @Test
  public void test_texas_holdem_6311_2s3h6sAhKh_Kd9s_7sTh_TdJh_6dAs_6h3d_Ac4s_8h7h_7d7c_Qh4h() {
    assertEquals(
      "7sTh TdJh 7d7c Kd9s Ac4s 6h3d 6dAs 8h7h Qh4h",
      Solver.process("texas-holdem 2s3h6sAhKh Kd9s 7sTh TdJh 6dAs 6h3d Ac4s 8h7h 7d7c Qh4h"));
  }

  @Test
  public void test_texas_holdem_6312_4s6hAcAdQc_7cQh_Kh8c_TdAs_5d9h_5c8d() {
    assertEquals(
      "5c8d 5d9h Kh8c 7cQh TdAs",
      Solver.process("texas-holdem 4s6hAcAdQc 7cQh Kh8c TdAs 5d9h 5c8d"));
  }

  @Test
  public void test_texas_holdem_6313_4c7c7s9sAc_2dTs_5h5s_5c9h() {
    assertEquals(
      "2dTs 5h5s 5c9h",
      Solver.process("texas-holdem 4c7c7s9sAc 2dTs 5h5s 5c9h"));
  }

  @Test
  public void test_texas_holdem_6314_3d4dAsKsQd_JhTh_8h7c_Qh9s_TsQc_5sTd_2s6h_Tc6s_4sJc_Ah7h() {
    assertEquals(
      "2s6h 8h7c 5sTd Tc6s 4sJc Qh9s TsQc Ah7h JhTh",
      Solver.process("texas-holdem 3d4dAsKsQd JhTh 8h7c Qh9s TsQc 5sTd 2s6h Tc6s 4sJc Ah7h"));
  }

  @Test
  public void test_texas_holdem_6315_5d6h7cJcTd_3hTs_9sJh_7s8d_KcKd() {
    assertEquals(
      "7s8d 3hTs 9sJh KcKd",
      Solver.process("texas-holdem 5d6h7cJcTd 3hTs 9sJh 7s8d KcKd"));
  }

  @Test
  public void test_texas_holdem_6316_2s5d7s9cQs_Jh9s_3sTd_Js6h_4dKd_8dAc_2h3d_Ah3c_Jd3h_7dQc() {
    assertEquals(
      "3sTd Jd3h Js6h 4dKd Ah3c 8dAc 2h3d Jh9s 7dQc",
      Solver.process("texas-holdem 2s5d7s9cQs Jh9s 3sTd Js6h 4dKd 8dAc 2h3d Ah3c Jd3h 7dQc"));
  }

  @Test
  public void test_texas_holdem_6317_2s3d6sAcQs_8dKd_Kh9c_Tc2c() {
    assertEquals(
      "8dKd Kh9c Tc2c",
      Solver.process("texas-holdem 2s3d6sAcQs 8dKd Kh9c Tc2c"));
  }

  @Test
  public void test_texas_holdem_6318_4h5d5h6hJh_7s2c_4cJd() {
    assertEquals(
      "7s2c 4cJd",
      Solver.process("texas-holdem 4h5d5h6hJh 7s2c 4cJd"));
  }

  @Test
  public void test_texas_holdem_6319_2c4hAcAhJd_5d6d_4d4c_3cKd() {
    assertEquals(
      "5d6d 3cKd 4d4c",
      Solver.process("texas-holdem 2c4hAcAhJd 5d6d 4d4c 3cKd"));
  }

  @Test
  public void test_texas_holdem_6320_5cJcKhQdTs_8hTd_6cAd_6h9c_7c3c_ThTc_Ah4h() {
    assertEquals(
      "7c3c 8hTd ThTc 6h9c 6cAd=Ah4h",
      Solver.process("texas-holdem 5cJcKhQdTs 8hTd 6cAd 6h9c 7c3c ThTc Ah4h"));
  }

  @Test
  public void test_texas_holdem_6321_7h8h8sJhQs_4s6c_2c3s_Kc5h_Td5d_3h7d_5cAh_4d7c_4hTh_KdJd() {
    assertEquals(
      "2c3s=4s6c Td5d Kc5h 5cAh 3h7d=4d7c KdJd 4hTh",
      Solver.process("texas-holdem 7h8h8sJhQs 4s6c 2c3s Kc5h Td5d 3h7d 5cAh 4d7c 4hTh KdJd"));
  }

  @Test
  public void test_texas_holdem_6322_2s5d9h9sTd_QsQd_5h6c_8sTs_As3d() {
    assertEquals(
      "As3d 5h6c 8sTs QsQd",
      Solver.process("texas-holdem 2s5d9h9sTd QsQd 5h6c 8sTs As3d"));
  }

  @Test
  public void test_texas_holdem_6323_3c4s5c7sKc_6hAs_5sAh() {
    assertEquals(
      "5sAh 6hAs",
      Solver.process("texas-holdem 3c4s5c7sKc 6hAs 5sAh"));
  }

  @Test
  public void test_texas_holdem_6324_4h6cJcQhQs_Ad2c_Ts5h_6h2d_KdAh_JhKc_7h3c_9sTc_Qd4d_2s6d() {
    assertEquals(
      "7h3c Ts5h 9sTc Ad2c KdAh 2s6d=6h2d JhKc Qd4d",
      Solver.process("texas-holdem 4h6cJcQhQs Ad2c Ts5h 6h2d KdAh JhKc 7h3c 9sTc Qd4d 2s6d"));
  }

  @Test
  public void test_texas_holdem_6325_3c4d5h8cJh_Tc5s_TdTs() {
    assertEquals(
      "Tc5s TdTs",
      Solver.process("texas-holdem 3c4d5h8cJh Tc5s TdTs"));
  }

  @Test
  public void test_texas_holdem_6326_2s4c9cAcAd_4h8c_Ks6h_JcKd() {
    assertEquals(
      "Ks6h JcKd 4h8c",
      Solver.process("texas-holdem 2s4c9cAcAd 4h8c Ks6h JcKd"));
  }

  @Test
  public void test_texas_holdem_6327_3h5cAdKhKs_9s6h_8s2c_9hQs_Td4c_4dTs() {
    assertEquals(
      "8s2c 9s6h 4dTs=Td4c 9hQs",
      Solver.process("texas-holdem 3h5cAdKhKs 9s6h 8s2c 9hQs Td4c 4dTs"));
  }

  @Test
  public void test_texas_holdem_6328_3c6d8cAdJs_7s6h_9c2d_3h5s_6cTc() {
    assertEquals(
      "9c2d 3h5s 7s6h 6cTc",
      Solver.process("texas-holdem 3c6d8cAdJs 7s6h 9c2d 3h5s 6cTc"));
  }

  @Test
  public void test_texas_holdem_6329_2c2h5d5h6d_6c8s_Ts4s_KsQh_3s7d_KhAc_As9h() {
    assertEquals(
      "3s7d Ts4s KsQh As9h=KhAc 6c8s",
      Solver.process("texas-holdem 2c2h5d5h6d 6c8s Ts4s KsQh 3s7d KhAc As9h"));
  }

  @Test
  public void test_texas_holdem_6330_2c3hAsKhTd_Ah7h_3cAc_KdJh_Tc9h_7d6h() {
    assertEquals(
      "7d6h Tc9h KdJh Ah7h 3cAc",
      Solver.process("texas-holdem 2c3hAsKhTd Ah7h 3cAc KdJh Tc9h 7d6h"));
  }

  @Test
  public void test_texas_holdem_6331_JcKcKdKsQh_8hJd_7s3d_5s4s_5c9c_7c3c_Ad4c() {
    assertEquals(
      "5c9c=5s4s=7c3c=7s3d Ad4c 8hJd",
      Solver.process("texas-holdem JcKcKdKsQh 8hJd 7s3d 5s4s 5c9c 7c3c Ad4c"));
  }

  @Test
  public void test_texas_holdem_6332_7sJhKcTcTs_9s5h_JdAd_9dJs_2sKs_6c6s_8s3c_5d4s() {
    assertEquals(
      "5d4s 8s3c 9s5h 6c6s 9dJs JdAd 2sKs",
      Solver.process("texas-holdem 7sJhKcTcTs 9s5h JdAd 9dJs 2sKs 6c6s 8s3c 5d4s"));
  }

  @Test
  public void test_texas_holdem_6333_4d4h9cKcQs_6dJc_8s6h_3c2d_8hAc() {
    assertEquals(
      "3c2d=8s6h 6dJc 8hAc",
      Solver.process("texas-holdem 4d4h9cKcQs 6dJc 8s6h 3c2d 8hAc"));
  }

  @Test
  public void test_texas_holdem_6334_6h7cAdKdQh_7h8s_7sAh_2dQc_4s3h_TdTh() {
    assertEquals(
      "4s3h 7h8s TdTh 2dQc 7sAh",
      Solver.process("texas-holdem 6h7cAdKdQh 7h8s 7sAh 2dQc 4s3h TdTh"));
  }

  @Test
  public void test_texas_holdem_6335_4h8hJsTcTs_Jd4c_AcKs_8d6h_Kc2d() {
    assertEquals(
      "Kc2d AcKs 8d6h Jd4c",
      Solver.process("texas-holdem 4h8hJsTcTs Jd4c AcKs 8d6h Kc2d"));
  }

  @Test
  public void test_texas_holdem_6336_2c4s5d6hAs_7hKd_KcQh_7cQc_8h4h_Ah3h() {
    assertEquals(
      "7cQc 7hKd KcQh 8h4h Ah3h",
      Solver.process("texas-holdem 2c4s5d6hAs 7hKd KcQh 7cQc 8h4h Ah3h"));
  }

  @Test
  public void test_texas_holdem_6337_7s8dAsJcTs_2hAc_TdQd_3sQc_8hKh_Kc3h_9dAh_JdTh_JsKd() {
    assertEquals(
      "3sQc Kc3h 8hKh TdQd JsKd 2hAc JdTh 9dAh",
      Solver.process("texas-holdem 7s8dAsJcTs 2hAc TdQd 3sQc 8hKh Kc3h 9dAh JdTh JsKd"));
  }

  @Test
  public void test_texas_holdem_6338_4d6h9dKcKd_3d5c_4sKh_TcJc_7cAd_2d5s_3s4c_QsTh() {
    assertEquals(
      "2d5s=3d5c TcJc QsTh 7cAd 3s4c 4sKh",
      Solver.process("texas-holdem 4d6h9dKcKd 3d5c 4sKh TcJc 7cAd 2d5s 3s4c QsTh"));
  }

  @Test
  public void test_texas_holdem_6339_2h6cAdJhTh_2d9c_6hJd_2sTs_5d7c() {
    assertEquals(
      "5d7c 2d9c 2sTs 6hJd",
      Solver.process("texas-holdem 2h6cAdJhTh 2d9c 6hJd 2sTs 5d7c"));
  }

  @Test
  public void test_texas_holdem_6340_9c9sAcJdTd_7s7d_Tc8d() {
    assertEquals(
      "7s7d Tc8d",
      Solver.process("texas-holdem 9c9sAcJdTd 7s7d Tc8d"));
  }

  @Test
  public void test_texas_holdem_6341_2c5c8hAcTc_2hKs_7s4d_2s6c_8d8s_6s5h_2dTs() {
    assertEquals(
      "7s4d 2hKs 6s5h 2dTs 8d8s 2s6c",
      Solver.process("texas-holdem 2c5c8hAcTc 2hKs 7s4d 2s6c 8d8s 6s5h 2dTs"));
  }

  @Test
  public void test_texas_holdem_6342_7hAhJdJhTc_3d4h_9hTh_3cKd() {
    assertEquals(
      "3d4h 3cKd 9hTh",
      Solver.process("texas-holdem 7hAhJdJhTc 3d4h 9hTh 3cKd"));
  }

  @Test
  public void test_texas_holdem_6343_2d3hJcTcTd_QcAh_Jd9d_6d2s_8c3s_3d4s_7h8s_4h9s_8hQd() {
    assertEquals(
      "7h8s 4h9s 8hQd QcAh 6d2s 3d4s=8c3s Jd9d",
      Solver.process("texas-holdem 2d3hJcTcTd QcAh Jd9d 6d2s 8c3s 3d4s 7h8s 4h9s 8hQd"));
  }

  @Test
  public void test_texas_holdem_6344_3c9cAcAsJh_4h5d_3d4c_6s8s_KcAh_4s7s() {
    assertEquals(
      "4h5d 4s7s 6s8s 3d4c KcAh",
      Solver.process("texas-holdem 3c9cAcAsJh 4h5d 3d4c 6s8s KcAh 4s7s"));
  }

  @Test
  public void test_texas_holdem_6345_2s7cAsJsQd_9hQc_9dKd_8h7d_Kh8d_5cAh() {
    assertEquals(
      "Kh8d 9dKd 8h7d 9hQc 5cAh",
      Solver.process("texas-holdem 2s7cAsJsQd 9hQc 9dKd 8h7d Kh8d 5cAh"));
  }

  @Test
  public void test_texas_holdem_6346_4c4h5s7hTd_Jh5c_Kd3s() {
    assertEquals(
      "Kd3s Jh5c",
      Solver.process("texas-holdem 4c4h5s7hTd Jh5c Kd3s"));
  }

  @Test
  public void test_texas_holdem_6347_2h6s8c8hAc_9s4d_6hKd() {
    assertEquals(
      "9s4d 6hKd",
      Solver.process("texas-holdem 2h6s8c8hAc 9s4d 6hKd"));
  }

  @Test
  public void test_texas_holdem_6348_4h6c7hAcJh_Ks9d_AsKc_3h9h() {
    assertEquals(
      "Ks9d AsKc 3h9h",
      Solver.process("texas-holdem 4h6c7hAcJh Ks9d AsKc 3h9h"));
  }

  @Test
  public void test_texas_holdem_6349_5c7dAhQcTd_JdAc_Jc8d_3d5d_2c8s_2d9h_6dKc_3sAs_9c7h() {
    assertEquals(
      "2c8s 2d9h Jc8d 6dKc 3d5d 9c7h 3sAs JdAc",
      Solver.process("texas-holdem 5c7dAhQcTd JdAc Jc8d 3d5d 2c8s 2d9h 6dKc 3sAs 9c7h"));
  }

  @Test
  public void test_texas_holdem_6350_2d4d4h6d8d_5h8s_7cKs_9dQh_7h6h_5s7s_Jd5d_6sTc_TsAh_QdTd() {
    assertEquals(
      "7cKs TsAh 7h6h 6sTc 5h8s 5s7s 9dQh Jd5d QdTd",
      Solver.process("texas-holdem 2d4d4h6d8d 5h8s 7cKs 9dQh 7h6h 5s7s Jd5d 6sTc TsAh QdTd"));
  }

  @Test
  public void test_texas_holdem_6351_6h6s7c8hQh_4c3s_3d5d_Ac9c_9dKd_4hTs_3h5h_6dJs() {
    assertEquals(
      "3d5d=4c3s 4hTs 9dKd Ac9c 6dJs 3h5h",
      Solver.process("texas-holdem 6h6s7c8hQh 4c3s 3d5d Ac9c 9dKd 4hTs 3h5h 6dJs"));
  }

  @Test
  public void test_texas_holdem_6352_8dAsKsThTs_3dJh_5d5c_Jc3c_6h7h_7sJd() {
    assertEquals(
      "6h7h 3dJh=7sJd=Jc3c 5d5c",
      Solver.process("texas-holdem 8dAsKsThTs 3dJh 5d5c Jc3c 6h7h 7sJd"));
  }

  @Test
  public void test_texas_holdem_6353_3d4h6cAcTd_9sKs_QcAs_AhAd_5c4d_7h3s_Jd6d() {
    assertEquals(
      "9sKs 7h3s 5c4d Jd6d QcAs AhAd",
      Solver.process("texas-holdem 3d4h6cAcTd 9sKs QcAs AhAd 5c4d 7h3s Jd6d"));
  }

  @Test
  public void test_texas_holdem_6354_4d8hAsJcJs_2dJd_Th2h_7s9d_6c6d_QhKd_8s8d() {
    assertEquals(
      "7s9d Th2h QhKd 6c6d 2dJd 8s8d",
      Solver.process("texas-holdem 4d8hAsJcJs 2dJd Th2h 7s9d 6c6d QhKd 8s8d"));
  }

  @Test
  public void test_texas_holdem_6355_4c4s5s7c9c_Kd2d_8d6c_Ad8s_8h2h_5cJs_Qs6d() {
    assertEquals(
      "8h2h Qs6d Kd2d Ad8s 5cJs 8d6c",
      Solver.process("texas-holdem 4c4s5s7c9c Kd2d 8d6c Ad8s 8h2h 5cJs Qs6d"));
  }

  @Test
  public void test_texas_holdem_6356_5c7s9dKcQc_QhJs_5d4h() {
    assertEquals(
      "5d4h QhJs",
      Solver.process("texas-holdem 5c7s9dKcQc QhJs 5d4h"));
  }

  @Test
  public void test_texas_holdem_6357_5s9sAdAhKd_3s5c_Td7c_4sAc_8c3d_2d2c() {
    assertEquals(
      "8c3d Td7c 2d2c 3s5c 4sAc",
      Solver.process("texas-holdem 5s9sAdAhKd 3s5c Td7c 4sAc 8c3d 2d2c"));
  }

  @Test
  public void test_texas_holdem_6358_4d7d7sQdTs_8s2c_2s4s_5dAc_JhJc_7c2d_6c9s_8cTc_As8h_9dQc() {
    assertEquals(
      "8s2c 6c9s 5dAc=As8h 2s4s 8cTc JhJc 9dQc 7c2d",
      Solver.process("texas-holdem 4d7d7sQdTs 8s2c 2s4s 5dAc JhJc 7c2d 6c9s 8cTc As8h 9dQc"));
  }

  @Test
  public void test_texas_holdem_6359_5h8c9hKdKs_8d5d_2s7h_6dQd_Kc7d_AhQc_8s9d_6hQh() {
    assertEquals(
      "2s7h 6dQd=6hQh AhQc 8d5d 8s9d Kc7d",
      Solver.process("texas-holdem 5h8c9hKdKs 8d5d 2s7h 6dQd Kc7d AhQc 8s9d 6hQh"));
  }

  @Test
  public void test_texas_holdem_6360_4h8dAhJdKh_9cKc_8hQh_Tc3h_6c6d_5s2h_Qc6s_5hTh() {
    assertEquals(
      "5s2h Tc3h Qc6s 6c6d 9cKc 5hTh 8hQh",
      Solver.process("texas-holdem 4h8dAhJdKh 9cKc 8hQh Tc3h 6c6d 5s2h Qc6s 5hTh"));
  }

  @Test
  public void test_texas_holdem_6361_3c3s4h5s7h_Ts2c_TdJd_Qc8c_4d6h_Ac2d_Qs7s_5d5h_2h8s() {
    assertEquals(
      "2h8s Ts2c TdJd Qc8c Qs7s Ac2d 4d6h 5d5h",
      Solver.process("texas-holdem 3c3s4h5s7h Ts2c TdJd Qc8c 4d6h Ac2d Qs7s 5d5h 2h8s"));
  }

  @Test
  public void test_texas_holdem_6362_6h8dAcKsQc_Ts2h_Qh4h_8cJd_5hJc_7cQd_6cKc_2cJs_7sJh_7d3c() {
    assertEquals(
      "7d3c Ts2h 2cJs=5hJc=7sJh 8cJd 7cQd=Qh4h 6cKc",
      Solver.process("texas-holdem 6h8dAcKsQc Ts2h Qh4h 8cJd 5hJc 7cQd 6cKc 2cJs 7sJh 7d3c"));
  }

  @Test
  public void test_texas_holdem_6363_3d4sAsKhQh_Th5d_7c2s_4dTc() {
    assertEquals(
      "7c2s Th5d 4dTc",
      Solver.process("texas-holdem 3d4sAsKhQh Th5d 7c2s 4dTc"));
  }

  @Test
  public void test_texas_holdem_6364_2h2s4d4hJs_TdAd_7d5h_Jd2c() {
    assertEquals(
      "7d5h TdAd Jd2c",
      Solver.process("texas-holdem 2h2s4d4hJs TdAd 7d5h Jd2c"));
  }

  @Test
  public void test_texas_holdem_6365_3h5h8c9sJc_2c6d_AsAh_2sKc_AdKd_Kh4s_ThAc_Js5s_7c9h() {
    assertEquals(
      "2c6d 2sKc=Kh4s ThAc AdKd 7c9h AsAh Js5s",
      Solver.process("texas-holdem 3h5h8c9sJc 2c6d AsAh 2sKc AdKd Kh4s ThAc Js5s 7c9h"));
  }

  @Test
  public void test_texas_holdem_6366_3h4c6c6s8s_4s2d_KcTd_Kh8h_Qc8c_4dTc_6h2h() {
    assertEquals(
      "KcTd 4s2d 4dTc Qc8c Kh8h 6h2h",
      Solver.process("texas-holdem 3h4c6c6s8s 4s2d KcTd Kh8h Qc8c 4dTc 6h2h"));
  }

  @Test
  public void test_texas_holdem_6367_3h7d8hJhTc_8dQc_5hJc() {
    assertEquals(
      "8dQc 5hJc",
      Solver.process("texas-holdem 3h7d8hJhTc 8dQc 5hJc"));
  }

  @Test
  public void test_texas_holdem_6368_5h8cJcJhJs_2s9c_3h9s_2dAh_4cTh() {
    assertEquals(
      "2s9c=3h9s 4cTh 2dAh",
      Solver.process("texas-holdem 5h8cJcJhJs 2s9c 3h9s 2dAh 4cTh"));
  }

  @Test
  public void test_texas_holdem_6369_7h8s9cQdTc_4sAc_5s9h_8c6s_KsTs_KhAs_3c2d() {
    assertEquals(
      "3c2d 4sAc KhAs 5s9h KsTs 8c6s",
      Solver.process("texas-holdem 7h8s9cQdTc 4sAc 5s9h 8c6s KsTs KhAs 3c2d"));
  }

  @Test
  public void test_texas_holdem_6370_2h3d4h8cJs_Jd5d_5sQc_8d3s_7sKc() {
    assertEquals(
      "5sQc 7sKc Jd5d 8d3s",
      Solver.process("texas-holdem 2h3d4h8cJs Jd5d 5sQc 8d3s 7sKc"));
  }

  @Test
  public void test_texas_holdem_6371_3h7d8s9dTh_QcJd_KdJs_Kc9s_Tc4c() {
    assertEquals(
      "Kc9s Tc4c KdJs QcJd",
      Solver.process("texas-holdem 3h7d8s9dTh QcJd KdJs Kc9s Tc4c"));
  }

  @Test
  public void test_texas_holdem_6372_3c6s9sAcJs_9cQs_5d2c_Kd2d_Kc4s_8h7d() {
    assertEquals(
      "5d2c 8h7d Kc4s=Kd2d 9cQs",
      Solver.process("texas-holdem 3c6s9sAcJs 9cQs 5d2c Kd2d Kc4s 8h7d"));
  }

  @Test
  public void test_texas_holdem_6373_7h7s9cQdQh_Kc2h_5c2d_Ac8h_Kh5d_3d2c() {
    assertEquals(
      "3d2c=5c2d Kc2h=Kh5d Ac8h",
      Solver.process("texas-holdem 7h7s9cQdQh Kc2h 5c2d Ac8h Kh5d 3d2c"));
  }

  @Test
  public void test_texas_holdem_6374_2s3h6cAcQc_5cTc_3d9c_8s3c_2d9h_Kc8h_6hJc_Td6d_KhAd() {
    assertEquals(
      "Kc8h 2d9h 8s3c 3d9c Td6d 6hJc KhAd 5cTc",
      Solver.process("texas-holdem 2s3h6cAcQc 5cTc 3d9c 8s3c 2d9h Kc8h 6hJc Td6d KhAd"));
  }

  @Test
  public void test_texas_holdem_6375_4c5hAsKcTd_4h7s_Ks8d_9d5d_8cTs_Qh5c_2hTh() {
    assertEquals(
      "4h7s 9d5d Qh5c 2hTh 8cTs Ks8d",
      Solver.process("texas-holdem 4c5hAsKcTd 4h7s Ks8d 9d5d 8cTs Qh5c 2hTh"));
  }

  @Test
  public void test_texas_holdem_6376_3h9sKhTdTh_QcJs_2s8c_4d7d_2c6h_Ac7c_As9c_3d4c_Jd2h_Qh4s() {
    assertEquals(
      "2c6h 4d7d 2s8c Jd2h Qh4s Ac7c 3d4c As9c QcJs",
      Solver.process("texas-holdem 3h9sKhTdTh QcJs 2s8c 4d7d 2c6h Ac7c As9c 3d4c Jd2h Qh4s"));
  }

  @Test
  public void test_texas_holdem_6377_3d5c7dAsJc_JdTc_KhTd() {
    assertEquals(
      "KhTd JdTc",
      Solver.process("texas-holdem 3d5c7dAsJc JdTc KhTd"));
  }

  @Test
  public void test_texas_holdem_6378_2h9dAdKdTc_7hAc_Kh3s_7cTs() {
    assertEquals(
      "7cTs Kh3s 7hAc",
      Solver.process("texas-holdem 2h9dAdKdTc 7hAc Kh3s 7cTs"));
  }

  @Test
  public void test_texas_holdem_6379_4s6d9dJsKc_Ac2h_QdAs_8sTh_Jh9s_5d5h_4c2s() {
    assertEquals(
      "8sTh Ac2h QdAs 4c2s 5d5h Jh9s",
      Solver.process("texas-holdem 4s6d9dJsKc Ac2h QdAs 8sTh Jh9s 5d5h 4c2s"));
  }

  @Test
  public void test_texas_holdem_6380_2d3s5c5hQd_2hJh_7c7d_6cAs_9cKh_2c8h_4d5d_QsKc_7h6h() {
    assertEquals(
      "7h6h 9cKh 6cAs 2c8h=2hJh 7c7d QsKc 4d5d",
      Solver.process("texas-holdem 2d3s5c5hQd 2hJh 7c7d 6cAs 9cKh 2c8h 4d5d QsKc 7h6h"));
  }

  @Test
  public void test_texas_holdem_6381_2c4s7dAsKs_6c2h_Kc6d_KdJh_5h8c_Th4h_AdAh_4dAc_5c3c_3s3h() {
    assertEquals(
      "5h8c 6c2h 3s3h Th4h Kc6d KdJh 4dAc AdAh 5c3c",
      Solver.process("texas-holdem 2c4s7dAsKs 6c2h Kc6d KdJh 5h8c Th4h AdAh 4dAc 5c3c 3s3h"));
  }

  @Test
  public void test_texas_holdem_6382_6d8h8s9cKh_JdJs_QcAs_TsKs_JhAc_7c4d() {
    assertEquals(
      "7c4d JhAc QcAs JdJs TsKs",
      Solver.process("texas-holdem 6d8h8s9cKh JdJs QcAs TsKs JhAc 7c4d"));
  }

  @Test
  public void test_texas_holdem_6383_2s7d7h8cJc_Th2h_9s3s() {
    assertEquals(
      "9s3s Th2h",
      Solver.process("texas-holdem 2s7d7h8cJc Th2h 9s3s"));
  }

  @Test
  public void test_texas_holdem_6384_2c4c4hJcTh_Qd4s_2hKh_Ad5h_7hQs_As6c_3dTd() {
    assertEquals(
      "7hQs Ad5h=As6c 2hKh 3dTd Qd4s",
      Solver.process("texas-holdem 2c4c4hJcTh Qd4s 2hKh Ad5h 7hQs As6c 3dTd"));
  }

  @Test
  public void test_texas_holdem_6385_3c3s4h9cKc_JsQh_2s7s_3hTd_Jc8s_AcAd() {
    assertEquals(
      "2s7s Jc8s JsQh AcAd 3hTd",
      Solver.process("texas-holdem 3c3s4h9cKc JsQh 2s7s 3hTd Jc8s AcAd"));
  }

  @Test
  public void test_texas_holdem_6386_2d4dAdKsTs_7dAc_7s6d_ThKh_2c9s_KcQh_6h4s_3cTd_AsAh() {
    assertEquals(
      "7s6d 2c9s 6h4s 3cTd KcQh 7dAc ThKh AsAh",
      Solver.process("texas-holdem 2d4dAdKsTs 7dAc 7s6d ThKh 2c9s KcQh 6h4s 3cTd AsAh"));
  }

  @Test
  public void test_texas_holdem_6387_2h4h4s9cAs_8dQs_Jc7h_6hAh_5d8s_7d3d_6c9s() {
    assertEquals(
      "7d3d 5d8s Jc7h 8dQs 6c9s 6hAh",
      Solver.process("texas-holdem 2h4h4s9cAs 8dQs Jc7h 6hAh 5d8s 7d3d 6c9s"));
  }

  @Test
  public void test_texas_holdem_6388_6d7c8d8sTd_7s9c_3hQd_Qc8h_Qh2d_Kh5d_9sTc_6hKs() {
    assertEquals(
      "3hQd=Qh2d Kh5d 6hKs Qc8h 7s9c=9sTc",
      Solver.process("texas-holdem 6d7c8d8sTd 7s9c 3hQd Qc8h Qh2d Kh5d 9sTc 6hKs"));
  }

  @Test
  public void test_texas_holdem_6389_3s7sAhTdTs_3h3d_5sJs_QsKd_5dKs_Qd6d() {
    assertEquals(
      "Qd6d 5dKs QsKd 5sJs 3h3d",
      Solver.process("texas-holdem 3s7sAhTdTs 3h3d 5sJs QsKd 5dKs Qd6d"));
  }

  @Test
  public void test_texas_holdem_6390_3s8c9cAsTd_3c5c_6cJd_KhQc_6d7h_9d4h_Ks8d() {
    assertEquals(
      "6cJd KhQc 3c5c Ks8d 9d4h 6d7h",
      Solver.process("texas-holdem 3s8c9cAsTd 3c5c 6cJd KhQc 6d7h 9d4h Ks8d"));
  }

  @Test
  public void test_texas_holdem_6391_2s7h8hAsQs_Js5h_Qd5s_Kc3c_2d9h_6s2h_6dJc_Kd9d() {
    assertEquals(
      "6dJc=Js5h Kc3c Kd9d 6s2h 2d9h Qd5s",
      Solver.process("texas-holdem 2s7h8hAsQs Js5h Qd5s Kc3c 2d9h 6s2h 6dJc Kd9d"));
  }

  @Test
  public void test_texas_holdem_6392_9hAhKsQhQs_6d8h_7c2h_TcKd_5hAc_8dAd_4c8s_Td6h_4h9s_3s2s() {
    assertEquals(
      "3s2s=4c8s=6d8h=7c2h Td6h 4h9s TcKd 5hAc=8dAd",
      Solver.process("texas-holdem 9hAhKsQhQs 6d8h 7c2h TcKd 5hAc 8dAd 4c8s Td6h 4h9s 3s2s"));
  }

  @Test
  public void test_texas_holdem_6393_5d5h8d9hTh_4s4d_2h3h_7h5c() {
    assertEquals(
      "4s4d 7h5c 2h3h",
      Solver.process("texas-holdem 5d5h8d9hTh 4s4d 2h3h 7h5c"));
  }

  @Test
  public void test_texas_holdem_6394_2s3s5c8sAc_9c6d_Js8h() {
    assertEquals(
      "9c6d Js8h",
      Solver.process("texas-holdem 2s3s5c8sAc 9c6d Js8h"));
  }

  @Test
  public void test_texas_holdem_6395_2c5d5hAsTs_Td7d_Kc5c() {
    assertEquals(
      "Td7d Kc5c",
      Solver.process("texas-holdem 2c5d5hAsTs Td7d Kc5c"));
  }

  @Test
  public void test_texas_holdem_6396_2s6d9cAhKs_7s3c_3s3h_AsKc_2dKh_9s9d_Js8h_3d8s_2hJc() {
    assertEquals(
      "7s3c 3d8s Js8h 2hJc 3s3h 2dKh AsKc 9s9d",
      Solver.process("texas-holdem 2s6d9cAhKs 7s3c 3s3h AsKc 2dKh 9s9d Js8h 3d8s 2hJc"));
  }

  @Test
  public void test_texas_holdem_6397_8cAdAhKsTs_QdQh_7d5s_6c7c_Jd8d_Jc3s_7s2d_Tc6d_Qs2s() {
    assertEquals(
      "6c7c=7d5s=7s2d Jc3s Qs2s Jd8d Tc6d QdQh",
      Solver.process("texas-holdem 8cAdAhKsTs QdQh 7d5s 6c7c Jd8d Jc3s 7s2d Tc6d Qs2s"));
  }

  @Test
  public void test_texas_holdem_6398_5cAhAsJsQc_7dJd_2c6d_7s3c_5s3h_Kc4c_5d3s_Td2d_5hQd_AcKh() {
    assertEquals(
      "2c6d 7s3c Td2d Kc4c 5d3s=5s3h 7dJd 5hQd AcKh",
      Solver.process("texas-holdem 5cAhAsJsQc 7dJd 2c6d 7s3c 5s3h Kc4c 5d3s Td2d 5hQd AcKh"));
  }

  @Test
  public void test_texas_holdem_6399_3h4hAdAsJc_7h5d_6cTs_2c7s_9h8h_9c4s_8d5s_3dTh() {
    assertEquals(
      "2c7s 7h5d 8d5s 9h8h 6cTs 3dTh 9c4s",
      Solver.process("texas-holdem 3h4hAdAsJc 7h5d 6cTs 2c7s 9h8h 9c4s 8d5s 3dTh"));
  }

  @Test
  public void test_texas_holdem_6400_2c4d7d8hKs_9h5c_3h6s_Ts7h_5d6d_Js5s() {
    assertEquals(
      "3h6s 9h5c Js5s Ts7h 5d6d",
      Solver.process("texas-holdem 2c4d7d8hKs 9h5c 3h6s Ts7h 5d6d Js5s"));
  }

  @Test
  public void test_texas_holdem_6401_2s3s7hTdTh_KhAs_JdKc_9s7c() {
    assertEquals(
      "JdKc KhAs 9s7c",
      Solver.process("texas-holdem 2s3s7hTdTh KhAs JdKc 9s7c"));
  }

  @Test
  public void test_texas_holdem_6402_4s5h7h7sJh_7c3d_4d6d_6h8s_Jc6c_9s3s_5d9d_TdJd() {
    assertEquals(
      "9s3s 4d6d 5d9d Jc6c TdJd 7c3d 6h8s",
      Solver.process("texas-holdem 4s5h7h7sJh 7c3d 4d6d 6h8s Jc6c 9s3s 5d9d TdJd"));
  }

  @Test
  public void test_texas_holdem_6403_8cAdAsQsTd_JsTc_Jc2c() {
    assertEquals(
      "Jc2c JsTc",
      Solver.process("texas-holdem 8cAdAsQsTd JsTc Jc2c"));
  }

  @Test
  public void test_texas_holdem_6404_2s9c9sKcTh_4sJd_7c4h_JsKh_9dQs() {
    assertEquals(
      "7c4h 4sJd JsKh 9dQs",
      Solver.process("texas-holdem 2s9c9sKcTh 4sJd 7c4h JsKh 9dQs"));
  }

  @Test
  public void test_texas_holdem_6405_6c6s9dJcKc_2h8h_Ac5d_5c2c() {
    assertEquals(
      "2h8h Ac5d 5c2c",
      Solver.process("texas-holdem 6c6s9dJcKc 2h8h Ac5d 5c2c"));
  }

  @Test
  public void test_texas_holdem_6406_4c6c7dKhQs_2c5s_5h4h_3sTs() {
    assertEquals(
      "2c5s 3sTs 5h4h",
      Solver.process("texas-holdem 4c6c7dKhQs 2c5s 5h4h 3sTs"));
  }

  @Test
  public void test_texas_holdem_6407_2s8sAcAdKc_Td6d_5dJs() {
    assertEquals(
      "Td6d 5dJs",
      Solver.process("texas-holdem 2s8sAcAdKc Td6d 5dJs"));
  }

  @Test
  public void test_texas_holdem_6408_2h3h4d5h9s_TcKd_Ah4s_6hTh_3s2s_2d6c_Qd9d_7d5d() {
    assertEquals(
      "TcKd 7d5d Qd9d 3s2s Ah4s 2d6c 6hTh",
      Solver.process("texas-holdem 2h3h4d5h9s TcKd Ah4s 6hTh 3s2s 2d6c Qd9d 7d5d"));
  }

  @Test
  public void test_texas_holdem_6409_6h7d8h8sJs_Td6c_9s7c_4dAc_8dKs_4s2s_TcKd() {
    assertEquals(
      "4s2s TcKd 4dAc Td6c 9s7c 8dKs",
      Solver.process("texas-holdem 6h7d8h8sJs Td6c 9s7c 4dAc 8dKs 4s2s TcKd"));
  }

  @Test
  public void test_texas_holdem_6410_4sAcKsTcTd_AhTh_6s5h_2dJs_Jd3h_7s7c_4h6h_5s8s_2cQc_8h2s() {
    assertEquals(
      "6s5h 5s8s=8h2s 2dJs=Jd3h 2cQc 4h6h 7s7c AhTh",
      Solver.process("texas-holdem 4sAcKsTcTd AhTh 6s5h 2dJs Jd3h 7s7c 4h6h 5s8s 2cQc 8h2s"));
  }

  @Test
  public void test_texas_holdem_6411_2c2h3c8h8s_QhKd_7h4s_Jc7c_AcTh() {
    assertEquals(
      "7h4s Jc7c QhKd AcTh",
      Solver.process("texas-holdem 2c2h3c8h8s QhKd 7h4s Jc7c AcTh"));
  }

  @Test
  public void test_texas_holdem_6412_4d5sAhJdQs_2hKs_9d5h_Ts3d_8sJs_9c4h_7d8h_9h8c_5d6c_9sQd() {
    assertEquals(
      "7d8h 9h8c Ts3d 2hKs 9c4h 5d6c=9d5h 8sJs 9sQd",
      Solver.process("texas-holdem 4d5sAhJdQs 2hKs 9d5h Ts3d 8sJs 9c4h 7d8h 9h8c 5d6c 9sQd"));
  }

  @Test
  public void test_texas_holdem_6413_2d4dAcJsKc_7c3h_As5c_4s5s_Kd6d_2s8d_JhJc_Qd9d_3cTh_6c8h() {
    assertEquals(
      "7c3h 6c8h 3cTh Qd9d 2s8d 4s5s Kd6d As5c JhJc",
      Solver.process("texas-holdem 2d4dAcJsKc 7c3h As5c 4s5s Kd6d 2s8d JhJc Qd9d 3cTh 6c8h"));
  }

  @Test
  public void test_texas_holdem_6414_4h4s6sAsTd_Qs2d_Kc8s_7h8h_Ac7d() {
    assertEquals(
      "7h8h Qs2d Kc8s Ac7d",
      Solver.process("texas-holdem 4h4s6sAsTd Qs2d Kc8s 7h8h Ac7d"));
  }

  @Test
  public void test_texas_holdem_6415_3h4d7s8d9d_8c6d_2d4c_5s4s() {
    assertEquals(
      "2d4c=5s4s 8c6d",
      Solver.process("texas-holdem 3h4d7s8d9d 8c6d 2d4c 5s4s"));
  }

  @Test
  public void test_texas_holdem_6416_2h3s9dKcKs_Qh8c_AcAh_3h5c_Ad6s_Kd9s_6d6h_2s7h() {
    assertEquals(
      "Qh8c Ad6s 2s7h 3h5c 6d6h AcAh Kd9s",
      Solver.process("texas-holdem 2h3s9dKcKs Qh8c AcAh 3h5c Ad6s Kd9s 6d6h 2s7h"));
  }

  @Test
  public void test_texas_holdem_6417_3h5c9hJdQd_3cTh_6s9d_8s2h_2cJs_Ts7h_8dKd_3sJh_6cQh_2sKh() {
    assertEquals(
      "8s2h Ts7h 2sKh 8dKd 3cTh 6s9d 2cJs 6cQh 3sJh",
      Solver.process("texas-holdem 3h5c9hJdQd 3cTh 6s9d 8s2h 2cJs Ts7h 8dKd 3sJh 6cQh 2sKh"));
  }

  @Test
  public void test_texas_holdem_6418_9d9hAsKsQh_3s9s_7dTc_4h6s_8dQs() {
    assertEquals(
      "4h6s=7dTc 8dQs 3s9s",
      Solver.process("texas-holdem 9d9hAsKsQh 3s9s 7dTc 4h6s 8dQs"));
  }

  @Test
  public void test_texas_holdem_6419_2s6c7h9cKs_2d4h_Qc5h_Ac8d_Ah4c_6h2c_5cJs_3dQd_9s4s_Jc4d() {
    assertEquals(
      "5cJs=Jc4d 3dQd=Qc5h Ah4c Ac8d 2d4h 9s4s 6h2c",
      Solver.process("texas-holdem 2s6c7h9cKs 2d4h Qc5h Ac8d Ah4c 6h2c 5cJs 3dQd 9s4s Jc4d"));
  }

  @Test
  public void test_texas_holdem_6420_5c7d7h8dAs_JsQc_3c2c_9sKs_JhAh_4h6d_Jd8s() {
    assertEquals(
      "3c2c JsQc 9sKs Jd8s JhAh 4h6d",
      Solver.process("texas-holdem 5c7d7h8dAs JsQc 3c2c 9sKs JhAh 4h6d Jd8s"));
  }

  @Test
  public void test_texas_holdem_6421_2s6d8dAhKd_JsJh_4c5d_8c7s_6s3h_ThQc_As7h() {
    assertEquals(
      "4c5d ThQc 6s3h 8c7s JsJh As7h",
      Solver.process("texas-holdem 2s6d8dAhKd JsJh 4c5d 8c7s 6s3h ThQc As7h"));
  }

  @Test
  public void test_texas_holdem_6422_4h8sJcKcTd_2s7s_Kh9s_8d8c_3dJh_3hAd_7cTc_5s3s_2c6d() {
    assertEquals(
      "5s3s 2c6d 2s7s 3hAd 7cTc 3dJh Kh9s 8d8c",
      Solver.process("texas-holdem 4h8sJcKcTd 2s7s Kh9s 8d8c 3dJh 3hAd 7cTc 5s3s 2c6d"));
  }

  @Test
  public void test_texas_holdem_6423_4h7d7h8h9s_JdQh_5dKd_2cKc_8c4d() {
    assertEquals(
      "JdQh 2cKc=5dKd 8c4d",
      Solver.process("texas-holdem 4h7d7h8h9s JdQh 5dKd 2cKc 8c4d"));
  }

  @Test
  public void test_texas_holdem_6424_3c3h8c8sJd_KdKc_Qh9d_3sTs_9h7s() {
    assertEquals(
      "9h7s Qh9d KdKc 3sTs",
      Solver.process("texas-holdem 3c3h8c8sJd KdKc Qh9d 3sTs 9h7s"));
  }

  @Test
  public void test_texas_holdem_6425_2s4d7sJhKh_3h4h_8cTd_Ah4c_5cJc_6h9h_9s2d_8s8h() {
    assertEquals(
      "6h9h 8cTd 9s2d 3h4h Ah4c 8s8h 5cJc",
      Solver.process("texas-holdem 2s4d7sJhKh 3h4h 8cTd Ah4c 5cJc 6h9h 9s2d 8s8h"));
  }

  @Test
  public void test_texas_holdem_6426_4d4h6c8c9s_QcJc_2hKd_9dAh_TdKs_4cKc_9c6h_9h3c_8d3h_QdAs() {
    assertEquals(
      "QcJc 2hKd TdKs QdAs 8d3h 9h3c 9dAh 9c6h 4cKc",
      Solver.process("texas-holdem 4d4h6c8c9s QcJc 2hKd 9dAh TdKs 4cKc 9c6h 9h3c 8d3h QdAs"));
  }

  @Test
  public void test_texas_holdem_6427_5s9d9hAhTd_5cAc_Ad5d_3c4d_Jd9s_7hJh() {
    assertEquals(
      "3c4d 7hJh 5cAc=Ad5d Jd9s",
      Solver.process("texas-holdem 5s9d9hAhTd 5cAc Ad5d 3c4d Jd9s 7hJh"));
  }

  @Test
  public void test_texas_holdem_6428_8d8s9cKhKs_8c6s_AhAs_JcTs_3h7s_2hQs_5cAd_3sKc_4h4c_9sTd() {
    assertEquals(
      "3h7s=4h4c JcTs 2hQs 5cAd 9sTd AhAs 8c6s 3sKc",
      Solver.process("texas-holdem 8d8s9cKhKs 8c6s AhAs JcTs 3h7s 2hQs 5cAd 3sKc 4h4c 9sTd"));
  }

  @Test
  public void test_texas_holdem_6429_2d3c6d6hQd_Ah2c_8h9h_Tc4h_7h3d_9d7s_Td5h() {
    assertEquals(
      "9d7s 8h9h Tc4h Td5h Ah2c 7h3d",
      Solver.process("texas-holdem 2d3c6d6hQd Ah2c 8h9h Tc4h 7h3d 9d7s Td5h"));
  }

  @Test
  public void test_texas_holdem_6430_8c8sJdTdTs_Qd6s_6d3d_Ad2d_Ac6h() {
    assertEquals(
      "6d3d Qd6s Ac6h=Ad2d",
      Solver.process("texas-holdem 8c8sJdTdTs Qd6s 6d3d Ad2d Ac6h"));
  }

  @Test
  public void test_texas_holdem_6431_5c5d6h7d8s_Kd6d_4d4s() {
    assertEquals(
      "Kd6d 4d4s",
      Solver.process("texas-holdem 5c5d6h7d8s Kd6d 4d4s"));
  }

  @Test
  public void test_texas_holdem_6432_3s5c7h9dTc_9s2h_Kc7s_8d5d_2d3d_As6h_7d6s() {
    assertEquals(
      "As6h 2d3d 8d5d 7d6s Kc7s 9s2h",
      Solver.process("texas-holdem 3s5c7h9dTc 9s2h Kc7s 8d5d 2d3d As6h 7d6s"));
  }

  @Test
  public void test_texas_holdem_6433_2h4s5sJdTh_6s2s_7s8d_6c3s_Ks4h_3hJc() {
    assertEquals(
      "7s8d 6s2s Ks4h 3hJc 6c3s",
      Solver.process("texas-holdem 2h4s5sJdTh 6s2s 7s8d 6c3s Ks4h 3hJc"));
  }

  @Test
  public void test_texas_holdem_6434_2d3d4h7sTd_3h3s_AhAc_9sQs_4dKs_4sTh_KcAs_6dQh() {
    assertEquals(
      "6dQh 9sQs KcAs 4dKs AhAc 4sTh 3h3s",
      Solver.process("texas-holdem 2d3d4h7sTd 3h3s AhAc 9sQs 4dKs 4sTh KcAs 6dQh"));
  }

  @Test
  public void test_texas_holdem_6435_4h5c7s9dAs_Jd4d_Qh2d_6h8s_Th8c() {
    assertEquals(
      "Th8c Qh2d Jd4d 6h8s",
      Solver.process("texas-holdem 4h5c7s9dAs Jd4d Qh2d 6h8s Th8c"));
  }

  @Test
  public void test_texas_holdem_6436_8d8h8s9dAc_3d5d_5cJd() {
    assertEquals(
      "3d5d 5cJd",
      Solver.process("texas-holdem 8d8h8s9dAc 3d5d 5cJd"));
  }

  @Test
  public void test_texas_holdem_6437_2d2hTcTdTs_9d6d_KcJh_8c8s_3h9c_6c5d_Th3d_Js9h() {
    assertEquals(
      "3h9c=6c5d=9d6d=Js9h=KcJh 8c8s Th3d",
      Solver.process("texas-holdem 2d2hTcTdTs 9d6d KcJh 8c8s 3h9c 6c5d Th3d Js9h"));
  }

  @Test
  public void test_texas_holdem_6438_2d7c9hQsTh_4d9c_7dJh_TdJd_Ah4h_4s3c_KcAd_9s7h() {
    assertEquals(
      "4s3c Ah4h KcAd 7dJh 4d9c TdJd 9s7h",
      Solver.process("texas-holdem 2d7c9hQsTh 4d9c 7dJh TdJd Ah4h 4s3c KcAd 9s7h"));
  }

  @Test
  public void test_texas_holdem_6439_2s3s6cJdKc_7d8c_4cQs_3d6s_AdTd_Ac3c_Ah7c_KdQc() {
    assertEquals(
      "7d8c 4cQs Ah7c AdTd Ac3c KdQc 3d6s",
      Solver.process("texas-holdem 2s3s6cJdKc 7d8c 4cQs 3d6s AdTd Ac3c Ah7c KdQc"));
  }

  @Test
  public void test_texas_holdem_6440_5c6sJhKdTc_5sKh_2cQd_6h4c_Qc7d_Jd7h_7sQh_3s2d() {
    assertEquals(
      "3s2d 2cQd 7sQh=Qc7d 6h4c Jd7h 5sKh",
      Solver.process("texas-holdem 5c6sJhKdTc 5sKh 2cQd 6h4c Qc7d Jd7h 7sQh 3s2d"));
  }

  @Test
  public void test_texas_holdem_6441_2c5c7cAdKh_8cAc_8d9d_QdJs_6c4c_3cTc_Td7s_Qc4s() {
    assertEquals(
      "8d9d Qc4s QdJs Td7s 6c4c 3cTc 8cAc",
      Solver.process("texas-holdem 2c5c7cAdKh 8cAc 8d9d QdJs 6c4c 3cTc Td7s Qc4s"));
  }

  @Test
  public void test_texas_holdem_6442_3h4dAcAsJd_2dTh_7s2c_QsJc_6dKd() {
    assertEquals(
      "7s2c 2dTh 6dKd QsJc",
      Solver.process("texas-holdem 3h4dAcAsJd 2dTh 7s2c QsJc 6dKd"));
  }

  @Test
  public void test_texas_holdem_6443_6d6h9cAsKd_8h3d_4s7h_2dQd_ThAd_9sKs_7c8s_Jh4c_4hAh_6c3c() {
    assertEquals(
      "4s7h=7c8s=8h3d Jh4c 2dQd 9sKs 4hAh=ThAd 6c3c",
      Solver.process("texas-holdem 6d6h9cAsKd 8h3d 4s7h 2dQd ThAd 9sKs 7c8s Jh4c 4hAh 6c3c"));
  }

  @Test
  public void test_texas_holdem_6444_8c8h9sAsTs_Qh6d_7s3s_Ks5h_9c8s_5cJd_2hTh() {
    assertEquals(
      "5cJd Qh6d Ks5h 2hTh 7s3s 9c8s",
      Solver.process("texas-holdem 8c8h9sAsTs Qh6d 7s3s Ks5h 9c8s 5cJd 2hTh"));
  }

  @Test
  public void test_texas_holdem_6445_2d3d4c5s6d_9h6s_QsAh_Jh8c_QdKs_7sTc_Kh2h_Qc4h_3c7h() {
    assertEquals(
      "9h6s=Jh8c=Kh2h=Qc4h=QdKs=QsAh 3c7h=7sTc",
      Solver.process("texas-holdem 2d3d4c5s6d 9h6s QsAh Jh8c QdKs 7sTc Kh2h Qc4h 3c7h"));
  }

  @Test
  public void test_texas_holdem_6446_2c3s5c8dKc_ThQd_JdAc() {
    assertEquals(
      "ThQd JdAc",
      Solver.process("texas-holdem 2c3s5c8dKc ThQd JdAc"));
  }

  @Test
  public void test_texas_holdem_6447_3s9dKcKhQh_6cAc_Ts7s_8c5h() {
    assertEquals(
      "8c5h Ts7s 6cAc",
      Solver.process("texas-holdem 3s9dKcKhQh 6cAc Ts7s 8c5h"));
  }

  @Test
  public void test_texas_holdem_6448_7h8s9dQdTd_6c5d_7c4s_2sAd() {
    assertEquals(
      "2sAd 7c4s 6c5d",
      Solver.process("texas-holdem 7h8s9dQdTd 6c5d 7c4s 2sAd"));
  }

  @Test
  public void test_texas_holdem_6449_4h8d8s9sTh_Tc8h_4cQs_Ad8c() {
    assertEquals(
      "4cQs Ad8c Tc8h",
      Solver.process("texas-holdem 4h8d8s9sTh Tc8h 4cQs Ad8c"));
  }

  @Test
  public void test_texas_holdem_6450_3s8hAcAsQc_8sJs_2s8d_TcKc() {
    assertEquals(
      "TcKc 2s8d=8sJs",
      Solver.process("texas-holdem 3s8hAcAsQc 8sJs 2s8d TcKc"));
  }

  @Test
  public void test_texas_holdem_6451_3h4c5hJsKh_7sAh_JdQs_8d6h_2hTc_As9h() {
    assertEquals(
      "8d6h 2hTc 7sAh As9h JdQs",
      Solver.process("texas-holdem 3h4c5hJsKh 7sAh JdQs 8d6h 2hTc As9h"));
  }

  @Test
  public void test_texas_holdem_6452_5s6s9cKsQs_Ah7c_3hKd_2c5d_2sQd() {
    assertEquals(
      "Ah7c 2c5d 3hKd 2sQd",
      Solver.process("texas-holdem 5s6s9cKsQs Ah7c 3hKd 2c5d 2sQd"));
  }

  @Test
  public void test_texas_holdem_6453_3s5d9hKcKs_7h8c_JsTc_9sJh_5sTs_6s3d_3h6h() {
    assertEquals(
      "7h8c JsTc 3h6h=6s3d 5sTs 9sJh",
      Solver.process("texas-holdem 3s5d9hKcKs 7h8c JsTc 9sJh 5sTs 6s3d 3h6h"));
  }

  @Test
  public void test_texas_holdem_6454_3s4c5dAcTc_Qh9d_4s6s_3d5h_JsQs_KdAd_6cJd_9h3h_Qd7c_Th5s() {
    assertEquals(
      "6cJd Qd7c Qh9d JsQs 9h3h 4s6s KdAd 3d5h Th5s",
      Solver.process("texas-holdem 3s4c5dAcTc Qh9d 4s6s 3d5h JsQs KdAd 6cJd 9h3h Qd7c Th5s"));
  }

  @Test
  public void test_texas_holdem_6455_2h4h7s9hKd_Qh8d_5c9c_4dQs_6cAc_Ks5s_Jh3c_KhKc_5d7c() {
    assertEquals(
      "Jh3c Qh8d 6cAc 4dQs 5d7c 5c9c Ks5s KhKc",
      Solver.process("texas-holdem 2h4h7s9hKd Qh8d 5c9c 4dQs 6cAc Ks5s Jh3c KhKc 5d7c"));
  }

  @Test
  public void test_texas_holdem_6456_4h5c6d9cQs_KhAc_8cTs_TcAh_2sKd_9dJd_Qh9h_Qd5s() {
    assertEquals(
      "8cTs 2sKd TcAh KhAc 9dJd Qd5s Qh9h",
      Solver.process("texas-holdem 4h5c6d9cQs KhAc 8cTs TcAh 2sKd 9dJd Qh9h Qd5s"));
  }

  @Test
  public void test_texas_holdem_6457_3h3s4d5cTc_6cKd_8h7s_4s4c_8s9c() {
    assertEquals(
      "8h7s 8s9c 6cKd 4s4c",
      Solver.process("texas-holdem 3h3s4d5cTc 6cKd 8h7s 4s4c 8s9c"));
  }

  @Test
  public void test_texas_holdem_6458_6h7c7hAhQs_5h9c_TsQh_6c2d_3hTc_Ad5d_2cAs_3s7s_5c4d() {
    assertEquals(
      "5c4d 5h9c 3hTc 6c2d TsQh 2cAs=Ad5d 3s7s",
      Solver.process("texas-holdem 6h7c7hAhQs 5h9c TsQh 6c2d 3hTc Ad5d 2cAs 3s7s 5c4d"));
  }

  @Test
  public void test_texas_holdem_6459_2h4h9dQdTd_8cJs_Kc7h_Qc3c_6h8s_5c4s_Jh4c_2s7s() {
    assertEquals(
      "6h8s Kc7h 2s7s 5c4s Jh4c Qc3c 8cJs",
      Solver.process("texas-holdem 2h4h9dQdTd 8cJs Kc7h Qc3c 6h8s 5c4s Jh4c 2s7s"));
  }

  @Test
  public void test_texas_holdem_6460_5h6d7c7d8d_2cJc_AcKc_JdQc() {
    assertEquals(
      "2cJc JdQc AcKc",
      Solver.process("texas-holdem 5h6d7c7d8d 2cJc AcKc JdQc"));
  }

  @Test
  public void test_texas_holdem_6461_3d4c8cJdTc_7sTh_8s7h_6d3h_3c2s_4s2d() {
    assertEquals(
      "3c2s=6d3h 4s2d 8s7h 7sTh",
      Solver.process("texas-holdem 3d4c8cJdTc 7sTh 8s7h 6d3h 3c2s 4s2d"));
  }

  @Test
  public void test_texas_holdem_6462_2d5h7s8cAs_4s2c_5dAd_ThKc_2hQh() {
    assertEquals(
      "ThKc 4s2c 2hQh 5dAd",
      Solver.process("texas-holdem 2d5h7s8cAs 4s2c 5dAd ThKc 2hQh"));
  }

  @Test
  public void test_texas_holdem_6463_2d5d5s9hKc_Kh8h_4cJd_4s2h_6cJs_9d6d_Tc4h() {
    assertEquals(
      "Tc4h 4cJd=6cJs 4s2h 9d6d Kh8h",
      Solver.process("texas-holdem 2d5d5s9hKc Kh8h 4cJd 4s2h 6cJs 9d6d Tc4h"));
  }

  @Test
  public void test_texas_holdem_6464_3c5s6sJdKc_3h2d_Ts4d_6cQs() {
    assertEquals(
      "Ts4d 3h2d 6cQs",
      Solver.process("texas-holdem 3c5s6sJdKc 3h2d Ts4d 6cQs"));
  }

  @Test
  public void test_texas_holdem_6465_3c4s5h7hJs_6dAh_6hTs_Jc3h_Qc8c_KsKd_3s4c_2c9s() {
    assertEquals(
      "2c9s Qc8c KsKd 3s4c Jc3h 6dAh=6hTs",
      Solver.process("texas-holdem 3c4s5h7hJs 6dAh 6hTs Jc3h Qc8c KsKd 3s4c 2c9s"));
  }

  @Test
  public void test_texas_holdem_6466_5d5s6sAdKh_9s9c_9d4s_Js4h_Qd8s_3h4d_2cKc_5h7c_4cQs() {
    assertEquals(
      "3h4d 9d4s Js4h 4cQs=Qd8s 9s9c 2cKc 5h7c",
      Solver.process("texas-holdem 5d5s6sAdKh 9s9c 9d4s Js4h Qd8s 3h4d 2cKc 5h7c 4cQs"));
  }

  @Test
  public void test_texas_holdem_6467_2h3c7s8dJc_6sJd_6cQc() {
    assertEquals(
      "6cQc 6sJd",
      Solver.process("texas-holdem 2h3c7s8dJc 6sJd 6cQc"));
  }

  @Test
  public void test_texas_holdem_6468_5c7c9dKcQs_JhQd_7sKs() {
    assertEquals(
      "JhQd 7sKs",
      Solver.process("texas-holdem 5c7c9dKcQs JhQd 7sKs"));
  }

  @Test
  public void test_texas_holdem_6469_3c3h4s8sJc_Ad4h_Kd7s_9sAh_2cTh_KhTd_7c8c_6dJh() {
    assertEquals(
      "2cTh Kd7s KhTd 9sAh Ad4h 7c8c 6dJh",
      Solver.process("texas-holdem 3c3h4s8sJc Ad4h Kd7s 9sAh 2cTh KhTd 7c8c 6dJh"));
  }

  @Test
  public void test_texas_holdem_6470_2d7sAcAsJs_6d3s_8sJh() {
    assertEquals(
      "6d3s 8sJh",
      Solver.process("texas-holdem 2d7sAcAsJs 6d3s 8sJh"));
  }

  @Test
  public void test_texas_holdem_6471_2c3hKsThTs_Qd6h_6c3c() {
    assertEquals(
      "Qd6h 6c3c",
      Solver.process("texas-holdem 2c3hKsThTs Qd6h 6c3c"));
  }

  @Test
  public void test_texas_holdem_6472_5c5dAcJdJh_Qs5h_Th9h_Ts2h_Kc7c_3h8s_2c8c_6s3s() {
    assertEquals(
      "2c8c=3h8s=6s3s=Kc7c=Th9h=Ts2h Qs5h",
      Solver.process("texas-holdem 5c5dAcJdJh Qs5h Th9h Ts2h Kc7c 3h8s 2c8c 6s3s"));
  }

  @Test
  public void test_texas_holdem_6473_2c3hQcQdTh_7sJh_KcJs_5sQh() {
    assertEquals(
      "7sJh KcJs 5sQh",
      Solver.process("texas-holdem 2c3hQcQdTh 7sJh KcJs 5sQh"));
  }

  @Test
  public void test_texas_holdem_6474_3c4d4s9sJs_8hQd_Ad6h_5sAc_KcKh_6sKd_3d7s_AsQc() {
    assertEquals(
      "8hQd 6sKd 5sAc=Ad6h AsQc 3d7s KcKh",
      Solver.process("texas-holdem 3c4d4s9sJs 8hQd Ad6h 5sAc KcKh 6sKd 3d7s AsQc"));
  }

  @Test
  public void test_texas_holdem_6475_5s9dAhJcQc_2dAs_7hJd_2c4d_5c8c_Kh5d_3d3c_5hAc() {
    assertEquals(
      "2c4d 3d3c 5c8c Kh5d 7hJd 2dAs 5hAc",
      Solver.process("texas-holdem 5s9dAhJcQc 2dAs 7hJd 2c4d 5c8c Kh5d 3d3c 5hAc"));
  }

  @Test
  public void test_texas_holdem_6476_4c5d5sAcQs_Tc2c_9c5h_9d9s_Kc2h_3h9h_5c3s_Jh4h_8s8h() {
    assertEquals(
      "3h9h Tc2c Kc2h Jh4h 8s8h 9d9s 5c3s=9c5h",
      Solver.process("texas-holdem 4c5d5sAcQs Tc2c 9c5h 9d9s Kc2h 3h9h 5c3s Jh4h 8s8h"));
  }

  @Test
  public void test_texas_holdem_6477_4c5h9sKdTs_As4s_3hJd_QsTd_AhKh_5d2c_Ad2d_7cJs_4d3s() {
    assertEquals(
      "3hJd 7cJs Ad2d 4d3s As4s 5d2c QsTd AhKh",
      Solver.process("texas-holdem 4c5h9sKdTs As4s 3hJd QsTd AhKh 5d2c Ad2d 7cJs 4d3s"));
  }

  @Test
  public void test_texas_holdem_6478_5h6d8sAcQs_Kc6c_8cTs_Js8d_2s2h_7d4d_Ks9s() {
    assertEquals(
      "Ks9s 2s2h Kc6c 8cTs Js8d 7d4d",
      Solver.process("texas-holdem 5h6d8sAcQs Kc6c 8cTs Js8d 2s2h 7d4d Ks9s"));
  }

  @Test
  public void test_texas_holdem_6479_2c3h8hAsTd_9c6c_3d7c_3c5s() {
    assertEquals(
      "9c6c 3c5s=3d7c",
      Solver.process("texas-holdem 2c3h8hAsTd 9c6c 3d7c 3c5s"));
  }

  @Test
  public void test_texas_holdem_6480_2d2h6c8sTd_3c3d_7c7s_7hKs() {
    assertEquals(
      "7hKs 3c3d 7c7s",
      Solver.process("texas-holdem 2d2h6c8sTd 3c3d 7c7s 7hKs"));
  }

  @Test
  public void test_texas_holdem_6481_6s8h9sJhJs_9h9c_Ad4h_7sQh_Ks5h_As7d() {
    assertEquals(
      "7sQh Ks5h Ad4h=As7d 9h9c",
      Solver.process("texas-holdem 6s8h9sJhJs 9h9c Ad4h 7sQh Ks5h As7d"));
  }

  @Test
  public void test_texas_holdem_6482_6s8cQsTcTd_3s9h_Kh7d() {
    assertEquals(
      "3s9h Kh7d",
      Solver.process("texas-holdem 6s8cQsTcTd 3s9h Kh7d"));
  }

  @Test
  public void test_texas_holdem_6483_2h4d4sJcTs_TcJh_3dAc_4h6d() {
    assertEquals(
      "3dAc TcJh 4h6d",
      Solver.process("texas-holdem 2h4d4sJcTs TcJh 3dAc 4h6d"));
  }

  @Test
  public void test_texas_holdem_6484_3h4d6cJcKc_Qh4h_6d8c_TdKs_6h5d_9cJs_Jh7d_4s7h() {
    assertEquals(
      "4s7h Qh4h 6h5d 6d8c Jh7d 9cJs TdKs",
      Solver.process("texas-holdem 3h4d6cJcKc Qh4h 6d8c TdKs 6h5d 9cJs Jh7d 4s7h"));
  }

  @Test
  public void test_texas_holdem_6485_AdKcKhTcTh_4hTs_Jh6c_4c6s_7h6h_8hJs_Qd4d() {
    assertEquals(
      "4c6s=7h6h=8hJs=Jh6c=Qd4d 4hTs",
      Solver.process("texas-holdem AdKcKhTcTh 4hTs Jh6c 4c6s 7h6h 8hJs Qd4d"));
  }

  @Test
  public void test_texas_holdem_6486_2d8c8sThTs_4cTc_Jd3s_9d4s_3h3c_9s5s_9cQh_2h3d_AcKs_Jc7c() {
    assertEquals(
      "2h3d=3h3c 9d4s=9s5s Jc7c=Jd3s 9cQh AcKs 4cTc",
      Solver.process("texas-holdem 2d8c8sThTs 4cTc Jd3s 9d4s 3h3c 9s5s 9cQh 2h3d AcKs Jc7c"));
  }

  @Test
  public void test_texas_holdem_6487_4h4s5d6cQd_Kh3h_Jd2h_Kc9c_Ts6h_Ah6s_Ks8d_2sTc() {
    assertEquals(
      "2sTc Jd2h Kh3h Ks8d Kc9c Ts6h Ah6s",
      Solver.process("texas-holdem 4h4s5d6cQd Kh3h Jd2h Kc9c Ts6h Ah6s Ks8d 2sTc"));
  }

  @Test
  public void test_texas_holdem_6488_2s6h7cJsQc_Qh8s_Ad5d_As5c_KcAh_Tc8d_Kh8h_4hQd_6d6s() {
    assertEquals(
      "Tc8d Kh8h Ad5d=As5c KcAh 4hQd Qh8s 6d6s",
      Solver.process("texas-holdem 2s6h7cJsQc Qh8s Ad5d As5c KcAh Tc8d Kh8h 4hQd 6d6s"));
  }

  @Test
  public void test_texas_holdem_6489_6c7cJcJdJh_2h6d_8sTc_7s6s_9dAd_Js3s() {
    assertEquals(
      "8sTc 9dAd 2h6d 7s6s Js3s",
      Solver.process("texas-holdem 6c7cJcJdJh 2h6d 8sTc 7s6s 9dAd Js3s"));
  }

  @Test
  public void test_texas_holdem_6490_2h6h8c9sKh_7d2c_5dKc() {
    assertEquals(
      "7d2c 5dKc",
      Solver.process("texas-holdem 2h6h8c9sKh 7d2c 5dKc"));
  }

  @Test
  public void test_texas_holdem_6491_7h8h9sQhTd_7sKc_Ad2h_9h5s_Qd7c_9d9c() {
    assertEquals(
      "Ad2h 7sKc 9h5s Qd7c 9d9c",
      Solver.process("texas-holdem 7h8h9sQhTd 7sKc Ad2h 9h5s Qd7c 9d9c"));
  }

  @Test
  public void test_texas_holdem_6492_3d7hKcQsTh_Kd6h_Ks2s_8cAh_4d4c_AsJc() {
    assertEquals(
      "8cAh 4d4c Kd6h=Ks2s AsJc",
      Solver.process("texas-holdem 3d7hKcQsTh Kd6h Ks2s 8cAh 4d4c AsJc"));
  }

  @Test
  public void test_texas_holdem_6493_2s4s9cQdTd_JcAh_6d6c_2h3s_5h8d_Ac6s_5sKs() {
    assertEquals(
      "5h8d 5sKs Ac6s JcAh 2h3s 6d6c",
      Solver.process("texas-holdem 2s4s9cQdTd JcAh 6d6c 2h3s 5h8d Ac6s 5sKs"));
  }

  @Test
  public void test_texas_holdem_6494_2c5c8sAcQs_7sAd_As3d_Qd7d_Jd4h_3s7h_2hKc_6d4d_TdQc_4s6c() {
    assertEquals(
      "4s6c=6d4d 3s7h Jd4h 2hKc Qd7d TdQc As3d 7sAd",
      Solver.process("texas-holdem 2c5c8sAcQs 7sAd As3d Qd7d Jd4h 3s7h 2hKc 6d4d TdQc 4s6c"));
  }

  @Test
  public void test_texas_holdem_6495_4d5c7cJsQh_Qd3s_6d8h_5hJd_8s9c() {
    assertEquals(
      "8s9c Qd3s 5hJd 6d8h",
      Solver.process("texas-holdem 4d5c7cJsQh Qd3s 6d8h 5hJd 8s9c"));
  }

  @Test
  public void test_texas_holdem_6496_6h8c8d9cTh_Kd7s_2cAc_8s4c() {
    assertEquals(
      "2cAc 8s4c Kd7s",
      Solver.process("texas-holdem 6h8c8d9cTh Kd7s 2cAc 8s4c"));
  }

  @Test
  public void test_texas_holdem_6497_2d3h8c9d9s_4hTs_6cAd_Jh5c_QdJd_2cTd_9cQs() {
    assertEquals(
      "4hTs Jh5c QdJd 6cAd 2cTd 9cQs",
      Solver.process("texas-holdem 2d3h8c9d9s 4hTs 6cAd Jh5c QdJd 2cTd 9cQs"));
  }

  @Test
  public void test_texas_holdem_6498_2d5d9dKhTh_JsJh_8cQc_Qh9s_3dQd_7dAs_9c5s_4d5h_4c9h() {
    assertEquals(
      "8cQc 7dAs 4d5h 4c9h Qh9s JsJh 9c5s 3dQd",
      Solver.process("texas-holdem 2d5d9dKhTh JsJh 8cQc Qh9s 3dQd 7dAs 9c5s 4d5h 4c9h"));
  }

  @Test
  public void test_texas_holdem_6499_8c8s9sAsJc_Qs7d_QdTh_2dQc_Kd5d_2s2c_KcAc_3d9c_4c6h_5cTc() {
    assertEquals(
      "4c6h 5cTc 2dQc=Qs7d Kd5d 2s2c 3d9c KcAc QdTh",
      Solver.process("texas-holdem 8c8s9sAsJc Qs7d QdTh 2dQc Kd5d 2s2c KcAc 3d9c 4c6h 5cTc"));
  }

}
