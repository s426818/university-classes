
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver31HiddenTest {


  @Test
  public void test_omaha_holdem_7750_2s9hAdAsQd_9cQh6d4c_4h6c8s7s_Kh9dJs2h_2c7h8hAh_6h3c5d3s_7dJcTdKd_7cQsQcTh_Ac4sKc9s_Jh5c3dTs() {
    assertEquals(
      "4h6c8s7s Jh5c3dTs 7dJcTdKd 6h3c5d3s Kh9dJs2h 9cQh6d4c 7cQsQcTh 2c7h8hAh Ac4sKc9s",
      Solver.process("omaha-holdem 2s9hAdAsQd 9cQh6d4c 4h6c8s7s Kh9dJs2h 2c7h8hAh 6h3c5d3s 7dJcTdKd 7cQsQcTh Ac4sKc9s Jh5c3dTs"));
  }

  @Test
  public void test_omaha_holdem_7751_4h5h8cAdKc_QhKd3hKh_7h3sKsQc_5c9d7d3d_9c8sTc4d_6dJh9s2s_Td2h2dQd_ThJcJdAh_4s5d8dQs_6h6s9hTs() {
    assertEquals(
      "6dJh9s2s Td2h2dQd 5c9d7d3d 6h6s9hTs 7h3sKsQc ThJcJdAh 9c8sTc4d 4s5d8dQs QhKd3hKh",
      Solver.process("omaha-holdem 4h5h8cAdKc QhKd3hKh 7h3sKsQc 5c9d7d3d 9c8sTc4d 6dJh9s2s Td2h2dQd ThJcJdAh 4s5d8dQs 6h6s9hTs"));
  }

  @Test
  public void test_omaha_holdem_7752_2d3d6h7d9d_AdAc7hKs_ThJd9c8h_9sAsQh9h_4s8dTcKh_5hTs2s7c_Jh3hQsKd_Td2h8s3c_Jc6sKc2c() {
    assertEquals(
      "Jh3hQsKd AdAc7hKs Jc6sKc2c 5hTs2s7c 9sAsQh9h 4s8dTcKh=Td2h8s3c=ThJd9c8h",
      Solver.process("omaha-holdem 2d3d6h7d9d AdAc7hKs ThJd9c8h 9sAsQh9h 4s8dTcKh 5hTs2s7c Jh3hQsKd Td2h8s3c Jc6sKc2c"));
  }

  @Test
  public void test_omaha_holdem_7753_3c3s7hKdQd_9s4sKsAs_9d2d4c2h_7s9cTd6c_5sAh8c5c_Jc6sJdQh_8s3hAcJh_2s8hTc8d_7dKhJs4d_9h3dKc7c() {
    assertEquals(
      "9d2d4c2h 5sAh8c5c 7s9cTd6c 2s8hTc8d Jc6sJdQh 9s4sKsAs 7dKhJs4d 8s3hAcJh 9h3dKc7c",
      Solver.process("omaha-holdem 3c3s7hKdQd 9s4sKsAs 9d2d4c2h 7s9cTd6c 5sAh8c5c Jc6sJdQh 8s3hAcJh 2s8hTc8d 7dKhJs4d 9h3dKc7c"));
  }

  @Test
  public void test_omaha_holdem_7754_2dKhKsTcTs_9d7d6hQd_9c4d4c5c_9hQhKc5h() {
    assertEquals(
      "9d7d6hQd 9c4d4c5c 9hQhKc5h",
      Solver.process("omaha-holdem 2dKhKsTcTs 9d7d6hQd 9c4d4c5c 9hQhKc5h"));
  }

  @Test
  public void test_omaha_holdem_7755_2c9c9hKsTh_AsTc7d5d_3s4s4h3h_4dJh5c3d_8c6c7hQh_2s5sAdJd_8d6hKdAh_Kc8hQd9d() {
    assertEquals(
      "4dJh5c3d 8c6c7hQh 2s5sAdJd 3s4s4h3h AsTc7d5d 8d6hKdAh Kc8hQd9d",
      Solver.process("omaha-holdem 2c9c9hKsTh AsTc7d5d 3s4s4h3h 4dJh5c3d 8c6c7hQh 2s5sAdJd 8d6hKdAh Kc8hQd9d"));
  }

  @Test
  public void test_omaha_holdem_7756_3h8s9cAhJd_6d5s6cJh_4dQh3c5d_5h2h8c8d() {
    assertEquals(
      "4dQh3c5d 6d5s6cJh 5h2h8c8d",
      Solver.process("omaha-holdem 3h8s9cAhJd 6d5s6cJh 4dQh3c5d 5h2h8c8d"));
  }

  @Test
  public void test_omaha_holdem_7757_4h7s8sAcKs_JhQcKdJd_9s3s3dQh_Tc5s6c6d_AdJc2hTh() {
    assertEquals(
      "JhQcKdJd AdJc2hTh Tc5s6c6d 9s3s3dQh",
      Solver.process("omaha-holdem 4h7s8sAcKs JhQcKdJd 9s3s3dQh Tc5s6c6d AdJc2hTh"));
  }

  @Test
  public void test_omaha_holdem_7758_2c3c4d5dAc_Qh4c3s6s_5cTc2s9c_Ts5s3d7h_6c8s6hKc() {
    assertEquals(
      "Ts5s3d7h Qh4c3s6s 5cTc2s9c 6c8s6hKc",
      Solver.process("omaha-holdem 2c3c4d5dAc Qh4c3s6s 5cTc2s9c Ts5s3d7h 6c8s6hKc"));
  }

  @Test
  public void test_omaha_holdem_7759_4s5dJhTcTs_7sKh6c2d_Qc4d4hJs_5c8d3c6h_3d3sKc2c_QsAsThQh_8s9h6s2s_2hAcKs7d_5s8c9cAh() {
    assertEquals(
      "8s9h6s2s 7sKh6c2d 2hAcKs7d 3d3sKc2c 5c8d3c6h 5s8c9cAh QsAsThQh Qc4d4hJs",
      Solver.process("omaha-holdem 4s5dJhTcTs 7sKh6c2d Qc4d4hJs 5c8d3c6h 3d3sKc2c QsAsThQh 8s9h6s2s 2hAcKs7d 5s8c9cAh"));
  }

  @Test
  public void test_omaha_holdem_7760_5h6d7sJsTc_AsAdJc4h_JhQdTd6c_Kc2cKh9h_QhQc8c9s() {
    assertEquals(
      "Kc2cKh9h AsAdJc4h JhQdTd6c QhQc8c9s",
      Solver.process("omaha-holdem 5h6d7sJsTc AsAdJc4h JhQdTd6c Kc2cKh9h QhQc8c9s"));
  }

  @Test
  public void test_omaha_holdem_7761_4cAcAdJcQs_Qd4h7s4s_5dThAhKc_Tc9s6d6h_4d8c2dKd_7d8dJh3c() {
    assertEquals(
      "4d8c2dKd Tc9s6d6h 7d8dJh3c 5dThAhKc Qd4h7s4s",
      Solver.process("omaha-holdem 4cAcAdJcQs Qd4h7s4s 5dThAhKc Tc9s6d6h 4d8c2dKd 7d8dJh3c"));
  }

  @Test
  public void test_omaha_holdem_7762_7h8cAhKsTc_Kc6d9sTh_3c5hAs5d_2dAdQsKd_7c9cQc4h_8s2h5sQd_4dTd7s6h() {
    assertEquals(
      "7c9cQc4h 8s2h5sQd 3c5hAs5d 4dTd7s6h 2dAdQsKd Kc6d9sTh",
      Solver.process("omaha-holdem 7h8cAhKsTc Kc6d9sTh 3c5hAs5d 2dAdQsKd 7c9cQc4h 8s2h5sQd 4dTd7s6h"));
  }

  @Test
  public void test_omaha_holdem_7763_5c6c6h6sQd_JcAcQs5s_Kh7cAsAh_6dTd2c4h_9s4c5h3s_9d2d8c9c_2hKs8h3c_4dTsJh3h() {
    assertEquals(
      "9s4c5h3s 4dTsJh3h 2hKs8h3c JcAcQs5s 9d2d8c9c Kh7cAsAh 6dTd2c4h",
      Solver.process("omaha-holdem 5c6c6h6sQd JcAcQs5s Kh7cAsAh 6dTd2c4h 9s4c5h3s 9d2d8c9c 2hKs8h3c 4dTsJh3h"));
  }

  @Test
  public void test_omaha_holdem_7764_6h8s9sJhTd_4hAs7cQs_3cTh6cTc_2c7dQh4d_Qc3dJc2d() {
    assertEquals(
      "2c7dQh4d 4hAs7cQs 3cTh6cTc Qc3dJc2d",
      Solver.process("omaha-holdem 6h8s9sJhTd 4hAs7cQs 3cTh6cTc 2c7dQh4d Qc3dJc2d"));
  }

  @Test
  public void test_omaha_holdem_7765_4s9c9dJdTc_8h8sJs9s_6c2cKh7h_Qs4c3c8c_5s3hTdJc_2sJh3dKc_As5c6sKs_Ad5hTh7s_TsAc2h9h_Qd7dQh4d() {
    assertEquals(
      "6c2cKh7h As5c6sKs Ad5hTh7s 2sJh3dKc 5s3hTdJc Qd7dQh4d Qs4c3c8c TsAc2h9h 8h8sJs9s",
      Solver.process("omaha-holdem 4s9c9dJdTc 8h8sJs9s 6c2cKh7h Qs4c3c8c 5s3hTdJc 2sJh3dKc As5c6sKs Ad5hTh7s TsAc2h9h Qd7dQh4d"));
  }

  @Test
  public void test_omaha_holdem_7766_2h3h7dKhTd_8d8c6s5s_2dJdAs6d() {
    assertEquals(
      "2dJdAs6d 8d8c6s5s",
      Solver.process("omaha-holdem 2h3h7dKhTd 8d8c6s5s 2dJdAs6d"));
  }

  @Test
  public void test_omaha_holdem_7767_2c7h8dQcTs_Kc6dTc4c_9dJs5cKd_7dJh9h7s_3sJd4h8h_6h5d4dKs_2hQdAd7c_Ac4sThAh_Qs9c5hAs() {
    assertEquals(
      "6h5d4dKs 3sJd4h8h Kc6dTc4c Qs9c5hAs Ac4sThAh 2hQdAd7c 7dJh9h7s=9dJs5cKd",
      Solver.process("omaha-holdem 2c7h8dQcTs Kc6dTc4c 9dJs5cKd 7dJh9h7s 3sJd4h8h 6h5d4dKs 2hQdAd7c Ac4sThAh Qs9c5hAs"));
  }

  @Test
  public void test_omaha_holdem_7768_3c3h9sKdTs_9h4cJs6c_JdQh8hAs_Jc7s3s5c_6h3dQd8s_Kh2d6dQs_5hAdAh8d_6s7dJhKc() {
    assertEquals(
      "9h4cJs6c 6s7dJhKc Kh2d6dQs 5hAdAh8d Jc7s3s5c 6h3dQd8s JdQh8hAs",
      Solver.process("omaha-holdem 3c3h9sKdTs 9h4cJs6c JdQh8hAs Jc7s3s5c 6h3dQd8s Kh2d6dQs 5hAdAh8d 6s7dJhKc"));
  }

  @Test
  public void test_omaha_holdem_7769_3d4c6s7hKc_Ac5h8s2h_8h2cAhQs_4sQdJh5c_QcKhTd2s_7c9sTh2d_5sKs5dJc_3s4h9d8c_3c9c7sTs_Qh9h6dAs() {
    assertEquals(
      "8h2cAhQs Qh9h6dAs 7c9sTh2d 5sKs5dJc QcKhTd2s 3s4h9d8c 3c9c7sTs 4sQdJh5c Ac5h8s2h",
      Solver.process("omaha-holdem 3d4c6s7hKc Ac5h8s2h 8h2cAhQs 4sQdJh5c QcKhTd2s 7c9sTh2d 5sKs5dJc 3s4h9d8c 3c9c7sTs Qh9h6dAs"));
  }

  @Test
  public void test_omaha_holdem_7770_2h5cAcQhTh_As4s2sAd_3hKsQd6d_9hJh7h9s_4d9d8d4h_Td7s5d8s_8c5hTs5s() {
    assertEquals(
      "4d9d8d4h 3hKsQd6d Td7s5d8s 8c5hTs5s As4s2sAd 9hJh7h9s",
      Solver.process("omaha-holdem 2h5cAcQhTh As4s2sAd 3hKsQd6d 9hJh7h9s 4d9d8d4h Td7s5d8s 8c5hTs5s"));
  }

  @Test
  public void test_omaha_holdem_7771_2c2h4c8dQc_5s4s8cJh_3hTs3dTd_QhAc4d4h() {
    assertEquals(
      "5s4s8cJh 3hTs3dTd QhAc4d4h",
      Solver.process("omaha-holdem 2c2h4c8dQc 5s4s8cJh 3hTs3dTd QhAc4d4h"));
  }

  @Test
  public void test_omaha_holdem_7772_4h7sKhQcTh_Qh7h6c2s_Jc4c2d4s_Js6d5s3d_8dTs3h8h_5h7cTcKs_5cJhAsJd_4dAhQsKc_KdQd9cTd_3s2h8c9s() {
    assertEquals(
      "3s2h8c9s Js6d5s3d 5h7cTcKs 4dAhQsKc=KdQd9cTd Jc4c2d4s 5cJhAsJd 8dTs3h8h Qh7h6c2s",
      Solver.process("omaha-holdem 4h7sKhQcTh Qh7h6c2s Jc4c2d4s Js6d5s3d 8dTs3h8h 5h7cTcKs 5cJhAsJd 4dAhQsKc KdQd9cTd 3s2h8c9s"));
  }

  @Test
  public void test_omaha_holdem_7773_9cAcAsJsQd_Tc9s6cKd_8d5c5d8c_Qs4h3h8h_Ad4d8s2c_Qc5h2h6s_3c7s7d2d_Jh6h2sAh() {
    assertEquals(
      "3c7s7d2d 8d5c5d8c Qc5h2h6s Qs4h3h8h Ad4d8s2c Tc9s6cKd Jh6h2sAh",
      Solver.process("omaha-holdem 9cAcAsJsQd Tc9s6cKd 8d5c5d8c Qs4h3h8h Ad4d8s2c Qc5h2h6s 3c7s7d2d Jh6h2sAh"));
  }

  @Test
  public void test_omaha_holdem_7774_5c6c7sAsQh_8d5hQsAc_Kc9cTcJc_5s3cQd2c_7dJh9sTs_8c4h4sKh() {
    assertEquals(
      "Kc9cTcJc 7dJh9sTs 5s3cQd2c 8d5hQsAc 8c4h4sKh",
      Solver.process("omaha-holdem 5c6c7sAsQh 8d5hQsAc Kc9cTcJc 5s3cQd2c 7dJh9sTs 8c4h4sKh"));
  }

  @Test
  public void test_omaha_holdem_7775_4h5h6s8cJs_5s3c7d2c_8h5dQc3d_Kh8s6h2h_7sQdKc3s_3h2dQhAc() {
    assertEquals(
      "8h5dQc3d Kh8s6h2h 3h2dQhAc 7sQdKc3s 5s3c7d2c",
      Solver.process("omaha-holdem 4h5h6s8cJs 5s3c7d2c 8h5dQc3d Kh8s6h2h 7sQdKc3s 3h2dQhAc"));
  }

  @Test
  public void test_omaha_holdem_7776_6d8sAhJcTc_3h3cKh4c_Qd7d8dTd_4s5cTh9h_9s6c4h3d() {
    assertEquals(
      "3h3cKh4c 9s6c4h3d 4s5cTh9h Qd7d8dTd",
      Solver.process("omaha-holdem 6d8sAhJcTc 3h3cKh4c Qd7d8dTd 4s5cTh9h 9s6c4h3d"));
  }

  @Test
  public void test_omaha_holdem_7777_9cJcKcQsTh_2h3c5s6h_5d7cJd3d_8d2cAhQd_7h2dAdQh_4h4c5cTs_8s4dTd3h() {
    assertEquals(
      "2h3c5s6h 5d7cJd3d 8s4dTd3h 7h2dAdQh=8d2cAhQd 4h4c5cTs",
      Solver.process("omaha-holdem 9cJcKcQsTh 2h3c5s6h 5d7cJd3d 8d2cAhQd 7h2dAdQh 4h4c5cTs 8s4dTd3h"));
  }

  @Test
  public void test_omaha_holdem_7778_2c4s6s9h9s_3d7hJhTs_9dAs7d5c_2d4hTc2h_TdQh5d8c() {
    assertEquals(
      "3d7hJhTs TdQh5d8c 9dAs7d5c 2d4hTc2h",
      Solver.process("omaha-holdem 2c4s6s9h9s 3d7hJhTs 9dAs7d5c 2d4hTc2h TdQh5d8c"));
  }

  @Test
  public void test_omaha_holdem_7779_4d5s7s9dQh_6dQc8dTc_9c9sAdJd_7d5h9h8c_Td8h2h5c_3s4sAs6c_Kd8sJhQd_4hJcAcAh_2s3h4c2d_Ks3c6s5d() {
    assertEquals(
      "2s3h4c2d Td8h2h5c Kd8sJhQd 4hJcAcAh 7d5h9h8c 9c9sAdJd 3s4sAs6c=Ks3c6s5d 6dQc8dTc",
      Solver.process("omaha-holdem 4d5s7s9dQh 6dQc8dTc 9c9sAdJd 7d5h9h8c Td8h2h5c 3s4sAs6c Kd8sJhQd 4hJcAcAh 2s3h4c2d Ks3c6s5d"));
  }

  @Test
  public void test_omaha_holdem_7780_2s4s8d8hTc_Ac6cKh7c_6h7sThTd_4dKcQdQc_Jh3h2d5c_3sTs4c7h_Js4hAd5d_9c9sQh9h() {
    assertEquals(
      "Ac6cKh7c Jh3h2d5c Js4hAd5d 9c9sQh9h 3sTs4c7h 4dKcQdQc 6h7sThTd",
      Solver.process("omaha-holdem 2s4s8d8hTc Ac6cKh7c 6h7sThTd 4dKcQdQc Jh3h2d5c 3sTs4c7h Js4hAd5d 9c9sQh9h"));
  }

  @Test
  public void test_omaha_holdem_7781_4s5s7hJcKd_4c6c6sKh_2dAsAhTh_3dKs5c2h_TsJd3cQc_Js9c6d5d_2s2c3s8s_4hAc4d7c() {
    assertEquals(
      "2s2c3s8s TsJd3cQc 2dAsAhTh Js9c6d5d 4c6c6sKh 3dKs5c2h 4hAc4d7c",
      Solver.process("omaha-holdem 4s5s7hJcKd 4c6c6sKh 2dAsAhTh 3dKs5c2h TsJd3cQc Js9c6d5d 2s2c3s8s 4hAc4d7c"));
  }

  @Test
  public void test_omaha_holdem_7782_4dAdJcJdTc_Jh3sQsKc_6d7sQdQh_8sTh9sJs_5h8dAs4s_7c7h9h3c_Kd9c2s2d_2h6h7d8c() {
    assertEquals(
      "2h6h7d8c 7c7h9h3c 5h8dAs4s Jh3sQsKc 6d7sQdQh Kd9c2s2d 8sTh9sJs",
      Solver.process("omaha-holdem 4dAdJcJdTc Jh3sQsKc 6d7sQdQh 8sTh9sJs 5h8dAs4s 7c7h9h3c Kd9c2s2d 2h6h7d8c"));
  }

  @Test
  public void test_omaha_holdem_7783_6s9hJcJsKs_Kd6c5h4c_6hQdAhKc_2cTcKhJh_8sAs2d9c_Qs7c4d5s() {
    assertEquals(
      "Kd6c5h4c 6hQdAhKc Qs7c4d5s 8sAs2d9c 2cTcKhJh",
      Solver.process("omaha-holdem 6s9hJcJsKs Kd6c5h4c 6hQdAhKc 2cTcKhJh 8sAs2d9c Qs7c4d5s"));
  }

  @Test
  public void test_omaha_holdem_7784_2h5c8hAcKd_7sKc6d7h_3d8dAh9s_QsQh3cJd_8s8cTc4d_4c2s6hTh_9dJs4hTs_4s5hQd2d_9cKs3s2c() {
    assertEquals(
      "9dJs4hTs 4c2s6hTh QsQh3cJd 7sKc6d7h 4s5hQd2d 9cKs3s2c 3d8dAh9s 8s8cTc4d",
      Solver.process("omaha-holdem 2h5c8hAcKd 7sKc6d7h 3d8dAh9s QsQh3cJd 8s8cTc4d 4c2s6hTh 9dJs4hTs 4s5hQd2d 9cKs3s2c"));
  }

  @Test
  public void test_omaha_holdem_7785_2h5d6hKsTc_3dKh8s5s_KdQc4c7h_5hTsAcAs_2c7c4sJs() {
    assertEquals(
      "2c7c4sJs KdQc4c7h 5hTsAcAs 3dKh8s5s",
      Solver.process("omaha-holdem 2h5d6hKsTc 3dKh8s5s KdQc4c7h 5hTsAcAs 2c7c4sJs"));
  }

  @Test
  public void test_omaha_holdem_7786_3h4d9hJhJs_AsQsQhTc_3d6sAdAc_Ts6h2s9s() {
    assertEquals(
      "Ts6h2s9s AsQsQhTc 3d6sAdAc",
      Solver.process("omaha-holdem 3h4d9hJhJs AsQsQhTc 3d6sAdAc Ts6h2s9s"));
  }

  @Test
  public void test_omaha_holdem_7787_3c4s5h7dQd_JsQh2d2h_JdTc7s8c_7hTd2s5d_3dThAs9c_3s8dQsAh_QcKcAd4h_5s9dKs4c() {
    assertEquals(
      "3dThAs9c JdTc7s8c JsQh2d2h 5s9dKs4c 7hTd2s5d 3s8dQsAh QcKcAd4h",
      Solver.process("omaha-holdem 3c4s5h7dQd JsQh2d2h JdTc7s8c 7hTd2s5d 3dThAs9c 3s8dQsAh QcKcAd4h 5s9dKs4c"));
  }

  @Test
  public void test_omaha_holdem_7788_9h9sJdKcQh_6hTd8s8c_AsKh4s2d() {
    assertEquals(
      "AsKh4s2d 6hTd8s8c",
      Solver.process("omaha-holdem 9h9sJdKcQh 6hTd8s8c AsKh4s2d"));
  }

  @Test
  public void test_omaha_holdem_7789_7c9dAhKcKs_5hTh5s5d_Td6sJsAc_QcQs2s8s_4h6h6d8d_Jc7s3cTs_8h7h2hKd_3sAd4d9c_5cKh6c2c() {
    assertEquals(
      "5hTh5s5d 4h6h6d8d Jc7s3cTs QcQs2s8s 3sAd4d9c Td6sJsAc 5cKh6c2c 8h7h2hKd",
      Solver.process("omaha-holdem 7c9dAhKcKs 5hTh5s5d Td6sJsAc QcQs2s8s 4h6h6d8d Jc7s3cTs 8h7h2hKd 3sAd4d9c 5cKh6c2c"));
  }

  @Test
  public void test_omaha_holdem_7790_3d5c8s9hQs_Jh2c7hKd_6hJd9d4c_8dTh9sTc_Kc4dQd6d_Kh5h8cTd() {
    assertEquals(
      "Jh2c7hKd 6hJd9d4c Kc4dQd6d Kh5h8cTd 8dTh9sTc",
      Solver.process("omaha-holdem 3d5c8s9hQs Jh2c7hKd 6hJd9d4c 8dTh9sTc Kc4dQd6d Kh5h8cTd"));
  }

  @Test
  public void test_omaha_holdem_7791_2h3h5h7cTh_TcKsKcKh_4sTd6d9c_2s4c5s5c_3dQsKdAs_JcQdAc7s_Qh3sJsAd_8c7hAh2d_9d5dTsJh() {
    assertEquals(
      "3dQsKdAs=Qh3sJsAd JcQdAc7s TcKsKcKh 9d5dTsJh 2s4c5s5c 4sTd6d9c 8c7hAh2d",
      Solver.process("omaha-holdem 2h3h5h7cTh TcKsKcKh 4sTd6d9c 2s4c5s5c 3dQsKdAs JcQdAc7s Qh3sJsAd 8c7hAh2d 9d5dTsJh"));
  }

  @Test
  public void test_omaha_holdem_7792_2c6s8c8hKh_KcJd3s6c_QcQsQh2s_Td4hKd9s_9d5cQd6d_Ac5s6h5d_8s9c8d7s_Ah7hJh3c_4sAdAs7d() {
    assertEquals(
      "Ah7hJh3c 9d5cQd6d Ac5s6h5d QcQsQh2s Td4hKd9s KcJd3s6c 4sAdAs7d 8s9c8d7s",
      Solver.process("omaha-holdem 2c6s8c8hKh KcJd3s6c QcQsQh2s Td4hKd9s 9d5cQd6d Ac5s6h5d 8s9c8d7s Ah7hJh3c 4sAdAs7d"));
  }

  @Test
  public void test_omaha_holdem_7793_5d5h6sKcKh_4d9s6h7d_7c3c5c9h() {
    assertEquals(
      "4d9s6h7d 7c3c5c9h",
      Solver.process("omaha-holdem 5d5h6sKcKh 4d9s6h7d 7c3c5c9h"));
  }

  @Test
  public void test_omaha_holdem_7794_4c4h8s9sKs_Qc9dJh8h_5d7cTh8d_9cAs6hJc_Tc3cAh9h_3d5cKd7d() {
    assertEquals(
      "5d7cTh8d 9cAs6hJc=Tc3cAh9h Qc9dJh8h 3d5cKd7d",
      Solver.process("omaha-holdem 4c4h8s9sKs Qc9dJh8h 5d7cTh8d 9cAs6hJc Tc3cAh9h 3d5cKd7d"));
  }

  @Test
  public void test_omaha_holdem_7795_4c8sAdKsTd_6c5d9dJh_Qh7s2sKd_9sTsKcQd_Ac6d3h6s_4s6h9cQc_7h5c3cQs_8dTc2c7d_Th9h7c3d_KhAh5s2h() {
    assertEquals(
      "6c5d9dJh 7h5c3cQs 4s6h9cQc Th9h7c3d Qh7s2sKd Ac6d3h6s 8dTc2c7d 9sTsKcQd KhAh5s2h",
      Solver.process("omaha-holdem 4c8sAdKsTd 6c5d9dJh Qh7s2sKd 9sTsKcQd Ac6d3h6s 4s6h9cQc 7h5c3cQs 8dTc2c7d Th9h7c3d KhAh5s2h"));
  }

  @Test
  public void test_omaha_holdem_7796_4c7h9sTcTh_8h6sQc7d_AhAs5d4s_Qh9d9h5s_Ts7c7sJc_4d6h8dJs_Ks4hKcAc_5c5hKh2h() {
    assertEquals(
      "5c5hKh2h Ks4hKcAc AhAs5d4s 8h6sQc7d 4d6h8dJs Qh9d9h5s Ts7c7sJc",
      Solver.process("omaha-holdem 4c7h9sTcTh 8h6sQc7d AhAs5d4s Qh9d9h5s Ts7c7sJc 4d6h8dJs Ks4hKcAc 5c5hKh2h"));
  }

  @Test
  public void test_omaha_holdem_7797_6s7d8h9dQh_3sTsAdKs_Th5h8s5d_QcTc9s2h_3dAh7c4c_8dQs6dAs_4d3c9c2c_JdJh3hTd() {
    assertEquals(
      "3sTsAdKs 3dAh7c4c 4d3c9c2c 8dQs6dAs QcTc9s2h=Th5h8s5d JdJh3hTd",
      Solver.process("omaha-holdem 6s7d8h9dQh 3sTsAdKs Th5h8s5d QcTc9s2h 3dAh7c4c 8dQs6dAs 4d3c9c2c JdJh3hTd"));
  }

  @Test
  public void test_omaha_holdem_7798_3c4c4s7hAs_AdKhAcQs_Qc9s6d9d_6c3d7cKc_6sTdTc7d_6hJcTsJd_7s5c5h8h_Th9h2hQh() {
    assertEquals(
      "Th9h2hQh 7s5c5h8h 6c3d7cKc Qc9s6d9d 6sTdTc7d 6hJcTsJd AdKhAcQs",
      Solver.process("omaha-holdem 3c4c4s7hAs AdKhAcQs Qc9s6d9d 6c3d7cKc 6sTdTc7d 6hJcTsJd 7s5c5h8h Th9h2hQh"));
  }

  @Test
  public void test_omaha_holdem_7799_6h7d8dAdAs_JhTd8c2h_5c7cTs5h() {
    assertEquals(
      "5c7cTs5h JhTd8c2h",
      Solver.process("omaha-holdem 6h7d8dAdAs JhTd8c2h 5c7cTs5h"));
  }

  @Test
  public void test_omaha_holdem_7800_4s5s6s7sKh_2c4hThQd_3s7hJdAd_Jc9c7cTs_Ah7dJs8s_Ks9dTd6c_4d2dKcTc() {
    assertEquals(
      "2c4hThQd Jc9c7cTs 4d2dKcTc Ks9dTd6c 3s7hJdAd Ah7dJs8s",
      Solver.process("omaha-holdem 4s5s6s7sKh 2c4hThQd 3s7hJdAd Jc9c7cTs Ah7dJs8s Ks9dTd6c 4d2dKcTc"));
  }

  @Test
  public void test_omaha_holdem_7801_3h4c6c6s8h_9h9dKd8s_7d7hTh6h_5s3cAcJc_5hKs7s8c_QhJd2dAh() {
    assertEquals(
      "QhJd2dAh 5s3cAcJc 9h9dKd8s 7d7hTh6h 5hKs7s8c",
      Solver.process("omaha-holdem 3h4c6c6s8h 9h9dKd8s 7d7hTh6h 5s3cAcJc 5hKs7s8c QhJd2dAh"));
  }

  @Test
  public void test_omaha_holdem_7802_2h3sAsQdTh_6h7cAh3h_2s5s4sQc_8d6c2c4d() {
    assertEquals(
      "8d6c2c4d 6h7cAh3h 2s5s4sQc",
      Solver.process("omaha-holdem 2h3sAsQdTh 6h7cAh3h 2s5s4sQc 8d6c2c4d"));
  }

  @Test
  public void test_omaha_holdem_7803_2s6h6s9cKd_Jd3hQs4s_9sTcQh2h_Kh3dJcJs_8sQd6d5s_Ts4c6cQc() {
    assertEquals(
      "Jd3hQs4s 9sTcQh2h Kh3dJcJs 8sQd6d5s=Ts4c6cQc",
      Solver.process("omaha-holdem 2s6h6s9cKd Jd3hQs4s 9sTcQh2h Kh3dJcJs 8sQd6d5s Ts4c6cQc"));
  }

  @Test
  public void test_omaha_holdem_7804_4c4d6dAdKc_2dThTc5h_JsQs4hQc_Kh6sAhTd() {
    assertEquals(
      "2dThTc5h Kh6sAhTd JsQs4hQc",
      Solver.process("omaha-holdem 4c4d6dAdKc 2dThTc5h JsQs4hQc Kh6sAhTd"));
  }

  @Test
  public void test_omaha_holdem_7805_2c5h9sJsKd_Ah3h9c7d_Jh8c7h5s_6hQc3s8h_9d6dKcKh_8sTdQhAc() {
    assertEquals(
      "6hQc3s8h Ah3h9c7d Jh8c7h5s 9d6dKcKh 8sTdQhAc",
      Solver.process("omaha-holdem 2c5h9sJsKd Ah3h9c7d Jh8c7h5s 6hQc3s8h 9d6dKcKh 8sTdQhAc"));
  }

  @Test
  public void test_omaha_holdem_7806_8c8hJsQcQs_3d2hQd5s_3cJdTc6s_7s7hAd2c_7dKh5c2s_KcThJh9h_5h6c3sJc() {
    assertEquals(
      "7dKh5c2s 7s7hAd2c 5h6c3sJc 3cJdTc6s 3d2hQd5s KcThJh9h",
      Solver.process("omaha-holdem 8c8hJsQcQs 3d2hQd5s 3cJdTc6s 7s7hAd2c 7dKh5c2s KcThJh9h 5h6c3sJc"));
  }

  @Test
  public void test_omaha_holdem_7807_2d3s6d6hKs_8h5h5dJs_Td9hKdTc_5cAcJd9s_AdQd7h6s_2sAsQc4d() {
    assertEquals(
      "5cAcJd9s 2sAsQc4d 8h5h5dJs Td9hKdTc AdQd7h6s",
      Solver.process("omaha-holdem 2d3s6d6hKs 8h5h5dJs Td9hKdTc 5cAcJd9s AdQd7h6s 2sAsQc4d"));
  }

  @Test
  public void test_omaha_holdem_7808_3d5d6sJcJh_6h8s5hJd_2d8d6c4d_As5cAd9d_3s3c4h4c_3hKs8c9c_7sThJsQs_9sTdQd6d_8h7cKdQc_2sAcQhKc() {
    assertEquals(
      "8h7cKdQc 2sAcQhKc 3hKs8c9c 9sTdQd6d As5cAd9d 7sThJsQs 2d8d6c4d 3s3c4h4c 6h8s5hJd",
      Solver.process("omaha-holdem 3d5d6sJcJh 6h8s5hJd 2d8d6c4d As5cAd9d 3s3c4h4c 3hKs8c9c 7sThJsQs 9sTdQd6d 8h7cKdQc 2sAcQhKc"));
  }

  @Test
  public void test_omaha_holdem_7809_5s9cAdAsQc_5cQsTdKd_3h6d9dAh_Kh8h2h4s_Jc7d4h8s_9s2s7c8d() {
    assertEquals(
      "Jc7d4h8s Kh8h2h4s 9s2s7c8d 5cQsTdKd 3h6d9dAh",
      Solver.process("omaha-holdem 5s9cAdAsQc 5cQsTdKd 3h6d9dAh Kh8h2h4s Jc7d4h8s 9s2s7c8d"));
  }

  @Test
  public void test_omaha_holdem_7810_5c6s8cJdJh_9d7c9sKs_Ts8s4sKd_6h5hQc9c_3d2h7d3s_AdAcQd2c_4cJcTd6c_JsTh5sAs_6d3hAhTc() {
    assertEquals(
      "3d2h7d3s 6h5hQc9c 6d3hAhTc Ts8s4sKd AdAcQd2c 9d7c9sKs JsTh5sAs 4cJcTd6c",
      Solver.process("omaha-holdem 5c6s8cJdJh 9d7c9sKs Ts8s4sKd 6h5hQc9c 3d2h7d3s AdAcQd2c 4cJcTd6c JsTh5sAs 6d3hAhTc"));
  }

  @Test
  public void test_omaha_holdem_7811_7c8d9h9sKh_Th8h9c8c_KcQs4dJc() {
    assertEquals(
      "KcQs4dJc Th8h9c8c",
      Solver.process("omaha-holdem 7c8d9h9sKh Th8h9c8c KcQs4dJc"));
  }

  @Test
  public void test_omaha_holdem_7812_3s5c5h7cAd_8d5d4h4d_6s2h9d7s_Ah7d8sQs_Td6h5sTh() {
    assertEquals(
      "6s2h9d7s Ah7d8sQs 8d5d4h4d Td6h5sTh",
      Solver.process("omaha-holdem 3s5c5h7cAd 8d5d4h4d 6s2h9d7s Ah7d8sQs Td6h5sTh"));
  }

  @Test
  public void test_omaha_holdem_7813_5h8sKcQcQs_2h5s8dKd_4c9d7s5d_7cAcThTd_Ts2s4d4h_Jh9c6h6c_Js5c8cKh_8h2cQdJd_AsAh3d7h() {
    assertEquals(
      "Ts2s4d4h 4c9d7s5d Jh9c6h6c 7cAcThTd 2h5s8dKd Js5c8cKh AsAh3d7h 8h2cQdJd",
      Solver.process("omaha-holdem 5h8sKcQcQs 2h5s8dKd 4c9d7s5d 7cAcThTd Ts2s4d4h Jh9c6h6c Js5c8cKh 8h2cQdJd AsAh3d7h"));
  }

  @Test
  public void test_omaha_holdem_7814_7c7d9sAsQd_4d6d5c9c_8cJcJhJs_6h2h9dKd_AdAc3dQc_Qh2d2cQs_3s2s3c6s() {
    assertEquals(
      "3s2s3c6s 4d6d5c9c 6h2h9dKd 8cJcJhJs Qh2d2cQs AdAc3dQc",
      Solver.process("omaha-holdem 7c7d9sAsQd 4d6d5c9c 8cJcJhJs 6h2h9dKd AdAc3dQc Qh2d2cQs 3s2s3c6s"));
  }

  @Test
  public void test_omaha_holdem_7815_3c6s9h9sQd_9cKh7cAd_8d2s4s4c_TcTdKs7h_6cAcJs4h_Jh5c9d5h_3s7d2cJc() {
    assertEquals(
      "3s7d2cJc 8d2s4s4c 6cAcJs4h TcTdKs7h Jh5c9d5h 9cKh7cAd",
      Solver.process("omaha-holdem 3c6s9h9sQd 9cKh7cAd 8d2s4s4c TcTdKs7h 6cAcJs4h Jh5c9d5h 3s7d2cJc"));
  }

  @Test
  public void test_omaha_holdem_7816_3d4d6d7sAd_As2d2c8c_3h9sQc3s() {
    assertEquals(
      "As2d2c8c 3h9sQc3s",
      Solver.process("omaha-holdem 3d4d6d7sAd As2d2c8c 3h9sQc3s"));
  }

  @Test
  public void test_omaha_holdem_7817_2c6d6h9sAs_8hAcQd2h_6s9d4h4d_Ad5c9c7s() {
    assertEquals(
      "8hAcQd2h Ad5c9c7s 6s9d4h4d",
      Solver.process("omaha-holdem 2c6d6h9sAs 8hAcQd2h 6s9d4h4d Ad5c9c7s"));
  }

  @Test
  public void test_omaha_holdem_7818_5c5s7c7sJh_TsQd8c3c_As6cAh2c() {
    assertEquals(
      "TsQd8c3c As6cAh2c",
      Solver.process("omaha-holdem 5c5s7c7sJh TsQd8c3c As6cAh2c"));
  }

  @Test
  public void test_omaha_holdem_7819_8s9cAdAsKs_3sQsQh8d_4c3hKdJd_4hAc2hQc_9s2c8h5h_6s5c6c3d_2d4d7hJh_9h5d7sAh() {
    assertEquals(
      "2d4d7hJh 6s5c6c3d 9s2c8h5h 4c3hKdJd 4hAc2hQc 3sQsQh8d 9h5d7sAh",
      Solver.process("omaha-holdem 8s9cAdAsKs 3sQsQh8d 4c3hKdJd 4hAc2hQc 9s2c8h5h 6s5c6c3d 2d4d7hJh 9h5d7sAh"));
  }

  @Test
  public void test_omaha_holdem_7820_2h2s6hJcQh_Ks4hKc2c_Kh3s9s4c_TsTc5sJh_QcAh4d2d_Js3h3dAs_8d7sAc8h() {
    assertEquals(
      "Kh3s9s4c 8d7sAc8h TsTc5sJh Js3h3dAs Ks4hKc2c QcAh4d2d",
      Solver.process("omaha-holdem 2h2s6hJcQh Ks4hKc2c Kh3s9s4c TsTc5sJh QcAh4d2d Js3h3dAs 8d7sAc8h"));
  }

  @Test
  public void test_omaha_holdem_7821_3d8cKcKdQc_7c9hJs2c_4sTsAdJc_6c9c2h8s_QsJd7h5d() {
    assertEquals(
      "4sTsAdJc QsJd7h5d 7c9hJs2c 6c9c2h8s",
      Solver.process("omaha-holdem 3d8cKcKdQc 7c9hJs2c 4sTsAdJc 6c9c2h8s QsJd7h5d"));
  }

  @Test
  public void test_omaha_holdem_7822_2d5d5h9cKd_4s6hJd3h_8sAhQd8c_KsKcTcKh_4c7c5sQs_3sAcTh2s() {
    assertEquals(
      "4s6hJd3h 3sAcTh2s 8sAhQd8c 4c7c5sQs KsKcTcKh",
      Solver.process("omaha-holdem 2d5d5h9cKd 4s6hJd3h 8sAhQd8c KsKcTcKh 4c7c5sQs 3sAcTh2s"));
  }

  @Test
  public void test_omaha_holdem_7823_2h4h5c5dKh_6h5sJcQc_Td3d3cKs_9cAcJhKc_3h8dTcAs() {
    assertEquals(
      "Td3d3cKs 9cAcJhKc 6h5sJcQc 3h8dTcAs",
      Solver.process("omaha-holdem 2h4h5c5dKh 6h5sJcQc Td3d3cKs 9cAcJhKc 3h8dTcAs"));
  }

  @Test
  public void test_omaha_holdem_7824_2h5d8hAdTh_KdJsKh8s_9s3cAs8d_Ts5hTc6h_6s9h3d2s_9d5cQd7s_2c2d4c8c() {
    assertEquals(
      "6s9h3d2s 9d5cQd7s KdJsKh8s 9s3cAs8d 2c2d4c8c Ts5hTc6h",
      Solver.process("omaha-holdem 2h5d8hAdTh KdJsKh8s 9s3cAs8d Ts5hTc6h 6s9h3d2s 9d5cQd7s 2c2d4c8c"));
  }

  @Test
  public void test_omaha_holdem_7825_2h3h7h8hKd_Tc3c4c2c_4h5c6h5s_AsThKhJs_4sJd2d9c_AcAdJc8d_KsQd9dTs() {
    assertEquals(
      "4sJd2d9c KsQd9dTs AcAdJc8d Tc3c4c2c 4h5c6h5s AsThKhJs",
      Solver.process("omaha-holdem 2h3h7h8hKd Tc3c4c2c 4h5c6h5s AsThKhJs 4sJd2d9c AcAdJc8d KsQd9dTs"));
  }

  @Test
  public void test_omaha_holdem_7826_5d7h7sAdJd_3d6d7d3h_9sQdQs2d_QhTh4s3s_AsAc8dTd_Jc2sKcKs_2c5c3c5s() {
    assertEquals(
      "QhTh4s3s Jc2sKcKs 3d6d7d3h 9sQdQs2d 2c5c3c5s AsAc8dTd",
      Solver.process("omaha-holdem 5d7h7sAdJd 3d6d7d3h 9sQdQs2d QhTh4s3s AsAc8dTd Jc2sKcKs 2c5c3c5s"));
  }

  @Test
  public void test_omaha_holdem_7827_4c6cAsKdQd_4sTsJc9c_TcAd6hJs_Td5h7dQc_8h9sQh3h_Jh4hKs2s() {
    assertEquals(
      "8h9sQh3h Td5h7dQc Jh4hKs2s 4sTsJc9c=TcAd6hJs",
      Solver.process("omaha-holdem 4c6cAsKdQd 4sTsJc9c TcAd6hJs Td5h7dQc 8h9sQh3h Jh4hKs2s"));
  }

  @Test
  public void test_omaha_holdem_7828_2s3h8cJdTh_7h7c8s6s_9hAs2d2h_Tc4sJs8h_KhKs4hQd_9d4d9c4c_3c5dKdJc_7d8d3dAh_QhQcKc5h() {
    assertEquals(
      "7h7c8s6s 9d4d9c4c QhQcKc5h KhKs4hQd 7d8d3dAh 3c5dKdJc Tc4sJs8h 9hAs2d2h",
      Solver.process("omaha-holdem 2s3h8cJdTh 7h7c8s6s 9hAs2d2h Tc4sJs8h KhKs4hQd 9d4d9c4c 3c5dKdJc 7d8d3dAh QhQcKc5h"));
  }

  @Test
  public void test_omaha_holdem_7829_4h5d7dKdQc_8c5h2dJc_5s4c6dAd_9s2c9d4s_TdKs3dKh_9h7hJs6c_JhAs3h3s_6s8s8hQh_7cAh5c3c() {
    assertEquals(
      "JhAs3h3s 8c5h2dJc 9h7hJs6c 9s2c9d4s 7cAh5c3c 6s8s8hQh TdKs3dKh 5s4c6dAd",
      Solver.process("omaha-holdem 4h5d7dKdQc 8c5h2dJc 5s4c6dAd 9s2c9d4s TdKs3dKh 9h7hJs6c JhAs3h3s 6s8s8hQh 7cAh5c3c"));
  }

  @Test
  public void test_omaha_holdem_7830_5hAsJsQhTd_7d9dAc9c_8d3s8h5c_Kd2d2c2h_Jh9hKcQs_4c7c4hAh_JcKs5s7h() {
    assertEquals(
      "Kd2d2c2h 8d3s8h5c 4c7c4hAh 7d9dAc9c JcKs5s7h=Jh9hKcQs",
      Solver.process("omaha-holdem 5hAsJsQhTd 7d9dAc9c 8d3s8h5c Kd2d2c2h Jh9hKcQs 4c7c4hAh JcKs5s7h"));
  }

  @Test
  public void test_omaha_holdem_7831_5c5s6c6dQd_Jc2s4d7c_3c9d9cTd() {
    assertEquals(
      "Jc2s4d7c 3c9d9cTd",
      Solver.process("omaha-holdem 5c5s6c6dQd Jc2s4d7c 3c9d9cTd"));
  }

  @Test
  public void test_omaha_holdem_7832_3s5s6h6sQh_Th5c4c2h_8hKs6cJs_9c7cAh3h_Tc4d7h7s_8sQc8dQs_4hTsJd2s_5hKhTdQd_Ac7d5dAd() {
    assertEquals(
      "9c7cAh3h 5hKhTdQd Ac7d5dAd Th5c4c2h Tc4d7h7s 4hTsJd2s 8hKs6cJs 8sQc8dQs",
      Solver.process("omaha-holdem 3s5s6h6sQh Th5c4c2h 8hKs6cJs 9c7cAh3h Tc4d7h7s 8sQc8dQs 4hTsJd2s 5hKhTdQd Ac7d5dAd"));
  }

  @Test
  public void test_omaha_holdem_7833_2c6c6h8cAd_Jh5s9cAh_Tc7h4d8s() {
    assertEquals(
      "Tc7h4d8s Jh5s9cAh",
      Solver.process("omaha-holdem 2c6c6h8cAd Jh5s9cAh Tc7h4d8s"));
  }

  @Test
  public void test_omaha_holdem_7834_5d7s8sJdKs_Jh2sTs5h_6c7dQs6h_5c3hTc4h_9d8hQc9s_3d5s3c2d_9h8dAsKc_4sTh9c6s_JcQhQdAh_3sAd8c4d() {
    assertEquals(
      "3d5s3c2d 5c3hTc4h 6c7dQs6h 3sAd8c4d 9d8hQc9s JcQhQdAh 9h8dAsKc 4sTh9c6s Jh2sTs5h",
      Solver.process("omaha-holdem 5d7s8sJdKs Jh2sTs5h 6c7dQs6h 5c3hTc4h 9d8hQc9s 3d5s3c2d 9h8dAsKc 4sTh9c6s JcQhQdAh 3sAd8c4d"));
  }

  @Test
  public void test_omaha_holdem_7835_5d5h8sTdTs_9s4dJhKh_5c6hAcJs_2hJd3cKs_7h7c5s3s_4sQc7d9h_9c6dAhKc_Qh2dAs3h_Tc4c2c6c_JcKd4h8h() {
    assertEquals(
      "4sQc7d9h 2hJd3cKs=9s4dJhKh Qh2dAs3h 9c6dAhKc JcKd4h8h 7h7c5s3s 5c6hAcJs Tc4c2c6c",
      Solver.process("omaha-holdem 5d5h8sTdTs 9s4dJhKh 5c6hAcJs 2hJd3cKs 7h7c5s3s 4sQc7d9h 9c6dAhKc Qh2dAs3h Tc4c2c6c JcKd4h8h"));
  }

  @Test
  public void test_omaha_holdem_7836_3d4dQhTdTh_QsTc8d3c_4c3sAc2s_Kd7c5h7h_7dAd9c8s_2h6sJh3h_2c6d4s9h_AhKsJsQd_7sKc5d6c_6h5c9dQc() {
    assertEquals(
      "7sKc5d6c 2h6sJh3h 2c6d4s9h 4c3sAc2s Kd7c5h7h 6h5c9dQc AhKsJsQd 7dAd9c8s QsTc8d3c",
      Solver.process("omaha-holdem 3d4dQhTdTh QsTc8d3c 4c3sAc2s Kd7c5h7h 7dAd9c8s 2h6sJh3h 2c6d4s9h AhKsJsQd 7sKc5d6c 6h5c9dQc"));
  }

  @Test
  public void test_omaha_holdem_7837_2h3c9c9sQd_8sAcJc7d_Qs6s5s6c_3s9dJdKs_KcAs4s3d_Kd4d8d8h_2d7h6d7c_4h4cAdQh_JsJhQc3h() {
    assertEquals(
      "8sAcJc7d KcAs4s3d 2d7h6d7c Kd4d8d8h Qs6s5s6c JsJhQc3h 4h4cAdQh 3s9dJdKs",
      Solver.process("omaha-holdem 2h3c9c9sQd 8sAcJc7d Qs6s5s6c 3s9dJdKs KcAs4s3d Kd4d8d8h 2d7h6d7c 4h4cAdQh JsJhQc3h"));
  }

  @Test
  public void test_omaha_holdem_7838_5h8c9dKsQc_8d7c9hTs_Tc5sAc8s() {
    assertEquals(
      "Tc5sAc8s 8d7c9hTs",
      Solver.process("omaha-holdem 5h8c9dKsQc 8d7c9hTs Tc5sAc8s"));
  }

  @Test
  public void test_omaha_holdem_7839_4h8c8sAcKs_3h4d3c6s_2h9sQcTs_ThQdKdJd() {
    assertEquals(
      "2h9sQcTs 3h4d3c6s ThQdKdJd",
      Solver.process("omaha-holdem 4h8c8sAcKs 3h4d3c6s 2h9sQcTs ThQdKdJd"));
  }

  @Test
  public void test_omaha_holdem_7840_5c8sKdThTs_8d7h4hKs_7d2c5dAs_2h4cJhAd_Ah3d6c9d_8h9s4s4d_2sKcAc3h_KhQcQs8c_Qd6hTcTd() {
    assertEquals(
      "Ah3d6c9d 2h4cJhAd 7d2c5dAs 8h9s4s4d 8d7h4hKs KhQcQs8c 2sKcAc3h Qd6hTcTd",
      Solver.process("omaha-holdem 5c8sKdThTs 8d7h4hKs 7d2c5dAs 2h4cJhAd Ah3d6c9d 8h9s4s4d 2sKcAc3h KhQcQs8c Qd6hTcTd"));
  }

  @Test
  public void test_omaha_holdem_7841_2h3h5c6d6s_AcQs5h8h_KcTs8dJh_3c4s9h8c_JcKd7c4h_7hAsJd3s_7dQc5d5s_Qh8sTd4c_9c9dAhQd() {
    assertEquals(
      "Qh8sTd4c KcTs8dJh 7hAsJd3s AcQs5h8h 9c9dAhQd 3c4s9h8c JcKd7c4h 7dQc5d5s",
      Solver.process("omaha-holdem 2h3h5c6d6s AcQs5h8h KcTs8dJh 3c4s9h8c JcKd7c4h 7hAsJd3s 7dQc5d5s Qh8sTd4c 9c9dAhQd"));
  }

  @Test
  public void test_omaha_holdem_7842_5d6hAhKcKd_Jd5h4d7s_3cTdKs4s_5s3h7c5c() {
    assertEquals(
      "Jd5h4d7s 3cTdKs4s 5s3h7c5c",
      Solver.process("omaha-holdem 5d6hAhKcKd Jd5h4d7s 3cTdKs4s 5s3h7c5c"));
  }

  @Test
  public void test_omaha_holdem_7843_3h5hAdJhTd_3s9cKh2d_AhQs8c4d_7cTsJcTh_6c3d2s9h_5cTc3c4c_6s9sKcKs() {
    assertEquals(
      "6c3d2s9h 3s9cKh2d 6s9sKcKs AhQs8c4d 5cTc3c4c 7cTsJcTh",
      Solver.process("omaha-holdem 3h5hAdJhTd 3s9cKh2d AhQs8c4d 7cTsJcTh 6c3d2s9h 5cTc3c4c 6s9sKcKs"));
  }

  @Test
  public void test_omaha_holdem_7844_3s8h9hJhQc_Ac6c9d6d_Kh2cTd8s_5c5h3hJc_As7h2d2h_Ts7s4s4d_3c5dThKc_Qs4hAh7c() {
    assertEquals(
      "Ac6c9d6d Ts7s4s4d 3c5dThKc=Kh2cTd8s 5c5h3hJc As7h2d2h Qs4hAh7c",
      Solver.process("omaha-holdem 3s8h9hJhQc Ac6c9d6d Kh2cTd8s 5c5h3hJc As7h2d2h Ts7s4s4d 3c5dThKc Qs4hAh7c"));
  }

  @Test
  public void test_omaha_holdem_7845_2c3c5c5s9h_TdKsAdTh_3s6c2sJc_8h9sAc7c() {
    assertEquals(
      "TdKsAdTh 3s6c2sJc 8h9sAc7c",
      Solver.process("omaha-holdem 2c3c5c5s9h TdKsAdTh 3s6c2sJc 8h9sAc7c"));
  }

  @Test
  public void test_omaha_holdem_7846_2h4c4dJcKd_8h6d2sJd_Qh6s7h2c_9c7sAh3h_6cKhAc3c() {
    assertEquals(
      "9c7sAh3h Qh6s7h2c 8h6d2sJd 6cKhAc3c",
      Solver.process("omaha-holdem 2h4c4dJcKd 8h6d2sJd Qh6s7h2c 9c7sAh3h 6cKhAc3c"));
  }

  @Test
  public void test_omaha_holdem_7847_5dAcJcJdKd_4c3h3d7s_QsAs3c2d_Ad6cKh2c_9d3s4d9c_8c8dJh8h_5sQd4h7c_Ks2s9sTc_AhKcTsTh_7hTd4s6s() {
    assertEquals(
      "7hTd4s6s 4c3h3d7s 5sQd4h7c Ks2s9sTc QsAs3c2d Ad6cKh2c=AhKcTsTh 8c8dJh8h 9d3s4d9c",
      Solver.process("omaha-holdem 5dAcJcJdKd 4c3h3d7s QsAs3c2d Ad6cKh2c 9d3s4d9c 8c8dJh8h 5sQd4h7c Ks2s9sTc AhKcTsTh 7hTd4s6s"));
  }

  @Test
  public void test_omaha_holdem_7848_6c7c8hKcKh_6sJd2c2d_8c3hQh4c() {
    assertEquals(
      "6sJd2c2d 8c3hQh4c",
      Solver.process("omaha-holdem 6c7c8hKcKh 6sJd2c2d 8c3hQh4c"));
  }

  @Test
  public void test_omaha_holdem_7849_5hAcAdJhJs_8h3s4s4d_AsKdJd2d() {
    assertEquals(
      "8h3s4s4d AsKdJd2d",
      Solver.process("omaha-holdem 5hAcAdJhJs 8h3s4s4d AsKdJd2d"));
  }

  @Test
  public void test_omaha_holdem_7850_3s9c9dAsQc_QsTs4h6s_Td6cKhTh_Ad2hJd4s_5h6hKd9s_2d5c4d3h_6d7s7c5d_5s8c8hJs_2c3d9hKs_7dTc8d4c() {
    assertEquals(
      "7dTc8d4c 2d5c4d3h 6d7s7c5d 5s8c8hJs Td6cKhTh QsTs4h6s Ad2hJd4s 5h6hKd9s 2c3d9hKs",
      Solver.process("omaha-holdem 3s9c9dAsQc QsTs4h6s Td6cKhTh Ad2hJd4s 5h6hKd9s 2d5c4d3h 6d7s7c5d 5s8c8hJs 2c3d9hKs 7dTc8d4c"));
  }

  @Test
  public void test_omaha_holdem_7851_3h5h5s8sQs_Jh9sQcKd_Kh2cQh7h_6h4c7d6d_5dAc4hKs_4s8c4dTh() {
    assertEquals(
      "6h4c7d6d 4s8c4dTh Jh9sQcKd=Kh2cQh7h 5dAc4hKs",
      Solver.process("omaha-holdem 3h5h5s8sQs Jh9sQcKd Kh2cQh7h 6h4c7d6d 5dAc4hKs 4s8c4dTh"));
  }

  @Test
  public void test_omaha_holdem_7852_8c8h9dAsKs_ThKd9hAh_7c4sQhTs_2d4h9c9s_7h3c2cJc_5hTc8dQd_Js5d4c5c_3h7d2s6d_AcJd3s6s_Td6h8s4d() {
    assertEquals(
      "3h7d2s6d 7h3c2cJc 7c4sQhTs Js5d4c5c AcJd3s6s ThKd9hAh Td6h8s4d 5hTc8dQd 2d4h9c9s",
      Solver.process("omaha-holdem 8c8h9dAsKs ThKd9hAh 7c4sQhTs 2d4h9c9s 7h3c2cJc 5hTc8dQd Js5d4c5c 3h7d2s6d AcJd3s6s Td6h8s4d"));
  }

  @Test
  public void test_omaha_holdem_7853_7d7s8hKhTs_5s2s3hKc_7cAd4cKs_9sQcJhAc_3d2hQhQs_9d6c5d6h_Jd6d5h8s_Th4s3c4d_JsAhQd3s_As9cTc2d() {
    assertEquals(
      "JsAhQd3s Jd6d5h8s Th4s3c4d As9cTc2d 3d2hQhQs 5s2s3hKc 9d6c5d6h 9sQcJhAc 7cAd4cKs",
      Solver.process("omaha-holdem 7d7s8hKhTs 5s2s3hKc 7cAd4cKs 9sQcJhAc 3d2hQhQs 9d6c5d6h Jd6d5h8s Th4s3c4d JsAhQd3s As9cTc2d"));
  }

  @Test
  public void test_omaha_holdem_7854_2d6c6d6h7h_Jd8hKd2s_5s7d4dTc_QdKc2cJc_7c9sTd5c() {
    assertEquals(
      "5s7d4dTc 7c9sTd5c Jd8hKd2s QdKc2cJc",
      Solver.process("omaha-holdem 2d6c6d6h7h Jd8hKd2s 5s7d4dTc QdKc2cJc 7c9sTd5c"));
  }

  @Test
  public void test_omaha_holdem_7855_6c6h8cKdQd_3cKc8s9d_7c4h4c5d_AcKhQs4d() {
    assertEquals(
      "7c4h4c5d 3cKc8s9d AcKhQs4d",
      Solver.process("omaha-holdem 6c6h8cKdQd 3cKc8s9d 7c4h4c5d AcKhQs4d"));
  }

  @Test
  public void test_omaha_holdem_7856_3h5s7c8dTc_7d4d6hKs_9c4cJdAh_3d4sQcAs_3c2cKcJc_KhJh9hTh_Js2h9s4h() {
    assertEquals(
      "3c2cKcJc 3d4sQcAs 7d4d6hKs 9c4cJdAh=Js2h9s4h=KhJh9hTh",
      Solver.process("omaha-holdem 3h5s7c8dTc 7d4d6hKs 9c4cJdAh 3d4sQcAs 3c2cKcJc KhJh9hTh Js2h9s4h"));
  }

  @Test
  public void test_omaha_holdem_7857_5s6c7d9dKd_4s9hJsQd_QcTs9sTh_Ah3c3d5h_TdAdKs6d() {
    assertEquals(
      "Ah3c3d5h 4s9hJsQd QcTs9sTh TdAdKs6d",
      Solver.process("omaha-holdem 5s6c7d9dKd 4s9hJsQd QcTs9sTh Ah3c3d5h TdAdKs6d"));
  }

  @Test
  public void test_omaha_holdem_7858_2h4d6s8hQd_Ks3c3s9s_JdThJc6c_7h4h9c6h() {
    assertEquals(
      "Ks3c3s9s JdThJc6c 7h4h9c6h",
      Solver.process("omaha-holdem 2h4d6s8hQd Ks3c3s9s JdThJc6c 7h4h9c6h"));
  }

  @Test
  public void test_omaha_holdem_7859_4hAhJcQhTs_7d8h6sKs_Tc2s9sJd_Kd9h3c3d_6d7h2h5c_5d5s4c9d_3s2dJs8d_AsJh6h9c_Qs7c8cTh() {
    assertEquals(
      "7d8h6sKs 5d5s4c9d 3s2dJs8d Tc2s9sJd Qs7c8cTh Kd9h3c3d 6d7h2h5c AsJh6h9c",
      Solver.process("omaha-holdem 4hAhJcQhTs 7d8h6sKs Tc2s9sJd Kd9h3c3d 6d7h2h5c 5d5s4c9d 3s2dJs8d AsJh6h9c Qs7c8cTh"));
  }

  @Test
  public void test_omaha_holdem_7860_2s9c9dAhJs_2cJh4d8h_4hAd5h2d_QsKcJd6s_Tc3s7cKs_7hQcTsJc_ThAs4s5d_5s9hAc3d() {
    assertEquals(
      "Tc3s7cKs 2cJh4d8h 7hQcTsJc QsKcJd6s 4hAd5h2d ThAs4s5d 5s9hAc3d",
      Solver.process("omaha-holdem 2s9c9dAhJs 2cJh4d8h 4hAd5h2d QsKcJd6s Tc3s7cKs 7hQcTsJc ThAs4s5d 5s9hAc3d"));
  }

  @Test
  public void test_omaha_holdem_7861_2h4h6hKdTd_7h6s3cQd_5cThKh4s_3h5hJcQs() {
    assertEquals(
      "7h6s3cQd 5cThKh4s 3h5hJcQs",
      Solver.process("omaha-holdem 2h4h6hKdTd 7h6s3cQd 5cThKh4s 3h5hJcQs"));
  }

  @Test
  public void test_omaha_holdem_7862_4d5sQhTcTh_8cJs9c6c_5dKs7cTd_4h2c3dJc_4cKh3cJh_4sKcQcJd_3h9d8s8d() {
    assertEquals(
      "8cJs9c6c 4h2c3dJc 4cKh3cJh 3h9d8s8d 4sKcQcJd 5dKs7cTd",
      Solver.process("omaha-holdem 4d5sQhTcTh 8cJs9c6c 5dKs7cTd 4h2c3dJc 4cKh3cJh 4sKcQcJd 3h9d8s8d"));
  }

  @Test
  public void test_omaha_holdem_7863_2s3d4h7dQh_3sJs9c7s_9s7h5cTc_9hThAcAs_KhJhAd8c_8d3c8hKs_3hAhTs8s_6d5sJd2h_Kd2d2cJc_Qd4s6hQc() {
    assertEquals(
      "KhJhAd8c 3hAhTs8s 9s7h5cTc 8d3c8hKs 9hThAcAs 3sJs9c7s Kd2d2cJc Qd4s6hQc 6d5sJd2h",
      Solver.process("omaha-holdem 2s3d4h7dQh 3sJs9c7s 9s7h5cTc 9hThAcAs KhJhAd8c 8d3c8hKs 3hAhTs8s 6d5sJd2h Kd2d2cJc Qd4s6hQc"));
  }

  @Test
  public void test_omaha_holdem_7864_4h5c8d8hKc_AcQdTc2s_Qc3s8sKh_4d3hTh6d_3cKsQs6c_Ad3dTdQh_9dTsKd5s_5h4sJd6s_9s2h8c7s_7h6hJh7d() {
    assertEquals(
      "AcQdTc2s=Ad3dTdQh 4d3hTh6d 5h4sJd6s 9dTsKd5s 3cKsQs6c 9s2h8c7s 7h6hJh7d Qc3s8sKh",
      Solver.process("omaha-holdem 4h5c8d8hKc AcQdTc2s Qc3s8sKh 4d3hTh6d 3cKsQs6c Ad3dTdQh 9dTsKd5s 5h4sJd6s 9s2h8c7s 7h6hJh7d"));
  }

  @Test
  public void test_omaha_holdem_7865_3h7cJcKcTd_9s5c8cKs_7h7d9cAc_9d6sQsJh_TsQc4h4c_2h4s3dTc_QdJs9h2c_6h5d4dKd() {
    assertEquals(
      "6h5d4dKd 2h4s3dTc 9d6sQsJh=QdJs9h2c 9s5c8cKs TsQc4h4c 7h7d9cAc",
      Solver.process("omaha-holdem 3h7cJcKcTd 9s5c8cKs 7h7d9cAc 9d6sQsJh TsQc4h4c 2h4s3dTc QdJs9h2c 6h5d4dKd"));
  }

  @Test
  public void test_omaha_holdem_7866_2c3c8sAsJs_QdKc4d6c_5s9d9h7h_7dJd9sQh_Ks8h6h9c_Ah8d3d5d_6d7cQcAd_2dJc7s5c_TdTh4h3h() {
    assertEquals(
      "QdKc4d6c Ks8h6h9c 5s9d9h7h TdTh4h3h 7dJd9sQh 6d7cQcAd 2dJc7s5c Ah8d3d5d",
      Solver.process("omaha-holdem 2c3c8sAsJs QdKc4d6c 5s9d9h7h 7dJd9sQh Ks8h6h9c Ah8d3d5d 6d7cQcAd 2dJc7s5c TdTh4h3h"));
  }

  @Test
  public void test_omaha_holdem_7867_6cKdQsTcTs_5d3dKcJc_9h7h2sJd_5c9s5hAs_9d4d4c3c_7d9cQhJs_KhJh8cTd_2c2d2hKs() {
    assertEquals(
      "9d4d4c3c 5c9s5hAs 2c2d2hKs 5d3dKcJc 7d9cQhJs=9h7h2sJd KhJh8cTd",
      Solver.process("omaha-holdem 6cKdQsTcTs 5d3dKcJc 9h7h2sJd 5c9s5hAs 9d4d4c3c 7d9cQhJs KhJh8cTd 2c2d2hKs"));
  }

  @Test
  public void test_omaha_holdem_7868_4c5c9dKcTs_AcKs4hJc_9h8s6sJh_As7d2s5h_QcTcQd8c_8h5s4d7c_7s6cJs9c_Kd3c2cQs_4s9s8d6h() {
    assertEquals(
      "As7d2s5h 9h8s6sJh 8h5s4d7c 4s9s8d6h Kd3c2cQs 7s6cJs9c QcTcQd8c AcKs4hJc",
      Solver.process("omaha-holdem 4c5c9dKcTs AcKs4hJc 9h8s6sJh As7d2s5h QcTcQd8c 8h5s4d7c 7s6cJs9c Kd3c2cQs 4s9s8d6h"));
  }

  @Test
  public void test_omaha_holdem_7869_AdAsJdQhTh_5cQs2d6d_4hJc8cAc_Js9sKh5d_Kd5s8h3d_QdTc2cKs_5h3h6c9d_4d3s2h6h_7c4cAh8d() {
    assertEquals(
      "4d3s2h6h 5h3h6c9d Kd5s8h3d 5cQs2d6d 7c4cAh8d Js9sKh5d=QdTc2cKs 4hJc8cAc",
      Solver.process("omaha-holdem AdAsJdQhTh 5cQs2d6d 4hJc8cAc Js9sKh5d Kd5s8h3d QdTc2cKs 5h3h6c9d 4d3s2h6h 7c4cAh8d"));
  }

  @Test
  public void test_omaha_holdem_7870_2c2d2hAdJs_6dThJd9s_Kh5c5hKc_4c9d6h3s_3h4sKsQh() {
    assertEquals(
      "4c9d6h3s 6dThJd9s 3h4sKsQh Kh5c5hKc",
      Solver.process("omaha-holdem 2c2d2hAdJs 6dThJd9s Kh5c5hKc 4c9d6h3s 3h4sKsQh"));
  }

  @Test
  public void test_omaha_holdem_7871_2d2h3c8sKd_TsQs6h3d_2sJhJd9c_6dKhJcAc_8h7h5sTh_3h7cKc6s_4d4hQdAs_7d5d5c3s_9h9d2cTc() {
    assertEquals(
      "TsQs6h3d 4d4hQdAs 7d5d5c3s 8h7h5sTh 6dKhJcAc 3h7cKc6s 9h9d2cTc 2sJhJd9c",
      Solver.process("omaha-holdem 2d2h3c8sKd TsQs6h3d 2sJhJd9c 6dKhJcAc 8h7h5sTh 3h7cKc6s 4d4hQdAs 7d5d5c3s 9h9d2cTc"));
  }

  @Test
  public void test_omaha_holdem_7872_3s4c5h6hQh_JcTh7c2c_AhQd4h9h_Tc7s5sKs_2d8d5c2s_6c9sQs7h_JsJd8sAc_6s8c3cTs_KdAd2h9c() {
    assertEquals(
      "JcTh7c2c JsJd8sAc 6s8c3cTs KdAd2h9c 2d8d5c2s 6c9sQs7h=Tc7s5sKs AhQd4h9h",
      Solver.process("omaha-holdem 3s4c5h6hQh JcTh7c2c AhQd4h9h Tc7s5sKs 2d8d5c2s 6c9sQs7h JsJd8sAc 6s8c3cTs KdAd2h9c"));
  }

  @Test
  public void test_omaha_holdem_7873_5s6hQdTdTs_Qc3c2hKs_Js9c8d7s_9d7dJh6s_4sTc8h3d_8s4h6cQh_2dTh7c8c_Ac9h3hKh_Jd4c4d5h_AhKd2sAs() {
    assertEquals(
      "Js9c8d7s Ac9h3hKh Jd4c4d5h 9d7dJh6s 8s4h6cQh Qc3c2hKs AhKd2sAs 2dTh7c8c=4sTc8h3d",
      Solver.process("omaha-holdem 5s6hQdTdTs Qc3c2hKs Js9c8d7s 9d7dJh6s 4sTc8h3d 8s4h6cQh 2dTh7c8c Ac9h3hKh Jd4c4d5h AhKd2sAs"));
  }

  @Test
  public void test_omaha_holdem_7874_2d7d8c8sAh_4cAc6c2h_5sQs4h7c_7hTc9s2s_9hQhKd8d_2c3d4s6s_3s4d6dKs_9d3cJc5c_JhAsKh5d_QdTsTd7s() {
    assertEquals(
      "9d3cJc5c 3s4d6dKs 2c3d4s6s 7hTc9s2s 5sQs4h7c QdTsTd7s 4cAc6c2h JhAsKh5d 9hQhKd8d",
      Solver.process("omaha-holdem 2d7d8c8sAh 4cAc6c2h 5sQs4h7c 7hTc9s2s 9hQhKd8d 2c3d4s6s 3s4d6dKs 9d3cJc5c JhAsKh5d QdTsTd7s"));
  }

  @Test
  public void test_omaha_holdem_7875_3h6dAsJcQd_Kd5sAc6h_3d9d9c5d_8sTs5h2d_7dTd2cJh_Qs4s4h6c_3sKs8c8d_JsThKh4d_Qh2hJdAd_5c9s8h4c() {
    assertEquals(
      "5c9s8h4c 8sTs5h2d 3sKs8c8d 3d9d9c5d 7dTd2cJh Qs4s4h6c Kd5sAc6h Qh2hJdAd JsThKh4d",
      Solver.process("omaha-holdem 3h6dAsJcQd Kd5sAc6h 3d9d9c5d 8sTs5h2d 7dTd2cJh Qs4s4h6c 3sKs8c8d JsThKh4d Qh2hJdAd 5c9s8h4c"));
  }

  @Test
  public void test_omaha_holdem_7876_3d9cJcKdKh_7d2s3h5c_4hJh9dAh_6c6h4s6d_9s5sThTc_9hKs5d5h_Ad7c8cQd_3c2d7s7h_2h6sAs3s_2cQsJd4d() {
    assertEquals(
      "Ad7c8cQd 7d2s3h5c 2h6sAs3s 6c6h4s6d 3c2d7s7h 9s5sThTc 2cQsJd4d 4hJh9dAh 9hKs5d5h",
      Solver.process("omaha-holdem 3d9cJcKdKh 7d2s3h5c 4hJh9dAh 6c6h4s6d 9s5sThTc 9hKs5d5h Ad7c8cQd 3c2d7s7h 2h6sAs3s 2cQsJd4d"));
  }

  @Test
  public void test_omaha_holdem_7877_5dAdKcKhQs_5c3s9d4d_7sTcTd6c_6d3c6h8h_Jd9s5s9h_7h2cKdAs() {
    assertEquals(
      "5c3s9d4d 6d3c6h8h Jd9s5s9h 7sTcTd6c 7h2cKdAs",
      Solver.process("omaha-holdem 5dAdKcKhQs 5c3s9d4d 7sTcTd6c 6d3c6h8h Jd9s5s9h 7h2cKdAs"));
  }

  @Test
  public void test_omaha_holdem_7878_3d7h9dKhQd_3h9hQh8d_9cJd7c3c_4s7s6cKs() {
    assertEquals(
      "9cJd7c3c 3h9hQh8d 4s7s6cKs",
      Solver.process("omaha-holdem 3d7h9dKhQd 3h9hQh8d 9cJd7c3c 4s7s6cKs"));
  }

  @Test
  public void test_omaha_holdem_7879_2s3h8sQsTc_3d2d3c3s_KcAc7cAd_4hJh9h7s_9cKsQd9d_TdAh5dTs() {
    assertEquals(
      "9cKsQd9d KcAc7cAd 3d2d3c3s TdAh5dTs 4hJh9h7s",
      Solver.process("omaha-holdem 2s3h8sQsTc 3d2d3c3s KcAc7cAd 4hJh9h7s 9cKsQd9d TdAh5dTs"));
  }

  @Test
  public void test_omaha_holdem_7880_5c6c8sAhTc_Qh4h8c8d_Qc7h4sAs_2sKd4cTh_3d6h3sTd_2h6d3cQs_2c6s5s7c() {
    assertEquals(
      "2h6d3cQs 2sKd4cTh 3d6h3sTd Qh4h8c8d Qc7h4sAs 2c6s5s7c",
      Solver.process("omaha-holdem 5c6c8sAhTc Qh4h8c8d Qc7h4sAs 2sKd4cTh 3d6h3sTd 2h6d3cQs 2c6s5s7c"));
  }

  @Test
  public void test_omaha_holdem_7881_7c8s9hKhTd_9d6s9c2h_Ks7d6c4d_Jh5cQsKd_5s8c2dAh() {
    assertEquals(
      "5s8c2dAh 9d6s9c2h=Ks7d6c4d Jh5cQsKd",
      Solver.process("omaha-holdem 7c8s9hKhTd 9d6s9c2h Ks7d6c4d Jh5cQsKd 5s8c2dAh"));
  }

  @Test
  public void test_omaha_holdem_7882_4h9d9hKcTs_JsJc4dAc_7s5d6d6h_8dKs8cAh_ThQs8h5c_QdKd6c9c_2cQh7h2d() {
    assertEquals(
      "2cQh7h2d 7s5d6d6h ThQs8h5c JsJc4dAc 8dKs8cAh QdKd6c9c",
      Solver.process("omaha-holdem 4h9d9hKcTs JsJc4dAc 7s5d6d6h 8dKs8cAh ThQs8h5c QdKd6c9c 2cQh7h2d"));
  }

  @Test
  public void test_omaha_holdem_7883_3d4c9sAdAs_Jc3h6cTh_Jd7c4d8c_3s7dAc8h_2d6dQd4s_Js9cQcQs_Tc2s6s8s_5s5h5c4h() {
    assertEquals(
      "Tc2s6s8s Jc3h6cTh Jd7c4d8c 2d6dQd4s 5s5h5c4h Js9cQcQs 3s7dAc8h",
      Solver.process("omaha-holdem 3d4c9sAdAs Jc3h6cTh Jd7c4d8c 3s7dAc8h 2d6dQd4s Js9cQcQs Tc2s6s8s 5s5h5c4h"));
  }

  @Test
  public void test_omaha_holdem_7884_5c5h6c9hQc_AhAcJcAd_JdKdKh7h_2d7c6d4c_Js7s6h3d_7dKs8hTd_2hQs3s6s_4dTc3h8s_Kc8d5sAs() {
    assertEquals(
      "4dTc3h8s Js7s6h3d 2hQs3s6s JdKdKh7h Kc8d5sAs 7dKs8hTd 2d7c6d4c AhAcJcAd",
      Solver.process("omaha-holdem 5c5h6c9hQc AhAcJcAd JdKdKh7h 2d7c6d4c Js7s6h3d 7dKs8hTd 2hQs3s6s 4dTc3h8s Kc8d5sAs"));
  }

  @Test
  public void test_omaha_holdem_7885_3c4h9dAcKs_KhJc2c7s_Kc5hJdQc() {
    assertEquals(
      "KhJc2c7s Kc5hJdQc",
      Solver.process("omaha-holdem 3c4h9dAcKs KhJc2c7s Kc5hJdQc"));
  }

  @Test
  public void test_omaha_holdem_7886_4d4s6hKsQs_Ac3dJdTc_5s3c7s8h_8cJs2sAd_7dKcAhQd_4hJhThTd_2h8d4cJc_6c6sAsKh_KdQh2d8s() {
    assertEquals(
      "Ac3dJdTc 7dKcAhQd=KdQh2d8s 2h8d4cJc=4hJhThTd 5s3c7s8h 8cJs2sAd 6c6sAsKh",
      Solver.process("omaha-holdem 4d4s6hKsQs Ac3dJdTc 5s3c7s8h 8cJs2sAd 7dKcAhQd 4hJhThTd 2h8d4cJc 6c6sAsKh KdQh2d8s"));
  }

  @Test
  public void test_omaha_holdem_7887_3d6d7cQdTh_2s5c5h7d_9h8dKsQc_8c6sAc7h_QsAhKc2d_7sAd6c4c_Tc6h8s4d_2cJsQhKd_8h4sJh2h_9sAsKh9c() {
    assertEquals(
      "8h4sJh2h 2s5c5h7d 9sAsKh9c 2cJsQhKd QsAhKc2d 7sAd6c4c=8c6sAc7h Tc6h8s4d 9h8dKsQc",
      Solver.process("omaha-holdem 3d6d7cQdTh 2s5c5h7d 9h8dKsQc 8c6sAc7h QsAhKc2d 7sAd6c4c Tc6h8s4d 2cJsQhKd 8h4sJh2h 9sAsKh9c"));
  }

  @Test
  public void test_omaha_holdem_7888_5h7c9cQhTc_Qc7d5s4s_2cAh3d8h_4c8dKdQd_4dJhAsTh() {
    assertEquals(
      "2cAh3d8h 4dJhAsTh 4c8dKdQd Qc7d5s4s",
      Solver.process("omaha-holdem 5h7c9cQhTc Qc7d5s4s 2cAh3d8h 4c8dKdQd 4dJhAsTh"));
  }

  @Test
  public void test_omaha_holdem_7889_4c7dJcQdTs_9s8c5s6c_7c6hJd9h_ThQh3h4d() {
    assertEquals(
      "7c6hJd9h ThQh3h4d 9s8c5s6c",
      Solver.process("omaha-holdem 4c7dJcQdTs 9s8c5s6c 7c6hJd9h ThQh3h4d"));
  }

  @Test
  public void test_omaha_holdem_7890_4h5dQcQdTs_7dTcAs8h_6c8sAh2d_7hJsTdJd_5cAd2c6s_2s6dJh9s_3hKc9hAc_9d4cKdQs_3d7c2h7s_5sQh6h9c() {
    assertEquals(
      "2s6dJh9s 6c8sAh2d 3hKc9hAc 5cAd2c6s 3d7c2h7s 7dTcAs8h 7hJsTdJd 9d4cKdQs 5sQh6h9c",
      Solver.process("omaha-holdem 4h5dQcQdTs 7dTcAs8h 6c8sAh2d 7hJsTdJd 5cAd2c6s 2s6dJh9s 3hKc9hAc 9d4cKdQs 3d7c2h7s 5sQh6h9c"));
  }

  @Test
  public void test_omaha_holdem_7891_3c3s8c8sAd_Qd7s9d7h_QcKc6h8d() {
    assertEquals(
      "Qd7s9d7h QcKc6h8d",
      Solver.process("omaha-holdem 3c3s8c8sAd Qd7s9d7h QcKc6h8d"));
  }

  @Test
  public void test_omaha_holdem_7892_2c3c4c5h6d_9c2hAd6h_AsTd4d8d_4s5cQcAc_Ts7hJs2d_6cQd2sQh_8hAhKd6s() {
    assertEquals(
      "Ts7hJs2d 8hAhKd6s AsTd4d8d 6cQd2sQh=9c2hAd6h 4s5cQcAc",
      Solver.process("omaha-holdem 2c3c4c5h6d 9c2hAd6h AsTd4d8d 4s5cQcAc Ts7hJs2d 6cQd2sQh 8hAhKd6s"));
  }

  @Test
  public void test_omaha_holdem_7893_3d8dAhQcTs_KdAdQhAc_Ks4sKhJs_7d9d3s6s() {
    assertEquals(
      "7d9d3s6s KdAdQhAc Ks4sKhJs",
      Solver.process("omaha-holdem 3d8dAhQcTs KdAdQhAc Ks4sKhJs 7d9d3s6s"));
  }

  @Test
  public void test_omaha_holdem_7894_2d3d7cAsKs_Ah9d5hTd_Qh2s6dAd_2cQs7dTs() {
    assertEquals(
      "Ah9d5hTd 2cQs7dTs Qh2s6dAd",
      Solver.process("omaha-holdem 2d3d7cAsKs Ah9d5hTd Qh2s6dAd 2cQs7dTs"));
  }

  @Test
  public void test_omaha_holdem_7895_4h6c8d8sKh_Td5sKc2s_7d3sJhAs_QcJd9cTh_6h8c5hQs_5c6sQh2d_2cJc3c3d_2h4dTsTc_9d7s5dKs() {
    assertEquals(
      "QcJd9cTh 7d3sJhAs 2cJc3c3d 5c6sQh2d 2h4dTsTc Td5sKc2s 9d7s5dKs 6h8c5hQs",
      Solver.process("omaha-holdem 4h6c8d8sKh Td5sKc2s 7d3sJhAs QcJd9cTh 6h8c5hQs 5c6sQh2d 2cJc3c3d 2h4dTsTc 9d7s5dKs"));
  }

  @Test
  public void test_omaha_holdem_7896_5d9dAsQhTc_Ts3h7c4c_3d6c8c9c_Td8sQd2h_Ac9h6hKd_7d3s3c4d_Jd2s7h4h_JcJh4s7s() {
    assertEquals(
      "Jd2s7h4h 7d3s3c4d 3d6c8c9c Ts3h7c4c JcJh4s7s Td8sQd2h Ac9h6hKd",
      Solver.process("omaha-holdem 5d9dAsQhTc Ts3h7c4c 3d6c8c9c Td8sQd2h Ac9h6hKd 7d3s3c4d Jd2s7h4h JcJh4s7s"));
  }

  @Test
  public void test_omaha_holdem_7897_2d5d6h9dTs_QhJh4c5c_7c4dJd3s_8hQc6cTh_8s7s4sKc() {
    assertEquals(
      "QhJh4c5c 8hQc6cTh 8s7s4sKc 7c4dJd3s",
      Solver.process("omaha-holdem 2d5d6h9dTs QhJh4c5c 7c4dJd3s 8hQc6cTh 8s7s4sKc"));
  }

  @Test
  public void test_omaha_holdem_7898_2s4c6c8c8d_Kd9c2hTs_QdKs6s7s_7h4d4h7c_7dQh5dAd_Qs3s2dKc_Th8h9s5h_Jh8sAs9h_AcKh3d6h_3cTd4s3h() {
    assertEquals(
      "Kd9c2hTs=Qs3s2dKc 3cTd4s3h QdKs6s7s AcKh3d6h Th8h9s5h Jh8sAs9h 7dQh5dAd 7h4d4h7c",
      Solver.process("omaha-holdem 2s4c6c8c8d Kd9c2hTs QdKs6s7s 7h4d4h7c 7dQh5dAd Qs3s2dKc Th8h9s5h Jh8sAs9h AcKh3d6h 3cTd4s3h"));
  }

  @Test
  public void test_omaha_holdem_7899_8sAcAdJdQc_QsTc8c6h_5s2s7h2h_5h6c3s7c() {
    assertEquals(
      "5h6c3s7c 5s2s7h2h QsTc8c6h",
      Solver.process("omaha-holdem 8sAcAdJdQc QsTc8c6h 5s2s7h2h 5h6c3s7c"));
  }

  @Test
  public void test_omaha_holdem_7900_2c6dAdKcTc_Jc4sThKs_8cQh7c7h() {
    assertEquals(
      "Jc4sThKs 8cQh7c7h",
      Solver.process("omaha-holdem 2c6dAdKcTc Jc4sThKs 8cQh7c7h"));
  }

  @Test
  public void test_omaha_holdem_7901_3c5h7c8dQd_Th9d6dJh_9h6sTsQc_Ah4dKcQs() {
    assertEquals(
      "Ah4dKcQs 9h6sTsQc=Th9d6dJh",
      Solver.process("omaha-holdem 3c5h7c8dQd Th9d6dJh 9h6sTsQc Ah4dKcQs"));
  }

  @Test
  public void test_omaha_holdem_7902_5d6dJsKcQh_5s2sTc4d_2hAs6c7s_Qs9c9s5h_8hTh3h2c() {
    assertEquals(
      "8hTh3h2c 5s2sTc4d 2hAs6c7s Qs9c9s5h",
      Solver.process("omaha-holdem 5d6dJsKcQh 5s2sTc4d 2hAs6c7s Qs9c9s5h 8hTh3h2c"));
  }

  @Test
  public void test_omaha_holdem_7903_2c3c6h7s8h_JhJs4c3h_Tc3s9hKs_8c7hTsAd_4sQdQcQh_5h9dKcAc() {
    assertEquals(
      "JhJs4c3h 4sQdQcQh 8c7hTsAd 5h9dKcAc Tc3s9hKs",
      Solver.process("omaha-holdem 2c3c6h7s8h JhJs4c3h Tc3s9hKs 8c7hTsAd 4sQdQcQh 5h9dKcAc"));
  }

  @Test
  public void test_omaha_holdem_7904_4c4d8hJdQd_9h8cJc6h_Ks7h2h6d_5hTcKc8d_KhAd6s4s_9s3h5dTs_6cJhQc7s() {
    assertEquals(
      "Ks7h2h6d 5hTcKc8d 9h8cJc6h 6cJhQc7s KhAd6s4s 9s3h5dTs",
      Solver.process("omaha-holdem 4c4d8hJdQd 9h8cJc6h Ks7h2h6d 5hTcKc8d KhAd6s4s 9s3h5dTs 6cJhQc7s"));
  }

  @Test
  public void test_omaha_holdem_7905_7c8s9cKdQc_8c6dTs3h_4dAcJc2s_8h3c6h2d_9h6c7dKs_Ah5s2c4s_JdAd8dTh_9s5dQdKc_7s4hKh5h() {
    assertEquals(
      "Ah5s2c4s 8h3c6h2d 7s4hKh5h 9h6c7dKs 9s5dQdKc 8c6dTs3h JdAd8dTh 4dAcJc2s",
      Solver.process("omaha-holdem 7c8s9cKdQc 8c6dTs3h 4dAcJc2s 8h3c6h2d 9h6c7dKs Ah5s2c4s JdAd8dTh 9s5dQdKc 7s4hKh5h"));
  }

  @Test
  public void test_omaha_holdem_7906_3d6s9c9hJs_2hKh6c7h_5dKd3h5h_3s2sTcKs_5s5c4dQc_2c8h9s8s_KcTs8d4s() {
    assertEquals(
      "KcTs8d4s 3s2sTcKs 5dKd3h5h=5s5c4dQc 2hKh6c7h 2c8h9s8s",
      Solver.process("omaha-holdem 3d6s9c9hJs 2hKh6c7h 5dKd3h5h 3s2sTcKs 5s5c4dQc 2c8h9s8s KcTs8d4s"));
  }

  @Test
  public void test_omaha_holdem_7907_4s6s8cAsQh_2s3dTsJh_8h2h2d2c() {
    assertEquals(
      "8h2h2d2c 2s3dTsJh",
      Solver.process("omaha-holdem 4s6s8cAsQh 2s3dTsJh 8h2h2d2c"));
  }

  @Test
  public void test_omaha_holdem_7908_3h7c7h9dKc_8h5c7dJd_3c3dAs7s_2c5s6dJc_TdKs8sTc_Ac4s4c4d_8dJs3sQh_2sQdQc2h_Kd2d6sQs_5hKhAdJh() {
    assertEquals(
      "2c5s6dJc 8dJs3sQh Ac4s4c4d 2sQdQc2h TdKs8sTc Kd2d6sQs 5hKhAdJh 8h5c7dJd 3c3dAs7s",
      Solver.process("omaha-holdem 3h7c7h9dKc 8h5c7dJd 3c3dAs7s 2c5s6dJc TdKs8sTc Ac4s4c4d 8dJs3sQh 2sQdQc2h Kd2d6sQs 5hKhAdJh"));
  }

  @Test
  public void test_omaha_holdem_7909_4s7sJsKhQc_QdJhTcTs_8c9cJcTh_2hKs5h7h() {
    assertEquals(
      "QdJhTcTs 2hKs5h7h 8c9cJcTh",
      Solver.process("omaha-holdem 4s7sJsKhQc QdJhTcTs 8c9cJcTh 2hKs5h7h"));
  }

  @Test
  public void test_omaha_holdem_7910_4s8c9dAsJs_Kh5sQhKs_Jd7d4c2s_2h5c8d9h() {
    assertEquals(
      "2h5c8d9h Jd7d4c2s Kh5sQhKs",
      Solver.process("omaha-holdem 4s8c9dAsJs Kh5sQhKs Jd7d4c2s 2h5c8d9h"));
  }

  @Test
  public void test_omaha_holdem_7911_2c4c5s7c7d_8hAd9cJd_6hQh5hTd_2hQsTsJc_3c8s5c6d_As8dTc5d_6cKhAhKd() {
    assertEquals(
      "8hAd9cJd 2hQsTsJc 6hQh5hTd As8dTc5d 6cKhAhKd 3c8s5c6d",
      Solver.process("omaha-holdem 2c4c5s7c7d 8hAd9cJd 6hQh5hTd 2hQsTsJc 3c8s5c6d As8dTc5d 6cKhAhKd"));
  }

  @Test
  public void test_omaha_holdem_7912_2h4d6h7dTh_6cAd9hKd_3cTd4c2d_Tc7hJsQs_7s2s2cAh_5cJcAs9d_KcQhKhKs_9sQdQc3h_5s8h5d8s() {
    assertEquals(
      "5cJcAs9d 6cAd9hKd 9sQdQc3h 3cTd4c2d Tc7hJsQs 7s2s2cAh 5s8h5d8s KcQhKhKs",
      Solver.process("omaha-holdem 2h4d6h7dTh 6cAd9hKd 3cTd4c2d Tc7hJsQs 7s2s2cAh 5cJcAs9d KcQhKhKs 9sQdQc3h 5s8h5d8s"));
  }

  @Test
  public void test_omaha_holdem_7913_2c2d7dAdQs_AhKh9s8h_Qd5d6dKd_2s4h7cQc_Ts3d3s7h_6hJs6s5c() {
    assertEquals(
      "6hJs6s5c Ts3d3s7h AhKh9s8h Qd5d6dKd 2s4h7cQc",
      Solver.process("omaha-holdem 2c2d7dAdQs AhKh9s8h Qd5d6dKd 2s4h7cQc Ts3d3s7h 6hJs6s5c"));
  }

  @Test
  public void test_omaha_holdem_7914_5d6cJcKcTs_7d4s8sAh_3hQc5cQh_AsQs2dTd_6s4cThAc_7c4d2s2h() {
    assertEquals(
      "7d4s8sAh 7c4d2s2h AsQs2dTd 3hQc5cQh 6s4cThAc",
      Solver.process("omaha-holdem 5d6cJcKcTs 7d4s8sAh 3hQc5cQh AsQs2dTd 6s4cThAc 7c4d2s2h"));
  }

  @Test
  public void test_omaha_holdem_7915_4h5h7sJcKc_7h8s2cQh_4cKs2sQc_Ah9c3s5d_AdQs4d8c_5cThTd7c_5s6c3d8h_AcQdJsKh() {
    assertEquals(
      "AdQs4d8c Ah9c3s5d 7h8s2cQh 5cThTd7c 4cKs2sQc AcQdJsKh 5s6c3d8h",
      Solver.process("omaha-holdem 4h5h7sJcKc 7h8s2cQh 4cKs2sQc Ah9c3s5d AdQs4d8c 5cThTd7c 5s6c3d8h AcQdJsKh"));
  }

  @Test
  public void test_omaha_holdem_7916_3c4d5d8c9c_7hTd2d3h_4sJs5h8d() {
    assertEquals(
      "7hTd2d3h 4sJs5h8d",
      Solver.process("omaha-holdem 3c4d5d8c9c 7hTd2d3h 4sJs5h8d"));
  }

  @Test
  public void test_omaha_holdem_7917_3d5c6h8dKs_4h5hTcKh_Ah5d3cTs_2h8sJd2c_7h9dJsTh() {
    assertEquals(
      "2h8sJd2c Ah5d3cTs 4h5hTcKh 7h9dJsTh",
      Solver.process("omaha-holdem 3d5c6h8dKs 4h5hTcKh Ah5d3cTs 2h8sJd2c 7h9dJsTh"));
  }

  @Test
  public void test_omaha_holdem_7918_3h4h7sAsQs_5s6hJdJc_Ac6s2c7c_6c6dQcTc_4c7d2hKd_Th5dJs8s_8cQh7h3c_2dJhKhKc_9hKsAh9d_2s5h4d9s() {
    assertEquals(
      "6c6dQcTc 2dJhKhKc 9hKsAh9d 4c7d2hKd 8cQh7h3c Ac6s2c7c 5s6hJdJc 2s5h4d9s Th5dJs8s",
      Solver.process("omaha-holdem 3h4h7sAsQs 5s6hJdJc Ac6s2c7c 6c6dQcTc 4c7d2hKd Th5dJs8s 8cQh7h3c 2dJhKhKc 9hKsAh9d 2s5h4d9s"));
  }

  @Test
  public void test_omaha_holdem_7919_2h6s7dJhQs_Ac2sQd8s_3hKc3d2c_5c5hAs3s_KsTh2dAh_6h5s4sQc_6c9c7c3c() {
    assertEquals(
      "KsTh2dAh 3hKc3d2c 5c5hAs3s 6c9c7c3c Ac2sQd8s 6h5s4sQc",
      Solver.process("omaha-holdem 2h6s7dJhQs Ac2sQd8s 3hKc3d2c 5c5hAs3s KsTh2dAh 6h5s4sQc 6c9c7c3c"));
  }

  @Test
  public void test_omaha_holdem_7920_7s9cAdKhTs_JhJs5d6d_Kd4dTd5h_8s3h2dQs_3s9d8d2h() {
    assertEquals(
      "8s3h2dQs 3s9d8d2h JhJs5d6d Kd4dTd5h",
      Solver.process("omaha-holdem 7s9cAdKhTs JhJs5d6d Kd4dTd5h 8s3h2dQs 3s9d8d2h"));
  }

  @Test
  public void test_omaha_holdem_7921_2h4c6h8cKs_JsAdTd7d_QcKdAc4h_5hJh5c4s() {
    assertEquals(
      "JsAdTd7d 5hJh5c4s QcKdAc4h",
      Solver.process("omaha-holdem 2h4c6h8cKs JsAdTd7d QcKdAc4h 5hJh5c4s"));
  }

  @Test
  public void test_omaha_holdem_7922_5d5h7cKsQs_Ad7h7d6s_5c2hTh7s() {
    assertEquals(
      "5c2hTh7s Ad7h7d6s",
      Solver.process("omaha-holdem 5d5h7cKsQs Ad7h7d6s 5c2hTh7s"));
  }

  @Test
  public void test_omaha_holdem_7923_4h5h8s9dJh_As8d9hAc_5sKd7h4d_AdKhTcQs() {
    assertEquals(
      "5sKd7h4d As8d9hAc AdKhTcQs",
      Solver.process("omaha-holdem 4h5h8s9dJh As8d9hAc 5sKd7h4d AdKhTcQs"));
  }

  @Test
  public void test_omaha_holdem_7924_4s6hAcAdQs_2s7sJh4h_Kh4c9h3d_JsTd5c8d_QhAhJd2h_9d9c7d6c_5sKdKs5d() {
    assertEquals(
      "JsTd5c8d 2s7sJh4h Kh4c9h3d 9d9c7d6c 5sKdKs5d QhAhJd2h",
      Solver.process("omaha-holdem 4s6hAcAdQs 2s7sJh4h Kh4c9h3d JsTd5c8d QhAhJd2h 9d9c7d6c 5sKdKs5d"));
  }

  @Test
  public void test_omaha_holdem_7925_2s4d4h5cJd_6d4c2cAd_3cQs3h9c_5d8d7d2h_8s6s7cQd_As8h9s7s_Ts7hKh6c_Qh9h3dJc() {
    assertEquals(
      "8s6s7cQd Ts7hKh6c As8h9s7s 3cQs3h9c 5d8d7d2h Qh9h3dJc 6d4c2cAd",
      Solver.process("omaha-holdem 2s4d4h5cJd 6d4c2cAd 3cQs3h9c 5d8d7d2h 8s6s7cQd As8h9s7s Ts7hKh6c Qh9h3dJc"));
  }

  @Test
  public void test_omaha_holdem_7926_3c7hJdKsQs_7cTsTcAh_8h9d7dAd_2s5h2hQh_4d9h2c7s_3s6c4cQd_9s6d4h8c_6hAc5d2d_JcJsKhKc() {
    assertEquals(
      "9s6d4h8c 6hAc5d2d 4d9h2c7s 8h9d7dAd 2s5h2hQh 3s6c4cQd JcJsKhKc 7cTsTcAh",
      Solver.process("omaha-holdem 3c7hJdKsQs 7cTsTcAh 8h9d7dAd 2s5h2hQh 4d9h2c7s 3s6c4cQd 9s6d4h8c 6hAc5d2d JcJsKhKc"));
  }

  @Test
  public void test_omaha_holdem_7927_5d8hJcKhTd_Tc6c3hTs_Th6d7h7s_7d9d3d4s_Qd6s9c5c_QhJd7c9h_Ad2cQs6h_9s2d4h5s() {
    assertEquals(
      "9s2d4h5s Th6d7h7s Tc6c3hTs 7d9d3d4s Qd6s9c5c=QhJd7c9h Ad2cQs6h",
      Solver.process("omaha-holdem 5d8hJcKhTd Tc6c3hTs Th6d7h7s 7d9d3d4s Qd6s9c5c QhJd7c9h Ad2cQs6h 9s2d4h5s"));
  }

  @Test
  public void test_omaha_holdem_7928_3d4d8d8h9d_8c9h7d4s_3c3s6dKs() {
    assertEquals(
      "3c3s6dKs 8c9h7d4s",
      Solver.process("omaha-holdem 3d4d8d8h9d 8c9h7d4s 3c3s6dKs"));
  }

  @Test
  public void test_omaha_holdem_7929_2d6d7hKdKh_TdTh3h2h_2s7s4sAc_Js9s3c5c_Ks5s5d8h_5hAh6s4h_As6h8d8c() {
    assertEquals(
      "Js9s3c5c 5hAh6s4h 2s7s4sAc As6h8d8c TdTh3h2h Ks5s5d8h",
      Solver.process("omaha-holdem 2d6d7hKdKh TdTh3h2h 2s7s4sAc Js9s3c5c Ks5s5d8h 5hAh6s4h As6h8d8c"));
  }

  @Test
  public void test_omaha_holdem_7930_4c7h8cAsJs_KdKcTcTd_5s9c4sTs() {
    assertEquals(
      "KdKcTcTd 5s9c4sTs",
      Solver.process("omaha-holdem 4c7h8cAsJs KdKcTcTd 5s9c4sTs"));
  }

  @Test
  public void test_omaha_holdem_7931_4s8sAcKhQc_4dTd7d3c_3d3sAs9h_5d2sJhQh() {
    assertEquals(
      "4dTd7d3c 5d2sJhQh 3d3sAs9h",
      Solver.process("omaha-holdem 4s8sAcKhQc 4dTd7d3c 3d3sAs9h 5d2sJhQh"));
  }

  @Test
  public void test_omaha_holdem_7932_4d8hJhKcKs_JsQc8d7s_2s3h7cAd_9c2d5sTh_9d5c4hKd_AsAhJd4c() {
    assertEquals(
      "9c2d5sTh 2s3h7cAd JsQc8d7s AsAhJd4c 9d5c4hKd",
      Solver.process("omaha-holdem 4d8hJhKcKs JsQc8d7s 2s3h7cAd 9c2d5sTh 9d5c4hKd AsAhJd4c"));
  }

  @Test
  public void test_omaha_holdem_7933_3s7s8h9sAd_4c3d5c6s_AsTd4dKs_Jd9d2hQs_4s2s6c8d_Qh4hThQc_8c6hAh5d() {
    assertEquals(
      "Jd9d2hQs Qh4hThQc 4c3d5c6s=8c6hAh5d 4s2s6c8d AsTd4dKs",
      Solver.process("omaha-holdem 3s7s8h9sAd 4c3d5c6s AsTd4dKs Jd9d2hQs 4s2s6c8d Qh4hThQc 8c6hAh5d"));
  }

  @Test
  public void test_omaha_holdem_7934_3h8c9cJsKs_TcThAsAd_4s8s3dAc_8dAh7c9s_2cTsQc3c_JhQhKc7d_2h8hQsJd_6s3sKd5s_9dJc6c2d_7h7s6h5d() {
    assertEquals(
      "7h7s6h5d TcThAsAd 4s8s3dAc 8dAh7c9s 2h8hQsJd 9dJc6c2d 6s3sKd5s JhQhKc7d 2cTsQc3c",
      Solver.process("omaha-holdem 3h8c9cJsKs TcThAsAd 4s8s3dAc 8dAh7c9s 2cTsQc3c JhQhKc7d 2h8hQsJd 6s3sKd5s 9dJc6c2d 7h7s6h5d"));
  }

  @Test
  public void test_omaha_holdem_7935_2h4s9dJcJd_QdTs8cAc_3hTh9sJh() {
    assertEquals(
      "QdTs8cAc 3hTh9sJh",
      Solver.process("omaha-holdem 2h4s9dJcJd QdTs8cAc 3hTh9sJh"));
  }

  @Test
  public void test_omaha_holdem_7936_2c9cAdAhTs_QhJc2d8s_Js7s6d3c_4dThTd5d_TcKs4hKh_7h6sQd7d_6c9s6h4s_JhQs5h2s_Kc3h4c8d_9d2hAs8c() {
    assertEquals(
      "Js7s6d3c Kc3h4c8d JhQs5h2s=QhJc2d8s 7h6sQd7d 6c9s6h4s TcKs4hKh 4dThTd5d 9d2hAs8c",
      Solver.process("omaha-holdem 2c9cAdAhTs QhJc2d8s Js7s6d3c 4dThTd5d TcKs4hKh 7h6sQd7d 6c9s6h4s JhQs5h2s Kc3h4c8d 9d2hAs8c"));
  }

  @Test
  public void test_omaha_holdem_7937_4cAcJcJsQd_KhQsTh6s_3s6dJhKd_8s8cAh7s_3h2c2h2d_5cQh8dTc_9dQc7h7d_5h3c4dKs() {
    assertEquals(
      "3h2c2h2d 5h3c4dKs 9dQc7h7d 8s8cAh7s 3s6dJhKd KhQsTh6s 5cQh8dTc",
      Solver.process("omaha-holdem 4cAcJcJsQd KhQsTh6s 3s6dJhKd 8s8cAh7s 3h2c2h2d 5cQh8dTc 9dQc7h7d 5h3c4dKs"));
  }

  @Test
  public void test_omaha_holdem_7938_2c5h6c7dAd_8hJsJd9s_JhTc2d7h_Qd9c9h2s_Kd6sKh8c_8d2h6d4d_3d8s5dKs_AcAsTs5c() {
    assertEquals(
      "3d8s5dKs Qd9c9h2s Kd6sKh8c JhTc2d7h AcAsTs5c 8d2h6d4d 8hJsJd9s",
      Solver.process("omaha-holdem 2c5h6c7dAd 8hJsJd9s JhTc2d7h Qd9c9h2s Kd6sKh8c 8d2h6d4d 3d8s5dKs AcAsTs5c"));
  }

  @Test
  public void test_omaha_holdem_7939_4c6d7s8cAs_2sTd4s8d_Ks7d9c3s_5d2hQd6s_5sAcTc8s_ThQhJhJc() {
    assertEquals(
      "Ks7d9c3s ThQhJhJc 2sTd4s8d 5d2hQd6s=5sAcTc8s",
      Solver.process("omaha-holdem 4c6d7s8cAs 2sTd4s8d Ks7d9c3s 5d2hQd6s 5sAcTc8s ThQhJhJc"));
  }

  @Test
  public void test_omaha_holdem_7940_4d5s7h8cKh_JhJs9hTc_2s7c6c3d_6d9s9c8h_6h5hTsQd_3h4cQc7d_2h6sAc9d_2cAh5c7s() {
    assertEquals(
      "JhJs9hTc 3h4cQc7d 2cAh5c7s 2s7c6c3d=6h5hTsQd 2h6sAc9d=6d9s9c8h",
      Solver.process("omaha-holdem 4d5s7h8cKh JhJs9hTc 2s7c6c3d 6d9s9c8h 6h5hTsQd 3h4cQc7d 2h6sAc9d 2cAh5c7s"));
  }

  @Test
  public void test_omaha_holdem_7941_2h3s4hJdJh_8hTd9cJc_AcTh7d2s() {
    assertEquals(
      "AcTh7d2s 8hTd9cJc",
      Solver.process("omaha-holdem 2h3s4hJdJh 8hTd9cJc AcTh7d2s"));
  }

  @Test
  public void test_omaha_holdem_7942_5d6d8d9cAc_6s3h9h9d_Ad4sJh2h() {
    assertEquals(
      "Ad4sJh2h 6s3h9h9d",
      Solver.process("omaha-holdem 5d6d8d9cAc 6s3h9h9d Ad4sJh2h"));
  }

  @Test
  public void test_omaha_holdem_7943_2c5s8hQcQh_2h2d6h5h_6s2s7dQs_4cKh9sKc_9dKdThKs_AcTs4dJd() {
    assertEquals(
      "AcTs4dJd 4cKh9sKc=9dKdThKs 2h2d6h5h 6s2s7dQs",
      Solver.process("omaha-holdem 2c5s8hQcQh 2h2d6h5h 6s2s7dQs 4cKh9sKc 9dKdThKs AcTs4dJd"));
  }

  @Test
  public void test_omaha_holdem_7944_3d4h8h8sAh_5h4dAsQd_Jd7h9dJh() {
    assertEquals(
      "5h4dAsQd Jd7h9dJh",
      Solver.process("omaha-holdem 3d4h8h8sAh 5h4dAsQd Jd7h9dJh"));
  }

  @Test
  public void test_omaha_holdem_7945_3d5c9sQhQs_8d3hAhQc_Td2d8h4c_5h2cAc4s_4d7c7dTs_Jh8c2sKc_7hTh6h6s_9d8sAd5s() {
    assertEquals(
      "Td2d8h4c Jh8c2sKc 5h2cAc4s 7hTh6h6s 4d7c7dTs 9d8sAd5s 8d3hAhQc",
      Solver.process("omaha-holdem 3d5c9sQhQs 8d3hAhQc Td2d8h4c 5h2cAc4s 4d7c7dTs Jh8c2sKc 7hTh6h6s 9d8sAd5s"));
  }

  @Test
  public void test_omaha_holdem_7946_2s5h5sAsQc_3h4c3s8c_Th3c6cTc_AcTsKc8h_6d2c4h2d_2hJs4d3d() {
    assertEquals(
      "Th3c6cTc AcTsKc8h 2hJs4d3d=3h4c3s8c 6d2c4h2d",
      Solver.process("omaha-holdem 2s5h5sAsQc 3h4c3s8c Th3c6cTc AcTsKc8h 6d2c4h2d 2hJs4d3d"));
  }

  @Test
  public void test_omaha_holdem_7947_3s4h9cQcTc_3h7hKdAs_6d2d6cAc_9d7c7s5h_4c6hQhJh_8cTsAh5d_9h9s8s4d_8hKs3cKc_KhQd6sJd_JcAdJs2c() {
    assertEquals(
      "3h7hKdAs 9d7c7s5h 8cTsAh5d 4c6hQhJh 9h9s8s4d KhQd6sJd JcAdJs2c 8hKs3cKc 6d2d6cAc",
      Solver.process("omaha-holdem 3s4h9cQcTc 3h7hKdAs 6d2d6cAc 9d7c7s5h 4c6hQhJh 8cTsAh5d 9h9s8s4d 8hKs3cKc KhQd6sJd JcAdJs2c"));
  }

  @Test
  public void test_omaha_holdem_7948_9d9hAdJcJs_JdTc4h5c_8hTh7d5h_Ks6h8c6c_7sTdQhAs_3c2d5s3s_8s5d3hKd() {
    assertEquals(
      "8hTh7d5h 8s5d3hKd 3c2d5s3s Ks6h8c6c 7sTdQhAs JdTc4h5c",
      Solver.process("omaha-holdem 9d9hAdJcJs JdTc4h5c 8hTh7d5h Ks6h8c6c 7sTdQhAs 3c2d5s3s 8s5d3hKd"));
  }

  @Test
  public void test_omaha_holdem_7949_4c9dAdKcKh_Qs4hAh3h_JhThQd5s_2d7s7cJc_2h2sAc9h_6s8cJd8d_7d8h9c7h_5d3c6c8s_6h5c6d4s_5hQhKd9s() {
    assertEquals(
      "5d3c6c8s JhThQd5s 6h5c6d4s 2d7s7cJc 6s8cJd8d 7d8h9c7h 2h2sAc9h Qs4hAh3h 5hQhKd9s",
      Solver.process("omaha-holdem 4c9dAdKcKh Qs4hAh3h JhThQd5s 2d7s7cJc 2h2sAc9h 6s8cJd8d 7d8h9c7h 5d3c6c8s 6h5c6d4s 5hQhKd9s"));
  }

  @Test
  public void test_omaha_holdem_7950_2c4c5h7sKc_Th7c2s8s_6dQh9c6c() {
    assertEquals(
      "Th7c2s8s 6dQh9c6c",
      Solver.process("omaha-holdem 2c4c5h7sKc Th7c2s8s 6dQh9c6c"));
  }

  @Test
  public void test_omaha_holdem_7951_2s6d9h9sTc_2h5cKh3s_8d8h8c5h_AdKcTh3h_Qd6s4h2d_3cJsAc7d_Qc7hJc4d() {
    assertEquals(
      "Qc7hJc4d 3cJsAc7d 2h5cKh3s Qd6s4h2d 8d8h8c5h AdKcTh3h",
      Solver.process("omaha-holdem 2s6d9h9sTc 2h5cKh3s 8d8h8c5h AdKcTh3h Qd6s4h2d 3cJsAc7d Qc7hJc4d"));
  }

  @Test
  public void test_omaha_holdem_7952_5c6d6s8cQh_3sTd7c2h_7d9cAc2s_8dJd9s8s() {
    assertEquals(
      "3sTd7c2h 7d9cAc2s 8dJd9s8s",
      Solver.process("omaha-holdem 5c6d6s8cQh 3sTd7c2h 7d9cAc2s 8dJd9s8s"));
  }

  @Test
  public void test_omaha_holdem_7953_3c3hKsQcTh_KcTs6dQd_9c8dTd5h_8c9s2h8s_Jc9hJhAc_5dAs2dQs_6cJdKdJs_Kh6h4c2c_4s7s4d6s() {
    assertEquals(
      "4s7s4d6s 8c9s2h8s 9c8dTd5h 5dAs2dQs Kh6h4c2c 6cJdKdJs KcTs6dQd Jc9hJhAc",
      Solver.process("omaha-holdem 3c3hKsQcTh KcTs6dQd 9c8dTd5h 8c9s2h8s Jc9hJhAc 5dAs2dQs 6cJdKdJs Kh6h4c2c 4s7s4d6s"));
  }

  @Test
  public void test_omaha_holdem_7954_4c5d7c9hQd_8h2s7h2h_Js5c3cQs() {
    assertEquals(
      "8h2s7h2h Js5c3cQs",
      Solver.process("omaha-holdem 4c5d7c9hQd 8h2s7h2h Js5c3cQs"));
  }

  @Test
  public void test_omaha_holdem_7955_2d5c8hJhTc_Qs3d8sJd_6hTh2s3c_8d6s7dKc() {
    assertEquals(
      "8d6s7dKc 6hTh2s3c Qs3d8sJd",
      Solver.process("omaha-holdem 2d5c8hJhTc Qs3d8sJd 6hTh2s3c 8d6s7dKc"));
  }

  @Test
  public void test_omaha_holdem_7956_7d8sJcKcQs_2h6cAd8h_2d5sJh4h() {
    assertEquals(
      "2h6cAd8h 2d5sJh4h",
      Solver.process("omaha-holdem 7d8sJcKcQs 2h6cAd8h 2d5sJh4h"));
  }

  @Test
  public void test_omaha_holdem_7957_3d4d5h9sKd_Jh3h8sTh_7h6c2hTs() {
    assertEquals(
      "Jh3h8sTh 7h6c2hTs",
      Solver.process("omaha-holdem 3d4d5h9sKd Jh3h8sTh 7h6c2hTs"));
  }

  @Test
  public void test_omaha_holdem_7958_2s3d4s6sJc_Ac9sAdQc_TcTs5dAh_AsKc5c7h_KhJhKdTh_8d9h9c8c_3s3h6d7s() {
    assertEquals(
      "8d9h9c8c KhJhKdTh Ac9sAdQc TcTs5dAh AsKc5c7h 3s3h6d7s",
      Solver.process("omaha-holdem 2s3d4s6sJc Ac9sAdQc TcTs5dAh AsKc5c7h KhJhKdTh 8d9h9c8c 3s3h6d7s"));
  }

  @Test
  public void test_omaha_holdem_7959_5s9c9hJcQc_3hTc2c2s_7s5d9dKh_Ks4cAh6h_7cQsJh2h_8dKdAc4s_6s3sThQh_5c8hKcJd_TdTs6cAd() {
    assertEquals(
      "8dKdAc4s=Ks4cAh6h TdTs6cAd 6s3sThQh 7cQsJh2h 3hTc2c2s 5c8hKcJd 7s5d9dKh",
      Solver.process("omaha-holdem 5s9c9hJcQc 3hTc2c2s 7s5d9dKh Ks4cAh6h 7cQsJh2h 8dKdAc4s 6s3sThQh 5c8hKcJd TdTs6cAd"));
  }

  @Test
  public void test_omaha_holdem_7960_2d3s5h8dTc_AdTd3cJc_4c3d9d8c_JsAh2c9s_9hAsAcKh_7cTh7h5d_2h7sQdQh() {
    assertEquals(
      "JsAh2c9s 2h7sQdQh 9hAsAcKh 4c3d9d8c AdTd3cJc 7cTh7h5d",
      Solver.process("omaha-holdem 2d3s5h8dTc AdTd3cJc 4c3d9d8c JsAh2c9s 9hAsAcKh 7cTh7h5d 2h7sQdQh"));
  }

  @Test
  public void test_omaha_holdem_7961_4s8cJcKsQc_JhKc3hAd_6s9d2c3c() {
    assertEquals(
      "JhKc3hAd 6s9d2c3c",
      Solver.process("omaha-holdem 4s8cJcKsQc JhKc3hAd 6s9d2c3c"));
  }

  @Test
  public void test_omaha_holdem_7962_2d5d5s6c7d_7s5hAdJc_3hAs7h8c_9dKsAcTd_3dKhAh2h_8hQd9cJd_Qs8s9sTs_4s8d4c2c() {
    assertEquals(
      "3dKhAh2h 3hAs7h8c 4s8d4c2c Qs8s9sTs 9dKsAcTd 8hQd9cJd 7s5hAdJc",
      Solver.process("omaha-holdem 2d5d5s6c7d 7s5hAdJc 3hAs7h8c 9dKsAcTd 3dKhAh2h 8hQd9cJd Qs8s9sTs 4s8d4c2c"));
  }

  @Test
  public void test_omaha_holdem_7963_3d4c7hAdTh_4hQd9cTc_2h4d9d3h() {
    assertEquals(
      "2h4d9d3h 4hQd9cTc",
      Solver.process("omaha-holdem 3d4c7hAdTh 4hQd9cTc 2h4d9d3h"));
  }

  @Test
  public void test_omaha_holdem_7964_3h5dAdJdJh_As3cQh4h_Ts5cKd2s_ThQs2d9d_7h5s5h7d_8h6d8s7c_4sAc7s4d() {
    assertEquals(
      "Ts5cKd2s 8h6d8s7c 4sAc7s4d As3cQh4h ThQs2d9d 7h5s5h7d",
      Solver.process("omaha-holdem 3h5dAdJdJh As3cQh4h Ts5cKd2s ThQs2d9d 7h5s5h7d 8h6d8s7c 4sAc7s4d"));
  }

  @Test
  public void test_omaha_holdem_7965_3h4cAcQsTd_8s3cJdJc_7cKsAd8h_TsKh5d7d_9d7h9h7s_QcTh6s2c_Kc8c6c2d_8d2h9s6d_Jh3d4dKd_QdQhAs4h() {
    assertEquals(
      "8d2h9s6d Kc8c6c2d 9d7h9h7s TsKh5d7d 8s3cJdJc 7cKsAd8h QcTh6s2c QdQhAs4h Jh3d4dKd",
      Solver.process("omaha-holdem 3h4cAcQsTd 8s3cJdJc 7cKsAd8h TsKh5d7d 9d7h9h7s QcTh6s2c Kc8c6c2d 8d2h9s6d Jh3d4dKd QdQhAs4h"));
  }

  @Test
  public void test_omaha_holdem_7966_6h8dAsKsQs_3d7s4h7c_3s9hQhJc_2hAd2sJh_6s8hTd9c_4s7hAc2c_2d3hQc5h_7d9dThKc() {
    assertEquals(
      "3d7s4h7c 2d3hQc5h 3s9hQhJc 7d9dThKc 4s7hAc2c 2hAd2sJh 6s8hTd9c",
      Solver.process("omaha-holdem 6h8dAsKsQs 3d7s4h7c 3s9hQhJc 2hAd2sJh 6s8hTd9c 4s7hAc2c 2d3hQc5h 7d9dThKc"));
  }

  @Test
  public void test_omaha_holdem_7967_3s4s8d9sQh_As5h4h8h_Jc5c3h7s_Tc9cKhAd_3c6sKdKs_5dAh8s6h() {
    assertEquals(
      "Jc5c3h7s 5dAh8s6h Tc9cKhAd As5h4h8h 3c6sKdKs",
      Solver.process("omaha-holdem 3s4s8d9sQh As5h4h8h Jc5c3h7s Tc9cKhAd 3c6sKdKs 5dAh8s6h"));
  }

  @Test
  public void test_omaha_holdem_7968_5h7d8dAsJd_9c2s9s8c_2c6sQd6c_8hQc3cJc_3s4s8sKc_7h7cQsTh() {
    assertEquals(
      "2c6sQd6c 3s4s8sKc 9c2s9s8c 8hQc3cJc 7h7cQsTh",
      Solver.process("omaha-holdem 5h7d8dAsJd 9c2s9s8c 2c6sQd6c 8hQc3cJc 3s4s8sKc 7h7cQsTh"));
  }

  @Test
  public void test_omaha_holdem_7969_8dJhJsKhQd_5c2h2d7s_ThJdAs5s() {
    assertEquals(
      "5c2h2d7s ThJdAs5s",
      Solver.process("omaha-holdem 8dJhJsKhQd 5c2h2d7s ThJdAs5s"));
  }

  @Test
  public void test_omaha_holdem_7970_6h7c9sAdJc_5sQs5h2d_Ah4d3h5d_9d8d8s2c_QhJsKh3s_2s6c8h4s_TsQdAs8c() {
    assertEquals(
      "5sQs5h2d 2s6c8h4s 9d8d8s2c QhJsKh3s Ah4d3h5d TsQdAs8c",
      Solver.process("omaha-holdem 6h7c9sAdJc 5sQs5h2d Ah4d3h5d 9d8d8s2c QhJsKh3s 2s6c8h4s TsQdAs8c"));
  }

  @Test
  public void test_omaha_holdem_7971_3d8c8d8hJh_4d7s2d9s_5c9c6h7c_QdJd5sAc() {
    assertEquals(
      "4d7s2d9s=5c9c6h7c QdJd5sAc",
      Solver.process("omaha-holdem 3d8c8d8hJh 4d7s2d9s 5c9c6h7c QdJd5sAc"));
  }

  @Test
  public void test_omaha_holdem_7972_3d6d7c9sAd_Js8dQh2h_3cQc2sKs_5sKc6s8h_Kh8sTsQd_AhJh4hKd_2d4s9cJd_QsJc3s2c_5h7d4c5d_Th9d3h9h() {
    assertEquals(
      "Js8dQh2h QsJc3s2c 3cQc2sKs AhJh4hKd Th9d3h9h 5sKc6s8h Kh8sTsQd 5h7d4c5d 2d4s9cJd",
      Solver.process("omaha-holdem 3d6d7c9sAd Js8dQh2h 3cQc2sKs 5sKc6s8h Kh8sTsQd AhJh4hKd 2d4s9cJd QsJc3s2c 5h7d4c5d Th9d3h9h"));
  }

  @Test
  public void test_omaha_holdem_7973_8h9c9sAcAs_4hTd7sJc_6dQhKc2s_9h3sKs8c_8d5s2hJh() {
    assertEquals(
      "4hTd7sJc 6dQhKc2s 8d5s2hJh 9h3sKs8c",
      Solver.process("omaha-holdem 8h9c9sAcAs 4hTd7sJc 6dQhKc2s 9h3sKs8c 8d5s2hJh"));
  }

  @Test
  public void test_omaha_holdem_7974_3d3s4h8sKs_2h6d4d8d_7dJc5d3h_4sJs7c6s_Qc2dTsJh_2sTdJd3c_5hAcThAh_8hAdKcQs_As9hTcQh() {
    assertEquals(
      "Qc2dTsJh As9hTcQh 2h6d4d8d 8hAdKcQs 5hAcThAh 2sTdJd3c=7dJc5d3h 4sJs7c6s",
      Solver.process("omaha-holdem 3d3s4h8sKs 2h6d4d8d 7dJc5d3h 4sJs7c6s Qc2dTsJh 2sTdJd3c 5hAcThAh 8hAdKcQs As9hTcQh"));
  }

  @Test
  public void test_omaha_holdem_7975_3cKhQcQhTc_Jd9cJsJc_7h4c2c8h_Ac9d3sTh_Kd2h7c6s_3d4sTsQd() {
    assertEquals(
      "Ac9d3sTh Kd2h7c6s 7h4c2c8h Jd9cJsJc 3d4sTsQd",
      Solver.process("omaha-holdem 3cKhQcQhTc Jd9cJsJc 7h4c2c8h Ac9d3sTh Kd2h7c6s 3d4sTsQd"));
  }

  @Test
  public void test_omaha_holdem_7976_3c5d8cKhQd_4s6cKd2h_8hQhTdKs_8dJd9cTc() {
    assertEquals(
      "8dJd9cTc 4s6cKd2h 8hQhTdKs",
      Solver.process("omaha-holdem 3c5d8cKhQd 4s6cKd2h 8hQhTdKs 8dJd9cTc"));
  }

  @Test
  public void test_omaha_holdem_7977_4s5s6c8sTd_8h3dAs7d_JsAh3hTc_8c5dJh7h_9d9sThJc_Qs8d9cQc_9hKsKh3c_AcTsKc2d_Kd2h6h4h_2s7c5h7s() {
    assertEquals(
      "9d9sThJc AcTsKc2d=JsAh3hTc Qs8d9cQc 9hKsKh3c Kd2h6h4h 8c5dJh7h=8h3dAs7d 2s7c5h7s",
      Solver.process("omaha-holdem 4s5s6c8sTd 8h3dAs7d JsAh3hTc 8c5dJh7h 9d9sThJc Qs8d9cQc 9hKsKh3c AcTsKc2d Kd2h6h4h 2s7c5h7s"));
  }

  @Test
  public void test_omaha_holdem_7978_2h3d5dThTs_6dQh4c7d_3hJhKc4d_2dKsJcQs_5s8d4s2s_Qd7hAs8s_8cKhJd4h() {
    assertEquals(
      "8cKhJd4h Qd7hAs8s 2dKsJcQs 3hJhKc4d 5s8d4s2s 6dQh4c7d",
      Solver.process("omaha-holdem 2h3d5dThTs 6dQh4c7d 3hJhKc4d 2dKsJcQs 5s8d4s2s Qd7hAs8s 8cKhJd4h"));
  }

  @Test
  public void test_omaha_holdem_7979_7d9cAhJcJs_6hQh3dAs_8sJhQd7c_5sAd4h3h_KdKhQs9d_JdTc2c5d_9s2s5c3c() {
    assertEquals(
      "9s2s5c3c KdKhQs9d 5sAd4h3h 6hQh3dAs JdTc2c5d 8sJhQd7c",
      Solver.process("omaha-holdem 7d9cAhJcJs 6hQh3dAs 8sJhQd7c 5sAd4h3h KdKhQs9d JdTc2c5d 9s2s5c3c"));
  }

  @Test
  public void test_omaha_holdem_7980_7h9dJdThTs_5d9h9s3c_7s7dKs6c_7cQh4cKh_6s6d2h8c() {
    assertEquals(
      "6s6d2h8c 7cQh4cKh 7s7dKs6c 5d9h9s3c",
      Solver.process("omaha-holdem 7h9dJdThTs 5d9h9s3c 7s7dKs6c 7cQh4cKh 6s6d2h8c"));
  }

  @Test
  public void test_omaha_holdem_7981_2s3d7h8sJd_3h4hJsQc_KcAs6d8h_7s7d6h8c_5dAc5h4d() {
    assertEquals(
      "5dAc5h4d KcAs6d8h 3h4hJsQc 7s7d6h8c",
      Solver.process("omaha-holdem 2s3d7h8sJd 3h4hJsQc KcAs6d8h 7s7d6h8c 5dAc5h4d"));
  }

  @Test
  public void test_omaha_holdem_7982_2c5h6s8dJc_Ad4sAcTh_8c7dTc9s_Kd2hKh3d_7c6d9h3h_4dTdTs7s() {
    assertEquals(
      "Kd2hKh3d Ad4sAcTh 4dTdTs7s 7c6d9h3h=8c7dTc9s",
      Solver.process("omaha-holdem 2c5h6s8dJc Ad4sAcTh 8c7dTc9s Kd2hKh3d 7c6d9h3h 4dTdTs7s"));
  }

  @Test
  public void test_omaha_holdem_7983_5h6d8c8sAh_TcThAdKs_JcJsKh4d_3d3c9c6h() {
    assertEquals(
      "3d3c9c6h JcJsKh4d TcThAdKs",
      Solver.process("omaha-holdem 5h6d8c8sAh TcThAdKs JcJsKh4d 3d3c9c6h"));
  }

  @Test
  public void test_omaha_holdem_7984_4c4s9sJhTs_9cTh5hQc_5d7s6h8d_QhAh3h4d_3s8h8sAc() {
    assertEquals(
      "9cTh5hQc QhAh3h4d 5d7s6h8d 3s8h8sAc",
      Solver.process("omaha-holdem 4c4s9sJhTs 9cTh5hQc 5d7s6h8d QhAh3h4d 3s8h8sAc"));
  }

  @Test
  public void test_omaha_holdem_7985_5c8c9sJhKs_Jd5s6h2c_6cTh8hKc_4cAd9d3h() {
    assertEquals(
      "4cAd9d3h Jd5s6h2c 6cTh8hKc",
      Solver.process("omaha-holdem 5c8c9sJhKs Jd5s6h2c 6cTh8hKc 4cAd9d3h"));
  }

  @Test
  public void test_omaha_holdem_7986_2h6c8d9dQd_Ad4s2dTc_7d3s3c4d_Kd9sThTs_Jh2sAhQs_9cAs3h5s() {
    assertEquals(
      "9cAs3h5s Kd9sThTs Jh2sAhQs 7d3s3c4d Ad4s2dTc",
      Solver.process("omaha-holdem 2h6c8d9dQd Ad4s2dTc 7d3s3c4d Kd9sThTs Jh2sAhQs 9cAs3h5s"));
  }

  @Test
  public void test_omaha_holdem_7987_7sAsJcQhTd_9c7dQc6c_6s3h8cJh_4dTs6h7h_Kh4c3sQs_6dKcAh9h_Js5cAd5s_8s7c5h4s_8d9sQdTc_2hJdKd4h() {
    assertEquals(
      "8s7c5h4s 6s3h8cJh 4dTs6h7h 9c7dQc6c Js5cAd5s 8d9sQdTc 2hJdKd4h=6dKcAh9h=Kh4c3sQs",
      Solver.process("omaha-holdem 7sAsJcQhTd 9c7dQc6c 6s3h8cJh 4dTs6h7h Kh4c3sQs 6dKcAh9h Js5cAd5s 8s7c5h4s 8d9sQdTc 2hJdKd4h"));
  }

  @Test
  public void test_omaha_holdem_7988_4c4d4s7dQs_8sJsAsQd_2cTs2d5s_TcKd9c9s_7s3hQhAc_7hThKh2h_5d5hKc2s_Ad8c6s8h() {
    assertEquals(
      "7hThKh2h 7s3hQhAc=8sJsAsQd 2cTs2d5s 5d5hKc2s Ad8c6s8h TcKd9c9s",
      Solver.process("omaha-holdem 4c4d4s7dQs 8sJsAsQd 2cTs2d5s TcKd9c9s 7s3hQhAc 7hThKh2h 5d5hKc2s Ad8c6s8h"));
  }

  @Test
  public void test_omaha_holdem_7989_5c5d6d6h8c_8d6s9sJh_Ts3sAs8h_Qh5s7d4s_3d4hQd7s_8sJs4cAd() {
    assertEquals(
      "8sJs4cAd=Ts3sAs8h 3d4hQd7s=Qh5s7d4s 8d6s9sJh",
      Solver.process("omaha-holdem 5c5d6d6h8c 8d6s9sJh Ts3sAs8h Qh5s7d4s 3d4hQd7s 8sJs4cAd"));
  }

  @Test
  public void test_omaha_holdem_7990_2s4d9hKcQh_Kd8dTc5c_5d4s7sKs_8cQs7hAs() {
    assertEquals(
      "8cQs7hAs Kd8dTc5c 5d4s7sKs",
      Solver.process("omaha-holdem 2s4d9hKcQh Kd8dTc5c 5d4s7sKs 8cQs7hAs"));
  }

  @Test
  public void test_omaha_holdem_7991_2cJhKhQdTs_7h3sKc8s_5h2h3dJs_6hAh9c6s_JdKs8cAd_Qh7dQs5d_Td6c8d2s() {
    assertEquals(
      "6hAh9c6s 7h3sKc8s Td6c8d2s 5h2h3dJs Qh7dQs5d JdKs8cAd",
      Solver.process("omaha-holdem 2cJhKhQdTs 7h3sKc8s 5h2h3dJs 6hAh9c6s JdKs8cAd Qh7dQs5d Td6c8d2s"));
  }

  @Test
  public void test_omaha_holdem_7992_5c5h7dJhKd_JsQhThTs_6dAc7hTd() {
    assertEquals(
      "6dAc7hTd JsQhThTs",
      Solver.process("omaha-holdem 5c5h7dJhKd JsQhThTs 6dAc7hTd"));
  }

  @Test
  public void test_omaha_holdem_7993_5d9d9sAhJs_4cAsKh5c_2c9h7d2s_Ks3c7c7h_8s7sTcTs_4s6c9cJh_4dJcJd5h_3hKc8dAd_8c6hQhTh_3s2d5s4h() {
    assertEquals(
      "8c6hQhTh 3s2d5s4h Ks3c7c7h 8s7sTcTs 3hKc8dAd=4cAsKh5c 2c9h7d2s 4s6c9cJh 4dJcJd5h",
      Solver.process("omaha-holdem 5d9d9sAhJs 4cAsKh5c 2c9h7d2s Ks3c7c7h 8s7sTcTs 4s6c9cJh 4dJcJd5h 3hKc8dAd 8c6hQhTh 3s2d5s4h"));
  }

  @Test
  public void test_omaha_holdem_7994_4c8dAhJcJh_6h6d6s3h_9h7sAs7c() {
    assertEquals(
      "6h6d6s3h 9h7sAs7c",
      Solver.process("omaha-holdem 4c8dAhJcJh 6h6d6s3h 9h7sAs7c"));
  }

  @Test
  public void test_omaha_holdem_7995_4h5h9sQcTd_2h6s3s3d_7d2cKcJs_Jc2sAcQd_5d5c4d9c_Qh6h4s3c_Ts7c6c8h() {
    assertEquals(
      "2h6s3s3d Ts7c6c8h Jc2sAcQd Qh6h4s3c 5d5c4d9c 7d2cKcJs",
      Solver.process("omaha-holdem 4h5h9sQcTd 2h6s3s3d 7d2cKcJs Jc2sAcQd 5d5c4d9c Qh6h4s3c Ts7c6c8h"));
  }

  @Test
  public void test_omaha_holdem_7996_2s7h8c9dAs_Kh5hQc6d_6s6cThTd_Qd5c4s3s_JhTcAh2c_9cKs5s7c_2dQsKdAc() {
    assertEquals(
      "Qd5c4s3s 9cKs5s7c 2dQsKdAc Kh5hQc6d 6s6cThTd JhTcAh2c",
      Solver.process("omaha-holdem 2s7h8c9dAs Kh5hQc6d 6s6cThTd Qd5c4s3s JhTcAh2c 9cKs5s7c 2dQsKdAc"));
  }

  @Test
  public void test_omaha_holdem_7997_4c9dJdJsKc_7sTs3sJh_AdQhJc6s_Ac2c7d4s_5s3c5h6c_3h8d9c2h_QsKsTh5c() {
    assertEquals(
      "Ac2c7d4s 5s3c5h6c 3h8d9c2h 7sTs3sJh AdQhJc6s QsKsTh5c",
      Solver.process("omaha-holdem 4c9dJdJsKc 7sTs3sJh AdQhJc6s Ac2c7d4s 5s3c5h6c 3h8d9c2h QsKsTh5c"));
  }

  @Test
  public void test_omaha_holdem_7998_5c5dKcQdQs_7c8d3h6h_8c4d4s4h_ThAc3c8s_As7hJh2h_8hTsAdJc_Qh3s2c3d_6s5s4c9c() {
    assertEquals(
      "7c8d3h6h ThAc3c8s 8hTsAdJc=As7hJh2h 8c4d4s4h 6s5s4c9c Qh3s2c3d",
      Solver.process("omaha-holdem 5c5dKcQdQs 7c8d3h6h 8c4d4s4h ThAc3c8s As7hJh2h 8hTsAdJc Qh3s2c3d 6s5s4c9c"));
  }

  @Test
  public void test_omaha_holdem_7999_2h6s8sJsQh_6h2d3h7h_KsTcTd5d_4d6c8cKc_3d7dAh7c_5c8d8h4c() {
    assertEquals(
      "3d7dAh7c KsTcTd5d 6h2d3h7h 4d6c8cKc 5c8d8h4c",
      Solver.process("omaha-holdem 2h6s8sJsQh 6h2d3h7h KsTcTd5d 4d6c8cKc 3d7dAh7c 5c8d8h4c"));
  }

}
