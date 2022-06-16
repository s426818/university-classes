
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver37HiddenTest {


  @Test
  public void test_texas_holdem_9250_3c6h7hAhTs_4c9s_3h6d() {
    assertEquals(
      "4c9s 3h6d",
      Solver.process("texas-holdem 3c6h7hAhTs 4c9s 3h6d"));
  }

  @Test
  public void test_texas_holdem_9251_3c7dAdJsTh_Ks9c_6d9h_QcJc_9d6h_8d2c() {
    assertEquals(
      "8d2c 6d9h=9d6h Ks9c QcJc",
      Solver.process("texas-holdem 3c7dAdJsTh Ks9c 6d9h QcJc 9d6h 8d2c"));
  }

  @Test
  public void test_texas_holdem_9252_4c5c7cQcTd_2h7s_JcQs_8sKs_Kc5d_Kd6s_9s6d_3s3h_7h5h_8d9c() {
    assertEquals(
      "9s6d Kd6s 8sKs 3s3h 2h7s 7h5h 8d9c JcQs Kc5d",
      Solver.process("texas-holdem 4c5c7cQcTd 2h7s JcQs 8sKs Kc5d Kd6s 9s6d 3s3h 7h5h 8d9c"));
  }

  @Test
  public void test_texas_holdem_9253_4d4s7sTcTs_JsJd_4hKs_9hTh_3d7c_5d6c() {
    assertEquals(
      "5d6c 3d7c JsJd 4hKs 9hTh",
      Solver.process("texas-holdem 4d4s7sTcTs JsJd 4hKs 9hTh 3d7c 5d6c"));
  }

  @Test
  public void test_texas_holdem_9254_4d5d6s8dTh_7cTs_AsAc() {
    assertEquals(
      "AsAc 7cTs",
      Solver.process("texas-holdem 4d5d6s8dTh 7cTs AsAc"));
  }

  @Test
  public void test_texas_holdem_9255_8cJcQcQhTd_6cTh_4cKc_Tc6s_5dAh_Jd8d() {
    assertEquals(
      "5dAh 6cTh=Tc6s Jd8d 4cKc",
      Solver.process("texas-holdem 8cJcQcQhTd 6cTh 4cKc Tc6s 5dAh Jd8d"));
  }

  @Test
  public void test_texas_holdem_9256_2h4d8sAdQc_5h5s_Ah6h_9h4c_8cKc_Td2s_KdAs_QsKs_Qd6d_8hTc() {
    assertEquals(
      "Td2s 9h4c 5h5s 8hTc 8cKc Qd6d QsKs Ah6h KdAs",
      Solver.process("texas-holdem 2h4d8sAdQc 5h5s Ah6h 9h4c 8cKc Td2s KdAs QsKs Qd6d 8hTc"));
  }

  @Test
  public void test_texas_holdem_9257_2c7s8h9dKs_5dQs_As7c_Js5c_Jh9h_Qc6h_3h8c() {
    assertEquals(
      "Js5c 5dQs=Qc6h As7c 3h8c Jh9h",
      Solver.process("texas-holdem 2c7s8h9dKs 5dQs As7c Js5c Jh9h Qc6h 3h8c"));
  }

  @Test
  public void test_texas_holdem_9258_4c4d5h8cAc_3h2s_2c5d_7h6h_QsAd_6cTd_Kh7s_4sTs_7d2h_7cJd() {
    assertEquals(
      "7d2h 6cTd 7cJd Kh7s 2c5d QsAd 4sTs 3h2s 7h6h",
      Solver.process("texas-holdem 4c4d5h8cAc 3h2s 2c5d 7h6h QsAd 6cTd Kh7s 4sTs 7d2h 7cJd"));
  }

  @Test
  public void test_texas_holdem_9259_4d4s7c8hKs_Qc6h_Jd7d_Qh3d_AsAd_4h7s_3cTc_Kd5h() {
    assertEquals(
      "3cTc Qc6h=Qh3d Jd7d Kd5h AsAd 4h7s",
      Solver.process("texas-holdem 4d4s7c8hKs Qc6h Jd7d Qh3d AsAd 4h7s 3cTc Kd5h"));
  }

  @Test
  public void test_texas_holdem_9260_8dAcJdQdTs_2sQh_4h2d_9d2h() {
    assertEquals(
      "4h2d 2sQh 9d2h",
      Solver.process("texas-holdem 8dAcJdQdTs 2sQh 4h2d 9d2h"));
  }

  @Test
  public void test_texas_holdem_9261_5s6s8cAsQc_Ad9h_Jh6c_Ac9d_5h3h_5dTc_Jc6h_KsQd_2h2c() {
    assertEquals(
      "2h2c 5h3h 5dTc Jc6h=Jh6c KsQd Ac9d=Ad9h",
      Solver.process("texas-holdem 5s6s8cAsQc Ad9h Jh6c Ac9d 5h3h 5dTc Jc6h KsQd 2h2c"));
  }

  @Test
  public void test_texas_holdem_9262_6s9cAhKdKh_Qd9h_5c2d_6c8s() {
    assertEquals(
      "5c2d 6c8s Qd9h",
      Solver.process("texas-holdem 6s9cAhKdKh Qd9h 5c2d 6c8s"));
  }

  @Test
  public void test_texas_holdem_9263_3c6c7h8dKs_8hAd_3hJc_Kd7d_Qd2c_5s8s_2s7c() {
    assertEquals(
      "Qd2c 3hJc 2s7c 5s8s 8hAd Kd7d",
      Solver.process("texas-holdem 3c6c7h8dKs 8hAd 3hJc Kd7d Qd2c 5s8s 2s7c"));
  }

  @Test
  public void test_texas_holdem_9264_4c4h6c6hAd_9h8h_3dTs() {
    assertEquals(
      "3dTs=9h8h",
      Solver.process("texas-holdem 4c4h6c6hAd 9h8h 3dTs"));
  }

  @Test
  public void test_texas_holdem_9265_4d5s9c9dTc_JcKd_9h8h_6sAd_Th3h_8s8c_6h3s() {
    assertEquals(
      "6h3s JcKd 6sAd 8s8c Th3h 9h8h",
      Solver.process("texas-holdem 4d5s9c9dTc JcKd 9h8h 6sAd Th3h 8s8c 6h3s"));
  }

  @Test
  public void test_texas_holdem_9266_4h7d8hKdQs_TcQh_Kh6s_JhJs_ThTd_7s2d_6c5c_8c5h_3h9c_4d2s() {
    assertEquals(
      "3h9c 4d2s 7s2d 8c5h ThTd JhJs TcQh Kh6s 6c5c",
      Solver.process("texas-holdem 4h7d8hKdQs TcQh Kh6s JhJs ThTd 7s2d 6c5c 8c5h 3h9c 4d2s"));
  }

  @Test
  public void test_texas_holdem_9267_3h4h4s9hAs_Jc7h_Ac9d_QdAd_5d3d_2h2c_7c3c_6c6s_Ah5h_Kh2s() {
    assertEquals(
      "Jc7h Kh2s 2h2c 5d3d=7c3c 6c6s QdAd Ac9d Ah5h",
      Solver.process("texas-holdem 3h4h4s9hAs Jc7h Ac9d QdAd 5d3d 2h2c 7c3c 6c6s Ah5h Kh2s"));
  }

  @Test
  public void test_texas_holdem_9268_2d2s3c6hKc_2hQs_QhTs_Js5h() {
    assertEquals(
      "Js5h QhTs 2hQs",
      Solver.process("texas-holdem 2d2s3c6hKc 2hQs QhTs Js5h"));
  }

  @Test
  public void test_texas_holdem_9269_6s7s8s9hJd_Th4c_6hJc_Qd9c_5dKc_8dKd_7cKh_3c4d_8h2s() {
    assertEquals(
      "3c4d 7cKh 8h2s 8dKd Qd9c 6hJc 5dKc Th4c",
      Solver.process("texas-holdem 6s7s8s9hJd Th4c 6hJc Qd9c 5dKc 8dKd 7cKh 3c4d 8h2s"));
  }

  @Test
  public void test_texas_holdem_9270_2h2s5hQdTd_Ks7c_6dTc_4dKc_Kd9h_7h3s_AcQc() {
    assertEquals(
      "7h3s 4dKc=Kd9h=Ks7c 6dTc AcQc",
      Solver.process("texas-holdem 2h2s5hQdTd Ks7c 6dTc 4dKc Kd9h 7h3s AcQc"));
  }

  @Test
  public void test_texas_holdem_9271_2s4h6h6sKd_Th5h_4c3c_4d8s_7c5s() {
    assertEquals(
      "7c5s Th5h 4c3c=4d8s",
      Solver.process("texas-holdem 2s4h6h6sKd Th5h 4c3c 4d8s 7c5s"));
  }

  @Test
  public void test_texas_holdem_9272_4c4dQcQsTh_5c6d_3h2d() {
    assertEquals(
      "3h2d=5c6d",
      Solver.process("texas-holdem 4c4dQcQsTh 5c6d 3h2d"));
  }

  @Test
  public void test_texas_holdem_9273_5s7cAdJsTd_9h7h_8dJc_3s3d_8s2c_ThJh_2h8h() {
    assertEquals(
      "2h8h=8s2c 3s3d 9h7h 8dJc ThJh",
      Solver.process("texas-holdem 5s7cAdJsTd 9h7h 8dJc 3s3d 8s2c ThJh 2h8h"));
  }

  @Test
  public void test_texas_holdem_9274_4c7h9sJcTh_As3h_6s8s_2d9d_KhJs() {
    assertEquals(
      "As3h 2d9d KhJs 6s8s",
      Solver.process("texas-holdem 4c7h9sJcTh As3h 6s8s 2d9d KhJs"));
  }

  @Test
  public void test_texas_holdem_9275_4d6cJcKcKs_4c7c_9s5c_TcTh_2h3c_8cAd_JhJs() {
    assertEquals(
      "2h3c 9s5c 8cAd TcTh 4c7c JhJs",
      Solver.process("texas-holdem 4d6cJcKcKs 4c7c 9s5c TcTh 2h3c 8cAd JhJs"));
  }

  @Test
  public void test_texas_holdem_9276_3h4c5h6c6s_4h8d_Ah2d_AdQh_7h7c_7d2c_4d6h() {
    assertEquals(
      "AdQh 4h8d Ah2d 7d2c=7h7c 4d6h",
      Solver.process("texas-holdem 3h4c5h6c6s 4h8d Ah2d AdQh 7h7c 7d2c 4d6h"));
  }

  @Test
  public void test_texas_holdem_9277_3s5s6h9dTc_8c7d_3dKs_3hTs() {
    assertEquals(
      "3dKs 3hTs 8c7d",
      Solver.process("texas-holdem 3s5s6h9dTc 8c7d 3dKs 3hTs"));
  }

  @Test
  public void test_texas_holdem_9278_2h5h5s7h7s_Kh8c_9d4c_6hAh_2d2s_AsQc_QsTc() {
    assertEquals(
      "9d4c QsTc Kh8c AsQc 6hAh 2d2s",
      Solver.process("texas-holdem 2h5h5s7h7s Kh8c 9d4c 6hAh 2d2s AsQc QsTc"));
  }

  @Test
  public void test_texas_holdem_9279_2c2s5c7dKd_6c5h_7sKc_Kh4h_As4c_TcAc_6sKs_9s4s_8hTh_TdQc() {
    assertEquals(
      "9s4s 8hTh TdQc As4c TcAc 6c5h 6sKs=Kh4h 7sKc",
      Solver.process("texas-holdem 2c2s5c7dKd 6c5h 7sKc Kh4h As4c TcAc 6sKs 9s4s 8hTh TdQc"));
  }

  @Test
  public void test_texas_holdem_9280_2c3d5c8cKd_Jd4d_6c9h_8sQh() {
    assertEquals(
      "6c9h Jd4d 8sQh",
      Solver.process("texas-holdem 2c3d5c8cKd Jd4d 6c9h 8sQh"));
  }

  @Test
  public void test_texas_holdem_9281_4s5h9sAcQc_8dKc_7s4d_5c8c_Qs3c_4hAs_2s7c() {
    assertEquals(
      "2s7c 8dKc 7s4d 5c8c Qs3c 4hAs",
      Solver.process("texas-holdem 4s5h9sAcQc 8dKc 7s4d 5c8c Qs3c 4hAs 2s7c"));
  }

  @Test
  public void test_texas_holdem_9282_3h5d6h7sTs_9d5c_5s6c_7c2s_8s5h_3d4s_TdAh_2hAs_9hAc() {
    assertEquals(
      "2hAs 9hAc 8s5h 9d5c 7c2s TdAh 5s6c 3d4s",
      Solver.process("texas-holdem 3h5d6h7sTs 9d5c 5s6c 7c2s 8s5h 3d4s TdAh 2hAs 9hAc"));
  }

  @Test
  public void test_texas_holdem_9283_3c5c5sJdKs_KhTs_QhTh() {
    assertEquals(
      "QhTh KhTs",
      Solver.process("texas-holdem 3c5c5sJdKs KhTs QhTh"));
  }

  @Test
  public void test_texas_holdem_9284_3s8sAcQcTh_TcKh_Ah8d_KcAd_5c5d_4h6s_2dJc() {
    assertEquals(
      "4h6s 2dJc 5c5d TcKh KcAd Ah8d",
      Solver.process("texas-holdem 3s8sAcQcTh TcKh Ah8d KcAd 5c5d 4h6s 2dJc"));
  }

  @Test
  public void test_texas_holdem_9285_3s9h9sKcQd_TdJs_9c8c_2c7d_2s5d_7sQs_4hQc_3c4c() {
    assertEquals(
      "2s5d 2c7d 3c4c 4hQc=7sQs 9c8c TdJs",
      Solver.process("texas-holdem 3s9h9sKcQd TdJs 9c8c 2c7d 2s5d 7sQs 4hQc 3c4c"));
  }

  @Test
  public void test_texas_holdem_9286_3c7cAcAhTh_8sAd_Ts4d_JsKd_7sQd() {
    assertEquals(
      "JsKd 7sQd Ts4d 8sAd",
      Solver.process("texas-holdem 3c7cAcAhTh 8sAd Ts4d JsKd 7sQd"));
  }

  @Test
  public void test_texas_holdem_9287_6h9c9dJsKc_2d2c_8cAc() {
    assertEquals(
      "8cAc 2d2c",
      Solver.process("texas-holdem 6h9c9dJsKc 2d2c 8cAc"));
  }

  @Test
  public void test_texas_holdem_9288_2c5c6hQdTc_3s3c_Ts5s_7h8s_7d2h_Js2d_8c4d_Qh9s_3d8d_5d4s() {
    assertEquals(
      "3d8d=8c4d 7h8s 7d2h Js2d 3s3c 5d4s Qh9s Ts5s",
      Solver.process("texas-holdem 2c5c6hQdTc 3s3c Ts5s 7h8s 7d2h Js2d 8c4d Qh9s 3d8d 5d4s"));
  }

  @Test
  public void test_texas_holdem_9289_2h6c8dAhJd_4sQs_7d5c_Th3s_QdQc_3c3h_4cKs_9h3d_8c2s() {
    assertEquals(
      "7d5c 9h3d Th3s 4sQs 4cKs 3c3h QdQc 8c2s",
      Solver.process("texas-holdem 2h6c8dAhJd 4sQs 7d5c Th3s QdQc 3c3h 4cKs 9h3d 8c2s"));
  }

  @Test
  public void test_texas_holdem_9290_5s7d9dAsKh_6cQh_Qc8c_4h8h_3cQs_6d5h() {
    assertEquals(
      "4h8h 3cQs=6cQh Qc8c 6d5h",
      Solver.process("texas-holdem 5s7d9dAsKh 6cQh Qc8c 4h8h 3cQs 6d5h"));
  }

  @Test
  public void test_texas_holdem_9291_5s8c9sJhKd_QcTh_7c6h_Qs8s_Kc2d_KhAc_5h2s_JsAh_8d6d() {
    assertEquals(
      "5h2s 8d6d Qs8s JsAh Kc2d KhAc 7c6h QcTh",
      Solver.process("texas-holdem 5s8c9sJhKd QcTh 7c6h Qs8s Kc2d KhAc 5h2s JsAh 8d6d"));
  }

  @Test
  public void test_texas_holdem_9292_4h4s8h9d9h_QsAh_3cTs_5c3h_2s7c_9sKs() {
    assertEquals(
      "2s7c=5c3h 3cTs QsAh 9sKs",
      Solver.process("texas-holdem 4h4s8h9d9h QsAh 3cTs 5c3h 2s7c 9sKs"));
  }

  @Test
  public void test_texas_holdem_9293_2s9hAcKcTs_3cKd_5h8c_7dAd_Td5s_QsAs_3h3s_8d7c_6d7s_AhTc() {
    assertEquals(
      "6d7s 5h8c=8d7c 3h3s Td5s 3cKd 7dAd QsAs AhTc",
      Solver.process("texas-holdem 2s9hAcKcTs 3cKd 5h8c 7dAd Td5s QsAs 3h3s 8d7c 6d7s AhTc"));
  }

  @Test
  public void test_texas_holdem_9294_7c9hJhKhTd_Kc6d_Th5d_Ad5s_JsQh_8s3s_QdAc() {
    assertEquals(
      "Ad5s Th5d Kc6d 8s3s JsQh QdAc",
      Solver.process("texas-holdem 7c9hJhKhTd Kc6d Th5d Ad5s JsQh 8s3s QdAc"));
  }

  @Test
  public void test_texas_holdem_9295_2d5c9dAsTc_Qc2s_9s3s_Kh8s_Ad6d_Qh7s_KsJc_Qs7d_Jd8h() {
    assertEquals(
      "Jd8h Qh7s=Qs7d Kh8s KsJc Qc2s 9s3s Ad6d",
      Solver.process("texas-holdem 2d5c9dAsTc Qc2s 9s3s Kh8s Ad6d Qh7s KsJc Qs7d Jd8h"));
  }

  @Test
  public void test_texas_holdem_9296_7h8sJdJsKh_6sQc_Jc8d_5c4h() {
    assertEquals(
      "5c4h 6sQc Jc8d",
      Solver.process("texas-holdem 7h8sJdJsKh 6sQc Jc8d 5c4h"));
  }

  @Test
  public void test_texas_holdem_9297_4hAdJcKdKh_9s8h_AhTc_5h6h_4c7d_2cKc_8c6s_8s2s() {
    assertEquals(
      "5h6h 8c6s=8s2s 9s8h 4c7d AhTc 2cKc",
      Solver.process("texas-holdem 4hAdJcKdKh 9s8h AhTc 5h6h 4c7d 2cKc 8c6s 8s2s"));
  }

  @Test
  public void test_texas_holdem_9298_3h4dKsThTs_6d2c_3d8c_QsJc_Ac8s_2s8h_3c6h_Kh2d_2h9s_9h3s() {
    assertEquals(
      "6d2c 2s8h 2h9s QsJc Ac8s 3c6h=3d8c=9h3s Kh2d",
      Solver.process("texas-holdem 3h4dKsThTs 6d2c 3d8c QsJc Ac8s 2s8h 3c6h Kh2d 2h9s 9h3s"));
  }

  @Test
  public void test_texas_holdem_9299_4h7sJhJsQh_Ts6d_6h2s_Td8d_8h7c_9dTc_7hAs() {
    assertEquals(
      "6h2s Ts6d Td8d 9dTc 8h7c 7hAs",
      Solver.process("texas-holdem 4h7sJhJsQh Ts6d 6h2s Td8d 8h7c 9dTc 7hAs"));
  }

  @Test
  public void test_texas_holdem_9300_4c4d6s9cKs_QsAs_Th3h() {
    assertEquals(
      "Th3h QsAs",
      Solver.process("texas-holdem 4c4d6s9cKs QsAs Th3h"));
  }

  @Test
  public void test_texas_holdem_9301_2d5s7c9hAc_5h3d_4hTs_6hKc() {
    assertEquals(
      "4hTs 6hKc 5h3d",
      Solver.process("texas-holdem 2d5s7c9hAc 5h3d 4hTs 6hKc"));
  }

  @Test
  public void test_texas_holdem_9302_2d4c4s8cAs_6sKs_9hTc() {
    assertEquals(
      "9hTc 6sKs",
      Solver.process("texas-holdem 2d4c4s8cAs 6sKs 9hTc"));
  }

  @Test
  public void test_texas_holdem_9303_4c6h8sAsJs_5c2s_9sQd_8c6s() {
    assertEquals(
      "5c2s 9sQd 8c6s",
      Solver.process("texas-holdem 4c6h8sAsJs 5c2s 9sQd 8c6s"));
  }

  @Test
  public void test_texas_holdem_9304_2h2s6d7d7s_5h9h_8s4c_Ts4h_3dTh_Ad6h_AsJh_3hKh() {
    assertEquals(
      "8s4c 5h9h 3dTh=Ts4h 3hKh AsJh Ad6h",
      Solver.process("texas-holdem 2h2s6d7d7s 5h9h 8s4c Ts4h 3dTh Ad6h AsJh 3hKh"));
  }

  @Test
  public void test_texas_holdem_9305_2h5h5sAsTc_8d9h_4cQd() {
    assertEquals(
      "8d9h 4cQd",
      Solver.process("texas-holdem 2h5h5sAsTc 8d9h 4cQd"));
  }

  @Test
  public void test_texas_holdem_9306_4c7h8sQhTc_8c3s_9d3d_5c4s_7dAs_9h6h_5h6c_JdAc_5d2c_3c2h() {
    assertEquals(
      "3c2h 5d2c 9d3d JdAc 5c4s 7dAs 8c3s 5h6c 9h6h",
      Solver.process("texas-holdem 4c7h8sQhTc 8c3s 9d3d 5c4s 7dAs 9h6h 5h6c JdAc 5d2c 3c2h"));
  }

  @Test
  public void test_texas_holdem_9307_4h9hAdKhQh_As7h_Jh4c_2c9s_8hTd_7c8s_Ac5c_Qd3d_6d8c() {
    assertEquals(
      "6d8c=7c8s 2c9s Qd3d Ac5c As7h 8hTd Jh4c",
      Solver.process("texas-holdem 4h9hAdKhQh As7h Jh4c 2c9s 8hTd 7c8s Ac5c Qd3d 6d8c"));
  }

  @Test
  public void test_texas_holdem_9308_9c9hJcKsTh_AdKh_Qh9s_3s2d_Qd5h_5c2c_7dKd_Js4d_5d4s_2h9d() {
    assertEquals(
      "3s2d=5c2c=5d4s Js4d 7dKd AdKh 2h9d Qd5h=Qh9s",
      Solver.process("texas-holdem 9c9hJcKsTh AdKh Qh9s 3s2d Qd5h 5c2c 7dKd Js4d 5d4s 2h9d"));
  }

  @Test
  public void test_texas_holdem_9309_3d4c8h8sJs_3h7d_2c8c_3c2s_Ts9d_7s4d() {
    assertEquals(
      "Ts9d 3c2s=3h7d 7s4d 2c8c",
      Solver.process("texas-holdem 3d4c8h8sJs 3h7d 2c8c 3c2s Ts9d 7s4d"));
  }

  @Test
  public void test_texas_holdem_9310_2h5h6d9hTs_8cTc_Qh4d_Ah5d_6h4s_Jd7h_Jc8h_4c6c_8d7c() {
    assertEquals(
      "Jd7h Jc8h Qh4d Ah5d 4c6c=6h4s 8cTc 8d7c",
      Solver.process("texas-holdem 2h5h6d9hTs 8cTc Qh4d Ah5d 6h4s Jd7h Jc8h 4c6c 8d7c"));
  }

  @Test
  public void test_texas_holdem_9311_2s4h5c6dAc_5d2d_QcAd_4s9h_Ts2h_Kc6h_8sQh_8d4d() {
    assertEquals(
      "8sQh Ts2h 8d4d 4s9h Kc6h QcAd 5d2d",
      Solver.process("texas-holdem 2s4h5c6dAc 5d2d QcAd 4s9h Ts2h Kc6h 8sQh 8d4d"));
  }

  @Test
  public void test_texas_holdem_9312_2s4h7h9h9s_Qs4s_Qd8s_3sJd_5dKs_8d6c_AcAd() {
    assertEquals(
      "8d6c 3sJd Qd8s 5dKs Qs4s AcAd",
      Solver.process("texas-holdem 2s4h7h9h9s Qs4s Qd8s 3sJd 5dKs 8d6c AcAd"));
  }

  @Test
  public void test_texas_holdem_9313_3h5c7d8hJd_5s6h_KdAc_2s4h_5dJs() {
    assertEquals(
      "2s4h KdAc 5s6h 5dJs",
      Solver.process("texas-holdem 3h5c7d8hJd 5s6h KdAc 2s4h 5dJs"));
  }

  @Test
  public void test_texas_holdem_9314_4d5c7hKhQh_8d6s_6h2s_8sKc_5d8c_6dAh_3hAs() {
    assertEquals(
      "6h2s 3hAs 6dAh 5d8c 8sKc 8d6s",
      Solver.process("texas-holdem 4d5c7hKhQh 8d6s 6h2s 8sKc 5d8c 6dAh 3hAs"));
  }

  @Test
  public void test_texas_holdem_9315_3d3s4h5d9d_6dJc_KcTd_Qh6h_5c4d_Ts8d() {
    assertEquals(
      "Ts8d 6dJc Qh6h KcTd 5c4d",
      Solver.process("texas-holdem 3d3s4h5d9d 6dJc KcTd Qh6h 5c4d Ts8d"));
  }

  @Test
  public void test_texas_holdem_9316_7s9cKsTcTh_Td8c_5h2d_Jh2c_3c2s() {
    assertEquals(
      "3c2s=5h2d Jh2c Td8c",
      Solver.process("texas-holdem 7s9cKsTcTh Td8c 5h2d Jh2c 3c2s"));
  }

  @Test
  public void test_texas_holdem_9317_4c8cAcJcQs_AsJd_6hTs_Ah9s_2h8s_Td7c() {
    assertEquals(
      "6hTs 2h8s Ah9s AsJd Td7c",
      Solver.process("texas-holdem 4c8cAcJcQs AsJd 6hTs Ah9s 2h8s Td7c"));
  }

  @Test
  public void test_texas_holdem_9318_3h6h8hAcJd_9d3s_9c2d() {
    assertEquals(
      "9c2d 9d3s",
      Solver.process("texas-holdem 3h6h8hAcJd 9d3s 9c2d"));
  }

  @Test
  public void test_texas_holdem_9319_4h7h9hJhKs_Kh8h_7s5h() {
    assertEquals(
      "7s5h Kh8h",
      Solver.process("texas-holdem 4h7h9hJhKs Kh8h 7s5h"));
  }

  @Test
  public void test_texas_holdem_9320_2c3d5c6dQd_Jd7h_4sKc_AdAc_2h8h_3hQs_2s3c_Jh7d_9dAh_9s6s() {
    assertEquals(
      "Jd7h=Jh7d 9dAh 2h8h 9s6s AdAc 2s3c 3hQs 4sKc",
      Solver.process("texas-holdem 2c3d5c6dQd Jd7h 4sKc AdAc 2h8h 3hQs 2s3c Jh7d 9dAh 9s6s"));
  }

  @Test
  public void test_texas_holdem_9321_3s4s6c7s8d_Jh2c_5s5d_QsJs_QhKd_8hKs_AhTh() {
    assertEquals(
      "Jh2c QhKd AhTh 8hKs 5s5d QsJs",
      Solver.process("texas-holdem 3s4s6c7s8d Jh2c 5s5d QsJs QhKd 8hKs AhTh"));
  }

  @Test
  public void test_texas_holdem_9322_5h6s7s9sQc_8h3s_AsJs_AdQs_Jh2s_KdTd() {
    assertEquals(
      "Jh2s KdTd AdQs 8h3s AsJs",
      Solver.process("texas-holdem 5h6s7s9sQc 8h3s AsJs AdQs Jh2s KdTd"));
  }

  @Test
  public void test_texas_holdem_9323_8cQcQhTcTs_Qs8h_4c5c_4h6d_6h5d() {
    assertEquals(
      "4h6d=6h5d 4c5c Qs8h",
      Solver.process("texas-holdem 8cQcQhTcTs Qs8h 4c5c 4h6d 6h5d"));
  }

  @Test
  public void test_texas_holdem_9324_5c8sAsQsTh_3cAc_Ah2s_4h2d_Kc8d_7hQd_Ts8c_3s5s_3h9s_QcTd() {
    assertEquals(
      "4h2d 3h9s Kc8d 7hQd 3cAc=Ah2s Ts8c QcTd 3s5s",
      Solver.process("texas-holdem 5c8sAsQsTh 3cAc Ah2s 4h2d Kc8d 7hQd Ts8c 3s5s 3h9s QcTd"));
  }

  @Test
  public void test_texas_holdem_9325_2c5s7hAhQc_Jh9s_Qs4c_AcJc() {
    assertEquals(
      "Jh9s Qs4c AcJc",
      Solver.process("texas-holdem 2c5s7hAhQc Jh9s Qs4c AcJc"));
  }

  @Test
  public void test_texas_holdem_9326_2c3s9d9hAd_4cQh_7d3c_KdQc_Td7s_9sJh() {
    assertEquals(
      "Td7s 4cQh KdQc 7d3c 9sJh",
      Solver.process("texas-holdem 2c3s9d9hAd 4cQh 7d3c KdQc Td7s 9sJh"));
  }

  @Test
  public void test_texas_holdem_9327_5c8hAcJcTd_AdQs_9s9d_5sQc() {
    assertEquals(
      "5sQc 9s9d AdQs",
      Solver.process("texas-holdem 5c8hAcJcTd AdQs 9s9d 5sQc"));
  }

  @Test
  public void test_texas_holdem_9328_4s5c5h8dTc_6d7h_3d3s_7d7c_2dJd_QsKc() {
    assertEquals(
      "2dJd QsKc 3d3s 7d7c 6d7h",
      Solver.process("texas-holdem 4s5c5h8dTc 6d7h 3d3s 7d7c 2dJd QsKc"));
  }

  @Test
  public void test_texas_holdem_9329_4h7hAcJsTc_8sTh_4c9d_3hAs_6sJc() {
    assertEquals(
      "4c9d 8sTh 6sJc 3hAs",
      Solver.process("texas-holdem 4h7hAcJsTc 8sTh 4c9d 3hAs 6sJc"));
  }

  @Test
  public void test_texas_holdem_9330_2c3h5sAdJs_Jd7h_Qs5c_9c7s_4sJh_3dAc() {
    assertEquals(
      "9c7s Qs5c Jd7h 3dAc 4sJh",
      Solver.process("texas-holdem 2c3h5sAdJs Jd7h Qs5c 9c7s 4sJh 3dAc"));
  }

  @Test
  public void test_texas_holdem_9331_4c5c7c9dTc_7d8d_4sQh_Td6d_5d2d_8cAh_Ac7h_Th7s_Jd6s() {
    assertEquals(
      "Jd6s 4sQh 5d2d 7d8d Td6d Th7s 8cAh Ac7h",
      Solver.process("texas-holdem 4c5c7c9dTc 7d8d 4sQh Td6d 5d2d 8cAh Ac7h Th7s Jd6s"));
  }

  @Test
  public void test_texas_holdem_9332_4d5cJsTcTs_Kh3s_7d6s_2d6c_Jc3h_Qc4c_Ah8d_2s4s_6hAd() {
    assertEquals(
      "2d6c 7d6s Kh3s 6hAd Ah8d 2s4s Qc4c Jc3h",
      Solver.process("texas-holdem 4d5cJsTcTs Kh3s 7d6s 2d6c Jc3h Qc4c Ah8d 2s4s 6hAd"));
  }

  @Test
  public void test_texas_holdem_9333_2d4h8hAcQs_JdAd_4c2h_Ah8c_9h5s_7h7c_Qd6c_4sJc_8d6d_8s6h() {
    assertEquals(
      "9h5s 4sJc 7h7c 8d6d=8s6h Qd6c JdAd 4c2h Ah8c",
      Solver.process("texas-holdem 2d4h8hAcQs JdAd 4c2h Ah8c 9h5s 7h7c Qd6c 4sJc 8d6d 8s6h"));
  }

  @Test
  public void test_texas_holdem_9334_5c7d9c9hQc_5sTh_3hQs_2dAh_JdTs_4c8h_7h2c_6h9d_JcJh_AcKd() {
    assertEquals(
      "4c8h JdTs 2dAh AcKd 5sTh 7h2c JcJh 3hQs 6h9d",
      Solver.process("texas-holdem 5c7d9c9hQc 5sTh 3hQs 2dAh JdTs 4c8h 7h2c 6h9d JcJh AcKd"));
  }

  @Test
  public void test_texas_holdem_9335_3d4c5d8dJs_KhAh_9hTh() {
    assertEquals(
      "9hTh KhAh",
      Solver.process("texas-holdem 3d4c5d8dJs KhAh 9hTh"));
  }

  @Test
  public void test_texas_holdem_9336_5c5s6d7dJh_AsTd_7hKs_8s2h_2s2d_Kd4h_Jc9s_Qd6c() {
    assertEquals(
      "8s2h Kd4h AsTd 2s2d Qd6c 7hKs Jc9s",
      Solver.process("texas-holdem 5c5s6d7dJh AsTd 7hKs 8s2h 2s2d Kd4h Jc9s Qd6c"));
  }

  @Test
  public void test_texas_holdem_9337_5d5h8c9c9d_6dTc_Td2d_Ah5s_7s8h_JcKd_7d7h() {
    assertEquals(
      "6dTc=Td2d JcKd 7d7h 7s8h Ah5s",
      Solver.process("texas-holdem 5d5h8c9c9d 6dTc Td2d Ah5s 7s8h JcKd 7d7h"));
  }

  @Test
  public void test_texas_holdem_9338_3d4c7h8sTd_AcKc_7c6c_8d4s_3h2d_6h2c() {
    assertEquals(
      "6h2c AcKc 3h2d 7c6c 8d4s",
      Solver.process("texas-holdem 3d4c7h8sTd AcKc 7c6c 8d4s 3h2d 6h2c"));
  }

  @Test
  public void test_texas_holdem_9339_2d6dJhKcQd_7h4s_6sAs_TcJd_3sKd() {
    assertEquals(
      "7h4s 6sAs TcJd 3sKd",
      Solver.process("texas-holdem 2d6dJhKcQd 7h4s 6sAs TcJd 3sKd"));
  }

  @Test
  public void test_texas_holdem_9340_4c8d8sJdQd_6sTh_Jh3c_4s9d_2h8c_6dQs_6cAc_7c9h_TsAd_5cTd() {
    assertEquals(
      "7c9h 5cTd=6sTh 6cAc=TsAd 4s9d Jh3c 6dQs 2h8c",
      Solver.process("texas-holdem 4c8d8sJdQd 6sTh Jh3c 4s9d 2h8c 6dQs 6cAc 7c9h TsAd 5cTd"));
  }

  @Test
  public void test_texas_holdem_9341_2s4h4s9dTh_Qc3c_QsQd_4c9h_8s3h_Ts9c_8hKc_KsTd() {
    assertEquals(
      "8s3h Qc3c 8hKc KsTd Ts9c QsQd 4c9h",
      Solver.process("texas-holdem 2s4h4s9dTh Qc3c QsQd 4c9h 8s3h Ts9c 8hKc KsTd"));
  }

  @Test
  public void test_texas_holdem_9342_5c7h9hAhJc_TdKh_4s3h_Qh6c() {
    assertEquals(
      "4s3h Qh6c TdKh",
      Solver.process("texas-holdem 5c7h9hAhJc TdKh 4s3h Qh6c"));
  }

  @Test
  public void test_texas_holdem_9343_3h4cAdJdQd_QcTd_2s9s_5c4s_4h7d_8cAc_6s2d_JhAs_Kc8d_KhJs() {
    assertEquals(
      "6s2d 2s9s Kc8d 4h7d=5c4s KhJs QcTd 8cAc JhAs",
      Solver.process("texas-holdem 3h4cAdJdQd QcTd 2s9s 5c4s 4h7d 8cAc 6s2d JhAs Kc8d KhJs"));
  }

  @Test
  public void test_texas_holdem_9344_2h2s8s9cQh_6h9s_Tc9d_ThJd_AhAs_3s8h_4h3h() {
    assertEquals(
      "4h3h 3s8h 6h9s=Tc9d AhAs ThJd",
      Solver.process("texas-holdem 2h2s8s9cQh 6h9s Tc9d ThJd AhAs 3s8h 4h3h"));
  }

  @Test
  public void test_texas_holdem_9345_4h8sJcQcQs_5d8d_Jd9c_4dAh_6d6c() {
    assertEquals(
      "4dAh 6d6c 5d8d Jd9c",
      Solver.process("texas-holdem 4h8sJcQcQs 5d8d Jd9c 4dAh 6d6c"));
  }

  @Test
  public void test_texas_holdem_9346_2c3d4c7hJs_TdKs_5c6h() {
    assertEquals(
      "TdKs 5c6h",
      Solver.process("texas-holdem 2c3d4c7hJs TdKs 5c6h"));
  }

  @Test
  public void test_texas_holdem_9347_9d9hAsKcKh_2hTs_Jc8s_7dTd_3c9c_Jd2d_7s6h_Js3d() {
    assertEquals(
      "2hTs=7dTd=7s6h=Jc8s=Jd2d=Js3d 3c9c",
      Solver.process("texas-holdem 9d9hAsKcKh 2hTs Jc8s 7dTd 3c9c Jd2d 7s6h Js3d"));
  }

  @Test
  public void test_texas_holdem_9348_2d4h7h7sJd_AsAd_8s8h_9d2c() {
    assertEquals(
      "9d2c 8s8h AsAd",
      Solver.process("texas-holdem 2d4h7h7sJd AsAd 8s8h 9d2c"));
  }

  @Test
  public void test_texas_holdem_9349_9hAcJsQcTc_Ks6c_2cAs_6d2s_5c8c_5h5d() {
    assertEquals(
      "6d2s 5h5d 2cAs Ks6c 5c8c",
      Solver.process("texas-holdem 9hAcJsQcTc Ks6c 2cAs 6d2s 5c8c 5h5d"));
  }

  @Test
  public void test_texas_holdem_9350_7d8sAcKcTc_Jh6s_7s2h_3hKs_4cAs_4sKd_Qc9h() {
    assertEquals(
      "Jh6s Qc9h 7s2h 3hKs=4sKd 4cAs",
      Solver.process("texas-holdem 7d8sAcKcTc Jh6s 7s2h 3hKs 4cAs 4sKd Qc9h"));
  }

  @Test
  public void test_texas_holdem_9351_3h9cJcKdQc_5dTh_Kh4s_5c3d_QhAd_As7c_9dAc_QsQd() {
    assertEquals(
      "As7c 5c3d 9dAc QhAd Kh4s QsQd 5dTh",
      Solver.process("texas-holdem 3h9cJcKdQc 5dTh Kh4s 5c3d QhAd As7c 9dAc QsQd"));
  }

  @Test
  public void test_texas_holdem_9352_2c2h4d9sAd_7d9c_ThJs_3s2s_5cKh_AsTd_5sKc_8s4h_QcJd() {
    assertEquals(
      "ThJs QcJd 5cKh=5sKc 8s4h 7d9c AsTd 3s2s",
      Solver.process("texas-holdem 2c2h4d9sAd 7d9c ThJs 3s2s 5cKh AsTd 5sKc 8s4h QcJd"));
  }

  @Test
  public void test_texas_holdem_9353_3d5c6d6s7h_4cKh_Qd3h_2s9h_3c3s_5d9d_2h4d_4sTs() {
    assertEquals(
      "2s9h Qd3h 5d9d 2h4d=4cKh=4sTs 3c3s",
      Solver.process("texas-holdem 3d5c6d6s7h 4cKh Qd3h 2s9h 3c3s 5d9d 2h4d 4sTs"));
  }

  @Test
  public void test_texas_holdem_9354_3h5h9cJcKs_As4c_8h8s_Ad3d_QsTc() {
    assertEquals(
      "As4c Ad3d 8h8s QsTc",
      Solver.process("texas-holdem 3h5h9cJcKs As4c 8h8s Ad3d QsTc"));
  }

  @Test
  public void test_texas_holdem_9355_2d2h5cKcQs_Js5h_ThAc_3s2s() {
    assertEquals(
      "ThAc Js5h 3s2s",
      Solver.process("texas-holdem 2d2h5cKcQs Js5h ThAc 3s2s"));
  }

  @Test
  public void test_texas_holdem_9356_3c7c7d7h9c_QhQd_8h8d_8sQs_Js8c_5cKs_3hAd_4sTc_5d4h() {
    assertEquals(
      "5d4h 4sTc Js8c 8sQs 5cKs 3hAd 8h8d QhQd",
      Solver.process("texas-holdem 3c7c7d7h9c QhQd 8h8d 8sQs Js8c 5cKs 3hAd 4sTc 5d4h"));
  }

  @Test
  public void test_texas_holdem_9357_7s8c9cAhAs_Jd4h_6d3d_7c4s_Th8s_2h5s_4dQd() {
    assertEquals(
      "2h5s=6d3d Jd4h 4dQd 7c4s Th8s",
      Solver.process("texas-holdem 7s8c9cAhAs Jd4h 6d3d 7c4s Th8s 2h5s 4dQd"));
  }

  @Test
  public void test_texas_holdem_9358_3s7h8h9hTc_8c6s_Jd7d_7c6d_Ts5d() {
    assertEquals(
      "Ts5d 7c6d=8c6s Jd7d",
      Solver.process("texas-holdem 3s7h8h9hTc 8c6s Jd7d 7c6d Ts5d"));
  }

  @Test
  public void test_texas_holdem_9359_4d6d8dAhTs_Qh6h_JhQs_KcAd_8sKh_2s3h_7d3s_9sJd_TcQc_ThQd() {
    assertEquals(
      "2s3h 7d3s 9sJd JhQs Qh6h 8sKh TcQc=ThQd KcAd",
      Solver.process("texas-holdem 4d6d8dAhTs Qh6h JhQs KcAd 8sKh 2s3h 7d3s 9sJd TcQc ThQd"));
  }

  @Test
  public void test_texas_holdem_9360_5d7dJcKsTs_9d5c_5s2h() {
    assertEquals(
      "5s2h=9d5c",
      Solver.process("texas-holdem 5d7dJcKsTs 9d5c 5s2h"));
  }

  @Test
  public void test_texas_holdem_9361_4h9sQdTcTs_3hAc_KcQc_5sQs_8h4d_6s2s_AdAs_QhTh_JdJh() {
    assertEquals(
      "6s2s 3hAc 8h4d JdJh 5sQs KcQc AdAs QhTh",
      Solver.process("texas-holdem 4h9sQdTcTs 3hAc KcQc 5sQs 8h4d 6s2s AdAs QhTh JdJh"));
  }

  @Test
  public void test_texas_holdem_9362_3d8cAcAsQh_4c2s_ThTd_4s5c_7d3c_6dTc_6c4h_JdTs_8hJh_5hKd() {
    assertEquals(
      "4c2s 4s5c 6c4h 6dTc JdTs 5hKd 7d3c 8hJh ThTd",
      Solver.process("texas-holdem 3d8cAcAsQh 4c2s ThTd 4s5c 7d3c 6dTc 6c4h JdTs 8hJh 5hKd"));
  }

  @Test
  public void test_texas_holdem_9363_5sJdKsTdTh_AhAs_TcKc() {
    assertEquals(
      "AhAs TcKc",
      Solver.process("texas-holdem 5sJdKsTdTh AhAs TcKc"));
  }

  @Test
  public void test_texas_holdem_9364_2d9d9sKhKs_Ts3s_8dAd_Qd4c_QsQh_Ah5c_8c7c() {
    assertEquals(
      "8c7c Ts3s Qd4c 8dAd=Ah5c QsQh",
      Solver.process("texas-holdem 2d9d9sKhKs Ts3s 8dAd Qd4c QsQh Ah5c 8c7c"));
  }

  @Test
  public void test_texas_holdem_9365_2c3h3s6hAd_Kc9d_4dAs_QdJh_8c7s_4sAc() {
    assertEquals(
      "8c7s QdJh Kc9d 4dAs=4sAc",
      Solver.process("texas-holdem 2c3h3s6hAd Kc9d 4dAs QdJh 8c7s 4sAc"));
  }

  @Test
  public void test_texas_holdem_9366_6d8h9cAcQs_AsJc_8s9d_3sQd_4c9h() {
    assertEquals(
      "4c9h 3sQd AsJc 8s9d",
      Solver.process("texas-holdem 6d8h9cAcQs AsJc 8s9d 3sQd 4c9h"));
  }

  @Test
  public void test_texas_holdem_9367_2c4d8d9sQs_3hQd_2dTd() {
    assertEquals(
      "2dTd 3hQd",
      Solver.process("texas-holdem 2c4d8d9sQs 3hQd 2dTd"));
  }

  @Test
  public void test_texas_holdem_9368_4c4s5dAcTd_KsQs_5c2h_9dKh() {
    assertEquals(
      "9dKh KsQs 5c2h",
      Solver.process("texas-holdem 4c4s5dAcTd KsQs 5c2h 9dKh"));
  }

  @Test
  public void test_texas_holdem_9369_4c8c8d8h9c_9s4h_6h5d_AhQh_Ad7c_Ks5h_9dQd() {
    assertEquals(
      "6h5d Ks5h Ad7c AhQh 9dQd=9s4h",
      Solver.process("texas-holdem 4c8c8d8h9c 9s4h 6h5d AhQh Ad7c Ks5h 9dQd"));
  }

  @Test
  public void test_texas_holdem_9370_2d3d4d7sTh_3h3s_2hJh_Kd6h_8dAc_TsAh_QcKs_7d6d() {
    assertEquals(
      "Kd6h QcKs 8dAc 2hJh TsAh 3h3s 7d6d",
      Solver.process("texas-holdem 2d3d4d7sTh 3h3s 2hJh Kd6h 8dAc TsAh QcKs 7d6d"));
  }

  @Test
  public void test_texas_holdem_9371_2h3s4c9dKd_2c8h_4h4d_7s9c_3cTd_7c5c_KsAc_5s6h() {
    assertEquals(
      "7c5c 2c8h 3cTd 7s9c KsAc 4h4d 5s6h",
      Solver.process("texas-holdem 2h3s4c9dKd 2c8h 4h4d 7s9c 3cTd 7c5c KsAc 5s6h"));
  }

  @Test
  public void test_texas_holdem_9372_3s4s5s9cKd_8c6c_Ts9s_3d7s_5d7c() {
    assertEquals(
      "8c6c 3d7s 5d7c Ts9s",
      Solver.process("texas-holdem 3s4s5s9cKd 8c6c Ts9s 3d7s 5d7c"));
  }

  @Test
  public void test_texas_holdem_9373_3h5hAsJcTc_5sQc_Ah5c_9d9s_3c4d() {
    assertEquals(
      "3c4d 5sQc 9d9s Ah5c",
      Solver.process("texas-holdem 3h5hAsJcTc 5sQc Ah5c 9d9s 3c4d"));
  }

  @Test
  public void test_texas_holdem_9374_4h4s5d8h9c_Jc5s_Ac8c_7sTh_Ks3d_2cJh_Tc2s_Qh6d() {
    assertEquals(
      "7sTh=Tc2s 2cJh Qh6d Ks3d Jc5s Ac8c",
      Solver.process("texas-holdem 4h4s5d8h9c Jc5s Ac8c 7sTh Ks3d 2cJh Tc2s Qh6d"));
  }

  @Test
  public void test_texas_holdem_9375_3c4h8h9cTs_2sAd_4sTh_Kd3h_6d9h_Td7h_5dKh_Ac4d_8cQd_JsQs() {
    assertEquals(
      "5dKh 2sAd Kd3h Ac4d 8cQd 6d9h Td7h 4sTh JsQs",
      Solver.process("texas-holdem 3c4h8h9cTs 2sAd 4sTh Kd3h 6d9h Td7h 5dKh Ac4d 8cQd JsQs"));
  }

  @Test
  public void test_texas_holdem_9376_2s9sAdKhTc_8sJs_Jh8h() {
    assertEquals(
      "8sJs=Jh8h",
      Solver.process("texas-holdem 2s9sAdKhTc 8sJs Jh8h"));
  }

  @Test
  public void test_texas_holdem_9377_6c6d7sKhQh_AhAd_3h6h() {
    assertEquals(
      "AhAd 3h6h",
      Solver.process("texas-holdem 6c6d7sKhQh AhAd 3h6h"));
  }

  @Test
  public void test_texas_holdem_9378_3s6s7d8dAs_Qs5d_ThTd_7sKs_QhJs_2cKc() {
    assertEquals(
      "Qs5d QhJs 2cKc ThTd 7sKs",
      Solver.process("texas-holdem 3s6s7d8dAs Qs5d ThTd 7sKs QhJs 2cKc"));
  }

  @Test
  public void test_texas_holdem_9379_2s3c6d6hKd_Ad4c_9s3h_2c2d_Td7s_Kh8c_5sTh() {
    assertEquals(
      "5sTh Td7s Ad4c 9s3h Kh8c 2c2d",
      Solver.process("texas-holdem 2s3c6d6hKd Ad4c 9s3h 2c2d Td7s Kh8c 5sTh"));
  }

  @Test
  public void test_texas_holdem_9380_3d4s5cThTs_3sJh_Ks5s_Ac2c_7d9h_Kc8h_9cQs() {
    assertEquals(
      "7d9h 9cQs Kc8h 3sJh Ks5s Ac2c",
      Solver.process("texas-holdem 3d4s5cThTs 3sJh Ks5s Ac2c 7d9h Kc8h 9cQs"));
  }

  @Test
  public void test_texas_holdem_9381_5h8d9sAsTd_Ah7c_AcJh() {
    assertEquals(
      "Ah7c AcJh",
      Solver.process("texas-holdem 5h8d9sAsTd Ah7c AcJh"));
  }

  @Test
  public void test_texas_holdem_9382_2s7c8cAsQh_5sAh_JsAc_Th6s_9s3d_8s9h_Jh6h() {
    assertEquals(
      "9s3d Th6s Jh6h 8s9h 5sAh JsAc",
      Solver.process("texas-holdem 2s7c8cAsQh 5sAh JsAc Th6s 9s3d 8s9h Jh6h"));
  }

  @Test
  public void test_texas_holdem_9383_4c6s8cKdKh_9hTc_7c5d_3dTs() {
    assertEquals(
      "3dTs 9hTc 7c5d",
      Solver.process("texas-holdem 4c6s8cKdKh 9hTc 7c5d 3dTs"));
  }

  @Test
  public void test_texas_holdem_9384_2c6h8cQcTs_5s5c_AhKc_As3s_2hKs_Kh2s() {
    assertEquals(
      "As3s AhKc 2hKs=Kh2s 5s5c",
      Solver.process("texas-holdem 2c6h8cQcTs 5s5c AhKc As3s 2hKs Kh2s"));
  }

  @Test
  public void test_texas_holdem_9385_5h8dJcKdTc_AsKc_Qh8h_6sJs_3sAc_9cTh_5s3h_6d5c_TsJd_9hQc() {
    assertEquals(
      "3sAc 5s3h=6d5c Qh8h 9cTh 6sJs AsKc TsJd 9hQc",
      Solver.process("texas-holdem 5h8dJcKdTc AsKc Qh8h 6sJs 3sAc 9cTh 5s3h 6d5c TsJd 9hQc"));
  }

  @Test
  public void test_texas_holdem_9386_4s5d8c8dAh_8h2h_5s6h_8sTc() {
    assertEquals(
      "5s6h 8h2h 8sTc",
      Solver.process("texas-holdem 4s5d8c8dAh 8h2h 5s6h 8sTc"));
  }

  @Test
  public void test_texas_holdem_9387_2c2sKdTdTs_Ah7s_Qd7c_5d8c_KcAc_3d4d_6cKs_Qs2d_4hQc() {
    assertEquals(
      "3d4d=4hQc=5d8c=Qd7c Ah7s 6cKs KcAc Qs2d",
      Solver.process("texas-holdem 2c2sKdTdTs Ah7s Qd7c 5d8c KcAc 3d4d 6cKs Qs2d 4hQc"));
  }

  @Test
  public void test_texas_holdem_9388_3d8d8hAsQc_Kd6d_Ah4h_Js3s_7hJc_4dKc() {
    assertEquals(
      "7hJc 4dKc=Kd6d Js3s Ah4h",
      Solver.process("texas-holdem 3d8d8hAsQc Kd6d Ah4h Js3s 7hJc 4dKc"));
  }

  @Test
  public void test_texas_holdem_9389_2s4d7hJdTh_2hJs_TsQs_4h4c() {
    assertEquals(
      "TsQs 2hJs 4h4c",
      Solver.process("texas-holdem 2s4d7hJdTh 2hJs TsQs 4h4c"));
  }

  @Test
  public void test_texas_holdem_9390_8hAdJcQcQh_6h8s_TcTh() {
    assertEquals(
      "6h8s TcTh",
      Solver.process("texas-holdem 8hAdJcQcQh 6h8s TcTh"));
  }

  @Test
  public void test_texas_holdem_9391_8c8d8hQcTh_JsTc_6dTs_Jc4c_9d4s_2dKd_9h2c_Qs5s() {
    assertEquals(
      "9d4s=9h2c Jc4c 2dKd 6dTs=JsTc Qs5s",
      Solver.process("texas-holdem 8c8d8hQcTh JsTc 6dTs Jc4c 9d4s 2dKd 9h2c Qs5s"));
  }

  @Test
  public void test_texas_holdem_9392_5c9cJhKhTd_9s4s_2sQs_Th5s_Qd9d() {
    assertEquals(
      "9s4s Th5s 2sQs=Qd9d",
      Solver.process("texas-holdem 5c9cJhKhTd 9s4s 2sQs Th5s Qd9d"));
  }

  @Test
  public void test_texas_holdem_9393_5c5d8hJdQd_7h5h_6dTc_AcJh_9hJc_Th3d_KcAh_Kh3s_9s9c_Ad4c() {
    assertEquals(
      "6dTc=Th3d Kh3s Ad4c KcAh 9s9c 9hJc AcJh 7h5h",
      Solver.process("texas-holdem 5c5d8hJdQd 7h5h 6dTc AcJh 9hJc Th3d KcAh Kh3s 9s9c Ad4c"));
  }

  @Test
  public void test_texas_holdem_9394_AdJcJhKcTs_6c4c_8cQd_KsQh_Kd4d_Th9c() {
    assertEquals(
      "6c4c Th9c Kd4d 8cQd=KsQh",
      Solver.process("texas-holdem AdJcJhKcTs 6c4c 8cQd KsQh Kd4d Th9c"));
  }

  @Test
  public void test_texas_holdem_9395_4s5h6c9hJh_8sAh_4d5c_7s6h_TsAc_2sJd_5sAs() {
    assertEquals(
      "8sAh TsAc 5sAs 7s6h 2sJd 4d5c",
      Solver.process("texas-holdem 4s5h6c9hJh 8sAh 4d5c 7s6h TsAc 2sJd 5sAs"));
  }

  @Test
  public void test_texas_holdem_9396_2d3hQdQhTc_Jh7c_7s9s() {
    assertEquals(
      "7s9s Jh7c",
      Solver.process("texas-holdem 2d3hQdQhTc Jh7c 7s9s"));
  }

  @Test
  public void test_texas_holdem_9397_7c8d9sQcQs_Td2d_QhTs_8hJd_7h4s_8cKd_2c3c_8s3h() {
    assertEquals(
      "2c3c Td2d 7h4s 8s3h 8hJd 8cKd QhTs",
      Solver.process("texas-holdem 7c8d9sQcQs Td2d QhTs 8hJd 7h4s 8cKd 2c3c 8s3h"));
  }

  @Test
  public void test_texas_holdem_9398_2d3d4c8s9s_4hQd_KhTd_6h6d_9h2h_2c4s_KcTh_7dJh_JsJc_Qs2s() {
    assertEquals(
      "7dJh KcTh=KhTd Qs2s 4hQd 6h6d JsJc 2c4s 9h2h",
      Solver.process("texas-holdem 2d3d4c8s9s 4hQd KhTd 6h6d 9h2h 2c4s KcTh 7dJh JsJc Qs2s"));
  }

  @Test
  public void test_texas_holdem_9399_8c8d9cJdTc_Ac4h_AsTs_Qc9s_8s7s() {
    assertEquals(
      "Ac4h AsTs 8s7s Qc9s",
      Solver.process("texas-holdem 8c8d9cJdTc Ac4h AsTs Qc9s 8s7s"));
  }

  @Test
  public void test_texas_holdem_9400_3c4h6s7h9c_QhAs_Ts4c_Qs8d_6d8c_JhKc_3sQc() {
    assertEquals(
      "Qs8d JhKc QhAs 3sQc Ts4c 6d8c",
      Solver.process("texas-holdem 3c4h6s7h9c QhAs Ts4c Qs8d 6d8c JhKc 3sQc"));
  }

  @Test
  public void test_texas_holdem_9401_4h5d5sKdQc_9h3h_5h7s_Tc6s_8d6d_2c9c_As3c_4cQd_8c2s_2dTs() {
    assertEquals(
      "8c2s=8d6d 2c9c=9h3h 2dTs=Tc6s As3c 4cQd 5h7s",
      Solver.process("texas-holdem 4h5d5sKdQc 9h3h 5h7s Tc6s 8d6d 2c9c As3c 4cQd 8c2s 2dTs"));
  }

  @Test
  public void test_texas_holdem_9402_2c6h8dTdTh_KdKs_9d5c_6sJd() {
    assertEquals(
      "9d5c 6sJd KdKs",
      Solver.process("texas-holdem 2c6h8dTdTh KdKs 9d5c 6sJd"));
  }

  @Test
  public void test_texas_holdem_9403_2c2s3c6h9h_5dJh_4cQc_5cQh_Kd9s_AdJs_2h4h_8h2d_8s4d_QsTd() {
    assertEquals(
      "8s4d 5dJh 4cQc=5cQh QsTd AdJs Kd9s 2h4h 8h2d",
      Solver.process("texas-holdem 2c2s3c6h9h 5dJh 4cQc 5cQh Kd9s AdJs 2h4h 8h2d 8s4d QsTd"));
  }

  @Test
  public void test_texas_holdem_9404_3sAhJdJhTs_6d8c_4s3c_6sKs() {
    assertEquals(
      "6d8c 6sKs 4s3c",
      Solver.process("texas-holdem 3sAhJdJhTs 6d8c 4s3c 6sKs"));
  }

  @Test
  public void test_texas_holdem_9405_4c5d7dJdTd_2c6h_8hTc_Js2s_Kh9s_9dTh_AdKs_3h4d_Qs3c_6sKc() {
    assertEquals(
      "2c6h Qs3c 6sKc Kh9s 8hTc Js2s 3h4d 9dTh AdKs",
      Solver.process("texas-holdem 4c5d7dJdTd 2c6h 8hTc Js2s Kh9s 9dTh AdKs 3h4d Qs3c 6sKc"));
  }

  @Test
  public void test_texas_holdem_9406_6s8sAhJsQd_7d6h_TdQh_AcKd_JcKc_2s4h_3cTc() {
    assertEquals(
      "2s4h 3cTc 7d6h JcKc TdQh AcKd",
      Solver.process("texas-holdem 6s8sAhJsQd 7d6h TdQh AcKd JcKc 2s4h 3cTc"));
  }

  @Test
  public void test_texas_holdem_9407_5c6dAhKcQd_4hJh_Ks8h_9c6c_5hAc_KdTh() {
    assertEquals(
      "4hJh 9c6c Ks8h KdTh 5hAc",
      Solver.process("texas-holdem 5c6dAhKcQd 4hJh Ks8h 9c6c 5hAc KdTh"));
  }

  @Test
  public void test_texas_holdem_9408_3c5h9dAcTs_ThQc_8c4h() {
    assertEquals(
      "8c4h ThQc",
      Solver.process("texas-holdem 3c5h9dAcTs ThQc 8c4h"));
  }

  @Test
  public void test_texas_holdem_9409_3h8d9h9sAs_2cJc_9d3s_Ts4h_TdQh_2s3d() {
    assertEquals(
      "Ts4h 2cJc TdQh 2s3d 9d3s",
      Solver.process("texas-holdem 3h8d9h9sAs 2cJc 9d3s Ts4h TdQh 2s3d"));
  }

  @Test
  public void test_texas_holdem_9410_2s4c5dAdJd_Th8h_QdJc_9s2c_5sKs() {
    assertEquals(
      "Th8h 9s2c 5sKs QdJc",
      Solver.process("texas-holdem 2s4c5dAdJd Th8h QdJc 9s2c 5sKs"));
  }

  @Test
  public void test_texas_holdem_9411_4cAcAdAhTh_Js9h_Ks7c_8s2c_9dAs_3c3h_JhKc_4hQs() {
    assertEquals(
      "8s2c Js9h Ks7c JhKc 3c3h 4hQs 9dAs",
      Solver.process("texas-holdem 4cAcAdAhTh Js9h Ks7c 8s2c 9dAs 3c3h JhKc 4hQs"));
  }

  @Test
  public void test_texas_holdem_9412_3s6c7cJhKh_2cAc_7d4h_7s5h_6h9d_JdQs_5c9h_2s7h_ThTc_Qd3h() {
    assertEquals(
      "5c9h 2cAc Qd3h 6h9d 2s7h=7d4h=7s5h ThTc JdQs",
      Solver.process("texas-holdem 3s6c7cJhKh 2cAc 7d4h 7s5h 6h9d JdQs 5c9h 2s7h ThTc Qd3h"));
  }

  @Test
  public void test_texas_holdem_9413_4c6h9hAsKd_3h5h_TsKh() {
    assertEquals(
      "3h5h TsKh",
      Solver.process("texas-holdem 4c6h9hAsKd 3h5h TsKh"));
  }

  @Test
  public void test_texas_holdem_9414_9sAsKsQhTh_5h8h_4sAc_4dTc_3c2c_Ad7h_Kc9c_4cQd() {
    assertEquals(
      "3c2c=5h8h 4dTc 4cQd 4sAc=Ad7h Kc9c",
      Solver.process("texas-holdem 9sAsKsQhTh 5h8h 4sAc 4dTc 3c2c Ad7h Kc9c 4cQd"));
  }

  @Test
  public void test_texas_holdem_9415_2c2s7h8hQc_5s6h_Ks4c_8cAc_Jc5h_4d2d() {
    assertEquals(
      "5s6h Jc5h Ks4c 8cAc 4d2d",
      Solver.process("texas-holdem 2c2s7h8hQc 5s6h Ks4c 8cAc Jc5h 4d2d"));
  }

  @Test
  public void test_texas_holdem_9416_2d6c6h8cQs_Ks5h_7s6s_JcTs_Js2h_Qc5s_3dTd_Ah5d_8sAs_Tc9h() {
    assertEquals(
      "3dTd Tc9h JcTs Ks5h Ah5d Js2h 8sAs Qc5s 7s6s",
      Solver.process("texas-holdem 2d6c6h8cQs Ks5h 7s6s JcTs Js2h Qc5s 3dTd Ah5d 8sAs Tc9h"));
  }

  @Test
  public void test_texas_holdem_9417_8s9cKsQhQs_Ts4c_3d9h() {
    assertEquals(
      "Ts4c 3d9h",
      Solver.process("texas-holdem 8s9cKsQhQs Ts4c 3d9h"));
  }

  @Test
  public void test_texas_holdem_9418_2h8c8hJdKh_Tc6s_Qs9c_QdTd_7sQh_4s2c_5dAh_AcJh_2s7h() {
    assertEquals(
      "Tc6s 7sQh=QdTd=Qs9c 5dAh 2s7h=4s2c AcJh",
      Solver.process("texas-holdem 2h8c8hJdKh Tc6s Qs9c QdTd 7sQh 4s2c 5dAh AcJh 2s7h"));
  }

  @Test
  public void test_texas_holdem_9419_5c7h9cQsTc_ThQc_KsKh_6c6h_QdTs_QhJc_7c2c() {
    assertEquals(
      "6c6h QhJc KsKh QdTs=ThQc 7c2c",
      Solver.process("texas-holdem 5c7h9cQsTc ThQc KsKh 6c6h QdTs QhJc 7c2c"));
  }

  @Test
  public void test_texas_holdem_9420_5d6c7d9cAd_2cJc_As6s_3d9d_Th4h_4s4c_JdQd_Qs8c_Td2d() {
    assertEquals(
      "Th4h 2cJc 4s4c As6s Qs8c 3d9d Td2d JdQd",
      Solver.process("texas-holdem 5d6c7d9cAd 2cJc As6s 3d9d Th4h 4s4c JdQd Qs8c Td2d"));
  }

  @Test
  public void test_texas_holdem_9421_5c6c8hAhTc_2h7c_4s3c_Jc2d_KhTs_3sAs_7h8s_QcQd() {
    assertEquals(
      "4s3c 2h7c Jc2d 7h8s KhTs QcQd 3sAs",
      Solver.process("texas-holdem 5c6c8hAhTc 2h7c 4s3c Jc2d KhTs 3sAs 7h8s QcQd"));
  }

  @Test
  public void test_texas_holdem_9422_5dJsKsQsTc_9s7s_ThAd_8cAh_9d8h_JhJc_7d8s_Qc6s_4c7c_Kh7h() {
    assertEquals(
      "4c7c 7d8s Qc6s Kh7h JhJc 9d8h 8cAh=ThAd 9s7s",
      Solver.process("texas-holdem 5dJsKsQsTc 9s7s ThAd 8cAh 9d8h JhJc 7d8s Qc6s 4c7c Kh7h"));
  }

  @Test
  public void test_texas_holdem_9423_2c4dKcQcQd_8s6d_JcQs() {
    assertEquals(
      "8s6d JcQs",
      Solver.process("texas-holdem 2c4dKcQcQd 8s6d JcQs"));
  }

  @Test
  public void test_texas_holdem_9424_6c7d9cQcTd_Jh9h_6h4d_8dTc_9s6d_5cJd_Ah5d_Kd7s() {
    assertEquals(
      "5cJd Ah5d 6h4d Kd7s Jh9h 9s6d 8dTc",
      Solver.process("texas-holdem 6c7d9cQcTd Jh9h 6h4d 8dTc 9s6d 5cJd Ah5d Kd7s"));
  }

  @Test
  public void test_texas_holdem_9425_3s7hJdQcTh_As2c_Qd7d_7sAd_3hJs_Ac4d() {
    assertEquals(
      "Ac4d=As2c 7sAd 3hJs Qd7d",
      Solver.process("texas-holdem 3s7hJdQcTh As2c Qd7d 7sAd 3hJs Ac4d"));
  }

  @Test
  public void test_texas_holdem_9426_5c6h7hQdQh_TcTh_7s8h_3dAc() {
    assertEquals(
      "3dAc 7s8h TcTh",
      Solver.process("texas-holdem 5c6h7hQdQh TcTh 7s8h 3dAc"));
  }

  @Test
  public void test_texas_holdem_9427_2c5s9sQcQd_Jd8c_Kh4d_8s6s_JhQh() {
    assertEquals(
      "8s6s Jd8c Kh4d JhQh",
      Solver.process("texas-holdem 2c5s9sQcQd Jd8c Kh4d 8s6s JhQh"));
  }

  @Test
  public void test_texas_holdem_9428_4s5d9sJcTc_Kc8s_Ac2d_6dKh() {
    assertEquals(
      "6dKh Kc8s Ac2d",
      Solver.process("texas-holdem 4s5d9sJcTc Kc8s Ac2d 6dKh"));
  }

  @Test
  public void test_texas_holdem_9429_2c3h6s8cAc_JdQs_AdJc_6hTc_AsAh() {
    assertEquals(
      "JdQs 6hTc AdJc AsAh",
      Solver.process("texas-holdem 2c3h6s8cAc JdQs AdJc 6hTc AsAh"));
  }

  @Test
  public void test_texas_holdem_9430_9hKcQcQsTs_Kd9c_3s7c() {
    assertEquals(
      "3s7c Kd9c",
      Solver.process("texas-holdem 9hKcQcQsTs Kd9c 3s7c"));
  }

  @Test
  public void test_texas_holdem_9431_4h7cKsQsTc_Qc3d_8cAs_9dTh_3c6s_5cAh_6c9s_6dJc() {
    assertEquals(
      "3c6s 6c9s 6dJc 5cAh 8cAs 9dTh Qc3d",
      Solver.process("texas-holdem 4h7cKsQsTc Qc3d 8cAs 9dTh 3c6s 5cAh 6c9s 6dJc"));
  }

  @Test
  public void test_texas_holdem_9432_4d8dAcKhTh_3d9d_3s7d_6d9s_Tc2h_Jc4s() {
    assertEquals(
      "3s7d 3d9d=6d9s Jc4s Tc2h",
      Solver.process("texas-holdem 4d8dAcKhTh 3d9d 3s7d 6d9s Tc2h Jc4s"));
  }

  @Test
  public void test_texas_holdem_9433_6h7sKhTcTs_7d9d_7h2s_8hAs_Qh4c_Ac9c_5dQc() {
    assertEquals(
      "5dQc=Qh4c 8hAs Ac9c 7d9d=7h2s",
      Solver.process("texas-holdem 6h7sKhTcTs 7d9d 7h2s 8hAs Qh4c Ac9c 5dQc"));
  }

  @Test
  public void test_texas_holdem_9434_4s8sJhJsKs_6dTs_7d3d_Qs5s() {
    assertEquals(
      "7d3d 6dTs Qs5s",
      Solver.process("texas-holdem 4s8sJhJsKs 6dTs 7d3d Qs5s"));
  }

  @Test
  public void test_texas_holdem_9435_3h7s8c8d8h_5cKs_3c3s_2hTs_2sTd_Qh9h_2d2c_KcTh_Kh7c_5s4h() {
    assertEquals(
      "5s4h 2hTs=2sTd Qh9h 5cKs KcTh 2d2c 3c3s Kh7c",
      Solver.process("texas-holdem 3h7s8c8d8h 5cKs 3c3s 2hTs 2sTd Qh9h 2d2c KcTh Kh7c 5s4h"));
  }

  @Test
  public void test_texas_holdem_9436_2dKcKdQsTh_5s3d_Jh5h_2c4s_7h6c_Ts7d_3cJs_9sQd_6s9d_Jd8d() {
    assertEquals(
      "5s3d 7h6c 6s9d 3cJs=Jd8d=Jh5h 2c4s Ts7d 9sQd",
      Solver.process("texas-holdem 2dKcKdQsTh 5s3d Jh5h 2c4s 7h6c Ts7d 3cJs 9sQd 6s9d Jd8d"));
  }

  @Test
  public void test_texas_holdem_9437_3c3h9cAcTc_Kc6s_7sJd_4cTd_8sQd_5sQh_Js6h() {
    assertEquals(
      "7sJd=Js6h 5sQh=8sQd 4cTd Kc6s",
      Solver.process("texas-holdem 3c3h9cAcTc Kc6s 7sJd 4cTd 8sQd 5sQh Js6h"));
  }

  @Test
  public void test_texas_holdem_9438_5s7h9sKsQc_5cQh_8s9c() {
    assertEquals(
      "8s9c 5cQh",
      Solver.process("texas-holdem 5s7h9sKsQc 5cQh 8s9c"));
  }

  @Test
  public void test_texas_holdem_9439_4c6d6s9sQc_Kh5c_3c9h_9c6h_Qd3h_4s2s_Ks3d_5h9d_7dJh_7cAh() {
    assertEquals(
      "7dJh Kh5c=Ks3d 7cAh 4s2s 3c9h=5h9d Qd3h 9c6h",
      Solver.process("texas-holdem 4c6d6s9sQc Kh5c 3c9h 9c6h Qd3h 4s2s Ks3d 5h9d 7dJh 7cAh"));
  }

  @Test
  public void test_texas_holdem_9440_6d9c9dJcKd_ThTc_2dQc_6s5h_2h4s_6hAd_3c5c_4c9h_9s5d() {
    assertEquals(
      "2h4s=3c5c 2dQc 6s5h 6hAd ThTc 4c9h=9s5d",
      Solver.process("texas-holdem 6d9c9dJcKd ThTc 2dQc 6s5h 2h4s 6hAd 3c5c 4c9h 9s5d"));
  }

  @Test
  public void test_texas_holdem_9441_3d7d8cAcTc_2d4h_8h7h() {
    assertEquals(
      "2d4h 8h7h",
      Solver.process("texas-holdem 3d7d8cAcTc 2d4h 8h7h"));
  }

  @Test
  public void test_texas_holdem_9442_2h6d6s8cQs_6cJs_AcKh_2cKs_8sTs_3cQh() {
    assertEquals(
      "AcKh 2cKs 8sTs 3cQh 6cJs",
      Solver.process("texas-holdem 2h6d6s8cQs 6cJs AcKh 2cKs 8sTs 3cQh"));
  }

  @Test
  public void test_texas_holdem_9443_6h7c7dAdAh_KsTh_Ts3c_Tc7h_9s6c() {
    assertEquals(
      "9s6c Ts3c KsTh Tc7h",
      Solver.process("texas-holdem 6h7c7dAdAh KsTh Ts3c Tc7h 9s6c"));
  }

  @Test
  public void test_texas_holdem_9444_2c9d9sAdQc_Kd6h_8d7h() {
    assertEquals(
      "8d7h Kd6h",
      Solver.process("texas-holdem 2c9d9sAdQc Kd6h 8d7h"));
  }

  @Test
  public void test_texas_holdem_9445_4h9c9hThTs_8d3d_JcKh() {
    assertEquals(
      "8d3d JcKh",
      Solver.process("texas-holdem 4h9c9hThTs 8d3d JcKh"));
  }

  @Test
  public void test_texas_holdem_9446_2s3s7s9cKc_8dKd_9d8c_4s3h_7cTd_6d6c_5dTh_KhQh() {
    assertEquals(
      "5dTh 4s3h 6d6c 7cTd 9d8c 8dKd KhQh",
      Solver.process("texas-holdem 2s3s7s9cKc 8dKd 9d8c 4s3h 7cTd 6d6c 5dTh KhQh"));
  }

  @Test
  public void test_texas_holdem_9447_4c5d6d7cTh_4dAc_4h2d() {
    assertEquals(
      "4h2d 4dAc",
      Solver.process("texas-holdem 4c5d6d7cTh 4dAc 4h2d"));
  }

  @Test
  public void test_texas_holdem_9448_5d9c9sQcTs_4hJh_8c6c_TdQd_4c6d() {
    assertEquals(
      "4c6d 8c6c 4hJh TdQd",
      Solver.process("texas-holdem 5d9c9sQcTs 4hJh 8c6c TdQd 4c6d"));
  }

  @Test
  public void test_texas_holdem_9449_2s8h9sAhAs_3cJc_Jd8c_6cQh() {
    assertEquals(
      "3cJc 6cQh Jd8c",
      Solver.process("texas-holdem 2s8h9sAhAs 3cJc Jd8c 6cQh"));
  }

  @Test
  public void test_texas_holdem_9450_2c2h7hTcTh_5c7c_7s9h_6s6h_TsJc_9dQh_JhTd_9cKs_3d3s() {
    assertEquals(
      "9dQh 9cKs 3d3s 6s6h 5c7c 7s9h JhTd=TsJc",
      Solver.process("texas-holdem 2c2h7hTcTh 5c7c 7s9h 6s6h TsJc 9dQh JhTd 9cKs 3d3s"));
  }

  @Test
  public void test_texas_holdem_9451_2c4h7h9hQs_6hTs_3h6c_Js7d_7sTc() {
    assertEquals(
      "3h6c 6hTs 7sTc Js7d",
      Solver.process("texas-holdem 2c4h7h9hQs 6hTs 3h6c Js7d 7sTc"));
  }

  @Test
  public void test_texas_holdem_9452_4h5d7sAhTh_Qh8c_7c5s_9d4c_AsTs_2sKd() {
    assertEquals(
      "Qh8c 2sKd 9d4c 7c5s AsTs",
      Solver.process("texas-holdem 4h5d7sAhTh Qh8c 7c5s 9d4c AsTs 2sKd"));
  }

  @Test
  public void test_texas_holdem_9453_5s6c6h7dJc_3c9s_QcJs_3dAs_KdQh() {
    assertEquals(
      "3c9s KdQh 3dAs QcJs",
      Solver.process("texas-holdem 5s6c6h7dJc 3c9s QcJs 3dAs KdQh"));
  }

  @Test
  public void test_texas_holdem_9454_AhQdTcTdTs_6s4d_9sKc_Jh4c_5c4h_Ks7s() {
    assertEquals(
      "5c4h=6s4d=Jh4c 9sKc=Ks7s",
      Solver.process("texas-holdem AhQdTcTdTs 6s4d 9sKc Jh4c 5c4h Ks7s"));
  }

  @Test
  public void test_texas_holdem_9455_3d6h7c8h8s_As3s_AdTh_Qh4s_8cTc_5dQd_Qs7d_2h8d() {
    assertEquals(
      "5dQd=Qh4s AdTh As3s Qs7d 2h8d 8cTc",
      Solver.process("texas-holdem 3d6h7c8h8s As3s AdTh Qh4s 8cTc 5dQd Qs7d 2h8d"));
  }

  @Test
  public void test_texas_holdem_9456_5s6c6d7sKd_Qh9h_3hTs() {
    assertEquals(
      "3hTs Qh9h",
      Solver.process("texas-holdem 5s6c6d7sKd Qh9h 3hTs"));
  }

  @Test
  public void test_texas_holdem_9457_4c5d6cAdKs_Js5h_JhKc_Qc5s() {
    assertEquals(
      "Js5h Qc5s JhKc",
      Solver.process("texas-holdem 4c5d6cAdKs Js5h JhKc Qc5s"));
  }

  @Test
  public void test_texas_holdem_9458_5d7d8hAsTh_5sQh_2s6c_4c4d_6h4h_2h8d() {
    assertEquals(
      "2s6c 4c4d 5sQh 2h8d 6h4h",
      Solver.process("texas-holdem 5d7d8hAsTh 5sQh 2s6c 4c4d 6h4h 2h8d"));
  }

  @Test
  public void test_texas_holdem_9459_7s9hJsKcKd_Jh8d_4d3c_6sTh() {
    assertEquals(
      "4d3c 6sTh Jh8d",
      Solver.process("texas-holdem 7s9hJsKcKd Jh8d 4d3c 6sTh"));
  }

  @Test
  public void test_texas_holdem_9460_4c5h8c9cQh_2h4d_6h7c_QcJh_6cAh_9h5c_2c8h_3c8s_As7h_AdJd() {
    assertEquals(
      "6cAh As7h AdJd 2h4d 2c8h=3c8s QcJh 9h5c 6h7c",
      Solver.process("texas-holdem 4c5h8c9cQh 2h4d 6h7c QcJh 6cAh 9h5c 2c8h 3c8s As7h AdJd"));
  }

  @Test
  public void test_texas_holdem_9461_4h8cAdKhKs_2s2h_AsTd_8d3c_5sQc_2d9c() {
    assertEquals(
      "2d9c 5sQc 2s2h 8d3c AsTd",
      Solver.process("texas-holdem 4h8cAdKhKs 2s2h AsTd 8d3c 5sQc 2d9c"));
  }

  @Test
  public void test_texas_holdem_9462_5h7hTcTdTh_9c8c_5cAd_JhKh_6c6d_2dKc_3s3h_6h5d_As8s() {
    assertEquals(
      "9c8c 2dKc As8s JhKh 3s3h 5cAd=6h5d 6c6d",
      Solver.process("texas-holdem 5h7hTcTdTh 9c8c 5cAd JhKh 6c6d 2dKc 3s3h 6h5d As8s"));
  }

  @Test
  public void test_texas_holdem_9463_6d6h8cQsTs_5hKc_Ac5s_2cJc_3h6s_AhAd() {
    assertEquals(
      "2cJc 5hKc Ac5s AhAd 3h6s",
      Solver.process("texas-holdem 6d6h8cQsTs 5hKc Ac5s 2cJc 3h6s AhAd"));
  }

  @Test
  public void test_texas_holdem_9464_2d5c5sJcQc_As6c_6dAd_Qd8c_5dAh_9sKd_Kh5h_8s6s() {
    assertEquals(
      "8s6s 9sKd 6dAd=As6c Qd8c Kh5h 5dAh",
      Solver.process("texas-holdem 2d5c5sJcQc As6c 6dAd Qd8c 5dAh 9sKd Kh5h 8s6s"));
  }

  @Test
  public void test_texas_holdem_9465_2c3h8h9hQd_5h4d_6sJd_7d5c_3d7s() {
    assertEquals(
      "5h4d 7d5c 6sJd 3d7s",
      Solver.process("texas-holdem 2c3h8h9hQd 5h4d 6sJd 7d5c 3d7s"));
  }

  @Test
  public void test_texas_holdem_9466_5h5s7hAdAs_6sTh_AhJc_8h5c_3sQs_2c9s_Ks7c_KcKh_5d4s() {
    assertEquals(
      "2c9s 6sTh 3sQs Ks7c KcKh 5d4s=8h5c AhJc",
      Solver.process("texas-holdem 5h5s7hAdAs 6sTh AhJc 8h5c 3sQs 2c9s Ks7c KcKh 5d4s"));
  }

  @Test
  public void test_texas_holdem_9467_2c2s3c9dAs_4c7d_6cTs_KsTh_2hKh_QcQh_QsJd_Kd8s_TcKc_7sAd() {
    assertEquals(
      "4c7d 6cTs QsJd Kd8s KsTh=TcKc QcQh 7sAd 2hKh",
      Solver.process("texas-holdem 2c2s3c9dAs 4c7d 6cTs KsTh 2hKh QcQh QsJd Kd8s TcKc 7sAd"));
  }

  @Test
  public void test_texas_holdem_9468_3c3h4sKdTc_Ks4d_Kc5c_3d4c_9h5h_JdQd() {
    assertEquals(
      "9h5h JdQd Kc5c Ks4d 3d4c",
      Solver.process("texas-holdem 3c3h4sKdTc Ks4d Kc5c 3d4c 9h5h JdQd"));
  }

  @Test
  public void test_texas_holdem_9469_5sAhJsQdQh_3h3s_Tc8c_9d5h_9s9h_As6h_Ac2c_Jc4c_8d4d_JhQc() {
    assertEquals(
      "8d4d Tc8c 3h3s 9d5h 9s9h Jc4c Ac2c=As6h JhQc",
      Solver.process("texas-holdem 5sAhJsQdQh 3h3s Tc8c 9d5h 9s9h As6h Ac2c Jc4c 8d4d JhQc"));
  }

  @Test
  public void test_texas_holdem_9470_2h3h4d6d6s_8hKs_9sJh_7d9h_4s5c_QhAh_Tc8d_Ac2s_ThTs_Qs3d() {
    assertEquals(
      "7d9h Tc8d 9sJh 8hKs QhAh Ac2s Qs3d ThTs 4s5c",
      Solver.process("texas-holdem 2h3h4d6d6s 8hKs 9sJh 7d9h 4s5c QhAh Tc8d Ac2s ThTs Qs3d"));
  }

  @Test
  public void test_texas_holdem_9471_3s5sAhJhJs_4hQc_6dJc_TdTh_8d2d_2s7h() {
    assertEquals(
      "2s7h 8d2d 4hQc TdTh 6dJc",
      Solver.process("texas-holdem 3s5sAhJhJs 4hQc 6dJc TdTh 8d2d 2s7h"));
  }

  @Test
  public void test_texas_holdem_9472_2c3s9c9sQh_3h7c_5dJs_Th4h() {
    assertEquals(
      "Th4h 5dJs 3h7c",
      Solver.process("texas-holdem 2c3s9c9sQh 3h7c 5dJs Th4h"));
  }

  @Test
  public void test_texas_holdem_9473_9cAcJcQdTd_9sTs_6c3h_Jd5h_Kc9h_2h8h() {
    assertEquals(
      "6c3h Jd5h 9sTs 2h8h Kc9h",
      Solver.process("texas-holdem 9cAcJcQdTd 9sTs 6c3h Jd5h Kc9h 2h8h"));
  }

  @Test
  public void test_texas_holdem_9474_3h6d7d8hKh_2s7h_7cAd() {
    assertEquals(
      "2s7h 7cAd",
      Solver.process("texas-holdem 3h6d7d8hKh 2s7h 7cAd"));
  }

  @Test
  public void test_texas_holdem_9475_7d9sAdAhKc_QhJh_6h6c_TdTs_7c3h_8d7h_Qd9c_KhQc_Qs4s_4h2s() {
    assertEquals(
      "4h2s Qs4s QhJh 6h6c 7c3h=8d7h Qd9c TdTs KhQc",
      Solver.process("texas-holdem 7d9sAdAhKc QhJh 6h6c TdTs 7c3h 8d7h Qd9c KhQc Qs4s 4h2s"));
  }

  @Test
  public void test_texas_holdem_9476_4s5d7hAdQh_9h4c_9c6s_Js3c() {
    assertEquals(
      "9c6s Js3c 9h4c",
      Solver.process("texas-holdem 4s5d7hAdQh 9h4c 9c6s Js3c"));
  }

  @Test
  public void test_texas_holdem_9477_2c5d5h5s8d_Qd7h_KsTc_JhJd_9c8h_Td3h() {
    assertEquals(
      "Td3h Qd7h KsTc 9c8h JhJd",
      Solver.process("texas-holdem 2c5d5h5s8d Qd7h KsTc JhJd 9c8h Td3h"));
  }

  @Test
  public void test_texas_holdem_9478_3h4hAcJsTc_Qd6h_5h9d_2d4s_2h4d_2cAd() {
    assertEquals(
      "5h9d Qd6h 2d4s=2h4d 2cAd",
      Solver.process("texas-holdem 3h4hAcJsTc Qd6h 5h9d 2d4s 2h4d 2cAd"));
  }

  @Test
  public void test_texas_holdem_9479_2s3d4c7sKs_Td4s_Js8h_QsJc_Jh3s_7dAc_8d6h_As5h_4h9c_5dAd() {
    assertEquals(
      "8d6h Js8h QsJc Jh3s 4h9c Td4s 7dAc 5dAd=As5h",
      Solver.process("texas-holdem 2s3d4c7sKs Td4s Js8h QsJc Jh3s 7dAc 8d6h As5h 4h9c 5dAd"));
  }

  @Test
  public void test_texas_holdem_9480_7h9cTdThTs_6cKc_Qs7c_JhQd_3d7d_Kd9s_5dKs_4s3s_Ad2c_4c5s() {
    assertEquals(
      "4c5s=4s3s JhQd 5dKs=6cKc Ad2c 3d7d=Qs7c Kd9s",
      Solver.process("texas-holdem 7h9cTdThTs 6cKc Qs7c JhQd 3d7d Kd9s 5dKs 4s3s Ad2c 4c5s"));
  }

  @Test
  public void test_texas_holdem_9481_3d3h5s6h7c_Jc6c_5d9s_8h5c_7d9d_4dTs_7s8s_6s2h_Jh5h_6d2d() {
    assertEquals(
      "8h5c 5d9s Jh5h 6d2d=6s2h Jc6c 7s8s 7d9d 4dTs",
      Solver.process("texas-holdem 3d3h5s6h7c Jc6c 5d9s 8h5c 7d9d 4dTs 7s8s 6s2h Jh5h 6d2d"));
  }

  @Test
  public void test_texas_holdem_9482_7h9sAsKdQd_TsKc_TdAd_AhJc_Js9c_4c3h() {
    assertEquals(
      "4c3h Js9c TsKc TdAd AhJc",
      Solver.process("texas-holdem 7h9sAsKdQd TsKc TdAd AhJc Js9c 4c3h"));
  }

  @Test
  public void test_texas_holdem_9483_2h5h5sQdTs_9d3c_Qc3d_9s5c_ThAc_9h6c_3s4h_Tc8d_7c5d_2d4c() {
    assertEquals(
      "3s4h 9d3c=9h6c 2d4c Tc8d ThAc Qc3d 7c5d=9s5c",
      Solver.process("texas-holdem 2h5h5sQdTs 9d3c Qc3d 9s5c ThAc 9h6c 3s4h Tc8d 7c5d 2d4c"));
  }

  @Test
  public void test_texas_holdem_9484_2d4s6cAsQd_7c8d_8c4h() {
    assertEquals(
      "7c8d 8c4h",
      Solver.process("texas-holdem 2d4s6cAsQd 7c8d 8c4h"));
  }

  @Test
  public void test_texas_holdem_9485_2c4d6h7cQs_Js8c_AhAd_6s7h() {
    assertEquals(
      "Js8c AhAd 6s7h",
      Solver.process("texas-holdem 2c4d6h7cQs Js8c AhAd 6s7h"));
  }

  @Test
  public void test_texas_holdem_9486_4c6h7dQdTc_Td9h_4d3d_ThQh_3h6s_9dJd_6cKh_Jh7s() {
    assertEquals(
      "9dJd 4d3d 3h6s 6cKh Jh7s Td9h ThQh",
      Solver.process("texas-holdem 4c6h7dQdTc Td9h 4d3d ThQh 3h6s 9dJd 6cKh Jh7s"));
  }

  @Test
  public void test_texas_holdem_9487_6s7c8d8sJh_5sTh_6c3s_QhAd() {
    assertEquals(
      "5sTh QhAd 6c3s",
      Solver.process("texas-holdem 6s7c8d8sJh 5sTh 6c3s QhAd"));
  }

  @Test
  public void test_texas_holdem_9488_2d5dAhQcTs_JhAc_ThAd_7dQh_3sKh_5h2h_2s3c() {
    assertEquals(
      "3sKh 2s3c 7dQh JhAc 5h2h ThAd",
      Solver.process("texas-holdem 2d5dAhQcTs JhAc ThAd 7dQh 3sKh 5h2h 2s3c"));
  }

  @Test
  public void test_texas_holdem_9489_2c8c9sQcTs_7d9d_9c8d_Th3c_Tc6s() {
    assertEquals(
      "7d9d Tc6s=Th3c 9c8d",
      Solver.process("texas-holdem 2c8c9sQcTs 7d9d 9c8d Th3c Tc6s"));
  }

  @Test
  public void test_texas_holdem_9490_2c9cKcQcTd_9s4d_Ts9h_3hJd_Js7d_2dJc_As7c_Jh3s_3d2s() {
    assertEquals(
      "3d2s 9s4d Ts9h 3hJd=Jh3s=Js7d As7c 2dJc",
      Solver.process("texas-holdem 2c9cKcQcTd 9s4d Ts9h 3hJd Js7d 2dJc As7c Jh3s 3d2s"));
  }

  @Test
  public void test_texas_holdem_9491_3c6d7h9dQh_3h3s_5cAs_Jd2s_6c8s() {
    assertEquals(
      "Jd2s 5cAs 6c8s 3h3s",
      Solver.process("texas-holdem 3c6d7h9dQh 3h3s 5cAs Jd2s 6c8s"));
  }

  @Test
  public void test_texas_holdem_9492_2s4c4d8sAd_3d6s_Tc9h_5cKh_Jc5s_4s6c_5h7d_9s2d_As7c() {
    assertEquals(
      "3d6s 5h7d Tc9h Jc5s 5cKh 9s2d As7c 4s6c",
      Solver.process("texas-holdem 2s4c4d8sAd 3d6s Tc9h 5cKh Jc5s 4s6c 5h7d 9s2d As7c"));
  }

  @Test
  public void test_texas_holdem_9493_4d4s9cJhQs_6h6s_Tc5c_6dTd_9d7h() {
    assertEquals(
      "6dTd=Tc5c 6h6s 9d7h",
      Solver.process("texas-holdem 4d4s9cJhQs 6h6s Tc5c 6dTd 9d7h"));
  }

  @Test
  public void test_texas_holdem_9494_5h7s9dJdTc_9s4c_Qd7h_2c2h_3d5s_4sJs() {
    assertEquals(
      "2c2h 3d5s Qd7h 9s4c 4sJs",
      Solver.process("texas-holdem 5h7s9dJdTc 9s4c Qd7h 2c2h 3d5s 4sJs"));
  }

  @Test
  public void test_texas_holdem_9495_2c2d3h8dQs_Jd5d_As3s() {
    assertEquals(
      "Jd5d As3s",
      Solver.process("texas-holdem 2c2d3h8dQs Jd5d As3s"));
  }

  @Test
  public void test_texas_holdem_9496_3c4h8cAdQh_Td3s_9s6d_9cTs() {
    assertEquals(
      "9s6d 9cTs Td3s",
      Solver.process("texas-holdem 3c4h8cAdQh Td3s 9s6d 9cTs"));
  }

  @Test
  public void test_texas_holdem_9497_2c3h3s6sJs_Qd9s_9h6h_QsAd_5s4s_2dJd_2h4d_KcAs() {
    assertEquals(
      "Qd9s QsAd KcAs 2h4d 9h6h 2dJd 5s4s",
      Solver.process("texas-holdem 2c3h3s6sJs Qd9s 9h6h QsAd 5s4s 2dJd 2h4d KcAs"));
  }

  @Test
  public void test_texas_holdem_9498_4c5s6s8sJs_As2s_7cQd_Kh2h_6hAc_8cJh_Qc3h_3s5d_Jc9c_TsQs() {
    assertEquals(
      "Qc3h Kh2h 6hAc Jc9c 8cJh 7cQd 3s5d TsQs As2s",
      Solver.process("texas-holdem 4c5s6s8sJs As2s 7cQd Kh2h 6hAc 8cJh Qc3h 3s5d Jc9c TsQs"));
  }

  @Test
  public void test_texas_holdem_9499_3d7h7s8dTd_3sTh_KhAc() {
    assertEquals(
      "KhAc 3sTh",
      Solver.process("texas-holdem 3d7h7s8dTd 3sTh KhAc"));
  }

}
