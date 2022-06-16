
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver21HiddenTest {


  @Test
  public void test_texas_holdem_5250_2d3d4d7sTh_5cQs_7h6d_8s3s_KcAh_3cQc_TcAd_4h9s_5d7d() {
    assertEquals(
      "5cQs KcAh 8s3s 3cQc 4h9s 7h6d TcAd 5d7d",
      Solver.process("texas-holdem 2d3d4d7sTh 5cQs 7h6d 8s3s KcAh 3cQc TcAd 4h9s 5d7d"));
  }

  @Test
  public void test_texas_holdem_5251_6s7d9cJhJs_8h5s_Qd7s_Qh9d() {
    assertEquals(
      "Qd7s Qh9d 8h5s",
      Solver.process("texas-holdem 6s7d9cJhJs 8h5s Qd7s Qh9d"));
  }

  @Test
  public void test_texas_holdem_5252_2d3c3d4hAd_JhJs_Kh6s_7s8h() {
    assertEquals(
      "7s8h Kh6s JhJs",
      Solver.process("texas-holdem 2d3c3d4hAd JhJs Kh6s 7s8h"));
  }

  @Test
  public void test_texas_holdem_5253_3s5hJcKdTh_2s7c_Ah5c_6c5d_8cTs_7d4c_9hTd() {
    assertEquals(
      "2s7c=7d4c 6c5d Ah5c 8cTs 9hTd",
      Solver.process("texas-holdem 3s5hJcKdTh 2s7c Ah5c 6c5d 8cTs 7d4c 9hTd"));
  }

  @Test
  public void test_texas_holdem_5254_2h4c8sAhTd_2dTc_Jc7d() {
    assertEquals(
      "Jc7d 2dTc",
      Solver.process("texas-holdem 2h4c8sAhTd 2dTc Jc7d"));
  }

  @Test
  public void test_texas_holdem_5255_3d6d6s9hQs_QcAd_7sKc_As8s() {
    assertEquals(
      "7sKc As8s QcAd",
      Solver.process("texas-holdem 3d6d6s9hQs QcAd 7sKc As8s"));
  }

  @Test
  public void test_texas_holdem_5256_3d4d8dQcTs_8sKs_2c7c_6h3s_JcTd_Tc2h_AcAd() {
    assertEquals(
      "2c7c 6h3s 8sKs Tc2h JcTd AcAd",
      Solver.process("texas-holdem 3d4d8dQcTs 8sKs 2c7c 6h3s JcTd Tc2h AcAd"));
  }

  @Test
  public void test_texas_holdem_5257_2h2s8d9dTs_7hKs_3d9h_3s4s_9sQs_6s5c_Td8h() {
    assertEquals(
      "3s4s=6s5c 7hKs 3d9h 9sQs Td8h",
      Solver.process("texas-holdem 2h2s8d9dTs 7hKs 3d9h 3s4s 9sQs 6s5c Td8h"));
  }

  @Test
  public void test_texas_holdem_5258_4c6h7d7hKc_Qs2h_Jh5c() {
    assertEquals(
      "Jh5c Qs2h",
      Solver.process("texas-holdem 4c6h7d7hKc Qs2h Jh5c"));
  }

  @Test
  public void test_texas_holdem_5259_2d2h7d7hKc_2s6c_Jd8s_9d3d_AhKs() {
    assertEquals(
      "9d3d=Jd8s AhKs 2s6c",
      Solver.process("texas-holdem 2d2h7d7hKc 2s6c Jd8s 9d3d AhKs"));
  }

  @Test
  public void test_texas_holdem_5260_4d4s9cKcTs_AdQh_8d2h() {
    assertEquals(
      "8d2h AdQh",
      Solver.process("texas-holdem 4d4s9cKcTs AdQh 8d2h"));
  }

  @Test
  public void test_texas_holdem_5261_3c5s8sKsQh_4s9d_6dKd_5hTc_9cJc_AcQd_Th2c_Ah5d() {
    assertEquals(
      "4s9d Th2c 9cJc 5hTc Ah5d AcQd 6dKd",
      Solver.process("texas-holdem 3c5s8sKsQh 4s9d 6dKd 5hTc 9cJc AcQd Th2c Ah5d"));
  }

  @Test
  public void test_texas_holdem_5262_3d4s6hQcQh_Ts7s_Kd2c() {
    assertEquals(
      "Ts7s Kd2c",
      Solver.process("texas-holdem 3d4s6hQcQh Ts7s Kd2c"));
  }

  @Test
  public void test_texas_holdem_5263_5h6c8sKhTh_Qh3d_4d3c_3h5c_9hJs_6s8d_Ah9s_4s8h_4c2s_JdTs() {
    assertEquals(
      "4c2s=4d3c 9hJs Qh3d Ah9s 3h5c 4s8h JdTs 6s8d",
      Solver.process("texas-holdem 5h6c8sKhTh Qh3d 4d3c 3h5c 9hJs 6s8d Ah9s 4s8h 4c2s JdTs"));
  }

  @Test
  public void test_texas_holdem_5264_6hAhJsKdQc_QhQs_Jh4h_7d7h_6cAd_4dTh_6d5d_Ks9d_8c9h_Ac7c() {
    assertEquals(
      "8c9h 6d5d 7d7h Jh4h Ks9d Ac7c 6cAd QhQs 4dTh",
      Solver.process("texas-holdem 6hAhJsKdQc QhQs Jh4h 7d7h 6cAd 4dTh 6d5d Ks9d 8c9h Ac7c"));
  }

  @Test
  public void test_texas_holdem_5265_2h3h6dKdTc_7s4c_8sJc_8c4s_9dJs_2d2s_4h3d_Ah8h_6cKs() {
    assertEquals(
      "7s4c 8c4s 8sJc 9dJs Ah8h 4h3d 6cKs 2d2s",
      Solver.process("texas-holdem 2h3h6dKdTc 7s4c 8sJc 8c4s 9dJs 2d2s 4h3d Ah8h 6cKs"));
  }

  @Test
  public void test_texas_holdem_5266_3s4c4dAsQd_5sJs_3h9h_2h5d_KcJh_9cAc_Jc2d_5hTh_4hTc() {
    assertEquals(
      "5hTh 5sJs=Jc2d KcJh 3h9h 9cAc 4hTc 2h5d",
      Solver.process("texas-holdem 3s4c4dAsQd 5sJs 3h9h 2h5d KcJh 9cAc Jc2d 5hTh 4hTc"));
  }

  @Test
  public void test_texas_holdem_5267_3h4hKsTcTs_Jd6d_Kh4c_Jh8s_Ac7h_Td5d() {
    assertEquals(
      "Jd6d Jh8s Ac7h Kh4c Td5d",
      Solver.process("texas-holdem 3h4hKsTcTs Jd6d Kh4c Jh8s Ac7h Td5d"));
  }

  @Test
  public void test_texas_holdem_5268_3h5h7cAhTd_8c8d_2h9s_6c6h() {
    assertEquals(
      "2h9s 6c6h 8c8d",
      Solver.process("texas-holdem 3h5h7cAhTd 8c8d 2h9s 6c6h"));
  }

  @Test
  public void test_texas_holdem_5269_6d9dJcTcTd_4h8c_Qc8d_4d4s_9hKs_JsAd_2c3c_Th2h_7d9c() {
    assertEquals(
      "2c3c 4h8c 4d4s 7d9c 9hKs JsAd Th2h Qc8d",
      Solver.process("texas-holdem 6d9dJcTcTd 4h8c Qc8d 4d4s 9hKs JsAd 2c3c Th2h 7d9c"));
  }

  @Test
  public void test_texas_holdem_5270_5d8hAsKsTd_5s4d_5c2h_7dKd() {
    assertEquals(
      "5c2h=5s4d 7dKd",
      Solver.process("texas-holdem 5d8hAsKsTd 5s4d 5c2h 7dKd"));
  }

  @Test
  public void test_texas_holdem_5271_7d8sAhJcQc_Ks4s_6h4d_9h5s_2h8d_4c8c_Td6d_8hQs() {
    assertEquals(
      "6h4d 9h5s Td6d Ks4s 2h8d=4c8c 8hQs",
      Solver.process("texas-holdem 7d8sAhJcQc Ks4s 6h4d 9h5s 2h8d 4c8c Td6d 8hQs"));
  }

  @Test
  public void test_texas_holdem_5272_4d6s7c9c9h_8hAd_Ac6c_3d9s_KhAs_Ts9d_8d2h_JhTc() {
    assertEquals(
      "8d2h JhTc 8hAd KhAs Ac6c 3d9s Ts9d",
      Solver.process("texas-holdem 4d6s7c9c9h 8hAd Ac6c 3d9s KhAs Ts9d 8d2h JhTc"));
  }

  @Test
  public void test_texas_holdem_5273_2dAdKdQcTd_9c3c_8sQs_2sJh() {
    assertEquals(
      "9c3c 8sQs 2sJh",
      Solver.process("texas-holdem 2dAdKdQcTd 9c3c 8sQs 2sJh"));
  }

  @Test
  public void test_texas_holdem_5274_7d8d8h9sAc_2c3s_Ad5c_9dJs_Qh4s() {
    assertEquals(
      "2c3s Qh4s 9dJs Ad5c",
      Solver.process("texas-holdem 7d8d8h9sAc 2c3s Ad5c 9dJs Qh4s"));
  }

  @Test
  public void test_texas_holdem_5275_4h9dAcQdTh_Kh2s_As4d_4c7d_9s3h_AdTs() {
    assertEquals(
      "Kh2s 4c7d 9s3h As4d AdTs",
      Solver.process("texas-holdem 4h9dAcQdTh Kh2s As4d 4c7d 9s3h AdTs"));
  }

  @Test
  public void test_texas_holdem_5276_2s4h9sAhJh_2c3d_8cAd_5c6s() {
    assertEquals(
      "5c6s 2c3d 8cAd",
      Solver.process("texas-holdem 2s4h9sAhJh 2c3d 8cAd 5c6s"));
  }

  @Test
  public void test_texas_holdem_5277_3d4c6sJcQh_ThKs_4h2c_Qc8s_Js5s_Ts8d_Qd5d_Tc5c() {
    assertEquals(
      "Tc5c Ts8d ThKs 4h2c Js5s Qd5d Qc8s",
      Solver.process("texas-holdem 3d4c6sJcQh ThKs 4h2c Qc8s Js5s Ts8d Qd5d Tc5c"));
  }

  @Test
  public void test_texas_holdem_5278_5d6s8cKcKs_Kh2c_3d5c_2sQh() {
    assertEquals(
      "2sQh 3d5c Kh2c",
      Solver.process("texas-holdem 5d6s8cKcKs Kh2c 3d5c 2sQh"));
  }

  @Test
  public void test_texas_holdem_5279_3c3s9dQhTd_7hTs_7s8d() {
    assertEquals(
      "7s8d 7hTs",
      Solver.process("texas-holdem 3c3s9dQhTd 7hTs 7s8d"));
  }

  @Test
  public void test_texas_holdem_5280_3c6s7h8hKs_Jc6h_Ad4h_Ts5h_9s7d_4dTh_5cTc() {
    assertEquals(
      "4dTh=5cTc=Ts5h Ad4h Jc6h 9s7d",
      Solver.process("texas-holdem 3c6s7h8hKs Jc6h Ad4h Ts5h 9s7d 4dTh 5cTc"));
  }

  @Test
  public void test_texas_holdem_5281_2c3d8dJdQc_QdAh_5c5s_5h6h_JsJh_9h9d() {
    assertEquals(
      "5h6h 5c5s 9h9d QdAh JsJh",
      Solver.process("texas-holdem 2c3d8dJdQc QdAh 5c5s 5h6h JsJh 9h9d"));
  }

  @Test
  public void test_texas_holdem_5282_2c6dAhKdTh_KsJs_8h9d_5dAs_6h4c_9h5s_TcKh_Td8s_Jh4d() {
    assertEquals(
      "9h5s 8h9d Jh4d 6h4c Td8s KsJs 5dAs TcKh",
      Solver.process("texas-holdem 2c6dAhKdTh KsJs 8h9d 5dAs 6h4c 9h5s TcKh Td8s Jh4d"));
  }

  @Test
  public void test_texas_holdem_5283_3c6c9h9sKh_TcQs_Kc6h() {
    assertEquals(
      "TcQs Kc6h",
      Solver.process("texas-holdem 3c6c9h9sKh TcQs Kc6h"));
  }

  @Test
  public void test_texas_holdem_5284_3h5d9sKhTc_As6d_KdJh_7sTs_2h3c_2d9d_2sTh() {
    assertEquals(
      "As6d 2h3c 2d9d 2sTh 7sTs KdJh",
      Solver.process("texas-holdem 3h5d9sKhTc As6d KdJh 7sTs 2h3c 2d9d 2sTh"));
  }

  @Test
  public void test_texas_holdem_5285_4h6c8cKdQh_2c7c_3s8s_9cAd_3cAh_9sTh_4c7s_AsJh() {
    assertEquals(
      "2c7c 9sTh 3cAh 9cAd AsJh 4c7s 3s8s",
      Solver.process("texas-holdem 4h6c8cKdQh 2c7c 3s8s 9cAd 3cAh 9sTh 4c7s AsJh"));
  }

  @Test
  public void test_texas_holdem_5286_2c4h6dQcQs_2s8h_AcAd_As3h_8sAh_9c7s() {
    assertEquals(
      "9c7s As3h 8sAh 2s8h AcAd",
      Solver.process("texas-holdem 2c4h6dQcQs 2s8h AcAd As3h 8sAh 9c7s"));
  }

  @Test
  public void test_texas_holdem_5287_4d6c7hKdTh_JdQs_6d8c_5h9d_Kc6s_AsKs_8h4c() {
    assertEquals(
      "5h9d JdQs 8h4c 6d8c AsKs Kc6s",
      Solver.process("texas-holdem 4d6c7hKdTh JdQs 6d8c 5h9d Kc6s AsKs 8h4c"));
  }

  @Test
  public void test_texas_holdem_5288_2c2s6hAhKd_4dAs_9h2h_6cTh_Ad3d_Kc8d_TcQs_Qh3c_5c6s() {
    assertEquals(
      "Qh3c=TcQs 5c6s=6cTh Kc8d 4dAs=Ad3d 9h2h",
      Solver.process("texas-holdem 2c2s6hAhKd 4dAs 9h2h 6cTh Ad3d Kc8d TcQs Qh3c 5c6s"));
  }

  @Test
  public void test_texas_holdem_5289_5h6h9dKdQc_7d4c_Kc9h_KhTc_6dJs_7s2d_4h3s() {
    assertEquals(
      "4h3s 7d4c=7s2d 6dJs KhTc Kc9h",
      Solver.process("texas-holdem 5h6h9dKdQc 7d4c Kc9h KhTc 6dJs 7s2d 4h3s"));
  }

  @Test
  public void test_texas_holdem_5290_2h5c5d8hAc_Jd4h_9d3h() {
    assertEquals(
      "9d3h Jd4h",
      Solver.process("texas-holdem 2h5c5d8hAc Jd4h 9d3h"));
  }

  @Test
  public void test_texas_holdem_5291_3cKdKhTcTd_4h4s_6hAh_Th2d_Ad3d_JhQs() {
    assertEquals(
      "4h4s JhQs 6hAh=Ad3d Th2d",
      Solver.process("texas-holdem 3cKdKhTcTd 4h4s 6hAh Th2d Ad3d JhQs"));
  }

  @Test
  public void test_texas_holdem_5292_6s9d9sAcKh_5dKc_Ad2d_Kd4s_4cQs_7d4h_6hTc_Th5s_6dJc() {
    assertEquals(
      "7d4h Th5s 4cQs 6dJc=6hTc 5dKc=Kd4s Ad2d",
      Solver.process("texas-holdem 6s9d9sAcKh 5dKc Ad2d Kd4s 4cQs 7d4h 6hTc Th5s 6dJc"));
  }

  @Test
  public void test_texas_holdem_5293_2c2d5c7d8s_9sKs_7cAs_4sAd_Kc3c_Td3s_6cQd_TsKd_Ac7s_Th9d() {
    assertEquals(
      "Td3s Th9d 6cQd Kc3c 9sKs TsKd 4sAd 7cAs=Ac7s",
      Solver.process("texas-holdem 2c2d5c7d8s 9sKs 7cAs 4sAd Kc3c Td3s 6cQd TsKd Ac7s Th9d"));
  }

  @Test
  public void test_texas_holdem_5294_3c5c6dJdTh_Tc6c_Ah4s_8hAd_8cKs_9hAs_6h4c() {
    assertEquals(
      "8cKs Ah4s 8hAd 9hAs 6h4c Tc6c",
      Solver.process("texas-holdem 3c5c6dJdTh Tc6c Ah4s 8hAd 8cKs 9hAs 6h4c"));
  }

  @Test
  public void test_texas_holdem_5295_3c6c7d7sQh_7c3d_QcJd_5sKd_9cQd_5cTh_Tc2c_8s6d_2sTd_6hJs() {
    assertEquals(
      "2sTd=5cTh=Tc2c 5sKd 6hJs=8s6d 9cQd QcJd 7c3d",
      Solver.process("texas-holdem 3c6c7d7sQh 7c3d QcJd 5sKd 9cQd 5cTh Tc2c 8s6d 2sTd 6hJs"));
  }

  @Test
  public void test_texas_holdem_5296_2d5c9sJhKd_3h8c_6h4s() {
    assertEquals(
      "6h4s 3h8c",
      Solver.process("texas-holdem 2d5c9sJhKd 3h8c 6h4s"));
  }

  @Test
  public void test_texas_holdem_5297_7dAhJcQdTh_3d3h_4cAc_9hTc() {
    assertEquals(
      "3d3h 9hTc 4cAc",
      Solver.process("texas-holdem 7dAhJcQdTh 3d3h 4cAc 9hTc"));
  }

  @Test
  public void test_texas_holdem_5298_2d3d8sAdQs_7cAs_5c6h() {
    assertEquals(
      "5c6h 7cAs",
      Solver.process("texas-holdem 2d3d8sAdQs 7cAs 5c6h"));
  }

  @Test
  public void test_texas_holdem_5299_2c2h7s9dKs_4d6c_Ad4s_5d3c_Kh4h_3hTd_7dJd_Ac9h_6sAs() {
    assertEquals(
      "4d6c=5d3c 3hTd 6sAs=Ad4s 7dJd Ac9h Kh4h",
      Solver.process("texas-holdem 2c2h7s9dKs 4d6c Ad4s 5d3c Kh4h 3hTd 7dJd Ac9h 6sAs"));
  }

  @Test
  public void test_texas_holdem_5300_4c7c7hTdTs_4s7d_3d4d_JdQh_4h8s() {
    assertEquals(
      "3d4d 4h8s JdQh 4s7d",
      Solver.process("texas-holdem 4c7c7hTdTs 4s7d 3d4d JdQh 4h8s"));
  }

  @Test
  public void test_texas_holdem_5301_3c5s9cJdQd_3h6s_JsKd_Td5d_9dAh_3s9h_2d4h_QhAs_6hTs() {
    assertEquals(
      "2d4h 6hTs 3h6s Td5d 9dAh JsKd QhAs 3s9h",
      Solver.process("texas-holdem 3c5s9cJdQd 3h6s JsKd Td5d 9dAh 3s9h 2d4h QhAs 6hTs"));
  }

  @Test
  public void test_texas_holdem_5302_3d9sQhTcTs_7d6h_8cKc_5d6s_Th7c_2cJs() {
    assertEquals(
      "5d6s 7d6h 2cJs 8cKc Th7c",
      Solver.process("texas-holdem 3d9sQhTcTs 7d6h 8cKc 5d6s Th7c 2cJs"));
  }

  @Test
  public void test_texas_holdem_5303_3c7s8d8hKh_5hQh_6sJh_Ah7h() {
    assertEquals(
      "6sJh 5hQh Ah7h",
      Solver.process("texas-holdem 3c7s8d8hKh 5hQh 6sJh Ah7h"));
  }

  @Test
  public void test_texas_holdem_5304_2d2h3h7dJc_6sQd_3c6c_6d2s_AcAh_Ts8s_Tc5s_Th4d() {
    assertEquals(
      "Tc5s=Th4d Ts8s 6sQd 3c6c AcAh 6d2s",
      Solver.process("texas-holdem 2d2h3h7dJc 6sQd 3c6c 6d2s AcAh Ts8s Tc5s Th4d"));
  }

  @Test
  public void test_texas_holdem_5305_5d6s9sJsQd_7sQs_Jd6d_8cAc_8s9c_Th2s() {
    assertEquals(
      "Th2s 8cAc 8s9c Jd6d 7sQs",
      Solver.process("texas-holdem 5d6s9sJsQd 7sQs Jd6d 8cAc 8s9c Th2s"));
  }

  @Test
  public void test_texas_holdem_5306_9dJdKdKhTc_7h7d_9sAh_KcJh_QhTh_8d6s_2s4c_Ts3c() {
    assertEquals(
      "2s4c=8d6s 7h7d 9sAh Ts3c QhTh KcJh",
      Solver.process("texas-holdem 9dJdKdKhTc 7h7d 9sAh KcJh QhTh 8d6s 2s4c Ts3c"));
  }

  @Test
  public void test_texas_holdem_5307_2d4c5d6s8c_Js3s_Kc3d_Qh2c_8sKh() {
    assertEquals(
      "Qh2c 8sKh Js3s=Kc3d",
      Solver.process("texas-holdem 2d4c5d6s8c Js3s Kc3d Qh2c 8sKh"));
  }

  @Test
  public void test_texas_holdem_5308_4h6c6h6sAh_4s3d_KsJd() {
    assertEquals(
      "KsJd 4s3d",
      Solver.process("texas-holdem 4h6c6h6sAh 4s3d KsJd"));
  }

  @Test
  public void test_texas_holdem_5309_2d4c5dAcTc_7s2c_7d4h_6hAs_3hAd_Ks3c_9hTd_3sQd_8c9c_4sJs() {
    assertEquals(
      "7s2c 7d4h 4sJs 9hTd 6hAs 3hAd=3sQd=Ks3c 8c9c",
      Solver.process("texas-holdem 2d4c5dAcTc 7s2c 7d4h 6hAs 3hAd Ks3c 9hTd 3sQd 8c9c 4sJs"));
  }

  @Test
  public void test_texas_holdem_5310_2c3c6h7sTd_2h3s_8cTc_4c7c_Jh9h_4h8s_9d3d_TsJd_8hJs() {
    assertEquals(
      "4h8s 8hJs Jh9h 9d3d 4c7c 8cTc TsJd 2h3s",
      Solver.process("texas-holdem 2c3c6h7sTd 2h3s 8cTc 4c7c Jh9h 4h8s 9d3d TsJd 8hJs"));
  }

  @Test
  public void test_texas_holdem_5311_2h6cAhJdTd_9hQc_KdJs_Kh4h_6s8c_2d5d() {
    assertEquals(
      "9hQc Kh4h 2d5d 6s8c KdJs",
      Solver.process("texas-holdem 2h6cAhJdTd 9hQc KdJs Kh4h 6s8c 2d5d"));
  }

  @Test
  public void test_texas_holdem_5312_2s6s9sJsQs_6c6h_Jh3h_KhQc_Td5c_KsAd_Jd8s_KcTh_Ah7h_7sJc() {
    assertEquals(
      "6c6h=Ah7h=Jh3h=KcTh=KhQc=Td5c 7sJc Jd8s KsAd",
      Solver.process("texas-holdem 2s6s9sJsQs 6c6h Jh3h KhQc Td5c KsAd Jd8s KcTh Ah7h 7sJc"));
  }

  @Test
  public void test_texas_holdem_5313_2s4c6s7hTd_Ks7d_Kc8d_3sQd_9hAh() {
    assertEquals(
      "3sQd Kc8d 9hAh Ks7d",
      Solver.process("texas-holdem 2s4c6s7hTd Ks7d Kc8d 3sQd 9hAh"));
  }

  @Test
  public void test_texas_holdem_5314_2d5c6d9dTc_8hAd_7d5d() {
    assertEquals(
      "8hAd 7d5d",
      Solver.process("texas-holdem 2d5c6d9dTc 8hAd 7d5d"));
  }

  @Test
  public void test_texas_holdem_5315_4h7h8hKhQd_8sTs_TcKd_9hAc_9cQs_QhJh_5s3s_8cJc_8dKc_QcJd() {
    assertEquals(
      "5s3s 8sTs 8cJc 9cQs QcJd TcKd 8dKc 9hAc QhJh",
      Solver.process("texas-holdem 4h7h8hKhQd 8sTs TcKd 9hAc 9cQs QhJh 5s3s 8cJc 8dKc QcJd"));
  }

  @Test
  public void test_texas_holdem_5316_2c4h9hJdTc_9cTs_Qc7d_9s3s_Ah8h_5hQd_6dQs_2dKs() {
    assertEquals(
      "5hQd 6dQs Qc7d Ah8h 2dKs 9s3s 9cTs",
      Solver.process("texas-holdem 2c4h9hJdTc 9cTs Qc7d 9s3s Ah8h 5hQd 6dQs 2dKs"));
  }

  @Test
  public void test_texas_holdem_5317_3d8c9cKhTd_3cAd_QcJd_Kd3h_2d4c_Js2h_5d8d_7sJh_Ks3s_QsJc() {
    assertEquals(
      "2d4c Js2h 3cAd 5d8d Kd3h=Ks3s 7sJh QcJd=QsJc",
      Solver.process("texas-holdem 3d8c9cKhTd 3cAd QcJd Kd3h 2d4c Js2h 5d8d 7sJh Ks3s QsJc"));
  }

  @Test
  public void test_texas_holdem_5318_2d4sAcKhTd_3s8s_Qc8c_5d9c_Ah5h_Jd8h_3h2c() {
    assertEquals(
      "3s8s 5d9c Jd8h Qc8c 3h2c Ah5h",
      Solver.process("texas-holdem 2d4sAcKhTd 3s8s Qc8c 5d9c Ah5h Jd8h 3h2c"));
  }

  @Test
  public void test_texas_holdem_5319_3h4d6h9dQd_7c7d_KhQc_6s6c_Jc5d_Jh8s() {
    assertEquals(
      "Jc5d Jh8s 7c7d KhQc 6s6c",
      Solver.process("texas-holdem 3h4d6h9dQd 7c7d KhQc 6s6c Jc5d Jh8s"));
  }

  @Test
  public void test_texas_holdem_5320_4c6d8h9hKc_5s3h_9d3d_Qh5d_Js2c_QsJc_Ks6h_2d8c_4sAs_3cKd() {
    assertEquals(
      "5s3h Js2c Qh5d QsJc 4sAs 2d8c 9d3d 3cKd Ks6h",
      Solver.process("texas-holdem 4c6d8h9hKc 5s3h 9d3d Qh5d Js2c QsJc Ks6h 2d8c 4sAs 3cKd"));
  }

  @Test
  public void test_texas_holdem_5321_2c8h8sQdTh_As9h_AhJd_4d6c_Qh9s_5h4s_6s4c_TdKd_Qs7d() {
    assertEquals(
      "5h4s 4d6c=6s4c As9h AhJd TdKd Qh9s=Qs7d",
      Solver.process("texas-holdem 2c8h8sQdTh As9h AhJd 4d6c Qh9s 5h4s 6s4c TdKd Qs7d"));
  }

  @Test
  public void test_texas_holdem_5322_3c4h5sAcTd_Ah6d_9dKh_9sJd_3hAd_4c9c() {
    assertEquals(
      "9sJd 9dKh 4c9c Ah6d 3hAd",
      Solver.process("texas-holdem 3c4h5sAcTd Ah6d 9dKh 9sJd 3hAd 4c9c"));
  }

  @Test
  public void test_texas_holdem_5323_4c7d7hJdTs_As9s_5s3c_QcTc_4sAc_AdTd() {
    assertEquals(
      "5s3c As9s 4sAc QcTc AdTd",
      Solver.process("texas-holdem 4c7d7hJdTs As9s 5s3c QcTc 4sAc AdTd"));
  }

  @Test
  public void test_texas_holdem_5324_3c4d4h6s9h_Tc2c_8c5s_Ts7d_QsJc_QcKc() {
    assertEquals(
      "8c5s Tc2c Ts7d QsJc QcKc",
      Solver.process("texas-holdem 3c4d4h6s9h Tc2c 8c5s Ts7d QsJc QcKc"));
  }

  @Test
  public void test_texas_holdem_5325_3h5s8d9dKc_8cQc_8s4s_Ac6s_2hQs_2s4h_Jc3d_9s7h_Kh9c_Js9h() {
    assertEquals(
      "2s4h 2hQs Ac6s Jc3d 8s4s 8cQc 9s7h Js9h Kh9c",
      Solver.process("texas-holdem 3h5s8d9dKc 8cQc 8s4s Ac6s 2hQs 2s4h Jc3d 9s7h Kh9c Js9h"));
  }

  @Test
  public void test_texas_holdem_5326_3d7dAcQcQd_8d2s_Ah8h_8sQh() {
    assertEquals(
      "8d2s Ah8h 8sQh",
      Solver.process("texas-holdem 3d7dAcQcQd 8d2s Ah8h 8sQh"));
  }

  @Test
  public void test_texas_holdem_5327_4c8cKdQhQs_9hTd_Th3h_6c6h() {
    assertEquals(
      "Th3h 9hTd 6c6h",
      Solver.process("texas-holdem 4c8cKdQhQs 9hTd Th3h 6c6h"));
  }

  @Test
  public void test_texas_holdem_5328_6d6h6s7sJs_9h2h_2s5h_Tc4d() {
    assertEquals(
      "2s5h 9h2h Tc4d",
      Solver.process("texas-holdem 6d6h6s7sJs 9h2h 2s5h Tc4d"));
  }

  @Test
  public void test_texas_holdem_5329_2sJdKcTcTs_9c7s_Th8c() {
    assertEquals(
      "9c7s Th8c",
      Solver.process("texas-holdem 2sJdKcTcTs 9c7s Th8c"));
  }

  @Test
  public void test_texas_holdem_5330_3h4h6c7s8s_4c2s_Kh2d_3s6d_7cTh_JsTs() {
    assertEquals(
      "JsTs Kh2d 4c2s 7cTh 3s6d",
      Solver.process("texas-holdem 3h4h6c7s8s 4c2s Kh2d 3s6d 7cTh JsTs"));
  }

  @Test
  public void test_texas_holdem_5331_2s5c7h9dAd_5s6s_KdQc_As8h_Ks4h() {
    assertEquals(
      "Ks4h KdQc 5s6s As8h",
      Solver.process("texas-holdem 2s5c7h9dAd 5s6s KdQc As8h Ks4h"));
  }

  @Test
  public void test_texas_holdem_5332_3c7h7s9cKd_KsTd_8sKh_Tc2s_4s2d_3dAs_5c5h_4h7d_6d9h_JhAc() {
    assertEquals(
      "4s2d Tc2s JhAc 3dAs 5c5h 6d9h 8sKh KsTd 4h7d",
      Solver.process("texas-holdem 3c7h7s9cKd KsTd 8sKh Tc2s 4s2d 3dAs 5c5h 4h7d 6d9h JhAc"));
  }

  @Test
  public void test_texas_holdem_5333_3h7sJhKcKh_9cQh_4c8d_Th2h_2d9h() {
    assertEquals(
      "4c8d 2d9h 9cQh Th2h",
      Solver.process("texas-holdem 3h7sJhKcKh 9cQh 4c8d Th2h 2d9h"));
  }

  @Test
  public void test_texas_holdem_5334_2d3c6d8cJd_4c7s_6h8s_6sAc_8d2h_3dQs() {
    assertEquals(
      "4c7s 3dQs 6sAc 8d2h 6h8s",
      Solver.process("texas-holdem 2d3c6d8cJd 4c7s 6h8s 6sAc 8d2h 3dQs"));
  }

  @Test
  public void test_texas_holdem_5335_4s6c7c7dJh_2s4h_8d9s_3s2c_Kd8h_9c6s_QsTd_2h4c_7hTs() {
    assertEquals(
      "3s2c 8d9s QsTd Kd8h 2h4c=2s4h 9c6s 7hTs",
      Solver.process("texas-holdem 4s6c7c7dJh 2s4h 8d9s 3s2c Kd8h 9c6s QsTd 2h4c 7hTs"));
  }

  @Test
  public void test_texas_holdem_5336_4c7dAcJsKh_KsQh_Qs6h_Ah9c_8c9h() {
    assertEquals(
      "8c9h Qs6h KsQh Ah9c",
      Solver.process("texas-holdem 4c7dAcJsKh KsQh Qs6h Ah9c 8c9h"));
  }

  @Test
  public void test_texas_holdem_5337_3d5c7d7h8h_8dAc_JcQc_Jh5s_7s5d_TsJd_2dTc() {
    assertEquals(
      "2dTc TsJd JcQc Jh5s 8dAc 7s5d",
      Solver.process("texas-holdem 3d5c7d7h8h 8dAc JcQc Jh5s 7s5d TsJd 2dTc"));
  }

  @Test
  public void test_texas_holdem_5338_2c4c5c5hTc_8cTs_3c9d_4h6s_Qc9s_KcKs_3s9h_AcTd_Kd7c_2h2s() {
    assertEquals(
      "3s9h 4h6s 3c9d Kd7c 8cTs Qc9s KcKs AcTd 2h2s",
      Solver.process("texas-holdem 2c4c5c5hTc 8cTs 3c9d 4h6s Qc9s KcKs 3s9h AcTd Kd7c 2h2s"));
  }

  @Test
  public void test_texas_holdem_5339_4s5h8d9sQc_9cJs_Qh2s_Kd8c_2hKs() {
    assertEquals(
      "2hKs Kd8c 9cJs Qh2s",
      Solver.process("texas-holdem 4s5h8d9sQc 9cJs Qh2s Kd8c 2hKs"));
  }

  @Test
  public void test_texas_holdem_5340_5c7s9hQcTd_Kc3h_KhJh() {
    assertEquals(
      "Kc3h KhJh",
      Solver.process("texas-holdem 5c7s9hQcTd Kc3h KhJh"));
  }

  @Test
  public void test_texas_holdem_5341_2d5d5h8sJh_Tc6h_2sAh_Kd2h_9s5c_8dKh_2c9h_6c7s_6d4d() {
    assertEquals(
      "6d4d 6c7s Tc6h 2c9h Kd2h 2sAh 8dKh 9s5c",
      Solver.process("texas-holdem 2d5d5h8sJh Tc6h 2sAh Kd2h 9s5c 8dKh 2c9h 6c7s 6d4d"));
  }

  @Test
  public void test_texas_holdem_5342_7s9hJdKhQs_8cAs_8d3h_5h5c_6h2d_4d3c_4cTh_3d9d_6c2c() {
    assertEquals(
      "4d3c=6c2c=6h2d 8d3h 8cAs 5h5c 3d9d 4cTh",
      Solver.process("texas-holdem 7s9hJdKhQs 8cAs 8d3h 5h5c 6h2d 4d3c 4cTh 3d9d 6c2c"));
  }

  @Test
  public void test_texas_holdem_5343_4d6s9cAhTd_9h2d_7d5d_9sJh_2c9d_7s3c_Qh4h_Ks5s_5cJc_8hAs() {
    assertEquals(
      "7d5d=7s3c 5cJc Ks5s Qh4h 2c9d=9h2d 9sJh 8hAs",
      Solver.process("texas-holdem 4d6s9cAhTd 9h2d 7d5d 9sJh 2c9d 7s3c Qh4h Ks5s 5cJc 8hAs"));
  }

  @Test
  public void test_texas_holdem_5344_2c2s8cAhKc_5s4c_Js5d_8h9c_2d9d_3h3s() {
    assertEquals(
      "5s4c Js5d 3h3s 8h9c 2d9d",
      Solver.process("texas-holdem 2c2s8cAhKc 5s4c Js5d 8h9c 2d9d 3h3s"));
  }

  @Test
  public void test_texas_holdem_5345_2c6cJcJsQs_Qc9c_6s7s_7hTs_Th4d_3c9d_Qd3s() {
    assertEquals(
      "3c9d Th4d 7hTs 6s7s Qd3s Qc9c",
      Solver.process("texas-holdem 2c6cJcJsQs Qc9c 6s7s 7hTs Th4d 3c9d Qd3s"));
  }

  @Test
  public void test_texas_holdem_5346_8c8h9h9sJd_Js5d_JhAs_4c9c_Kc6d_JcTs_Qs3h() {
    assertEquals(
      "Qs3h Kc6d Js5d JcTs JhAs 4c9c",
      Solver.process("texas-holdem 8c8h9h9sJd Js5d JhAs 4c9c Kc6d JcTs Qs3h"));
  }

  @Test
  public void test_texas_holdem_5347_9c9sJdJhJs_Td5c_6h8s_QsAs_4c4s_4d5h_3s3c_5d6c_3d9d() {
    assertEquals(
      "3d9d=3s3c=4c4s=4d5h=5d6c=6h8s=QsAs=Td5c",
      Solver.process("texas-holdem 9c9sJdJhJs Td5c 6h8s QsAs 4c4s 4d5h 3s3c 5d6c 3d9d"));
  }

  @Test
  public void test_texas_holdem_5348_7d7sKsTcTd_Ah4s_5cQs_KhAd_KdJs_2h6d_Qd5d() {
    assertEquals(
      "2h6d=5cQs=Qd5d Ah4s KdJs KhAd",
      Solver.process("texas-holdem 7d7sKsTcTd Ah4s 5cQs KhAd KdJs 2h6d Qd5d"));
  }

  @Test
  public void test_texas_holdem_5349_2c3c5sQhTc_6hAd_Ks9d_7h5c_6c3h_8s7s_3d9s_3sQs_4cQd_Js8c() {
    assertEquals(
      "8s7s Js8c Ks9d 6hAd 6c3h 3d9s 7h5c 4cQd 3sQs",
      Solver.process("texas-holdem 2c3c5sQhTc 6hAd Ks9d 7h5c 6c3h 8s7s 3d9s 3sQs 4cQd Js8c"));
  }

  @Test
  public void test_texas_holdem_5350_4h5s7c7h9c_Ks8c_2h8d() {
    assertEquals(
      "2h8d Ks8c",
      Solver.process("texas-holdem 4h5s7c7h9c Ks8c 2h8d"));
  }

  @Test
  public void test_texas_holdem_5351_3c6h8cAcQd_5cTh_5s8h_Kc8d_3sAd_QcKd() {
    assertEquals(
      "5cTh 5s8h Kc8d QcKd 3sAd",
      Solver.process("texas-holdem 3c6h8cAcQd 5cTh 5s8h Kc8d 3sAd QcKd"));
  }

  @Test
  public void test_texas_holdem_5352_9sJdKdKsQs_4s7h_AdAh_7d6h_4d9c() {
    assertEquals(
      "4s7h=7d6h 4d9c AdAh",
      Solver.process("texas-holdem 9sJdKdKsQs 4s7h AdAh 7d6h 4d9c"));
  }

  @Test
  public void test_texas_holdem_5353_3c9sKcQdTc_8h4h_3s6h_As5h_AcJc_4sTs() {
    assertEquals(
      "8h4h As5h 3s6h 4sTs AcJc",
      Solver.process("texas-holdem 3c9sKcQdTc 8h4h 3s6h As5h AcJc 4sTs"));
  }

  @Test
  public void test_texas_holdem_5354_7h8dJhKdQc_6cAc_Jd5c_8cTc_Kh3h_Kc9d_2d9s_4sJc_6h9c_3dTh() {
    assertEquals(
      "2d9s=6h9c 3dTh 6cAc 8cTc 4sJc=Jd5c Kh3h Kc9d",
      Solver.process("texas-holdem 7h8dJhKdQc 6cAc Jd5c 8cTc Kh3h Kc9d 2d9s 4sJc 6h9c 3dTh"));
  }

  @Test
  public void test_texas_holdem_5355_2d3s4cKcTd_Tc8c_5s6c_3c9s_Jh9c_Ts5c_9h4s_Qd8d_5h6d() {
    assertEquals(
      "Jh9c Qd8d 3c9s 9h4s Ts5c Tc8c 5h6d=5s6c",
      Solver.process("texas-holdem 2d3s4cKcTd Tc8c 5s6c 3c9s Jh9c Ts5c 9h4s Qd8d 5h6d"));
  }

  @Test
  public void test_texas_holdem_5356_2s5c7cJdQc_8h9d_5s4s_Kc2d_Qh6d_Js9c_Kd2h_Ah9s() {
    assertEquals(
      "8h9d Ah9s Kc2d=Kd2h 5s4s Js9c Qh6d",
      Solver.process("texas-holdem 2s5c7cJdQc 8h9d 5s4s Kc2d Qh6d Js9c Kd2h Ah9s"));
  }

  @Test
  public void test_texas_holdem_5357_2c4sAsQcTs_2dQs_Js7c_5h3s_6sJd_9s2s() {
    assertEquals(
      "6sJd Js7c 2dQs 5h3s 9s2s",
      Solver.process("texas-holdem 2c4sAsQcTs 2dQs Js7c 5h3s 6sJd 9s2s"));
  }

  @Test
  public void test_texas_holdem_5358_5d6s7c9hJc_3hQc_5sTd_7dJh() {
    assertEquals(
      "3hQc 5sTd 7dJh",
      Solver.process("texas-holdem 5d6s7c9hJc 3hQc 5sTd 7dJh"));
  }

  @Test
  public void test_texas_holdem_5359_3d4d5c5sQc_3c6d_6c5d_3sKh_AdJs_9d2c_QhTs() {
    assertEquals(
      "9d2c AdJs 3c6d 3sKh QhTs 6c5d",
      Solver.process("texas-holdem 3d4d5c5sQc 3c6d 6c5d 3sKh AdJs 9d2c QhTs"));
  }

  @Test
  public void test_texas_holdem_5360_6c8s9sJdTh_4h6d_Ac8h_3h5d_6h3d_Kh4s_Qc9d_2d9c() {
    assertEquals(
      "3h5d Kh4s 4h6d=6h3d Ac8h 2d9c Qc9d",
      Solver.process("texas-holdem 6c8s9sJdTh 4h6d Ac8h 3h5d 6h3d Kh4s Qc9d 2d9c"));
  }

  @Test
  public void test_texas_holdem_5361_4sAcKdQsTh_7h6h_9hJh_Ks8d() {
    assertEquals(
      "7h6h Ks8d 9hJh",
      Solver.process("texas-holdem 4sAcKdQsTh 7h6h 9hJh Ks8d"));
  }

  @Test
  public void test_texas_holdem_5362_3c6d7hAhQs_4sKc_6s7c_3d4d_5sTc_8c8d() {
    assertEquals(
      "5sTc 4sKc 3d4d 8c8d 6s7c",
      Solver.process("texas-holdem 3c6d7hAhQs 4sKc 6s7c 3d4d 5sTc 8c8d"));
  }

  @Test
  public void test_texas_holdem_5363_2h3h5h9c9h_Tc8d_Td2d_7h5s_QsKh_2sJd_6dQd() {
    assertEquals(
      "Tc8d 6dQd Td2d 2sJd 7h5s QsKh",
      Solver.process("texas-holdem 2h3h5h9c9h Tc8d Td2d 7h5s QsKh 2sJd 6dQd"));
  }

  @Test
  public void test_texas_holdem_5364_4c4h7dAcKc_2hQs_4s6c_Th9h_6hAs_2c2s() {
    assertEquals(
      "Th9h 2hQs 2c2s 6hAs 4s6c",
      Solver.process("texas-holdem 4c4h7dAcKc 2hQs 4s6c Th9h 6hAs 2c2s"));
  }

  @Test
  public void test_texas_holdem_5365_2h5d7d7sJd_9d4c_7cAd_Qs3s_3cJh_6cAc_Kd5h_TcKs_Td3d() {
    assertEquals(
      "9d4c Qs3s TcKs 6cAc Kd5h 3cJh 7cAd Td3d",
      Solver.process("texas-holdem 2h5d7d7sJd 9d4c 7cAd Qs3s 3cJh 6cAc Kd5h TcKs Td3d"));
  }

  @Test
  public void test_texas_holdem_5366_2s3hAdTcTh_2hJc_9s6d_7cQh_5cTd_JsQd_8s4s_7d5d_6cTs_8cQs() {
    assertEquals(
      "7d5d 8s4s 9s6d 7cQh 8cQs JsQd 2hJc 5cTd 6cTs",
      Solver.process("texas-holdem 2s3hAdTcTh 2hJc 9s6d 7cQh 5cTd JsQd 8s4s 7d5d 6cTs 8cQs"));
  }

  @Test
  public void test_texas_holdem_5367_2h6h9cAhJh_3sTs_2s9d() {
    assertEquals(
      "3sTs 2s9d",
      Solver.process("texas-holdem 2h6h9cAhJh 3sTs 2s9d"));
  }

  @Test
  public void test_texas_holdem_5368_4d4h6s8dQh_Ad2d_6hKd() {
    assertEquals(
      "Ad2d 6hKd",
      Solver.process("texas-holdem 4d4h6s8dQh Ad2d 6hKd"));
  }

  @Test
  public void test_texas_holdem_5369_4d4s6h6s7d_As5s_QcQd_9dJd_KhTh_5d9c_KsAd_4h8s_TdAh() {
    assertEquals(
      "5d9c 9dJd KhTh As5s=KsAd=TdAh QcQd 4h8s",
      Solver.process("texas-holdem 4d4s6h6s7d As5s QcQd 9dJd KhTh 5d9c KsAd 4h8s TdAh"));
  }

  @Test
  public void test_texas_holdem_5370_3s6h8h9cTd_3hJs_Ad7s_ThKh() {
    assertEquals(
      "3hJs ThKh Ad7s",
      Solver.process("texas-holdem 3s6h8h9cTd 3hJs Ad7s ThKh"));
  }

  @Test
  public void test_texas_holdem_5371_2c2h5d7h9h_7c6c_7s3d_9c7d_8sAh_8cKh_3cQd_Tc8d_Ad4s() {
    assertEquals(
      "Tc8d 3cQd 8cKh Ad4s 8sAh 7c6c=7s3d 9c7d",
      Solver.process("texas-holdem 2c2h5d7h9h 7c6c 7s3d 9c7d 8sAh 8cKh 3cQd Tc8d Ad4s"));
  }

  @Test
  public void test_texas_holdem_5372_4d5cAcJhQs_9c8d_9sKd_3hKh_7dQc() {
    assertEquals(
      "9c8d 3hKh 9sKd 7dQc",
      Solver.process("texas-holdem 4d5cAcJhQs 9c8d 9sKd 3hKh 7dQc"));
  }

  @Test
  public void test_texas_holdem_5373_2s4cJsKcTh_Td2c_6cJc_9s4h_2d8d_AdQh_Kh3d_Jh3s() {
    assertEquals(
      "2d8d 9s4h Jh3s 6cJc Kh3d Td2c AdQh",
      Solver.process("texas-holdem 2s4cJsKcTh Td2c 6cJc 9s4h 2d8d AdQh Kh3d Jh3s"));
  }

  @Test
  public void test_texas_holdem_5374_4c4d6c6s9d_Tc9s_Jh8s_6d9c_3sKd_3d7s_JcQd() {
    assertEquals(
      "3d7s Jh8s JcQd 3sKd Tc9s 6d9c",
      Solver.process("texas-holdem 4c4d6c6s9d Tc9s Jh8s 6d9c 3sKd 3d7s JcQd"));
  }

  @Test
  public void test_texas_holdem_5375_8s9sJdKhQh_4cKs_3h6d_2h4h() {
    assertEquals(
      "2h4h=3h6d 4cKs",
      Solver.process("texas-holdem 8s9sJdKhQh 4cKs 3h6d 2h4h"));
  }

  @Test
  public void test_texas_holdem_5376_7d8d9c9sKs_3h7s_AcJh_2s4h_Td5h() {
    assertEquals(
      "2s4h Td5h AcJh 3h7s",
      Solver.process("texas-holdem 7d8d9c9sKs 3h7s AcJh 2s4h Td5h"));
  }

  @Test
  public void test_texas_holdem_5377_2c5d5hQcQs_Ts3h_As5s_8sAc_3d9c_TdJd_Ad7s_2h9d_Js4h_7dTh() {
    assertEquals(
      "2h9d=3d9c 7dTh=Ts3h Js4h=TdJd 8sAc=Ad7s As5s",
      Solver.process("texas-holdem 2c5d5hQcQs Ts3h As5s 8sAc 3d9c TdJd Ad7s 2h9d Js4h 7dTh"));
  }

  @Test
  public void test_texas_holdem_5378_2c2d4d8cTh_7s3c_QsTs_8d3h_7dJh_AcJc_7c4s() {
    assertEquals(
      "7s3c 7dJh AcJc 7c4s 8d3h QsTs",
      Solver.process("texas-holdem 2c2d4d8cTh 7s3c QsTs 8d3h 7dJh AcJc 7c4s"));
  }

  @Test
  public void test_texas_holdem_5379_4s5h6s8sQh_7hAs_3h8d_Ks2c_6c9s_4cKh_Qs6h_3sJd() {
    assertEquals(
      "3sJd Ks2c 4cKh 6c9s 3h8d Qs6h 7hAs",
      Solver.process("texas-holdem 4s5h6s8sQh 7hAs 3h8d Ks2c 6c9s 4cKh Qs6h 3sJd"));
  }

  @Test
  public void test_texas_holdem_5380_6d6h8dJdKs_2d6s_9d3s_AhAs_4hJh_7sQh_5c2c() {
    assertEquals(
      "5c2c 9d3s 7sQh 4hJh AhAs 2d6s",
      Solver.process("texas-holdem 6d6h8dJdKs 2d6s 9d3s AhAs 4hJh 7sQh 5c2c"));
  }

  @Test
  public void test_texas_holdem_5381_4s5h6h8dQh_Ks6c_2s3s_Kc9s_8s7s_2c5c() {
    assertEquals(
      "Kc9s 2c5c Ks6c 2s3s 8s7s",
      Solver.process("texas-holdem 4s5h6h8dQh Ks6c 2s3s Kc9s 8s7s 2c5c"));
  }

  @Test
  public void test_texas_holdem_5382_2d3c7h7sKc_6c7c_Kh9c() {
    assertEquals(
      "Kh9c 6c7c",
      Solver.process("texas-holdem 2d3c7h7sKc 6c7c Kh9c"));
  }

  @Test
  public void test_texas_holdem_5383_4h7sJdQcQd_Qh3c_6c2c() {
    assertEquals(
      "6c2c Qh3c",
      Solver.process("texas-holdem 4h7sJdQcQd Qh3c 6c2c"));
  }

  @Test
  public void test_texas_holdem_5384_3d4d4h7dTs_Kc8d_Ks8c_5sAc_9c4c_Qs2h_Kd7c_Ad2s() {
    assertEquals(
      "Qs2h Kc8d=Ks8c 5sAc=Ad2s Kd7c 9c4c",
      Solver.process("texas-holdem 3d4d4h7dTs Kc8d Ks8c 5sAc 9c4c Qs2h Kd7c Ad2s"));
  }

  @Test
  public void test_texas_holdem_5385_5h6c6d9dKd_KsQc_8hKh_4d6h_JsJh_Kc9c_8sJd_6s2c_9h2h_Th3d() {
    assertEquals(
      "Th3d 8sJd 9h2h JsJh 8hKh KsQc Kc9c 4d6h=6s2c",
      Solver.process("texas-holdem 5h6c6d9dKd KsQc 8hKh 4d6h JsJh Kc9c 8sJd 6s2c 9h2h Th3d"));
  }

  @Test
  public void test_texas_holdem_5386_2h3s5d7dKs_3h9s_6sTd_5cJd_2cKh_9cJs() {
    assertEquals(
      "6sTd 9cJs 3h9s 5cJd 2cKh",
      Solver.process("texas-holdem 2h3s5d7dKs 3h9s 6sTd 5cJd 2cKh 9cJs"));
  }

  @Test
  public void test_texas_holdem_5387_3d7c8d9dAd_9hTs_6h9c_Td6c_ThQh_3h6s_8cKc_2cAh() {
    assertEquals(
      "ThQh 3h6s 8cKc 6h9c 9hTs 2cAh Td6c",
      Solver.process("texas-holdem 3d7c8d9dAd 9hTs 6h9c Td6c ThQh 3h6s 8cKc 2cAh"));
  }

  @Test
  public void test_texas_holdem_5388_2c3c8cAcQd_Qs7s_2d4d_6dJc_9c5d_KcQc_4h3h_5h9s() {
    assertEquals(
      "5h9s 2d4d 4h3h Qs7s 9c5d 6dJc KcQc",
      Solver.process("texas-holdem 2c3c8cAcQd Qs7s 2d4d 6dJc 9c5d KcQc 4h3h 5h9s"));
  }

  @Test
  public void test_texas_holdem_5389_7s8dQsTcTh_9hTd_Ah2s_KhQd() {
    assertEquals(
      "Ah2s KhQd 9hTd",
      Solver.process("texas-holdem 7s8dQsTcTh 9hTd Ah2s KhQd"));
  }

  @Test
  public void test_texas_holdem_5390_5d9sAdJcTs_Kh6c_9cJs_Td3s_2dQd_6s8s_9d2c() {
    assertEquals(
      "6s8s 2dQd Kh6c 9d2c Td3s 9cJs",
      Solver.process("texas-holdem 5d9sAdJcTs Kh6c 9cJs Td3s 2dQd 6s8s 9d2c"));
  }

  @Test
  public void test_texas_holdem_5391_2sAsJhKhQs_KdKc_7hTs() {
    assertEquals(
      "KdKc 7hTs",
      Solver.process("texas-holdem 2sAsJhKhQs KdKc 7hTs"));
  }

  @Test
  public void test_texas_holdem_5392_4d5s7cJdTh_Js3d_Qc4s_Ac6c_Jc2d_Ad7h_8c7d_2c5c_9s8s() {
    assertEquals(
      "Ac6c Qc4s 2c5c 8c7d Ad7h Jc2d=Js3d 9s8s",
      Solver.process("texas-holdem 4d5s7cJdTh Js3d Qc4s Ac6c Jc2d Ad7h 8c7d 2c5c 9s8s"));
  }

  @Test
  public void test_texas_holdem_5393_2d6d6h8d9c_KhJs_8s9h_Td5h_9d8h_7sTc_3sTs_Jc7h() {
    assertEquals(
      "3sTs=Td5h Jc7h KhJs 8s9h=9d8h 7sTc",
      Solver.process("texas-holdem 2d6d6h8d9c KhJs 8s9h Td5h 9d8h 7sTc 3sTs Jc7h"));
  }

  @Test
  public void test_texas_holdem_5394_3s5s6h8hJc_Th5c_5dAh_2h2c_5hJs_Ac3d_8sTs_Tc9c_KdKh_8d4s() {
    assertEquals(
      "Tc9c 2h2c Ac3d Th5c 5dAh 8d4s 8sTs KdKh 5hJs",
      Solver.process("texas-holdem 3s5s6h8hJc Th5c 5dAh 2h2c 5hJs Ac3d 8sTs Tc9c KdKh 8d4s"));
  }

  @Test
  public void test_texas_holdem_5395_2h3dAcAsKs_Kd6s_Qh3s() {
    assertEquals(
      "Qh3s Kd6s",
      Solver.process("texas-holdem 2h3dAcAsKs Kd6s Qh3s"));
  }

  @Test
  public void test_texas_holdem_5396_2h3c4d7cAs_TsQd_2d3s_Ah9d_6d4c_Kc9h() {
    assertEquals(
      "TsQd Kc9h 6d4c Ah9d 2d3s",
      Solver.process("texas-holdem 2h3c4d7cAs TsQd 2d3s Ah9d 6d4c Kc9h"));
  }

  @Test
  public void test_texas_holdem_5397_JdJhKdKhQc_Ad4d_5d9s() {
    assertEquals(
      "5d9s Ad4d",
      Solver.process("texas-holdem JdJhKdKhQc Ad4d 5d9s"));
  }

  @Test
  public void test_texas_holdem_5398_2d3c6sAdJd_As4d_2sKc_Ah5c_3h9c() {
    assertEquals(
      "2sKc 3h9c As4d Ah5c",
      Solver.process("texas-holdem 2d3c6sAdJd As4d 2sKc Ah5c 3h9c"));
  }

  @Test
  public void test_texas_holdem_5399_3s8c8hJdKh_2cAh_7h4s() {
    assertEquals(
      "7h4s 2cAh",
      Solver.process("texas-holdem 3s8c8hJdKh 2cAh 7h4s"));
  }

  @Test
  public void test_texas_holdem_5400_5d6cAhJdTc_9hAs_8cKh_9c6h() {
    assertEquals(
      "8cKh 9c6h 9hAs",
      Solver.process("texas-holdem 5d6cAhJdTc 9hAs 8cKh 9c6h"));
  }

  @Test
  public void test_texas_holdem_5401_4dAsKhQsTc_Ah8d_4h7d_Jc6c_3sAc_7hAd_9h8c_TdTh_3c9s_5c7s() {
    assertEquals(
      "5c7s 3c9s=9h8c 4h7d 3sAc=7hAd=Ah8d TdTh Jc6c",
      Solver.process("texas-holdem 4dAsKhQsTc Ah8d 4h7d Jc6c 3sAc 7hAd 9h8c TdTh 3c9s 5c7s"));
  }

  @Test
  public void test_texas_holdem_5402_4c8cJhQhTd_JcKh_8dJs_7h6h() {
    assertEquals(
      "7h6h JcKh 8dJs",
      Solver.process("texas-holdem 4c8cJhQhTd JcKh 8dJs 7h6h"));
  }

  @Test
  public void test_texas_holdem_5403_5c5h9d9hJh_As4c_8dJd_KdTh_3s3c_Ac3h_7cAh_2c3d() {
    assertEquals(
      "2c3d=3s3c KdTh 7cAh=Ac3h=As4c 8dJd",
      Solver.process("texas-holdem 5c5h9d9hJh As4c 8dJd KdTh 3s3c Ac3h 7cAh 2c3d"));
  }

  @Test
  public void test_texas_holdem_5404_9hAdKdKhKs_6h3h_AsQh_Ah2h_7d4c() {
    assertEquals(
      "6h3h=7d4c Ah2h=AsQh",
      Solver.process("texas-holdem 9hAdKdKhKs 6h3h AsQh Ah2h 7d4c"));
  }

  @Test
  public void test_texas_holdem_5405_3c4c6sAsQs_6dKs_5dTd_8d3h_4sAd_7s6h_9dJd_5c2c() {
    assertEquals(
      "5dTd 9dJd 8d3h 7s6h 6dKs 4sAd 5c2c",
      Solver.process("texas-holdem 3c4c6sAsQs 6dKs 5dTd 8d3h 4sAd 7s6h 9dJd 5c2c"));
  }

  @Test
  public void test_texas_holdem_5406_2d3s6sQcTd_4s9d_2cKs_4dJc_9c4c_Ts8d_7dJs_8h3h_Kh9s() {
    assertEquals(
      "4s9d=9c4c 4dJc 7dJs Kh9s 2cKs 8h3h Ts8d",
      Solver.process("texas-holdem 2d3s6sQcTd 4s9d 2cKs 4dJc 9c4c Ts8d 7dJs 8h3h Kh9s"));
  }

  @Test
  public void test_texas_holdem_5407_5d7h7sQcTh_2cAs_Jh5h_3sAd_6sAh_8d8s_6c8c_6d3c() {
    assertEquals(
      "6d3c 6c8c 2cAs=3sAd=6sAh Jh5h 8d8s",
      Solver.process("texas-holdem 5d7h7sQcTh 2cAs Jh5h 3sAd 6sAh 8d8s 6c8c 6d3c"));
  }

  @Test
  public void test_texas_holdem_5408_2d4d4h8c8s_3hKs_6d9c_2c9d() {
    assertEquals(
      "2c9d=6d9c 3hKs",
      Solver.process("texas-holdem 2d4d4h8c8s 3hKs 6d9c 2c9d"));
  }

  @Test
  public void test_texas_holdem_5409_2s9hAsQsTc_Jd8s_4s6s_QhAd_JcTs_7h8h() {
    assertEquals(
      "7h8h JcTs QhAd Jd8s 4s6s",
      Solver.process("texas-holdem 2s9hAsQsTc Jd8s 4s6s QhAd JcTs 7h8h"));
  }

  @Test
  public void test_texas_holdem_5410_3h6cJdQcTd_2h4c_Th5c_AcAh() {
    assertEquals(
      "2h4c Th5c AcAh",
      Solver.process("texas-holdem 3h6cJdQcTd 2h4c Th5c AcAh"));
  }

  @Test
  public void test_texas_holdem_5411_3s6cAhJhJs_8h8c_2sTd_5c6d_5s7c() {
    assertEquals(
      "5s7c 2sTd 5c6d 8h8c",
      Solver.process("texas-holdem 3s6cAhJhJs 8h8c 2sTd 5c6d 5s7c"));
  }

  @Test
  public void test_texas_holdem_5412_2h3dJcKdQs_3c4s_QdAh() {
    assertEquals(
      "3c4s QdAh",
      Solver.process("texas-holdem 2h3dJcKdQs 3c4s QdAh"));
  }

  @Test
  public void test_texas_holdem_5413_9h9sAhJhTc_2s8s_8c5h_3sTh_3d9c_Kc7d() {
    assertEquals(
      "2s8s=8c5h Kc7d 3sTh 3d9c",
      Solver.process("texas-holdem 9h9sAhJhTc 2s8s 8c5h 3sTh 3d9c Kc7d"));
  }

  @Test
  public void test_texas_holdem_5414_5s7d9dAdTs_ThTc_Ks6h() {
    assertEquals(
      "Ks6h ThTc",
      Solver.process("texas-holdem 5s7d9dAdTs ThTc Ks6h"));
  }

  @Test
  public void test_texas_holdem_5415_2s3h5hQhTh_5c4s_3dKd() {
    assertEquals(
      "3dKd 5c4s",
      Solver.process("texas-holdem 2s3h5hQhTh 5c4s 3dKd"));
  }

  @Test
  public void test_texas_holdem_5416_2d5hJsKcTs_6d5s_Ah8c() {
    assertEquals(
      "Ah8c 6d5s",
      Solver.process("texas-holdem 2d5hJsKcTs 6d5s Ah8c"));
  }

  @Test
  public void test_texas_holdem_5417_2c2h8hKcTh_6dKh_4d9h_2sKd_QhAh_JhJs_4h5s() {
    assertEquals(
      "4h5s 4d9h JhJs 6dKh QhAh 2sKd",
      Solver.process("texas-holdem 2c2h8hKcTh 6dKh 4d9h 2sKd QhAh JhJs 4h5s"));
  }

  @Test
  public void test_texas_holdem_5418_3d4c6h6s9d_5dJd_8c9c_Kd9s_4sJs_7h2h_4d8d_AhQh_ThQc_Qd3s() {
    assertEquals(
      "7h2h 5dJd ThQc AhQh Qd3s 4d8d 4sJs 8c9c Kd9s",
      Solver.process("texas-holdem 3d4c6h6s9d 5dJd 8c9c Kd9s 4sJs 7h2h 4d8d AhQh ThQc Qd3s"));
  }

  @Test
  public void test_texas_holdem_5419_7h8hAcAhKh_Ks7d_TcJh() {
    assertEquals(
      "Ks7d TcJh",
      Solver.process("texas-holdem 7h8hAcAhKh Ks7d TcJh"));
  }

  @Test
  public void test_texas_holdem_5420_3h4d5h7dJd_9s6s_AhQd_Kh7c_9cKs_8c8s_2hJs_KdTd_3s2d_5d4s() {
    assertEquals(
      "9cKs AhQd 3s2d Kh7c 8c8s 2hJs 5d4s 9s6s KdTd",
      Solver.process("texas-holdem 3h4d5h7dJd 9s6s AhQd Kh7c 9cKs 8c8s 2hJs KdTd 3s2d 5d4s"));
  }

  @Test
  public void test_texas_holdem_5421_2h3h4c6cJd_Kd6d_KsAh_AcTh_6h9d_Qs5s() {
    assertEquals(
      "AcTh KsAh 6h9d Kd6d Qs5s",
      Solver.process("texas-holdem 2h3h4c6cJd Kd6d KsAh AcTh 6h9d Qs5s"));
  }

  @Test
  public void test_texas_holdem_5422_7h9sAcAhQh_Qc7c_TcAs_Js6c_2h3d_9c8c_Ad4c() {
    assertEquals(
      "2h3d Js6c 9c8c Qc7c Ad4c TcAs",
      Solver.process("texas-holdem 7h9sAcAhQh Qc7c TcAs Js6c 2h3d 9c8c Ad4c"));
  }

  @Test
  public void test_texas_holdem_5423_3c5h6h8dKc_Jd4h_QcKs_Qh5d_6cKd_7hQs_8sAh_Qd2c() {
    assertEquals(
      "Jd4h Qd2c 7hQs Qh5d 8sAh QcKs 6cKd",
      Solver.process("texas-holdem 3c5h6h8dKc Jd4h QcKs Qh5d 6cKd 7hQs 8sAh Qd2c"));
  }

  @Test
  public void test_texas_holdem_5424_6cJdJhQhTh_8c6h_Qs2h_3d8h_Qc2d() {
    assertEquals(
      "3d8h 8c6h Qc2d=Qs2h",
      Solver.process("texas-holdem 6cJdJhQhTh 8c6h Qs2h 3d8h Qc2d"));
  }

  @Test
  public void test_texas_holdem_5425_3s4dKhQsTh_Tc7s_7h3d_5c4c_Qh6s_Kd9c_8hAd_7c8d_Qc9s() {
    assertEquals(
      "7c8d 8hAd 7h3d 5c4c Tc7s Qh6s Qc9s Kd9c",
      Solver.process("texas-holdem 3s4dKhQsTh Tc7s 7h3d 5c4c Qh6s Kd9c 8hAd 7c8d Qc9s"));
  }

  @Test
  public void test_texas_holdem_5426_2dAdJcKsTc_9cAs_6d4h_KhJh_Js6c() {
    assertEquals(
      "6d4h Js6c 9cAs KhJh",
      Solver.process("texas-holdem 2dAdJcKsTc 9cAs 6d4h KhJh Js6c"));
  }

  @Test
  public void test_texas_holdem_5427_4d6s8h9sTs_5h5c_9cKh() {
    assertEquals(
      "5h5c 9cKh",
      Solver.process("texas-holdem 4d6s8h9sTs 5h5c 9cKh"));
  }

  @Test
  public void test_texas_holdem_5428_5h7cAcTdTs_Jh9h_5sAs_2d3s_Tc4c_7sJd_7d5d() {
    assertEquals(
      "2d3s Jh9h 7d5d=7sJd 5sAs Tc4c",
      Solver.process("texas-holdem 5h7cAcTdTs Jh9h 5sAs 2d3s Tc4c 7sJd 7d5d"));
  }

  @Test
  public void test_texas_holdem_5429_5h6h8d8sAh_Td6d_4h2d_5d8c_Kc9d_8hAd() {
    assertEquals(
      "4h2d Kc9d Td6d 5d8c 8hAd",
      Solver.process("texas-holdem 5h6h8d8sAh Td6d 4h2d 5d8c Kc9d 8hAd"));
  }

  @Test
  public void test_texas_holdem_5430_3c4h6s9hAh_5d7c_Jh2c_TdKs_8d2h() {
    assertEquals(
      "8d2h Jh2c TdKs 5d7c",
      Solver.process("texas-holdem 3c4h6s9hAh 5d7c Jh2c TdKs 8d2h"));
  }

  @Test
  public void test_texas_holdem_5431_3d8dQsTcTh_9s9h_Jd9c_4hAc_2s3c_AhJs_5dTs_4dKd_6s6h_As2c() {
    assertEquals(
      "4dKd 4hAc=As2c AhJs 2s3c 6s6h 9s9h 5dTs Jd9c",
      Solver.process("texas-holdem 3d8dQsTcTh 9s9h Jd9c 4hAc 2s3c AhJs 5dTs 4dKd 6s6h As2c"));
  }

  @Test
  public void test_texas_holdem_5432_2d3d8cJdTh_4c6c_9dJs_TdQc_QdAd_8h4h() {
    assertEquals(
      "4c6c 8h4h TdQc 9dJs QdAd",
      Solver.process("texas-holdem 2d3d8cJdTh 4c6c 9dJs TdQc QdAd 8h4h"));
  }

  @Test
  public void test_texas_holdem_5433_3d3h7cAhKs_6s4s_As4d_QsJc_9hTh_TsKc_2dJh() {
    assertEquals(
      "6s4s 9hTh 2dJh QsJc TsKc As4d",
      Solver.process("texas-holdem 3d3h7cAhKs 6s4s As4d QsJc 9hTh TsKc 2dJh"));
  }

  @Test
  public void test_texas_holdem_5434_2d4s5cJdKs_QhAs_3s9c_9sKh_6c6d_5d3h() {
    assertEquals(
      "3s9c QhAs 5d3h 6c6d 9sKh",
      Solver.process("texas-holdem 2d4s5cJdKs QhAs 3s9c 9sKh 6c6d 5d3h"));
  }

  @Test
  public void test_texas_holdem_5435_2d6s8h9h9s_6c6d_JsQc_Ks7h_Kh7c_9d7d() {
    assertEquals(
      "JsQc Kh7c=Ks7h 9d7d 6c6d",
      Solver.process("texas-holdem 2d6s8h9h9s 6c6d JsQc Ks7h Kh7c 9d7d"));
  }

  @Test
  public void test_texas_holdem_5436_2d5c5h8cJd_9d2h_2cQh_Ac4d_5d7s_Kd7h_8dQc_4s4h_JhKh_QdTd() {
    assertEquals(
      "QdTd Kd7h Ac4d 9d2h 2cQh 4s4h 8dQc JhKh 5d7s",
      Solver.process("texas-holdem 2d5c5h8cJd 9d2h 2cQh Ac4d 5d7s Kd7h 8dQc 4s4h JhKh QdTd"));
  }

  @Test
  public void test_texas_holdem_5437_4h6c6s8sAh_8d9h_KdKh_2s2d_TcJc_7c8c_ThAd_5cQs_3c9c() {
    assertEquals(
      "3c9c TcJc 5cQs 2s2d 7c8c=8d9h KdKh ThAd",
      Solver.process("texas-holdem 4h6c6s8sAh 8d9h KdKh 2s2d TcJc 7c8c ThAd 5cQs 3c9c"));
  }

  @Test
  public void test_texas_holdem_5438_3c5hJcJsQh_2h6c_Jd4c_8h7c_2c6s_3hAs_7s9d_4hTd_9h5d_Qd3s() {
    assertEquals(
      "2c6s=2h6c 8h7c 7s9d 4hTd 3hAs 9h5d Qd3s Jd4c",
      Solver.process("texas-holdem 3c5hJcJsQh 2h6c Jd4c 8h7c 2c6s 3hAs 7s9d 4hTd 9h5d Qd3s"));
  }

  @Test
  public void test_texas_holdem_5439_5c6c6s8dAd_Kc2s_AhKs_2h7s_9cJc_TsTc_8h5d_ThQd_Td4c() {
    assertEquals(
      "2h7s Td4c 9cJc ThQd Kc2s 8h5d TsTc AhKs",
      Solver.process("texas-holdem 5c6c6s8dAd Kc2s AhKs 2h7s 9cJc TsTc 8h5d ThQd Td4c"));
  }

  @Test
  public void test_texas_holdem_5440_5d6c7c9cQh_9hKc_8d6d_AdTh_TcKs() {
    assertEquals(
      "TcKs AdTh 9hKc 8d6d",
      Solver.process("texas-holdem 5d6c7c9cQh 9hKc 8d6d AdTh TcKs"));
  }

  @Test
  public void test_texas_holdem_5441_8hAsJsKcKh_9h7c_Ad9d_4d2s_3dTs_Ks7h_Jc9c() {
    assertEquals(
      "4d2s 9h7c 3dTs Jc9c Ad9d Ks7h",
      Solver.process("texas-holdem 8hAsJsKcKh 9h7c Ad9d 4d2s 3dTs Ks7h Jc9c"));
  }

  @Test
  public void test_texas_holdem_5442_4c6s8s9dKs_2h5c_6hQc_4s5s_9s2c_4dKc_6d6c() {
    assertEquals(
      "2h5c 6hQc 9s2c 4dKc 6d6c 4s5s",
      Solver.process("texas-holdem 4c6s8s9dKs 2h5c 6hQc 4s5s 9s2c 4dKc 6d6c"));
  }

  @Test
  public void test_texas_holdem_5443_6c7d9hAsJc_2sKd_AdQh_5h9d_7sQd_Tc8c_3h4d() {
    assertEquals(
      "3h4d 2sKd 7sQd 5h9d AdQh Tc8c",
      Solver.process("texas-holdem 6c7d9hAsJc 2sKd AdQh 5h9d 7sQd Tc8c 3h4d"));
  }

  @Test
  public void test_texas_holdem_5444_2d2s4cJdQd_7cAs_7h2h_Kh8s_5sJh() {
    assertEquals(
      "Kh8s 7cAs 5sJh 7h2h",
      Solver.process("texas-holdem 2d2s4cJdQd 7cAs 7h2h Kh8s 5sJh"));
  }

  @Test
  public void test_texas_holdem_5445_2s3h7sKcQh_3s4s_7cAc_Ts8d_Jd2h_Ad8c_7hAh() {
    assertEquals(
      "Ts8d Ad8c Jd2h 3s4s 7cAc=7hAh",
      Solver.process("texas-holdem 2s3h7sKcQh 3s4s 7cAc Ts8d Jd2h Ad8c 7hAh"));
  }

  @Test
  public void test_texas_holdem_5446_3c4c5hJhQd_5d9d_KhQc_2dAd_KsTc() {
    assertEquals(
      "KsTc 5d9d KhQc 2dAd",
      Solver.process("texas-holdem 3c4c5hJhQd 5d9d KhQc 2dAd KsTc"));
  }

  @Test
  public void test_texas_holdem_5447_4d5d6hKcQd_5s6s_8cTh_Qh4h() {
    assertEquals(
      "8cTh 5s6s Qh4h",
      Solver.process("texas-holdem 4d5d6hKcQd 5s6s 8cTh Qh4h"));
  }

  @Test
  public void test_texas_holdem_5448_2h9cKdQcQd_Jd5c_7d3h_TcTd_Js5s() {
    assertEquals(
      "7d3h Jd5c=Js5s TcTd",
      Solver.process("texas-holdem 2h9cKdQcQd Jd5c 7d3h TcTd Js5s"));
  }

  @Test
  public void test_texas_holdem_5449_5h6dAhJdJh_4c2d_3d6c_3hQd_Ts7d_9h6h_Td9s_AsQh_Ks7s_Kd2s() {
    assertEquals(
      "4c2d Ts7d Td9s 3hQd Kd2s Ks7s 3d6c AsQh 9h6h",
      Solver.process("texas-holdem 5h6dAhJdJh 4c2d 3d6c 3hQd Ts7d 9h6h Td9s AsQh Ks7s Kd2s"));
  }

  @Test
  public void test_texas_holdem_5450_3c7s8cAcKd_2sTd_9cTs_As8h_Qd3s_5d2c_Jh5h() {
    assertEquals(
      "5d2c 2sTd 9cTs Jh5h Qd3s As8h",
      Solver.process("texas-holdem 3c7s8cAcKd 2sTd 9cTs As8h Qd3s 5d2c Jh5h"));
  }

  @Test
  public void test_texas_holdem_5451_2s3s7c8hJh_Ah2h_Kc5d_Qc4h_Ad5c_2dAs_KsTs() {
    assertEquals(
      "Qc4h Kc5d KsTs Ad5c 2dAs=Ah2h",
      Solver.process("texas-holdem 2s3s7c8hJh Ah2h Kc5d Qc4h Ad5c 2dAs KsTs"));
  }

  @Test
  public void test_texas_holdem_5452_2d4s5c6c6s_9d3c_3s8d_4hKs_2hQh() {
    assertEquals(
      "2hQh 4hKs 3s8d=9d3c",
      Solver.process("texas-holdem 2d4s5c6c6s 9d3c 3s8d 4hKs 2hQh"));
  }

  @Test
  public void test_texas_holdem_5453_2s5d6s9hJh_JsQd_Qs9d_Jd3c_4c6h_3s7d_9sAc_JcAs_9c4s() {
    assertEquals(
      "3s7d 4c6h 9c4s Qs9d 9sAc Jd3c JsQd JcAs",
      Solver.process("texas-holdem 2s5d6s9hJh JsQd Qs9d Jd3c 4c6h 3s7d 9sAc JcAs 9c4s"));
  }

  @Test
  public void test_texas_holdem_5454_4h7h8d8sQd_7s5c_Kd4c_5sKs_AdAs_8h3s_Jc7d_Ts3d_5dKc_TdTh() {
    assertEquals(
      "Ts3d 5dKc=5sKs Kd4c 7s5c=Jc7d TdTh AdAs 8h3s",
      Solver.process("texas-holdem 4h7h8d8sQd 7s5c Kd4c 5sKs AdAs 8h3s Jc7d Ts3d 5dKc TdTh"));
  }

  @Test
  public void test_texas_holdem_5455_5c6d7cQsTc_9h2c_Kh8s() {
    assertEquals(
      "9h2c Kh8s",
      Solver.process("texas-holdem 5c6d7cQsTc 9h2c Kh8s"));
  }

  @Test
  public void test_texas_holdem_5456_3h8c8hAdKc_7dJh_5s7c_6h6s_2cKh() {
    assertEquals(
      "5s7c 7dJh 6h6s 2cKh",
      Solver.process("texas-holdem 3h8c8hAdKc 7dJh 5s7c 6h6s 2cKh"));
  }

  @Test
  public void test_texas_holdem_5457_5s7sKdQhTd_Jd6d_7dKs() {
    assertEquals(
      "Jd6d 7dKs",
      Solver.process("texas-holdem 5s7sKdQhTd Jd6d 7dKs"));
  }

  @Test
  public void test_texas_holdem_5458_5d7c7dAhTd_4dQd_8sQs_Kh2c_8d3h_8hKs_7h4c_9sJh_ThKc() {
    assertEquals(
      "8d3h 9sJh 8sQs 8hKs=Kh2c ThKc 7h4c 4dQd",
      Solver.process("texas-holdem 5d7c7dAhTd 4dQd 8sQs Kh2c 8d3h 8hKs 7h4c 9sJh ThKc"));
  }

  @Test
  public void test_texas_holdem_5459_4s5c6dQcQh_5d9c_Kh6h_TdKd_7d4d_3s8h_Qs7s_9d5s() {
    assertEquals(
      "3s8h TdKd 7d4d 5d9c=9d5s Kh6h Qs7s",
      Solver.process("texas-holdem 4s5c6dQcQh 5d9c Kh6h TdKd 7d4d 3s8h Qs7s 9d5s"));
  }

  @Test
  public void test_texas_holdem_5460_6s7d9dAsTs_3cTd_Kc4s_Qs4c_6d4d_8dTh_TcKh_2h3s_Jh9h_Qd9c() {
    assertEquals(
      "2h3s Qs4c Kc4s 6d4d Jh9h Qd9c 3cTd TcKh 8dTh",
      Solver.process("texas-holdem 6s7d9dAsTs 3cTd Kc4s Qs4c 6d4d 8dTh TcKh 2h3s Jh9h Qd9c"));
  }

  @Test
  public void test_texas_holdem_5461_3s4d4s6cQd_Qs4c_9s8c_Ac5h_9d9h_2h8h_Kc3d() {
    assertEquals(
      "2h8h 9s8c Ac5h Kc3d 9d9h Qs4c",
      Solver.process("texas-holdem 3s4d4s6cQd Qs4c 9s8c Ac5h 9d9h 2h8h Kc3d"));
  }

  @Test
  public void test_texas_holdem_5462_4h6cAcJhTs_8hQh_JdQd_8cQc_5cKd_6h3h_TcJs_9cAs_9h3s() {
    assertEquals(
      "9h3s 8cQc=8hQh 5cKd 6h3h JdQd 9cAs TcJs",
      Solver.process("texas-holdem 4h6cAcJhTs 8hQh JdQd 8cQc 5cKd 6h3h TcJs 9cAs 9h3s"));
  }

  @Test
  public void test_texas_holdem_5463_6dAcAsQsTd_2hTh_2sQh() {
    assertEquals(
      "2hTh 2sQh",
      Solver.process("texas-holdem 6dAcAsQsTd 2hTh 2sQh"));
  }

  @Test
  public void test_texas_holdem_5464_4c7sJhKcTs_4dQd_Jd9d_2s7h_5s6c_8cKd() {
    assertEquals(
      "5s6c 4dQd 2s7h Jd9d 8cKd",
      Solver.process("texas-holdem 4c7sJhKcTs 4dQd Jd9d 2s7h 5s6c 8cKd"));
  }

  @Test
  public void test_texas_holdem_5465_2d4c7h7sKc_AdQs_6c6s_2c2h_2sAh_7cQd_AsTc_Qc5c_4s3d_6d9d() {
    assertEquals(
      "6d9d Qc5c AsTc AdQs 2sAh 4s3d 6c6s 7cQd 2c2h",
      Solver.process("texas-holdem 2d4c7h7sKc AdQs 6c6s 2c2h 2sAh 7cQd AsTc Qc5c 4s3d 6d9d"));
  }

  @Test
  public void test_texas_holdem_5466_2h4s9dAdQd_Qh8s_4dJh_Tc6h_2cAh_5d2s_8c7c() {
    assertEquals(
      "8c7c Tc6h 5d2s 4dJh Qh8s 2cAh",
      Solver.process("texas-holdem 2h4s9dAdQd Qh8s 4dJh Tc6h 2cAh 5d2s 8c7c"));
  }

  @Test
  public void test_texas_holdem_5467_2c7c7s9hTc_AhTs_4c3c_Th4s_2d8c_As6c() {
    assertEquals(
      "As6c 2d8c Th4s AhTs 4c3c",
      Solver.process("texas-holdem 2c7c7s9hTc AhTs 4c3c Th4s 2d8c As6c"));
  }

  @Test
  public void test_texas_holdem_5468_4c4s5cAdTh_7h7c_2sJs_7d3h() {
    assertEquals(
      "7d3h 2sJs 7h7c",
      Solver.process("texas-holdem 4c4s5cAdTh 7h7c 2sJs 7d3h"));
  }

  @Test
  public void test_texas_holdem_5469_6h7d9cJdTh_KcAd_8c4d_Ah9h() {
    assertEquals(
      "KcAd Ah9h 8c4d",
      Solver.process("texas-holdem 6h7d9cJdTh KcAd 8c4d Ah9h"));
  }

  @Test
  public void test_texas_holdem_5470_3s5h6s9hJs_2dTc_3h4s_4cQs_7c6h_5dTd_2h7d_8sJh_AhJc() {
    assertEquals(
      "2h7d 2dTc 4cQs 3h4s 5dTd 7c6h 8sJh AhJc",
      Solver.process("texas-holdem 3s5h6s9hJs 2dTc 3h4s 4cQs 7c6h 5dTd 2h7d 8sJh AhJc"));
  }

  @Test
  public void test_texas_holdem_5471_3c4c5d8sKs_6h9s_3h7c() {
    assertEquals(
      "6h9s 3h7c",
      Solver.process("texas-holdem 3c4c5d8sKs 6h9s 3h7c"));
  }

  @Test
  public void test_texas_holdem_5472_2c5h8sJdQs_Qc2h_TsTc_Ac6d_3h8h_As4s_4c7d_Ks4d_7hKh() {
    assertEquals(
      "4c7d Ks4d 7hKh As4s Ac6d 3h8h TsTc Qc2h",
      Solver.process("texas-holdem 2c5h8sJdQs Qc2h TsTc Ac6d 3h8h As4s 4c7d Ks4d 7hKh"));
  }

  @Test
  public void test_texas_holdem_5473_7d9cAcTcTd_8s2s_AdKd_4s8d_2c4h() {
    assertEquals(
      "2c4h 4s8d=8s2s AdKd",
      Solver.process("texas-holdem 7d9cAcTcTd 8s2s AdKd 4s8d 2c4h"));
  }

  @Test
  public void test_texas_holdem_5474_6d9cJcTcTh_3dQc_7d2s_KdJs_6c5d_5h8s_Jd9d_4c5s() {
    assertEquals(
      "4c5s 7d2s 5h8s 3dQc 6c5d Jd9d KdJs",
      Solver.process("texas-holdem 6d9cJcTcTh 3dQc 7d2s KdJs 6c5d 5h8s Jd9d 4c5s"));
  }

  @Test
  public void test_texas_holdem_5475_3s6d9sKcQc_TcJc_Td2c_Ts2h_8s8c() {
    assertEquals(
      "Td2c=Ts2h 8s8c TcJc",
      Solver.process("texas-holdem 3s6d9sKcQc TcJc Td2c Ts2h 8s8c"));
  }

  @Test
  public void test_texas_holdem_5476_2s6hJhKcQh_5s8c_9h8d_3dJc_7h2d_Jd8h_5c5d_ThKd_Qs7s() {
    assertEquals(
      "5s8c 9h8d 7h2d 5c5d 3dJc Jd8h Qs7s ThKd",
      Solver.process("texas-holdem 2s6hJhKcQh 5s8c 9h8d 3dJc 7h2d Jd8h 5c5d ThKd Qs7s"));
  }

  @Test
  public void test_texas_holdem_5477_3h8c8dJhTd_QdKh_2h7c_6hQh_4d4c() {
    assertEquals(
      "2h7c 6hQh QdKh 4d4c",
      Solver.process("texas-holdem 3h8c8dJhTd QdKh 2h7c 6hQh 4d4c"));
  }

  @Test
  public void test_texas_holdem_5478_4d6cKcKdQc_4h7s_9h6s_Qd4c_9sJh_Jc7h_Tc5s_JsKs() {
    assertEquals(
      "Tc5s Jc7h 9sJh 4h7s 9h6s Qd4c JsKs",
      Solver.process("texas-holdem 4d6cKcKdQc 4h7s 9h6s Qd4c 9sJh Jc7h Tc5s JsKs"));
  }

  @Test
  public void test_texas_holdem_5479_2d3hQcQsTd_8h9c_8sJs_Ah2h_7hAc_5d7d() {
    assertEquals(
      "5d7d 8h9c 8sJs 7hAc Ah2h",
      Solver.process("texas-holdem 2d3hQcQsTd 8h9c 8sJs Ah2h 7hAc 5d7d"));
  }

  @Test
  public void test_texas_holdem_5480_7dJhJsKdTc_Jc6c_Td5d_4s6d_4h2d_7h9h_Ac7c_8sQs() {
    assertEquals(
      "4h2d=4s6d 8sQs 7h9h Ac7c Td5d Jc6c",
      Solver.process("texas-holdem 7dJhJsKdTc Jc6c Td5d 4s6d 4h2d 7h9h Ac7c 8sQs"));
  }

  @Test
  public void test_texas_holdem_5481_5c7d8sAsJd_8dJc_AdJh() {
    assertEquals(
      "8dJc AdJh",
      Solver.process("texas-holdem 5c7d8sAsJd 8dJc AdJh"));
  }

  @Test
  public void test_texas_holdem_5482_2s7d8hAdJh_9cQc_Ah3h_3d2d() {
    assertEquals(
      "9cQc 3d2d Ah3h",
      Solver.process("texas-holdem 2s7d8hAdJh 9cQc Ah3h 3d2d"));
  }

  @Test
  public void test_texas_holdem_5483_2s5d6h7d8c_Jh7s_As5s_TcKc_3cAh_Js8s_7c2h() {
    assertEquals(
      "TcKc 3cAh As5s Jh7s Js8s 7c2h",
      Solver.process("texas-holdem 2s5d6h7d8c Jh7s As5s TcKc 3cAh Js8s 7c2h"));
  }

  @Test
  public void test_texas_holdem_5484_4d5d5sAdKh_8s5c_9sAc_TdKc_9h6s_8c3h_7d8d_7hQd_Ks4c_6dJs() {
    assertEquals(
      "8c3h 9h6s 6dJs 7hQd Ks4c=TdKc 9sAc 8s5c 7d8d",
      Solver.process("texas-holdem 4d5d5sAdKh 8s5c 9sAc TdKc 9h6s 8c3h 7d8d 7hQd Ks4c 6dJs"));
  }

  @Test
  public void test_texas_holdem_5485_7dJsKcKsQh_8c4c_Kd4h_Td4s_9s9c_5hTc_QsQd_7s8h_2sQc_3s3d() {
    assertEquals(
      "8c4c 5hTc=Td4s 3s3d 7s8h 9s9c 2sQc Kd4h QsQd",
      Solver.process("texas-holdem 7dJsKcKsQh 8c4c Kd4h Td4s 9s9c 5hTc QsQd 7s8h 2sQc 3s3d"));
  }

  @Test
  public void test_texas_holdem_5486_4d4h6h7c7s_6c8c_TdQc_2hJc_Kc5h() {
    assertEquals(
      "2hJc TdQc Kc5h 6c8c",
      Solver.process("texas-holdem 4d4h6h7c7s 6c8c TdQc 2hJc Kc5h"));
  }

  @Test
  public void test_texas_holdem_5487_2s4d5s6s9d_8dKs_8c5h_KcJs_Kh4h_8s3d_7hJd_4cAd() {
    assertEquals(
      "7hJd 8dKs KcJs Kh4h 4cAd 8c5h 8s3d",
      Solver.process("texas-holdem 2s4d5s6s9d 8dKs 8c5h KcJs Kh4h 8s3d 7hJd 4cAd"));
  }

  @Test
  public void test_texas_holdem_5488_3c9dAhJdQs_4h9c_As3h_4dQc_8dJc() {
    assertEquals(
      "4h9c 8dJc 4dQc As3h",
      Solver.process("texas-holdem 3c9dAhJdQs 4h9c As3h 4dQc 8dJc"));
  }

  @Test
  public void test_texas_holdem_5489_5d8dJcJhKc_7sTs_4c3h_9c4h_Ac3s_As4s_JdQh_Qc2h() {
    assertEquals(
      "4c3h 9c4h 7sTs Qc2h Ac3s=As4s JdQh",
      Solver.process("texas-holdem 5d8dJcJhKc 7sTs 4c3h 9c4h Ac3s As4s JdQh Qc2h"));
  }

  @Test
  public void test_texas_holdem_5490_4h4s9sAhTh_7cKc_Ks7d_Tc5c_Qs6h_3d5s() {
    assertEquals(
      "3d5s Qs6h 7cKc=Ks7d Tc5c",
      Solver.process("texas-holdem 4h4s9sAhTh 7cKc Ks7d Tc5c Qs6h 3d5s"));
  }

  @Test
  public void test_texas_holdem_5491_4s5hAdJcQd_5cAh_QsQc_8c9d_TdJd_Kh5s_8s7h_7sTs() {
    assertEquals(
      "8s7h 8c9d 7sTs Kh5s TdJd 5cAh QsQc",
      Solver.process("texas-holdem 4s5hAdJcQd 5cAh QsQc 8c9d TdJd Kh5s 8s7h 7sTs"));
  }

  @Test
  public void test_texas_holdem_5492_2h3dJcJdTc_Js9s_Jh9d_4h8s_AsTd_5c9c_7d8c_ThKh_Ah7s_5hQc() {
    assertEquals(
      "4h8s 7d8c 5c9c 5hQc Ah7s ThKh AsTd Jh9d=Js9s",
      Solver.process("texas-holdem 2h3dJcJdTc Js9s Jh9d 4h8s AsTd 5c9c 7d8c ThKh Ah7s 5hQc"));
  }

  @Test
  public void test_texas_holdem_5493_2c6cKdTdTs_4d6h_As3h_9s8d() {
    assertEquals(
      "9s8d As3h 4d6h",
      Solver.process("texas-holdem 2c6cKdTdTs 4d6h As3h 9s8d"));
  }

  @Test
  public void test_texas_holdem_5494_5c7sAsQhTc_ThKh_6sQc_9cJh_3dJd_Kd7c_9s2d_3s8d() {
    assertEquals(
      "3s8d 9s2d 3dJd 9cJh Kd7c ThKh 6sQc",
      Solver.process("texas-holdem 5c7sAsQhTc ThKh 6sQc 9cJh 3dJd Kd7c 9s2d 3s8d"));
  }

  @Test
  public void test_texas_holdem_5495_4s5c5h9cJh_6hJd_8d9d_Tc6s_7h4d_AsJc() {
    assertEquals(
      "Tc6s 7h4d 8d9d 6hJd AsJc",
      Solver.process("texas-holdem 4s5c5h9cJh 6hJd 8d9d Tc6s 7h4d AsJc"));
  }

  @Test
  public void test_texas_holdem_5496_2d3d6s8hKd_9hAh_3cQh_6dJc_7h2s_5c7s_Ts8s_Js2h_Tc2c_Kc3h() {
    assertEquals(
      "5c7s 9hAh 7h2s Tc2c Js2h 3cQh 6dJc Ts8s Kc3h",
      Solver.process("texas-holdem 2d3d6s8hKd 9hAh 3cQh 6dJc 7h2s 5c7s Ts8s Js2h Tc2c Kc3h"));
  }

  @Test
  public void test_texas_holdem_5497_4c4s5c8cKc_Jd8d_9hAc_9dKd_7s5h_Js4d_Qh9s_6d6c_2sQd_2d2c() {
    assertEquals(
      "2sQd Qh9s 7s5h Jd8d 9dKd Js4d 2d2c 6d6c 9hAc",
      Solver.process("texas-holdem 4c4s5c8cKc Jd8d 9hAc 9dKd 7s5h Js4d Qh9s 6d6c 2sQd 2d2c"));
  }

  @Test
  public void test_texas_holdem_5498_6h8s9sTcTh_2dKs_Qd6d_5hTs_3c5s_TdAd_7dQs_9h2h_3sAc() {
    assertEquals(
      "3c5s 2dKs 3sAc Qd6d 9h2h 5hTs TdAd 7dQs",
      Solver.process("texas-holdem 6h8s9sTcTh 2dKs Qd6d 5hTs 3c5s TdAd 7dQs 9h2h 3sAc"));
  }

  @Test
  public void test_texas_holdem_5499_3d9dAhJhQd_9c2c_5sAd_Js2h_2s6h_7c8h_5d4s_8s2d() {
    assertEquals(
      "5d4s 2s6h 7c8h=8s2d 9c2c Js2h 5sAd",
      Solver.process("texas-holdem 3d9dAhJhQd 9c2c 5sAd Js2h 2s6h 7c8h 5d4s 8s2d"));
  }

}
