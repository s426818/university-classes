
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver33HiddenTest {


  @Test
  public void test_texas_holdem_8250_7d9hKdQhTs_Ks2s_Jh6d_Td8c() {
    assertEquals(
      "Td8c Ks2s Jh6d",
      Solver.process("texas-holdem 7d9hKdQhTs Ks2s Jh6d Td8c"));
  }

  @Test
  public void test_texas_holdem_8251_9sAdQcTcTh_8sKc_3cJd_Jc4c_5sKh_7c3h_2h6d_3d8d() {
    assertEquals(
      "2h6d=3d8d=7c3h 3cJd=Jc4c 5sKh=8sKc",
      Solver.process("texas-holdem 9sAdQcTcTh 8sKc 3cJd Jc4c 5sKh 7c3h 2h6d 3d8d"));
  }

  @Test
  public void test_texas_holdem_8252_4d4h6s9cKh_7sQd_Qs5c_6dQh_5sTc_3s2d() {
    assertEquals(
      "3s2d 5sTc 7sQd=Qs5c 6dQh",
      Solver.process("texas-holdem 4d4h6s9cKh 7sQd Qs5c 6dQh 5sTc 3s2d"));
  }

  @Test
  public void test_texas_holdem_8253_3s4s9c9hTs_AcTh_8c7h() {
    assertEquals(
      "8c7h AcTh",
      Solver.process("texas-holdem 3s4s9c9hTs AcTh 8c7h"));
  }

  @Test
  public void test_texas_holdem_8254_3h6cAsKdTc_JsJd_QsKh_8h7s_6sJh_4s4c_6d4h() {
    assertEquals(
      "8h7s 4s4c 6d4h 6sJh JsJd QsKh",
      Solver.process("texas-holdem 3h6cAsKdTc JsJd QsKh 8h7s 6sJh 4s4c 6d4h"));
  }

  @Test
  public void test_texas_holdem_8255_3h6c8dAcKs_4c2c_5c9s_Js9c() {
    assertEquals(
      "4c2c 5c9s Js9c",
      Solver.process("texas-holdem 3h6c8dAcKs 4c2c 5c9s Js9c"));
  }

  @Test
  public void test_texas_holdem_8256_2c9cKsThTs_Qs9h_Kd8d_9d4h_8c3s_Tc4s() {
    assertEquals(
      "8c3s 9d4h=Qs9h Kd8d Tc4s",
      Solver.process("texas-holdem 2c9cKsThTs Qs9h Kd8d 9d4h 8c3s Tc4s"));
  }

  @Test
  public void test_texas_holdem_8257_5c8d8sJdTs_Qc9c_2sJs() {
    assertEquals(
      "2sJs Qc9c",
      Solver.process("texas-holdem 5c8d8sJdTs Qc9c 2sJs"));
  }

  @Test
  public void test_texas_holdem_8258_5d5s7h9cAc_5h4d_3s5c_Qc4s() {
    assertEquals(
      "Qc4s 3s5c=5h4d",
      Solver.process("texas-holdem 5d5s7h9cAc 5h4d 3s5c Qc4s"));
  }

  @Test
  public void test_texas_holdem_8259_4h7d8sAhJc_5d2s_5h7h_3h2h_Td7c() {
    assertEquals(
      "3h2h 5d2s 5h7h Td7c",
      Solver.process("texas-holdem 4h7d8sAhJc 5d2s 5h7h 3h2h Td7c"));
  }

  @Test
  public void test_texas_holdem_8260_4s5c6s8sKh_2dKs_3hTs() {
    assertEquals(
      "3hTs 2dKs",
      Solver.process("texas-holdem 4s5c6s8sKh 2dKs 3hTs"));
  }

  @Test
  public void test_texas_holdem_8261_3s5s6sAdAh_KsAs_4c3c() {
    assertEquals(
      "4c3c KsAs",
      Solver.process("texas-holdem 3s5s6sAdAh KsAs 4c3c"));
  }

  @Test
  public void test_texas_holdem_8262_2h5s9dTcTs_3s7s_5cTd_QsKs_Ac9c_3c8d_3h7c_AsJh_4c7d() {
    assertEquals(
      "3h7c=3s7s=4c7d 3c8d QsKs AsJh Ac9c 5cTd",
      Solver.process("texas-holdem 2h5s9dTcTs 3s7s 5cTd QsKs Ac9c 3c8d 3h7c AsJh 4c7d"));
  }

  @Test
  public void test_texas_holdem_8263_2d4s9cJcTc_8c5c_5sAh_7hKd_7d3s_Js3c_8d5h_9sQs_Ac2c() {
    assertEquals(
      "7d3s 8d5h 7hKd 5sAh 9sQs Js3c 8c5c Ac2c",
      Solver.process("texas-holdem 2d4s9cJcTc 8c5c 5sAh 7hKd 7d3s Js3c 8d5h 9sQs Ac2c"));
  }

  @Test
  public void test_texas_holdem_8264_7h9d9sAdTc_9c6h_AsTd_4sKs_5dKd_Th8d_7c8c_3h5h_4dQd() {
    assertEquals(
      "3h5h 4dQd 4sKs=5dKd 7c8c Th8d AsTd 9c6h",
      Solver.process("texas-holdem 7h9d9sAdTc 9c6h AsTd 4sKs 5dKd Th8d 7c8c 3h5h 4dQd"));
  }

  @Test
  public void test_texas_holdem_8265_7d7s9sJhQh_Td9d_6c7h_KcQc_AsQd_8h3d_3c6s_Kh9h_Ac2c() {
    assertEquals(
      "3c6s=8h3d Ac2c Td9d Kh9h KcQc AsQd 6c7h",
      Solver.process("texas-holdem 7d7s9sJhQh Td9d 6c7h KcQc AsQd 8h3d 3c6s Kh9h Ac2c"));
  }

  @Test
  public void test_texas_holdem_8266_2c3h6d7d8s_As4s_Ks3s_QhJc_Tc5c() {
    assertEquals(
      "Tc5c QhJc As4s Ks3s",
      Solver.process("texas-holdem 2c3h6d7d8s As4s Ks3s QhJc Tc5c"));
  }

  @Test
  public void test_texas_holdem_8267_5d7cAhJhQd_QcTh_8c9c_KcKd_Ts8d_8s2h_6cTd_3cTc_5h7h_2d6h() {
    assertEquals(
      "2d6h 8s2h 8c9c 3cTc=6cTd Ts8d QcTh KcKd 5h7h",
      Solver.process("texas-holdem 5d7cAhJhQd QcTh 8c9c KcKd Ts8d 8s2h 6cTd 3cTc 5h7h 2d6h"));
  }

  @Test
  public void test_texas_holdem_8268_4c4s5h6sAc_8h7d_5dKs_2d9c() {
    assertEquals(
      "2d9c 5dKs 8h7d",
      Solver.process("texas-holdem 4c4s5h6sAc 8h7d 5dKs 2d9c"));
  }

  @Test
  public void test_texas_holdem_8269_AcAsJdTcTd_7d3c_8sJs_4c2c_6hKd_5s3s() {
    assertEquals(
      "4c2c=5s3s=7d3c 6hKd 8sJs",
      Solver.process("texas-holdem AcAsJdTcTd 7d3c 8sJs 4c2c 6hKd 5s3s"));
  }

  @Test
  public void test_texas_holdem_8270_3c5s8dKcQh_5h2h_Qs9d() {
    assertEquals(
      "5h2h Qs9d",
      Solver.process("texas-holdem 3c5s8dKcQh 5h2h Qs9d"));
  }

  @Test
  public void test_texas_holdem_8271_3c4h5s7d7s_AcAd_Jd2d_Jc6c_Ts6s_4d9d_8c4c_7h5c_3sAs() {
    assertEquals(
      "Jd2d 3sAs 8c4c 4d9d AcAd Jc6c=Ts6s 7h5c",
      Solver.process("texas-holdem 3c4h5s7d7s AcAd Jd2d Jc6c Ts6s 4d9d 8c4c 7h5c 3sAs"));
  }

  @Test
  public void test_texas_holdem_8272_8c8s9sJcTs_6h6s_AcTc_7s4c() {
    assertEquals(
      "6h6s AcTc 7s4c",
      Solver.process("texas-holdem 8c8s9sJcTs 6h6s AcTc 7s4c"));
  }

  @Test
  public void test_texas_holdem_8273_6c8cAdQhTh_2sKc_As2h_Jc6h_5h3h_8hJs_4d4c_9c9d_6sQs_Kd7c() {
    assertEquals(
      "5h3h 2sKc=Kd7c 4d4c Jc6h 8hJs 9c9d As2h 6sQs",
      Solver.process("texas-holdem 6c8cAdQhTh 2sKc As2h Jc6h 5h3h 8hJs 4d4c 9c9d 6sQs Kd7c"));
  }

  @Test
  public void test_texas_holdem_8274_3h6c8sJhKs_Qc8c_4d3c() {
    assertEquals(
      "4d3c Qc8c",
      Solver.process("texas-holdem 3h6c8sJhKs Qc8c 4d3c"));
  }

  @Test
  public void test_texas_holdem_8275_2s5c8h8sAd_5h9h_9cTh_2h8c_7cQd_AhJd() {
    assertEquals(
      "9cTh 7cQd 5h9h AhJd 2h8c",
      Solver.process("texas-holdem 2s5c8h8sAd 5h9h 9cTh 2h8c 7cQd AhJd"));
  }

  @Test
  public void test_texas_holdem_8276_5c7h8dAcJd_Tc5d_3s3h_6dQs_8h6h_Kc4c_AsQh() {
    assertEquals(
      "6dQs Kc4c 3s3h Tc5d 8h6h AsQh",
      Solver.process("texas-holdem 5c7h8dAcJd Tc5d 3s3h 6dQs 8h6h Kc4c AsQh"));
  }

  @Test
  public void test_texas_holdem_8277_3c3h4h6cAc_5c9c_2hQc_2dJs_5hKh_3sKs_2sJd_9hKd_Qd6d() {
    assertEquals(
      "2dJs=2sJd 2hQc 5hKh 9hKd Qd6d 3sKs 5c9c",
      Solver.process("texas-holdem 3c3h4h6cAc 5c9c 2hQc 2dJs 5hKh 3sKs 2sJd 9hKd Qd6d"));
  }

  @Test
  public void test_texas_holdem_8278_5d5s8c9hTh_3hKs_6c9s_Jd7s_8dKc_3cAd_6dKh_JhKd_4h6s_7d3d() {
    assertEquals(
      "4h6s=7d3d 3hKs=6dKh JhKd 3cAd 8dKc 6c9s Jd7s",
      Solver.process("texas-holdem 5d5s8c9hTh 3hKs 6c9s Jd7s 8dKc 3cAd 6dKh JhKd 4h6s 7d3d"));
  }

  @Test
  public void test_texas_holdem_8279_2h2s6c8cJc_TcKh_4hJd_5d3d() {
    assertEquals(
      "5d3d TcKh 4hJd",
      Solver.process("texas-holdem 2h2s6c8cJc TcKh 4hJd 5d3d"));
  }

  @Test
  public void test_texas_holdem_8280_4s6sJdKsQc_6cJc_3c8c_4d4c_9dJh_JsQh_8dQd() {
    assertEquals(
      "3c8c 9dJh 8dQd 6cJc JsQh 4d4c",
      Solver.process("texas-holdem 4s6sJdKsQc 6cJc 3c8c 4d4c 9dJh JsQh 8dQd"));
  }

  @Test
  public void test_texas_holdem_8281_3h3s5cAsQc_6s9s_2c7d_4dJd_4h6d_Ac3d_Kh9c_AhQh() {
    assertEquals(
      "4h6d 2c7d 6s9s 4dJd Kh9c AhQh Ac3d",
      Solver.process("texas-holdem 3h3s5cAsQc 6s9s 2c7d 4dJd 4h6d Ac3d Kh9c AhQh"));
  }

  @Test
  public void test_texas_holdem_8282_2d5sAcQcTh_KsJh_2h9d_TdKh_Ts3s_4c5d() {
    assertEquals(
      "2h9d 4c5d Ts3s TdKh KsJh",
      Solver.process("texas-holdem 2d5sAcQcTh KsJh 2h9d TdKh Ts3s 4c5d"));
  }

  @Test
  public void test_texas_holdem_8283_3h9cAdKcTc_7cTh_As3d_QdJh_KsKh() {
    assertEquals(
      "7cTh As3d KsKh QdJh",
      Solver.process("texas-holdem 3h9cAdKcTc 7cTh As3d QdJh KsKh"));
  }

  @Test
  public void test_texas_holdem_8284_3h3s6c6hKs_5h4c_Qd3c_9c4h_JsAd() {
    assertEquals(
      "5h4c=9c4h JsAd Qd3c",
      Solver.process("texas-holdem 3h3s6c6hKs 5h4c Qd3c 9c4h JsAd"));
  }

  @Test
  public void test_texas_holdem_8285_2d2h9c9h9s_3c4d_7d2c_Jd5c_3s4c() {
    assertEquals(
      "3c4d=3s4c=7d2c=Jd5c",
      Solver.process("texas-holdem 2d2h9c9h9s 3c4d 7d2c Jd5c 3s4c"));
  }

  @Test
  public void test_texas_holdem_8286_5d6h7d7hKd_5h4c_9dTs_8dAs() {
    assertEquals(
      "9dTs 8dAs 5h4c",
      Solver.process("texas-holdem 5d6h7d7hKd 5h4c 9dTs 8dAs"));
  }

  @Test
  public void test_texas_holdem_8287_4c7c8cAcKc_6h2s_Kd9c() {
    assertEquals(
      "6h2s Kd9c",
      Solver.process("texas-holdem 4c7c8cAcKc 6h2s Kd9c"));
  }

  @Test
  public void test_texas_holdem_8288_3s4sQdQhTd_2h2c_5cJc_9h7h_6dKs_7c3c_9c2d() {
    assertEquals(
      "9c2d 9h7h 5cJc 6dKs 2h2c 7c3c",
      Solver.process("texas-holdem 3s4sQdQhTd 2h2c 5cJc 9h7h 6dKs 7c3c 9c2d"));
  }

  @Test
  public void test_texas_holdem_8289_AdJcJdQdTd_8hAh_JhKc_2h9c_Kd6c_7d5h_Qs4d_Qc2s_AcTc_9hTs() {
    assertEquals(
      "2h9c 9hTs Qc2s 8hAh=AcTc JhKc Qs4d 7d5h Kd6c",
      Solver.process("texas-holdem AdJcJdQdTd 8hAh JhKc 2h9c Kd6c 7d5h Qs4d Qc2s AcTc 9hTs"));
  }

  @Test
  public void test_texas_holdem_8290_2d2h8d9sJs_5d7d_4h6s_9cKd_2sJd_Kc6d_9h8h_3h4s_4d3c() {
    assertEquals(
      "3h4s=4d3c=4h6s=5d7d Kc6d 9cKd 9h8h 2sJd",
      Solver.process("texas-holdem 2d2h8d9sJs 5d7d 4h6s 9cKd 2sJd Kc6d 9h8h 3h4s 4d3c"));
  }

  @Test
  public void test_texas_holdem_8291_4s5d9hTdTh_4d6d_3cQh_8cAd_Js2h() {
    assertEquals(
      "Js2h 3cQh 8cAd 4d6d",
      Solver.process("texas-holdem 4s5d9hTdTh 4d6d 3cQh 8cAd Js2h"));
  }

  @Test
  public void test_texas_holdem_8292_5h8h8s9sJc_4h2d_Qh6s_6c8c_2hJh() {
    assertEquals(
      "4h2d Qh6s 2hJh 6c8c",
      Solver.process("texas-holdem 5h8h8s9sJc 4h2d Qh6s 6c8c 2hJh"));
  }

  @Test
  public void test_texas_holdem_8293_3c7c8sJdQh_3d3s_6h3h_2s9c() {
    assertEquals(
      "2s9c 6h3h 3d3s",
      Solver.process("texas-holdem 3c7c8sJdQh 3d3s 6h3h 2s9c"));
  }

  @Test
  public void test_texas_holdem_8294_5h7h7s9hQd_5s3d_JhTc_5cAd_7c8s_6c3s_Js5d_4cQs() {
    assertEquals(
      "6c3s JhTc 5s3d=Js5d 5cAd 4cQs 7c8s",
      Solver.process("texas-holdem 5h7h7s9hQd 5s3d JhTc 5cAd 7c8s 6c3s Js5d 4cQs"));
  }

  @Test
  public void test_texas_holdem_8295_2d2s6h8sTd_2cQh_7s6s_7dAd_8hKd() {
    assertEquals(
      "7dAd 7s6s 8hKd 2cQh",
      Solver.process("texas-holdem 2d2s6h8sTd 2cQh 7s6s 7dAd 8hKd"));
  }

  @Test
  public void test_texas_holdem_8296_6d6s8c9cKc_9sTh_AsKs_2d2c_Js8d_2s4s_Td5d_Ac7h() {
    assertEquals(
      "2s4s Td5d Ac7h 2d2c Js8d 9sTh AsKs",
      Solver.process("texas-holdem 6d6s8c9cKc 9sTh AsKs 2d2c Js8d 2s4s Td5d Ac7h"));
  }

  @Test
  public void test_texas_holdem_8297_3d5d6d7h9h_7c8h_6h8c_QsAd_AcJc_2sTd_9cQh_2d4d_6c5c_4s3s() {
    assertEquals(
      "2sTd AcJc QsAd 9cQh 6c5c 4s3s 6h8c=7c8h 2d4d",
      Solver.process("texas-holdem 3d5d6d7h9h 7c8h 6h8c QsAd AcJc 2sTd 9cQh 2d4d 6c5c 4s3s"));
  }

  @Test
  public void test_texas_holdem_8298_6h7c7h8cKc_7sAc_KhJc_Qd5c_9h7d_4d2d() {
    assertEquals(
      "4d2d Qd5c KhJc 9h7d 7sAc",
      Solver.process("texas-holdem 6h7c7h8cKc 7sAc KhJc Qd5c 9h7d 4d2d"));
  }

  @Test
  public void test_texas_holdem_8299_8hKsQcQsTs_3h4h_3s2d_4s7h_8d2h() {
    assertEquals(
      "3h4h=3s2d=4s7h 8d2h",
      Solver.process("texas-holdem 8hKsQcQsTs 3h4h 3s2d 4s7h 8d2h"));
  }

  @Test
  public void test_texas_holdem_8300_2h5s9sAsQh_6dJs_8h8d_4sAd_8c7d_5d6c() {
    assertEquals(
      "8c7d 6dJs 5d6c 8h8d 4sAd",
      Solver.process("texas-holdem 2h5s9sAsQh 6dJs 8h8d 4sAd 8c7d 5d6c"));
  }

  @Test
  public void test_texas_holdem_8301_5c7s8sKcQs_Ac2d_Td4s_9dKd_Th4h() {
    assertEquals(
      "Td4s=Th4h Ac2d 9dKd",
      Solver.process("texas-holdem 5c7s8sKcQs Ac2d Td4s 9dKd Th4h"));
  }

  @Test
  public void test_texas_holdem_8302_2c3d7h9dKc_6hTh_2hQc_Jd6s_8sAs() {
    assertEquals(
      "6hTh Jd6s 8sAs 2hQc",
      Solver.process("texas-holdem 2c3d7h9dKc 6hTh 2hQc Jd6s 8sAs"));
  }

  @Test
  public void test_texas_holdem_8303_6dJdKsThTs_9h7c_2h8c_8s6c_4d2c_Ad3h_2s5s() {
    assertEquals(
      "2s5s=4d2c 2h8c 9h7c Ad3h 8s6c",
      Solver.process("texas-holdem 6dJdKsThTs 9h7c 2h8c 8s6c 4d2c Ad3h 2s5s"));
  }

  @Test
  public void test_texas_holdem_8304_3s5s6sAcKc_As3c_4h8d_Td7s_8h4d_Qs5d() {
    assertEquals(
      "4h8d=8h4d Td7s Qs5d As3c",
      Solver.process("texas-holdem 3s5s6sAcKc As3c 4h8d Td7s 8h4d Qs5d"));
  }

  @Test
  public void test_texas_holdem_8305_6d7c8hKdQc_7sJh_Qd9c_JcQs_5d4h_Th2c() {
    assertEquals(
      "Th2c 7sJh Qd9c JcQs 5d4h",
      Solver.process("texas-holdem 6d7c8hKdQc 7sJh Qd9c JcQs 5d4h Th2c"));
  }

  @Test
  public void test_texas_holdem_8306_2c6sJdQcTh_4s9d_7dKc_5d3s() {
    assertEquals(
      "5d3s 4s9d 7dKc",
      Solver.process("texas-holdem 2c6sJdQcTh 4s9d 7dKc 5d3s"));
  }

  @Test
  public void test_texas_holdem_8307_2d5c5d9cQh_Jh4s_6h9s_JdQc_8s6c_8h3s_4hTc_KsAs() {
    assertEquals(
      "8h3s=8s6c 4hTc Jh4s KsAs 6h9s JdQc",
      Solver.process("texas-holdem 2d5c5d9cQh Jh4s 6h9s JdQc 8s6c 8h3s 4hTc KsAs"));
  }

  @Test
  public void test_texas_holdem_8308_4c6c6dKhTs_2hJs_AcTd_Qc9h_Jd9c_5hKd_2d3d_6s7s_5sAd() {
    assertEquals(
      "2d3d 2hJs=Jd9c Qc9h 5sAd AcTd 5hKd 6s7s",
      Solver.process("texas-holdem 4c6c6dKhTs 2hJs AcTd Qc9h Jd9c 5hKd 2d3d 6s7s 5sAd"));
  }

  @Test
  public void test_texas_holdem_8309_3c8h8s9c9s_5sQs_3h3s_7hJh_2hQd_AcTc_4h4d_6hAs() {
    assertEquals(
      "4h4d 7hJh 2hQd=5sQs 6hAs=AcTc 3h3s",
      Solver.process("texas-holdem 3c8h8s9c9s 5sQs 3h3s 7hJh 2hQd AcTc 4h4d 6hAs"));
  }

  @Test
  public void test_texas_holdem_8310_2h5h7c9dAd_2dTc_3h2c_9hQd_3cQs_ThQh_8h4d_4cAs() {
    assertEquals(
      "8h4d 3cQs ThQh 3h2c 2dTc 9hQd 4cAs",
      Solver.process("texas-holdem 2h5h7c9dAd 2dTc 3h2c 9hQd 3cQs ThQh 8h4d 4cAs"));
  }

  @Test
  public void test_texas_holdem_8311_2c4s5d8cQh_QdKh_3h9s_JdKs_6s2d() {
    assertEquals(
      "3h9s JdKs 6s2d QdKh",
      Solver.process("texas-holdem 2c4s5d8cQh QdKh 3h9s JdKs 6s2d"));
  }

  @Test
  public void test_texas_holdem_8312_3d4s9sAsKs_Kd5h_AhAc_9c9d() {
    assertEquals(
      "Kd5h 9c9d AhAc",
      Solver.process("texas-holdem 3d4s9sAsKs Kd5h AhAc 9c9d"));
  }

  @Test
  public void test_texas_holdem_8313_4d4s5c8d9s_JdAs_2h8s_5sTc() {
    assertEquals(
      "JdAs 5sTc 2h8s",
      Solver.process("texas-holdem 4d4s5c8d9s JdAs 2h8s 5sTc"));
  }

  @Test
  public void test_texas_holdem_8314_2d8c8sKhKs_2s6d_Qc2c_5h9c_3s4d() {
    assertEquals(
      "3s4d 2s6d 5h9c Qc2c",
      Solver.process("texas-holdem 2d8c8sKhKs 2s6d Qc2c 5h9c 3s4d"));
  }

  @Test
  public void test_texas_holdem_8315_3h9hQdTcTh_6h2c_Kh6d() {
    assertEquals(
      "6h2c Kh6d",
      Solver.process("texas-holdem 3h9hQdTcTh 6h2c Kh6d"));
  }

  @Test
  public void test_texas_holdem_8316_2c2d6dKcKs_5h6h_Jh4c_3sAc_6sTc_Ts4h_6c8s_5d5s_ThQd_9sAh() {
    assertEquals(
      "Ts4h Jh4c ThQd 3sAc=9sAh 5d5s 5h6h 6c8s 6sTc",
      Solver.process("texas-holdem 2c2d6dKcKs 5h6h Jh4c 3sAc 6sTc Ts4h 6c8s 5d5s ThQd 9sAh"));
  }

  @Test
  public void test_texas_holdem_8317_2h4cAdKhQs_5h6h_5d9s_Td5c() {
    assertEquals(
      "5h6h 5d9s Td5c",
      Solver.process("texas-holdem 2h4cAdKhQs 5h6h 5d9s Td5c"));
  }

  @Test
  public void test_texas_holdem_8318_3h4c5c8c8d_4dTc_QhKs_Qs3d_Th3c_KdTd_Ad9d_Ts6d_Jd8s_JhAs() {
    assertEquals(
      "Ts6d KdTd QhKs Ad9d JhAs Th3c Qs3d 4dTc Jd8s",
      Solver.process("texas-holdem 3h4c5c8c8d 4dTc QhKs Qs3d Th3c KdTd Ad9d Ts6d Jd8s JhAs"));
  }

  @Test
  public void test_texas_holdem_8319_4h6c8h9cKd_6s7h_2sQc() {
    assertEquals(
      "2sQc 6s7h",
      Solver.process("texas-holdem 4h6c8h9cKd 6s7h 2sQc"));
  }

  @Test
  public void test_texas_holdem_8320_3d5h7h8c8s_2c9c_5dQd_QsAh_Jc3s_2sTd_7d4c_3h9s_TsKs() {
    assertEquals(
      "2c9c 2sTd TsKs QsAh 3h9s Jc3s 5dQd 7d4c",
      Solver.process("texas-holdem 3d5h7h8c8s 2c9c 5dQd QsAh Jc3s 2sTd 7d4c 3h9s TsKs"));
  }

  @Test
  public void test_texas_holdem_8321_4c4dKhQhQs_8d7d_Kd6h_3h7h_JhTh_9c8h() {
    assertEquals(
      "3h7h=8d7d=9c8h=JhTh Kd6h",
      Solver.process("texas-holdem 4c4dKhQhQs 8d7d Kd6h 3h7h JhTh 9c8h"));
  }

  @Test
  public void test_texas_holdem_8322_2c7s8sAdTh_5c9s_4c8h_3hKs_5s9c_QsQd_3sAs_2d7c_Jd5d() {
    assertEquals(
      "5c9s=5s9c Jd5d 3hKs 4c8h QsQd 3sAs 2d7c",
      Solver.process("texas-holdem 2c7s8sAdTh 5c9s 4c8h 3hKs 5s9c QsQd 3sAs 2d7c Jd5d"));
  }

  @Test
  public void test_texas_holdem_8323_5c9c9sKsTc_2d6d_KcTh_4dKh_7dQs_Js2h_2s8s_6sJc() {
    assertEquals(
      "2d6d 2s8s 6sJc=Js2h 7dQs 4dKh KcTh",
      Solver.process("texas-holdem 5c9c9sKsTc 2d6d KcTh 4dKh 7dQs Js2h 2s8s 6sJc"));
  }

  @Test
  public void test_texas_holdem_8324_4d6sAsKcQc_AhAc_7h3s_8d6c() {
    assertEquals(
      "7h3s 8d6c AhAc",
      Solver.process("texas-holdem 4d6sAsKcQc AhAc 7h3s 8d6c"));
  }

  @Test
  public void test_texas_holdem_8325_8h8s9d9hQh_Tc6s_5c9s_6d3s() {
    assertEquals(
      "6d3s=Tc6s 5c9s",
      Solver.process("texas-holdem 8h8s9d9hQh Tc6s 5c9s 6d3s"));
  }

  @Test
  public void test_texas_holdem_8326_3d3h5sJcTd_7d5h_KsJh_7cAh_3cQc() {
    assertEquals(
      "7cAh 7d5h KsJh 3cQc",
      Solver.process("texas-holdem 3d3h5sJcTd 7d5h KsJh 7cAh 3cQc"));
  }

  @Test
  public void test_texas_holdem_8327_3c4c7s8dTc_JsTh_JhKc() {
    assertEquals(
      "JhKc JsTh",
      Solver.process("texas-holdem 3c4c7s8dTc JsTh JhKc"));
  }

  @Test
  public void test_texas_holdem_8328_5d6s9hAdTh_3h6h_8s4d_9c8h_TcKh_Jh3s_Kc8c_Td7s_Qc2h_9dAs() {
    assertEquals(
      "8s4d Jh3s Qc2h Kc8c 3h6h 9c8h Td7s TcKh 9dAs",
      Solver.process("texas-holdem 5d6s9hAdTh 3h6h 8s4d 9c8h TcKh Jh3s Kc8c Td7s Qc2h 9dAs"));
  }

  @Test
  public void test_texas_holdem_8329_2s8sJcTcTh_Ah4h_Jh5d() {
    assertEquals(
      "Ah4h Jh5d",
      Solver.process("texas-holdem 2s8sJcTcTh Ah4h Jh5d"));
  }

  @Test
  public void test_texas_holdem_8330_8dAhKdQdTd_3d2c_5hJs_Th8c_5s9h_7h4h_6cKc_TcQc_4c6s_6d3h() {
    assertEquals(
      "4c6s=7h4h 5s9h 6cKc Th8c TcQc 5hJs 3d2c 6d3h",
      Solver.process("texas-holdem 8dAhKdQdTd 3d2c 5hJs Th8c 5s9h 7h4h 6cKc TcQc 4c6s 6d3h"));
  }

  @Test
  public void test_texas_holdem_8331_2h2s4h5dJs_Qc2c_9cJc_5cTh_7h9h_7cKd_Qh2d() {
    assertEquals(
      "7h9h 7cKd 5cTh 9cJc Qc2c=Qh2d",
      Solver.process("texas-holdem 2h2s4h5dJs Qc2c 9cJc 5cTh 7h9h 7cKd Qh2d"));
  }

  @Test
  public void test_texas_holdem_8332_3s4s5h6cQc_JsTc_QhTh_5c8s_9cKs_Jh9s() {
    assertEquals(
      "Jh9s JsTc 9cKs 5c8s QhTh",
      Solver.process("texas-holdem 3s4s5h6cQc JsTc QhTh 5c8s 9cKs Jh9s"));
  }

  @Test
  public void test_texas_holdem_8333_2h6h8h8sJs_5s7h_TdKc_KdJh_3c7s_8dAh_Qd4c_Qc7d() {
    assertEquals(
      "3c7s=5s7h Qd4c Qc7d TdKc KdJh 8dAh",
      Solver.process("texas-holdem 2h6h8h8sJs 5s7h TdKc KdJh 3c7s 8dAh Qd4c Qc7d"));
  }

  @Test
  public void test_texas_holdem_8334_4d6cKhQcTh_KdQs_7s5d_3sJh_5h4c_5c6h_Tc7d_3h5s() {
    assertEquals(
      "3h5s 7s5d 3sJh 5h4c 5c6h Tc7d KdQs",
      Solver.process("texas-holdem 4d6cKhQcTh KdQs 7s5d 3sJh 5h4c 5c6h Tc7d 3h5s"));
  }

  @Test
  public void test_texas_holdem_8335_3s4h6d6s7h_2d3d_Th2s_QcAc_3h6h_8d9d_5c9s_Ad3c_5dTc() {
    assertEquals(
      "8d9d Th2s QcAc 2d3d Ad3c 5c9s=5dTc 3h6h",
      Solver.process("texas-holdem 3s4h6d6s7h 2d3d Th2s QcAc 3h6h 8d9d 5c9s Ad3c 5dTc"));
  }

  @Test
  public void test_texas_holdem_8336_3h4s5dAdQs_Jd6c_Ts5h_Tc9h_7cQh_6h3d() {
    assertEquals(
      "Tc9h Jd6c 6h3d Ts5h 7cQh",
      Solver.process("texas-holdem 3h4s5dAdQs Jd6c Ts5h Tc9h 7cQh 6h3d"));
  }

  @Test
  public void test_texas_holdem_8337_3d5s9dAhKd_TdJs_8c9h_JcTs_6s5c_Ac8s_3cQh_4s3s() {
    assertEquals(
      "JcTs=TdJs 4s3s 3cQh 6s5c 8c9h Ac8s",
      Solver.process("texas-holdem 3d5s9dAhKd TdJs 8c9h JcTs 6s5c Ac8s 3cQh 4s3s"));
  }

  @Test
  public void test_texas_holdem_8338_3s4d8dAcKs_6hTc_8cJd_Th5c_9c9d_9hJh_3d8s_5d2c() {
    assertEquals(
      "Th5c 6hTc 9hJh 8cJd 9c9d 3d8s 5d2c",
      Solver.process("texas-holdem 3s4d8dAcKs 6hTc 8cJd Th5c 9c9d 9hJh 3d8s 5d2c"));
  }

  @Test
  public void test_texas_holdem_8339_3d3h4d6d9s_6sTh_8h2c_Jd5s_TsQh_Ah2d_9h2s_3s5h_3c6h_Ac7s() {
    assertEquals(
      "8h2c Jd5s TsQh Ah2d Ac7s 6sTh 9h2s 3s5h 3c6h",
      Solver.process("texas-holdem 3d3h4d6d9s 6sTh 8h2c Jd5s TsQh Ah2d 9h2s 3s5h 3c6h Ac7s"));
  }

  @Test
  public void test_texas_holdem_8340_4h6cJcJsKh_QhKc_KsAs() {
    assertEquals(
      "QhKc KsAs",
      Solver.process("texas-holdem 4h6cJcJsKh QhKc KsAs"));
  }

  @Test
  public void test_texas_holdem_8341_2s3c8cAdTh_2h4h_3s5s_Tc8d_4sTs_JhQc() {
    assertEquals(
      "JhQc 2h4h 3s5s 4sTs Tc8d",
      Solver.process("texas-holdem 2s3c8cAdTh 2h4h 3s5s Tc8d 4sTs JhQc"));
  }

  @Test
  public void test_texas_holdem_8342_3c5h5sAsTd_Qs5d_8c6h_9sTc_8sJh_Jc6d_6s7d_8dAc_2dKs() {
    assertEquals(
      "6s7d 8c6h 8sJh=Jc6d 2dKs 9sTc 8dAc Qs5d",
      Solver.process("texas-holdem 3c5h5sAsTd Qs5d 8c6h 9sTc 8sJh Jc6d 6s7d 8dAc 2dKs"));
  }

  @Test
  public void test_texas_holdem_8343_8c8sKsQcQs_3h9d_Ts8h_4dTc() {
    assertEquals(
      "3h9d=4dTc Ts8h",
      Solver.process("texas-holdem 8c8sKsQcQs 3h9d Ts8h 4dTc"));
  }

  @Test
  public void test_texas_holdem_8344_3d6h6sAcJs_9h6d_QhQd_7d4h_ThQc_3h6c_8h9d_Ts2c_Ks9c() {
    assertEquals(
      "7d4h 8h9d Ts2c ThQc Ks9c QhQd 9h6d 3h6c",
      Solver.process("texas-holdem 3d6h6sAcJs 9h6d QhQd 7d4h ThQc 3h6c 8h9d Ts2c Ks9c"));
  }

  @Test
  public void test_texas_holdem_8345_4c5d7c8cKs_KhTd_Kd2s_2hQd() {
    assertEquals(
      "2hQd Kd2s KhTd",
      Solver.process("texas-holdem 4c5d7c8cKs KhTd Kd2s 2hQd"));
  }

  @Test
  public void test_texas_holdem_8346_2c5s7s9dTh_7c3d_9s3h_Ks6d() {
    assertEquals(
      "Ks6d 7c3d 9s3h",
      Solver.process("texas-holdem 2c5s7s9dTh 7c3d 9s3h Ks6d"));
  }

  @Test
  public void test_texas_holdem_8347_2s4d6h7d8h_3dAd_AsAc_2cKd_TdQc_9d9h_Ts4h_9c7h_8cAh() {
    assertEquals(
      "TdQc 3dAd 2cKd Ts4h 9c7h 8cAh 9d9h AsAc",
      Solver.process("texas-holdem 2s4d6h7d8h 3dAd AsAc 2cKd TdQc 9d9h Ts4h 9c7h 8cAh"));
  }

  @Test
  public void test_texas_holdem_8348_3s5s6h9dKd_Qc2d_8sTh_8c9h_5d7s_Ts8d_Qh7h_KcTc_Jh6d() {
    assertEquals(
      "8sTh=Ts8d Qc2d Qh7h 5d7s Jh6d 8c9h KcTc",
      Solver.process("texas-holdem 3s5s6h9dKd Qc2d 8sTh 8c9h 5d7s Ts8d Qh7h KcTc Jh6d"));
  }

  @Test
  public void test_texas_holdem_8349_3c5d7hKhQh_4s4h_8c6c_5h3s_Tc5c_Ac7c() {
    assertEquals(
      "8c6c 4s4h Tc5c Ac7c 5h3s",
      Solver.process("texas-holdem 3c5d7hKhQh 4s4h 8c6c 5h3s Tc5c Ac7c"));
  }

  @Test
  public void test_texas_holdem_8350_3d4c6dJhTh_8hAc_8cQd_2cAd_9cKd_Tc9s_8sQh_5sKs() {
    assertEquals(
      "8cQd=8sQh 5sKs 9cKd 2cAd 8hAc Tc9s",
      Solver.process("texas-holdem 3d4c6dJhTh 8hAc 8cQd 2cAd 9cKd Tc9s 8sQh 5sKs"));
  }

  @Test
  public void test_texas_holdem_8351_2h4d8c8dJd_5h5s_7cKd_8s6h_Ac4h_QcQs_6c7h_Kc2c() {
    assertEquals(
      "6c7h 7cKd Kc2c Ac4h 5h5s QcQs 8s6h",
      Solver.process("texas-holdem 2h4d8c8dJd 5h5s 7cKd 8s6h Ac4h QcQs 6c7h Kc2c"));
  }

  @Test
  public void test_texas_holdem_8352_5c7c9c9dKc_3dJd_9s7h_3c8d() {
    assertEquals(
      "3dJd 3c8d 9s7h",
      Solver.process("texas-holdem 5c7c9c9dKc 3dJd 9s7h 3c8d"));
  }

  @Test
  public void test_texas_holdem_8353_2h8cJhQdTh_5h5d_Ts9s_2d8d_4cQc_7dAs_3cKd_Td5s_Tc7h() {
    assertEquals(
      "3cKd 7dAs 5h5d Tc7h=Td5s 4cQc 2d8d Ts9s",
      Solver.process("texas-holdem 2h8cJhQdTh 5h5d Ts9s 2d8d 4cQc 7dAs 3cKd Td5s Tc7h"));
  }

  @Test
  public void test_texas_holdem_8354_3d8c9sAdJc_6cKs_TcTh_4c7s_8sJs_Qd6d_5c3c_JdQh() {
    assertEquals(
      "4c7s Qd6d 6cKs 5c3c TcTh JdQh 8sJs",
      Solver.process("texas-holdem 3d8c9sAdJc 6cKs TcTh 4c7s 8sJs Qd6d 5c3c JdQh"));
  }

  @Test
  public void test_texas_holdem_8355_2h5h6c7hAc_TsKs_Td9d_5cKd_9hQs() {
    assertEquals(
      "Td9d 9hQs TsKs 5cKd",
      Solver.process("texas-holdem 2h5h6c7hAc TsKs Td9d 5cKd 9hQs"));
  }

  @Test
  public void test_texas_holdem_8356_3c5s7s9cAc_ThQd_2s8s_3dAs_TdJd_8dTc_Ts4h_6h4c_AdQs_Ks4d() {
    assertEquals(
      "2s8s Ts4h 8dTc TdJd ThQd Ks4d AdQs 3dAs 6h4c",
      Solver.process("texas-holdem 3c5s7s9cAc ThQd 2s8s 3dAs TdJd 8dTc Ts4h 6h4c AdQs Ks4d"));
  }

  @Test
  public void test_texas_holdem_8357_7d8cAdAsJd_5d9s_5h5c_2cKh_Ks8s() {
    assertEquals(
      "5d9s 2cKh 5h5c Ks8s",
      Solver.process("texas-holdem 7d8cAdAsJd 5d9s 5h5c 2cKh Ks8s"));
  }

  @Test
  public void test_texas_holdem_8358_2d3s5cKdQc_3dAs_9dTd_4sTh_Qd8h() {
    assertEquals(
      "4sTh 9dTd 3dAs Qd8h",
      Solver.process("texas-holdem 2d3s5cKdQc 3dAs 9dTd 4sTh Qd8h"));
  }

  @Test
  public void test_texas_holdem_8359_8s9sAcJcQc_4sJd_6cTs_3c5s_Th5d_6h9c_Qd5h() {
    assertEquals(
      "3c5s 6h9c 4sJd Qd5h 6cTs=Th5d",
      Solver.process("texas-holdem 8s9sAcJcQc 4sJd 6cTs 3c5s Th5d 6h9c Qd5h"));
  }

  @Test
  public void test_texas_holdem_8360_4s8c8d8hJs_Jd3s_5cJh_6dTs() {
    assertEquals(
      "6dTs 5cJh=Jd3s",
      Solver.process("texas-holdem 4s8c8d8hJs Jd3s 5cJh 6dTs"));
  }

  @Test
  public void test_texas_holdem_8361_7s8cAsKcKh_Js2s_4d9h_Qs4c_Tc6d_8h2h_4s5c_3cKs_5h5d() {
    assertEquals(
      "4s5c 4d9h Tc6d Js2s Qs4c 5h5d 8h2h 3cKs",
      Solver.process("texas-holdem 7s8cAsKcKh Js2s 4d9h Qs4c Tc6d 8h2h 4s5c 3cKs 5h5d"));
  }

  @Test
  public void test_texas_holdem_8362_6h7dJhJsKc_6c7s_Kh5s_2c4d_Th6d() {
    assertEquals(
      "2c4d Th6d 6c7s Kh5s",
      Solver.process("texas-holdem 6h7dJhJsKc 6c7s Kh5s 2c4d Th6d"));
  }

  @Test
  public void test_texas_holdem_8363_2s3d4cKsTd_9h8c_7cJh_2dJd_8h7d() {
    assertEquals(
      "8h7d 9h8c 7cJh 2dJd",
      Solver.process("texas-holdem 2s3d4cKsTd 9h8c 7cJh 2dJd 8h7d"));
  }

  @Test
  public void test_texas_holdem_8364_3h5s8s9dJd_Qs2c_4s5d_2s3d() {
    assertEquals(
      "Qs2c 2s3d 4s5d",
      Solver.process("texas-holdem 3h5s8s9dJd Qs2c 4s5d 2s3d"));
  }

  @Test
  public void test_texas_holdem_8365_3s6s7cAsKc_Kd7s_8hTd_AdAc_2cTs_9c5d_4c4d_Qc6d_4hKs_QhTh() {
    assertEquals(
      "9c5d 2cTs 8hTd QhTh 4c4d Qc6d 4hKs Kd7s AdAc",
      Solver.process("texas-holdem 3s6s7cAsKc Kd7s 8hTd AdAc 2cTs 9c5d 4c4d Qc6d 4hKs QhTh"));
  }

  @Test
  public void test_texas_holdem_8366_4h5d9sJcKd_Ad4c_Th2h_As2c_5s7d_2s8d() {
    assertEquals(
      "2s8d Th2h As2c Ad4c 5s7d",
      Solver.process("texas-holdem 4h5d9sJcKd Ad4c Th2h As2c 5s7d 2s8d"));
  }

  @Test
  public void test_texas_holdem_8367_6d9dAcAhTc_QdJs_Jd8c_Ks2d_3d3h_Qc6h() {
    assertEquals(
      "Jd8c QdJs Ks2d 3d3h Qc6h",
      Solver.process("texas-holdem 6d9dAcAhTc QdJs Jd8c Ks2d 3d3h Qc6h"));
  }

  @Test
  public void test_texas_holdem_8368_3h6d7c8hAh_Jd7h_6hQd() {
    assertEquals(
      "6hQd Jd7h",
      Solver.process("texas-holdem 3h6d7c8hAh Jd7h 6hQd"));
  }

  @Test
  public void test_texas_holdem_8369_2c3dQdTcTd_9cKc_Qc7h_Kh7s_9dKd_Ad8s_5d4s_5h3h() {
    assertEquals(
      "5d4s Kh7s 9cKc Ad8s 5h3h Qc7h 9dKd",
      Solver.process("texas-holdem 2c3dQdTcTd 9cKc Qc7h Kh7s 9dKd Ad8s 5d4s 5h3h"));
  }

  @Test
  public void test_texas_holdem_8370_2hJdQdQhTh_2c3d_6hAs() {
    assertEquals(
      "6hAs 2c3d",
      Solver.process("texas-holdem 2hJdQdQhTh 2c3d 6hAs"));
  }

  @Test
  public void test_texas_holdem_8371_AcAsJdJsQh_7sAd_3c8s_Kh8h_9h4d_2sQd_9c6c_Jh8c() {
    assertEquals(
      "3c8s=9c6c=9h4d Kh8h 2sQd Jh8c 7sAd",
      Solver.process("texas-holdem AcAsJdJsQh 7sAd 3c8s Kh8h 9h4d 2sQd 9c6c Jh8c"));
  }

  @Test
  public void test_texas_holdem_8372_3d6h7s9cJd_Jc5d_2d6s() {
    assertEquals(
      "2d6s Jc5d",
      Solver.process("texas-holdem 3d6h7s9cJd Jc5d 2d6s"));
  }

  @Test
  public void test_texas_holdem_8373_7c9h9sKsQc_ThTc_QhAh_4h4c_6c8s() {
    assertEquals(
      "6c8s 4h4c ThTc QhAh",
      Solver.process("texas-holdem 7c9h9sKsQc ThTc QhAh 4h4c 6c8s"));
  }

  @Test
  public void test_texas_holdem_8374_6c9sQsTcTs_QcAd_9hQh_3d2h_3c2d_Ac2c() {
    assertEquals(
      "3c2d=3d2h Ac2c 9hQh QcAd",
      Solver.process("texas-holdem 6c9sQsTcTs QcAd 9hQh 3d2h 3c2d Ac2c"));
  }

  @Test
  public void test_texas_holdem_8375_6h7dAsJsKc_4c4h_3dAd_8cJh_6s4d_Ah6c_Td5h_5s5c() {
    assertEquals(
      "Td5h 4c4h 5s5c 6s4d 8cJh 3dAd Ah6c",
      Solver.process("texas-holdem 6h7dAsJsKc 4c4h 3dAd 8cJh 6s4d Ah6c Td5h 5s5c"));
  }

  @Test
  public void test_texas_holdem_8376_7h8dKhQsTd_6sJs_6c8h() {
    assertEquals(
      "6sJs 6c8h",
      Solver.process("texas-holdem 7h8dKhQsTd 6sJs 6c8h"));
  }

  @Test
  public void test_texas_holdem_8377_2d5c5d7sJd_8h9c_9h4s_9s8c_3sQh_6h6s_Ks7c_As4h_ThQs_AcQd() {
    assertEquals(
      "9h4s 8h9c=9s8c 3sQh ThQs As4h AcQd 6h6s Ks7c",
      Solver.process("texas-holdem 2d5c5d7sJd 8h9c 9h4s 9s8c 3sQh 6h6s Ks7c As4h ThQs AcQd"));
  }

  @Test
  public void test_texas_holdem_8378_4d5c5dQcQd_KcAc_6d8h() {
    assertEquals(
      "6d8h KcAc",
      Solver.process("texas-holdem 4d5c5dQcQd KcAc 6d8h"));
  }

  @Test
  public void test_texas_holdem_8379_6s9hJsQcTs_Tc7c_7h5d_4d3c_6d2h_AhKd() {
    assertEquals(
      "4d3c 7h5d 6d2h Tc7c AhKd",
      Solver.process("texas-holdem 6s9hJsQcTs Tc7c 7h5d 4d3c 6d2h AhKd"));
  }

  @Test
  public void test_texas_holdem_8380_2s7s8d9hTs_9cTc_Kh3d_QhJh_3hJd_Qc3c_Ad8h_TdTh_6s5h_2c7c() {
    assertEquals(
      "Qc3c Kh3d Ad8h 2c7c 9cTc TdTh 6s5h 3hJd QhJh",
      Solver.process("texas-holdem 2s7s8d9hTs 9cTc Kh3d QhJh 3hJd Qc3c Ad8h TdTh 6s5h 2c7c"));
  }

  @Test
  public void test_texas_holdem_8381_2c4s6sKsTh_AcQs_7hTd_As7s_JcAd_3s2d() {
    assertEquals(
      "JcAd AcQs 3s2d 7hTd As7s",
      Solver.process("texas-holdem 2c4s6sKsTh AcQs 7hTd As7s JcAd 3s2d"));
  }

  @Test
  public void test_texas_holdem_8382_2c3d7dKcTd_Ks5s_QcAc_4s8c_Kd5d_2d9d_Js9h() {
    assertEquals(
      "4s8c Js9h QcAc Ks5s 2d9d Kd5d",
      Solver.process("texas-holdem 2c3d7dKcTd Ks5s QcAc 4s8c Kd5d 2d9d Js9h"));
  }

  @Test
  public void test_texas_holdem_8383_6c7d8d9hJd_KhAd_4dQh_3s7h_Ks5d_QsAh() {
    assertEquals(
      "4dQh QsAh KhAd 3s7h Ks5d",
      Solver.process("texas-holdem 6c7d8d9hJd KhAd 4dQh 3s7h Ks5d QsAh"));
  }

  @Test
  public void test_texas_holdem_8384_2c2s9hAdKc_8sJs_9d9c_JhQc_Kd7s() {
    assertEquals(
      "8sJs JhQc Kd7s 9d9c",
      Solver.process("texas-holdem 2c2s9hAdKc 8sJs 9d9c JhQc Kd7s"));
  }

  @Test
  public void test_texas_holdem_8385_4h5c8h9dKs_3cJc_7dKh_Kd4c_2sQh_9s7h_2h8s_5s8c() {
    assertEquals(
      "3cJc 2sQh 2h8s 9s7h 7dKh 5s8c Kd4c",
      Solver.process("texas-holdem 4h5c8h9dKs 3cJc 7dKh Kd4c 2sQh 9s7h 2h8s 5s8c"));
  }

  @Test
  public void test_texas_holdem_8386_3s4s6hQdTc_KhAd_9h4c_4dAh_6d2c_AsJd_3dTs() {
    assertEquals(
      "AsJd KhAd 9h4c 4dAh 6d2c 3dTs",
      Solver.process("texas-holdem 3s4s6hQdTc KhAd 9h4c 4dAh 6d2c AsJd 3dTs"));
  }

  @Test
  public void test_texas_holdem_8387_AcAhQdQsTd_As9c_Jc5h_9d2s_Js3h() {
    assertEquals(
      "9d2s Jc5h=Js3h As9c",
      Solver.process("texas-holdem AcAhQdQsTd As9c Jc5h 9d2s Js3h"));
  }

  @Test
  public void test_texas_holdem_8388_5d5s9dJhTs_Js6h_KdQd_6s4h_Ad7h_2c4s_3sQc() {
    assertEquals(
      "2c4s=6s4h 3sQc Ad7h Js6h KdQd",
      Solver.process("texas-holdem 5d5s9dJhTs Js6h KdQd 6s4h Ad7h 2c4s 3sQc"));
  }

  @Test
  public void test_texas_holdem_8389_5d6h6sJhQs_4s5c_Kd3c_Jd5h_AhAd_9h7s_2c9c_Ac9s() {
    assertEquals(
      "2c9c=9h7s Kd3c Ac9s 4s5c Jd5h AhAd",
      Solver.process("texas-holdem 5d6h6sJhQs 4s5c Kd3c Jd5h AhAd 9h7s 2c9c Ac9s"));
  }

  @Test
  public void test_texas_holdem_8390_5c8d9dKsQh_6c9c_7cQs_5h5s_6dTs_4h6s_4c3h() {
    assertEquals(
      "4c3h 4h6s 6dTs 6c9c 7cQs 5h5s",
      Solver.process("texas-holdem 5c8d9dKsQh 6c9c 7cQs 5h5s 6dTs 4h6s 4c3h"));
  }

  @Test
  public void test_texas_holdem_8391_2h6c6dAhJc_TcKc_2cTs_4c6h_8c9h_2s8d_Ks7c_5hJs() {
    assertEquals(
      "8c9h Ks7c=TcKc 2cTs=2s8d 5hJs 4c6h",
      Solver.process("texas-holdem 2h6c6dAhJc TcKc 2cTs 4c6h 8c9h 2s8d Ks7c 5hJs"));
  }

  @Test
  public void test_texas_holdem_8392_2h4d6d7s9h_TdTs_Jh6c_Ad5c_Kd2c_QhKs_8c9d_5sTh_4c5d() {
    assertEquals(
      "5sTh QhKs Ad5c Kd2c 4c5d Jh6c 8c9d TdTs",
      Solver.process("texas-holdem 2h4d6d7s9h TdTs Jh6c Ad5c Kd2c QhKs 8c9d 5sTh 4c5d"));
  }

  @Test
  public void test_texas_holdem_8393_2s9cJhKdTd_Th3s_5c3c_7cAd_6sTc_Ks5s() {
    assertEquals(
      "5c3c 7cAd 6sTc=Th3s Ks5s",
      Solver.process("texas-holdem 2s9cJhKdTd Th3s 5c3c 7cAd 6sTc Ks5s"));
  }

  @Test
  public void test_texas_holdem_8394_4h5s8c8sAd_6h7c_As6s_TdJs() {
    assertEquals(
      "TdJs As6s 6h7c",
      Solver.process("texas-holdem 4h5s8c8sAd 6h7c As6s TdJs"));
  }

  @Test
  public void test_texas_holdem_8395_3d3h6c9d9s_AdKd_ThKs_5dKc_4sAh_Ac8h_Js4h_7s4d_9h6d() {
    assertEquals(
      "7s4d Js4h 5dKc=ThKs 4sAh=Ac8h=AdKd 9h6d",
      Solver.process("texas-holdem 3d3h6c9d9s AdKd ThKs 5dKc 4sAh Ac8h Js4h 7s4d 9h6d"));
  }

  @Test
  public void test_texas_holdem_8396_4d5hKhQdQs_9c8c_3hAd_Ac4h() {
    assertEquals(
      "9c8c 3hAd Ac4h",
      Solver.process("texas-holdem 4d5hKhQdQs 9c8c 3hAd Ac4h"));
  }

  @Test
  public void test_texas_holdem_8397_4h8h8sJcKh_QsKs_AsKd_9d5d_9s3s_TdQd_5h4c_AdJd() {
    assertEquals(
      "9d5d=9s3s TdQd 5h4c AdJd QsKs AsKd",
      Solver.process("texas-holdem 4h8h8sJcKh QsKs AsKd 9d5d 9s3s TdQd 5h4c AdJd"));
  }

  @Test
  public void test_texas_holdem_8398_7c9dAcJsQh_Ks4d_9sAd_Td3c_4h9c() {
    assertEquals(
      "Td3c Ks4d 4h9c 9sAd",
      Solver.process("texas-holdem 7c9dAcJsQh Ks4d 9sAd Td3c 4h9c"));
  }

  @Test
  public void test_texas_holdem_8399_3s6h7c9dKh_7d4d_AdKd_TcJd_2cJc_KcQs_4s2s() {
    assertEquals(
      "4s2s 2cJc TcJd 7d4d KcQs AdKd",
      Solver.process("texas-holdem 3s6h7c9dKh 7d4d AdKd TcJd 2cJc KcQs 4s2s"));
  }

  @Test
  public void test_texas_holdem_8400_2c2h4s6hQs_KhAs_4d7d_8sKc_Ts9s_9d3d_Jh2s_8hTc_Ad5s_5hQh() {
    assertEquals(
      "9d3d 8hTc Ts9s 8sKc Ad5s KhAs 4d7d 5hQh Jh2s",
      Solver.process("texas-holdem 2c2h4s6hQs KhAs 4d7d 8sKc Ts9s 9d3d Jh2s 8hTc Ad5s 5hQh"));
  }

  @Test
  public void test_texas_holdem_8401_4c5d7h9hAs_4dTs_5h4h_2h6c_7dKh_QdJc_2c3c_JsKd_Qh2s() {
    assertEquals(
      "2h6c Qh2s QdJc JsKd 4dTs 7dKh 5h4h 2c3c",
      Solver.process("texas-holdem 4c5d7h9hAs 4dTs 5h4h 2h6c 7dKh QdJc 2c3c JsKd Qh2s"));
  }

  @Test
  public void test_texas_holdem_8402_4c5hAsJcJh_Ad9h_3s8h_6hQd_8d3h() {
    assertEquals(
      "3s8h=8d3h 6hQd Ad9h",
      Solver.process("texas-holdem 4c5hAsJcJh Ad9h 3s8h 6hQd 8d3h"));
  }

  @Test
  public void test_texas_holdem_8403_3h6c6dQsTd_Js3s_8c2c_KcKh_As4d_6s2h_5d9h() {
    assertEquals(
      "8c2c 5d9h As4d Js3s KcKh 6s2h",
      Solver.process("texas-holdem 3h6c6dQsTd Js3s 8c2c KcKh As4d 6s2h 5d9h"));
  }

  @Test
  public void test_texas_holdem_8404_3c3s9dAcKh_8cAd_7sQd_7c7d_3hJs_5h6s_5d4d_Qc2d_3d4s() {
    assertEquals(
      "5d4d=5h6s 7sQd=Qc2d 7c7d 8cAd 3d4s=3hJs",
      Solver.process("texas-holdem 3c3s9dAcKh 8cAd 7sQd 7c7d 3hJs 5h6s 5d4d Qc2d 3d4s"));
  }

  @Test
  public void test_texas_holdem_8405_7c8d9c9dAd_4sTd_TcQh_3d8h_2c2h_TsAs_5c6c() {
    assertEquals(
      "4sTd TcQh 2c2h 3d8h TsAs 5c6c",
      Solver.process("texas-holdem 7c8d9c9dAd 4sTd TcQh 3d8h 2c2h TsAs 5c6c"));
  }

  @Test
  public void test_texas_holdem_8406_3c6h8c8h9h_2h8s_Kh5h_7h4s_9cTd_Js3d_7s3h_7c5d() {
    assertEquals(
      "7h4s 7s3h Js3d 9cTd 2h8s 7c5d Kh5h",
      Solver.process("texas-holdem 3c6h8c8h9h 2h8s Kh5h 7h4s 9cTd Js3d 7s3h 7c5d"));
  }

  @Test
  public void test_texas_holdem_8407_4cAcAsKdKh_JdQd_3dJs_6d6s_7c5h_3s5d_Tc4s() {
    assertEquals(
      "3s5d 6d6s 7c5h Tc4s 3dJs JdQd",
      Solver.process("texas-holdem 4cAcAsKdKh JdQd 3dJs 6d6s 7c5h 3s5d Tc4s"));
  }

  @Test
  public void test_texas_holdem_8408_4d9cJdKhKs_Th4h_TcJc_JhQh_QcJs_7c3c_Ah9h_2c8c_2h8s_8dKc() {
    assertEquals(
      "7c3c 2c8c=2h8s Th4h Ah9h TcJc JhQh=QcJs 8dKc",
      Solver.process("texas-holdem 4d9cJdKhKs Th4h TcJc JhQh QcJs 7c3c Ah9h 2c8c 2h8s 8dKc"));
  }

  @Test
  public void test_texas_holdem_8409_2d4h9c9hJs_JdAd_Qh7h() {
    assertEquals(
      "Qh7h JdAd",
      Solver.process("texas-holdem 2d4h9c9hJs JdAd Qh7h"));
  }

  @Test
  public void test_texas_holdem_8410_3h3sAdJhTc_Kc2d_8hAs_JsTs_2h5h_QhTh_3dJd_5d9h() {
    assertEquals(
      "2h5h=5d9h Kc2d QhTh JsTs 8hAs 3dJd",
      Solver.process("texas-holdem 3h3sAdJhTc Kc2d 8hAs JsTs 2h5h QhTh 3dJd 5d9h"));
  }

  @Test
  public void test_texas_holdem_8411_6d7c8cJcKc_3d9c_Ad7h_8s4d_5dJs_Qd8d() {
    assertEquals(
      "Ad7h 8s4d Qd8d 5dJs 3d9c",
      Solver.process("texas-holdem 6d7c8cJcKc 3d9c Ad7h 8s4d 5dJs Qd8d"));
  }

  @Test
  public void test_texas_holdem_8412_2c5cAsQdQh_AcTd_3d8d_7d6h_Qc2h_3h7s_6cJs_Ad8s_Qs6d() {
    assertEquals(
      "3h7s 7d6h 3d8d 6cJs Ad8s AcTd Qs6d Qc2h",
      Solver.process("texas-holdem 2c5cAsQdQh AcTd 3d8d 7d6h Qc2h 3h7s 6cJs Ad8s Qs6d"));
  }

  @Test
  public void test_texas_holdem_8413_7c8cJcKsQc_Ts5s_5d2d_Kd8s_2h5h_Ac9s_Tc2s() {
    assertEquals(
      "2h5h=5d2d Ts5s Kd8s Tc2s Ac9s",
      Solver.process("texas-holdem 7c8cJcKsQc Ts5s 5d2d Kd8s 2h5h Ac9s Tc2s"));
  }

  @Test
  public void test_texas_holdem_8414_3h5d9hAdTd_Qs6c_QcQh_Th7c_Js7h_8cKh_Ac9c() {
    assertEquals(
      "Js7h Qs6c 8cKh Th7c QcQh Ac9c",
      Solver.process("texas-holdem 3h5d9hAdTd Qs6c QcQh Th7c Js7h 8cKh Ac9c"));
  }

  @Test
  public void test_texas_holdem_8415_3s4c4s5h7c_9sJc_6c7h_2s4d_TdTh_Js2c_QdKc_JhTs_6hKd_JdQs() {
    assertEquals(
      "Js2c 9sJc JhTs JdQs QdKc TdTh 2s4d 6c7h=6hKd",
      Solver.process("texas-holdem 3s4c4s5h7c 9sJc 6c7h 2s4d TdTh Js2c QdKc JhTs 6hKd JdQs"));
  }

  @Test
  public void test_texas_holdem_8416_2c8s9sQhTs_6dJh_3s8h_KcAd_Th4d() {
    assertEquals(
      "KcAd 3s8h Th4d 6dJh",
      Solver.process("texas-holdem 2c8s9sQhTs 6dJh 3s8h KcAd Th4d"));
  }

  @Test
  public void test_texas_holdem_8417_2c3d7sTcTd_Th4c_9hAd_6s2d_5s5c_KsKh_AcJh_6h5d_Js4s() {
    assertEquals(
      "6h5d Js4s 9hAd AcJh 6s2d 5s5c KsKh Th4c",
      Solver.process("texas-holdem 2c3d7sTcTd Th4c 9hAd 6s2d 5s5c KsKh AcJh 6h5d Js4s"));
  }

  @Test
  public void test_texas_holdem_8418_5s6d6h8d8s_3d9h_JhTc_4s3c_ThKs_2s7c_Kd7d_5cJc_QsQc_KcQd() {
    assertEquals(
      "4s3c 2s7c 3d9h 5cJc=JhTc KcQd=Kd7d=ThKs QsQc",
      Solver.process("texas-holdem 5s6d6h8d8s 3d9h JhTc 4s3c ThKs 2s7c Kd7d 5cJc QsQc KcQd"));
  }

  @Test
  public void test_texas_holdem_8419_4d5h5s6hTc_3c5c_7s8c_8dAd_9dQc_Qs6c_Ac7h_2dQd_2c3d_KhJh() {
    assertEquals(
      "2dQd 9dQc KhJh Ac7h 8dAd Qs6c 3c5c 2c3d 7s8c",
      Solver.process("texas-holdem 4d5h5s6hTc 3c5c 7s8c 8dAd 9dQc Qs6c Ac7h 2dQd 2c3d KhJh"));
  }

  @Test
  public void test_texas_holdem_8420_3d7c9cAsJh_6s7d_KdKs_2h6d_Kc9h_4dKh_QcJs_Ac7s() {
    assertEquals(
      "2h6d 4dKh 6s7d Kc9h QcJs KdKs Ac7s",
      Solver.process("texas-holdem 3d7c9cAsJh 6s7d KdKs 2h6d Kc9h 4dKh QcJs Ac7s"));
  }

  @Test
  public void test_texas_holdem_8421_2s5d9sKhQs_4c6c_7cTs_Td2h_Th2d_KdAd_Ks8s_Jd3s_4d5c_6dQc() {
    assertEquals(
      "4c6c 7cTs Jd3s Td2h=Th2d 4d5c 6dQc KdAd Ks8s",
      Solver.process("texas-holdem 2s5d9sKhQs 4c6c 7cTs Td2h Th2d KdAd Ks8s Jd3s 4d5c 6dQc"));
  }

  @Test
  public void test_texas_holdem_8422_3c7c8h9hJs_6s5h_4h4d_Ad8d_6hTd_7s8s_3d9d_QdJh_Kc9s() {
    assertEquals(
      "4h4d Ad8d Kc9s QdJh 7s8s 3d9d 6s5h 6hTd",
      Solver.process("texas-holdem 3c7c8h9hJs 6s5h 4h4d Ad8d 6hTd 7s8s 3d9d QdJh Kc9s"));
  }

  @Test
  public void test_texas_holdem_8423_6s7c8dAcJh_7h5h_3s4h() {
    assertEquals(
      "3s4h 7h5h",
      Solver.process("texas-holdem 6s7c8dAcJh 7h5h 3s4h"));
  }

  @Test
  public void test_texas_holdem_8424_4h7hAhAsTh_2h4c_7c2c_3s3h_QhTd_2d4s() {
    assertEquals(
      "2d4s 7c2c 2h4c 3s3h QhTd",
      Solver.process("texas-holdem 4h7hAhAsTh 2h4c 7c2c 3s3h QhTd 2d4s"));
  }

  @Test
  public void test_texas_holdem_8425_2c3s4c4sQs_TcJs_6s6d_7s9h_Ah9c() {
    assertEquals(
      "7s9h TcJs Ah9c 6s6d",
      Solver.process("texas-holdem 2c3s4c4sQs TcJs 6s6d 7s9h Ah9c"));
  }

  @Test
  public void test_texas_holdem_8426_6s8s9hAhKd_KsTd_Qd9c_7c2h() {
    assertEquals(
      "7c2h Qd9c KsTd",
      Solver.process("texas-holdem 6s8s9hAhKd KsTd Qd9c 7c2h"));
  }

  @Test
  public void test_texas_holdem_8427_5s9cJdQdTh_7d5h_8c3c_Jc4s_2h7s_9d8s() {
    assertEquals(
      "2h7s 7d5h Jc4s 8c3c=9d8s",
      Solver.process("texas-holdem 5s9cJdQdTh 7d5h 8c3c Jc4s 2h7s 9d8s"));
  }

  @Test
  public void test_texas_holdem_8428_7h8sQsTdTs_5d3d_5hKh_2d8d_6cJc_Qd9s_4d3h() {
    assertEquals(
      "4d3h=5d3d 6cJc 5hKh 2d8d Qd9s",
      Solver.process("texas-holdem 7h8sQsTdTs 5d3d 5hKh 2d8d 6cJc Qd9s 4d3h"));
  }

  @Test
  public void test_texas_holdem_8429_2h7d7s9hQd_3c9s_Td6h_6sTc_Kc4c_8s3d_2dJd_Js4h() {
    assertEquals(
      "8s3d 6sTc=Td6h Js4h Kc4c 2dJd 3c9s",
      Solver.process("texas-holdem 2h7d7s9hQd 3c9s Td6h 6sTc Kc4c 8s3d 2dJd Js4h"));
  }

  @Test
  public void test_texas_holdem_8430_3sAhJsQcTs_5hKc_Th5c() {
    assertEquals(
      "Th5c 5hKc",
      Solver.process("texas-holdem 3sAhJsQcTs 5hKc Th5c"));
  }

  @Test
  public void test_texas_holdem_8431_3d8dAsJdTs_4sKh_QsQd_8c2h_6h2d() {
    assertEquals(
      "6h2d 4sKh 8c2h QsQd",
      Solver.process("texas-holdem 3d8dAsJdTs 4sKh QsQd 8c2h 6h2d"));
  }

  @Test
  public void test_texas_holdem_8432_2h5d6d9dQd_5s3d_Th8c_9sTs() {
    assertEquals(
      "Th8c 9sTs 5s3d",
      Solver.process("texas-holdem 2h5d6d9dQd 5s3d Th8c 9sTs"));
  }

  @Test
  public void test_texas_holdem_8433_2s6d7dAdTs_8s7h_7s5d_3dJc_Js6c_Tc4s_9d8h() {
    assertEquals(
      "3dJc Js6c 7s5d 8s7h Tc4s 9d8h",
      Solver.process("texas-holdem 2s6d7dAdTs 8s7h 7s5d 3dJc Js6c Tc4s 9d8h"));
  }

  @Test
  public void test_texas_holdem_8434_2h4c5d9sJh_8h2d_8dAd_QhTh() {
    assertEquals(
      "QhTh 8dAd 8h2d",
      Solver.process("texas-holdem 2h4c5d9sJh 8h2d 8dAd QhTh"));
  }

  @Test
  public void test_texas_holdem_8435_2h7h9sJsKd_4cAs_JhAh_TcAd_8h6d() {
    assertEquals(
      "8h6d 4cAs TcAd JhAh",
      Solver.process("texas-holdem 2h7h9sJsKd 4cAs JhAh TcAd 8h6d"));
  }

  @Test
  public void test_texas_holdem_8436_2c5c7cAdTh_Qc4h_8cJh_9h2h_QsTs_Qd8d_9d6d() {
    assertEquals(
      "9d6d 8cJh Qc4h Qd8d 9h2h QsTs",
      Solver.process("texas-holdem 2c5c7cAdTh Qc4h 8cJh 9h2h QsTs Qd8d 9d6d"));
  }

  @Test
  public void test_texas_holdem_8437_3s6s7sQdTs_2h5s_Th8h_KhQh_5dQs_Ah5h_8dAs() {
    assertEquals(
      "Ah5h Th8h KhQh 2h5s 5dQs 8dAs",
      Solver.process("texas-holdem 3s6s7sQdTs 2h5s Th8h KhQh 5dQs Ah5h 8dAs"));
  }

  @Test
  public void test_texas_holdem_8438_4c5c6h7hAc_6dAh_3h8d_KhQh() {
    assertEquals(
      "KhQh 6dAh 3h8d",
      Solver.process("texas-holdem 4c5c6h7hAc 6dAh 3h8d KhQh"));
  }

  @Test
  public void test_texas_holdem_8439_5d5h6h8sJs_Ac6s_Qs6c_Kd2s_7dJc_4cTh() {
    assertEquals(
      "4cTh Kd2s Qs6c Ac6s 7dJc",
      Solver.process("texas-holdem 5d5h6h8sJs Ac6s Qs6c Kd2s 7dJc 4cTh"));
  }

  @Test
  public void test_texas_holdem_8440_2c5h6dQdTh_6hQc_AsQh_2d2s_4hKh_TsJd_9s8h_6c5d_5s4d_Qs7h() {
    assertEquals(
      "9s8h 4hKh 5s4d TsJd Qs7h AsQh 6c5d 6hQc 2d2s",
      Solver.process("texas-holdem 2c5h6dQdTh 6hQc AsQh 2d2s 4hKh TsJd 9s8h 6c5d 5s4d Qs7h"));
  }

  @Test
  public void test_texas_holdem_8441_4s5c5s7s8s_9d2d_Js6d_4c2h_QsKh_QcJd() {
    assertEquals(
      "9d2d QcJd 4c2h Js6d QsKh",
      Solver.process("texas-holdem 4s5c5s7s8s 9d2d Js6d 4c2h QsKh QcJd"));
  }

  @Test
  public void test_texas_holdem_8442_5c6c7s9sKc_Qh2s_As8s() {
    assertEquals(
      "Qh2s As8s",
      Solver.process("texas-holdem 5c6c7s9sKc Qh2s As8s"));
  }

  @Test
  public void test_texas_holdem_8443_6d7c9sQcTs_Jd5s_5hKh_QhAh_KcTc_3dAd() {
    assertEquals(
      "Jd5s 5hKh 3dAd KcTc QhAh",
      Solver.process("texas-holdem 6d7c9sQcTs Jd5s 5hKh QhAh KcTc 3dAd"));
  }

  @Test
  public void test_texas_holdem_8444_2c3d3s5d9d_Ts6h_2dAs_KcKh_6sJs() {
    assertEquals(
      "Ts6h 6sJs 2dAs KcKh",
      Solver.process("texas-holdem 2c3d3s5d9d Ts6h 2dAs KcKh 6sJs"));
  }

  @Test
  public void test_texas_holdem_8445_3d5d9dAcAs_3sKc_3c8c_3h7h_6dQd() {
    assertEquals(
      "3c8c=3h7h 3sKc 6dQd",
      Solver.process("texas-holdem 3d5d9dAcAs 3sKc 3c8c 3h7h 6dQd"));
  }

  @Test
  public void test_texas_holdem_8446_2c5s8dAcAd_2d9c_6sJc_Jh5c_8hJd_Qc3s_6cAh() {
    assertEquals(
      "6sJc Qc3s 2d9c Jh5c 8hJd 6cAh",
      Solver.process("texas-holdem 2c5s8dAcAd 2d9c 6sJc Jh5c 8hJd Qc3s 6cAh"));
  }

  @Test
  public void test_texas_holdem_8447_2s6h7c7dJc_6dTs_AcKh_3hTh_5sKd_Ad9s_6s2d_9hJs_8dKs_4d7h() {
    assertEquals(
      "3hTh 5sKd 8dKs Ad9s AcKh 6dTs=6s2d 9hJs 4d7h",
      Solver.process("texas-holdem 2s6h7c7dJc 6dTs AcKh 3hTh 5sKd Ad9s 6s2d 9hJs 8dKs 4d7h"));
  }

  @Test
  public void test_texas_holdem_8448_5s6h6sJcQd_6d8s_TdKc_JsKd_3c8d_9d5c_9c3d() {
    assertEquals(
      "3c8d 9c3d TdKc 9d5c JsKd 6d8s",
      Solver.process("texas-holdem 5s6h6sJcQd 6d8s TdKc JsKd 3c8d 9d5c 9c3d"));
  }

  @Test
  public void test_texas_holdem_8449_4d6hAcKdTs_8s4h_5h7d_9c9d() {
    assertEquals(
      "5h7d 8s4h 9c9d",
      Solver.process("texas-holdem 4d6hAcKdTs 8s4h 5h7d 9c9d"));
  }

  @Test
  public void test_texas_holdem_8450_3d4h5c8cAh_QdJh_2s5d() {
    assertEquals(
      "QdJh 2s5d",
      Solver.process("texas-holdem 3d4h5c8cAh QdJh 2s5d"));
  }

  @Test
  public void test_texas_holdem_8451_4h5s7cAhTc_Jd5d_5cJs_4s6s_6hJc_Td6c_9d4d_5hKd() {
    assertEquals(
      "6hJc 4s6s 9d4d 5cJs=Jd5d 5hKd Td6c",
      Solver.process("texas-holdem 4h5s7cAhTc Jd5d 5cJs 4s6s 6hJc Td6c 9d4d 5hKd"));
  }

  @Test
  public void test_texas_holdem_8452_3c6c6h9sAh_9h7d_3sTc_TsKc_8c6s_ThTd_KdJh_Qc5h() {
    assertEquals(
      "Qc5h TsKc KdJh 3sTc 9h7d ThTd 8c6s",
      Solver.process("texas-holdem 3c6c6h9sAh 9h7d 3sTc TsKc 8c6s ThTd KdJh Qc5h"));
  }

  @Test
  public void test_texas_holdem_8453_2s3h6sQhTh_7s4h_9s3d_Ks6d_9cKc_KhQc() {
    assertEquals(
      "7s4h 9cKc 9s3d Ks6d KhQc",
      Solver.process("texas-holdem 2s3h6sQhTh 7s4h 9s3d Ks6d 9cKc KhQc"));
  }

  @Test
  public void test_texas_holdem_8454_4s9sKsQsTc_Qd4d_Ts3d() {
    assertEquals(
      "Qd4d Ts3d",
      Solver.process("texas-holdem 4s9sKsQsTc Qd4d Ts3d"));
  }

  @Test
  public void test_texas_holdem_8455_2h3s6c8hTh_7h9c_4s3d_TdTs_Qh6d_5d4c_2cAh_KhJd_9d9h() {
    assertEquals(
      "KhJd 2cAh 4s3d Qh6d 9d9h TdTs 5d4c 7h9c",
      Solver.process("texas-holdem 2h3s6c8hTh 7h9c 4s3d TdTs Qh6d 5d4c 2cAh KhJd 9d9h"));
  }

  @Test
  public void test_texas_holdem_8456_2c2d2s4sAd_7sTd_4h3c_Th7d() {
    assertEquals(
      "7sTd=Th7d 4h3c",
      Solver.process("texas-holdem 2c2d2s4sAd 7sTd 4h3c Th7d"));
  }

  @Test
  public void test_texas_holdem_8457_5cAcAhAsQc_9sQh_Ks2s_6hKh_Kd9h_6s6d_2d6c_KcTd_7h8d_Qs2c() {
    assertEquals(
      "2d6c 7h8d 6hKh=KcTd=Kd9h=Ks2s 6s6d 9sQh=Qs2c",
      Solver.process("texas-holdem 5cAcAhAsQc 9sQh Ks2s 6hKh Kd9h 6s6d 2d6c KcTd 7h8d Qs2c"));
  }

  @Test
  public void test_texas_holdem_8458_5d6d6h7c9c_Jh3d_Qh2s_Ac7s_7dTh() {
    assertEquals(
      "Jh3d Qh2s 7dTh Ac7s",
      Solver.process("texas-holdem 5d6d6h7c9c Jh3d Qh2s Ac7s 7dTh"));
  }

  @Test
  public void test_texas_holdem_8459_2d5sJcKdTh_4d3h_Kc3c_6d2s_5h2c_Ts7h_3s6h_AsJs_4sKh() {
    assertEquals(
      "4d3h 3s6h 6d2s Ts7h AsJs 4sKh=Kc3c 5h2c",
      Solver.process("texas-holdem 2d5sJcKdTh 4d3h Kc3c 6d2s 5h2c Ts7h 3s6h AsJs 4sKh"));
  }

  @Test
  public void test_texas_holdem_8460_3h8sKhQcTd_4c4d_6c9c_7sAc_4hJc_8c3d() {
    assertEquals(
      "6c9c 4hJc 7sAc 4c4d 8c3d",
      Solver.process("texas-holdem 3h8sKhQcTd 4c4d 6c9c 7sAc 4hJc 8c3d"));
  }

  @Test
  public void test_texas_holdem_8461_4c5d7h8sTc_7cKd_Ad2c_3h4h_4sQc_Jd3s_6cAs() {
    assertEquals(
      "Jd3s Ad2c 3h4h 4sQc 7cKd 6cAs",
      Solver.process("texas-holdem 4c5d7h8sTc 7cKd Ad2c 3h4h 4sQc Jd3s 6cAs"));
  }

  @Test
  public void test_texas_holdem_8462_3c4c5d7c7h_2sJs_9dKh_Kd9c_Ah3h_3d2h() {
    assertEquals(
      "2sJs 9dKh=Kd9c 3d2h Ah3h",
      Solver.process("texas-holdem 3c4c5d7c7h 2sJs 9dKh Kd9c Ah3h 3d2h"));
  }

  @Test
  public void test_texas_holdem_8463_7h9c9dQcQs_8h7s_Ad2c_4s3c_3h6c_9s6d_JsTd_3dJc() {
    assertEquals(
      "3h6c=4s3c 8h7s 3dJc=JsTd Ad2c 9s6d",
      Solver.process("texas-holdem 7h9c9dQcQs 8h7s Ad2c 4s3c 3h6c 9s6d JsTd 3dJc"));
  }

  @Test
  public void test_texas_holdem_8464_5d6sJcQdTc_Js8d_4dAd_7h3c_7cQh_TsTd_Kd3d_2dAh_9sKc() {
    assertEquals(
      "7h3c Kd3d 2dAh=4dAd Js8d 7cQh TsTd 9sKc",
      Solver.process("texas-holdem 5d6sJcQdTc Js8d 4dAd 7h3c 7cQh TsTd Kd3d 2dAh 9sKc"));
  }

  @Test
  public void test_texas_holdem_8465_4d5c6h8sAh_6d7c_5hKc_AcJd_2sJh() {
    assertEquals(
      "2sJh 5hKc AcJd 6d7c",
      Solver.process("texas-holdem 4d5c6h8sAh 6d7c 5hKc AcJd 2sJh"));
  }

  @Test
  public void test_texas_holdem_8466_5hAdAhJsQs_3s7h_9dQc_4s3c_4h2s_8dJc_Jh7d_KhQh_2c8c() {
    assertEquals(
      "4h2s=4s3c 3s7h 2c8c 8dJc=Jh7d 9dQc KhQh",
      Solver.process("texas-holdem 5hAdAhJsQs 3s7h 9dQc 4s3c 4h2s 8dJc Jh7d KhQh 2c8c"));
  }

  @Test
  public void test_texas_holdem_8467_3c3s4d5dJd_AsQh_2c2d_TcTs() {
    assertEquals(
      "AsQh 2c2d TcTs",
      Solver.process("texas-holdem 3c3s4d5dJd AsQh 2c2d TcTs"));
  }

  @Test
  public void test_texas_holdem_8468_4d4s8h8sQh_AhJh_7dAs_Ac9h_5c6c_Qs9c_9sJs() {
    assertEquals(
      "5c6c=9sJs 7dAs=Ac9h=AhJh Qs9c",
      Solver.process("texas-holdem 4d4s8h8sQh AhJh 7dAs Ac9h 5c6c Qs9c 9sJs"));
  }

  @Test
  public void test_texas_holdem_8469_4s5d5h6d7d_Ad2c_4c6s() {
    assertEquals(
      "Ad2c 4c6s",
      Solver.process("texas-holdem 4s5d5h6d7d Ad2c 4c6s"));
  }

  @Test
  public void test_texas_holdem_8470_2d2s3s4h6h_Js5s_7dTd_Kh4s() {
    assertEquals(
      "7dTd Kh4s Js5s",
      Solver.process("texas-holdem 2d2s3s4h6h Js5s 7dTd Kh4s"));
  }

  @Test
  public void test_texas_holdem_8471_4d7h7sKcKd_QhAd_QsQd_Jh3d_4h9s_5s6h() {
    assertEquals(
      "5s6h 4h9s Jh3d QhAd QsQd",
      Solver.process("texas-holdem 4d7h7sKcKd QhAd QsQd Jh3d 4h9s 5s6h"));
  }

  @Test
  public void test_texas_holdem_8472_6h7d8hJhKs_QsTc_7s9d_JsTh_9s9h() {
    assertEquals(
      "QsTc 7s9d 9s9h JsTh",
      Solver.process("texas-holdem 6h7d8hJhKs QsTc 7s9d JsTh 9s9h"));
  }

  @Test
  public void test_texas_holdem_8473_2s3c5c9dTh_6h3s_6cQh_Jh7d_8hTd_3d8d_Qs9s_7cKh_2c9c() {
    assertEquals(
      "Jh7d 6cQh 7cKh 6h3s 3d8d Qs9s 8hTd 2c9c",
      Solver.process("texas-holdem 2s3c5c9dTh 6h3s 6cQh Jh7d 8hTd 3d8d Qs9s 7cKh 2c9c"));
  }

  @Test
  public void test_texas_holdem_8474_4s5c6dTcTh_8d4h_As8c_5s5d_AhJd_3hQs_7cQd_Kh9h_6c7s_4cJs() {
    assertEquals(
      "3hQs 7cQd Kh9h As8c AhJd 8d4h 4cJs 6c7s 5s5d",
      Solver.process("texas-holdem 4s5c6dTcTh 8d4h As8c 5s5d AhJd 3hQs 7cQd Kh9h 6c7s 4cJs"));
  }

  @Test
  public void test_texas_holdem_8475_5s6c7hQcTs_TcKs_3c9d_2cJc() {
    assertEquals(
      "3c9d 2cJc TcKs",
      Solver.process("texas-holdem 5s6c7hQcTs TcKs 3c9d 2cJc"));
  }

  @Test
  public void test_texas_holdem_8476_3d6h8s9sTc_6sAd_KsTd_2hJs() {
    assertEquals(
      "2hJs 6sAd KsTd",
      Solver.process("texas-holdem 3d6h8s9sTc 6sAd KsTd 2hJs"));
  }

  @Test
  public void test_texas_holdem_8477_6c7d8sAhJs_4sTs_3hJc_AdKc_7hTc_Jh5c_8d9s_4cQd_4d4h_Kh2s() {
    assertEquals(
      "4sTs 4cQd Kh2s 4d4h 7hTc 8d9s 3hJc=Jh5c AdKc",
      Solver.process("texas-holdem 6c7d8sAhJs 4sTs 3hJc AdKc 7hTc Jh5c 8d9s 4cQd 4d4h Kh2s"));
  }

  @Test
  public void test_texas_holdem_8478_6c8c8dAdAs_3c2c_Ts9s_2hTd() {
    assertEquals(
      "3c2c 2hTd=Ts9s",
      Solver.process("texas-holdem 6c8c8dAdAs 3c2c Ts9s 2hTd"));
  }

  @Test
  public void test_texas_holdem_8479_5s9hAcKcQc_6sQd_7s7c_3dAh_2c4h_5dTh_5cKs_9s3s() {
    assertEquals(
      "2c4h 5dTh 7s7c 9s3s 6sQd 3dAh 5cKs",
      Solver.process("texas-holdem 5s9hAcKcQc 6sQd 7s7c 3dAh 2c4h 5dTh 5cKs 9s3s"));
  }

  @Test
  public void test_texas_holdem_8480_7s8s9dAcQd_7c9h_9s4s_7hTs_6c5s_3s4c_5dJd_3d8d() {
    assertEquals(
      "3s4c 5dJd 7hTs 3d8d 9s4s 7c9h 6c5s",
      Solver.process("texas-holdem 7s8s9dAcQd 7c9h 9s4s 7hTs 6c5s 3s4c 5dJd 3d8d"));
  }

  @Test
  public void test_texas_holdem_8481_2h3h4dKdTd_5cAs_JsQs_AhQh_Kc9h_AdQc() {
    assertEquals(
      "JsQs AdQc=AhQh Kc9h 5cAs",
      Solver.process("texas-holdem 2h3h4dKdTd 5cAs JsQs AhQh Kc9h AdQc"));
  }

  @Test
  public void test_texas_holdem_8482_4cAhJcJhKs_QdQs_9dKd_9cTh_3d2c_Td3s_6c9s() {
    assertEquals(
      "3d2c 6c9s 9cTh=Td3s QdQs 9dKd",
      Solver.process("texas-holdem 4cAhJcJhKs QdQs 9dKd 9cTh 3d2c Td3s 6c9s"));
  }

  @Test
  public void test_texas_holdem_8483_3s6h7hQdTd_9c5c_TcKd() {
    assertEquals(
      "9c5c TcKd",
      Solver.process("texas-holdem 3s6h7hQdTd 9c5c TcKd"));
  }

  @Test
  public void test_texas_holdem_8484_2s9sAhJdTs_9h2c_Qs6h() {
    assertEquals(
      "Qs6h 9h2c",
      Solver.process("texas-holdem 2s9sAhJdTs 9h2c Qs6h"));
  }

  @Test
  public void test_texas_holdem_8485_4d5d6cQcTh_TdQd_6d7h_2cKc_2dKs_9c3h_9hAh_Kh8h_7d5s() {
    assertEquals(
      "9c3h 2cKc=2dKs Kh8h 9hAh 7d5s 6d7h TdQd",
      Solver.process("texas-holdem 4d5d6cQcTh TdQd 6d7h 2cKc 2dKs 9c3h 9hAh Kh8h 7d5s"));
  }

  @Test
  public void test_texas_holdem_8486_2h6h8d8hKs_Jh3s_JdAs_Qh6s_6cQc_4cAc() {
    assertEquals(
      "Jh3s 4cAc JdAs 6cQc=Qh6s",
      Solver.process("texas-holdem 2h6h8d8hKs Jh3s JdAs Qh6s 6cQc 4cAc"));
  }

  @Test
  public void test_texas_holdem_8487_3d3h5d8d9d_Ts8h_3sKh_7hJc_Qh4c_2c2h_6c2s() {
    assertEquals(
      "6c2s 7hJc Qh4c 2c2h Ts8h 3sKh",
      Solver.process("texas-holdem 3d3h5d8d9d Ts8h 3sKh 7hJc Qh4c 2c2h 6c2s"));
  }

  @Test
  public void test_texas_holdem_8488_5c5d8dJcKh_Th6h_9c9d_4sJs_KcTd_AsKd_2d8s_2h7d_5s3c() {
    assertEquals(
      "2h7d Th6h 2d8s 9c9d 4sJs KcTd AsKd 5s3c",
      Solver.process("texas-holdem 5c5d8dJcKh Th6h 9c9d 4sJs KcTd AsKd 2d8s 2h7d 5s3c"));
  }

  @Test
  public void test_texas_holdem_8489_5c7h9hKsTs_Td8c_ThQh_QdJd_8s6h_8d3h_6cAh_Js4s_Kh5h() {
    assertEquals(
      "8d3h Js4s 6cAh Td8c ThQh Kh5h 8s6h QdJd",
      Solver.process("texas-holdem 5c7h9hKsTs Td8c ThQh QdJd 8s6h 8d3h 6cAh Js4s Kh5h"));
  }

  @Test
  public void test_texas_holdem_8490_2s3h6hKdTc_Ts9h_JcTd_9sQs_2hAc_9c3s() {
    assertEquals(
      "9sQs 2hAc 9c3s Ts9h JcTd",
      Solver.process("texas-holdem 2s3h6hKdTc Ts9h JcTd 9sQs 2hAc 9c3s"));
  }

  @Test
  public void test_texas_holdem_8491_3c7c7h8dTd_6dJs_KcKs_4sTs_JhAc_5c5d_Ah8h_8s2d_4cKh() {
    assertEquals(
      "6dJs 4cKh JhAc 5c5d 8s2d Ah8h 4sTs KcKs",
      Solver.process("texas-holdem 3c7c7h8dTd 6dJs KcKs 4sTs JhAc 5c5d Ah8h 8s2d 4cKh"));
  }

  @Test
  public void test_texas_holdem_8492_2c3c4cKcKs_7sTh_8h7d_JcTd_Kd8d_5d6h_9h9s_9d3d() {
    assertEquals(
      "8h7d 7sTh 9d3d 9h9s Kd8d 5d6h JcTd",
      Solver.process("texas-holdem 2c3c4cKcKs 7sTh 8h7d JcTd Kd8d 5d6h 9h9s 9d3d"));
  }

  @Test
  public void test_texas_holdem_8493_3c4c9hKhTc_7d6s_Td8c_2d4h_3dQs_As5s_2cTs() {
    assertEquals(
      "7d6s As5s 3dQs 2d4h 2cTs Td8c",
      Solver.process("texas-holdem 3c4c9hKhTc 7d6s Td8c 2d4h 3dQs As5s 2cTs"));
  }

  @Test
  public void test_texas_holdem_8494_3d4c6dAcJh_AdKs_Kh6h() {
    assertEquals(
      "Kh6h AdKs",
      Solver.process("texas-holdem 3d4c6dAcJh AdKs Kh6h"));
  }

  @Test
  public void test_texas_holdem_8495_3c4h6cAcKd_AsAd_2s6s_2h4s_4c8d() {
    assertEquals(
      "2h4s 4c8d 2s6s AsAd",
      Solver.process("texas-holdem 3c4h6cAcKd AsAd 2s6s 2h4s 4c8d"));
  }

  @Test
  public void test_texas_holdem_8496_3s5d5sKdQs_Td6c_6sAs_2d3d_KhJh_Ad9s_8cQc_2sJd() {
    assertEquals(
      "Td6c 2sJd Ad9s 2d3d 8cQc KhJh 6sAs",
      Solver.process("texas-holdem 3s5d5sKdQs Td6c 6sAs 2d3d KhJh Ad9s 8cQc 2sJd"));
  }

  @Test
  public void test_texas_holdem_8497_3c4c5h7sTc_4hJh_9hTh_9sKh_4s8d_6d7c() {
    assertEquals(
      "9sKh 4s8d 4hJh 9hTh 6d7c",
      Solver.process("texas-holdem 3c4c5h7sTc 4hJh 9hTh 9sKh 4s8d 6d7c"));
  }

  @Test
  public void test_texas_holdem_8498_5s8h9cAdAh_ThAs_4cJh() {
    assertEquals(
      "4cJh ThAs",
      Solver.process("texas-holdem 5s8h9cAdAh ThAs 4cJh"));
  }

  @Test
  public void test_texas_holdem_8499_2cAcJdJsKh_TcTh_Kc3d_Qd5s_4h3h() {
    assertEquals(
      "4h3h Qd5s TcTh Kc3d",
      Solver.process("texas-holdem 2cAcJdJsKh TcTh Kc3d Qd5s 4h3h"));
  }

}
