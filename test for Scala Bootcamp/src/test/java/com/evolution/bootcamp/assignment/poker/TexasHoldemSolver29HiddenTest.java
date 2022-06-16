
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver29HiddenTest {


  @Test
  public void test_texas_holdem_7250_2d3h6c6h8h_KsKc_4dQc_4s5s_9dTh_2h7s() {
    assertEquals(
      "9dTh 4dQc 2h7s KsKc 4s5s",
      Solver.process("texas-holdem 2d3h6c6h8h KsKc 4dQc 4s5s 9dTh 2h7s"));
  }

  @Test
  public void test_texas_holdem_7251_4d6h8s9sJh_JsAs_8hJd_QdTd_4s7d_4h7s_AdQh_2s6s() {
    assertEquals(
      "AdQh 4h7s=4s7d 2s6s JsAs 8hJd QdTd",
      Solver.process("texas-holdem 4d6h8s9sJh JsAs 8hJd QdTd 4s7d 4h7s AdQh 2s6s"));
  }

  @Test
  public void test_texas_holdem_7252_3d9hAsTdTs_3sJd_5c6c() {
    assertEquals(
      "5c6c 3sJd",
      Solver.process("texas-holdem 3d9hAsTdTs 3sJd 5c6c"));
  }

  @Test
  public void test_texas_holdem_7253_3c6sAcJsQh_4s5s_9s6d_Qs7s_As4d() {
    assertEquals(
      "4s5s 9s6d Qs7s As4d",
      Solver.process("texas-holdem 3c6sAcJsQh 4s5s 9s6d Qs7s As4d"));
  }

  @Test
  public void test_texas_holdem_7254_6c7h9sKdQs_7s5h_6d7d_QcTs_TcKs_4dTd_JhJd() {
    assertEquals(
      "4dTd 7s5h JhJd QcTs TcKs 6d7d",
      Solver.process("texas-holdem 6c7h9sKdQs 7s5h 6d7d QcTs TcKs 4dTd JhJd"));
  }

  @Test
  public void test_texas_holdem_7255_3h5h9h9sTc_9dTs_2sJs_6s4h_6h4s_AdKc_Td8s() {
    assertEquals(
      "6h4s=6s4h 2sJs AdKc Td8s 9dTs",
      Solver.process("texas-holdem 3h5h9h9sTc 9dTs 2sJs 6s4h 6h4s AdKc Td8s"));
  }

  @Test
  public void test_texas_holdem_7256_3d4d8sKhKs_6c6s_KdQh_Qs9h_7s8d_9s8h_9d3h_2cKc() {
    assertEquals(
      "Qs9h 9d3h 6c6s 7s8d 9s8h 2cKc KdQh",
      Solver.process("texas-holdem 3d4d8sKhKs 6c6s KdQh Qs9h 7s8d 9s8h 9d3h 2cKc"));
  }

  @Test
  public void test_texas_holdem_7257_3c5h7cKdQh_6hTd_8c2d_2cKs_5sAd_AcTh_Kh3s_Jd4c_4h3h() {
    assertEquals(
      "8c2d 6hTd Jd4c AcTh 4h3h 5sAd 2cKs Kh3s",
      Solver.process("texas-holdem 3c5h7cKdQh 6hTd 8c2d 2cKs 5sAd AcTh Kh3s Jd4c 4h3h"));
  }

  @Test
  public void test_texas_holdem_7258_7c7s8c9cKc_4c6h_AsTc_2d2s() {
    assertEquals(
      "2d2s 4c6h AsTc",
      Solver.process("texas-holdem 7c7s8c9cKc 4c6h AsTc 2d2s"));
  }

  @Test
  public void test_texas_holdem_7259_5c9cAdAsTh_5s6h_9hKs_KdQs_Qd9s() {
    assertEquals(
      "KdQs 5s6h Qd9s 9hKs",
      Solver.process("texas-holdem 5c9cAdAsTh 5s6h 9hKs KdQs Qd9s"));
  }

  @Test
  public void test_texas_holdem_7260_2s3s8c9hAc_2d5c_9s7s_KcAh_Qc5d_6sJc_QdJs() {
    assertEquals(
      "6sJc Qc5d QdJs 2d5c 9s7s KcAh",
      Solver.process("texas-holdem 2s3s8c9hAc 2d5c 9s7s KcAh Qc5d 6sJc QdJs"));
  }

  @Test
  public void test_texas_holdem_7261_6c7h9cJcQs_As8h_5h6s_KdTs_Qc6h_3h6d_2s4s_7s7c_9dTc_8dKh() {
    assertEquals(
      "2s4s 8dKh As8h 3h6d=5h6s 9dTc Qc6h 7s7c KdTs",
      Solver.process("texas-holdem 6c7h9cJcQs As8h 5h6s KdTs Qc6h 3h6d 2s4s 7s7c 9dTc 8dKh"));
  }

  @Test
  public void test_texas_holdem_7262_3h4s7d7hTd_6s8h_2h4c_QcQh_8dTc_6dAs() {
    assertEquals(
      "6s8h 6dAs 2h4c 8dTc QcQh",
      Solver.process("texas-holdem 3h4s7d7hTd 6s8h 2h4c QcQh 8dTc 6dAs"));
  }

  @Test
  public void test_texas_holdem_7263_3s4d8h9cKs_9h8s_Th6c_3cTc_JdQd() {
    assertEquals(
      "Th6c JdQd 3cTc 9h8s",
      Solver.process("texas-holdem 3s4d8h9cKs 9h8s Th6c 3cTc JdQd"));
  }

  @Test
  public void test_texas_holdem_7264_2s4c4h8h8s_Qd2c_KsKc_Th7c_2d9s_2h3s_Tc8c_3c5c() {
    assertEquals(
      "2h3s 3c5c 2d9s Th7c Qd2c KsKc Tc8c",
      Solver.process("texas-holdem 2s4c4h8h8s Qd2c KsKc Th7c 2d9s 2h3s Tc8c 3c5c"));
  }

  @Test
  public void test_texas_holdem_7265_3c4d8cKsTd_QsAc_3sKc_7s9d_2cJs_Ah4h_8sQd_5cAd() {
    assertEquals(
      "7s9d 2cJs 5cAd QsAc Ah4h 8sQd 3sKc",
      Solver.process("texas-holdem 3c4d8cKsTd QsAc 3sKc 7s9d 2cJs Ah4h 8sQd 5cAd"));
  }

  @Test
  public void test_texas_holdem_7266_6c8s9dTcTd_Jc2c_ThQh_8dKs() {
    assertEquals(
      "Jc2c 8dKs ThQh",
      Solver.process("texas-holdem 6c8s9dTcTd Jc2c ThQh 8dKs"));
  }

  @Test
  public void test_texas_holdem_7267_3h7c9sJdQc_4d4s_Jc9d_Th4c_2d2s_3d7d_6hQh_7sAc() {
    assertEquals(
      "Th4c 2d2s 4d4s 7sAc 6hQh 3d7d Jc9d",
      Solver.process("texas-holdem 3h7c9sJdQc 4d4s Jc9d Th4c 2d2s 3d7d 6hQh 7sAc"));
  }

  @Test
  public void test_texas_holdem_7268_3h5h7s9sAc_JcAd_6c9c_4h2h_9h8h_QhAs_Tc5d() {
    assertEquals(
      "Tc5d 6c9c 9h8h JcAd QhAs 4h2h",
      Solver.process("texas-holdem 3h5h7s9sAc JcAd 6c9c 4h2h 9h8h QhAs Tc5d"));
  }

  @Test
  public void test_texas_holdem_7269_2h4hJhKdQc_2s2d_Td5h_9hKs_Ac3d() {
    assertEquals(
      "Td5h Ac3d 9hKs 2s2d",
      Solver.process("texas-holdem 2h4hJhKdQc 2s2d Td5h 9hKs Ac3d"));
  }

  @Test
  public void test_texas_holdem_7270_2cAcQdTcTh_5c8s_5hKd_4c4h_KhQh_7d7h_Jd6h_7c6d() {
    assertEquals(
      "7c6d 5c8s Jd6h 5hKd 4c4h 7d7h KhQh",
      Solver.process("texas-holdem 2cAcQdTcTh 5c8s 5hKd 4c4h KhQh 7d7h Jd6h 7c6d"));
  }

  @Test
  public void test_texas_holdem_7271_4s5s9sJcTd_9dQh_7c7d_Ac4c_2sKd_Kh7s_Jh5h() {
    assertEquals(
      "2sKd Kh7s Ac4c 7c7d 9dQh Jh5h",
      Solver.process("texas-holdem 4s5s9sJcTd 9dQh 7c7d Ac4c 2sKd Kh7s Jh5h"));
  }

  @Test
  public void test_texas_holdem_7272_3h7cAdKdTh_Ac2c_Jh5d_5c9d_KcKh_Ts8d() {
    assertEquals(
      "5c9d Jh5d Ts8d Ac2c KcKh",
      Solver.process("texas-holdem 3h7cAdKdTh Ac2c Jh5d 5c9d KcKh Ts8d"));
  }

  @Test
  public void test_texas_holdem_7273_3s4c6sJdQh_Qc9d_Js6d_Jh4s_2h8h_8dQs_4d2c() {
    assertEquals(
      "2h8h 4d2c 8dQs Qc9d Jh4s Js6d",
      Solver.process("texas-holdem 3s4c6sJdQh Qc9d Js6d Jh4s 2h8h 8dQs 4d2c"));
  }

  @Test
  public void test_texas_holdem_7274_4h6s7cAhTh_JhAc_8hAd_Qs8d_3dKh_7d2s_8sTs_As9d() {
    assertEquals(
      "Qs8d 3dKh 7d2s 8sTs 8hAd As9d JhAc",
      Solver.process("texas-holdem 4h6s7cAhTh JhAc 8hAd Qs8d 3dKh 7d2s 8sTs As9d"));
  }

  @Test
  public void test_texas_holdem_7275_3c3h5s7d8s_Jc2d_4d7c_5dQd_Ts8h() {
    assertEquals(
      "Jc2d 5dQd 4d7c Ts8h",
      Solver.process("texas-holdem 3c3h5s7d8s Jc2d 4d7c 5dQd Ts8h"));
  }

  @Test
  public void test_texas_holdem_7276_2c7d8cKsTd_Ac6h_7h2s_5c6c() {
    assertEquals(
      "5c6c Ac6h 7h2s",
      Solver.process("texas-holdem 2c7d8cKsTd Ac6h 7h2s 5c6c"));
  }

  @Test
  public void test_texas_holdem_7277_2s3d4d6h8d_2dTd_Th9s_5h5c_9dAc_2c7s_9c7h_3c8c_JhAh_Tc8s() {
    assertEquals(
      "9c7h Th9s 9dAc JhAh 2c7s Tc8s 3c8c 5h5c 2dTd",
      Solver.process("texas-holdem 2s3d4d6h8d 2dTd Th9s 5h5c 9dAc 2c7s 9c7h 3c8c JhAh Tc8s"));
  }

  @Test
  public void test_texas_holdem_7278_2h2s5hQhTd_AsJd_8s8d_Qc4h_6s3d() {
    assertEquals(
      "6s3d AsJd 8s8d Qc4h",
      Solver.process("texas-holdem 2h2s5hQhTd AsJd 8s8d Qc4h 6s3d"));
  }

  @Test
  public void test_texas_holdem_7279_6c9sJsQcTc_9c2s_9d2d_QhAc_8sAs() {
    assertEquals(
      "9c2s=9d2d QhAc 8sAs",
      Solver.process("texas-holdem 6c9sJsQcTc 9c2s 9d2d QhAc 8sAs"));
  }

  @Test
  public void test_texas_holdem_7280_2h2s8c8dTs_8hJs_7h4c_Ah4s_Qc4d_4hJc_6h9s() {
    assertEquals(
      "6h9s=7h4c 4hJc Qc4d Ah4s 8hJs",
      Solver.process("texas-holdem 2h2s8c8dTs 8hJs 7h4c Ah4s Qc4d 4hJc 6h9s"));
  }

  @Test
  public void test_texas_holdem_7281_2h5s6d8c9c_8sJd_Qh3d_Ts2c_8h4h_3s7d_2dJh_9hTc_Qs9d_Ah4s() {
    assertEquals(
      "Qh3d Ah4s Ts2c 2dJh 8h4h 8sJd 9hTc Qs9d 3s7d",
      Solver.process("texas-holdem 2h5s6d8c9c 8sJd Qh3d Ts2c 8h4h 3s7d 2dJh 9hTc Qs9d Ah4s"));
  }

  @Test
  public void test_texas_holdem_7282_2c2s5d6dTc_7d8d_Qc6s_QhKc() {
    assertEquals(
      "7d8d QhKc Qc6s",
      Solver.process("texas-holdem 2c2s5d6dTc 7d8d Qc6s QhKc"));
  }

  @Test
  public void test_texas_holdem_7283_2d4h6c6hKc_7h5c_KsTh_2sTd_Qh8h_As9d_Js3s_TsAc_Kh3h() {
    assertEquals(
      "7h5c Js3s Qh8h As9d TsAc 2sTd Kh3h KsTh",
      Solver.process("texas-holdem 2d4h6c6hKc 7h5c KsTh 2sTd Qh8h As9d Js3s TsAc Kh3h"));
  }

  @Test
  public void test_texas_holdem_7284_6c7d9dJhKs_5h9c_4d9h_8dJc_2cKd_4cTs() {
    assertEquals(
      "4cTs 4d9h=5h9c 8dJc 2cKd",
      Solver.process("texas-holdem 6c7d9dJhKs 5h9c 4d9h 8dJc 2cKd 4cTs"));
  }

  @Test
  public void test_texas_holdem_7285_2c4hAcAhAs_5c9s_Kh9h_5d2h_3s8d_3dKd_Th6c() {
    assertEquals(
      "3s8d 5c9s Th6c 3dKd Kh9h 5d2h",
      Solver.process("texas-holdem 2c4hAcAhAs 5c9s Kh9h 5d2h 3s8d 3dKd Th6c"));
  }

  @Test
  public void test_texas_holdem_7286_8sAsJcJsKh_Tc8c_4hKd_2hJd_4s5d_7hTh() {
    assertEquals(
      "4s5d 7hTh Tc8c 4hKd 2hJd",
      Solver.process("texas-holdem 8sAsJcJsKh Tc8c 4hKd 2hJd 4s5d 7hTh"));
  }

  @Test
  public void test_texas_holdem_7287_2h7c9hJhJs_7h8c_7s3h_5s9c_KsKh_AhAd_Qc3d() {
    assertEquals(
      "Qc3d 7h8c=7s3h 5s9c KsKh AhAd",
      Solver.process("texas-holdem 2h7c9hJhJs 7h8c 7s3h 5s9c KsKh AhAd Qc3d"));
  }

  @Test
  public void test_texas_holdem_7288_4h5h6dJsKs_9d8s_Td8h_2c3d_3h9s() {
    assertEquals(
      "3h9s 9d8s Td8h 2c3d",
      Solver.process("texas-holdem 4h5h6dJsKs 9d8s Td8h 2c3d 3h9s"));
  }

  @Test
  public void test_texas_holdem_7289_3c3h7dQcTc_2d7h_9c5s_KsQh_4s6h_9s2c_8c7s_4cJh_Kd4d_Jc5d() {
    assertEquals(
      "4s6h 9c5s=9s2c 4cJh=Jc5d Kd4d 2d7h=8c7s KsQh",
      Solver.process("texas-holdem 3c3h7dQcTc 2d7h 9c5s KsQh 4s6h 9s2c 8c7s 4cJh Kd4d Jc5d"));
  }

  @Test
  public void test_texas_holdem_7290_7dAcAdAsJd_Tc6d_7sJc_Ks2s() {
    assertEquals(
      "Tc6d Ks2s 7sJc",
      Solver.process("texas-holdem 7dAcAdAsJd Tc6d 7sJc Ks2s"));
  }

  @Test
  public void test_texas_holdem_7291_2d4c4sJdJs_9s8h_6s3c_7sKd_TsQh_9h7c_Td5s_6c7d() {
    assertEquals(
      "6s3c 6c7d 9h7c=9s8h Td5s TsQh 7sKd",
      Solver.process("texas-holdem 2d4c4sJdJs 9s8h 6s3c 7sKd TsQh 9h7c Td5s 6c7d"));
  }

  @Test
  public void test_texas_holdem_7292_4h7c7dAdKc_3sQh_2dQs_9s7s_Kd4s_AsKh_Td5h_ThTs() {
    assertEquals(
      "Td5h 2dQs=3sQh ThTs Kd4s AsKh 9s7s",
      Solver.process("texas-holdem 4h7c7dAdKc 3sQh 2dQs 9s7s Kd4s AsKh Td5h ThTs"));
  }

  @Test
  public void test_texas_holdem_7293_6s9c9dQcQs_6c7h_Kd2h() {
    assertEquals(
      "6c7h Kd2h",
      Solver.process("texas-holdem 6s9c9dQcQs 6c7h Kd2h"));
  }

  @Test
  public void test_texas_holdem_7294_2h3s4c6h7d_QdKs_JdKc_QsKh_6s7s() {
    assertEquals(
      "JdKc QdKs=QsKh 6s7s",
      Solver.process("texas-holdem 2h3s4c6h7d QdKs JdKc QsKh 6s7s"));
  }

  @Test
  public void test_texas_holdem_7295_3h5cAcKdKh_Ad7c_QcJs_4d2d_5d6d() {
    assertEquals(
      "QcJs 5d6d Ad7c 4d2d",
      Solver.process("texas-holdem 3h5cAcKdKh Ad7c QcJs 4d2d 5d6d"));
  }

  @Test
  public void test_texas_holdem_7296_2s4d6c8hKh_Ac3d_8sJc_KsJs_Th4c_3h8c_Kd7s() {
    assertEquals(
      "Ac3d Th4c 3h8c 8sJc Kd7s KsJs",
      Solver.process("texas-holdem 2s4d6c8hKh Ac3d 8sJc KsJs Th4c 3h8c Kd7s"));
  }

  @Test
  public void test_texas_holdem_7297_4h5s8d9dAc_5c7s_4cTs_6s6c_6dTc_Kc2d_3cKd_Kh3d_7hAs() {
    assertEquals(
      "6dTc 3cKd=Kc2d=Kh3d 4cTs 5c7s 6s6c 7hAs",
      Solver.process("texas-holdem 4h5s8d9dAc 5c7s 4cTs 6s6c 6dTc Kc2d 3cKd Kh3d 7hAs"));
  }

  @Test
  public void test_texas_holdem_7298_2s6c9hAdQs_Ks3c_Ac7c_2cTs() {
    assertEquals(
      "Ks3c 2cTs Ac7c",
      Solver.process("texas-holdem 2s6c9hAdQs Ks3c Ac7c 2cTs"));
  }

  @Test
  public void test_texas_holdem_7299_3h3s5h8cJc_7h6c_QdQs_Ad3c_9s2s() {
    assertEquals(
      "7h6c 9s2s QdQs Ad3c",
      Solver.process("texas-holdem 3h3s5h8cJc 7h6c QdQs Ad3c 9s2s"));
  }

  @Test
  public void test_texas_holdem_7300_2c7h7s9dTs_5s8h_6h9s_4d4s_6cAd_Jc3d_Qd8c_AhAs_3h7c() {
    assertEquals(
      "5s8h Jc3d Qd8c 6cAd 4d4s 6h9s AhAs 3h7c",
      Solver.process("texas-holdem 2c7h7s9dTs 5s8h 6h9s 4d4s 6cAd Jc3d Qd8c AhAs 3h7c"));
  }

  @Test
  public void test_texas_holdem_7301_3h4h7h8hKc_9h7c_AhJd_Tc9s_AsKh() {
    assertEquals(
      "Tc9s 9h7c AsKh AhJd",
      Solver.process("texas-holdem 3h4h7h8hKc 9h7c AhJd Tc9s AsKh"));
  }

  @Test
  public void test_texas_holdem_7302_4c4d7s9hQh_8sQd_8h2d_3hTd() {
    assertEquals(
      "8h2d 3hTd 8sQd",
      Solver.process("texas-holdem 4c4d7s9hQh 8sQd 8h2d 3hTd"));
  }

  @Test
  public void test_texas_holdem_7303_8cKsQdTcTd_ThJs_Ac4c_3d2s() {
    assertEquals(
      "3d2s Ac4c ThJs",
      Solver.process("texas-holdem 8cKsQdTcTd ThJs Ac4c 3d2s"));
  }

  @Test
  public void test_texas_holdem_7304_2s6sAhAsQh_3d6d_Kc9c_Jd4d_JsKd_Qd9s_8d9h_8c4s_Td3s() {
    assertEquals(
      "8c4s 8d9h Td3s Jd4d Kc9c JsKd 3d6d Qd9s",
      Solver.process("texas-holdem 2s6sAhAsQh 3d6d Kc9c Jd4d JsKd Qd9s 8d9h 8c4s Td3s"));
  }

  @Test
  public void test_texas_holdem_7305_2cAcKcQdTs_4hJd_6c5h_8dJh_3cKd_Qs4s_9d9h_8h6h_8s3h_JsTc() {
    assertEquals(
      "6c5h 8h6h=8s3h 9d9h Qs4s 3cKd 4hJd=8dJh=JsTc",
      Solver.process("texas-holdem 2cAcKcQdTs 4hJd 6c5h 8dJh 3cKd Qs4s 9d9h 8h6h 8s3h JsTc"));
  }

  @Test
  public void test_texas_holdem_7306_4h6d6hTdTh_8cKc_Qc2d() {
    assertEquals(
      "Qc2d 8cKc",
      Solver.process("texas-holdem 4h6d6hTdTh 8cKc Qc2d"));
  }

  @Test
  public void test_texas_holdem_7307_2c8hAdThTs_2d5h_7d3c_9hJs_7hJd() {
    assertEquals(
      "7d3c 7hJd 9hJs 2d5h",
      Solver.process("texas-holdem 2c8hAdThTs 2d5h 7d3c 9hJs 7hJd"));
  }

  @Test
  public void test_texas_holdem_7308_2c4h4sJsTd_9cKc_Ac3d_2hJh_As4d_Kh5d_7c6s_9h9d_Qs4c_6c7s() {
    assertEquals(
      "6c7s=7c6s 9cKc=Kh5d Ac3d 9h9d 2hJh Qs4c As4d",
      Solver.process("texas-holdem 2c4h4sJsTd 9cKc Ac3d 2hJh As4d Kh5d 7c6s 9h9d Qs4c 6c7s"));
  }

  @Test
  public void test_texas_holdem_7309_8sAhKcKsTd_Ts2s_9dJd_6s7h_QdQc_4h3c_5c9s_6h4c_As8c() {
    assertEquals(
      "4h3c=6h4c=6s7h 5c9s 9dJd Ts2s QdQc As8c",
      Solver.process("texas-holdem 8sAhKcKsTd Ts2s 9dJd 6s7h QdQc 4h3c 5c9s 6h4c As8c"));
  }

  @Test
  public void test_texas_holdem_7310_3s6sAcJdQh_KdJc_5sTc_6cAd() {
    assertEquals(
      "5sTc KdJc 6cAd",
      Solver.process("texas-holdem 3s6sAcJdQh KdJc 5sTc 6cAd"));
  }

  @Test
  public void test_texas_holdem_7311_6d7d7s8cQc_Ad7h_QhKh_3d6c_Qd4d_Tc5c_Jh6s_Td2s() {
    assertEquals(
      "Tc5c=Td2s 3d6c=Jh6s Qd4d QhKh Ad7h",
      Solver.process("texas-holdem 6d7d7s8cQc Ad7h QhKh 3d6c Qd4d Tc5c Jh6s Td2s"));
  }

  @Test
  public void test_texas_holdem_7312_4s5c5d7sKd_9s7c_6c4c_Kc7d_2s5h_As2h_TsQc() {
    assertEquals(
      "TsQc As2h 6c4c 9s7c Kc7d 2s5h",
      Solver.process("texas-holdem 4s5c5d7sKd 9s7c 6c4c Kc7d 2s5h As2h TsQc"));
  }

  @Test
  public void test_texas_holdem_7313_3d4sJsKcQh_2dTh_3hQc_Jd5c_4h6h_AdTc_8s8c_6d5h() {
    assertEquals(
      "6d5h 2dTh 4h6h 8s8c Jd5c 3hQc AdTc",
      Solver.process("texas-holdem 3d4sJsKcQh 2dTh 3hQc Jd5c 4h6h AdTc 8s8c 6d5h"));
  }

  @Test
  public void test_texas_holdem_7314_3c6h9cJhJs_Th7c_2h8c_4hAc_As2s_6dQc_7dKd() {
    assertEquals(
      "2h8c Th7c 7dKd 4hAc=As2s 6dQc",
      Solver.process("texas-holdem 3c6h9cJhJs Th7c 2h8c 4hAc As2s 6dQc 7dKd"));
  }

  @Test
  public void test_texas_holdem_7315_3s4s5hAcQs_Ad3c_Jd9c() {
    assertEquals(
      "Jd9c Ad3c",
      Solver.process("texas-holdem 3s4s5hAcQs Ad3c Jd9c"));
  }

  @Test
  public void test_texas_holdem_7316_4d9hJsKcQh_6dKd_Jd3d_2d8s_4c3s_6sQc_Qd9d_7cKh() {
    assertEquals(
      "2d8s 4c3s Jd3d 6sQc 6dKd=7cKh Qd9d",
      Solver.process("texas-holdem 4d9hJsKcQh 6dKd Jd3d 2d8s 4c3s 6sQc Qd9d 7cKh"));
  }

  @Test
  public void test_texas_holdem_7317_3d3s4cAdTd_Qc2d_5s9c_Th3h_8h4d_Qh9d_6h7h_KcTc_7d4h() {
    assertEquals(
      "6h7h 5s9c Qc2d=Qh9d 7d4h=8h4d KcTc Th3h",
      Solver.process("texas-holdem 3d3s4cAdTd Qc2d 5s9c Th3h 8h4d Qh9d 6h7h KcTc 7d4h"));
  }

  @Test
  public void test_texas_holdem_7318_5s8s9sAdJh_TcTs_9cKc_6c4d_Kh2h_4h3s_3d3h_Ks3c_7c5h_5c8d() {
    assertEquals(
      "4h3s 6c4d Kh2h=Ks3c 3d3h 7c5h 9cKc TcTs 5c8d",
      Solver.process("texas-holdem 5s8s9sAdJh TcTs 9cKc 6c4d Kh2h 4h3s 3d3h Ks3c 7c5h 5c8d"));
  }

  @Test
  public void test_texas_holdem_7319_2s5h6dKdTd_7d6h_5c9s_Jd2c() {
    assertEquals(
      "Jd2c 5c9s 7d6h",
      Solver.process("texas-holdem 2s5h6dKdTd 7d6h 5c9s Jd2c"));
  }

  @Test
  public void test_texas_holdem_7320_2h5h6s9cQd_7h6h_3d9s_8hAd_Kh9h_5cKc() {
    assertEquals(
      "8hAd 5cKc 7h6h 3d9s Kh9h",
      Solver.process("texas-holdem 2h5h6s9cQd 7h6h 3d9s 8hAd Kh9h 5cKc"));
  }

  @Test
  public void test_texas_holdem_7321_5c5s8h8s9d_2d3c_2c6d() {
    assertEquals(
      "2c6d=2d3c",
      Solver.process("texas-holdem 5c5s8h8s9d 2d3c 2c6d"));
  }

  @Test
  public void test_texas_holdem_7322_7sAdKcQhTs_7d3d_3c5h_8c3h_Ac8h_7c6s_3sKd_2sTd() {
    assertEquals(
      "3c5h 8c3h 7c6s=7d3d 2sTd 3sKd Ac8h",
      Solver.process("texas-holdem 7sAdKcQhTs 7d3d 3c5h 8c3h Ac8h 7c6s 3sKd 2sTd"));
  }

  @Test
  public void test_texas_holdem_7323_6d7hJcJsQs_7c8s_5d3c_2c2s_Ah7d_4sTd_9sTs_7sQd_AsJh() {
    assertEquals(
      "5d3c 4sTd 9sTs 2c2s 7c8s Ah7d 7sQd AsJh",
      Solver.process("texas-holdem 6d7hJcJsQs 7c8s 5d3c 2c2s Ah7d 4sTd 9sTs 7sQd AsJh"));
  }

  @Test
  public void test_texas_holdem_7324_2c7s9c9dQc_Ts2s_Jd9s_5s7c_8hQs() {
    assertEquals(
      "Ts2s 5s7c 8hQs Jd9s",
      Solver.process("texas-holdem 2c7s9c9dQc Ts2s Jd9s 5s7c 8hQs"));
  }

  @Test
  public void test_texas_holdem_7325_7d8sJdQsTc_5sQd_4s2d_8hAd_6h5c_QcKc_6d3d_Jc8d_3h7c_Ks5h() {
    assertEquals(
      "4s2d=6d3d=6h5c Ks5h 3h7c 8hAd 5sQd QcKc Jc8d",
      Solver.process("texas-holdem 7d8sJdQsTc 5sQd 4s2d 8hAd 6h5c QcKc 6d3d Jc8d 3h7c Ks5h"));
  }

  @Test
  public void test_texas_holdem_7326_2d5h6h8sJd_4d2s_5d9s() {
    assertEquals(
      "4d2s 5d9s",
      Solver.process("texas-holdem 2d5h6h8sJd 4d2s 5d9s"));
  }

  @Test
  public void test_texas_holdem_7327_5d7sKsTcTh_4d9h_2dAh() {
    assertEquals(
      "4d9h 2dAh",
      Solver.process("texas-holdem 5d7sKsTcTh 4d9h 2dAh"));
  }

  @Test
  public void test_texas_holdem_7328_3h6d9sJcQc_7h6s_KdQs_JsKc_Kh3d_5d8d_Jh7c_ThAd_2c5s_5h8s() {
    assertEquals(
      "2c5s 5d8d=5h8s ThAd Kh3d 7h6s Jh7c JsKc KdQs",
      Solver.process("texas-holdem 3h6d9sJcQc 7h6s KdQs JsKc Kh3d 5d8d Jh7c ThAd 2c5s 5h8s"));
  }

  @Test
  public void test_texas_holdem_7329_5c5h6cJhTs_Qc6d_3h3s() {
    assertEquals(
      "3h3s Qc6d",
      Solver.process("texas-holdem 5c5h6cJhTs Qc6d 3h3s"));
  }

  @Test
  public void test_texas_holdem_7330_3c6s8h8sKs_8c9c_4h4s_Ac6d_Jd3d_6hJs() {
    assertEquals(
      "Jd3d 4h4s 6hJs Ac6d 8c9c",
      Solver.process("texas-holdem 3c6s8h8sKs 8c9c 4h4s Ac6d Jd3d 6hJs"));
  }

  @Test
  public void test_texas_holdem_7331_4cAdAhKsQd_2c9s_3h2d_6d2h_Ts9d_Qh3c_8c3d_5hJh_7c5d_4hKd() {
    assertEquals(
      "3h2d 6d2h 7c5d 8c3d 2c9s Ts9d 5hJh Qh3c 4hKd",
      Solver.process("texas-holdem 4cAdAhKsQd 2c9s 3h2d 6d2h Ts9d Qh3c 8c3d 5hJh 7c5d 4hKd"));
  }

  @Test
  public void test_texas_holdem_7332_3c5c6s9dTc_2c5d_Jc6d_2d2s_Js8c_TsAs() {
    assertEquals(
      "Js8c 2d2s 2c5d Jc6d TsAs",
      Solver.process("texas-holdem 3c5c6s9dTc 2c5d Jc6d 2d2s Js8c TsAs"));
  }

  @Test
  public void test_texas_holdem_7333_3s7s8cJcKs_2c4h_Ah6s_9d2s_KcJs() {
    assertEquals(
      "2c4h 9d2s Ah6s KcJs",
      Solver.process("texas-holdem 3s7s8cJcKs 2c4h Ah6s 9d2s KcJs"));
  }

  @Test
  public void test_texas_holdem_7334_4s7d8cKsTc_9s9h_9c4d_5h7c_5sJc_3s7s_AhQh() {
    assertEquals(
      "5sJc AhQh 9c4d 3s7s=5h7c 9s9h",
      Solver.process("texas-holdem 4s7d8cKsTc 9s9h 9c4d 5h7c 5sJc 3s7s AhQh"));
  }

  @Test
  public void test_texas_holdem_7335_2c5h6s9cJs_3cAh_6cJc_Kc4s_6hKh_7sTc() {
    assertEquals(
      "7sTc Kc4s 3cAh 6hKh 6cJc",
      Solver.process("texas-holdem 2c5h6s9cJs 3cAh 6cJc Kc4s 6hKh 7sTc"));
  }

  @Test
  public void test_texas_holdem_7336_3h5c6d8dKh_2sKc_3dTc() {
    assertEquals(
      "3dTc 2sKc",
      Solver.process("texas-holdem 3h5c6d8dKh 2sKc 3dTc"));
  }

  @Test
  public void test_texas_holdem_7337_7d8hJdQcQs_5h7c_Jh8s_8dJs() {
    assertEquals(
      "5h7c 8dJs=Jh8s",
      Solver.process("texas-holdem 7d8hJdQcQs 5h7c Jh8s 8dJs"));
  }

  @Test
  public void test_texas_holdem_7338_5h8h9cKcQh_AhJc_Ad7s_6d3h_Jd2s_KhTc_4s4h() {
    assertEquals(
      "6d3h Jd2s Ad7s AhJc 4s4h KhTc",
      Solver.process("texas-holdem 5h8h9cKcQh AhJc Ad7s 6d3h Jd2s KhTc 4s4h"));
  }

  @Test
  public void test_texas_holdem_7339_4s6h9cAdJs_4dJh_5d2c_7c7d() {
    assertEquals(
      "5d2c 7c7d 4dJh",
      Solver.process("texas-holdem 4s6h9cAdJs 4dJh 5d2c 7c7d"));
  }

  @Test
  public void test_texas_holdem_7340_3d7hAsKsQs_Jc3h_AdQc_8h6c_4h4d_Qd2h_Ts9s_4s9h_Jd6h() {
    assertEquals(
      "8h6c 4s9h Jd6h Jc3h 4h4d Qd2h AdQc Ts9s",
      Solver.process("texas-holdem 3d7hAsKsQs Jc3h AdQc 8h6c 4h4d Qd2h Ts9s 4s9h Jd6h"));
  }

  @Test
  public void test_texas_holdem_7341_5s9hAdAsQd_Jc8h_5h3s_Kc9d_Js7h_6h7c_4dJh_4sTd_Qh6c_Jd5c() {
    assertEquals(
      "6h7c 4sTd 4dJh=Jc8h=Js7h 5h3s=Jd5c Kc9d Qh6c",
      Solver.process("texas-holdem 5s9hAdAsQd Jc8h 5h3s Kc9d Js7h 6h7c 4dJh 4sTd Qh6c Jd5c"));
  }

  @Test
  public void test_texas_holdem_7342_6h7dJcKhTh_TdJs_4d5c_5d6c_4h8c_3s5s_7sQs() {
    assertEquals(
      "3s5s=4d5c 4h8c 5d6c 7sQs TdJs",
      Solver.process("texas-holdem 6h7dJcKhTh TdJs 4d5c 5d6c 4h8c 3s5s 7sQs"));
  }

  @Test
  public void test_texas_holdem_7343_3c3s6c6dQh_4h5s_Tc4c_5c6s_AdTs_4d8c_3h8h_4s7h_Jh8s_2dQs() {
    assertEquals(
      "4d8c=4h5s=4s7h=Jh8s=Tc4c AdTs 2dQs 3h8h 5c6s",
      Solver.process("texas-holdem 3c3s6c6dQh 4h5s Tc4c 5c6s AdTs 4d8c 3h8h 4s7h Jh8s 2dQs"));
  }

  @Test
  public void test_texas_holdem_7344_3h8c9sAsTc_2c9c_3s8h_5cKh_5s7s_7c9h_Td6h() {
    assertEquals(
      "5s7s 5cKh 2c9c=7c9h Td6h 3s8h",
      Solver.process("texas-holdem 3h8c9sAsTc 2c9c 3s8h 5cKh 5s7s 7c9h Td6h"));
  }

  @Test
  public void test_texas_holdem_7345_4d6d9hJdJh_2d3s_Th2h_Td6s_Ts5h_QhJc_Kd7h_Js2c_6cAs() {
    assertEquals(
      "2d3s Th2h=Ts5h Kd7h Td6s 6cAs Js2c QhJc",
      Solver.process("texas-holdem 4d6d9hJdJh 2d3s Th2h Td6s Ts5h QhJc Kd7h Js2c 6cAs"));
  }

  @Test
  public void test_texas_holdem_7346_7h9cAdJcQc_TdKc_Qd6h_Js7d_6d8d_KdJd_8s5c_9sJh_3h3d_5d8h() {
    assertEquals(
      "5d8h=6d8d=8s5c 3h3d KdJd Qd6h Js7d 9sJh TdKc",
      Solver.process("texas-holdem 7h9cAdJcQc TdKc Qd6h Js7d 6d8d KdJd 8s5c 9sJh 3h3d 5d8h"));
  }

  @Test
  public void test_texas_holdem_7347_2hAhQdTdTs_8s3c_9s4d_7c7s_Kh7h_9h6h() {
    assertEquals(
      "8s3c 9h6h=9s4d Kh7h 7c7s",
      Solver.process("texas-holdem 2hAhQdTdTs 8s3c 9s4d 7c7s Kh7h 9h6h"));
  }

  @Test
  public void test_texas_holdem_7348_3c4h8dKcTh_6c2c_2hQd_7sKd_Ks6d_3hJc_5h9d_9c9h_7h6h() {
    assertEquals(
      "6c2c 7h6h 5h9d 2hQd 3hJc 9c9h Ks6d 7sKd",
      Solver.process("texas-holdem 3c4h8dKcTh 6c2c 2hQd 7sKd Ks6d 3hJc 5h9d 9c9h 7h6h"));
  }

  @Test
  public void test_texas_holdem_7349_4h6dAcAsTh_5d9h_6hKs() {
    assertEquals(
      "5d9h 6hKs",
      Solver.process("texas-holdem 4h6dAcAsTh 5d9h 6hKs"));
  }

  @Test
  public void test_texas_holdem_7350_3d3s7s8d8h_2c9d_3cJc_7d6s_Jh4c_6d2s() {
    assertEquals(
      "6d2s 2c9d Jh4c 7d6s 3cJc",
      Solver.process("texas-holdem 3d3s7s8d8h 2c9d 3cJc 7d6s Jh4c 6d2s"));
  }

  @Test
  public void test_texas_holdem_7351_6s7h7sJcQh_TcJd_5hTh_AdAs_3s9h() {
    assertEquals(
      "3s9h 5hTh TcJd AdAs",
      Solver.process("texas-holdem 6s7h7sJcQh TcJd 5hTh AdAs 3s9h"));
  }

  @Test
  public void test_texas_holdem_7352_3c4h8h8sJd_7h8c_6d7s_7c2s_TcTs_3d5c_Ac2h() {
    assertEquals(
      "7c2s 6d7s Ac2h 3d5c TcTs 7h8c",
      Solver.process("texas-holdem 3c4h8h8sJd 7h8c 6d7s 7c2s TcTs 3d5c Ac2h"));
  }

  @Test
  public void test_texas_holdem_7353_4h4sAhKcQh_5s6h_Td2d_9sKs_9h2h_Kd8h() {
    assertEquals(
      "5s6h=Td2d 9sKs=Kd8h 9h2h",
      Solver.process("texas-holdem 4h4sAhKcQh 5s6h Td2d 9sKs 9h2h Kd8h"));
  }

  @Test
  public void test_texas_holdem_7354_2s4d5d7c9c_Jh5s_7dJc_Ts3s_Kc8h_Qh5c_2d7h_8d3c_9h5h_QdQc() {
    assertEquals(
      "8d3c Ts3s Kc8h Jh5s Qh5c 7dJc QdQc 2d7h 9h5h",
      Solver.process("texas-holdem 2s4d5d7c9c Jh5s 7dJc Ts3s Kc8h Qh5c 2d7h 8d3c 9h5h QdQc"));
  }

  @Test
  public void test_texas_holdem_7355_3c5d8s9sAh_2s3h_Jh6d_QdJs_9d7d_4c5c() {
    assertEquals(
      "Jh6d QdJs 2s3h 4c5c 9d7d",
      Solver.process("texas-holdem 3c5d8s9sAh 2s3h Jh6d QdJs 9d7d 4c5c"));
  }

  @Test
  public void test_texas_holdem_7356_3s4c8d9cJs_3h9h_Qd5c_3d7c_Td4s() {
    assertEquals(
      "Qd5c 3d7c Td4s 3h9h",
      Solver.process("texas-holdem 3s4c8d9cJs 3h9h Qd5c 3d7c Td4s"));
  }

  @Test
  public void test_texas_holdem_7357_2c7h9hKcQc_3s8s_Kh3d_ThAd() {
    assertEquals(
      "3s8s ThAd Kh3d",
      Solver.process("texas-holdem 2c7h9hKcQc 3s8s Kh3d ThAd"));
  }

  @Test
  public void test_texas_holdem_7358_2d4c5d7d8c_6dAh_4d7h_8dTs_5hTc_9h8h_6c2s_9cJd_As9d_2h7c() {
    assertEquals(
      "9cJd As9d 5hTc 9h8h 8dTs 2h7c 4d7h 6c2s=6dAh",
      Solver.process("texas-holdem 2d4c5d7d8c 6dAh 4d7h 8dTs 5hTc 9h8h 6c2s 9cJd As9d 2h7c"));
  }

  @Test
  public void test_texas_holdem_7359_5c7d9cQdQh_5hAs_3d3c() {
    assertEquals(
      "3d3c 5hAs",
      Solver.process("texas-holdem 5c7d9cQdQh 5hAs 3d3c"));
  }

  @Test
  public void test_texas_holdem_7360_4d4h8hJcKc_2c9d_KsTs_Td2h_TcTh_7h3h_QcJd_AhQs_4c3c_9s6d() {
    assertEquals(
      "7h3h 2c9d=9s6d Td2h AhQs TcTh QcJd KsTs 4c3c",
      Solver.process("texas-holdem 4d4h8hJcKc 2c9d KsTs Td2h TcTh 7h3h QcJd AhQs 4c3c 9s6d"));
  }

  @Test
  public void test_texas_holdem_7361_3d5h8dQdQh_Kd2h_TdKc_8sJh_6hTs_5d4c_7c3s_2c9s_6dAs_7d6s() {
    assertEquals(
      "7d6s 2c9s 6hTs Kd2h TdKc 6dAs 7c3s 5d4c 8sJh",
      Solver.process("texas-holdem 3d5h8dQdQh Kd2h TdKc 8sJh 6hTs 5d4c 7c3s 2c9s 6dAs 7d6s"));
  }

  @Test
  public void test_texas_holdem_7362_2c4d4h8c9d_2h9c_JhAs_6s7d() {
    assertEquals(
      "6s7d JhAs 2h9c",
      Solver.process("texas-holdem 2c4d4h8c9d 2h9c JhAs 6s7d"));
  }

  @Test
  public void test_texas_holdem_7363_2s5h8sKdTh_Ac4c_6cAd_6h4d_As2d_3s7d_5sTd_9d9h_7cAh() {
    assertEquals(
      "6h4d 3s7d Ac4c 6cAd 7cAh As2d 9d9h 5sTd",
      Solver.process("texas-holdem 2s5h8sKdTh Ac4c 6cAd 6h4d As2d 3s7d 5sTd 9d9h 7cAh"));
  }

  @Test
  public void test_texas_holdem_7364_4d4s5s7c8s_8c4h_Ac3s_7sKh_AsJh_9c9s_Qs3d_Jc9h_AdQc_5d6c() {
    assertEquals(
      "Jc9h Qs3d Ac3s AsJh AdQc 7sKh 9c9s 5d6c 8c4h",
      Solver.process("texas-holdem 4d4s5s7c8s 8c4h Ac3s 7sKh AsJh 9c9s Qs3d Jc9h AdQc 5d6c"));
  }

  @Test
  public void test_texas_holdem_7365_3d4c9dJcTd_QcJh_7c6d_2c9c_9h5c_8d7h_2hAd_3sJs() {
    assertEquals(
      "7c6d 2hAd 2c9c 9h5c QcJh 3sJs 8d7h",
      Solver.process("texas-holdem 3d4c9dJcTd QcJh 7c6d 2c9c 9h5c 8d7h 2hAd 3sJs"));
  }

  @Test
  public void test_texas_holdem_7366_2c4h8sAdQc_As8d_QhJs_4c3h_9h5s_3c6h_TsAh_Td7c_Jc3s_5c7s() {
    assertEquals(
      "3c6h 5c7s 9h5s Td7c Jc3s 4c3h QhJs TsAh As8d",
      Solver.process("texas-holdem 2c4h8sAdQc As8d QhJs 4c3h 9h5s 3c6h TsAh Td7c Jc3s 5c7s"));
  }

  @Test
  public void test_texas_holdem_7367_2h4h5s7h8h_Ks5c_4d8d_9sJh_Tc4c_3h6d_2dQh() {
    assertEquals(
      "Tc4c Ks5c 4d8d 3h6d 9sJh 2dQh",
      Solver.process("texas-holdem 2h4h5s7h8h Ks5c 4d8d 9sJh Tc4c 3h6d 2dQh"));
  }

  @Test
  public void test_texas_holdem_7368_4d5c5s7cJc_7dKc_4c4s_2dJs_Ts8d_6h3s_3hJd() {
    assertEquals(
      "Ts8d 7dKc 2dJs=3hJd 6h3s 4c4s",
      Solver.process("texas-holdem 4d5c5s7cJc 7dKc 4c4s 2dJs Ts8d 6h3s 3hJd"));
  }

  @Test
  public void test_texas_holdem_7369_6d9d9sAhKs_AdQh_2sQs() {
    assertEquals(
      "2sQs AdQh",
      Solver.process("texas-holdem 6d9d9sAhKs AdQh 2sQs"));
  }

  @Test
  public void test_texas_holdem_7370_2s4cJdJsKd_3h7d_Kc2c_3dTc_8cTd() {
    assertEquals(
      "3h7d 3dTc 8cTd Kc2c",
      Solver.process("texas-holdem 2s4cJdJsKd 3h7d Kc2c 3dTc 8cTd"));
  }

  @Test
  public void test_texas_holdem_7371_3h4h4s8hAd_Kc3c_7d6h_5cQc_6sKh_2h9s_7sAc_TcQd() {
    assertEquals(
      "7d6h 2h9s 5cQc TcQd 6sKh Kc3c 7sAc",
      Solver.process("texas-holdem 3h4h4s8hAd Kc3c 7d6h 5cQc 6sKh 2h9s 7sAc TcQd"));
  }

  @Test
  public void test_texas_holdem_7372_5d5h8dKsQh_4h6h_Ad3c_9s7c() {
    assertEquals(
      "4h6h 9s7c Ad3c",
      Solver.process("texas-holdem 5d5h8dKsQh 4h6h Ad3c 9s7c"));
  }

  @Test
  public void test_texas_holdem_7373_3s5h6dAhQs_8c7c_5dTd_6sTs_JhQd_2hAc_Tc4s_Qc4c_6c9s_3c7h() {
    assertEquals(
      "8c7c Tc4s 3c7h 5dTd 6c9s 6sTs Qc4c JhQd 2hAc",
      Solver.process("texas-holdem 3s5h6dAhQs 8c7c 5dTd 6sTs JhQd 2hAc Tc4s Qc4c 6c9s 3c7h"));
  }

  @Test
  public void test_texas_holdem_7374_2h2s3s5cKh_Qd3h_4hJc_7sJd() {
    assertEquals(
      "4hJc 7sJd Qd3h",
      Solver.process("texas-holdem 2h2s3s5cKh Qd3h 4hJc 7sJd"));
  }

  @Test
  public void test_texas_holdem_7375_3c5d5s6hQh_2cJs_4cKc_9c8c() {
    assertEquals(
      "9c8c 2cJs 4cKc",
      Solver.process("texas-holdem 3c5d5s6hQh 2cJs 4cKc 9c8c"));
  }

  @Test
  public void test_texas_holdem_7376_6s8d9hAdJh_5s9d_KcJd_Ts3s_3hAh_QsAc_Js2h() {
    assertEquals(
      "Ts3s 5s9d Js2h KcJd 3hAh QsAc",
      Solver.process("texas-holdem 6s8d9hAdJh 5s9d KcJd Ts3s 3hAh QsAc Js2h"));
  }

  @Test
  public void test_texas_holdem_7377_6dAcJsKsTs_7dQh_2sQc() {
    assertEquals(
      "2sQc=7dQh",
      Solver.process("texas-holdem 6dAcJsKsTs 7dQh 2sQc"));
  }

  @Test
  public void test_texas_holdem_7378_3s4h6hAcTh_2d2h_4d7s_6cAh_7h5d() {
    assertEquals(
      "2d2h 4d7s 6cAh 7h5d",
      Solver.process("texas-holdem 3s4h6hAcTh 2d2h 4d7s 6cAh 7h5d"));
  }

  @Test
  public void test_texas_holdem_7379_2h3c9d9hKd_9c8d_JdQs_7h4h_7s4s() {
    assertEquals(
      "7h4h=7s4s JdQs 9c8d",
      Solver.process("texas-holdem 2h3c9d9hKd 9c8d JdQs 7h4h 7s4s"));
  }

  @Test
  public void test_texas_holdem_7380_2d5c6s7c9d_TcAh_Td7d_Jh3c_Js9s_4hAd() {
    assertEquals(
      "Jh3c 4hAd TcAh Td7d Js9s",
      Solver.process("texas-holdem 2d5c6s7c9d TcAh Td7d Jh3c Js9s 4hAd"));
  }

  @Test
  public void test_texas_holdem_7381_2h5h8d8s9h_4c4d_QcJd_2c9c() {
    assertEquals(
      "QcJd 4c4d 2c9c",
      Solver.process("texas-holdem 2h5h8d8s9h 4c4d QcJd 2c9c"));
  }

  @Test
  public void test_texas_holdem_7382_8d9hKdQcQh_Kc6d_9d2c_6c5c() {
    assertEquals(
      "6c5c 9d2c Kc6d",
      Solver.process("texas-holdem 8d9hKdQcQh Kc6d 9d2c 6c5c"));
  }

  @Test
  public void test_texas_holdem_7383_2d7d9sJdKs_JcQc_Kc2s() {
    assertEquals(
      "JcQc Kc2s",
      Solver.process("texas-holdem 2d7d9sJdKs JcQc Kc2s"));
  }

  @Test
  public void test_texas_holdem_7384_2d8hAsJcKh_2h9s_QsJh_2sAh_5hQc_9d5d_7dKs_3d3s_Td8s() {
    assertEquals(
      "9d5d 5hQc 2h9s 3d3s Td8s QsJh 7dKs 2sAh",
      Solver.process("texas-holdem 2d8hAsJcKh 2h9s QsJh 2sAh 5hQc 9d5d 7dKs 3d3s Td8s"));
  }

  @Test
  public void test_texas_holdem_7385_2s5h7c8sAc_3h4d_8hAd_6c2d_5dJs_5s9h_KdAh_Jd6h_6sKs() {
    assertEquals(
      "Jd6h 6sKs 6c2d 5s9h 5dJs KdAh 8hAd 3h4d",
      Solver.process("texas-holdem 2s5h7c8sAc 3h4d 8hAd 6c2d 5dJs 5s9h KdAh Jd6h 6sKs"));
  }

  @Test
  public void test_texas_holdem_7386_3h5d8c8dQc_5hQd_9hTc_KhAc_Qs7d_TsKd_Qh2s_7hKc_6sTh() {
    assertEquals(
      "6sTh 9hTc 7hKc TsKd KhAc 5hQd=Qh2s Qs7d",
      Solver.process("texas-holdem 3h5d8c8dQc 5hQd 9hTc KhAc Qs7d TsKd Qh2s 7hKc 6sTh"));
  }

  @Test
  public void test_texas_holdem_7387_2s4cJcJdQc_Ts8d_AhKc_9h9d_4h3s_7c7s_6hJs_2d5s_Jh7d() {
    assertEquals(
      "Ts8d AhKc 2d5s 4h3s 7c7s 9h9d 6hJs Jh7d",
      Solver.process("texas-holdem 2s4cJcJdQc Ts8d AhKc 9h9d 4h3s 7c7s 6hJs 2d5s Jh7d"));
  }

  @Test
  public void test_texas_holdem_7388_6d7cAsKdTh_Td2c_5dTc_Ac8d_4d6s_6h3d() {
    assertEquals(
      "4d6s=6h3d 5dTc=Td2c Ac8d",
      Solver.process("texas-holdem 6d7cAsKdTh Td2c 5dTc Ac8d 4d6s 6h3d"));
  }

  @Test
  public void test_texas_holdem_7389_5s8c9cQdTc_2d7d_AdJc_AhAs_KsJh_Js5c() {
    assertEquals(
      "2d7d AhAs AdJc=Js5c KsJh",
      Solver.process("texas-holdem 5s8c9cQdTc 2d7d AdJc AhAs KsJh Js5c"));
  }

  @Test
  public void test_texas_holdem_7390_2c3s5s9cAh_KhAs_Qc9d_4h8d_AcJd() {
    assertEquals(
      "Qc9d AcJd KhAs 4h8d",
      Solver.process("texas-holdem 2c3s5s9cAh KhAs Qc9d 4h8d AcJd"));
  }

  @Test
  public void test_texas_holdem_7391_2s4h6hJsTc_TsTh_Qh8h_4c6c_3c8s_KsJc() {
    assertEquals(
      "3c8s Qh8h KsJc 4c6c TsTh",
      Solver.process("texas-holdem 2s4h6hJsTc TsTh Qh8h 4c6c 3c8s KsJc"));
  }

  @Test
  public void test_texas_holdem_7392_2h3h3s6h9d_7h6s_Th8c_Ks6d_AhTs_9c7d_KhKc_Js9h_AcKd() {
    assertEquals(
      "Th8c AhTs AcKd 7h6s Ks6d 9c7d Js9h KhKc",
      Solver.process("texas-holdem 2h3h3s6h9d 7h6s Th8c Ks6d AhTs 9c7d KhKc Js9h AcKd"));
  }

  @Test
  public void test_texas_holdem_7393_2c4s9sQcTc_8h5h_6sAd_AhTh_Kc3c() {
    assertEquals(
      "8h5h 6sAd AhTh Kc3c",
      Solver.process("texas-holdem 2c4s9sQcTc 8h5h 6sAd AhTh Kc3c"));
  }

  @Test
  public void test_texas_holdem_7394_2d2h3c4hKs_Qh4s_2cQc_Qs5c_As5s() {
    assertEquals(
      "Qs5c Qh4s 2cQc As5s",
      Solver.process("texas-holdem 2d2h3c4hKs Qh4s 2cQc Qs5c As5s"));
  }

  @Test
  public void test_texas_holdem_7395_2h4d8sAhQd_4h5c_Jd2c_TsKh_4c3d_9d5s_8h9s_5dQc_QsAd() {
    assertEquals(
      "9d5s TsKh Jd2c 4c3d=4h5c 8h9s 5dQc QsAd",
      Solver.process("texas-holdem 2h4d8sAhQd 4h5c Jd2c TsKh 4c3d 9d5s 8h9s 5dQc QsAd"));
  }

  @Test
  public void test_texas_holdem_7396_4h5hAdJdKd_JcAh_4c3d() {
    assertEquals(
      "4c3d JcAh",
      Solver.process("texas-holdem 4h5hAdJdKd JcAh 4c3d"));
  }

  @Test
  public void test_texas_holdem_7397_6c6hJdKsQc_7d2d_3dAc_Qd4d_4s9d_7hKc_2c9h_TsAh_8dTc() {
    assertEquals(
      "2c9h=4s9d=7d2d=8dTc 3dAc Qd4d 7hKc TsAh",
      Solver.process("texas-holdem 6c6hJdKsQc 7d2d 3dAc Qd4d 4s9d 7hKc 2c9h TsAh 8dTc"));
  }

  @Test
  public void test_texas_holdem_7398_3s4d5h5s6h_7s3h_5d2d_2hTd_5cJd_8d7d_Qh4h_JcTc_6dAs_6s3c() {
    assertEquals(
      "JcTc Qh4h 6s3c 6dAs 5cJd 2hTd=5d2d 7s3h 8d7d",
      Solver.process("texas-holdem 3s4d5h5s6h 7s3h 5d2d 2hTd 5cJd 8d7d Qh4h JcTc 6dAs 6s3c"));
  }

  @Test
  public void test_texas_holdem_7399_3h4d5s6d9c_5c2c_AdQs_Ts7h_4hTh_KhKc_6sQh_Ks7c() {
    assertEquals(
      "AdQs 4hTh 6sQh KhKc 5c2c Ks7c=Ts7h",
      Solver.process("texas-holdem 3h4d5s6d9c 5c2c AdQs Ts7h 4hTh KhKc 6sQh Ks7c"));
  }

  @Test
  public void test_texas_holdem_7400_4c4s8cAhJd_5d9c_8hKc_As8s_6d5c_QcJc_7h2h() {
    assertEquals(
      "6d5c=7h2h 5d9c 8hKc QcJc As8s",
      Solver.process("texas-holdem 4c4s8cAhJd 5d9c 8hKc As8s 6d5c QcJc 7h2h"));
  }

  @Test
  public void test_texas_holdem_7401_3h6d8sKsQc_AhTs_7d2c_6sQh_8d4s_7c4c_As3s_Jd5h_TcQs_5s9h() {
    assertEquals(
      "7c4c=7d2c 5s9h Jd5h AhTs As3s 8d4s TcQs 6sQh",
      Solver.process("texas-holdem 3h6d8sKsQc AhTs 7d2c 6sQh 8d4s 7c4c As3s Jd5h TcQs 5s9h"));
  }

  @Test
  public void test_texas_holdem_7402_5h9dJhKdQc_9h4s_TsKc_8c6s() {
    assertEquals(
      "8c6s 9h4s TsKc",
      Solver.process("texas-holdem 5h9dJhKdQc 9h4s TsKc 8c6s"));
  }

  @Test
  public void test_texas_holdem_7403_2c2s7d9d9s_8sQs_ThAd() {
    assertEquals(
      "8sQs ThAd",
      Solver.process("texas-holdem 2c2s7d9d9s 8sQs ThAd"));
  }

  @Test
  public void test_texas_holdem_7404_4c4d7dJhQc_Qs9d_6dAc_2s3c_Ah9c_4h6c_Kh2h_KsTd() {
    assertEquals(
      "2s3c Kh2h=KsTd 6dAc=Ah9c Qs9d 4h6c",
      Solver.process("texas-holdem 4c4d7dJhQc Qs9d 6dAc 2s3c Ah9c 4h6c Kh2h KsTd"));
  }

  @Test
  public void test_texas_holdem_7405_3d5h6dAcTh_Ks7h_4h8h() {
    assertEquals(
      "4h8h Ks7h",
      Solver.process("texas-holdem 3d5h6dAcTh Ks7h 4h8h"));
  }

  @Test
  public void test_texas_holdem_7406_3d6c8cAdJs_6s5h_7c8d_4d7h_9s6d_ThQd() {
    assertEquals(
      "4d7h ThQd 6s5h 9s6d 7c8d",
      Solver.process("texas-holdem 3d6c8cAdJs 6s5h 7c8d 4d7h 9s6d ThQd"));
  }

  @Test
  public void test_texas_holdem_7407_2s4s8cAcJs_QdAd_9h9c() {
    assertEquals(
      "9h9c QdAd",
      Solver.process("texas-holdem 2s4s8cAcJs QdAd 9h9c"));
  }

  @Test
  public void test_texas_holdem_7408_3dAdAsQhTs_8s4d_JsKh_Kd5d_7h3c_3s4c_4sTc_5s9d_2h3h() {
    assertEquals(
      "8s4d 5s9d Kd5d 2h3h=3s4c=7h3c 4sTc JsKh",
      Solver.process("texas-holdem 3dAdAsQhTs 8s4d JsKh Kd5d 7h3c 3s4c 4sTc 5s9d 2h3h"));
  }

  @Test
  public void test_texas_holdem_7409_2s5c7s8sKs_QhAc_JdQc_Kh3s_Qs4d_As9d_7d8c_3h9c_Jh2h_3d5h() {
    assertEquals(
      "3h9c JdQc QhAc Jh2h 3d5h 7d8c Kh3s Qs4d As9d",
      Solver.process("texas-holdem 2s5c7s8sKs QhAc JdQc Kh3s Qs4d As9d 7d8c 3h9c Jh2h 3d5h"));
  }

  @Test
  public void test_texas_holdem_7410_7c8h9dJsKh_2hQd_As4c_Ts7d_KdAc_9h3d_3c4s_4h3s_5hKs() {
    assertEquals(
      "3c4s=4h3s 2hQd As4c 9h3d 5hKs KdAc Ts7d",
      Solver.process("texas-holdem 7c8h9dJsKh 2hQd As4c Ts7d KdAc 9h3d 3c4s 4h3s 5hKs"));
  }

  @Test
  public void test_texas_holdem_7411_2d7dKhTcTd_5h3c_8cAs() {
    assertEquals(
      "5h3c 8cAs",
      Solver.process("texas-holdem 2d7dKhTcTd 5h3c 8cAs"));
  }

  @Test
  public void test_texas_holdem_7412_3h8dAsJhQh_Ts8h_4cTh_7sJs_2dQs_Tc8s_Kh2s() {
    assertEquals(
      "4cTh Kh2s Tc8s=Ts8h 7sJs 2dQs",
      Solver.process("texas-holdem 3h8dAsJhQh Ts8h 4cTh 7sJs 2dQs Tc8s Kh2s"));
  }

  @Test
  public void test_texas_holdem_7413_2c8c8d8hAd_9s9c_ThAc_Kc5c_Qh4d_9h3h_3c5s_8sTc_2d7d_5h9d() {
    assertEquals(
      "3c5s 5h9d=9h3h Qh4d Kc5c 2d7d 9s9c ThAc 8sTc",
      Solver.process("texas-holdem 2c8c8d8hAd 9s9c ThAc Kc5c Qh4d 9h3h 3c5s 8sTc 2d7d 5h9d"));
  }

  @Test
  public void test_texas_holdem_7414_5c5h7s8sJh_9hTc_Jd9c_KcKd_Ad4d_2cTh() {
    assertEquals(
      "2cTh Ad4d Jd9c KcKd 9hTc",
      Solver.process("texas-holdem 5c5h7s8sJh 9hTc Jd9c KcKd Ad4d 2cTh"));
  }

  @Test
  public void test_texas_holdem_7415_2s3c5d9dAc_8d9c_Ah9s_6dTc_Kd4h_Ts7s_7cTd_JdKh_JhQd_3s2d() {
    assertEquals(
      "6dTc 7cTd=Ts7s JhQd JdKh 8d9c 3s2d Ah9s Kd4h",
      Solver.process("texas-holdem 2s3c5d9dAc 8d9c Ah9s 6dTc Kd4h Ts7s 7cTd JdKh JhQd 3s2d"));
  }

  @Test
  public void test_texas_holdem_7416_2s5s6s8dJh_4hTh_AdTs_Kh9h_5hQs_KcTd_7sTc() {
    assertEquals(
      "4hTh 7sTc Kh9h KcTd AdTs 5hQs",
      Solver.process("texas-holdem 2s5s6s8dJh 4hTh AdTs Kh9h 5hQs KcTd 7sTc"));
  }

  @Test
  public void test_texas_holdem_7417_3h4h7sJhQh_4sJc_AdQs_6hKs_5dTc_4dTh_3d8s_Qd9s_3c2h_Ac2c() {
    assertEquals(
      "5dTc Ac2c 3d8s Qd9s AdQs 4sJc 3c2h 6hKs 4dTh",
      Solver.process("texas-holdem 3h4h7sJhQh 4sJc AdQs 6hKs 5dTc 4dTh 3d8s Qd9s 3c2h Ac2c"));
  }

  @Test
  public void test_texas_holdem_7418_7c7s8h9cJh_As5c_3d7d_2s8c() {
    assertEquals(
      "As5c 2s8c 3d7d",
      Solver.process("texas-holdem 7c7s8h9cJh As5c 3d7d 2s8c"));
  }

  @Test
  public void test_texas_holdem_7419_6h8c8s9dTs_Td2d_AsAh() {
    assertEquals(
      "Td2d AsAh",
      Solver.process("texas-holdem 6h8c8s9dTs Td2d AsAh"));
  }

  @Test
  public void test_texas_holdem_7420_4d6hKdQsTh_6d8d_4hTd_JsTs_KsJd_Ac4c() {
    assertEquals(
      "Ac4c 6d8d JsTs KsJd 4hTd",
      Solver.process("texas-holdem 4d6hKdQsTh 6d8d 4hTd JsTs KsJd Ac4c"));
  }

  @Test
  public void test_texas_holdem_7421_3d4s6sKcQh_3h9d_4c4d_8hAh_9cQd_7h9h() {
    assertEquals(
      "7h9h 8hAh 3h9d 9cQd 4c4d",
      Solver.process("texas-holdem 3d4s6sKcQh 3h9d 4c4d 8hAh 9cQd 7h9h"));
  }

  @Test
  public void test_texas_holdem_7422_3h4c5c5s7h_TdQc_Qd9s_6d8c_2sQs_9h3c_5d3s_KdAs_7cJd() {
    assertEquals(
      "2sQs Qd9s TdQc KdAs 9h3c 7cJd 6d8c 5d3s",
      Solver.process("texas-holdem 3h4c5c5s7h TdQc Qd9s 6d8c 2sQs 9h3c 5d3s KdAs 7cJd"));
  }

  @Test
  public void test_texas_holdem_7423_2d2s8dAdTc_5s4h_Ks6s_Kd3d_As5c_7d5h_7s4c_5d2c() {
    assertEquals(
      "5s4h=7d5h=7s4c Ks6s As5c 5d2c Kd3d",
      Solver.process("texas-holdem 2d2s8dAdTc 5s4h Ks6s Kd3d As5c 7d5h 7s4c 5d2c"));
  }

  @Test
  public void test_texas_holdem_7424_2s3d4hAcAh_Ts3s_5dQh() {
    assertEquals(
      "Ts3s 5dQh",
      Solver.process("texas-holdem 2s3d4hAcAh Ts3s 5dQh"));
  }

  @Test
  public void test_texas_holdem_7425_7dJcKdQdTh_7c4d_4cTd_6s8c_4s8s_5d6d_9d2s_3h5h() {
    assertEquals(
      "3h5h 4s8s=6s8c 7c4d 4cTd 9d2s 5d6d",
      Solver.process("texas-holdem 7dJcKdQdTh 7c4d 4cTd 6s8c 4s8s 5d6d 9d2s 3h5h"));
  }

  @Test
  public void test_texas_holdem_7426_3c4d4h7sTc_5sTh_Js7c_Qc8h_Td9c_5c8d_2h8c_Ac6c_Ad8s() {
    assertEquals(
      "2h8c=5c8d Qc8h Ac6c Ad8s Js7c 5sTh Td9c",
      Solver.process("texas-holdem 3c4d4h7sTc 5sTh Js7c Qc8h Td9c 5c8d 2h8c Ac6c Ad8s"));
  }

  @Test
  public void test_texas_holdem_7427_3s4d7d9cTs_4c8d_8s7h_Ac9s_6sTc_Qd8h_5c5d_7sJh_6d2s_AsKs() {
    assertEquals(
      "6d2s Qd8h AsKs 4c8d 5c5d 8s7h 7sJh Ac9s 6sTc",
      Solver.process("texas-holdem 3s4d7d9cTs 4c8d 8s7h Ac9s 6sTc Qd8h 5c5d 7sJh 6d2s AsKs"));
  }

  @Test
  public void test_texas_holdem_7428_3h4h8hQsTd_9dTs_JdAd_9s3c_7c5c_3sKc_2hAh_Kd5d_2d9c_5s7h() {
    assertEquals(
      "5s7h=7c5c 2d9c Kd5d JdAd 9s3c 3sKc 9dTs 2hAh",
      Solver.process("texas-holdem 3h4h8hQsTd 9dTs JdAd 9s3c 7c5c 3sKc 2hAh Kd5d 2d9c 5s7h"));
  }

  @Test
  public void test_texas_holdem_7429_JcJhKcQdQh_8d8s_Kh5s_AhJd_Th7s_9h2c_4s4c_Qc6d_2dKd() {
    assertEquals(
      "4s4c=8d8s=9h2c=Th7s 2dKd=Kh5s AhJd Qc6d",
      Solver.process("texas-holdem JcJhKcQdQh 8d8s Kh5s AhJd Th7s 9h2c 4s4c Qc6d 2dKd"));
  }

  @Test
  public void test_texas_holdem_7430_3d5c7sAcJd_4d2d_Qh2s_6c9c() {
    assertEquals(
      "6c9c Qh2s 4d2d",
      Solver.process("texas-holdem 3d5c7sAcJd 4d2d Qh2s 6c9c"));
  }

  @Test
  public void test_texas_holdem_7431_2c8h9cQsTh_6dTc_2sTs_Qd7c_5s9s_6s4c_7sKs() {
    assertEquals(
      "6s4c 7sKs 5s9s 6dTc Qd7c 2sTs",
      Solver.process("texas-holdem 2c8h9cQsTh 6dTc 2sTs Qd7c 5s9s 6s4c 7sKs"));
  }

  @Test
  public void test_texas_holdem_7432_4d5c6d7d9h_9d9s_7sAh_KsTh_AdKh() {
    assertEquals(
      "KsTh AdKh 7sAh 9d9s",
      Solver.process("texas-holdem 4d5c6d7d9h 9d9s 7sAh KsTh AdKh"));
  }

  @Test
  public void test_texas_holdem_7433_3s8d9d9hAc_3d2h_Jd6c() {
    assertEquals(
      "Jd6c 3d2h",
      Solver.process("texas-holdem 3s8d9d9hAc 3d2h Jd6c"));
  }

  @Test
  public void test_texas_holdem_7434_3s5c5h9hAh_7sJc_9sJd_2cJs() {
    assertEquals(
      "2cJs=7sJc 9sJd",
      Solver.process("texas-holdem 3s5c5h9hAh 7sJc 9sJd 2cJs"));
  }

  @Test
  public void test_texas_holdem_7435_AcAhAsJhQc_JcTc_6hJs_8s2c_5h4d_9c9d_6d4h_5cQd_KsKd_5d9h() {
    assertEquals(
      "5d9h=5h4d=6d4h=8s2c 9c9d 6hJs=JcTc 5cQd KsKd",
      Solver.process("texas-holdem AcAhAsJhQc JcTc 6hJs 8s2c 5h4d 9c9d 6d4h 5cQd KsKd 5d9h"));
  }

  @Test
  public void test_texas_holdem_7436_6s9sKcQdTs_As6c_7d8s_9d7s_2c8d_Qc5h() {
    assertEquals(
      "2c8d As6c 9d7s Qc5h 7d8s",
      Solver.process("texas-holdem 6s9sKcQdTs As6c 7d8s 9d7s 2c8d Qc5h"));
  }

  @Test
  public void test_texas_holdem_7437_2s9sJhQdTc_TdJc_7cQc_5h8s_9d8h_7s6c_Ks8d_9h6d_3d4d_5dTh() {
    assertEquals(
      "3d4d 7s6c 9h6d 5dTh 7cQc TdJc 5h8s=9d8h Ks8d",
      Solver.process("texas-holdem 2s9sJhQdTc TdJc 7cQc 5h8s 9d8h 7s6c Ks8d 9h6d 3d4d 5dTh"));
  }

  @Test
  public void test_texas_holdem_7438_2c2h2s8hQs_ThTc_Kc9d_7s7h() {
    assertEquals(
      "Kc9d 7s7h ThTc",
      Solver.process("texas-holdem 2c2h2s8hQs ThTc Kc9d 7s7h"));
  }

  @Test
  public void test_texas_holdem_7439_6cAcJdQhTc_Qd6d_3h5d_Ah6h_7c2d_3cJs_Qs4h_8d4d_2h8h_2cKs() {
    assertEquals(
      "3h5d 7c2d 2h8h=8d4d 3cJs Qs4h Qd6d Ah6h 2cKs",
      Solver.process("texas-holdem 6cAcJdQhTc Qd6d 3h5d Ah6h 7c2d 3cJs Qs4h 8d4d 2h8h 2cKs"));
  }

  @Test
  public void test_texas_holdem_7440_3h3s5dAdQh_3d9h_2cJh_Ac7d_Qd2s_Kc7s_4h5h() {
    assertEquals(
      "2cJh Kc7s 4h5h Qd2s Ac7d 3d9h",
      Solver.process("texas-holdem 3h3s5dAdQh 3d9h 2cJh Ac7d Qd2s Kc7s 4h5h"));
  }

  @Test
  public void test_texas_holdem_7441_4c5d8d8sKh_2h3c_Qs8h_3h6s_Ts4h_9cAs_9h7c_TcJs_7hJc_3d5s() {
    assertEquals(
      "2h3c 3h6s 9h7c 7hJc TcJs 9cAs Ts4h 3d5s Qs8h",
      Solver.process("texas-holdem 4c5d8d8sKh 2h3c Qs8h 3h6s Ts4h 9cAs 9h7c TcJs 7hJc 3d5s"));
  }

  @Test
  public void test_texas_holdem_7442_3h7h9c9hTd_KcQh_TcAs_Js5d_5hQc_3dKh_AcJd_Ad6c_8s6s() {
    assertEquals(
      "Js5d 5hQc KcQh Ad6c AcJd 3dKh TcAs 8s6s",
      Solver.process("texas-holdem 3h7h9c9hTd KcQh TcAs Js5d 5hQc 3dKh AcJd Ad6c 8s6s"));
  }

  @Test
  public void test_texas_holdem_7443_3h3sJcKhTh_Jh5c_4h2c_Qh8s_Tc8d_JsTs() {
    assertEquals(
      "4h2c Qh8s Tc8d Jh5c JsTs",
      Solver.process("texas-holdem 3h3sJcKhTh Jh5c 4h2c Qh8s Tc8d JsTs"));
  }

  @Test
  public void test_texas_holdem_7444_6s7c8cKdTh_JhKs_5d3c_3d7d_Ts9s_Jc4h_Ad4d() {
    assertEquals(
      "5d3c Jc4h Ad4d 3d7d JhKs Ts9s",
      Solver.process("texas-holdem 6s7c8cKdTh JhKs 5d3c 3d7d Ts9s Jc4h Ad4d"));
  }

  @Test
  public void test_texas_holdem_7445_3c3d9cAhTs_6h7d_As8h_8sTd_Jd7h() {
    assertEquals(
      "6h7d Jd7h 8sTd As8h",
      Solver.process("texas-holdem 3c3d9cAhTs 6h7d As8h 8sTd Jd7h"));
  }

  @Test
  public void test_texas_holdem_7446_4h6s7c7s8h_Qs8s_2dQd_6cKd_Ks8c_As8d_9hAc_Jc3d() {
    assertEquals(
      "Jc3d 2dQd 9hAc 6cKd Qs8s Ks8c As8d",
      Solver.process("texas-holdem 4h6s7c7s8h Qs8s 2dQd 6cKd Ks8c As8d 9hAc Jc3d"));
  }

  @Test
  public void test_texas_holdem_7447_5c6s9sAhQd_Jh9h_5s4s_9dQs_2h6c() {
    assertEquals(
      "5s4s 2h6c Jh9h 9dQs",
      Solver.process("texas-holdem 5c6s9sAhQd Jh9h 5s4s 9dQs 2h6c"));
  }

  @Test
  public void test_texas_holdem_7448_2h3c6dQcQs_AdKc_Jd8c_6c9h_5cAh_JcTh_4d3d_2sKh_7s2d_5s8d() {
    assertEquals(
      "5s8d Jd8c JcTh 5cAh AdKc 7s2d 2sKh 4d3d 6c9h",
      Solver.process("texas-holdem 2h3c6dQcQs AdKc Jd8c 6c9h 5cAh JcTh 4d3d 2sKh 7s2d 5s8d"));
  }

  @Test
  public void test_texas_holdem_7449_3c7d9dQdQs_2s2c_2dTh_3h4c_Kd8d_3d3s_6h9s_6cQc_6sTc() {
    assertEquals(
      "2dTh=6sTc 2s2c 3h4c 6h9s 6cQc Kd8d 3d3s",
      Solver.process("texas-holdem 3c7d9dQdQs 2s2c 2dTh 3h4c Kd8d 3d3s 6h9s 6cQc 6sTc"));
  }

  @Test
  public void test_texas_holdem_7450_2d5h7cKhTs_Kd4s_Qc3s_6sQd_5d2c() {
    assertEquals(
      "Qc3s 6sQd Kd4s 5d2c",
      Solver.process("texas-holdem 2d5h7cKhTs Kd4s Qc3s 6sQd 5d2c"));
  }

  @Test
  public void test_texas_holdem_7451_4dAhJcQcTh_4cKh_4h4s_6c2s() {
    assertEquals(
      "6c2s 4h4s 4cKh",
      Solver.process("texas-holdem 4dAhJcQcTh 4cKh 4h4s 6c2s"));
  }

  @Test
  public void test_texas_holdem_7452_5h5s6c7s9h_3d2d_TdJc_2c9d_Kc4h_QcQh_Js8d_3cTc() {
    assertEquals(
      "3d2d 3cTc TdJc Kc4h 2c9d QcQh Js8d",
      Solver.process("texas-holdem 5h5s6c7s9h 3d2d TdJc 2c9d Kc4h QcQh Js8d 3cTc"));
  }

  @Test
  public void test_texas_holdem_7453_5cAsKsTcTs_QcJs_9h7h_AcAd_9d2c() {
    assertEquals(
      "9d2c=9h7h QcJs AcAd",
      Solver.process("texas-holdem 5cAsKsTcTs QcJs 9h7h AcAd 9d2c"));
  }

  @Test
  public void test_texas_holdem_7454_4s5d7c7hQc_7s8d_2s2d_Ah3d_8hJh_4c5c_9d2h_KdTs_8sAd() {
    assertEquals(
      "9d2h 8hJh KdTs Ah3d 8sAd 2s2d 4c5c 7s8d",
      Solver.process("texas-holdem 4s5d7c7hQc 7s8d 2s2d Ah3d 8hJh 4c5c 9d2h KdTs 8sAd"));
  }

  @Test
  public void test_texas_holdem_7455_3h5d5sJsQs_8h2s_2dKc_5hTc_2h6s_Jc6h() {
    assertEquals(
      "2h6s 8h2s 2dKc Jc6h 5hTc",
      Solver.process("texas-holdem 3h5d5sJsQs 8h2s 2dKc 5hTc 2h6s Jc6h"));
  }

  @Test
  public void test_texas_holdem_7456_2d3h7h9hKc_Jh9c_2hJd_Kh6d_7c5h_Td4s_9s4c_3dQh() {
    assertEquals(
      "Td4s 2hJd 3dQh 7c5h 9s4c Jh9c Kh6d",
      Solver.process("texas-holdem 2d3h7h9hKc Jh9c 2hJd Kh6d 7c5h Td4s 9s4c 3dQh"));
  }

  @Test
  public void test_texas_holdem_7457_3sAcAsJcJh_3h4h_JdTh_KdQs_2d2h() {
    assertEquals(
      "2d2h 3h4h KdQs JdTh",
      Solver.process("texas-holdem 3sAcAsJcJh 3h4h JdTh KdQs 2d2h"));
  }

  @Test
  public void test_texas_holdem_7458_4c6dAcQcQs_QdAh_Js7h_9cTh() {
    assertEquals(
      "9cTh Js7h QdAh",
      Solver.process("texas-holdem 4c6dAcQcQs QdAh Js7h 9cTh"));
  }

  @Test
  public void test_texas_holdem_7459_4d6s9sJhQc_JcKh_4sQs_Js5s_3hTh_2c8d_4c8s_QhTc_Ad8h() {
    assertEquals(
      "2c8d 3hTh Ad8h 4c8s Js5s JcKh QhTc 4sQs",
      Solver.process("texas-holdem 4d6s9sJhQc JcKh 4sQs Js5s 3hTh 2c8d 4c8s QhTc Ad8h"));
  }

  @Test
  public void test_texas_holdem_7460_3h6sKcQdQh_4sKd_3sKs_JcAc_2h4d_JsJd_2c5c() {
    assertEquals(
      "2h4d 2c5c JcAc JsJd 3sKs=4sKd",
      Solver.process("texas-holdem 3h6sKcQdQh 4sKd 3sKs JcAc 2h4d JsJd 2c5c"));
  }

  @Test
  public void test_texas_holdem_7461_3s6d7cKcKh_4d5h_5d6c_TsQh_Th9c() {
    assertEquals(
      "Th9c TsQh 5d6c 4d5h",
      Solver.process("texas-holdem 3s6d7cKcKh 4d5h 5d6c TsQh Th9c"));
  }

  @Test
  public void test_texas_holdem_7462_7d8d8sKhTc_7c5h_AhJc_3cTs_3s4h_KdAs_6c9c_ThKs_6dQd() {
    assertEquals(
      "3s4h 6dQd AhJc 7c5h 3cTs KdAs ThKs 6c9c",
      Solver.process("texas-holdem 7d8d8sKhTc 7c5h AhJc 3cTs 3s4h KdAs 6c9c ThKs 6dQd"));
  }

  @Test
  public void test_texas_holdem_7463_4c4hAcAsTd_7d6s_KsKc_AhTs_3d2c() {
    assertEquals(
      "3d2c=7d6s KsKc AhTs",
      Solver.process("texas-holdem 4c4hAcAsTd 7d6s KsKc AhTs 3d2c"));
  }

  @Test
  public void test_texas_holdem_7464_4h5h9hQcTs_7c2s_Ad2d_Td6c_3c9d() {
    assertEquals(
      "7c2s Ad2d 3c9d Td6c",
      Solver.process("texas-holdem 4h5h9hQcTs 7c2s Ad2d Td6c 3c9d"));
  }

  @Test
  public void test_texas_holdem_7465_6h7s9hKdQd_8h5h_7h9d_As4s_3h9s_7dQh_Ac8d_5c8c_2dTd_4cTs() {
    assertEquals(
      "2dTd=4cTs As4s Ac8d 3h9s 7h9d 7dQh 5c8c=8h5h",
      Solver.process("texas-holdem 6h7s9hKdQd 8h5h 7h9d As4s 3h9s 7dQh Ac8d 5c8c 2dTd 4cTs"));
  }

  @Test
  public void test_texas_holdem_7466_8sJsKsQhTs_6d7c_4h8h() {
    assertEquals(
      "6d7c 4h8h",
      Solver.process("texas-holdem 8sJsKsQhTs 6d7c 4h8h"));
  }

  @Test
  public void test_texas_holdem_7467_2s7d7hKcQh_8c3d_3c9d() {
    assertEquals(
      "8c3d 3c9d",
      Solver.process("texas-holdem 2s7d7hKcQh 8c3d 3c9d"));
  }

  @Test
  public void test_texas_holdem_7468_4d4h6c7sJh_Kh9s_QhQc_3d2h_6hTs() {
    assertEquals(
      "3d2h Kh9s 6hTs QhQc",
      Solver.process("texas-holdem 4d4h6c7sJh Kh9s QhQc 3d2h 6hTs"));
  }

  @Test
  public void test_texas_holdem_7469_2s5s9dAhKd_8h6c_JhAd_3dJc_6dAs_6sKs_3cJs_4hQs_Jd7c() {
    assertEquals(
      "8h6c 3cJs=3dJc Jd7c 4hQs 6sKs 6dAs JhAd",
      Solver.process("texas-holdem 2s5s9dAhKd 8h6c JhAd 3dJc 6dAs 6sKs 3cJs 4hQs Jd7c"));
  }

  @Test
  public void test_texas_holdem_7470_4c6d7hAcQc_6s9c_Th2c_3h4s_5sAs_5cKh_KcQh_TcTd() {
    assertEquals(
      "Th2c 5cKh 3h4s 6s9c TcTd KcQh 5sAs",
      Solver.process("texas-holdem 4c6d7hAcQc 6s9c Th2c 3h4s 5sAs 5cKh KcQh TcTd"));
  }

  @Test
  public void test_texas_holdem_7471_2d3d4d6d9s_KdKs_As8d_7c8h() {
    assertEquals(
      "7c8h As8d KdKs",
      Solver.process("texas-holdem 2d3d4d6d9s KdKs As8d 7c8h"));
  }

  @Test
  public void test_texas_holdem_7472_2h3c7c7dTc_Kc5s_Qd6s() {
    assertEquals(
      "Qd6s Kc5s",
      Solver.process("texas-holdem 2h3c7c7dTc Kc5s Qd6s"));
  }

  @Test
  public void test_texas_holdem_7473_3s5dJdThTs_Ah7s_2cAd_6c8c_4sJc_7dQs_AsQc_9c4d_2h9h() {
    assertEquals(
      "6c8c 2h9h=9c4d 7dQs 2cAd Ah7s AsQc 4sJc",
      Solver.process("texas-holdem 3s5dJdThTs Ah7s 2cAd 6c8c 4sJc 7dQs AsQc 9c4d 2h9h"));
  }

  @Test
  public void test_texas_holdem_7474_5d8d8hAsQh_Qd5h_3c2h_JsKh_Kc2s() {
    assertEquals(
      "3c2h JsKh=Kc2s Qd5h",
      Solver.process("texas-holdem 5d8d8hAsQh Qd5h 3c2h JsKh Kc2s"));
  }

  @Test
  public void test_texas_holdem_7475_3d6d6s9cQc_7cJs_3h8s_Td4c_8dAs_Kc4s_3c8c_Ah2s() {
    assertEquals(
      "Td4c 7cJs Kc4s 8dAs=Ah2s 3c8c=3h8s",
      Solver.process("texas-holdem 3d6d6s9cQc 7cJs 3h8s Td4c 8dAs Kc4s 3c8c Ah2s"));
  }

  @Test
  public void test_texas_holdem_7476_3dAdJcKdQc_4h2h_2d2c_6h5s_3c6s_8h6c_2s4c_Kh8d_JsJh() {
    assertEquals(
      "2s4c=4h2h 6h5s 8h6c 2d2c 3c6s Kh8d JsJh",
      Solver.process("texas-holdem 3dAdJcKdQc 4h2h 2d2c 6h5s 3c6s 8h6c 2s4c Kh8d JsJh"));
  }

  @Test
  public void test_texas_holdem_7477_4d4s5c9c9d_Kc5h_8sAh_Ad4h_Qs9h_6c3s() {
    assertEquals(
      "6c3s 8sAh Kc5h Ad4h Qs9h",
      Solver.process("texas-holdem 4d4s5c9c9d Kc5h 8sAh Ad4h Qs9h 6c3s"));
  }

  @Test
  public void test_texas_holdem_7478_3h4c7sJcTh_4dAs_Jh9c_Js9s_Ac8c() {
    assertEquals(
      "Ac8c 4dAs Jh9c=Js9s",
      Solver.process("texas-holdem 3h4c7sJcTh 4dAs Jh9c Js9s Ac8c"));
  }

  @Test
  public void test_texas_holdem_7479_2s3d7sAcKc_8hKd_7c5s() {
    assertEquals(
      "7c5s 8hKd",
      Solver.process("texas-holdem 2s3d7sAcKc 8hKd 7c5s"));
  }

  @Test
  public void test_texas_holdem_7480_7c9dKsTdTh_6c4c_4d3h_7sAc_6s7h_Kc3c_AhJh_Qc3d() {
    assertEquals(
      "4d3h=6c4c Qc3d AhJh 6s7h 7sAc Kc3c",
      Solver.process("texas-holdem 7c9dKsTdTh 6c4c 4d3h 7sAc 6s7h Kc3c AhJh Qc3d"));
  }

  @Test
  public void test_texas_holdem_7481_2s4d6s9sKh_2d9d_Qc2c_AhKd_4s9h_Td9c_Ts6c() {
    assertEquals(
      "Qc2c Ts6c Td9c AhKd 2d9d 4s9h",
      Solver.process("texas-holdem 2s4d6s9sKh 2d9d Qc2c AhKd 4s9h Td9c Ts6c"));
  }

  @Test
  public void test_texas_holdem_7482_4c5d5h8hJd_QcKd_JsAd_Ks6d() {
    assertEquals(
      "Ks6d QcKd JsAd",
      Solver.process("texas-holdem 4c5d5h8hJd QcKd JsAd Ks6d"));
  }

  @Test
  public void test_texas_holdem_7483_4s6c8c8dJd_5dKc_6s6d_Ac5h_Js5c_TdJh_KsKh() {
    assertEquals(
      "5dKc Ac5h Js5c TdJh KsKh 6s6d",
      Solver.process("texas-holdem 4s6c8c8dJd 5dKc 6s6d Ac5h Js5c TdJh KsKh"));
  }

  @Test
  public void test_texas_holdem_7484_2h3h4cKsTs_Th8s_Td7h_4s4d_KhTc() {
    assertEquals(
      "Td7h Th8s KhTc 4s4d",
      Solver.process("texas-holdem 2h3h4cKsTs Th8s Td7h 4s4d KhTc"));
  }

  @Test
  public void test_texas_holdem_7485_2h3s8c9sAs_Ac9c_5c8d() {
    assertEquals(
      "5c8d Ac9c",
      Solver.process("texas-holdem 2h3s8c9sAs Ac9c 5c8d"));
  }

  @Test
  public void test_texas_holdem_7486_3s5c8c8dJs_9cJh_9dAh_9hJc_7d2h_Tc4h_TdAc_7hQc_TsTh_3c9s() {
    assertEquals(
      "7d2h Tc4h 7hQc 9dAh TdAc 3c9s TsTh 9cJh=9hJc",
      Solver.process("texas-holdem 3s5c8c8dJs 9cJh 9dAh 9hJc 7d2h Tc4h TdAc 7hQc TsTh 3c9s"));
  }

  @Test
  public void test_texas_holdem_7487_2c3c8dAdTh_JcKd_9s9h_5d8s_5c6h_7hAh_8c7d() {
    assertEquals(
      "5c6h JcKd 5d8s 8c7d 9s9h 7hAh",
      Solver.process("texas-holdem 2c3c8dAdTh JcKd 9s9h 5d8s 5c6h 7hAh 8c7d"));
  }

  @Test
  public void test_texas_holdem_7488_3c5h8s9cJh_Kh7h_2d6c_3hAh_7d2c_6s8c_Kd5s_Js6d() {
    assertEquals(
      "2d6c 7d2c Kh7h 3hAh Kd5s 6s8c Js6d",
      Solver.process("texas-holdem 3c5h8s9cJh Kh7h 2d6c 3hAh 7d2c 6s8c Kd5s Js6d"));
  }

  @Test
  public void test_texas_holdem_7489_6s7d7s8dTs_8cQh_6h4h_9s6d_5d9d_7cJs_2hKd_8s5h_JdAh() {
    assertEquals(
      "2hKd JdAh 6h4h 8s5h 8cQh 7cJs 5d9d=9s6d",
      Solver.process("texas-holdem 6s7d7s8dTs 8cQh 6h4h 9s6d 5d9d 7cJs 2hKd 8s5h JdAh"));
  }

  @Test
  public void test_texas_holdem_7490_3s4c8h9dJh_9cAd_QsTd_6cQc() {
    assertEquals(
      "6cQc 9cAd QsTd",
      Solver.process("texas-holdem 3s4c8h9dJh 9cAd QsTd 6cQc"));
  }

  @Test
  public void test_texas_holdem_7491_2h5h8dAdQh_7c9c_8s2s_KdTh_3c6h_Ts5s_4hKs_7hKc() {
    assertEquals(
      "3c6h 7c9c 4hKs 7hKc KdTh Ts5s 8s2s",
      Solver.process("texas-holdem 2h5h8dAdQh 7c9c 8s2s KdTh 3c6h Ts5s 4hKs 7hKc"));
  }

  @Test
  public void test_texas_holdem_7492_4c6hAsJcJs_9h2c_Tc9d_8dAd_Kh7c_Qh4h_TdTh_7d6d_Kc5c_5d3s() {
    assertEquals(
      "5d3s 9h2c Tc9d Kc5c Kh7c Qh4h 7d6d TdTh 8dAd",
      Solver.process("texas-holdem 4c6hAsJcJs 9h2c Tc9d 8dAd Kh7c Qh4h TdTh 7d6d Kc5c 5d3s"));
  }

  @Test
  public void test_texas_holdem_7493_3c4c6cQcQh_KdQs_5hTd_6s6d_7d2s_5dJd_5cAs_TcKh_9cAd() {
    assertEquals(
      "7d2s 5hTd 5dJd KdQs 5cAs 9cAd TcKh 6s6d",
      Solver.process("texas-holdem 3c4c6cQcQh KdQs 5hTd 6s6d 7d2s 5dJd 5cAs TcKh 9cAd"));
  }

  @Test
  public void test_texas_holdem_7494_3c4d4h6s8s_7cQc_2h9c_4cTd_Tc7h_KdJs_4s2c() {
    assertEquals(
      "2h9c Tc7h 7cQc KdJs 4s2c 4cTd",
      Solver.process("texas-holdem 3c4d4h6s8s 7cQc 2h9c 4cTd Tc7h KdJs 4s2c"));
  }

  @Test
  public void test_texas_holdem_7495_4d7d9cAdTs_JhKc_2c4s_5cAc_Qs6c_5d8c_3d4h_Qd8s() {
    assertEquals(
      "5d8c Qs6c Qd8s JhKc 2c4s=3d4h 5cAc",
      Solver.process("texas-holdem 4d7d9cAdTs JhKc 2c4s 5cAc Qs6c 5d8c 3d4h Qd8s"));
  }

  @Test
  public void test_texas_holdem_7496_5cKcQcTcTd_KsTs_5h2d_8s7d_2cQs_JsKh_8c3h() {
    assertEquals(
      "8s7d 5h2d JsKh 2cQs 8c3h KsTs",
      Solver.process("texas-holdem 5cKcQcTcTd KsTs 5h2d 8s7d 2cQs JsKh 8c3h"));
  }

  @Test
  public void test_texas_holdem_7497_7s8c9dAdKc_7dAh_4s9s_6sKh_6c5d_3hKd_2c3d() {
    assertEquals(
      "2c3d 4s9s 3hKd=6sKh 7dAh 6c5d",
      Solver.process("texas-holdem 7s8c9dAdKc 7dAh 4s9s 6sKh 6c5d 3hKd 2c3d"));
  }

  @Test
  public void test_texas_holdem_7498_4s6d8hJsTd_8s2s_Qd7h() {
    assertEquals(
      "Qd7h 8s2s",
      Solver.process("texas-holdem 4s6d8hJsTd 8s2s Qd7h"));
  }

  @Test
  public void test_texas_holdem_7499_2s5d6d8cQd_3s2h_9c7d_6sKs_4d3h_9h4c_7h3c_7cJh_JdAc() {
    assertEquals(
      "7h3c 9h4c 7cJh JdAc 3s2h 6sKs 4d3h 9c7d",
      Solver.process("texas-holdem 2s5d6d8cQd 3s2h 9c7d 6sKs 4d3h 9h4c 7h3c 7cJh JdAc"));
  }

}
