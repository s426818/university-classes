
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver1HiddenTest {


  @Test
  public void test_texas_holdem_250_2s8s9d9sAh_Qd9c_5dTs_8c7c_Th6d_2d5c_4dJd_7s2c_4hJc_5s3h() {
    assertEquals(
      "5s3h 5dTs=Th6d 4dJd=4hJc 2d5c=7s2c 8c7c Qd9c",
      Solver.process("texas-holdem 2s8s9d9sAh Qd9c 5dTs 8c7c Th6d 2d5c 4dJd 7s2c 4hJc 5s3h"));
  }

  @Test
  public void test_texas_holdem_251_4hAsJdJhQc_Kd5d_TsJs_6h9c_8hKh_2d6c_2c5h_6sQs() {
    assertEquals(
      "2c5h 2d6c 6h9c 8hKh=Kd5d 6sQs TsJs",
      Solver.process("texas-holdem 4hAsJdJhQc Kd5d TsJs 6h9c 8hKh 2d6c 2c5h 6sQs"));
  }

  @Test
  public void test_texas_holdem_252_3sJhQsTcTh_2h3c_Qh6s_3h4d_2d8h_Qd6c_Td5h_Ad4h_2cAh() {
    assertEquals(
      "2d8h 2cAh=Ad4h 2h3c=3h4d Qd6c=Qh6s Td5h",
      Solver.process("texas-holdem 3sJhQsTcTh 2h3c Qh6s 3h4d 2d8h Qd6c Td5h Ad4h 2cAh"));
  }

  @Test
  public void test_texas_holdem_253_4h4s7s8dAs_Qs6d_9sAd_5d3s_Kd9c_5sAh_7hQh_7cTs_Jh5c_6s8h() {
    assertEquals(
      "5d3s Jh5c Qs6d Kd9c 7cTs=7hQh 6s8h 5sAh 9sAd",
      Solver.process("texas-holdem 4h4s7s8dAs Qs6d 9sAd 5d3s Kd9c 5sAh 7hQh 7cTs Jh5c 6s8h"));
  }

  @Test
  public void test_texas_holdem_254_3d3s6d7cJs_6c4c_Qh8c() {
    assertEquals(
      "Qh8c 6c4c",
      Solver.process("texas-holdem 3d3s6d7cJs 6c4c Qh8c"));
  }

  @Test
  public void test_texas_holdem_255_3c4s7sJdQs_Tc3s_8s7h_2h4h_5sJc() {
    assertEquals(
      "Tc3s 2h4h 8s7h 5sJc",
      Solver.process("texas-holdem 3c4s7sJdQs Tc3s 8s7h 2h4h 5sJc"));
  }

  @Test
  public void test_texas_holdem_256_7c9hQcQsTh_4s4d_5c9c_KdTd_9s8s_8dKc() {
    assertEquals(
      "8dKc 4s4d 5c9c=9s8s KdTd",
      Solver.process("texas-holdem 7c9hQcQsTh 4s4d 5c9c KdTd 9s8s 8dKc"));
  }

  @Test
  public void test_texas_holdem_257_2c2d5c7dAc_QsQc_3hQd_Td3c_Qh4d_5d6h_3s4s_3d6c_5h9d() {
    assertEquals(
      "3d6c Td3c 3hQd=Qh4d 5d6h=5h9d QsQc 3s4s",
      Solver.process("texas-holdem 2c2d5c7dAc QsQc 3hQd Td3c Qh4d 5d6h 3s4s 3d6c 5h9d"));
  }

  @Test
  public void test_texas_holdem_258_8h9cAcKhTc_KsKd_9h7d_Js6h_Qd9s_9dAh_Ad2d_8dQc() {
    assertEquals(
      "Js6h 8dQc 9h7d Qd9s Ad2d 9dAh KsKd",
      Solver.process("texas-holdem 8h9cAcKhTc KsKd 9h7d Js6h Qd9s 9dAh Ad2d 8dQc"));
  }

  @Test
  public void test_texas_holdem_259_8c9dJdQdQh_7dTs_AcTh_4c2c_9c8h_3s9h_6h6c_7hAs() {
    assertEquals(
      "4c2c 7hAs 6h6c 3s9h=9c8h 7dTs=AcTh",
      Solver.process("texas-holdem 8c9dJdQdQh 7dTs AcTh 4c2c 9c8h 3s9h 6h6c 7hAs"));
  }

  @Test
  public void test_texas_holdem_260_2c4c4hAhJd_AcQs_Jc4s_4dQh_Qd5d_2h5s_Qc9d_Ad6s_9c3s() {
    assertEquals(
      "9c3s Qc9d=Qd5d 2h5s Ad6s AcQs 4dQh Jc4s",
      Solver.process("texas-holdem 2c4c4hAhJd AcQs Jc4s 4dQh Qd5d 2h5s Qc9d Ad6s 9c3s"));
  }

  @Test
  public void test_texas_holdem_261_5s7sAdJhTc_Qd6h_Ts4c_Kh2c_4s4d_9h7h_Qh3h() {
    assertEquals(
      "Qd6h=Qh3h Kh2c 4s4d 9h7h Ts4c",
      Solver.process("texas-holdem 5s7sAdJhTc Qd6h Ts4c Kh2c 4s4d 9h7h Qh3h"));
  }

  @Test
  public void test_texas_holdem_262_3d4d5cAdTd_Th9h_3h8s() {
    assertEquals(
      "3h8s Th9h",
      Solver.process("texas-holdem 3d4d5cAdTd Th9h 3h8s"));
  }

  @Test
  public void test_texas_holdem_263_2s3hAsJhKd_7d6h_QdQc_Jd6s_9c5s_8dKc_6c9d_2hAd() {
    assertEquals(
      "7d6h 9c5s 6c9d Jd6s QdQc 8dKc 2hAd",
      Solver.process("texas-holdem 2s3hAsJhKd 7d6h QdQc Jd6s 9c5s 8dKc 6c9d 2hAd"));
  }

  @Test
  public void test_texas_holdem_264_3c4s5d5hTs_8h2h_7sQh_Td2s_8s6s_JcKd_6dKh_3d2d_5cTh_9sKs() {
    assertEquals(
      "8h2h 8s6s 7sQh 6dKh 9sKs JcKd 3d2d Td2s 5cTh",
      Solver.process("texas-holdem 3c4s5d5hTs 8h2h 7sQh Td2s 8s6s JcKd 6dKh 3d2d 5cTh 9sKs"));
  }

  @Test
  public void test_texas_holdem_265_3d4s6c9hKh_5d2c_Jd7h_Kc3c_3s2s_4c6s_QsJs() {
    assertEquals(
      "Jd7h QsJs 3s2s 4c6s Kc3c 5d2c",
      Solver.process("texas-holdem 3d4s6c9hKh 5d2c Jd7h Kc3c 3s2s 4c6s QsJs"));
  }

  @Test
  public void test_texas_holdem_266_9cAcAdJsKd_7hAs_Qs2d() {
    assertEquals(
      "Qs2d 7hAs",
      Solver.process("texas-holdem 9cAcAdJsKd 7hAs Qs2d"));
  }

  @Test
  public void test_texas_holdem_267_3s5s7c9cKs_2d4s_9dQh_6d3h_5h4c_JcAs_9hKh_5dJs_5cTd() {
    assertEquals(
      "2d4s JcAs 6d3h 5h4c 5cTd 5dJs 9dQh 9hKh",
      Solver.process("texas-holdem 3s5s7c9cKs 2d4s 9dQh 6d3h 5h4c JcAs 9hKh 5dJs 5cTd"));
  }

  @Test
  public void test_texas_holdem_268_3sJcJsKhQh_9d3d_4s5d_Qd3c_6h5c_Td6c() {
    assertEquals(
      "4s5d 6h5c Td6c 9d3d Qd3c",
      Solver.process("texas-holdem 3sJcJsKhQh 9d3d 4s5d Qd3c 6h5c Td6c"));
  }

  @Test
  public void test_texas_holdem_269_3d4h5s7hJs_6hJd_Kd6c_8hAd_3hJh_4c9h_5d5c_8d9s() {
    assertEquals(
      "8d9s 8hAd 4c9h 3hJh 5d5c 6hJd=Kd6c",
      Solver.process("texas-holdem 3d4h5s7hJs 6hJd Kd6c 8hAd 3hJh 4c9h 5d5c 8d9s"));
  }

  @Test
  public void test_texas_holdem_270_5s7sAdQcQs_9sJd_8cTh_2hJs_Jc4s() {
    assertEquals(
      "8cTh 2hJs=Jc4s 9sJd",
      Solver.process("texas-holdem 5s7sAdQcQs 9sJd 8cTh 2hJs Jc4s"));
  }

  @Test
  public void test_texas_holdem_271_3h8s9cJhTd_Qh2h_2d4c_5s2c_6d5c_6sAd_QcJs_Th6h_9d9h_TcAc() {
    assertEquals(
      "2d4c 5s2c 6d5c 6sAd Th6h TcAc 9d9h QcJs=Qh2h",
      Solver.process("texas-holdem 3h8s9cJhTd Qh2h 2d4c 5s2c 6d5c 6sAd QcJs Th6h 9d9h TcAc"));
  }

  @Test
  public void test_texas_holdem_272_3s7c7s8hJd_JcAs_6h6d_8cKc_Ad5d_2sKs_Ac5c_4hQs_3d2h_7d7h() {
    assertEquals(
      "4hQs 2sKs Ac5c=Ad5d 3d2h 6h6d 8cKc JcAs 7d7h",
      Solver.process("texas-holdem 3s7c7s8hJd JcAs 6h6d 8cKc Ad5d 2sKs Ac5c 4hQs 3d2h 7d7h"));
  }

  @Test
  public void test_texas_holdem_273_3s4h6s8dJh_5s4s_TdTs_6c6d_4d8c() {
    assertEquals(
      "5s4s TdTs 4d8c 6c6d",
      Solver.process("texas-holdem 3s4h6s8dJh 5s4s TdTs 6c6d 4d8c"));
  }

  @Test
  public void test_texas_holdem_274_2s7h7sJsKh_Ah6c_Ks5s_6s8s_Qh9c_Qc4c_KdTd_7dAs_8c5c() {
    assertEquals(
      "8c5c Qc4c=Qh9c Ah6c KdTd 7dAs 6s8s Ks5s",
      Solver.process("texas-holdem 2s7h7sJsKh Ah6c Ks5s 6s8s Qh9c Qc4c KdTd 7dAs 8c5c"));
  }

  @Test
  public void test_texas_holdem_275_6c9hKcQcTd_Kd6d_3c3d_4cTs_4d8d_9c2s_7c6s_Ac8c_7dJh_Jc6h() {
    assertEquals(
      "4d8d 3c3d 7c6s 9c2s 4cTs Kd6d 7dJh=Jc6h Ac8c",
      Solver.process("texas-holdem 6c9hKcQcTd Kd6d 3c3d 4cTs 4d8d 9c2s 7c6s Ac8c 7dJh Jc6h"));
  }

  @Test
  public void test_texas_holdem_276_3c3s5h7sAs_4d6c_Tc4c_Qs6s_KcAh() {
    assertEquals(
      "Tc4c KcAh 4d6c Qs6s",
      Solver.process("texas-holdem 3c3s5h7sAs 4d6c Tc4c Qs6s KcAh"));
  }

  @Test
  public void test_texas_holdem_277_2s4c5c6h9s_9d9h_Jh8d_2cQc_AdQh_7s8h_9c4h_2hJd_Js6s() {
    assertEquals(
      "Jh8d AdQh 2hJd 2cQc Js6s 9c4h 9d9h 7s8h",
      Solver.process("texas-holdem 2s4c5c6h9s 9d9h Jh8d 2cQc AdQh 7s8h 9c4h 2hJd Js6s"));
  }

  @Test
  public void test_texas_holdem_278_3s9cAsQdQs_2cAh_3c5c_Jd5h_7hTc() {
    assertEquals(
      "7hTc Jd5h 3c5c 2cAh",
      Solver.process("texas-holdem 3s9cAsQdQs 2cAh 3c5c Jd5h 7hTc"));
  }

  @Test
  public void test_texas_holdem_279_6d9cJsQdQs_2s6h_6c5c() {
    assertEquals(
      "2s6h=6c5c",
      Solver.process("texas-holdem 6d9cJsQdQs 2s6h 6c5c"));
  }

  @Test
  public void test_texas_holdem_280_3s6s9sJcTc_4c3h_KcJd_AsQs_9h7h_Kd5c_6dQd_Ac2c_9d8h() {
    assertEquals(
      "Kd5c Ac2c 4c3h 6dQd 9h7h 9d8h KcJd AsQs",
      Solver.process("texas-holdem 3s6s9sJcTc 4c3h KcJd AsQs 9h7h Kd5c 6dQd Ac2c 9d8h"));
  }

  @Test
  public void test_texas_holdem_281_9d9hAsKdQd_8s2c_5c8c_8d8h_6sQc_Tc9s_Ks4d_QhJs_7h5d_6cTd() {
    assertEquals(
      "5c8c=6cTd=7h5d=8s2c 8d8h 6sQc=QhJs Ks4d Tc9s",
      Solver.process("texas-holdem 9d9hAsKdQd 8s2c 5c8c 8d8h 6sQc Tc9s Ks4d QhJs 7h5d 6cTd"));
  }

  @Test
  public void test_texas_holdem_282_3d8sAsKcTc_Ad3h_QhQd_Qc5d_Kh7s_2h2s() {
    assertEquals(
      "Qc5d 2h2s QhQd Kh7s Ad3h",
      Solver.process("texas-holdem 3d8sAsKcTc Ad3h QhQd Qc5d Kh7s 2h2s"));
  }

  @Test
  public void test_texas_holdem_283_2h5cQdTcTh_5d7s_8hAd() {
    assertEquals(
      "8hAd 5d7s",
      Solver.process("texas-holdem 2h5cQdTcTh 5d7s 8hAd"));
  }

  @Test
  public void test_texas_holdem_284_3s4c7d7sTh_6s3c_2dKd_Qc7h() {
    assertEquals(
      "2dKd 6s3c Qc7h",
      Solver.process("texas-holdem 3s4c7d7sTh 6s3c 2dKd Qc7h"));
  }

  @Test
  public void test_texas_holdem_285_4s9sAcAhKd_7h7c_KhTs_JcAs_9d7d_JhAd_ThQh_8c3h_KcQc_Td7s() {
    assertEquals(
      "8c3h Td7s ThQh 7h7c 9d7d KhTs KcQc JcAs=JhAd",
      Solver.process("texas-holdem 4s9sAcAhKd 7h7c KhTs JcAs 9d7d JhAd ThQh 8c3h KcQc Td7s"));
  }

  @Test
  public void test_texas_holdem_286_2c8d8hJcTs_JsTh_Kc7s() {
    assertEquals(
      "Kc7s JsTh",
      Solver.process("texas-holdem 2c8d8hJcTs JsTh Kc7s"));
  }

  @Test
  public void test_texas_holdem_287_2s3c4d6sTh_7dAd_2d4h_Jd8d_Tc2h() {
    assertEquals(
      "Jd8d 7dAd 2d4h Tc2h",
      Solver.process("texas-holdem 2s3c4d6sTh 7dAd 2d4h Jd8d Tc2h"));
  }

  @Test
  public void test_texas_holdem_288_3d7h8hQdTh_5c8c_Td9s_3cQs_3h4s_QcAc_9c3s_Jd6d() {
    assertEquals(
      "Jd6d 3h4s 9c3s 5c8c Td9s QcAc 3cQs",
      Solver.process("texas-holdem 3d7h8hQdTh 5c8c Td9s 3cQs 3h4s QcAc 9c3s Jd6d"));
  }

  @Test
  public void test_texas_holdem_289_2h3s4h7hJs_6sTc_3c9s_Ts2s() {
    assertEquals(
      "6sTc Ts2s 3c9s",
      Solver.process("texas-holdem 2h3s4h7hJs 6sTc 3c9s Ts2s"));
  }

  @Test
  public void test_texas_holdem_290_4hAcAhKsQs_3s3c_7s3h_ThTd_7c6h_3dAd() {
    assertEquals(
      "7c6h=7s3h 3s3c ThTd 3dAd",
      Solver.process("texas-holdem 4hAcAhKsQs 3s3c 7s3h ThTd 7c6h 3dAd"));
  }

  @Test
  public void test_texas_holdem_291_3c4h8cAcJc_8d4s_Qh2h_KsJd() {
    assertEquals(
      "Qh2h KsJd 8d4s",
      Solver.process("texas-holdem 3c4h8cAcJc 8d4s Qh2h KsJd"));
  }

  @Test
  public void test_texas_holdem_292_4sAsQcTdTh_9cJh_6dAh_Kd3d_2h4d_5c8h_3s4h_Qh5s_3cJs_Qs8d() {
    assertEquals(
      "5c8h 3cJs=9cJh Kd3d 2h4d=3s4h Qh5s=Qs8d 6dAh",
      Solver.process("texas-holdem 4sAsQcTdTh 9cJh 6dAh Kd3d 2h4d 5c8h 3s4h Qh5s 3cJs Qs8d"));
  }

  @Test
  public void test_texas_holdem_293_6h8hAdJdQh_3dKs_ThAc_Qd7d_6c2s_Kc7h_Kh6s() {
    assertEquals(
      "3dKs=Kc7h 6c2s Kh6s Qd7d ThAc",
      Solver.process("texas-holdem 6h8hAdJdQh 3dKs ThAc Qd7d 6c2s Kc7h Kh6s"));
  }

  @Test
  public void test_texas_holdem_294_6d8cAsJdQh_JhAh_9cAd_2h7d_Jc2d_5h4d_5dTd_AcTc() {
    assertEquals(
      "5h4d 2h7d 5dTd Jc2d 9cAd AcTc JhAh",
      Solver.process("texas-holdem 6d8cAsJdQh JhAh 9cAd 2h7d Jc2d 5h4d 5dTd AcTc"));
  }

  @Test
  public void test_texas_holdem_295_2c6dJsKdKs_As2d_8h5s_4dJd_8sTh_7s3c_Qs4c() {
    assertEquals(
      "7s3c 8h5s 8sTh Qs4c As2d 4dJd",
      Solver.process("texas-holdem 2c6dJsKdKs As2d 8h5s 4dJd 8sTh 7s3c Qs4c"));
  }

  @Test
  public void test_texas_holdem_296_6c7s8dJhTh_Qd2h_7hAs_2dTd_Kd7c_3dQc_3s8c_4hKh() {
    assertEquals(
      "3dQc=Qd2h 4hKh Kd7c 7hAs 3s8c 2dTd",
      Solver.process("texas-holdem 6c7s8dJhTh Qd2h 7hAs 2dTd Kd7c 3dQc 3s8c 4hKh"));
  }

  @Test
  public void test_texas_holdem_297_3s4h8cJcKh_AhJh_9cAs_Qd7d_Kc9d_3cTd_5sTc_6s9h() {
    assertEquals(
      "6s9h 5sTc Qd7d 9cAs 3cTd AhJh Kc9d",
      Solver.process("texas-holdem 3s4h8cJcKh AhJh 9cAs Qd7d Kc9d 3cTd 5sTc 6s9h"));
  }

  @Test
  public void test_texas_holdem_298_2c2d5dAcQs_5hJs_Td3h() {
    assertEquals(
      "Td3h 5hJs",
      Solver.process("texas-holdem 2c2d5dAcQs 5hJs Td3h"));
  }

  @Test
  public void test_texas_holdem_299_2s7s8sKcTs_9h4c_7h2d_3d8h_Ac5h_9dQs_9c3c_6sTd_5sKs() {
    assertEquals(
      "9c3c=9h4c Ac5h 3d8h 7h2d 6sTd 9dQs 5sKs",
      Solver.process("texas-holdem 2s7s8sKcTs 9h4c 7h2d 3d8h Ac5h 9dQs 9c3c 6sTd 5sKs"));
  }

  @Test
  public void test_texas_holdem_300_4d6sJdQsTd_7sQh_Ah7d_Kd8s_3h8h_3sQc_AsAd() {
    assertEquals(
      "3h8h Kd8s Ah7d 3sQc 7sQh AsAd",
      Solver.process("texas-holdem 4d6sJdQsTd 7sQh Ah7d Kd8s 3h8h 3sQc AsAd"));
  }

  @Test
  public void test_texas_holdem_301_5c6d9cKhQh_9s8h_2h4c_Js9h_Th7s_6s5s() {
    assertEquals(
      "2h4c Th7s 9s8h Js9h 6s5s",
      Solver.process("texas-holdem 5c6d9cKhQh 9s8h 2h4c Js9h Th7s 6s5s"));
  }

  @Test
  public void test_texas_holdem_302_3s9sKdQcTs_3hJc_8c8s_3d2c_7dJd_2d7h_AdKc_5d4s() {
    assertEquals(
      "5d4s 2d7h 3d2c 8c8s AdKc 3hJc=7dJd",
      Solver.process("texas-holdem 3s9sKdQcTs 3hJc 8c8s 3d2c 7dJd 2d7h AdKc 5d4s"));
  }

  @Test
  public void test_texas_holdem_303_2h5sAcKhQd_3c8s_7d6h_4hJc_8d2s_3dKc_6c4d_5d6d_5hKs_3h7c() {
    assertEquals(
      "6c4d 3h7c 7d6h 3c8s 4hJc 8d2s 5d6d 3dKc 5hKs",
      Solver.process("texas-holdem 2h5sAcKhQd 3c8s 7d6h 4hJc 8d2s 3dKc 6c4d 5d6d 5hKs 3h7c"));
  }

  @Test
  public void test_texas_holdem_304_4c4d9cQhQs_As8d_7d8h_3hAc_AdKd_2h3c() {
    assertEquals(
      "2h3c=7d8h 3hAc=AdKd=As8d",
      Solver.process("texas-holdem 4c4d9cQhQs As8d 7d8h 3hAc AdKd 2h3c"));
  }

  @Test
  public void test_texas_holdem_305_3h5h8sAcKc_Ah6d_2d6s_4hAd_QsQd_7cKh() {
    assertEquals(
      "2d6s QsQd 7cKh 4hAd Ah6d",
      Solver.process("texas-holdem 3h5h8sAcKc Ah6d 2d6s 4hAd QsQd 7cKh"));
  }

  @Test
  public void test_texas_holdem_306_2c5c5d7s9s_7cAd_3s8c_Kd9h_6s6d() {
    assertEquals(
      "3s8c 6s6d 7cAd Kd9h",
      Solver.process("texas-holdem 2c5c5d7s9s 7cAd 3s8c Kd9h 6s6d"));
  }

  @Test
  public void test_texas_holdem_307_3d7s8d9dJc_Qh5d_5s9c_8sAd_Jh6d_Js4d() {
    assertEquals(
      "Qh5d 8sAd 5s9c Jh6d=Js4d",
      Solver.process("texas-holdem 3d7s8d9dJc Qh5d 5s9c 8sAd Jh6d Js4d"));
  }

  @Test
  public void test_texas_holdem_308_4c8c8dTcTd_JsTh_6c5s_4d3d_6d8s_2h3s_TsQs_Kc9s_Qc7h_6hKs() {
    assertEquals(
      "2h3s=4d3d 6c5s Qc7h 6hKs=Kc9s 6d8s JsTh=TsQs",
      Solver.process("texas-holdem 4c8c8dTcTd JsTh 6c5s 4d3d 6d8s 2h3s TsQs Kc9s Qc7h 6hKs"));
  }

  @Test
  public void test_texas_holdem_309_4h6sAcAdTh_Qs2c_5dKs_Kd2s_7c5h_TdJd() {
    assertEquals(
      "7c5h Qs2c 5dKs=Kd2s TdJd",
      Solver.process("texas-holdem 4h6sAcAdTh Qs2c 5dKs Kd2s 7c5h TdJd"));
  }

  @Test
  public void test_texas_holdem_310_5h8cJdKcKh_7sAs_2d9d() {
    assertEquals(
      "2d9d 7sAs",
      Solver.process("texas-holdem 5h8cJdKcKh 7sAs 2d9d"));
  }

  @Test
  public void test_texas_holdem_311_3s4h9cJsKs_9hQc_KcAh_3c2d() {
    assertEquals(
      "3c2d 9hQc KcAh",
      Solver.process("texas-holdem 3s4h9cJsKs 9hQc KcAh 3c2d"));
  }

  @Test
  public void test_texas_holdem_312_2s4h7hAcAs_5c8c_3s5d_8d9c() {
    assertEquals(
      "5c8c 8d9c 3s5d",
      Solver.process("texas-holdem 2s4h7hAcAs 5c8c 3s5d 8d9c"));
  }

  @Test
  public void test_texas_holdem_313_5h8cAdTcTh_Ts2h_5dJd_9sKd_Jh7s() {
    assertEquals(
      "Jh7s 9sKd 5dJd Ts2h",
      Solver.process("texas-holdem 5h8cAdTcTh Ts2h 5dJd 9sKd Jh7s"));
  }

  @Test
  public void test_texas_holdem_314_7dJcKdKhQc_AsKs_4c3c_5sJh_3s7s_Ah2s_2h5h_Qh7c() {
    assertEquals(
      "2h5h=4c3c Ah2s 3s7s 5sJh Qh7c AsKs",
      Solver.process("texas-holdem 7dJcKdKhQc AsKs 4c3c 5sJh 3s7s Ah2s 2h5h Qh7c"));
  }

  @Test
  public void test_texas_holdem_315_2h7h7s8dJh_4d2s_JdAs_2c7c() {
    assertEquals(
      "4d2s JdAs 2c7c",
      Solver.process("texas-holdem 2h7h7s8dJh 4d2s JdAs 2c7c"));
  }

  @Test
  public void test_texas_holdem_316_4d6h8hJsQs_JcKd_QcKh_7s7d_7cQd_Ts9c_2hTc_3cAh_8s6c_Qh8d() {
    assertEquals(
      "2hTc 3cAh 7s7d JcKd 7cQd QcKh 8s6c Qh8d Ts9c",
      Solver.process("texas-holdem 4d6h8hJsQs JcKd QcKh 7s7d 7cQd Ts9c 2hTc 3cAh 8s6c Qh8d"));
  }

  @Test
  public void test_texas_holdem_317_2c6c8d8sKs_Tc9c_Qc2s_6s6d_3d9s() {
    assertEquals(
      "3d9s Tc9c Qc2s 6s6d",
      Solver.process("texas-holdem 2c6c8d8sKs Tc9c Qc2s 6s6d 3d9s"));
  }

  @Test
  public void test_texas_holdem_318_4h8d9sAcKd_7cJs_6h9c_5hJd() {
    assertEquals(
      "5hJd=7cJs 6h9c",
      Solver.process("texas-holdem 4h8d9sAcKd 7cJs 6h9c 5hJd"));
  }

  @Test
  public void test_texas_holdem_319_5h7d9h9sAd_Kd2s_4d3h_As7c_5cQh_2h4c_8d6d() {
    assertEquals(
      "2h4c=4d3h Kd2s 5cQh As7c 8d6d",
      Solver.process("texas-holdem 5h7d9h9sAd Kd2s 4d3h As7c 5cQh 2h4c 8d6d"));
  }

  @Test
  public void test_texas_holdem_320_3d8sKsQdTs_Th2s_4sKh_9hKd_Td9d_Jc4h_3hJd_Tc5h_8h7c_Qs2h() {
    assertEquals(
      "Jc4h 3hJd 8h7c Tc5h=Th2s Td9d Qs2h 4sKh 9hKd",
      Solver.process("texas-holdem 3d8sKsQdTs Th2s 4sKh 9hKd Td9d Jc4h 3hJd Tc5h 8h7c Qs2h"));
  }

  @Test
  public void test_texas_holdem_321_2d3h7hAcJd_8cJc_7sQc_2h8h_4cKc_8dJh_As9h_3s3d_Ah4d() {
    assertEquals(
      "4cKc 2h8h 7sQc 8cJc=8dJh Ah4d As9h 3s3d",
      Solver.process("texas-holdem 2d3h7hAcJd 8cJc 7sQc 2h8h 4cKc 8dJh As9h 3s3d Ah4d"));
  }

  @Test
  public void test_texas_holdem_322_2d3d8sAcTh_AdTc_2cQs_7dAh_Kc5d_9dAs_9h3h_3c9s() {
    assertEquals(
      "Kc5d 2cQs 3c9s=9h3h 7dAh 9dAs AdTc",
      Solver.process("texas-holdem 2d3d8sAcTh AdTc 2cQs 7dAh Kc5d 9dAs 9h3h 3c9s"));
  }

  @Test
  public void test_texas_holdem_323_2c6h8dAsKd_Kc2h_Js5h_4c7h_Ac7d_3s6d_2s9c_8c7c_8s9h() {
    assertEquals(
      "4c7h Js5h 2s9c 3s6d 8c7c 8s9h Ac7d Kc2h",
      Solver.process("texas-holdem 2c6h8dAsKd Kc2h Js5h 4c7h Ac7d 3s6d 2s9c 8c7c 8s9h"));
  }

  @Test
  public void test_texas_holdem_324_2d7sAhJhKc_Qs8d_9dTh_3dJc_4h9c_Kd7c_Td8c() {
    assertEquals(
      "4h9c Td8c 9dTh Qs8d 3dJc Kd7c",
      Solver.process("texas-holdem 2d7sAhJhKc Qs8d 9dTh 3dJc 4h9c Kd7c Td8c"));
  }

  @Test
  public void test_texas_holdem_325_3d3s7h8cTd_Tc4s_Jh6c_Jd7c() {
    assertEquals(
      "Jh6c Jd7c Tc4s",
      Solver.process("texas-holdem 3d3s7h8cTd Tc4s Jh6c Jd7c"));
  }

  @Test
  public void test_texas_holdem_326_2c4c5hKcTc_7h7c_TsKd_7s3h_Ad9s_6h5d_Qs8d_8s4h_Jc9h_ThAs() {
    assertEquals(
      "7s3h Qs8d Ad9s 8s4h 6h5d ThAs TsKd 7h7c Jc9h",
      Solver.process("texas-holdem 2c4c5hKcTc 7h7c TsKd 7s3h Ad9s 6h5d Qs8d 8s4h Jc9h ThAs"));
  }

  @Test
  public void test_texas_holdem_327_2s5h7c9dJd_3hQh_Js9c_KdTs_5d7s_3s6s_Jc5s_5c3c_KcAd() {
    assertEquals(
      "3s6s 3hQh KdTs KcAd 5c3c 5d7s Jc5s Js9c",
      Solver.process("texas-holdem 2s5h7c9dJd 3hQh Js9c KdTs 5d7s 3s6s Jc5s 5c3c KcAd"));
  }

  @Test
  public void test_texas_holdem_328_5c5h8dAdJc_Qc4c_7c4d_8h4s_5s5d_9s7h_6s3d_8sTs_2s9c() {
    assertEquals(
      "6s3d=7c4d 2s9c=9s7h Qc4c 8h4s=8sTs 5s5d",
      Solver.process("texas-holdem 5c5h8dAdJc Qc4c 7c4d 8h4s 5s5d 9s7h 6s3d 8sTs 2s9c"));
  }

  @Test
  public void test_texas_holdem_329_2h2s5hJhTd_ThTs_2d6s_6h8c_3c3s_7d9c_8hQd_6cAc() {
    assertEquals(
      "6h8c 7d9c 8hQd 6cAc 3c3s 2d6s ThTs",
      Solver.process("texas-holdem 2h2s5hJhTd ThTs 2d6s 6h8c 3c3s 7d9c 8hQd 6cAc"));
  }

  @Test
  public void test_texas_holdem_330_4d5d6cAhAs_3d3s_Ks3h_7dQc_Td2c_6s4c_QsKh_2h7s() {
    assertEquals(
      "2h7s Td2c 7dQc Ks3h QsKh 3d3s 6s4c",
      Solver.process("texas-holdem 4d5d6cAhAs 3d3s Ks3h 7dQc Td2c 6s4c QsKh 2h7s"));
  }

  @Test
  public void test_texas_holdem_331_4c5dAcQsTd_Ah6s_AsQd() {
    assertEquals(
      "Ah6s AsQd",
      Solver.process("texas-holdem 4c5dAcQsTd Ah6s AsQd"));
  }

  @Test
  public void test_texas_holdem_332_8dJsKcKdQc_Jc6c_Ad3c_3d7s_2sAc_Tc9h_5s6d() {
    assertEquals(
      "3d7s=5s6d 2sAc=Ad3c Jc6c Tc9h",
      Solver.process("texas-holdem 8dJsKcKdQc Jc6c Ad3c 3d7s 2sAc Tc9h 5s6d"));
  }

  @Test
  public void test_texas_holdem_333_3d3s6sAhAs_Qd6c_3c3h_Ac7c_2h4s_Qc2c_9h5h() {
    assertEquals(
      "2h4s 9h5h Qc2c Qd6c Ac7c 3c3h",
      Solver.process("texas-holdem 3d3s6sAhAs Qd6c 3c3h Ac7c 2h4s Qc2c 9h5h"));
  }

  @Test
  public void test_texas_holdem_334_AdJcJdQhTs_8d5d_6sAs_5h2h() {
    assertEquals(
      "5h2h=8d5d 6sAs",
      Solver.process("texas-holdem AdJcJdQhTs 8d5d 6sAs 5h2h"));
  }

  @Test
  public void test_texas_holdem_335_5h6c7s8hJd_Th9c_TdAs_8d3d_QdQs_4c3c() {
    assertEquals(
      "TdAs 8d3d QdQs 4c3c Th9c",
      Solver.process("texas-holdem 5h6c7s8hJd Th9c TdAs 8d3d QdQs 4c3c"));
  }

  @Test
  public void test_texas_holdem_336_6s7h9cJdTc_3d3c_5c4d() {
    assertEquals(
      "5c4d 3d3c",
      Solver.process("texas-holdem 6s7h9cJdTc 3d3c 5c4d"));
  }

  @Test
  public void test_texas_holdem_337_5h6c6hJsQd_Td3s_2sJc_2d3d() {
    assertEquals(
      "2d3d Td3s 2sJc",
      Solver.process("texas-holdem 5h6c6hJsQd Td3s 2sJc 2d3d"));
  }

  @Test
  public void test_texas_holdem_338_2h7h8cKcQh_6c9h_6h4h_2d7d() {
    assertEquals(
      "6c9h 2d7d 6h4h",
      Solver.process("texas-holdem 2h7h8cKcQh 6c9h 6h4h 2d7d"));
  }

  @Test
  public void test_texas_holdem_339_3cAcAdJhTd_AsTs_Qd7s() {
    assertEquals(
      "Qd7s AsTs",
      Solver.process("texas-holdem 3cAcAdJhTd AsTs Qd7s"));
  }

  @Test
  public void test_texas_holdem_340_5c6s8c9dTh_Ts9h_8d4d_4h2c_2hJh() {
    assertEquals(
      "4h2c 2hJh 8d4d Ts9h",
      Solver.process("texas-holdem 5c6s8c9dTh Ts9h 8d4d 4h2c 2hJh"));
  }

  @Test
  public void test_texas_holdem_341_3d3s7cAcQd_AdTc_6hJc_8c6c_Js4h_2hKs_4sKc_7d3c_8d5h() {
    assertEquals(
      "8c6c=8d5h 6hJc=Js4h 2hKs=4sKc AdTc 7d3c",
      Solver.process("texas-holdem 3d3s7cAcQd AdTc 6hJc 8c6c Js4h 2hKs 4sKc 7d3c 8d5h"));
  }

  @Test
  public void test_texas_holdem_342_3s8sAhKsQh_7s9h_QcAs_8c5c_JdQs_4d4s_3c7h() {
    assertEquals(
      "7s9h 3c7h 4d4s 8c5c JdQs QcAs",
      Solver.process("texas-holdem 3s8sAhKsQh 7s9h QcAs 8c5c JdQs 4d4s 3c7h"));
  }

  @Test
  public void test_texas_holdem_343_3c6h7sKhKs_Th5d_6dAd_As8d_QdJd_4h2h_6c2s_5h4d() {
    assertEquals(
      "4h2h Th5d QdJd As8d 6c2s 6dAd 5h4d",
      Solver.process("texas-holdem 3c6h7sKhKs Th5d 6dAd As8d QdJd 4h2h 6c2s 5h4d"));
  }

  @Test
  public void test_texas_holdem_344_4c7d8h9sAs_Jc6c_2h4s_5h9d_8c2d_9h4h_QdQc_2sQs_TdQh_Kc7s() {
    assertEquals(
      "Jc6c 2sQs TdQh 2h4s Kc7s 8c2d 5h9d QdQc 9h4h",
      Solver.process("texas-holdem 4c7d8h9sAs Jc6c 2h4s 5h9d 8c2d 9h4h QdQc 2sQs TdQh Kc7s"));
  }

  @Test
  public void test_texas_holdem_345_2h5s7s8hKc_JsJc_AsKs_5dQh_3s8s_5h2s_Kh2c_7c9h_4sQc_2d7d() {
    assertEquals(
      "4sQc 5dQh 7c9h 3s8s JsJc AsKs 5h2s 2d7d Kh2c",
      Solver.process("texas-holdem 2h5s7s8hKc JsJc AsKs 5dQh 3s8s 5h2s Kh2c 7c9h 4sQc 2d7d"));
  }

  @Test
  public void test_texas_holdem_346_7c7d9sKsTs_Kh8c_Ac8h_5s4c_4d3h_5dAd_3s8d_8sJs_6dQc() {
    assertEquals(
      "3s8d=4d3h=5s4c 6dQc 5dAd=Ac8h Kh8c 8sJs",
      Solver.process("texas-holdem 7c7d9sKsTs Kh8c Ac8h 5s4c 4d3h 5dAd 3s8d 8sJs 6dQc"));
  }

  @Test
  public void test_texas_holdem_347_2h3c8sQsTd_Ah6d_QdKs() {
    assertEquals(
      "Ah6d QdKs",
      Solver.process("texas-holdem 2h3c8sQsTd Ah6d QdKs"));
  }

  @Test
  public void test_texas_holdem_348_2c2d5hQcTd_QsKc_2s6h_KsAs_Kd7s() {
    assertEquals(
      "Kd7s KsAs QsKc 2s6h",
      Solver.process("texas-holdem 2c2d5hQcTd QsKc 2s6h KsAs Kd7s"));
  }

  @Test
  public void test_texas_holdem_349_4c4h4s6c6h_3dJc_2c5c_7h6s_TsQc() {
    assertEquals(
      "2c5c=3dJc=TsQc 7h6s",
      Solver.process("texas-holdem 4c4h4s6c6h 3dJc 2c5c 7h6s TsQc"));
  }

  @Test
  public void test_texas_holdem_350_3s6h6s9hAc_8hAh_3hKc_9dJh_QhKh_2s8s_8c7s() {
    assertEquals(
      "2s8s=8c7s QhKh 3hKc 9dJh 8hAh",
      Solver.process("texas-holdem 3s6h6s9hAc 8hAh 3hKc 9dJh QhKh 2s8s 8c7s"));
  }

  @Test
  public void test_texas_holdem_351_5c5d7d9sKs_AsKh_2d8d_Qs5s_9d2c_2s5h_7sKd() {
    assertEquals(
      "2d8d 9d2c AsKh 7sKd 2s5h Qs5s",
      Solver.process("texas-holdem 5c5d7d9sKs AsKh 2d8d Qs5s 9d2c 2s5h 7sKd"));
  }

  @Test
  public void test_texas_holdem_352_6s7hAcJdTd_3cAh_6cKh() {
    assertEquals(
      "6cKh 3cAh",
      Solver.process("texas-holdem 6s7hAcJdTd 3cAh 6cKh"));
  }

  @Test
  public void test_texas_holdem_353_4c4sAsJdKs_5sQh_7c9s_JhJc() {
    assertEquals(
      "7c9s 5sQh JhJc",
      Solver.process("texas-holdem 4c4sAsJdKs 5sQh 7c9s JhJc"));
  }

  @Test
  public void test_texas_holdem_354_6dAdKsQcQh_Tc6c_Qs8d_Td4h_7d6h_KdKc_2d6s_3d7c() {
    assertEquals(
      "3d7c Td4h 2d6s=7d6h=Tc6c Qs8d KdKc",
      Solver.process("texas-holdem 6dAdKsQcQh Tc6c Qs8d Td4h 7d6h KdKc 2d6s 3d7c"));
  }

  @Test
  public void test_texas_holdem_355_3s4hQhTdTh_7d6h_JsKs_3h7c() {
    assertEquals(
      "7d6h JsKs 3h7c",
      Solver.process("texas-holdem 3s4hQhTdTh 7d6h JsKs 3h7c"));
  }

  @Test
  public void test_texas_holdem_356_3c7c7dJdQc_8c6h_TcJs_QsAd_Kh2s() {
    assertEquals(
      "8c6h Kh2s TcJs QsAd",
      Solver.process("texas-holdem 3c7c7dJdQc 8c6h TcJs QsAd Kh2s"));
  }

  @Test
  public void test_texas_holdem_357_2s5s8sJdKd_2d7h_Ts8d_6cAc_6sJh() {
    assertEquals(
      "6cAc 2d7h Ts8d 6sJh",
      Solver.process("texas-holdem 2s5s8sJdKd 2d7h Ts8d 6cAc 6sJh"));
  }

  @Test
  public void test_texas_holdem_358_2d3h6c9cJh_KdTc_5hQh_JcKh_7s8h_KcAd_4c8d_Ks6h() {
    assertEquals(
      "4c8d 7s8h 5hQh KdTc KcAd Ks6h JcKh",
      Solver.process("texas-holdem 2d3h6c9cJh KdTc 5hQh JcKh 7s8h KcAd 4c8d Ks6h"));
  }

  @Test
  public void test_texas_holdem_359_4s6dJdQsTc_5d9d_9h7h_8c2c_8s2d_5sQc() {
    assertEquals(
      "8c2c=8s2d 5d9d 9h7h 5sQc",
      Solver.process("texas-holdem 4s6dJdQsTc 5d9d 9h7h 8c2c 8s2d 5sQc"));
  }

  @Test
  public void test_texas_holdem_360_2d2s3cQcQh_Qd7h_6s5h_2hJc_3dTc_8s7s_8h9c_6hJs_7cKc() {
    assertEquals(
      "6s5h 8s7s 8h9c 6hJs 7cKc 3dTc 2hJc Qd7h",
      Solver.process("texas-holdem 2d2s3cQcQh Qd7h 6s5h 2hJc 3dTc 8s7s 8h9c 6hJs 7cKc"));
  }

  @Test
  public void test_texas_holdem_361_2h6hKcKhTd_Ac2s_8hQh() {
    assertEquals(
      "Ac2s 8hQh",
      Solver.process("texas-holdem 2h6hKcKhTd Ac2s 8hQh"));
  }

  @Test
  public void test_texas_holdem_362_2d8c9c9dTd_6dJc_JhTs_4hAd_Tc4d() {
    assertEquals(
      "6dJc 4hAd Tc4d JhTs",
      Solver.process("texas-holdem 2d8c9c9dTd 6dJc JhTs 4hAd Tc4d"));
  }

  @Test
  public void test_texas_holdem_363_2c4h8d8sKd_Ts7h_JdTh_Tc9c_4d5c() {
    assertEquals(
      "Ts7h Tc9c JdTh 4d5c",
      Solver.process("texas-holdem 2c4h8d8sKd Ts7h JdTh Tc9c 4d5c"));
  }

  @Test
  public void test_texas_holdem_364_2h3h5d7sQd_4s3d_2d6c() {
    assertEquals(
      "2d6c 4s3d",
      Solver.process("texas-holdem 2h3h5d7sQd 4s3d 2d6c"));
  }

  @Test
  public void test_texas_holdem_365_2h5h6sJsTs_5d9d_4cAd_JcTh() {
    assertEquals(
      "4cAd 5d9d JcTh",
      Solver.process("texas-holdem 2h5h6sJsTs 5d9d 4cAd JcTh"));
  }

  @Test
  public void test_texas_holdem_366_2c3d5hKdQh_8c6h_QsQc_8dKs_5dJc() {
    assertEquals(
      "8c6h 5dJc 8dKs QsQc",
      Solver.process("texas-holdem 2c3d5hKdQh 8c6h QsQc 8dKs 5dJc"));
  }

  @Test
  public void test_texas_holdem_367_5d7d8sJcTc_2cQc_5h7c_Js7h_6dQs_9dKd_3hAc_9c2d_5s4s() {
    assertEquals(
      "2cQc=6dQs 3hAc 5s4s 5h7c Js7h 9c2d=9dKd",
      Solver.process("texas-holdem 5d7d8sJcTc 2cQc 5h7c Js7h 6dQs 9dKd 3hAc 9c2d 5s4s"));
  }

  @Test
  public void test_texas_holdem_368_4h8cAcKdQd_Th7s_Jc8d_Qc3d_4sTs() {
    assertEquals(
      "Th7s 4sTs Jc8d Qc3d",
      Solver.process("texas-holdem 4h8cAcKdQd Th7s Jc8d Qc3d 4sTs"));
  }

  @Test
  public void test_texas_holdem_369_2d3h5dJsTd_3sKc_8sKh_4d7s_7cQd_7hQh() {
    assertEquals(
      "4d7s 7cQd=7hQh 8sKh 3sKc",
      Solver.process("texas-holdem 2d3h5dJsTd 3sKc 8sKh 4d7s 7cQd 7hQh"));
  }

  @Test
  public void test_texas_holdem_370_3h4c4d8dQc_4h8h_6d9d_KdKc_ThAh_9hJd_Jc8c() {
    assertEquals(
      "6d9d 9hJd ThAh Jc8c KdKc 4h8h",
      Solver.process("texas-holdem 3h4c4d8dQc 4h8h 6d9d KdKc ThAh 9hJd Jc8c"));
  }

  @Test
  public void test_texas_holdem_371_7c8s9sAdKd_QcAh_7dKs_9d6d_TcTh() {
    assertEquals(
      "9d6d TcTh QcAh 7dKs",
      Solver.process("texas-holdem 7c8s9sAdKd QcAh 7dKs 9d6d TcTh"));
  }

  @Test
  public void test_texas_holdem_372_2c5s8h9sKs_5h4s_5d9h_2s8d_8c6h_Ah4d_Kc7c_QdTc_6cQh_Jh3s() {
    assertEquals(
      "Jh3s 6cQh QdTc Ah4d 5h4s 8c6h Kc7c 2s8d 5d9h",
      Solver.process("texas-holdem 2c5s8h9sKs 5h4s 5d9h 2s8d 8c6h Ah4d Kc7c QdTc 6cQh Jh3s"));
  }

  @Test
  public void test_texas_holdem_373_2c2dAdKdQd_KsJd_3c8d() {
    assertEquals(
      "3c8d KsJd",
      Solver.process("texas-holdem 2c2dAdKdQd KsJd 3c8d"));
  }

  @Test
  public void test_texas_holdem_374_3d7d7sKcTs_3h4s_AsKh_4h8c_Ah8h_6hAd_Jd2h_Kd2d_TdAc_7c5s() {
    assertEquals(
      "4h8c Jd2h 6hAd=Ah8h 3h4s TdAc Kd2d AsKh 7c5s",
      Solver.process("texas-holdem 3d7d7sKcTs 3h4s AsKh 4h8c Ah8h 6hAd Jd2h Kd2d TdAc 7c5s"));
  }

  @Test
  public void test_texas_holdem_375_2c4d8hJdQh_5cKd_7c6h_AsTs_4h5s_9cTc_7hJh_Ah5d_5hQs_2s9d() {
    assertEquals(
      "7c6h 5cKd Ah5d AsTs 2s9d 4h5s 7hJh 5hQs 9cTc",
      Solver.process("texas-holdem 2c4d8hJdQh 5cKd 7c6h AsTs 4h5s 9cTc 7hJh Ah5d 5hQs 2s9d"));
  }

  @Test
  public void test_texas_holdem_376_3c3d4dAhJs_5c5h_2sAs_4s7s() {
    assertEquals(
      "4s7s 5c5h 2sAs",
      Solver.process("texas-holdem 3c3d4dAhJs 5c5h 2sAs 4s7s"));
  }

  @Test
  public void test_texas_holdem_377_4h5s9sQcTh_7c8c_3h7h_Ah9c_JdQd_KsKh_8d9d_5dAd() {
    assertEquals(
      "3h7h 7c8c 5dAd 8d9d Ah9c JdQd KsKh",
      Solver.process("texas-holdem 4h5s9sQcTh 7c8c 3h7h Ah9c JdQd KsKh 8d9d 5dAd"));
  }

  @Test
  public void test_texas_holdem_378_4h6c7s9h9s_Js8c_9c5h_4s5d_8h8s_Qd3s_5sKd_7c3d_6dAs() {
    assertEquals(
      "Js8c Qd3s 5sKd 4s5d 6dAs 7c3d 8h8s 9c5h",
      Solver.process("texas-holdem 4h6c7s9h9s Js8c 9c5h 4s5d 8h8s Qd3s 5sKd 7c3d 6dAs"));
  }

  @Test
  public void test_texas_holdem_379_7c7dAhJcQh_KhJs_Ac5c_4hTh_TsQs_6d7s_3h4s_6h5d_Tc5s() {
    assertEquals(
      "3h4s=4hTh=6h5d=Tc5s KhJs TsQs Ac5c 6d7s",
      Solver.process("texas-holdem 7c7dAhJcQh KhJs Ac5c 4hTh TsQs 6d7s 3h4s 6h5d Tc5s"));
  }

  @Test
  public void test_texas_holdem_380_4d8d8hAhQd_3s9h_TsKh_5c2c_3d5d_5s4s() {
    assertEquals(
      "5c2c 3s9h TsKh 5s4s 3d5d",
      Solver.process("texas-holdem 4d8d8hAhQd 3s9h TsKh 5c2c 3d5d 5s4s"));
  }

  @Test
  public void test_texas_holdem_381_2c3h7dAhKh_9c5d_KdAd_6h2s_2hQh_TsTc_Js3s_6cQc_5cJh() {
    assertEquals(
      "9c5d 5cJh 6cQc 6h2s Js3s TsTc KdAd 2hQh",
      Solver.process("texas-holdem 2c3h7dAhKh 9c5d KdAd 6h2s 2hQh TsTc Js3s 6cQc 5cJh"));
  }

  @Test
  public void test_texas_holdem_382_4h5d9dKcQh_QdQs_3h5h() {
    assertEquals(
      "3h5h QdQs",
      Solver.process("texas-holdem 4h5d9dKcQh QdQs 3h5h"));
  }

  @Test
  public void test_texas_holdem_383_3c3h5s8sJh_4sTd_7c6s_7h5c_6c5h_Kc8d_Qs2c_5d3d_4d6d() {
    assertEquals(
      "4d6d 7c6s 4sTd Qs2c 6c5h=7h5c Kc8d 5d3d",
      Solver.process("texas-holdem 3c3h5s8sJh 4sTd 7c6s 7h5c 6c5h Kc8d Qs2c 5d3d 4d6d"));
  }

  @Test
  public void test_texas_holdem_384_4d6d6sQhTc_3cAd_8hTd() {
    assertEquals(
      "3cAd 8hTd",
      Solver.process("texas-holdem 4d6d6sQhTc 3cAd 8hTd"));
  }

  @Test
  public void test_texas_holdem_385_2d4c4s5dKc_7hJh_Jd7d_8hQh_Ts6d_Qs7c_Qd6s_8c3d_JsAs() {
    assertEquals(
      "8c3d Ts6d 7hJh=Jd7d Qd6s Qs7c 8hQh JsAs",
      Solver.process("texas-holdem 2d4c4s5dKc 7hJh Jd7d 8hQh Ts6d Qs7c Qd6s 8c3d JsAs"));
  }

  @Test
  public void test_texas_holdem_386_2sJhJsKdTh_KsQs_6c4s_4hAd_8hKh_3h7h() {
    assertEquals(
      "6c4s 3h7h 4hAd 8hKh KsQs",
      Solver.process("texas-holdem 2sJhJsKdTh KsQs 6c4s 4hAd 8hKh 3h7h"));
  }

  @Test
  public void test_texas_holdem_387_2d3c4c4s9s_4hAh_4d5h_Ts8h_6h7s() {
    assertEquals(
      "6h7s Ts8h 4d5h 4hAh",
      Solver.process("texas-holdem 2d3c4c4s9s 4hAh 4d5h Ts8h 6h7s"));
  }

  @Test
  public void test_texas_holdem_388_2d7hAcJcKh_8dQh_4sTh_8s5s_7s4d_6s6h_5d9h_Kd9s_6c9d() {
    assertEquals(
      "8s5s 5d9h=6c9d 4sTh 8dQh 6s6h 7s4d Kd9s",
      Solver.process("texas-holdem 2d7hAcJcKh 8dQh 4sTh 8s5s 7s4d 6s6h 5d9h Kd9s 6c9d"));
  }

  @Test
  public void test_texas_holdem_389_3c5c9dJdQs_AcKh_8c5s_8h3h_JhJc_AdTd_6c2d_Qd8s_7d4c() {
    assertEquals(
      "6c2d 7d4c AdTd AcKh 8h3h 8c5s Qd8s JhJc",
      Solver.process("texas-holdem 3c5c9dJdQs AcKh 8c5s 8h3h JhJc AdTd 6c2d Qd8s 7d4c"));
  }

  @Test
  public void test_texas_holdem_390_3c4c4d5d5s_Qh3d_KhAh_7dQc_5h2d_7h8s() {
    assertEquals(
      "7h8s 7dQc=Qh3d KhAh 5h2d",
      Solver.process("texas-holdem 3c4c4d5d5s Qh3d KhAh 7dQc 5h2d 7h8s"));
  }

  @Test
  public void test_texas_holdem_391_3c3hAsJdQd_6dTc_4c3s_8sKh_QcQs_4d2c_9sQh() {
    assertEquals(
      "4d2c=6dTc 8sKh 9sQh 4c3s QcQs",
      Solver.process("texas-holdem 3c3hAsJdQd 6dTc 4c3s 8sKh QcQs 4d2c 9sQh"));
  }

  @Test
  public void test_texas_holdem_392_2d3h8sJhJs_JcAc_5d3d() {
    assertEquals(
      "5d3d JcAc",
      Solver.process("texas-holdem 2d3h8sJhJs JcAc 5d3d"));
  }

  @Test
  public void test_texas_holdem_393_6h8hAdKdTc_3s9h_6sTd() {
    assertEquals(
      "3s9h 6sTd",
      Solver.process("texas-holdem 6h8hAdKdTc 3s9h 6sTd"));
  }

  @Test
  public void test_texas_holdem_394_2d3s4h6cJd_2h7s_8s2s_TdQd_3h8h_AhJh_4cJc() {
    assertEquals(
      "TdQd 2h7s 8s2s 3h8h AhJh 4cJc",
      Solver.process("texas-holdem 2d3s4h6cJd 2h7s 8s2s TdQd 3h8h AhJh 4cJc"));
  }

  @Test
  public void test_texas_holdem_395_3c7h8sAdKd_8cTd_5h2s_3s9s_3dJs_5sTc_4hQh_As9c() {
    assertEquals(
      "5h2s 5sTc 4hQh 3s9s 3dJs 8cTd As9c",
      Solver.process("texas-holdem 3c7h8sAdKd 8cTd 5h2s 3s9s 3dJs 5sTc 4hQh As9c"));
  }

  @Test
  public void test_texas_holdem_396_3c5h6d7c9h_JdQc_TsJs_Ks4d_7s2d_8c8s_Kh7d_Kd6s_Jh3d_6cTc() {
    assertEquals(
      "TsJs JdQc Jh3d 6cTc Kd6s 7s2d Kh7d Ks4d 8c8s",
      Solver.process("texas-holdem 3c5h6d7c9h JdQc TsJs Ks4d 7s2d 8c8s Kh7d Kd6s Jh3d 6cTc"));
  }

  @Test
  public void test_texas_holdem_397_5c6d7dAhQs_9cTc_Qh7c_7sAc() {
    assertEquals(
      "9cTc Qh7c 7sAc",
      Solver.process("texas-holdem 5c6d7dAhQs 9cTc Qh7c 7sAc"));
  }

  @Test
  public void test_texas_holdem_398_2d6sKcKhQd_2cTh_5dKd_2sQc_3d4d_JdQs_5sAh_6d5h_Ad7d() {
    assertEquals(
      "3d4d 5sAh Ad7d 2cTh 6d5h 2sQc JdQs 5dKd",
      Solver.process("texas-holdem 2d6sKcKhQd 2cTh 5dKd 2sQc 3d4d JdQs 5sAh 6d5h Ad7d"));
  }

  @Test
  public void test_texas_holdem_399_4d5s8cJcJh_As5d_4cTd_4s9d_AcKh_4h3h_9sAh_Qc2c_QsTs() {
    assertEquals(
      "Qc2c QsTs 9sAh AcKh 4h3h 4s9d 4cTd As5d",
      Solver.process("texas-holdem 4d5s8cJcJh As5d 4cTd 4s9d AcKh 4h3h 9sAh Qc2c QsTs"));
  }

  @Test
  public void test_texas_holdem_400_2h5h7s8sJc_KdAh_2dAs() {
    assertEquals(
      "KdAh 2dAs",
      Solver.process("texas-holdem 2h5h7s8sJc KdAh 2dAs"));
  }

  @Test
  public void test_texas_holdem_401_2c3hAsQdTd_Ks2h_6s7d_4sJh_8s6h() {
    assertEquals(
      "6s7d 8s6h 4sJh Ks2h",
      Solver.process("texas-holdem 2c3hAsQdTd Ks2h 6s7d 4sJh 8s6h"));
  }

  @Test
  public void test_texas_holdem_402_5c6d9dAdKc_4dTh_5hJh_Ac4s_2d7d_7h3c_JcQs_4c2s_6s8c_Kd2h() {
    assertEquals(
      "4c2s 7h3c 4dTh JcQs 5hJh 6s8c Kd2h Ac4s 2d7d",
      Solver.process("texas-holdem 5c6d9dAdKc 4dTh 5hJh Ac4s 2d7d 7h3c JcQs 4c2s 6s8c Kd2h"));
  }

  @Test
  public void test_texas_holdem_403_2c8h9hJhKd_6s4d_6c9d_8dTd_7dJc_5h8c_3h5d_Ac7h_JdQc() {
    assertEquals(
      "3h5d 6s4d Ac7h 5h8c 8dTd 6c9d 7dJc JdQc",
      Solver.process("texas-holdem 2c8h9hJhKd 6s4d 6c9d 8dTd 7dJc 5h8c 3h5d Ac7h JdQc"));
  }

  @Test
  public void test_texas_holdem_404_3s6c8d9hJs_6sQh_Jd3c_4c9c_2c8h_8cTh_Qs2d_Td4d_KhJh() {
    assertEquals(
      "Td4d Qs2d 6sQh 2c8h 8cTh 4c9c KhJh Jd3c",
      Solver.process("texas-holdem 3s6c8d9hJs 6sQh Jd3c 4c9c 2c8h 8cTh Qs2d Td4d KhJh"));
  }

  @Test
  public void test_texas_holdem_405_6c7c9sKsTc_9c5h_3cJh_3s7h() {
    assertEquals(
      "3cJh 3s7h 9c5h",
      Solver.process("texas-holdem 6c7c9sKsTc 9c5h 3cJh 3s7h"));
  }

  @Test
  public void test_texas_holdem_406_7d8d8sJdJs_8h6c_4sJc_Qc2h_Tc4d() {
    assertEquals(
      "Tc4d Qc2h 8h6c 4sJc",
      Solver.process("texas-holdem 7d8d8sJdJs 8h6c 4sJc Qc2h Tc4d"));
  }

  @Test
  public void test_texas_holdem_407_3d7cKhKsTh_Td5d_Qh5c_5hQd_3cJh() {
    assertEquals(
      "5hQd=Qh5c 3cJh Td5d",
      Solver.process("texas-holdem 3d7cKhKsTh Td5d Qh5c 5hQd 3cJh"));
  }

  @Test
  public void test_texas_holdem_408_2d2h4hAdKh_Tc7s_7hJh_Th9d_2sKc_QsTd_9s9h_As3h_Qc9c_5d8d() {
    assertEquals(
      "5d8d Tc7s=Th9d Qc9c=QsTd 9s9h As3h 7hJh 2sKc",
      Solver.process("texas-holdem 2d2h4hAdKh Tc7s 7hJh Th9d 2sKc QsTd 9s9h As3h Qc9c 5d8d"));
  }

  @Test
  public void test_texas_holdem_409_4h5c5h7cKs_QcAd_9hKd_5sAs_JhTc_9c8h() {
    assertEquals(
      "9c8h JhTc QcAd 9hKd 5sAs",
      Solver.process("texas-holdem 4h5c5h7cKs QcAd 9hKd 5sAs JhTc 9c8h"));
  }

  @Test
  public void test_texas_holdem_410_5c6h8sAsKh_Th6c_4dKs() {
    assertEquals(
      "Th6c 4dKs",
      Solver.process("texas-holdem 5c6h8sAsKh Th6c 4dKs"));
  }

  @Test
  public void test_texas_holdem_411_3h6hJsQsTs_KhJc_3d5s_8h4d_2c3c_3s2h() {
    assertEquals(
      "8h4d 2c3c=3d5s=3s2h KhJc",
      Solver.process("texas-holdem 3h6hJsQsTs KhJc 3d5s 8h4d 2c3c 3s2h"));
  }

  @Test
  public void test_texas_holdem_412_3c5c6s8cKc_4h3s_ThJc_Kd2s() {
    assertEquals(
      "4h3s Kd2s ThJc",
      Solver.process("texas-holdem 3c5c6s8cKc 4h3s ThJc Kd2s"));
  }

  @Test
  public void test_texas_holdem_413_3h6d8cAdJh_Jc8s_2hTc_As4s_3d7h_3c2c() {
    assertEquals(
      "2hTc 3c2c=3d7h As4s Jc8s",
      Solver.process("texas-holdem 3h6d8cAdJh Jc8s 2hTc As4s 3d7h 3c2c"));
  }

  @Test
  public void test_texas_holdem_414_AcAhJdQhTc_4c5h_8cJh_8d7d_7h8s_JcKc_6c3h_8h7c_9c5d() {
    assertEquals(
      "4c5h=6c3h=7h8s=8d7d=8h7c=9c5d 8cJh JcKc",
      Solver.process("texas-holdem AcAhJdQhTc 4c5h 8cJh 8d7d 7h8s JcKc 6c3h 8h7c 9c5d"));
  }

  @Test
  public void test_texas_holdem_415_2d6d7sJsQs_2h7h_Ah3s() {
    assertEquals(
      "Ah3s 2h7h",
      Solver.process("texas-holdem 2d6d7sJsQs 2h7h Ah3s"));
  }

  @Test
  public void test_texas_holdem_416_4c4dJsKcKh_JdAd_Qs9c_6d8c_Kd9h() {
    assertEquals(
      "6d8c Qs9c JdAd Kd9h",
      Solver.process("texas-holdem 4c4dJsKcKh JdAd Qs9c 6d8c Kd9h"));
  }

  @Test
  public void test_texas_holdem_417_7h8cAdAhQs_QdTd_Js5c_Kd8s_9h6h_2hJd_2s5s_5d7d() {
    assertEquals(
      "2s5s 9h6h 2hJd=Js5c 5d7d Kd8s QdTd",
      Solver.process("texas-holdem 7h8cAdAhQs QdTd Js5c Kd8s 9h6h 2hJd 2s5s 5d7d"));
  }

  @Test
  public void test_texas_holdem_418_3h6d9sThTs_2s4h_8sAs() {
    assertEquals(
      "2s4h 8sAs",
      Solver.process("texas-holdem 3h6d9sThTs 2s4h 8sAs"));
  }

  @Test
  public void test_texas_holdem_419_4d8h8s9hKs_3sAh_6d3c() {
    assertEquals(
      "6d3c 3sAh",
      Solver.process("texas-holdem 4d8h8s9hKs 3sAh 6d3c"));
  }

  @Test
  public void test_texas_holdem_420_2s3h6s7s8d_Ks9c_7hKh_2c6h() {
    assertEquals(
      "Ks9c 7hKh 2c6h",
      Solver.process("texas-holdem 2s3h6s7s8d Ks9c 7hKh 2c6h"));
  }

  @Test
  public void test_texas_holdem_421_3h4s7s8hTh_4h3s_9hAh_2s9d_9sJh() {
    assertEquals(
      "2s9d 4h3s 9sJh 9hAh",
      Solver.process("texas-holdem 3h4s7s8hTh 4h3s 9hAh 2s9d 9sJh"));
  }

  @Test
  public void test_texas_holdem_422_4h5hAsKcTs_6d6s_4s9h() {
    assertEquals(
      "4s9h 6d6s",
      Solver.process("texas-holdem 4h5hAsKcTs 6d6s 4s9h"));
  }

  @Test
  public void test_texas_holdem_423_2s5h6s7cAh_Js2c_4h9s_9dTs() {
    assertEquals(
      "4h9s 9dTs Js2c",
      Solver.process("texas-holdem 2s5h6s7cAh Js2c 4h9s 9dTs"));
  }

  @Test
  public void test_texas_holdem_424_7c8d9sAsTs_4c4s_5cAh_Ac8s_Ad5s() {
    assertEquals(
      "4c4s 5cAh=Ad5s Ac8s",
      Solver.process("texas-holdem 7c8d9sAsTs 4c4s 5cAh Ac8s Ad5s"));
  }

  @Test
  public void test_texas_holdem_425_3s5c5hAsKc_8sAc_6cTs_4hJs_3c4d_9dQd_8hJh() {
    assertEquals(
      "6cTs 4hJs=8hJh 9dQd 3c4d 8sAc",
      Solver.process("texas-holdem 3s5c5hAsKc 8sAc 6cTs 4hJs 3c4d 9dQd 8hJh"));
  }

  @Test
  public void test_texas_holdem_426_8c9sJhQdQh_3hAh_2sJc_7c9h_6d9c_8dKc_QcAd() {
    assertEquals(
      "3hAh 8dKc 6d9c=7c9h 2sJc QcAd",
      Solver.process("texas-holdem 8c9sJhQdQh 3hAh 2sJc 7c9h 6d9c 8dKc QcAd"));
  }

  @Test
  public void test_texas_holdem_427_6d7s9sQcQs_7c6c_8d5h_QdAd_7hTd_3hQh() {
    assertEquals(
      "7c6c 7hTd 3hQh QdAd 8d5h",
      Solver.process("texas-holdem 6d7s9sQcQs 7c6c 8d5h QdAd 7hTd 3hQh"));
  }

  @Test
  public void test_texas_holdem_428_5h5s6sJsQd_AcKd_3cTd_2dJd_6c8s_4d7s() {
    assertEquals(
      "4d7s 3cTd AcKd 6c8s 2dJd",
      Solver.process("texas-holdem 5h5s6sJsQd AcKd 3cTd 2dJd 6c8s 4d7s"));
  }

  @Test
  public void test_texas_holdem_429_5sAdJdKcTd_Qd7s_8s2h_4cAs_Th4h_2c3d_JsKs_Ac5h_9h2s() {
    assertEquals(
      "2c3d 8s2h 9h2s Th4h 4cAs JsKs Ac5h Qd7s",
      Solver.process("texas-holdem 5sAdJdKcTd Qd7s 8s2h 4cAs Th4h 2c3d JsKs Ac5h 9h2s"));
  }

  @Test
  public void test_texas_holdem_430_3d5c9dJhJs_3hKc_6s8s_Ac8h_KhJc() {
    assertEquals(
      "6s8s Ac8h 3hKc KhJc",
      Solver.process("texas-holdem 3d5c9dJhJs 3hKc 6s8s Ac8h KhJc"));
  }

  @Test
  public void test_texas_holdem_431_4h5s6h8cKs_8hAd_5c9d_3hQd_9s2c_4c6s_6d3c_5d4s_Qh3d_Kd2s() {
    assertEquals(
      "9s2c 3hQd=Qh3d 5c9d 6d3c 8hAd Kd2s 5d4s 4c6s",
      Solver.process("texas-holdem 4h5s6h8cKs 8hAd 5c9d 3hQd 9s2c 4c6s 6d3c 5d4s Qh3d Kd2s"));
  }

  @Test
  public void test_texas_holdem_432_2c3s5s9cAs_Ks4d_JcJh_7h6d_4c7c_JdQd_8c3h_8d9s_AdTc() {
    assertEquals(
      "7h6d JdQd 8c3h 8d9s JcJh AdTc 4c7c=Ks4d",
      Solver.process("texas-holdem 2c3s5s9cAs Ks4d JcJh 7h6d 4c7c JdQd 8c3h 8d9s AdTc"));
  }

  @Test
  public void test_texas_holdem_433_7dAdAhJhQh_Ts6c_7hAc_Ks6s_3d8c_2c2h_9c8h_5sTc_2dAs() {
    assertEquals(
      "3d8c 9c8h 5sTc=Ts6c Ks6s 2c2h 2dAs 7hAc",
      Solver.process("texas-holdem 7dAdAhJhQh Ts6c 7hAc Ks6s 3d8c 2c2h 9c8h 5sTc 2dAs"));
  }

  @Test
  public void test_texas_holdem_434_4h8s9sAcQd_ThQs_6c9d_8hKc_3sKs_2s8d_JcJs_9cKd_Td4d_6h3c() {
    assertEquals(
      "6h3c 3sKs Td4d 2s8d 8hKc 6c9d 9cKd JcJs ThQs",
      Solver.process("texas-holdem 4h8s9sAcQd ThQs 6c9d 8hKc 3sKs 2s8d JcJs 9cKd Td4d 6h3c"));
  }

  @Test
  public void test_texas_holdem_435_5c5s6d7h7s_8d4d_5h8c_9h2d_Qh7d_AdAs_9s7c_4c8s_Jh6h() {
    assertEquals(
      "9h2d Jh6h AdAs 4c8s=8d4d 5h8c 9s7c=Qh7d",
      Solver.process("texas-holdem 5c5s6d7h7s 8d4d 5h8c 9h2d Qh7d AdAs 9s7c 4c8s Jh6h"));
  }

  @Test
  public void test_texas_holdem_436_4s8c9c9sAh_Qh2d_As4d_6s2s() {
    assertEquals(
      "6s2s Qh2d As4d",
      Solver.process("texas-holdem 4s8c9c9sAh Qh2d As4d 6s2s"));
  }

  @Test
  public void test_texas_holdem_437_2d5d6c6sKh_As2h_3d5c_Ts3s_7h8h_5h5s_3cJc_3h7s_Ac7d() {
    assertEquals(
      "3h7s 7h8h Ts3s 3cJc Ac7d As2h 3d5c 5h5s",
      Solver.process("texas-holdem 2d5d6c6sKh As2h 3d5c Ts3s 7h8h 5h5s 3cJc 3h7s Ac7d"));
  }

  @Test
  public void test_texas_holdem_438_2c3c4h8cJd_Qc3h_Kh8d() {
    assertEquals(
      "Qc3h Kh8d",
      Solver.process("texas-holdem 2c3c4h8cJd Qc3h Kh8d"));
  }

  @Test
  public void test_texas_holdem_439_3d5dAcQhTd_9d4s_2d8d_6s9h_8h3c_6d3s() {
    assertEquals(
      "9d4s 6s9h 6d3s=8h3c 2d8d",
      Solver.process("texas-holdem 3d5dAcQhTd 9d4s 2d8d 6s9h 8h3c 6d3s"));
  }

  @Test
  public void test_texas_holdem_440_3c8sKcQhTc_4c5d_Ac2s_9c3d_6hJd_2dAd_4dAs_7h4h_2h6s() {
    assertEquals(
      "4c5d 2h6s 7h4h 6hJd 2dAd=4dAs=Ac2s 9c3d",
      Solver.process("texas-holdem 3c8sKcQhTc 4c5d Ac2s 9c3d 6hJd 2dAd 4dAs 7h4h 2h6s"));
  }

  @Test
  public void test_texas_holdem_441_2d2h3hJdJh_3d5s_Ts8h_KsJc_3s2c() {
    assertEquals(
      "Ts8h 3d5s 3s2c KsJc",
      Solver.process("texas-holdem 2d2h3hJdJh 3d5s Ts8h KsJc 3s2c"));
  }

  @Test
  public void test_texas_holdem_442_2c3c5s6sTd_5c2d_5dAh_4cKh_8d6h_2s6c_4s9h_6dKc_Jh3s_QsQh() {
    assertEquals(
      "Jh3s 5dAh 8d6h 6dKc QsQh 5c2d 2s6c 4cKh=4s9h",
      Solver.process("texas-holdem 2c3c5s6sTd 5c2d 5dAh 4cKh 8d6h 2s6c 4s9h 6dKc Jh3s QsQh"));
  }

  @Test
  public void test_texas_holdem_443_3s5sJdJsTc_Td8h_JcKh() {
    assertEquals(
      "Td8h JcKh",
      Solver.process("texas-holdem 3s5sJdJsTc Td8h JcKh"));
  }

  @Test
  public void test_texas_holdem_444_3s5c6s9sAd_2d9h_Kh2s_8c5h_3h4c_7cAs_QhAc_TcKs_7s3d_Ts7d() {
    assertEquals(
      "Ts7d Kh2s TcKs 3h4c 7s3d 8c5h 2d9h 7cAs QhAc",
      Solver.process("texas-holdem 3s5c6s9sAd 2d9h Kh2s 8c5h 3h4c 7cAs QhAc TcKs 7s3d Ts7d"));
  }

  @Test
  public void test_texas_holdem_445_4h8c9hAdQd_5s5h_Ts9s() {
    assertEquals(
      "5s5h Ts9s",
      Solver.process("texas-holdem 4h8c9hAdQd 5s5h Ts9s"));
  }

  @Test
  public void test_texas_holdem_446_3d5d9dQsTc_4h7h_Ad6s_AcJh_2c8s_7s8d_4c6c() {
    assertEquals(
      "4c6c 4h7h 2c8s 7s8d Ad6s AcJh",
      Solver.process("texas-holdem 3d5d9dQsTc 4h7h Ad6s AcJh 2c8s 7s8d 4c6c"));
  }

  @Test
  public void test_texas_holdem_447_3cJhKdQhTh_5d3d_9h9c_6s7c_QsQc() {
    assertEquals(
      "6s7c 5d3d QsQc 9h9c",
      Solver.process("texas-holdem 3cJhKdQhTh 5d3d 9h9c 6s7c QsQc"));
  }

  @Test
  public void test_texas_holdem_448_4h7dKcKdTh_QhTs_Ad2h_AsQs_3sTd() {
    assertEquals(
      "Ad2h AsQs 3sTd QhTs",
      Solver.process("texas-holdem 4h7dKcKdTh QhTs Ad2h AsQs 3sTd"));
  }

  @Test
  public void test_texas_holdem_449_2c2d9cAdQc_4hQs_7c2s_5s7h_9dAs_7dJs_5hQh_5dTd_TsTc_8h9h() {
    assertEquals(
      "5s7h 5dTd 7dJs 8h9h TsTc 4hQs=5hQh 9dAs 7c2s",
      Solver.process("texas-holdem 2c2d9cAdQc 4hQs 7c2s 5s7h 9dAs 7dJs 5hQh 5dTd TsTc 8h9h"));
  }

  @Test
  public void test_texas_holdem_450_2h6s9cKdQc_Qs6h_4d6d_Th9d_Jc8d_9hAh_KhJd_2c2d_3c3d_5c9s() {
    assertEquals(
      "Jc8d 3c3d 4d6d 5c9s Th9d 9hAh KhJd Qs6h 2c2d",
      Solver.process("texas-holdem 2h6s9cKdQc Qs6h 4d6d Th9d Jc8d 9hAh KhJd 2c2d 3c3d 5c9s"));
  }

  @Test
  public void test_texas_holdem_451_6d7hJdKhQd_3s3d_ThAc_2c2d_8c6c_2hKc_5hKs() {
    assertEquals(
      "2c2d 3s3d 8c6c 2hKc=5hKs ThAc",
      Solver.process("texas-holdem 6d7hJdKhQd 3s3d ThAc 2c2d 8c6c 2hKc 5hKs"));
  }

  @Test
  public void test_texas_holdem_452_2c4h6dKcQc_2dTc_Kh6h_9s2h_6s7s_3c6c_QdJh_5d9c() {
    assertEquals(
      "5d9c 9s2h 2dTc 6s7s QdJh Kh6h 3c6c",
      Solver.process("texas-holdem 2c4h6dKcQc 2dTc Kh6h 9s2h 6s7s 3c6c QdJh 5d9c"));
  }

  @Test
  public void test_texas_holdem_453_3c7h9cAdQh_9s4c_JdTd() {
    assertEquals(
      "JdTd 9s4c",
      Solver.process("texas-holdem 3c7h9cAdQh 9s4c JdTd"));
  }

  @Test
  public void test_texas_holdem_454_2c6h7h9sKh_4sTs_Js7d_4cQs_Jd5s_7sAc_Qd6c_8c8d() {
    assertEquals(
      "4sTs Jd5s 4cQs Qd6c Js7d 7sAc 8c8d",
      Solver.process("texas-holdem 2c6h7h9sKh 4sTs Js7d 4cQs Jd5s 7sAc Qd6c 8c8d"));
  }

  @Test
  public void test_texas_holdem_455_3d4d7hAdTd_2s7c_2cAs_KdQs_3h5s() {
    assertEquals(
      "3h5s 2s7c 2cAs KdQs",
      Solver.process("texas-holdem 3d4d7hAdTd 2s7c 2cAs KdQs 3h5s"));
  }

  @Test
  public void test_texas_holdem_456_2c4dAcJdTs_2dKd_Qc6d() {
    assertEquals(
      "Qc6d 2dKd",
      Solver.process("texas-holdem 2c4dAcJdTs 2dKd Qc6d"));
  }

  @Test
  public void test_texas_holdem_457_8c8s9hAhTh_KsTc_4dTd_2hAd_6c6d_Jc5h_3s9c_7cQs_2d7s_Qh8h() {
    assertEquals(
      "2d7s Jc5h 7cQs 6c6d 3s9c 4dTd=KsTc 2hAd Qh8h",
      Solver.process("texas-holdem 8c8s9hAhTh KsTc 4dTd 2hAd 6c6d Jc5h 3s9c 7cQs 2d7s Qh8h"));
  }

  @Test
  public void test_texas_holdem_458_2d5c8c8hJc_Ad9s_6c8s_Td7c_7d2c_Qc9d_6h4h_KsQd_5hJh_As4d() {
    assertEquals(
      "6h4h Td7c Qc9d KsQd As4d Ad9s 7d2c 5hJh 6c8s",
      Solver.process("texas-holdem 2d5c8c8hJc Ad9s 6c8s Td7c 7d2c Qc9d 6h4h KsQd 5hJh As4d"));
  }

  @Test
  public void test_texas_holdem_459_4s5sJsKsQc_6dAc_7sQd_5hJh_2c9c_8c2s() {
    assertEquals(
      "2c9c 6dAc 5hJh 8c2s 7sQd",
      Solver.process("texas-holdem 4s5sJsKsQc 6dAc 7sQd 5hJh 2c9c 8c2s"));
  }

  @Test
  public void test_texas_holdem_460_2h3hAcAsKd_4d5d_Jh7d_9d5s_5h3d_TsTc_7h7s_6dAh_8h8s() {
    assertEquals(
      "9d5s Jh7d 5h3d 7h7s 8h8s TsTc 6dAh 4d5d",
      Solver.process("texas-holdem 2h3hAcAsKd 4d5d Jh7d 9d5s 5h3d TsTc 7h7s 6dAh 8h8s"));
  }

  @Test
  public void test_texas_holdem_461_2h3d8d9dTd_As4s_TcTh_9h9c_3c7h_7d5s() {
    assertEquals(
      "As4s 3c7h 9h9c TcTh 7d5s",
      Solver.process("texas-holdem 2h3d8d9dTd As4s TcTh 9h9c 3c7h 7d5s"));
  }

  @Test
  public void test_texas_holdem_462_3d4d5d9sTc_5cAd_Js4h_9c7s_Kh2c() {
    assertEquals(
      "Kh2c Js4h 5cAd 9c7s",
      Solver.process("texas-holdem 3d4d5d9sTc 5cAd Js4h 9c7s Kh2c"));
  }

  @Test
  public void test_texas_holdem_463_2d6cJdQdQs_9hAd_5h3c_5sJs_2c4h_Td3d_Ac7s_3h5c() {
    assertEquals(
      "3h5c=5h3c Ac7s 9hAd 2c4h 5sJs Td3d",
      Solver.process("texas-holdem 2d6cJdQdQs 9hAd 5h3c 5sJs 2c4h Td3d Ac7s 3h5c"));
  }

  @Test
  public void test_texas_holdem_464_2h4hJcQsTc_Ts6s_9hKc_8h8d_Jh7c_3c9c() {
    assertEquals(
      "3c9c 8h8d Ts6s Jh7c 9hKc",
      Solver.process("texas-holdem 2h4hJcQsTc Ts6s 9hKc 8h8d Jh7c 3c9c"));
  }

  @Test
  public void test_texas_holdem_465_4s5c7h9cTd_KcQd_7s8h_8cAc_Kh7c_7dJs_Jd3c_Jc2d_2sKs_5sAs() {
    assertEquals(
      "Jc2d=Jd3c 2sKs KcQd 8cAc 5sAs 7s8h 7dJs Kh7c",
      Solver.process("texas-holdem 4s5c7h9cTd KcQd 7s8h 8cAc Kh7c 7dJs Jd3c Jc2d 2sKs 5sAs"));
  }

  @Test
  public void test_texas_holdem_466_2c5h8cJcTd_6hJh_3sAh() {
    assertEquals(
      "3sAh 6hJh",
      Solver.process("texas-holdem 2c5h8cJcTd 6hJh 3sAh"));
  }

  @Test
  public void test_texas_holdem_467_4c4s5dAcKs_Qs2c_4d9s_8c8d_5c4h_6dAd_3sJd_Kh9c() {
    assertEquals(
      "3sJd Qs2c 8c8d Kh9c 6dAd 4d9s 5c4h",
      Solver.process("texas-holdem 4c4s5dAcKs Qs2c 4d9s 8c8d 5c4h 6dAd 3sJd Kh9c"));
  }

  @Test
  public void test_texas_holdem_468_5s6s7dJsTh_3s8h_4s4d_Qh8c_2dJd_3cAs_Qc3d_Jh6d() {
    assertEquals(
      "3s8h Qc3d Qh8c 3cAs 4s4d 2dJd Jh6d",
      Solver.process("texas-holdem 5s6s7dJsTh 3s8h 4s4d Qh8c 2dJd 3cAs Qc3d Jh6d"));
  }

  @Test
  public void test_texas_holdem_469_2c4s8sAcKc_3sJs_Jh6c() {
    assertEquals(
      "3sJs Jh6c",
      Solver.process("texas-holdem 2c4s8sAcKc 3sJs Jh6c"));
  }

  @Test
  public void test_texas_holdem_470_2c6d6hJsKs_Td3d_2s7s() {
    assertEquals(
      "Td3d 2s7s",
      Solver.process("texas-holdem 2c6d6hJsKs Td3d 2s7s"));
  }

  @Test
  public void test_texas_holdem_471_5s7c7s9dQc_9c8c_5h6c_2s2h() {
    assertEquals(
      "2s2h 5h6c 9c8c",
      Solver.process("texas-holdem 5s7c7s9dQc 9c8c 5h6c 2s2h"));
  }

  @Test
  public void test_texas_holdem_472_2d8dJhQcQh_5d7d_AsTh_Js7s_7h6h_3hAd_3d2h() {
    assertEquals(
      "5d7d=7h6h 3hAd AsTh 3d2h Js7s",
      Solver.process("texas-holdem 2d8dJhQcQh 5d7d AsTh Js7s 7h6h 3hAd 3d2h"));
  }

  @Test
  public void test_texas_holdem_473_2c3sAsJdQh_Th3d_6h6c_4d9c_3cTd_QcAd_5hTs_QdKc() {
    assertEquals(
      "4d9c 5hTs 3cTd=Th3d 6h6c QdKc QcAd",
      Solver.process("texas-holdem 2c3sAsJdQh Th3d 6h6c 4d9c 3cTd QcAd 5hTs QdKc"));
  }

  @Test
  public void test_texas_holdem_474_3c5h9hQcTs_4sTh_4hAs_3s3h_7cTd_Qh6c() {
    assertEquals(
      "4hAs 4sTh 7cTd Qh6c 3s3h",
      Solver.process("texas-holdem 3c5h9hQcTs 4sTh 4hAs 3s3h 7cTd Qh6c"));
  }

  @Test
  public void test_texas_holdem_475_2d5h6h9cQd_3cKs_9hAs_6c2s_6s4s_2cAc_Ts7s() {
    assertEquals(
      "Ts7s 3cKs 2cAc 6s4s 9hAs 6c2s",
      Solver.process("texas-holdem 2d5h6h9cQd 3cKs 9hAs 6c2s 6s4s 2cAc Ts7s"));
  }

  @Test
  public void test_texas_holdem_476_4c4h4s6s8h_Jh2d_2s2h_Js5c_Kh7s() {
    assertEquals(
      "Jh2d=Js5c Kh7s 2s2h",
      Solver.process("texas-holdem 4c4h4s6s8h Jh2d 2s2h Js5c Kh7s"));
  }

  @Test
  public void test_texas_holdem_477_5c5hAdAhTh_JdJs_2cKc_3c8s_9c5s() {
    assertEquals(
      "3c8s 2cKc JdJs 9c5s",
      Solver.process("texas-holdem 5c5hAdAhTh JdJs 2cKc 3c8s 9c5s"));
  }

  @Test
  public void test_texas_holdem_478_4d5hAcKhQd_9dKc_5s8h_2d7d_9s3h_2h3s_4cTd_2cAs_ThJd() {
    assertEquals(
      "2d7d 9s3h 4cTd 5s8h 9dKc 2cAs 2h3s ThJd",
      Solver.process("texas-holdem 4d5hAcKhQd 9dKc 5s8h 2d7d 9s3h 2h3s 4cTd 2cAs ThJd"));
  }

  @Test
  public void test_texas_holdem_479_5d8h9sAdKs_2sKc_KhJh_AsTc() {
    assertEquals(
      "2sKc KhJh AsTc",
      Solver.process("texas-holdem 5d8h9sAdKs 2sKc KhJh AsTc"));
  }

  @Test
  public void test_texas_holdem_480_3c6d7dAcTd_Qs3d_7h4d() {
    assertEquals(
      "Qs3d 7h4d",
      Solver.process("texas-holdem 3c6d7dAcTd Qs3d 7h4d"));
  }

  @Test
  public void test_texas_holdem_481_5d8sJcKcQd_4c9c_Ts7d_9h2d_Qh3c_9dKd_3hTd_4d2s() {
    assertEquals(
      "4d2s 4c9c=9h2d 3hTd=Ts7d Qh3c 9dKd",
      Solver.process("texas-holdem 5d8sJcKcQd 4c9c Ts7d 9h2d Qh3c 9dKd 3hTd 4d2s"));
  }

  @Test
  public void test_texas_holdem_482_5sAdAsKcQh_Qc3s_Th6c() {
    assertEquals(
      "Th6c Qc3s",
      Solver.process("texas-holdem 5sAdAsKcQh Qc3s Th6c"));
  }

  @Test
  public void test_texas_holdem_483_2s8s9cJhKd_9h6s_4hQd_2c8d_3c6c_9sKc_3s6h_5sQs_2hTs() {
    assertEquals(
      "3c6c=3s6h 4hQd=5sQs 2hTs 9h6s 2c8d 9sKc",
      Solver.process("texas-holdem 2s8s9cJhKd 9h6s 4hQd 2c8d 3c6c 9sKc 3s6h 5sQs 2hTs"));
  }

  @Test
  public void test_texas_holdem_484_4s8dKhQdQh_Th2s_3d7d_9sKs_4hAc() {
    assertEquals(
      "3d7d Th2s 4hAc 9sKs",
      Solver.process("texas-holdem 4s8dKhQdQh Th2s 3d7d 9sKs 4hAc"));
  }

  @Test
  public void test_texas_holdem_485_8hAhKdQhTc_4dKh_9c4s_5c6s_6d6c_TdTs_Jh9s_8d9d_7h5s_7s5d() {
    assertEquals(
      "5c6s=7h5s=7s5d 9c4s 6d6c 8d9d 4dKh TdTs Jh9s",
      Solver.process("texas-holdem 8hAhKdQhTc 4dKh 9c4s 5c6s 6d6c TdTs Jh9s 8d9d 7h5s 7s5d"));
  }

  @Test
  public void test_texas_holdem_486_4d7cAdQcQd_QsJc_Td4s_KdKc_8s9c_7d9d_Ah7s() {
    assertEquals(
      "8s9c Td4s KdKc Ah7s QsJc 7d9d",
      Solver.process("texas-holdem 4d7cAdQcQd QsJc Td4s KdKc 8s9c 7d9d Ah7s"));
  }

  @Test
  public void test_texas_holdem_487_3c5s6cKdTc_Ks6d_8sAd_7sJs_ThKh() {
    assertEquals(
      "7sJs 8sAd Ks6d ThKh",
      Solver.process("texas-holdem 3c5s6cKdTc Ks6d 8sAd 7sJs ThKh"));
  }

  @Test
  public void test_texas_holdem_488_2d4s5cQdTd_Kc3d_7cKd() {
    assertEquals(
      "Kc3d 7cKd",
      Solver.process("texas-holdem 2d4s5cQdTd Kc3d 7cKd"));
  }

  @Test
  public void test_texas_holdem_489_6c7d9cKcTs_2hAs_Qc9h() {
    assertEquals(
      "2hAs Qc9h",
      Solver.process("texas-holdem 6c7d9cKcTs 2hAs Qc9h"));
  }

  @Test
  public void test_texas_holdem_490_2s3c4c5cAs_5d7s_Qc9h_Jc5s_8s8h() {
    assertEquals(
      "5d7s=8s8h=Jc5s=Qc9h",
      Solver.process("texas-holdem 2s3c4c5cAs 5d7s Qc9h Jc5s 8s8h"));
  }

  @Test
  public void test_texas_holdem_491_3c5d5s8h8s_AdKd_Ah7h_3hTs_TcJc_7c6h_5c9h() {
    assertEquals(
      "7c6h 3hTs TcJc AdKd=Ah7h 5c9h",
      Solver.process("texas-holdem 3c5d5s8h8s AdKd Ah7h 3hTs TcJc 7c6h 5c9h"));
  }

  @Test
  public void test_texas_holdem_492_5s6d9sAcTh_Ah7c_Ks5h_Jc3h_Js2d() {
    assertEquals(
      "Jc3h=Js2d Ks5h Ah7c",
      Solver.process("texas-holdem 5s6d9sAcTh Ah7c Ks5h Jc3h Js2d"));
  }

  @Test
  public void test_texas_holdem_493_2d4h4s7dTd_8cQd_Jc6d_8s6s_9s6c_Ac5d_8dAh_9c4c() {
    assertEquals(
      "8s6s 9s6c Jc6d 8cQd Ac5d 8dAh 9c4c",
      Solver.process("texas-holdem 2d4h4s7dTd 8cQd Jc6d 8s6s 9s6c Ac5d 8dAh 9c4c"));
  }

  @Test
  public void test_texas_holdem_494_3d6s7c9cJc_5dKc_KsTd_KdJh_8d3h_9h2s_2cQc() {
    assertEquals(
      "5dKc KsTd 8d3h 9h2s KdJh 2cQc",
      Solver.process("texas-holdem 3d6s7c9cJc 5dKc KsTd KdJh 8d3h 9h2s 2cQc"));
  }

  @Test
  public void test_texas_holdem_495_3c3h4d8cJh_AcJd_9c9d_6c2d_8sTh_As6s_2c2s_Kc4s_3sAd() {
    assertEquals(
      "6c2d As6s 2c2s Kc4s 8sTh 9c9d AcJd 3sAd",
      Solver.process("texas-holdem 3c3h4d8cJh AcJd 9c9d 6c2d 8sTh As6s 2c2s Kc4s 3sAd"));
  }

  @Test
  public void test_texas_holdem_496_7s8h9dJdTh_Ah8c_QcKd_Kc2s_4h3c_5d3h_5sTs() {
    assertEquals(
      "4h3c=5d3h=5sTs=Ah8c=Kc2s QcKd",
      Solver.process("texas-holdem 7s8h9dJdTh Ah8c QcKd Kc2s 4h3c 5d3h 5sTs"));
  }

  @Test
  public void test_texas_holdem_497_4d7h8sJdTh_9dJh_2c3h_2sAd_As3c() {
    assertEquals(
      "2c3h 2sAd=As3c 9dJh",
      Solver.process("texas-holdem 4d7h8sJdTh 9dJh 2c3h 2sAd As3c"));
  }

  @Test
  public void test_texas_holdem_498_7c9hKsTcTh_Ad3s_9dJh_9cQh_6hAc_6c4h_Kd5d_4d7h() {
    assertEquals(
      "6c4h 6hAc=Ad3s 4d7h 9cQh=9dJh Kd5d",
      Solver.process("texas-holdem 7c9hKsTcTh Ad3s 9dJh 9cQh 6hAc 6c4h Kd5d 4d7h"));
  }

  @Test
  public void test_texas_holdem_499_2c2h3dAsTs_AhQd_7s3c() {
    assertEquals(
      "7s3c AhQd",
      Solver.process("texas-holdem 2c2h3dAsTs AhQd 7s3c"));
  }

}
