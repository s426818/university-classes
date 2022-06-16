
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver0HiddenTest {


  @Test
  public void test_omaha_holdem_0_5c6dAcAsQs_TsQh9hQc_8d7cTcJd_5s5d7s4d_Qd3cKs4c_KdJs2hAh_Kh4hKc7h_6h7d2cJc() {
    assertEquals(
      "8d7cTcJd 6h7d2cJc Qd3cKs4c Kh4hKc7h KdJs2hAh 5s5d7s4d TsQh9hQc",
      Solver.process("omaha-holdem 5c6dAcAsQs TsQh9hQc 8d7cTcJd 5s5d7s4d Qd3cKs4c KdJs2hAh Kh4hKc7h 6h7d2cJc"));
  }

  @Test
  public void test_omaha_holdem_1_3d4s5dJsQd_8s2h6s8h_7cThKs5s_5hJh2s7d_8d9s5c4h_7sJdKcAs_9h7h2dTc_Qh8cTsJc() {
    assertEquals(
      "9h7h2dTc 7cThKs5s 7sJdKcAs 8d9s5c4h 5hJh2s7d Qh8cTsJc 8s2h6s8h",
      Solver.process("omaha-holdem 3d4s5dJsQd 8s2h6s8h 7cThKs5s 5hJh2s7d 8d9s5c4h 7sJdKcAs 9h7h2dTc Qh8cTsJc"));
  }

  @Test
  public void test_omaha_holdem_2_3d3s4d6hJc_Js2dKd8c_KsAsTcTs_Jh2h3c9c_Qc8dAd6c_7dQsAc5d() {
    assertEquals(
      "Qc8dAd6c KsAsTcTs Js2dKd8c 7dQsAc5d Jh2h3c9c",
      Solver.process("omaha-holdem 3d3s4d6hJc Js2dKd8c KsAsTcTs Jh2h3c9c Qc8dAd6c 7dQsAc5d"));
  }

  @Test
  public void test_omaha_holdem_3_2h4s8d8hKh_3hTsJcJh_QhKs9h9d_ThAc6c4c_Ad7h6dQc_5h8c6s5s_2d5d3s2c_4h3c8s9c() {
    assertEquals(
      "Ad7h6dQc ThAc6c4c 5h8c6s5s 3hTsJcJh QhKs9h9d 2d5d3s2c 4h3c8s9c",
      Solver.process("omaha-holdem 2h4s8d8hKh 3hTsJcJh QhKs9h9d ThAc6c4c Ad7h6dQc 5h8c6s5s 2d5d3s2c 4h3c8s9c"));
  }

  @Test
  public void test_omaha_holdem_4_3d4h4s5c5s_6h9c8h6d_Jh3sKc9h_Tc6sAs5d_8cQc7s7h_Ts5h4c3c() {
    assertEquals(
      "Jh3sKc9h 6h9c8h6d 8cQc7s7h Tc6sAs5d Ts5h4c3c",
      Solver.process("omaha-holdem 3d4h4s5c5s 6h9c8h6d Jh3sKc9h Tc6sAs5d 8cQc7s7h Ts5h4c3c"));
  }

  @Test
  public void test_omaha_holdem_5_4c4s8c9cQd_Jd8dJsQh_2s6d9hTh_AdKsTs8s_Kd3d6c7h_5sQsQcTc_2c5c3h4h_7c7sAs8h_3s2dAcKc() {
    assertEquals(
      "Kd3d6c7h 7c7sAs8h=AdKsTs8s 2s6d9hTh Jd8dJsQh 2c5c3h4h 3s2dAcKc 5sQsQcTc",
      Solver.process("omaha-holdem 4c4s8c9cQd Jd8dJsQh 2s6d9hTh AdKsTs8s Kd3d6c7h 5sQsQcTc 2c5c3h4h 7c7sAs8h 3s2dAcKc"));
  }

  @Test
  public void test_omaha_holdem_6_2h3s4sAsQh_5d9d3d9s_Ac5hJhJc_Kd6hJs7d_7cKs7h7s_5c6d4cKh_Ts8d4d2s_2dJd4h5s() {
    assertEquals(
      "Kd6hJs7d 2dJd4h5s=5d9d3d9s=Ac5hJhJc 5c6d4cKh Ts8d4d2s 7cKs7h7s",
      Solver.process("omaha-holdem 2h3s4sAsQh 5d9d3d9s Ac5hJhJc Kd6hJs7d 7cKs7h7s 5c6d4cKh Ts8d4d2s 2dJd4h5s"));
  }

  @Test
  public void test_omaha_holdem_7_3sJsKdQhTc_4s3c7d8d_Jc4c6cTh_Jh9h7c3h_Qd7hAsKs() {
    assertEquals(
      "4s3c7d8d Jc4c6cTh Jh9h7c3h Qd7hAsKs",
      Solver.process("omaha-holdem 3sJsKdQhTc 4s3c7d8d Jc4c6cTh Jh9h7c3h Qd7hAsKs"));
  }

  @Test
  public void test_omaha_holdem_8_4s6h8sKsQc_5s7h8d5c_7s3h9dTc_7d2d2hAc_QsTd8c8h_2cAd2s3s_4cQd4hKd() {
    assertEquals(
      "7s3h9dTc 7d2d2hAc 4cQd4hKd QsTd8c8h 5s7h8d5c 2cAd2s3s",
      Solver.process("omaha-holdem 4s6h8sKsQc 5s7h8d5c 7s3h9dTc 7d2d2hAc QsTd8c8h 2cAd2s3s 4cQd4hKd"));
  }

  @Test
  public void test_omaha_holdem_9_2s6h8c8sTs_9d5cJc3d_KdAs9s5h_4c3c8hJs_6cQcQd6s_4h2c6dKs_Td7dAdJd_7s4d9hKc() {
    assertEquals(
      "9d5cJc3d 4h2c6dKs Td7dAdJd 4c3c8hJs 7s4d9hKc KdAs9s5h 6cQcQd6s",
      Solver.process("omaha-holdem 2s6h8c8sTs 9d5cJc3d KdAs9s5h 4c3c8hJs 6cQcQd6s 4h2c6dKs Td7dAdJd 7s4d9hKc"));
  }

  @Test
  public void test_omaha_holdem_10_4d5c7hJcQh_4hQc8hQd_3d7sAs8d_KhKc6cKd() {
    assertEquals(
      "3d7sAs8d KhKc6cKd 4hQc8hQd",
      Solver.process("omaha-holdem 4d5c7hJcQh 4hQc8hQd 3d7sAs8d KhKc6cKd"));
  }

  @Test
  public void test_omaha_holdem_11_2d2h3cAhJc_QsAsQd6c_Jh5c5hJd() {
    assertEquals(
      "QsAsQd6c Jh5c5hJd",
      Solver.process("omaha-holdem 2d2h3cAhJc QsAsQd6c Jh5c5hJd"));
  }

  @Test
  public void test_omaha_holdem_12_3d4s5h9dQs_5c9sJdKd_Ks2c7c7h_As7s3sAd_QcAh8c8h() {
    assertEquals(
      "Ks2c7c7h QcAh8c8h As7s3sAd 5c9sJdKd",
      Solver.process("omaha-holdem 3d4s5h9dQs 5c9sJdKd Ks2c7c7h As7s3sAd QcAh8c8h"));
  }

  @Test
  public void test_omaha_holdem_13_5h6cAhQcQd_2c2sKc5d_8hQs5s7h_Ac6sTc3c() {
    assertEquals(
      "2c2sKc5d Ac6sTc3c 8hQs5s7h",
      Solver.process("omaha-holdem 5h6cAhQcQd 2c2sKc5d 8hQs5s7h Ac6sTc3c"));
  }

  @Test
  public void test_omaha_holdem_14_4h6h7hKhTh_6c7c5s9c_Ts5c3h4s_5d7dJhKs_3c2s8dJs_3d9sKc8h() {
    assertEquals(
      "3c2s8dJs 6c7c5s9c 5d7dJhKs Ts5c3h4s 3d9sKc8h",
      Solver.process("omaha-holdem 4h6h7hKhTh 6c7c5s9c Ts5c3h4s 5d7dJhKs 3c2s8dJs 3d9sKc8h"));
  }

  @Test
  public void test_omaha_holdem_15_3c5h8cJhQc_5c6c4d4c_ThKhAhAc() {
    assertEquals(
      "ThKhAhAc 5c6c4d4c",
      Solver.process("omaha-holdem 3c5h8cJhQc 5c6c4d4c ThKhAhAc"));
  }

  @Test
  public void test_omaha_holdem_16_3c4c5c6dJc_3s4hAc6c_TcQhKsJh_Ah6s9hTd_Kh3d8c8s_8dAs6h5s_2cTs5d4d_2sKc2h5h_8h3hQs9c() {
    assertEquals(
      "8h3hQs9c Ah6s9hTd Kh3d8c8s TcQhKsJh 8dAs6h5s 2cTs5d4d=2sKc2h5h 3s4hAc6c",
      Solver.process("omaha-holdem 3c4c5c6dJc 3s4hAc6c TcQhKsJh Ah6s9hTd Kh3d8c8s 8dAs6h5s 2cTs5d4d 2sKc2h5h 8h3hQs9c"));
  }

  @Test
  public void test_omaha_holdem_17_2h9sAdAsTd_4cAc8s8c_6d6h5h5c_7hTs7sKd_3c9dTh3d() {
    assertEquals(
      "6d6h5h5c 3c9dTh3d 7hTs7sKd 4cAc8s8c",
      Solver.process("omaha-holdem 2h9sAdAsTd 4cAc8s8c 6d6h5h5c 7hTs7sKd 3c9dTh3d"));
  }

  @Test
  public void test_omaha_holdem_18_4h5hAsKhQc_JdQhJhJs_5sTd4s7c_Ts6s5c3c_3h8h2s7d() {
    assertEquals(
      "Ts6s5c3c 5sTd4s7c 3h8h2s7d JdQhJhJs",
      Solver.process("omaha-holdem 4h5hAsKhQc JdQhJhJs 5sTd4s7c Ts6s5c3c 3h8h2s7d"));
  }

  @Test
  public void test_omaha_holdem_19_3c9sJsQdTs_Th2dKcAh_5d7c4s4c_5s9h7h6h_5h5c7dJd() {
    assertEquals(
      "5d7c4s4c 5s9h7h6h 5h5c7dJd Th2dKcAh",
      Solver.process("omaha-holdem 3c9sJsQdTs Th2dKcAh 5d7c4s4c 5s9h7h6h 5h5c7dJd"));
  }

  @Test
  public void test_omaha_holdem_20_3c3s9cJsQd_Ts6h2c9d_Qs5c8s4s() {
    assertEquals(
      "Ts6h2c9d Qs5c8s4s",
      Solver.process("omaha-holdem 3c3s9cJsQd Ts6h2c9d Qs5c8s4s"));
  }

  @Test
  public void test_omaha_holdem_21_2c5h8c9cKd_5dTh4h7h_Qd6s7sJs_3dJh9sJc() {
    assertEquals(
      "5dTh4h7h 3dJh9sJc Qd6s7sJs",
      Solver.process("omaha-holdem 2c5h8c9cKd 5dTh4h7h Qd6s7sJs 3dJh9sJc"));
  }

  @Test
  public void test_omaha_holdem_22_3s6d7s9dAc_2sQdAdQc_2d4h5h9s_6hJh4cTc_8h3c6s9c_5s7h4s7c_8d4dAsKc_Qs8sTs8c_3h5cQhTh() {
    assertEquals(
      "3h5cQhTh 6hJh4cTc 2sQdAdQc 8d4dAsKc 8h3c6s9c 2d4h5h9s=5s7h4s7c Qs8sTs8c",
      Solver.process("omaha-holdem 3s6d7s9dAc 2sQdAdQc 2d4h5h9s 6hJh4cTc 8h3c6s9c 5s7h4s7c 8d4dAsKc Qs8sTs8c 3h5cQhTh"));
  }

  @Test
  public void test_omaha_holdem_23_3c4sKdKhQh_6d7dJc9h_6h2cAdAh() {
    assertEquals(
      "6d7dJc9h 6h2cAdAh",
      Solver.process("omaha-holdem 3c4sKdKhQh 6d7dJc9h 6h2cAdAh"));
  }

  @Test
  public void test_omaha_holdem_24_6h7c7sJcKh_8c5d9cJd_AdAc6cKs_5s5cTd4d_Jh2h2dQh_8dQs3d9d() {
    assertEquals(
      "8dQs3d9d 5s5cTd4d 8c5d9cJd Jh2h2dQh AdAc6cKs",
      Solver.process("omaha-holdem 6h7c7sJcKh 8c5d9cJd AdAc6cKs 5s5cTd4d Jh2h2dQh 8dQs3d9d"));
  }

  @Test
  public void test_omaha_holdem_25_2h2s5h8hAd_9cJhJc7s_3cQh8c7h_3hJs5c4d_Kh4c6d3d() {
    assertEquals(
      "9cJhJc7s 3hJs5c4d=Kh4c6d3d 3cQh8c7h",
      Solver.process("omaha-holdem 2h2s5h8hAd 9cJhJc7s 3cQh8c7h 3hJs5c4d Kh4c6d3d"));
  }

  @Test
  public void test_omaha_holdem_26_2c3d7dAhTh_8dAdKcQc_JhJc2sQh() {
    assertEquals(
      "JhJc2sQh 8dAdKcQc",
      Solver.process("omaha-holdem 2c3d7dAhTh 8dAdKcQc JhJc2sQh"));
  }

  @Test
  public void test_omaha_holdem_27_2c3c3h5h6s_JcKh5s8c_9cQd4dTs() {
    assertEquals(
      "9cQd4dTs JcKh5s8c",
      Solver.process("omaha-holdem 2c3c3h5h6s JcKh5s8c 9cQd4dTs"));
  }

  @Test
  public void test_omaha_holdem_28_3c3d8sAcKc_Js8dJh3h_5sKs4s2d() {
    assertEquals(
      "5sKs4s2d Js8dJh3h",
      Solver.process("omaha-holdem 3c3d8sAcKc Js8dJh3h 5sKs4s2d"));
  }

  @Test
  public void test_omaha_holdem_29_3h4c8c8sKh_4sJcAd5s_6h7sTh9h_9c6dTd6c() {
    assertEquals(
      "6h7sTh9h 4sJcAd5s 9c6dTd6c",
      Solver.process("omaha-holdem 3h4c8c8sKh 4sJcAd5s 6h7sTh9h 9c6dTd6c"));
  }

  @Test
  public void test_omaha_holdem_30_3s6d7cAsTd_JdQdJhAc_5s6sAhTs_3hKh5c9d_Kc9sQh2d_9cKs4hKd() {
    assertEquals(
      "Kc9sQh2d 3hKh5c9d 9cKs4hKd JdQdJhAc 5s6sAhTs",
      Solver.process("omaha-holdem 3s6d7cAsTd JdQdJhAc 5s6sAhTs 3hKh5c9d Kc9sQh2d 9cKs4hKd"));
  }

  @Test
  public void test_omaha_holdem_31_6d6h8hAdTs_AhJsQs4c_3dJh9s3h_KhKc3s6s_As5cTc3c_7s2cTdJd_2s5d2dAc() {
    assertEquals(
      "3dJh9s3h 7s2cTdJd 2s5d2dAc AhJsQs4c As5cTc3c KhKc3s6s",
      Solver.process("omaha-holdem 6d6h8hAdTs AhJsQs4c 3dJh9s3h KhKc3s6s As5cTc3c 7s2cTdJd 2s5d2dAc"));
  }

  @Test
  public void test_omaha_holdem_32_3c7s9dJdKs_7d9h3s6h_Qc2c5sKd_2hAdAcQd_9cJs5d3h_9s8h6s8c_2dThKc6d() {
    assertEquals(
      "9s8h6s8c 2dThKc6d Qc2c5sKd 2hAdAcQd 7d9h3s6h 9cJs5d3h",
      Solver.process("omaha-holdem 3c7s9dJdKs 7d9h3s6h Qc2c5sKd 2hAdAcQd 9cJs5d3h 9s8h6s8c 2dThKc6d"));
  }

  @Test
  public void test_omaha_holdem_33_6c6s8c9cTd_Js9d7cTs_9sAsQh5c_7h7dKcAh_5s9hQd8d() {
    assertEquals(
      "7h7dKcAh 9sAsQh5c 5s9hQd8d Js9d7cTs",
      Solver.process("omaha-holdem 6c6s8c9cTd Js9d7cTs 9sAsQh5c 7h7dKcAh 5s9hQd8d"));
  }

  @Test
  public void test_omaha_holdem_34_2h3c6sKdQs_Ts7d4d3h_5sJsKc8d_QdTcAsAh_Th3s8s9s_2dKs6h8h() {
    assertEquals(
      "Th3s8s9s=Ts7d4d3h 5sJsKc8d QdTcAsAh 2dKs6h8h",
      Solver.process("omaha-holdem 2h3c6sKdQs Ts7d4d3h 5sJsKc8d QdTcAsAh Th3s8s9s 2dKs6h8h"));
  }

  @Test
  public void test_omaha_holdem_35_8c9sJcJsTd_Tc5c7s5d_2hJd3hAd_Jh6sTh6c_Ts9h6hKs_4s8dQs2s_Kc9c8s3c() {
    assertEquals(
      "Kc9c8s3c Ts9h6hKs 2hJd3hAd Tc5c7s5d 4s8dQs2s Jh6sTh6c",
      Solver.process("omaha-holdem 8c9sJcJsTd Tc5c7s5d 2hJd3hAd Jh6sTh6c Ts9h6hKs 4s8dQs2s Kc9c8s3c"));
  }

  @Test
  public void test_omaha_holdem_36_3h7cAhQdQs_ThTcQh8d_Qc5cTsAc() {
    assertEquals(
      "ThTcQh8d Qc5cTsAc",
      Solver.process("omaha-holdem 3h7cAhQdQs ThTcQh8d Qc5cTsAc"));
  }

  @Test
  public void test_omaha_holdem_37_3c5h9sJcTd_6dAhTs5d_KsQd7d3s_4hKcKh3h_2dTh9c2c_5c3dQh6c_7sJh9d4c() {
    assertEquals(
      "4hKcKh3h 5c3dQh6c 6dAhTs5d 2dTh9c2c 7sJh9d4c KsQd7d3s",
      Solver.process("omaha-holdem 3c5h9sJcTd 6dAhTs5d KsQd7d3s 4hKcKh3h 2dTh9c2c 5c3dQh6c 7sJh9d4c"));
  }

  @Test
  public void test_omaha_holdem_38_6d8c8dKcTs_6h3dJs4c_Ac5c3h8s() {
    assertEquals(
      "6h3dJs4c Ac5c3h8s",
      Solver.process("omaha-holdem 6d8c8dKcTs 6h3dJs4c Ac5c3h8s"));
  }

  @Test
  public void test_omaha_holdem_39_3c3h4c4s7h_Qc2sKh6c_8hJh5c6s_Jd3d2c2h_Qd6h9dAd_2dTs4hKd_KcAh5h7d() {
    assertEquals(
      "Qc2sKh6c Qd6h9dAd KcAh5h7d Jd3d2c2h 2dTs4hKd 8hJh5c6s",
      Solver.process("omaha-holdem 3c3h4c4s7h Qc2sKh6c 8hJh5c6s Jd3d2c2h Qd6h9dAd 2dTs4hKd KcAh5h7d"));
  }

  @Test
  public void test_omaha_holdem_40_2s6d8cAcKc_4d6s9sQc_7c2c2h8d_5h3d5d6h_Ks7hTh4s() {
    assertEquals(
      "5h3d5d6h 4d6s9sQc Ks7hTh4s 7c2c2h8d",
      Solver.process("omaha-holdem 2s6d8cAcKc 4d6s9sQc 7c2c2h8d 5h3d5d6h Ks7hTh4s"));
  }

  @Test
  public void test_omaha_holdem_41_3c5cKcQsTs_3h5s2dJd_9hQdTh2c_9dJhAcKh_5hAd6h4c() {
    assertEquals(
      "5hAd6h4c 3h5s2dJd 9hQdTh2c 9dJhAcKh",
      Solver.process("omaha-holdem 3c5cKcQsTs 3h5s2dJd 9hQdTh2c 9dJhAcKh 5hAd6h4c"));
  }

  @Test
  public void test_omaha_holdem_42_6c8dAcAhKh_6dTd2hTh_3s2s5s8h_Ks6s7s9s_5h4sTc3h_4h2cQcTs_5dQhAs5c_7c2d6h9d() {
    assertEquals(
      "5h4sTc3h 4h2cQcTs 7c2d6h9d 3s2s5s8h 6dTd2hTh Ks6s7s9s 5dQhAs5c",
      Solver.process("omaha-holdem 6c8dAcAhKh 6dTd2hTh 3s2s5s8h Ks6s7s9s 5h4sTc3h 4h2cQcTs 5dQhAs5c 7c2d6h9d"));
  }

  @Test
  public void test_omaha_holdem_43_2c4c6dAsTd_5d3h6cQc_2s8h9h3d_Kc2hAh9d_JcTs7dTh() {
    assertEquals(
      "2s8h9h3d Kc2hAh9d JcTs7dTh 5d3h6cQc",
      Solver.process("omaha-holdem 2c4c6dAsTd 5d3h6cQc 2s8h9h3d Kc2hAh9d JcTs7dTh"));
  }

  @Test
  public void test_omaha_holdem_44_5d6h7sTcTh_Qd2s5hJc_8hJhQsAc_5cAh7hAd() {
    assertEquals(
      "8hJhQsAc Qd2s5hJc 5cAh7hAd",
      Solver.process("omaha-holdem 5d6h7sTcTh Qd2s5hJc 8hJhQsAc 5cAh7hAd"));
  }

  @Test
  public void test_omaha_holdem_45_4h5c5sKhQd_Td9d9c7s_2c3cKc8c_AcQsTcQh() {
    assertEquals(
      "Td9d9c7s 2c3cKc8c AcQsTcQh",
      Solver.process("omaha-holdem 4h5c5sKhQd Td9d9c7s 2c3cKc8c AcQsTcQh"));
  }

  @Test
  public void test_omaha_holdem_46_2d4d8sTcTs_7h3sAsJd_5h8cQs6h_Ks3h2h2c_7dTh7c9c_5s3cTd9d_6s6c6dAc_KhAd9sQh_4cKc2s5d() {
    assertEquals(
      "7h3sAsJd KhAd9sQh 4cKc2s5d 6s6c6dAc 5h8cQs6h 5s3cTd9d=7dTh7c9c Ks3h2h2c",
      Solver.process("omaha-holdem 2d4d8sTcTs 7h3sAsJd 5h8cQs6h Ks3h2h2c 7dTh7c9c 5s3cTd9d 6s6c6dAc KhAd9sQh 4cKc2s5d"));
  }

  @Test
  public void test_omaha_holdem_47_4s7d7hJdKd_ThJs9d8h_4cQd8c2h_6s7cKh6c_8d5h2sAh_Ks3s6h4h_2d3dQs2c() {
    assertEquals(
      "8d5h2sAh 4cQd8c2h ThJs9d8h Ks3s6h4h 2d3dQs2c 6s7cKh6c",
      Solver.process("omaha-holdem 4s7d7hJdKd ThJs9d8h 4cQd8c2h 6s7cKh6c 8d5h2sAh Ks3s6h4h 2d3dQs2c"));
  }

  @Test
  public void test_omaha_holdem_48_4h8s9cAsKh_Qc5sAc2h_3h7s2s7h_3d5cTh6d_KsAh4s4c_QsJh8dJc_Td5h2d8h_3s8c2c6s_9d4d7c9h() {
    assertEquals(
      "3d5cTh6d 3h7s2s7h 3s8c2c6s Td5h2d8h QsJh8dJc Qc5sAc2h KsAh4s4c 9d4d7c9h",
      Solver.process("omaha-holdem 4h8s9cAsKh Qc5sAc2h 3h7s2s7h 3d5cTh6d KsAh4s4c QsJh8dJc Td5h2d8h 3s8c2c6s 9d4d7c9h"));
  }

  @Test
  public void test_omaha_holdem_49_9c9dKcQcTd_AdKdQs7s_6cTcQhJd_Th8c8dAc_5dKsJcJh() {
    assertEquals(
      "AdKdQs7s 5dKsJcJh 6cTcQhJd Th8c8dAc",
      Solver.process("omaha-holdem 9c9dKcQcTd AdKdQs7s 6cTcQhJd Th8c8dAc 5dKsJcJh"));
  }

  @Test
  public void test_omaha_holdem_50_3c3s4s6dJd_7h5h8d8c_TdTc6sKh_7c2sKc8s_As9sKsAc_JcAd9cQc_6c5dJs6h_QsJh9dTh_Qh8h2dTs() {
    assertEquals(
      "Qh8h2dTs 7c2sKc8s TdTc6sKh QsJh9dTh JcAd9cQc As9sKsAc 7h5h8d8c 6c5dJs6h",
      Solver.process("omaha-holdem 3c3s4s6dJd 7h5h8d8c TdTc6sKh 7c2sKc8s As9sKsAc JcAd9cQc 6c5dJs6h QsJh9dTh Qh8h2dTs"));
  }

  @Test
  public void test_omaha_holdem_51_5c6sJsQcQh_AcTcQd2d_AsAd2sQs() {
    assertEquals(
      "AcTcQd2d=AsAd2sQs",
      Solver.process("omaha-holdem 5c6sJsQcQh AcTcQd2d AsAd2sQs"));
  }

  @Test
  public void test_omaha_holdem_52_5h7c8cQdTs_4d2dTcQs_AcAs9h2s_6h9dAhKh_Td3h8s4h() {
    assertEquals(
      "AcAs9h2s Td3h8s4h 4d2dTcQs 6h9dAhKh",
      Solver.process("omaha-holdem 5h7c8cQdTs 4d2dTcQs AcAs9h2s 6h9dAhKh Td3h8s4h"));
  }

  @Test
  public void test_omaha_holdem_53_9sQcQdTcTd_8dQh6dJh_5cQs3hKc() {
    assertEquals(
      "5cQs3hKc 8dQh6dJh",
      Solver.process("omaha-holdem 9sQcQdTcTd 8dQh6dJh 5cQs3hKc"));
  }

  @Test
  public void test_omaha_holdem_54_5c8hJhKhTd_8cQd4hKc_6d7h6cKd_3h5s2sQs_Th9cAh6s_6hTs3s7c() {
    assertEquals(
      "3h5s2sQs 6hTs3s7c 6d7h6cKd 8cQd4hKc Th9cAh6s",
      Solver.process("omaha-holdem 5c8hJhKhTd 8cQd4hKc 6d7h6cKd 3h5s2sQs Th9cAh6s 6hTs3s7c"));
  }

  @Test
  public void test_omaha_holdem_55_3s5s6s7d8s_2dQhQc3c_Kh7h7cJs_QdQsTs2c() {
    assertEquals(
      "2dQhQc3c Kh7h7cJs QdQsTs2c",
      Solver.process("omaha-holdem 3s5s6s7d8s 2dQhQc3c Kh7h7cJs QdQsTs2c"));
  }

  @Test
  public void test_omaha_holdem_56_3h5sJdKdTh_7s3sQd2s_9h4hQc7d_Ts8h6h9c() {
    assertEquals(
      "7s3sQd2s Ts8h6h9c 9h4hQc7d",
      Solver.process("omaha-holdem 3h5sJdKdTh 7s3sQd2s 9h4hQc7d Ts8h6h9c"));
  }

  @Test
  public void test_omaha_holdem_57_4h5s8d8s9h_8h7cTcAc_8c3h9cAd() {
    assertEquals(
      "8h7cTcAc 8c3h9cAd",
      Solver.process("omaha-holdem 4h5s8d8s9h 8h7cTcAc 8c3h9cAd"));
  }

  @Test
  public void test_omaha_holdem_58_2s3c3s4hKh_6cJc2dAh_9d9h4s5h_4cKs7dQs_Kd6dTh9s() {
    assertEquals(
      "6cJc2dAh 9d9h4s5h Kd6dTh9s 4cKs7dQs",
      Solver.process("omaha-holdem 2s3c3s4hKh 6cJc2dAh 9d9h4s5h 4cKs7dQs Kd6dTh9s"));
  }

  @Test
  public void test_omaha_holdem_59_3c4h6s8cQs_8dTs5s2s_3h6h9c4c_8hQhTdTc() {
    assertEquals(
      "3h6h9c4c 8hQhTdTc 8dTs5s2s",
      Solver.process("omaha-holdem 3c4h6s8cQs 8dTs5s2s 3h6h9c4c 8hQhTdTc"));
  }

  @Test
  public void test_omaha_holdem_60_3c5h5s6cQd_7h9c9s7c_5d2d6hQs() {
    assertEquals(
      "7h9c9s7c 5d2d6hQs",
      Solver.process("omaha-holdem 3c5h5s6cQd 7h9c9s7c 5d2d6hQs"));
  }

  @Test
  public void test_omaha_holdem_61_3h6s7sJsKh_2sAdAhAs_5sQd8hKs_Jd5cQs2c_Qh5hKcKd_4d2dTsTd_4c4hAc8c_9c3d9h7c() {
    assertEquals(
      "4c4hAc8c 4d2dTsTd Jd5cQs2c 9c3d9h7c Qh5hKcKd 5sQd8hKs 2sAdAhAs",
      Solver.process("omaha-holdem 3h6s7sJsKh 2sAdAhAs 5sQd8hKs Jd5cQs2c Qh5hKcKd 4d2dTsTd 4c4hAc8c 9c3d9h7c"));
  }

  @Test
  public void test_omaha_holdem_62_2d3h5d9hKc_8d5hKhQh_2c8hTcJd_6s6h4dKs_2h7sJh2s_4cQd7h8s_AdJs9dQc_Ts5cJc9c() {
    assertEquals(
      "4cQd7h8s 2c8hTcJd AdJs9dQc Ts5cJc9c 8d5hKhQh 2h7sJh2s 6s6h4dKs",
      Solver.process("omaha-holdem 2d3h5d9hKc 8d5hKhQh 2c8hTcJd 6s6h4dKs 2h7sJh2s 4cQd7h8s AdJs9dQc Ts5cJc9c"));
  }

  @Test
  public void test_omaha_holdem_63_JdKdKsQsTc_7c5sJh8d_Qd9h7h2d_As9sJc9d() {
    assertEquals(
      "7c5sJh8d Qd9h7h2d As9sJc9d",
      Solver.process("omaha-holdem JdKdKsQsTc 7c5sJh8d Qd9h7h2d As9sJc9d"));
  }

  @Test
  public void test_omaha_holdem_64_2sKhQcQhTh_3c5h4h9s_6d3hTsQs_Ah3s3d5c_JcKd2cAc_7cAd8cTc() {
    assertEquals(
      "Ah3s3d5c 7cAd8cTc JcKd2cAc 3c5h4h9s 6d3hTsQs",
      Solver.process("omaha-holdem 2sKhQcQhTh 3c5h4h9s 6d3hTsQs Ah3s3d5c JcKd2cAc 7cAd8cTc"));
  }

  @Test
  public void test_omaha_holdem_65_4s6c9cAsJd_Ts8h2dKd_TdQd6d9s_3s6sQcAd_5s5h5cKs_Qh2s9h4h_4d5dThKc() {
    assertEquals(
      "Ts8h2dKd 4d5dThKc 5s5h5cKs Qh2s9h4h TdQd6d9s 3s6sQcAd",
      Solver.process("omaha-holdem 4s6c9cAsJd Ts8h2dKd TdQd6d9s 3s6sQcAd 5s5h5cKs Qh2s9h4h 4d5dThKc"));
  }

  @Test
  public void test_omaha_holdem_66_2c9d9hQdQh_6hJs2d4d_7dQsThJh_KsTs2h6s_4s4hAd5c_JdQc4cKd_9c5s7h5d_2sKc5h6c() {
    assertEquals(
      "6hJs2d4d 2sKc5h6c=KsTs2h6s 4s4hAd5c 9c5s7h5d 7dQsThJh JdQc4cKd",
      Solver.process("omaha-holdem 2c9d9hQdQh 6hJs2d4d 7dQsThJh KsTs2h6s 4s4hAd5c JdQc4cKd 9c5s7h5d 2sKc5h6c"));
  }

  @Test
  public void test_omaha_holdem_67_3d7s8h9hKd_JcQh6cAs_8s5s7d9d_Qc4dAh6s_JhQd2hAc_Qs9s4hTs_2s4s3hKc_5h6d4c7h() {
    assertEquals(
      "JcQh6cAs=JhQd2hAc=Qc4dAh6s Qs9s4hTs 8s5s7d9d 2s4s3hKc 5h6d4c7h",
      Solver.process("omaha-holdem 3d7s8h9hKd JcQh6cAs 8s5s7d9d Qc4dAh6s JhQd2hAc Qs9s4hTs 2s4s3hKc 5h6d4c7h"));
  }

  @Test
  public void test_omaha_holdem_68_7d9sAhJcQc_KdJdAd3h_JsAc2hQs_4cQdTs7c_7hAs3d2s() {
    assertEquals(
      "4cQdTs7c 7hAs3d2s KdJdAd3h JsAc2hQs",
      Solver.process("omaha-holdem 7d9sAhJcQc KdJdAd3h JsAc2hQs 4cQdTs7c 7hAs3d2s"));
  }

  @Test
  public void test_omaha_holdem_69_2d7c7d9sKc_3sTs7s8d_TcKsKd6c_Jc9h4dQh_5d3cJd4c_AsAd8c6d_Qs3h2h3d_8hAcTd5c() {
    assertEquals(
      "5d3cJd4c 8hAcTd5c Qs3h2h3d Jc9h4dQh AsAd8c6d 3sTs7s8d TcKsKd6c",
      Solver.process("omaha-holdem 2d7c7d9sKc 3sTs7s8d TcKsKd6c Jc9h4dQh 5d3cJd4c AsAd8c6d Qs3h2h3d 8hAcTd5c"));
  }

  @Test
  public void test_omaha_holdem_70_5h6c9dThTs_8sJc9s4d_2hKs7s9c_Kc8hJs5s() {
    assertEquals(
      "Kc8hJs5s 8sJc9s4d 2hKs7s9c",
      Solver.process("omaha-holdem 5h6c9dThTs 8sJc9s4d 2hKs7s9c Kc8hJs5s"));
  }

  @Test
  public void test_omaha_holdem_71_2h5h7d9cJs_Qd6dTh4s_3sJh9d8h_AhQhTd3h_6c4d9sTs_2cAc5c6h_Jc4c7c8d_2sKcAsJd_2d9hAd5d_Tc8s3d4h() {
    assertEquals(
      "Qd6dTh4s AhQhTd3h 6c4d9sTs 2cAc5c6h 2d9hAd5d 2sKcAsJd Jc4c7c8d 3sJh9d8h Tc8s3d4h",
      Solver.process("omaha-holdem 2h5h7d9cJs Qd6dTh4s 3sJh9d8h AhQhTd3h 6c4d9sTs 2cAc5c6h Jc4c7c8d 2sKcAsJd 2d9hAd5d Tc8s3d4h"));
  }

  @Test
  public void test_omaha_holdem_72_2c6d8hKdKs_TdQhQs9s_9c5sJh4d_6c4h9dAd_KcAcAsJs_3sTcJd7h_7d7sJc5h() {
    assertEquals(
      "9c5sJh4d 3sTcJd7h 6c4h9dAd 7d7sJc5h TdQhQs9s KcAcAsJs",
      Solver.process("omaha-holdem 2c6d8hKdKs TdQhQs9s 9c5sJh4d 6c4h9dAd KcAcAsJs 3sTcJd7h 7d7sJc5h"));
  }

  @Test
  public void test_omaha_holdem_73_5s8d9cJdQd_2c2hQcKh_AhThAs7s_Jh7h6d2s_4h5c8cKs() {
    assertEquals(
      "2c2hQcKh 4h5c8cKs Jh7h6d2s AhThAs7s",
      Solver.process("omaha-holdem 5s8d9cJdQd 2c2hQcKh AhThAs7s Jh7h6d2s 4h5c8cKs"));
  }

  @Test
  public void test_omaha_holdem_74_4s7h8dJhKs_8c5c9sKc_QcTcJc7c_2h4h8s5h_7s6c6dAc_9hAs2s3c_QdKd2c7d_Ad6s5d9d_4dTdTh5s_3d8hAhTs() {
    assertEquals(
      "9hAs2s3c 7s6c6dAc 3d8hAhTs 4dTdTh5s 2h4h8s5h QcTcJc7c QdKd2c7d 8c5c9sKc Ad6s5d9d",
      Solver.process("omaha-holdem 4s7h8dJhKs 8c5c9sKc QcTcJc7c 2h4h8s5h 7s6c6dAc 9hAs2s3c QdKd2c7d Ad6s5d9d 4dTdTh5s 3d8hAhTs"));
  }

  @Test
  public void test_omaha_holdem_75_2s5s9sAsTc_AcJh3d5d_KcKs6s5h_2d3sQdTs_Jd2h6d4h_8c8dQcKh_4c2cAdJs_KdJc8h9c_3c7hTh6c() {
    assertEquals(
      "Jd2h6d4h 8c8dQcKh KdJc8h9c 3c7hTh6c 4c2cAdJs AcJh3d5d 2d3sQdTs KcKs6s5h",
      Solver.process("omaha-holdem 2s5s9sAsTc AcJh3d5d KcKs6s5h 2d3sQdTs Jd2h6d4h 8c8dQcKh 4c2cAdJs KdJc8h9c 3c7hTh6c"));
  }

  @Test
  public void test_omaha_holdem_76_2c3h5cJhKs_JcQh6hAc_8c4d6s5d_9h3sJd4s_2dTcQc7d_8d8hAd5h() {
    assertEquals(
      "2dTcQc7d 8d8hAd5h JcQh6hAc 9h3sJd4s 8c4d6s5d",
      Solver.process("omaha-holdem 2c3h5cJhKs JcQh6hAc 8c4d6s5d 9h3sJd4s 2dTcQc7d 8d8hAd5h"));
  }

  @Test
  public void test_omaha_holdem_77_3h3s5hQhTd_3d8d7c9c_Jc6c8hTh_8sTc4s6s_2cKcKs3c_4d8c9dKd_5s6dJdAc() {
    assertEquals(
      "4d8c9dKd 5s6dJdAc 8sTc4s6s 3d8d7c9c 2cKcKs3c Jc6c8hTh",
      Solver.process("omaha-holdem 3h3s5hQhTd 3d8d7c9c Jc6c8hTh 8sTc4s6s 2cKcKs3c 4d8c9dKd 5s6dJdAc"));
  }

  @Test
  public void test_omaha_holdem_78_2s3c5hJcJs_7cQs9s7d_4dTh4sAs_3h8sQd4h_2c7s8hQh() {
    assertEquals(
      "2c7s8hQh 3h8sQd4h 7cQs9s7d 4dTh4sAs",
      Solver.process("omaha-holdem 2s3c5hJcJs 7cQs9s7d 4dTh4sAs 3h8sQd4h 2c7s8hQh"));
  }

  @Test
  public void test_omaha_holdem_79_2s3s5hJdKd_8hAd6dKc_5dQhKs8c_9s7sAcTd_4c6s6c2h_4s6h7d7c_As8dJc3h_3cTsThQd() {
    assertEquals(
      "9s7sAcTd 3cTsThQd 8hAd6dKc As8dJc3h 5dQhKs8c 4c6s6c2h=4s6h7d7c",
      Solver.process("omaha-holdem 2s3s5hJdKd 8hAd6dKc 5dQhKs8c 9s7sAcTd 4c6s6c2h 4s6h7d7c As8dJc3h 3cTsThQd"));
  }

  @Test
  public void test_omaha_holdem_80_3h5c7c7hJc_2c9hJsQc_AcAs6c4h_9sQh2h4s() {
    assertEquals(
      "9sQh2h4s 2c9hJsQc AcAs6c4h",
      Solver.process("omaha-holdem 3h5c7c7hJc 2c9hJsQc AcAs6c4h 9sQh2h4s"));
  }

  @Test
  public void test_omaha_holdem_81_3c4h7hQhTh_7c9c5cKs_TsTcAh6s_6h4c8h4d_Qs9d2c3s_5s7s8d3h_Qd7dTdAc() {
    assertEquals(
      "7c9c5cKs 5s7s8d3h Qs9d2c3s Qd7dTdAc TsTcAh6s 6h4c8h4d",
      Solver.process("omaha-holdem 3c4h7hQhTh 7c9c5cKs TsTcAh6s 6h4c8h4d Qs9d2c3s 5s7s8d3h Qd7dTdAc"));
  }

  @Test
  public void test_omaha_holdem_82_2h4s5d6s8d_5h9sAs2d_8hJc6h5s_TcAh3cKd_Qh9cTd3s_2c9dAdJs_7h7cQdAc() {
    assertEquals(
      "Qh9cTd3s 2c9dAdJs 7h7cQdAc 5h9sAs2d 8hJc6h5s TcAh3cKd",
      Solver.process("omaha-holdem 2h4s5d6s8d 5h9sAs2d 8hJc6h5s TcAh3cKd Qh9cTd3s 2c9dAdJs 7h7cQdAc"));
  }

  @Test
  public void test_omaha_holdem_83_4h5d7cQhTd_Jd7s4s5h_Kd3s3cJh_Th9sQdTc_KhJc8d3d_Ah4dAd9c_6d6c6hQs_4c3h5cJs_6sQc9h8h_9dAsKc2s() {
    assertEquals(
      "KhJc8d3d 9dAsKc2s Kd3s3cJh 6d6c6hQs Ah4dAd9c 4c3h5cJs Jd7s4s5h Th9sQdTc 6sQc9h8h",
      Solver.process("omaha-holdem 4h5d7cQhTd Jd7s4s5h Kd3s3cJh Th9sQdTc KhJc8d3d Ah4dAd9c 6d6c6hQs 4c3h5cJs 6sQc9h8h 9dAsKc2s"));
  }

  @Test
  public void test_omaha_holdem_84_2h4sAhJhKc_6d2s4h3d_3s2cTc5c_4cJsQdJd_6s9d5d9h_As4d9sAd_Th6c7c8s_7h7dQh3h_5h3cAcTs() {
    assertEquals(
      "Th6c7c8s 6s9d5d9h 6d2s4h3d 4cJsQdJd As4d9sAd 3s2cTc5c=5h3cAcTs 7h7dQh3h",
      Solver.process("omaha-holdem 2h4sAhJhKc 6d2s4h3d 3s2cTc5c 4cJsQdJd 6s9d5d9h As4d9sAd Th6c7c8s 7h7dQh3h 5h3cAcTs"));
  }

  @Test
  public void test_omaha_holdem_85_3c4s6h7dAc_8hTs6dQs_8sKs6sKc() {
    assertEquals(
      "8hTs6dQs 8sKs6sKc",
      Solver.process("omaha-holdem 3c4s6h7dAc 8hTs6dQs 8sKs6sKc"));
  }

  @Test
  public void test_omaha_holdem_86_7c7h9sKhTh_5h5c8hTc_Qh6c2hQs_9d3cQd9h_4dJs9cKd() {
    assertEquals(
      "4dJs9cKd 5h5c8hTc Qh6c2hQs 9d3cQd9h",
      Solver.process("omaha-holdem 7c7h9sKhTh 5h5c8hTc Qh6c2hQs 9d3cQd9h 4dJs9cKd"));
  }

  @Test
  public void test_omaha_holdem_87_2h3d9hAhTs_Js4d5hKh_3cAcQcTh_8dTc5c7d_9c6s2cKc_4c3hJcJd_2s7s8cQh_7cQs2d8s_5d5sAs7h() {
    assertEquals(
      "2s7s8cQh=7cQs2d8s 8dTc5c7d 4c3hJcJd 5d5sAs7h 9c6s2cKc 3cAcQcTh Js4d5hKh",
      Solver.process("omaha-holdem 2h3d9hAhTs Js4d5hKh 3cAcQcTh 8dTc5c7d 9c6s2cKc 4c3hJcJd 2s7s8cQh 7cQs2d8s 5d5sAs7h"));
  }

  @Test
  public void test_omaha_holdem_88_5h6h8sKdKh_9s7s5sJd_7d4h3d7c() {
    assertEquals(
      "7d4h3d7c 9s7s5sJd",
      Solver.process("omaha-holdem 5h6h8sKdKh 9s7s5sJd 7d4h3d7c"));
  }

  @Test
  public void test_omaha_holdem_89_3h3s8c8dKh_7dJd5s4s_9s7c5dKs_4c6h2sQs_6s6d4d4h_9h7sAsAc_Js7hTdAd_ThJh2h3d_Qh6c2dQd() {
    assertEquals(
      "7dJd5s4s 4c6h2sQs Js7hTdAd 6s6d4d4h Qh6c2dQd 9s7c5dKs 9h7sAsAc ThJh2h3d",
      Solver.process("omaha-holdem 3h3s8c8dKh 7dJd5s4s 9s7c5dKs 4c6h2sQs 6s6d4d4h 9h7sAsAc Js7hTdAd ThJh2h3d Qh6c2dQd"));
  }

  @Test
  public void test_omaha_holdem_90_3d5c7cJdQd_6dJh4cTh_Ad4d9cKc_Ac8hQh2h_3s4sJs9h_As5dQs6s_3c2c4h8s_7h9sKh6h_TsAhTd2s() {
    assertEquals(
      "3c2c4h8s 7h9sKh6h TsAhTd2s Ac8hQh2h 3s4sJs9h As5dQs6s 6dJh4cTh Ad4d9cKc",
      Solver.process("omaha-holdem 3d5c7cJdQd 6dJh4cTh Ad4d9cKc Ac8hQh2h 3s4sJs9h As5dQs6s 3c2c4h8s 7h9sKh6h TsAhTd2s"));
  }

  @Test
  public void test_omaha_holdem_91_2s8hAcAhQh_QdTs4s5c_5d3dJc2c_2dQs8d9c_7c6d3cTh_AsKc5s8s_6h9d6cQc_2hJdKdTc_KsJs9s7s() {
    assertEquals(
      "7c6d3cTh KsJs9s7s 5d3dJc2c 2hJdKdTc 2dQs8d9c=6h9d6cQc QdTs4s5c AsKc5s8s",
      Solver.process("omaha-holdem 2s8hAcAhQh QdTs4s5c 5d3dJc2c 2dQs8d9c 7c6d3cTh AsKc5s8s 6h9d6cQc 2hJdKdTc KsJs9s7s"));
  }

  @Test
  public void test_omaha_holdem_92_3h4h5c7cAh_Kd2c4c9s_QhKh8hTd_4dAc2d9c_Ts6dTh2s_6s3d6c8d_3s5d8sQd_7dJc8cJs_5sJdAd7h_7s4s9dJh() {
    assertEquals(
      "7dJc8cJs 3s5d8sQd 7s4s9dJh 5sJdAd7h 4dAc2d9c=Kd2c4c9s Ts6dTh2s 6s3d6c8d QhKh8hTd",
      Solver.process("omaha-holdem 3h4h5c7cAh Kd2c4c9s QhKh8hTd 4dAc2d9c Ts6dTh2s 6s3d6c8d 3s5d8sQd 7dJc8cJs 5sJdAd7h 7s4s9dJh"));
  }

  @Test
  public void test_omaha_holdem_93_5d5s6cKdQh_AhTc6hAc_7h8s6s3c_Ks7sJs7d_As9s8cTs_2c3h6d3s_2h2d3d9c_Th4d9h7c_TdAdJhQc() {
    assertEquals(
      "Th4d9h7c As9s8cTs 2h2d3d9c 2c3h6d3s 7h8s6s3c TdAdJhQc Ks7sJs7d AhTc6hAc",
      Solver.process("omaha-holdem 5d5s6cKdQh AhTc6hAc 7h8s6s3c Ks7sJs7d As9s8cTs 2c3h6d3s 2h2d3d9c Th4d9h7c TdAdJhQc"));
  }

  @Test
  public void test_omaha_holdem_94_2h6c7s8s9h_AsAh5sQd_4d2c2sTc_Ts3dJc3s_AcKd9c7h_Kc7cJdQs_QcJh4sJs_7d4c8d6d_Ad9d3cTd_6s8h4hTh() {
    assertEquals(
      "Kc7cJdQs QcJh4sJs AsAh5sQd 7d4c8d6d AcKd9c7h 4d2c2sTc 6s8h4hTh=Ad9d3cTd Ts3dJc3s",
      Solver.process("omaha-holdem 2h6c7s8s9h AsAh5sQd 4d2c2sTc Ts3dJc3s AcKd9c7h Kc7cJdQs QcJh4sJs 7d4c8d6d Ad9d3cTd 6s8h4hTh"));
  }

  @Test
  public void test_omaha_holdem_95_2s5h7hAhKc_Ks3s7d9h_8s9cQd5s_As9sThJd_9d4c5dJh_8c4h3dTs_7cJs7s6h() {
    assertEquals(
      "9d4c5dJh 8s9cQd5s As9sThJd Ks3s7d9h 7cJs7s6h 8c4h3dTs",
      Solver.process("omaha-holdem 2s5h7hAhKc Ks3s7d9h 8s9cQd5s As9sThJd 9d4c5dJh 8c4h3dTs 7cJs7s6h"));
  }

  @Test
  public void test_omaha_holdem_96_7h7s8sAsTc_Qd3d3sKs_8c2h4c6c_4hKcTs6h_Td9hQcAh_2d8h2cQh() {
    assertEquals(
      "8c2h4c6c 2d8h2cQh 4hKcTs6h Td9hQcAh Qd3d3sKs",
      Solver.process("omaha-holdem 7h7s8sAsTc Qd3d3sKs 8c2h4c6c 4hKcTs6h Td9hQcAh 2d8h2cQh"));
  }

  @Test
  public void test_omaha_holdem_97_7h8sAdKcQh_TcJs8d3d_5h9h3sKs_6dQcJcAs_Jh7d6s5c_Qd6c3h9s_Th9d5d4c_QsTs2d3c_4h5s8hKh() {
    assertEquals(
      "Th9d5d4c Jh7d6s5c Qd6c3h9s QsTs2d3c 5h9h3sKs 4h5s8hKh 6dQcJcAs TcJs8d3d",
      Solver.process("omaha-holdem 7h8sAdKcQh TcJs8d3d 5h9h3sKs 6dQcJcAs Jh7d6s5c Qd6c3h9s Th9d5d4c QsTs2d3c 4h5s8hKh"));
  }

  @Test
  public void test_omaha_holdem_98_9dJdJhJsKs_Qd3sJc4h_TdKc8c6h_KhQh7d2c_QsTs9c6d_3h8h8dTc_4d4c3d5d() {
    assertEquals(
      "TdKc8c6h KhQh7d2c QsTs9c6d 4d4c3d5d 3h8h8dTc Qd3sJc4h",
      Solver.process("omaha-holdem 9dJdJhJsKs Qd3sJc4h TdKc8c6h KhQh7d2c QsTs9c6d 3h8h8dTc 4d4c3d5d"));
  }

  @Test
  public void test_omaha_holdem_99_3d5d7c9hJh_2sQd4s7d_8c6s4cAc_AsAdQs4h_8h9s8s6d_JdKc6h7h_8d5h3hTh() {
    assertEquals(
      "2sQd4s7d AsAdQs4h JdKc6h7h 8c6s4cAc=8h9s8s6d 8d5h3hTh",
      Solver.process("omaha-holdem 3d5d7c9hJh 2sQd4s7d 8c6s4cAc AsAdQs4h 8h9s8s6d JdKc6h7h 8d5h3hTh"));
  }

  @Test
  public void test_omaha_holdem_100_2h6d8cJcJs_QdQh3sAd_Qc5c9c3c_Jd6s6h9h() {
    assertEquals(
      "Qc5c9c3c QdQh3sAd Jd6s6h9h",
      Solver.process("omaha-holdem 2h6d8cJcJs QdQh3sAd Qc5c9c3c Jd6s6h9h"));
  }

  @Test
  public void test_omaha_holdem_101_3s6h7h8hTc_4sAcJcTs_Td7sAsKh_Ad2d9c4d_5dKdQs6d_5c8d4h2s() {
    assertEquals(
      "Ad2d9c4d 5dKdQs6d 4sAcJcTs Td7sAsKh 5c8d4h2s",
      Solver.process("omaha-holdem 3s6h7h8hTc 4sAcJcTs Td7sAsKh Ad2d9c4d 5dKdQs6d 5c8d4h2s"));
  }

  @Test
  public void test_omaha_holdem_102_2c6d9hJdKd_3s7sKhJc_Qh7dJh6s_Qc8hAs3c_3dQsKs3h_6c2d7c7h_Js8sAdAc_TdTh4hKc_2h6h5d5s_2sQd5h9c() {
    assertEquals(
      "Qc8hAs3c TdTh4hKc 3dQsKs3h Js8sAdAc 2h6h5d5s=6c2d7c7h 2sQd5h9c Qh7dJh6s 3s7sKhJc",
      Solver.process("omaha-holdem 2c6d9hJdKd 3s7sKhJc Qh7dJh6s Qc8hAs3c 3dQsKs3h 6c2d7c7h Js8sAdAc TdTh4hKc 2h6h5d5s 2sQd5h9c"));
  }

  @Test
  public void test_omaha_holdem_103_2d8cAcQhTs_Ks3cKd9h_4sQsJc5s_9s4c9d2c_8h3s6hAs() {
    assertEquals(
      "9s4c9d2c 4sQsJc5s Ks3cKd9h 8h3s6hAs",
      Solver.process("omaha-holdem 2d8cAcQhTs Ks3cKd9h 4sQsJc5s 9s4c9d2c 8h3s6hAs"));
  }

  @Test
  public void test_omaha_holdem_104_3s4dKsQcTs_4hJdAdTh_2dJc6s8h_3cQhJh8d_4c5d5c8s_2cTd2s7c_Qs3dJs9c_7h4sTc9d() {
    assertEquals(
      "2dJc6s8h 4c5d5c8s 2cTd2s7c 7h4sTc9d 3cQhJh8d 4hJdAdTh Qs3dJs9c",
      Solver.process("omaha-holdem 3s4dKsQcTs 4hJdAdTh 2dJc6s8h 3cQhJh8d 4c5d5c8s 2cTd2s7c Qs3dJs9c 7h4sTc9d"));
  }

  @Test
  public void test_omaha_holdem_105_3c5c9sJsKh_As7s5s4s_3dQd9dQs() {
    assertEquals(
      "As7s5s4s 3dQd9dQs",
      Solver.process("omaha-holdem 3c5c9sJsKh As7s5s4s 3dQd9dQs"));
  }

  @Test
  public void test_omaha_holdem_106_2c4h5h8dAd_7hTd9d9h_7sJdThAs() {
    assertEquals(
      "7hTd9d9h 7sJdThAs",
      Solver.process("omaha-holdem 2c4h5h8dAd 7hTd9d9h 7sJdThAs"));
  }

  @Test
  public void test_omaha_holdem_107_2h3c8s9sQh_Jd3h2s6h_Jh8d7h6s_5d6cAcTs() {
    assertEquals(
      "5d6cAcTs Jh8d7h6s Jd3h2s6h",
      Solver.process("omaha-holdem 2h3c8s9sQh Jd3h2s6h Jh8d7h6s 5d6cAcTs"));
  }

  @Test
  public void test_omaha_holdem_108_3d4d6hAdKd_4c3hJdQd_9h7d7cTs_9d8h2cTc_5sKc4hKs_KhQs5cAh_4s2d6sQh_3c8c2h7s_2sTh5hJs_QcJcJh9c() {
    assertEquals(
      "9d8h2cTc 3c8c2h7s 9h7d7cTs QcJcJh9c 4s2d6sQh KhQs5cAh 5sKc4hKs 2sTh5hJs 4c3hJdQd",
      Solver.process("omaha-holdem 3d4d6hAdKd 4c3hJdQd 9h7d7cTs 9d8h2cTc 5sKc4hKs KhQs5cAh 4s2d6sQh 3c8c2h7s 2sTh5hJs QcJcJh9c"));
  }

  @Test
  public void test_omaha_holdem_109_2d3sKcQhTh_4d9sJh6s_4c4h4s9d() {
    assertEquals(
      "4c4h4s9d 4d9sJh6s",
      Solver.process("omaha-holdem 2d3sKcQhTh 4d9sJh6s 4c4h4s9d"));
  }

  @Test
  public void test_omaha_holdem_110_3c5s7d7sAh_Kd8h4d9h_2h5d7c2c_2sJc6hQh_TcAdKcQc_3d5c9dTd_8c6c6dAc_7hJdKh8d_QsAsJsKs_Qd9cThJh() {
    assertEquals(
      "2sJc6hQh=Qd9cThJh Kd8h4d9h 3d5c9dTd 8c6c6dAc QsAsJsKs=TcAdKcQc 7hJdKh8d 2h5d7c2c",
      Solver.process("omaha-holdem 3c5s7d7sAh Kd8h4d9h 2h5d7c2c 2sJc6hQh TcAdKcQc 3d5c9dTd 8c6c6dAc 7hJdKh8d QsAsJsKs Qd9cThJh"));
  }

  @Test
  public void test_omaha_holdem_111_4h7c9d9hJh_Ts3d3h6c_4dTd7hAs() {
    assertEquals(
      "Ts3d3h6c 4dTd7hAs",
      Solver.process("omaha-holdem 4h7c9d9hJh Ts3d3h6c 4dTd7hAs"));
  }

  @Test
  public void test_omaha_holdem_112_2s3h5d8sAc_Ah8c3sKc_Qs4s2d5c_7h9c6d7s_Qh7d9dJh_3cKhKdJc_6hJd9hTs_4c2h8hTh() {
    assertEquals(
      "6hJd9hTs Qh7d9dJh 7h9c6d7s 3cKhKdJc Ah8c3sKc 4c2h8hTh=Qs4s2d5c",
      Solver.process("omaha-holdem 2s3h5d8sAc Ah8c3sKc Qs4s2d5c 7h9c6d7s Qh7d9dJh 3cKhKdJc 6hJd9hTs 4c2h8hTh"));
  }

  @Test
  public void test_omaha_holdem_113_5d6h9hAcAd_JsQd9sKc_8d7sKdTs_4sAs4c9d() {
    assertEquals(
      "JsQd9sKc 8d7sKdTs 4sAs4c9d",
      Solver.process("omaha-holdem 5d6h9hAcAd JsQd9sKc 8d7sKdTs 4sAs4c9d"));
  }

  @Test
  public void test_omaha_holdem_114_2h7c8h9d9h_KcQs6c4d_2dQh6h6s_3c4cKdAs_5h5cAc4s_9sKs8s2c_QdTdTc5d_7h3h7sJs_Jd5s9c2s() {
    assertEquals(
      "KcQs6c4d 3c4cKdAs 5h5cAc4s QdTdTc5d 2dQh6h6s 7h3h7sJs Jd5s9c2s 9sKs8s2c",
      Solver.process("omaha-holdem 2h7c8h9d9h KcQs6c4d 2dQh6h6s 3c4cKdAs 5h5cAc4s 9sKs8s2c QdTdTc5d 7h3h7sJs Jd5s9c2s"));
  }

  @Test
  public void test_omaha_holdem_115_2s6d8cKsQd_5c6h6s5d_Qc2cAhTc_9dKd3c8s() {
    assertEquals(
      "Qc2cAhTc 9dKd3c8s 5c6h6s5d",
      Solver.process("omaha-holdem 2s6d8cKsQd 5c6h6s5d Qc2cAhTc 9dKd3c8s"));
  }

  @Test
  public void test_omaha_holdem_116_3s9c9dAcKs_4cJcTd4h_JsTs5d7d_5c5sQh2s_QsKhQd2h() {
    assertEquals(
      "JsTs5d7d 4cJcTd4h 5c5sQh2s QsKhQd2h",
      Solver.process("omaha-holdem 3s9c9dAcKs 4cJcTd4h JsTs5d7d 5c5sQh2s QsKhQd2h"));
  }

  @Test
  public void test_omaha_holdem_117_7dJhKhQdTc_8h3cKs7h_4c6h3h5c_5dQc6c5h() {
    assertEquals(
      "4c6h3h5c 5dQc6c5h 8h3cKs7h",
      Solver.process("omaha-holdem 7dJhKhQdTc 8h3cKs7h 4c6h3h5c 5dQc6c5h"));
  }

  @Test
  public void test_omaha_holdem_118_2s3h4h6d9s_6sTdKdQs_7s2hJd5s() {
    assertEquals(
      "6sTdKdQs 7s2hJd5s",
      Solver.process("omaha-holdem 2s3h4h6d9s 6sTdKdQs 7s2hJd5s"));
  }

  @Test
  public void test_omaha_holdem_119_2d3hAhJdTd_3s6cKsKh_8s4s4d7s_5s8hQdQc_3cTcThJc() {
    assertEquals(
      "8s4s4d7s 5s8hQdQc 3s6cKsKh 3cTcThJc",
      Solver.process("omaha-holdem 2d3hAhJdTd 3s6cKsKh 8s4s4d7s 5s8hQdQc 3cTcThJc"));
  }

  @Test
  public void test_omaha_holdem_120_2h3c5s7hKh_5dKc5h3d_8dQd2cTc() {
    assertEquals(
      "8dQd2cTc 5dKc5h3d",
      Solver.process("omaha-holdem 2h3c5s7hKh 5dKc5h3d 8dQd2cTc"));
  }

  @Test
  public void test_omaha_holdem_121_2d4h5d5hQh_Kc6dJsJc_2cAc4d8h_3c7s8dQs_AhThKhAs_7d3d9cTc() {
    assertEquals(
      "7d3d9cTc 2cAc4d8h Kc6dJsJc 3c7s8dQs AhThKhAs",
      Solver.process("omaha-holdem 2d4h5d5hQh Kc6dJsJc 2cAc4d8h 3c7s8dQs AhThKhAs 7d3d9cTc"));
  }

  @Test
  public void test_omaha_holdem_122_5c5s7d7h8c_Ks6c7c2s_3hAc9sTs_AdTc8d3s_JsAs9c3d_Qc5dTdJd_5hThQhKd_6s9dAh7s_Kh4sJh6h() {
    assertEquals(
      "3hAc9sTs JsAs9c3d AdTc8d3s Qc5dTdJd 5hThQhKd Ks6c7c2s Kh4sJh6h 6s9dAh7s",
      Solver.process("omaha-holdem 5c5s7d7h8c Ks6c7c2s 3hAc9sTs AdTc8d3s JsAs9c3d Qc5dTdJd 5hThQhKd 6s9dAh7s Kh4sJh6h"));
  }

  @Test
  public void test_omaha_holdem_123_4d9dJsQsTd_Ah9hJh3s_4c5c4s6s_2h2sQd7c_5hTcTs6d_7h8sJd5d_9c7dKcKs_8cTh8d3c_9s3h4hQh() {
    assertEquals(
      "2h2sQd7c Ah9hJh3s 9s3h4hQh 4c5c4s6s 5hTcTs6d 8cTh8d3c 9c7dKcKs 7h8sJd5d",
      Solver.process("omaha-holdem 4d9dJsQsTd Ah9hJh3s 4c5c4s6s 2h2sQd7c 5hTcTs6d 7h8sJd5d 9c7dKcKs 8cTh8d3c 9s3h4hQh"));
  }

  @Test
  public void test_omaha_holdem_124_2d2h9dAcTc_Td4h5dKd_6dQs4cAs_Qd8h6s3d_4sKh9h3s_Ah9c4d5s_JhAd3cTs_Jd5c6c7h_8dKcJsKs() {
    assertEquals(
      "Jd5c6c7h Qd8h6s3d 4sKh9h3s Td4h5dKd 8dKcJsKs 6dQs4cAs Ah9c4d5s JhAd3cTs",
      Solver.process("omaha-holdem 2d2h9dAcTc Td4h5dKd 6dQs4cAs Qd8h6s3d 4sKh9h3s Ah9c4d5s JhAd3cTs Jd5c6c7h 8dKcJsKs"));
  }

  @Test
  public void test_omaha_holdem_125_4h6c8hJcTs_9s8dThKc_3s6s8cJd_4s5cAd2s_3h5s9c5d() {
    assertEquals(
      "4s5cAd2s 3h5s9c5d 9s8dThKc 3s6s8cJd",
      Solver.process("omaha-holdem 4h6c8hJcTs 9s8dThKc 3s6s8cJd 4s5cAd2s 3h5s9c5d"));
  }

  @Test
  public void test_omaha_holdem_126_6d7d9dAsJc_Td2hTs3h_Ad8d4c7c_9s2s6c3c() {
    assertEquals(
      "Td2hTs3h 9s2s6c3c Ad8d4c7c",
      Solver.process("omaha-holdem 6d7d9dAsJc Td2hTs3h Ad8d4c7c 9s2s6c3c"));
  }

  @Test
  public void test_omaha_holdem_127_2d2s8cKsTs_3dJhKdAd_7d3c2c4h_3hKc5sTh_Kh9s2h7h_5d8d6h5h_JcQdTdTc_8s5c4d6c_Qc6s9h6d_AsJdAhJs() {
    assertEquals(
      "Qc6s9h6d 5d8d6h5h=8s5c4d6c 3dJhKdAd 3hKc5sTh 7d3c2c4h AsJdAhJs Kh9s2h7h JcQdTdTc",
      Solver.process("omaha-holdem 2d2s8cKsTs 3dJhKdAd 7d3c2c4h 3hKc5sTh Kh9s2h7h 5d8d6h5h JcQdTdTc 8s5c4d6c Qc6s9h6d AsJdAhJs"));
  }

  @Test
  public void test_omaha_holdem_128_2d3s9cKcQd_Kd7c2h9s_8s4dAsKs_5dAd4c6s_4s6hAcTh_8c6cQc6d() {
    assertEquals(
      "5dAd4c6s 4s6hAcTh 8c6cQc6d 8s4dAsKs Kd7c2h9s",
      Solver.process("omaha-holdem 2d3s9cKcQd Kd7c2h9s 8s4dAsKs 5dAd4c6s 4s6hAcTh 8c6cQc6d"));
  }

  @Test
  public void test_omaha_holdem_129_3d3h6s7cTh_QdAd8cTs_Qs7d2c5c_Kc6c9c2d_2s9s4s5s_9h7sAs2h_JsKd8h3c_Qc6hAh5h_Tc4d8dKs_8s3sJhAc() {
    assertEquals(
      "Kc6c9c2d Qc6hAh5h Qs7d2c5c 9h7sAs2h Tc4d8dKs QdAd8cTs JsKd8h3c 8s3sJhAc 2s9s4s5s",
      Solver.process("omaha-holdem 3d3h6s7cTh QdAd8cTs Qs7d2c5c Kc6c9c2d 2s9s4s5s 9h7sAs2h JsKd8h3c Qc6hAh5h Tc4d8dKs 8s3sJhAc"));
  }

  @Test
  public void test_omaha_holdem_130_5sAsJcKdQd_AcKh8h7d_2sTd3c2c_8dJh3sQs_4s7c7hAh_4d7s6c3h_TsJd6s9c_8c9hAd5c_QcKs4c9d_6h6d4h5h() {
    assertEquals(
      "4d7s6c3h 2sTd3c2c 6h6d4h5h 4s7c7hAh 8dJh3sQs QcKs4c9d 8c9hAd5c AcKh8h7d TsJd6s9c",
      Solver.process("omaha-holdem 5sAsJcKdQd AcKh8h7d 2sTd3c2c 8dJh3sQs 4s7c7hAh 4d7s6c3h TsJd6s9c 8c9hAd5c QcKs4c9d 6h6d4h5h"));
  }

  @Test
  public void test_omaha_holdem_131_3d6c6dJdTc_9dQdAd8d_4dKd8h2s() {
    assertEquals(
      "4dKd8h2s 9dQdAd8d",
      Solver.process("omaha-holdem 3d6c6dJdTc 9dQdAd8d 4dKd8h2s"));
  }

  @Test
  public void test_omaha_holdem_132_7dAsKhKsQh_3c7hQc8c_QdKdJdKc_AcJc8s6d() {
    assertEquals(
      "3c7hQc8c AcJc8s6d QdKdJdKc",
      Solver.process("omaha-holdem 7dAsKhKsQh 3c7hQc8c QdKdJdKc AcJc8s6d"));
  }

  @Test
  public void test_omaha_holdem_133_2d3s5d7h8d_7sJhJd6c_AcTcQd3h_9d5sQc4d_KhKc2h7d_7c3dJsTh() {
    assertEquals(
      "AcTcQd3h 7sJhJd6c KhKc2h7d 7c3dJsTh 9d5sQc4d",
      Solver.process("omaha-holdem 2d3s5d7h8d 7sJhJd6c AcTcQd3h 9d5sQc4d KhKc2h7d 7c3dJsTh"));
  }

  @Test
  public void test_omaha_holdem_134_4c6c7c9sQs_8h5hKh5s_7dQh2sAd() {
    assertEquals(
      "7dQh2sAd 8h5hKh5s",
      Solver.process("omaha-holdem 4c6c7c9sQs 8h5hKh5s 7dQh2sAd"));
  }

  @Test
  public void test_omaha_holdem_135_2c4d6c8h9s_KhThJs8s_5s3h3c6s_8c9h9d5h() {
    assertEquals(
      "KhThJs8s 8c9h9d5h 5s3h3c6s",
      Solver.process("omaha-holdem 2c4d6c8h9s KhThJs8s 5s3h3c6s 8c9h9d5h"));
  }

  @Test
  public void test_omaha_holdem_136_4h5c9c9dJd_5sJh8h3c_Qc6cThKh_6d2h4dAd() {
    assertEquals(
      "Qc6cThKh 6d2h4dAd 5sJh8h3c",
      Solver.process("omaha-holdem 4h5c9c9dJd 5sJh8h3c Qc6cThKh 6d2h4dAd"));
  }

  @Test
  public void test_omaha_holdem_137_2s4s5d7cTh_Ah4c9hTs_KcJsTd6c_Qs8cTc8d_8sJh3h2h_KsAsQh3d_5cJc3c5s_6h3s9s5h_QcKd7d6d() {
    assertEquals(
      "8sJh3h2h QcKd7d6d Qs8cTc8d KcJsTd6c Ah4c9hTs 5cJc3c5s KsAsQh3d 6h3s9s5h",
      Solver.process("omaha-holdem 2s4s5d7cTh Ah4c9hTs KcJsTd6c Qs8cTc8d 8sJh3h2h KsAsQh3d 5cJc3c5s 6h3s9s5h QcKd7d6d"));
  }

  @Test
  public void test_omaha_holdem_138_3c4c6c8hJd_Kc4d6h2c_5sQd4sQs_8s8d9h7d_Ah9d4hQh_2hThTd6d_AsKh2d3d_TcTs8c5d() {
    assertEquals(
      "AsKh2d3d Ah9d4hQh 2hThTd6d 5sQd4sQs 8s8d9h7d TcTs8c5d Kc4d6h2c",
      Solver.process("omaha-holdem 3c4c6c8hJd Kc4d6h2c 5sQd4sQs 8s8d9h7d Ah9d4hQh 2hThTd6d AsKh2d3d TcTs8c5d"));
  }

  @Test
  public void test_omaha_holdem_139_3sKhQdTcTd_3h7h6h7s_9dKcQcJs_2hQs5c6s_As8c6c7d_4hAh2s6d_4d7c4s8h() {
    assertEquals(
      "4hAh2s6d As8c6c7d 4d7c4s8h 3h7h6h7s 2hQs5c6s 9dKcQcJs",
      Solver.process("omaha-holdem 3sKhQdTcTd 3h7h6h7s 9dKcQcJs 2hQs5c6s As8c6c7d 4hAh2s6d 4d7c4s8h"));
  }

  @Test
  public void test_omaha_holdem_140_2h2s3c9hQd_Qh4s7dQs_8h2d8d6h_Jd4d9s6s_7sAhKh4h_7c5d3dAc_Td3h5s9c_2cKdAs6d_TcQcAd4c_5c5h6cJh() {
    assertEquals(
      "7sAhKh4h 7c5d3dAc 5c5h6cJh Jd4d9s6s Td3h5s9c TcQcAd4c 8h2d8d6h 2cKdAs6d Qh4s7dQs",
      Solver.process("omaha-holdem 2h2s3c9hQd Qh4s7dQs 8h2d8d6h Jd4d9s6s 7sAhKh4h 7c5d3dAc Td3h5s9c 2cKdAs6d TcQcAd4c 5c5h6cJh"));
  }

  @Test
  public void test_omaha_holdem_141_4c5d5h6sAc_2cKhAh6d_7s9sTc7d_9hKd9dQs_4dTh6c8h_3c2h3dAs() {
    assertEquals(
      "4dTh6c8h 7s9sTc7d 9hKd9dQs 2cKhAh6d 3c2h3dAs",
      Solver.process("omaha-holdem 4c5d5h6sAc 2cKhAh6d 7s9sTc7d 9hKd9dQs 4dTh6c8h 3c2h3dAs"));
  }

  @Test
  public void test_omaha_holdem_142_3d5c9d9sTd_8hQh8d4c_8s9c2dQs_7d3cKhAd() {
    assertEquals(
      "8hQh8d4c 8s9c2dQs 7d3cKhAd",
      Solver.process("omaha-holdem 3d5c9d9sTd 8hQh8d4c 8s9c2dQs 7d3cKhAd"));
  }

  @Test
  public void test_omaha_holdem_143_2s6d7dQsTd_7hAc6s4s_2d7c8h9c_2c5c6h4h() {
    assertEquals(
      "2c5c6h4h 7hAc6s4s 2d7c8h9c",
      Solver.process("omaha-holdem 2s6d7dQsTd 7hAc6s4s 2d7c8h9c 2c5c6h4h"));
  }

  @Test
  public void test_omaha_holdem_144_2s4c5s7c8c_2dTd6s6d_3d7dJc7h_5cJdQc2c() {
    assertEquals(
      "2dTd6s6d 3d7dJc7h 5cJdQc2c",
      Solver.process("omaha-holdem 2s4c5s7c8c 2dTd6s6d 3d7dJc7h 5cJdQc2c"));
  }

  @Test
  public void test_omaha_holdem_145_5c5h5s7s8h_4hKs4sQs_Ac8cJd9h_Th4cTcKc() {
    assertEquals(
      "Ac8cJd9h 4hKs4sQs Th4cTcKc",
      Solver.process("omaha-holdem 5c5h5s7s8h 4hKs4sQs Ac8cJd9h Th4cTcKc"));
  }

  @Test
  public void test_omaha_holdem_146_6h9c9sAsTh_8d8c5sQd_2h8h9hKc() {
    assertEquals(
      "8d8c5sQd 2h8h9hKc",
      Solver.process("omaha-holdem 6h9c9sAsTh 8d8c5sQd 2h8h9hKc"));
  }

  @Test
  public void test_omaha_holdem_147_5c5d8c9hKs_7sTs6dTd_Ad6s4s2s_5s4hQh6h_Jd5hJhAc_8hThKcQs_Kh2cAs4d() {
    assertEquals(
      "Ad6s4s2s Kh2cAs4d 8hThKcQs 5s4hQh6h Jd5hJhAc 7sTs6dTd",
      Solver.process("omaha-holdem 5c5d8c9hKs 7sTs6dTd Ad6s4s2s 5s4hQh6h Jd5hJhAc 8hThKcQs Kh2cAs4d"));
  }

  @Test
  public void test_omaha_holdem_148_5h6cAcKcQh_2sJc3dAh_7d8dKd9d_JdJhAd6h_TdTs5cKh() {
    assertEquals(
      "7d8dKd9d 2sJc3dAh TdTs5cKh JdJhAd6h",
      Solver.process("omaha-holdem 5h6cAcKcQh 2sJc3dAh 7d8dKd9d JdJhAd6h TdTs5cKh"));
  }

  @Test
  public void test_omaha_holdem_149_AcJhJsKsQd_JcKc2s9d_5s7sQs2c_9s2hAd9c_Ah6c3c4d_4hKdTd3d_7d9h8d4s_Qc8s5h4c_Qh3h7c6h_8cTcAs7h() {
    assertEquals(
      "7d9h8d4s 5s7sQs2c=Qh3h7c6h Qc8s5h4c Ah6c3c4d 9s2hAd9c 4hKdTd3d=8cTcAs7h JcKc2s9d",
      Solver.process("omaha-holdem AcJhJsKsQd JcKc2s9d 5s7sQs2c 9s2hAd9c Ah6c3c4d 4hKdTd3d 7d9h8d4s Qc8s5h4c Qh3h7c6h 8cTcAs7h"));
  }

  @Test
  public void test_omaha_holdem_150_4d5c8sKcTd_7s8h7h7d_QhJdKh6s_9c3h3d2s() {
    assertEquals(
      "9c3h3d2s 7s8h7h7d QhJdKh6s",
      Solver.process("omaha-holdem 4d5c8sKcTd 7s8h7h7d QhJdKh6s 9c3h3d2s"));
  }

  @Test
  public void test_omaha_holdem_151_5d6dJcJdQs_ThKd4cJs_QcTd5sAc_AhAsTc5h() {
    assertEquals(
      "QcTd5sAc AhAsTc5h ThKd4cJs",
      Solver.process("omaha-holdem 5d6dJcJdQs ThKd4cJs QcTd5sAc AhAsTc5h"));
  }

  @Test
  public void test_omaha_holdem_152_2c2sJdJsKc_AsTs8d9s_5dKd3cTd_Ah9h5s5c_4dAc4s9c_Qc6cKh8c() {
    assertEquals(
      "AsTs8d9s 4dAc4s9c Ah9h5s5c 5dKd3cTd Qc6cKh8c",
      Solver.process("omaha-holdem 2c2sJdJsKc AsTs8d9s 5dKd3cTd Ah9h5s5c 4dAc4s9c Qc6cKh8c"));
  }

  @Test
  public void test_omaha_holdem_153_2d3c5s8d8h_KsAsJs9d_6dTs9sQh_6cKcAcAh() {
    assertEquals(
      "6dTs9sQh KsAsJs9d 6cKcAcAh",
      Solver.process("omaha-holdem 2d3c5s8d8h KsAsJs9d 6dTs9sQh 6cKcAcAh"));
  }

  @Test
  public void test_omaha_holdem_154_6d8d8sAsKh_5dTdJs7d_4hQsAc7s() {
    assertEquals(
      "5dTdJs7d 4hQsAc7s",
      Solver.process("omaha-holdem 6d8d8sAsKh 5dTdJs7d 4hQsAc7s"));
  }

  @Test
  public void test_omaha_holdem_155_3d4d6c9hAs_ThKdTs3h_Td4cKh5h_8c9d4s8d_KcTcKs6d_8h6sAdQd_5c4hJs9c_5dAc2s2d() {
    assertEquals(
      "Td4cKh5h ThKdTs3h KcTcKs6d 5c4hJs9c=8c9d4s8d 8h6sAdQd 5dAc2s2d",
      Solver.process("omaha-holdem 3d4d6c9hAs ThKdTs3h Td4cKh5h 8c9d4s8d KcTcKs6d 8h6sAdQd 5c4hJs9c 5dAc2s2d"));
  }

  @Test
  public void test_omaha_holdem_156_2s3d4c8sTc_Ks8c6c9c_Ts3s3cKc() {
    assertEquals(
      "Ks8c6c9c Ts3s3cKc",
      Solver.process("omaha-holdem 2s3d4c8sTc Ks8c6c9c Ts3s3cKc"));
  }

  @Test
  public void test_omaha_holdem_157_3h4s7hQhTh_Ah9s3d8h_7d5d4d5s_2d6c5cJh_Kh2cKs7c_JdAdAsQc_Kd2h6h9h() {
    assertEquals(
      "Kh2cKs7c JdAdAsQc 7d5d4d5s 2d6c5cJh Kd2h6h9h Ah9s3d8h",
      Solver.process("omaha-holdem 3h4s7hQhTh Ah9s3d8h 7d5d4d5s 2d6c5cJh Kh2cKs7c JdAdAsQc Kd2h6h9h"));
  }

  @Test
  public void test_omaha_holdem_158_2c3c4h7h9h_7s5c2h4d_Jc9sQhKs_Th2d5h3d_QdTcAc6s_KcAd5s3h_KdKh4c6h() {
    assertEquals(
      "QdTcAc6s Jc9sQhKs 7s5c2h4d KcAd5s3h Th2d5h3d KdKh4c6h",
      Solver.process("omaha-holdem 2c3c4h7h9h 7s5c2h4d Jc9sQhKs Th2d5h3d QdTcAc6s KcAd5s3h KdKh4c6h"));
  }

  @Test
  public void test_omaha_holdem_159_3h3s4h5s8d_7c2sQs5h_Jc8c2cTd_2d7d6s9h_KhKsThTc_Ac6d8hKd_AdAhQd7h_5d4s2hJh() {
    assertEquals(
      "7c2sQs5h 5d4s2hJh Jc8c2cTd Ac6d8hKd KhKsThTc AdAhQd7h 2d7d6s9h",
      Solver.process("omaha-holdem 3h3s4h5s8d 7c2sQs5h Jc8c2cTd 2d7d6s9h KhKsThTc Ac6d8hKd AdAhQd7h 5d4s2hJh"));
  }

  @Test
  public void test_omaha_holdem_160_2h4hAhQhTc_6c4s3dJc_8s7sKcQd_2s7hJdJh_9d5cKd9c_Ad4c9h9s_AcAs7d2d() {
    assertEquals(
      "6c4s3dJc 9d5cKd9c 8s7sKcQd Ad4c9h9s AcAs7d2d 2s7hJdJh",
      Solver.process("omaha-holdem 2h4hAhQhTc 6c4s3dJc 8s7sKcQd 2s7hJdJh 9d5cKd9c Ad4c9h9s AcAs7d2d"));
  }

  @Test
  public void test_omaha_holdem_161_4h6s7s8cKh_Kc5c9h3h_TdQhTh7h_5hJs2s4s_7dJc8hJd_4d9d3c6h() {
    assertEquals(
      "TdQhTh7h 4d9d3c6h 7dJc8hJd 5hJs2s4s Kc5c9h3h",
      Solver.process("omaha-holdem 4h6s7s8cKh Kc5c9h3h TdQhTh7h 5hJs2s4s 7dJc8hJd 4d9d3c6h"));
  }

  @Test
  public void test_omaha_holdem_162_4d8h8s9sTd_3hJdAd4h_Tc9dKhQc_5d2c5c9c_6h5h3s8c_Ah6s4cQh_8d7c3d3c_7h2dTsKs() {
    assertEquals(
      "3hJdAd4h=Ah6s4cQh 5d2c5c9c 7h2dTsKs Tc9dKhQc 6h5h3s8c 8d7c3d3c",
      Solver.process("omaha-holdem 4d8h8s9sTd 3hJdAd4h Tc9dKhQc 5d2c5c9c 6h5h3s8c Ah6s4cQh 8d7c3d3c 7h2dTsKs"));
  }

  @Test
  public void test_omaha_holdem_163_2h7h8hQsTs_5h3s3dQc_2s4dAs7c_2d9h7sAh() {
    assertEquals(
      "5h3s3dQc 2s4dAs7c 2d9h7sAh",
      Solver.process("omaha-holdem 2h7h8hQsTs 5h3s3dQc 2s4dAs7c 2d9h7sAh"));
  }

  @Test
  public void test_omaha_holdem_164_2h7s9sJcJd_2d7h6h2s_6dQsQc3h_3c3s5s7d_Ts5c5dAs_Kc4hKsAd() {
    assertEquals(
      "Ts5c5dAs 3c3s5s7d 6dQsQc3h Kc4hKsAd 2d7h6h2s",
      Solver.process("omaha-holdem 2h7s9sJcJd 2d7h6h2s 6dQsQc3h 3c3s5s7d Ts5c5dAs Kc4hKsAd"));
  }

  @Test
  public void test_omaha_holdem_165_3h3s4cQdQh_Qc4hKs9d_7s7c7hKd_5d3dTdKh_AsKc6cJh_6sAcJc9s_2d5c4d3c_2h8h5hTs_6dThAh5s_9cTcAd8s() {
    assertEquals(
      "2h8h5hTs 6dThAh5s=9cTcAd8s 6sAcJc9s AsKc6cJh 7s7c7hKd 5d3dTdKh 2d5c4d3c Qc4hKs9d",
      Solver.process("omaha-holdem 3h3s4cQdQh Qc4hKs9d 7s7c7hKd 5d3dTdKh AsKc6cJh 6sAcJc9s 2d5c4d3c 2h8h5hTs 6dThAh5s 9cTcAd8s"));
  }

  @Test
  public void test_omaha_holdem_166_2d5d8dTdTh_Ac7h9hQc_3c8s2c7c_9dAh4sJd() {
    assertEquals(
      "Ac7h9hQc 3c8s2c7c 9dAh4sJd",
      Solver.process("omaha-holdem 2d5d8dTdTh Ac7h9hQc 3c8s2c7c 9dAh4sJd"));
  }

  @Test
  public void test_omaha_holdem_167_2s3s8d9sJs_3h7h8hTh_6cKd6s8c_AcJc9cKh_3cQs2d4c_Qh4hQdAd() {
    assertEquals(
      "6cKd6s8c Qh4hQdAd 3cQs2d4c AcJc9cKh 3h7h8hTh",
      Solver.process("omaha-holdem 2s3s8d9sJs 3h7h8hTh 6cKd6s8c AcJc9cKh 3cQs2d4c Qh4hQdAd"));
  }

  @Test
  public void test_omaha_holdem_168_2d3c5d6h8s_ThQc6sKc_7c6dQd2c_4hAd9c4s() {
    assertEquals(
      "ThQc6sKc 7c6dQd2c 4hAd9c4s",
      Solver.process("omaha-holdem 2d3c5d6h8s ThQc6sKc 7c6dQd2c 4hAd9c4s"));
  }

  @Test
  public void test_omaha_holdem_169_2s6h6s9cAd_6cAh4hQc_3s5s2c6d_4c8d7c2h_7sJdQdKs_Ac7dJs9s_3hJcKdTd_9dJh5dKc_3d8h8c7h_AsQhQsTs() {
    assertEquals(
      "3hJcKdTd 7sJdQdKs 4c8d7c2h 3d8h8c7h 9dJh5dKc AsQhQsTs Ac7dJs9s 3s5s2c6d 6cAh4hQc",
      Solver.process("omaha-holdem 2s6h6s9cAd 6cAh4hQc 3s5s2c6d 4c8d7c2h 7sJdQdKs Ac7dJs9s 3hJcKdTd 9dJh5dKc 3d8h8c7h AsQhQsTs"));
  }

  @Test
  public void test_omaha_holdem_170_3s6c6d7sTs_3c4dKs9d_Ad3h9h8s_Js7d3d9s_5dAsTd8h_Kd2d4s5c_9cTcQh6s_8dKcJcAh_6hJd4hQd() {
    assertEquals(
      "8dKcJcAh 3c4dKs9d 5dAsTd8h 6hJd4hQd Kd2d4s5c Ad3h9h8s Js7d3d9s 9cTcQh6s",
      Solver.process("omaha-holdem 3s6c6d7sTs 3c4dKs9d Ad3h9h8s Js7d3d9s 5dAsTd8h Kd2d4s5c 9cTcQh6s 8dKcJcAh 6hJd4hQd"));
  }

  @Test
  public void test_omaha_holdem_171_7cAcJsTcTh_Jh8sJc6s_Kd8c9c3s_Td9h5d8h_Jd8d2dKh_9sAsKs3d_9dKc4h6d() {
    assertEquals(
      "9dKc4h6d Jd8d2dKh 9sAsKs3d Td9h5d8h Kd8c9c3s Jh8sJc6s",
      Solver.process("omaha-holdem 7cAcJsTcTh Jh8sJc6s Kd8c9c3s Td9h5d8h Jd8d2dKh 9sAsKs3d 9dKc4h6d"));
  }

  @Test
  public void test_omaha_holdem_172_3c6dAcJdKh_Th8d7c6c_3hQh2h7s_2d4hTd5d_Qd8hJcQc() {
    assertEquals(
      "2d4hTd5d 3hQh2h7s Th8d7c6c Qd8hJcQc",
      Solver.process("omaha-holdem 3c6dAcJdKh Th8d7c6c 3hQh2h7s 2d4hTd5d Qd8hJcQc"));
  }

  @Test
  public void test_omaha_holdem_173_3s4h5cKhTd_5d4cKcKd_7s8h8dTs() {
    assertEquals(
      "7s8h8dTs 5d4cKcKd",
      Solver.process("omaha-holdem 3s4h5cKhTd 5d4cKcKd 7s8h8dTs"));
  }

  @Test
  public void test_omaha_holdem_174_5h7c7s9sJc_4dAc3cJs_AdQcQsQh_2c2h2s9d_Tc9cJh7d_8sThAh8h_4cAsKc6s() {
    assertEquals(
      "4cAsKc6s 2c2h2s9d 4dAc3cJs AdQcQsQh 8sThAh8h Tc9cJh7d",
      Solver.process("omaha-holdem 5h7c7s9sJc 4dAc3cJs AdQcQsQh 2c2h2s9d Tc9cJh7d 8sThAh8h 4cAsKc6s"));
  }

  @Test
  public void test_omaha_holdem_175_4h4s6c9cAh_5s7dKs3s_TsJdTdAs_6s2d8cTc() {
    assertEquals(
      "5s7dKs3s 6s2d8cTc TsJdTdAs",
      Solver.process("omaha-holdem 4h4s6c9cAh 5s7dKs3s TsJdTdAs 6s2d8cTc"));
  }

  @Test
  public void test_omaha_holdem_176_2c6h9cKsTh_6sTsJs9s_7h5dAc5s_7d6cQs2h_AhAdQcKd_QdJc2s5c_Kc4d3c8d_8c5hQh7c_KhTd3d8h() {
    assertEquals(
      "7h5dAc5s Kc4d3c8d AhAdQcKd 7d6cQs2h 6sTsJs9s KhTd3d8h 8c5hQh7c QdJc2s5c",
      Solver.process("omaha-holdem 2c6h9cKsTh 6sTsJs9s 7h5dAc5s 7d6cQs2h AhAdQcKd QdJc2s5c Kc4d3c8d 8c5hQh7c KhTd3d8h"));
  }

  @Test
  public void test_omaha_holdem_177_5h5s6h9sQs_2hQh6sJs_QdKs9d7s_AdAs2c7h_3sJhTd7c_Jd4c5c8s_Kd3dJc3c() {
    assertEquals(
      "3sJhTd7c Kd3dJc3c AdAs2c7h Jd4c5c8s 2hQh6sJs QdKs9d7s",
      Solver.process("omaha-holdem 5h5s6h9sQs 2hQh6sJs QdKs9d7s AdAs2c7h 3sJhTd7c Jd4c5c8s Kd3dJc3c"));
  }

  @Test
  public void test_omaha_holdem_178_3sJcJsKhQh_2s8h8dAs_QsAh7h8c_2h4d9d3d_4s5dQd3c_6h5cTd6c() {
    assertEquals(
      "2h4d9d3d 6h5cTd6c 2s8h8dAs 4s5dQd3c QsAh7h8c",
      Solver.process("omaha-holdem 3sJcJsKhQh 2s8h8dAs QsAh7h8c 2h4d9d3d 4s5dQd3c 6h5cTd6c"));
  }

  @Test
  public void test_omaha_holdem_179_2s3c5s6dJh_KdAs4c2h_7c5c8hAc() {
    assertEquals(
      "7c5c8hAc KdAs4c2h",
      Solver.process("omaha-holdem 2s3c5s6dJh KdAs4c2h 7c5c8hAc"));
  }

  @Test
  public void test_omaha_holdem_180_4c4d5cJcJs_9cTd3sQh_3c9d3d7c_7dTcAh6s_Jd5s2c2s() {
    assertEquals(
      "9cTd3sQh 7dTcAh6s 3c9d3d7c Jd5s2c2s",
      Solver.process("omaha-holdem 4c4d5cJcJs 9cTd3sQh 3c9d3d7c 7dTcAh6s Jd5s2c2s"));
  }

  @Test
  public void test_omaha_holdem_181_3s4d6cKcTc_6hAs9c9h_Jd8h8sAd_4s5hTs6d_KdJh2s5c_Ks5d7cTh_2dQh2c9s() {
    assertEquals(
      "2dQh2c9s Jd8h8sAd 6hAs9c9h 4s5hTs6d KdJh2s5c Ks5d7cTh",
      Solver.process("omaha-holdem 3s4d6cKcTc 6hAs9c9h Jd8h8sAd 4s5hTs6d KdJh2s5c Ks5d7cTh 2dQh2c9s"));
  }

  @Test
  public void test_omaha_holdem_182_7d7s9hAsJc_9s8h6sQs_KdJd8cJh_AhQcTdAd_2d5cKc2s_5h6h2c4d_9dKs4s2h_Kh7h8d9c() {
    assertEquals(
      "5h6h2c4d 2d5cKc2s 9s8h6sQs 9dKs4s2h Kh7h8d9c KdJd8cJh AhQcTdAd",
      Solver.process("omaha-holdem 7d7s9hAsJc 9s8h6sQs KdJd8cJh AhQcTdAd 2d5cKc2s 5h6h2c4d 9dKs4s2h Kh7h8d9c"));
  }

  @Test
  public void test_omaha_holdem_183_3s7h7s8hQh_8sKs6d5h_2cJcTd2s_5c5s5d9d_QcKh9hTh_8d2h6c2d_Ad3d9s4d_JhTcKc4h_7c7d8cQs() {
    assertEquals(
      "2cJcTd2s Ad3d9s4d 5c5s5d9d 8d2h6c2d 8sKs6d5h JhTcKc4h QcKh9hTh 7c7d8cQs",
      Solver.process("omaha-holdem 3s7h7s8hQh 8sKs6d5h 2cJcTd2s 5c5s5d9d QcKh9hTh 8d2h6c2d Ad3d9s4d JhTcKc4h 7c7d8cQs"));
  }

  @Test
  public void test_omaha_holdem_184_2h4c5s8d9s_6c7h6sKc_8c9hAsKs_Ah3cTd3h_2s2dQd4h_JcTcTs6d_Ad6hKhJd() {
    assertEquals(
      "Ad6hKhJd JcTcTs6d 8c9hAsKs 2s2dQd4h Ah3cTd3h 6c7h6sKc",
      Solver.process("omaha-holdem 2h4c5s8d9s 6c7h6sKc 8c9hAsKs Ah3cTd3h 2s2dQd4h JcTcTs6d Ad6hKhJd"));
  }

  @Test
  public void test_omaha_holdem_185_3s9cAsQdQs_5d7d9d6c_6h5sThKs_2cAh3c5c_Jd5h7hTc() {
    assertEquals(
      "Jd5h7hTc 5d7d9d6c 2cAh3c5c 6h5sThKs",
      Solver.process("omaha-holdem 3s9cAsQdQs 5d7d9d6c 6h5sThKs 2cAh3c5c Jd5h7hTc"));
  }

  @Test
  public void test_omaha_holdem_186_9hJsQdTdTs_4d7s2h7c_9dKc5cJh_5h3s2s9c_5d4hAc7h_8c3hKd6d() {
    assertEquals(
      "8c3hKd6d 5d4hAc7h 4d7s2h7c 5h3s2s9c 9dKc5cJh",
      Solver.process("omaha-holdem 9hJsQdTdTs 4d7s2h7c 9dKc5cJh 5h3s2s9c 5d4hAc7h 8c3hKd6d"));
  }

  @Test
  public void test_omaha_holdem_187_6h7sJcJhKs_QhTdQsQc_2s9c4c9d_3dTs4d8d_8s3s9hAd_7h7cAs5s_9s6cAhJs_8h7dJdKd_6d3hTc5c_Kc2cKhAc() {
    assertEquals(
      "3dTs4d8d 8s3s9hAd 6d3hTc5c 2s9c4c9d QhTdQsQc 7h7cAs5s 9s6cAhJs 8h7dJdKd Kc2cKhAc",
      Solver.process("omaha-holdem 6h7sJcJhKs QhTdQsQc 2s9c4c9d 3dTs4d8d 8s3s9hAd 7h7cAs5s 9s6cAhJs 8h7dJdKd 6d3hTc5c Kc2cKhAc"));
  }

  @Test
  public void test_omaha_holdem_188_6c7h7sKsTd_8s6sTcJs_Ah5c4s4d_QsJh3h9h_Kd9c5h6h_JcAcTh5s() {
    assertEquals(
      "QsJh3h9h Ah5c4s4d 8s6sTcJs JcAcTh5s Kd9c5h6h",
      Solver.process("omaha-holdem 6c7h7sKsTd 8s6sTcJs Ah5c4s4d QsJh3h9h Kd9c5h6h JcAcTh5s"));
  }

  @Test
  public void test_omaha_holdem_189_7hAhAsKcQd_Qs2hKd7d_9s3h2sQc_6h4s8cJs_4h7c7s9d_2c4dTs6s_TdAc5s9c_Ad5dTcJc_8s2d4c8h_5cJh3dKh() {
    assertEquals(
      "2c4dTs6s 6h4s8cJs 8s2d4c8h 9s3h2sQc 5cJh3dKh Qs2hKd7d TdAc5s9c Ad5dTcJc 4h7c7s9d",
      Solver.process("omaha-holdem 7hAhAsKcQd Qs2hKd7d 9s3h2sQc 6h4s8cJs 4h7c7s9d 2c4dTs6s TdAc5s9c Ad5dTcJc 8s2d4c8h 5cJh3dKh"));
  }

  @Test
  public void test_omaha_holdem_190_6d6h9sJsQc_3c3s9d5s_Ac6sQhKh_8cThKsKd_8s4dTcAd_2sTs7h8h_Jc2hJd5d_5c4hTd3d_9cQd6cAs() {
    assertEquals(
      "5c4hTd3d 3c3s9d5s 2sTs7h8h=8s4dTcAd 8cThKsKd 9cQd6cAs=Ac6sQhKh Jc2hJd5d",
      Solver.process("omaha-holdem 6d6h9sJsQc 3c3s9d5s Ac6sQhKh 8cThKsKd 8s4dTcAd 2sTs7h8h Jc2hJd5d 5c4hTd3d 9cQd6cAs"));
  }

  @Test
  public void test_omaha_holdem_191_3c4s8cJhTh_9s3sQd7c_7d9h5c8h() {
    assertEquals(
      "7d9h5c8h 9s3sQd7c",
      Solver.process("omaha-holdem 3c4s8cJhTh 9s3sQd7c 7d9h5c8h"));
  }

  @Test
  public void test_omaha_holdem_192_2c2h5dAcJd_2d5cKhKs_4sAd4h7d_7s4dJs5s() {
    assertEquals(
      "7s4dJs5s 4sAd4h7d 2d5cKhKs",
      Solver.process("omaha-holdem 2c2h5dAcJd 2d5cKhKs 4sAd4h7d 7s4dJs5s"));
  }

  @Test
  public void test_omaha_holdem_193_2d2s3c4sKc_Kh3d8sAc_AsTd7d4d_9h5s9d6s() {
    assertEquals(
      "AsTd7d4d Kh3d8sAc 9h5s9d6s",
      Solver.process("omaha-holdem 2d2s3c4sKc Kh3d8sAc AsTd7d4d 9h5s9d6s"));
  }

  @Test
  public void test_omaha_holdem_194_2h5d7cAcJd_KsJh4s4h_8s4d8c9d_Qc7s5h6c_Td9hTh3c_3s5cAd6s_6h3hQd2s_9cAh7d9s() {
    assertEquals(
      "6h3hQd2s 8s4d8c9d Td9hTh3c KsJh4s4h Qc7s5h6c 3s5cAd6s 9cAh7d9s",
      Solver.process("omaha-holdem 2h5d7cAcJd KsJh4s4h 8s4d8c9d Qc7s5h6c Td9hTh3c 3s5cAd6s 6h3hQd2s 9cAh7d9s"));
  }

  @Test
  public void test_omaha_holdem_195_2d7hAhKdKh_Jc2s7s7c_Ts9hQd4d_4hKcKs8d_6hJd5c3h_9cQs4c8h() {
    assertEquals(
      "9cQs4c8h Ts9hQd4d 6hJd5c3h Jc2s7s7c 4hKcKs8d",
      Solver.process("omaha-holdem 2d7hAhKdKh Jc2s7s7c Ts9hQd4d 4hKcKs8d 6hJd5c3h 9cQs4c8h"));
  }

  @Test
  public void test_omaha_holdem_196_9cAhJsQdTd_5dTh6h7d_4s2sAd7c_9s8sJdAs_6cJh2dQh_7s2c9d5c() {
    assertEquals(
      "7s2c9d5c 5dTh6h7d 4s2sAd7c 6cJh2dQh 9s8sJdAs",
      Solver.process("omaha-holdem 9cAhJsQdTd 5dTh6h7d 4s2sAd7c 9s8sJdAs 6cJh2dQh 7s2c9d5c"));
  }

  @Test
  public void test_omaha_holdem_197_2d2s3d7sTs_6c4h8d9c_8sAs7hKh_4dQh2h9s_AcKd2c3h_4s9dAdJh_3cAhKc5s_QcJd5c8h_6s4c8c5h() {
    assertEquals(
      "6s4c8c5h 6c4h8d9c QcJd5c8h 4s9dAdJh 3cAhKc5s 4dQh2h9s 8sAs7hKh AcKd2c3h",
      Solver.process("omaha-holdem 2d2s3d7sTs 6c4h8d9c 8sAs7hKh 4dQh2h9s AcKd2c3h 4s9dAdJh 3cAhKc5s QcJd5c8h 6s4c8c5h"));
  }

  @Test
  public void test_omaha_holdem_198_3h4h5c6sQs_Td8sJcAd_2hQhKcTs_6h9hJdTh_9c3sTcQd() {
    assertEquals(
      "Td8sJcAd 6h9hJdTh 2hQhKcTs 9c3sTcQd",
      Solver.process("omaha-holdem 3h4h5c6sQs Td8sJcAd 2hQhKcTs 6h9hJdTh 9c3sTcQd"));
  }

  @Test
  public void test_omaha_holdem_199_4d7s8cKhTc_Jh2h3cQc_3d7d7cAh_7hQs3sAs_Jc4sTd9c() {
    assertEquals(
      "Jh2h3cQc 7hQs3sAs 3d7d7cAh Jc4sTd9c",
      Solver.process("omaha-holdem 4d7s8cKhTc Jh2h3cQc 3d7d7cAh 7hQs3sAs Jc4sTd9c"));
  }

  @Test
  public void test_omaha_holdem_200_3s4h5d5hKh_8d9s4d9c_Jh6hTdTh_Qs9d8cAh_8h7c4c5c_3h6c7sKs() {
    assertEquals(
      "Qs9d8cAh 8d9s4d9c 3h6c7sKs Jh6hTdTh 8h7c4c5c",
      Solver.process("omaha-holdem 3s4h5d5hKh 8d9s4d9c Jh6hTdTh Qs9d8cAh 8h7c4c5c 3h6c7sKs"));
  }

  @Test
  public void test_omaha_holdem_201_5d9cJcKsTc_KhKc6hTh_Qs7d9dQd_6c7h3c3s_4d5hJdAd_2d8s3h2c_8cAcJsTd_Qc2s8dJh_Ah4s5s7s() {
    assertEquals(
      "2d8s3h2c Ah4s5s7s 4d5hJdAd KhKc6hTh Qc2s8dJh=Qs7d9dQd 6c7h3c3s 8cAcJsTd",
      Solver.process("omaha-holdem 5d9cJcKsTc KhKc6hTh Qs7d9dQd 6c7h3c3s 4d5hJdAd 2d8s3h2c 8cAcJsTd Qc2s8dJh Ah4s5s7s"));
  }

  @Test
  public void test_omaha_holdem_202_2c5c5d7s9s_AsTsQd9d_KsTc4c3c_7cAd3s8c_Kd9h6s6d() {
    assertEquals(
      "KsTc4c3c 7cAd3s8c Kd9h6s6d AsTsQd9d",
      Solver.process("omaha-holdem 2c5c5d7s9s AsTsQd9d KsTc4c3c 7cAd3s8c Kd9h6s6d"));
  }

  @Test
  public void test_omaha_holdem_203_2h3s6hAsQd_QhAcAh2s_Js2d8d6s_8s4d5h8h_9s7dTs3h_Ad6d2c5d() {
    assertEquals(
      "9s7dTs3h Js2d8d6s Ad6d2c5d QhAcAh2s 8s4d5h8h",
      Solver.process("omaha-holdem 2h3s6hAsQd QhAcAh2s Js2d8d6s 8s4d5h8h 9s7dTs3h Ad6d2c5d"));
  }

  @Test
  public void test_omaha_holdem_204_7h9cJhJsQh_7cAc9h2s_5sAd2d6c_4d3dKh2h_3hQc3sTh() {
    assertEquals(
      "5sAd2d6c 7cAc9h2s 3hQc3sTh 4d3dKh2h",
      Solver.process("omaha-holdem 7h9cJhJsQh 7cAc9h2s 5sAd2d6c 4d3dKh2h 3hQc3sTh"));
  }

  @Test
  public void test_omaha_holdem_205_5h8cJdKcKh_5d6sJhTs_7sAs2d9d() {
    assertEquals(
      "7sAs2d9d 5d6sJhTs",
      Solver.process("omaha-holdem 5h8cJdKcKh 5d6sJhTs 7sAs2d9d"));
  }

  @Test
  public void test_omaha_holdem_206_4s5d6s8sKc_TdJh8dQc_9d4d5h6c_Qs2dTcQd_Ah2cKhAs_Qh7sJd3s_9s2s5cJc_3dKd8c7d_3h9h4hTh() {
    assertEquals(
      "3h9h4hTh TdJh8dQc Qs2dTcQd Ah2cKhAs 9d4d5h6c 3dKd8c7d Qh7sJd3s 9s2s5cJc",
      Solver.process("omaha-holdem 4s5d6s8sKc TdJh8dQc 9d4d5h6c Qs2dTcQd Ah2cKhAs Qh7sJd3s 9s2s5cJc 3dKd8c7d 3h9h4hTh"));
  }

  @Test
  public void test_omaha_holdem_207_5h8sAdQdTh_2hQh3c4s_Td2c6sJh_Ts8hAhKh() {
    assertEquals(
      "Td2c6sJh 2hQh3c4s Ts8hAhKh",
      Solver.process("omaha-holdem 5h8sAdQdTh 2hQh3c4s Td2c6sJh Ts8hAhKh"));
  }

  @Test
  public void test_omaha_holdem_208_5c8s9dAhTc_Js2hKd2d_Jd2sTd3c_6h7s3h4c_TsQs8d7d_3s9h6dQd_KcAc5dAs_QcJc5s8h_6cAd5h6s_9sKh9c4s() {
    assertEquals(
      "Js2hKd2d 3s9h6dQd Jd2sTd3c TsQs8d7d 6cAd5h6s 9sKh9c4s KcAc5dAs 6h7s3h4c QcJc5s8h",
      Solver.process("omaha-holdem 5c8s9dAhTc Js2hKd2d Jd2sTd3c 6h7s3h4c TsQs8d7d 3s9h6dQd KcAc5dAs QcJc5s8h 6cAd5h6s 9sKh9c4s"));
  }

  @Test
  public void test_omaha_holdem_209_4d6h9sKsTs_5s3c5dKh_7d4c8s2c() {
    assertEquals(
      "5s3c5dKh 7d4c8s2c",
      Solver.process("omaha-holdem 4d6h9sKsTs 5s3c5dKh 7d4c8s2c"));
  }

  @Test
  public void test_omaha_holdem_210_4d9dAdKhTh_2d7dAh7s_4c8hTdKs_QsKcJdKd_6d6s9hQc_8d3d7c8c_6h4s3h5h_2s2h9s8s_3c6cJc5c() {
    assertEquals(
      "3c6cJc5c 6h4s3h5h 2s2h9s8s 6d6s9hQc 4c8hTdKs 2d7dAh7s 8d3d7c8c QsKcJdKd",
      Solver.process("omaha-holdem 4d9dAdKhTh 2d7dAh7s 4c8hTdKs QsKcJdKd 6d6s9hQc 8d3d7c8c 6h4s3h5h 2s2h9s8s 3c6cJc5c"));
  }

  @Test
  public void test_omaha_holdem_211_4c6s7hJcQd_9dQc9s7s_Th8d3s6h_7dJsTs5h_KsKcKd3h() {
    assertEquals(
      "Th8d3s6h KsKcKd3h 7dJsTs5h 9dQc9s7s",
      Solver.process("omaha-holdem 4c6s7hJcQd 9dQc9s7s Th8d3s6h 7dJsTs5h KsKcKd3h"));
  }

  @Test
  public void test_omaha_holdem_212_3d5d7cQhQs_4hJc4s6d_3hQcKhAd_6h8c6s9d_9s9hJs8s_9c4d4cKc_QdAc7s8d_3cJdJhTd_5hKdTcTh() {
    assertEquals(
      "9c4d4cKc 6h8c6s9d 9s9hJs8s 5hKdTcTh 3cJdJhTd 4hJc4s6d 3hQcKhAd QdAc7s8d",
      Solver.process("omaha-holdem 3d5d7cQhQs 4hJc4s6d 3hQcKhAd 6h8c6s9d 9s9hJs8s 9c4d4cKc QdAc7s8d 3cJdJhTd 5hKdTcTh"));
  }

  @Test
  public void test_omaha_holdem_213_3s7d9dAcJs_2c2d9s8s_AdJd8hKh_5dTc4h6s_6c5hQs2s_5cTs9cAh_JhQd8cKc() {
    assertEquals(
      "5dTc4h6s 6c5hQs2s 2c2d9s8s JhQd8cKc 5cTs9cAh AdJd8hKh",
      Solver.process("omaha-holdem 3s7d9dAcJs 2c2d9s8s AdJd8hKh 5dTc4h6s 6c5hQs2s 5cTs9cAh JhQd8cKc"));
  }

  @Test
  public void test_omaha_holdem_214_3d3s7h8cTd_4hJcKs7s_ThQcTc4s_Jh6cJd7c() {
    assertEquals(
      "4hJcKs7s Jh6cJd7c ThQcTc4s",
      Solver.process("omaha-holdem 3d3s7h8cTd 4hJcKs7s ThQcTc4s Jh6cJd7c"));
  }

  @Test
  public void test_omaha_holdem_215_2d7sKcTcTh_6sJs9h3d_2s5s9dKd_3hAc3s4h_TsJh6d7c_4c6hAsQh() {
    assertEquals(
      "6sJs9h3d 4c6hAsQh 3hAc3s4h 2s5s9dKd TsJh6d7c",
      Solver.process("omaha-holdem 2d7sKcTcTh 6sJs9h3d 2s5s9dKd 3hAc3s4h TsJh6d7c 4c6hAsQh"));
  }

  @Test
  public void test_omaha_holdem_216_5h8dAsQsTd_Jh4d5s6c_Tc3c7sJc_4c9dKc6d_9sQdQhAh_Ad3sJs7c() {
    assertEquals(
      "4c9dKc6d Jh4d5s6c Tc3c7sJc Ad3sJs7c 9sQdQhAh",
      Solver.process("omaha-holdem 5h8dAsQsTd Jh4d5s6c Tc3c7sJc 4c9dKc6d 9sQdQhAh Ad3sJs7c"));
  }

  @Test
  public void test_omaha_holdem_217_3h6h7h8dJc_9s7cQd2s_Qc6d2d5c_4cTc4dAs_8hTs4sAh() {
    assertEquals(
      "4cTc4dAs Qc6d2d5c 9s7cQd2s 8hTs4sAh",
      Solver.process("omaha-holdem 3h6h7h8dJc 9s7cQd2s Qc6d2d5c 4cTc4dAs 8hTs4sAh"));
  }

  @Test
  public void test_omaha_holdem_218_6h7h9cAcAd_7d4hJc8h_KcJh7cAh_Qd2c5cJs_QsThQh3h() {
    assertEquals(
      "Qd2c5cJs 7d4hJc8h QsThQh3h KcJh7cAh",
      Solver.process("omaha-holdem 6h7h9cAcAd 7d4hJc8h KcJh7cAh Qd2c5cJs QsThQh3h"));
  }

  @Test
  public void test_omaha_holdem_219_2c5h6c7hQs_9dAc2hKh_Ks4c9s2d() {
    assertEquals(
      "Ks4c9s2d 9dAc2hKh",
      Solver.process("omaha-holdem 2c5h6c7hQs 9dAc2hKh Ks4c9s2d"));
  }

  @Test
  public void test_omaha_holdem_220_4c7h9c9hJc_Ac9d6dQh_4d7s3hQs_Kd2dTd7c_3s3cAsAd() {
    assertEquals(
      "4d7s3hQs Kd2dTd7c 3s3cAsAd Ac9d6dQh",
      Solver.process("omaha-holdem 4c7h9c9hJc Ac9d6dQh 4d7s3hQs Kd2dTd7c 3s3cAsAd"));
  }

  @Test
  public void test_omaha_holdem_221_6c6d7sJcJd_5s6h3s2h_5dKs8s8c_Qh2s2dTc_Qc5c3c9d_4c5h9s7d_QsAc4h6s() {
    assertEquals(
      "Qc5c3c9d Qh2s2dTc 4c5h9s7d 5dKs8s8c 5s6h3s2h QsAc4h6s",
      Solver.process("omaha-holdem 6c6d7sJcJd 5s6h3s2h 5dKs8s8c Qh2s2dTc Qc5c3c9d 4c5h9s7d QsAc4h6s"));
  }

  @Test
  public void test_omaha_holdem_222_2s3sKcKdTs_Qs4s3hAc_7d6h2hQd() {
    assertEquals(
      "7d6h2hQd Qs4s3hAc",
      Solver.process("omaha-holdem 2s3sKcKdTs Qs4s3hAc 7d6h2hQd"));
  }

  @Test
  public void test_omaha_holdem_223_6s7h9cJdTc_7c8d6h5h_3d3c5c4d() {
    assertEquals(
      "3d3c5c4d 7c8d6h5h",
      Solver.process("omaha-holdem 6s7h9cJdTc 7c8d6h5h 3d3c5c4d"));
  }

  @Test
  public void test_omaha_holdem_224_2s5c5d9sAd_Js6d4d8c_KdTcTdQs_As8s4h3h_7h6s4c2h_Jh3d2c7d_7s4sJdQh_Ac8dKcQd_Th6hTs9h() {
    assertEquals(
      "Js6d4d8c 7s4sJdQh 7h6s4c2h Jh3d2c7d KdTcTdQs=Th6hTs9h Ac8dKcQd As8s4h3h",
      Solver.process("omaha-holdem 2s5c5d9sAd Js6d4d8c KdTcTdQs As8s4h3h 7h6s4c2h Jh3d2c7d 7s4sJdQh Ac8dKcQd Th6hTs9h"));
  }

  @Test
  public void test_omaha_holdem_225_4d7h9c9dAc_6h2c6s2d_8c3cQsAh_5c5sJsTd_2s4s6dAs_Ts4cAd3s_9h8h8sQc() {
    assertEquals(
      "5c5sJsTd 6h2c6s2d 2s4s6dAs Ts4cAd3s 8c3cQsAh 9h8h8sQc",
      Solver.process("omaha-holdem 4d7h9c9dAc 6h2c6s2d 8c3cQsAh 5c5sJsTd 2s4s6dAs Ts4cAd3s 9h8h8sQc"));
  }

  @Test
  public void test_omaha_holdem_226_3c3s4cKsTd_Kd4h9c2c_7d2dJd3h_5h5s7s4d_9hQdTh7h_QcKhJsQs_5dTc8s4s_8c2h2s9s_TsKcQh6s_AsJc8h6c() {
    assertEquals(
      "AsJc8h6c 8c2h2s9s 5h5s7s4d 9hQdTh7h 5dTc8s4s QcKhJsQs Kd4h9c2c TsKcQh6s 7d2dJd3h",
      Solver.process("omaha-holdem 3c3s4cKsTd Kd4h9c2c 7d2dJd3h 5h5s7s4d 9hQdTh7h QcKhJsQs 5dTc8s4s 8c2h2s9s TsKcQh6s AsJc8h6c"));
  }

  @Test
  public void test_omaha_holdem_227_2h4s6dQcQd_5dJh3c5c_4dKs5s8s_6h6cJd4c_9d3dTd9c_Qh6s2d8d() {
    assertEquals(
      "4dKs5s8s 9d3dTd9c 5dJh3c5c 6h6cJd4c Qh6s2d8d",
      Solver.process("omaha-holdem 2h4s6dQcQd 5dJh3c5c 4dKs5s8s 6h6cJd4c 9d3dTd9c Qh6s2d8d"));
  }

  @Test
  public void test_omaha_holdem_228_2h3d5s6sKc_AhQs7cQd_2c3s8c4d_9dKd9hJs_3hJd7d9c_7hKs5h6c_6d4h5c5d() {
    assertEquals(
      "3hJd7d9c AhQs7cQd 9dKd9hJs 7hKs5h6c 2c3s8c4d=6d4h5c5d",
      Solver.process("omaha-holdem 2h3d5s6sKc AhQs7cQd 2c3s8c4d 9dKd9hJs 3hJd7d9c 7hKs5h6c 6d4h5c5d"));
  }

  @Test
  public void test_omaha_holdem_229_5h6cAhAsKh_5sQc3hAd_9c2s2d2h_7h7sTd4h_4sKs5dTh_7d9s3cKd_JdAc7c8s_3s2c9hKc_JsQsQhQd_6s4d6dTc() {
    assertEquals(
      "9c2s2d2h JsQsQhQd 3s2c9hKc=7d9s3cKd 4sKs5dTh JdAc7c8s 7h7sTd4h 6s4d6dTc 5sQc3hAd",
      Solver.process("omaha-holdem 5h6cAhAsKh 5sQc3hAd 9c2s2d2h 7h7sTd4h 4sKs5dTh 7d9s3cKd JdAc7c8s 3s2c9hKc JsQsQhQd 6s4d6dTc"));
  }

  @Test
  public void test_omaha_holdem_230_3d8d8hAcQs_2sTd7hJd_TcJsAsKs_6hThQd7c_6sQc5sAd_Ah8cKh2d() {
    assertEquals(
      "2sTd7hJd 6hThQd7c TcJsAsKs 6sQc5sAd Ah8cKh2d",
      Solver.process("omaha-holdem 3d8d8hAcQs 2sTd7hJd TcJsAsKs 6hThQd7c 6sQc5sAd Ah8cKh2d"));
  }

  @Test
  public void test_omaha_holdem_231_2c2d5s6hTc_2h4cKh9s_6cJh8dKc() {
    assertEquals(
      "6cJh8dKc 2h4cKh9s",
      Solver.process("omaha-holdem 2c2d5s6hTc 2h4cKh9s 6cJh8dKc"));
  }

  @Test
  public void test_omaha_holdem_232_6s7hAcJdTd_8h9c7d9s_3cAh6cKh() {
    assertEquals(
      "3cAh6cKh 8h9c7d9s",
      Solver.process("omaha-holdem 6s7hAcJdTd 8h9c7d9s 3cAh6cKh"));
  }

  @Test
  public void test_omaha_holdem_233_3s6d7h9sJd_Ac3c2h7d_KcQc4c9d_Ts2s8sKh_2c6h9cKd_Td4dJh8c_5d7s3d7c() {
    assertEquals(
      "KcQc4c9d Ac3c2h7d 2c6h9cKd 5d7s3d7c Td4dJh8c=Ts2s8sKh",
      Solver.process("omaha-holdem 3s6d7h9sJd Ac3c2h7d KcQc4c9d Ts2s8sKh 2c6h9cKd Td4dJh8c 5d7s3d7c"));
  }

  @Test
  public void test_omaha_holdem_234_3s6h7h8h9h_7s6c4sJd_QsQhQd9c_8d5h6sJs_4h9dAhTc_6d2h5cJh_8sAc7c4d() {
    assertEquals(
      "QsQhQd9c 7s6c4sJd 8sAc7c4d 8d5h6sJs 6d2h5cJh 4h9dAhTc",
      Solver.process("omaha-holdem 3s6h7h8h9h 7s6c4sJd QsQhQd9c 8d5h6sJs 4h9dAhTc 6d2h5cJh 8sAc7c4d"));
  }

  @Test
  public void test_omaha_holdem_235_2d2s9cKhTc_4h9s2cAs_AdKsThQs_Kc7s2h3s_8d5hAhJs_5sJh4d7c_8cKd4s8h_8sTs6s6d() {
    assertEquals(
      "5sJh4d7c 8d5hAhJs 8sTs6s6d 8cKd4s8h AdKsThQs 4h9s2cAs Kc7s2h3s",
      Solver.process("omaha-holdem 2d2s9cKhTc 4h9s2cAs AdKsThQs Kc7s2h3s 8d5hAhJs 5sJh4d7c 8cKd4s8h 8sTs6s6d"));
  }

  @Test
  public void test_omaha_holdem_236_2d6sKdQcQd_9s3s8hJd_3d4hKs8c() {
    assertEquals(
      "9s3s8hJd 3d4hKs8c",
      Solver.process("omaha-holdem 2d6sKdQcQd 9s3s8hJd 3d4hKs8c"));
  }

  @Test
  public void test_omaha_holdem_237_3c3d9sAsKs_5cQcKd8d_9c2d2s6s_QdKhKcTh_Td8s7h7d() {
    assertEquals(
      "Td8s7h7d 5cQcKd8d 9c2d2s6s QdKhKcTh",
      Solver.process("omaha-holdem 3c3d9sAsKs 5cQcKd8d 9c2d2s6s QdKhKcTh Td8s7h7d"));
  }

  @Test
  public void test_omaha_holdem_238_4d5s7h9cAh_9h6dAdJc_AcQh3c5h_8c7c4hKd_9s3s4sAs_8d8hTc3d() {
    assertEquals(
      "8d8hTc3d 8c7c4hKd AcQh3c5h 9h6dAdJc=9s3s4sAs",
      Solver.process("omaha-holdem 4d5s7h9cAh 9h6dAdJc AcQh3c5h 8c7c4hKd 9s3s4sAs 8d8hTc3d"));
  }

  @Test
  public void test_omaha_holdem_239_2h2s3hJcTc_5d7c3cTh_KsAd5h4h_4s2dJd8c_3dAsKc7s_9h8s9sJh() {
    assertEquals(
      "KsAd5h4h 3dAsKc7s 5d7c3cTh 9h8s9sJh 4s2dJd8c",
      Solver.process("omaha-holdem 2h2s3hJcTc 5d7c3cTh KsAd5h4h 4s2dJd8c 3dAsKc7s 9h8s9sJh"));
  }

  @Test
  public void test_omaha_holdem_240_2c2d4d5dJh_5s4cQc7h_3hJdKs3d_AcThAh7d_4s3sAdKh_AsQs6cQd_9h4h9dJs_KdTs9c8c_7s6h7c8s() {
    assertEquals(
      "KdTs9c8c 5s4cQc7h 7s6h7c8s 9h4h9dJs AsQs6cQd AcThAh7d 4s3sAdKh 3hJdKs3d",
      Solver.process("omaha-holdem 2c2d4d5dJh 5s4cQc7h 3hJdKs3d AcThAh7d 4s3sAdKh AsQs6cQd 9h4h9dJs KdTs9c8c 7s6h7c8s"));
  }

  @Test
  public void test_omaha_holdem_241_3s4dQdQhTs_6h2h8h3d_7d7h8s3c_Ks9d5s5d_8c3hJhQs_Kh4s7c9c_4c5c4h6c_7sAh2sTd_QcAcTh5h_As9hAd8d() {
    assertEquals(
      "6h2h8h3d Kh4s7c9c Ks9d5s5d 7d7h8s3c 7sAh2sTd As9hAd8d 4c5c4h6c 8c3hJhQs QcAcTh5h",
      Solver.process("omaha-holdem 3s4dQdQhTs 6h2h8h3d 7d7h8s3c Ks9d5s5d 8c3hJhQs Kh4s7c9c 4c5c4h6c 7sAh2sTd QcAcTh5h As9hAd8d"));
  }

  @Test
  public void test_omaha_holdem_242_4d4s5h5s8d_8s7hQdTc_3h6hAhJc_3cKs7sTd_Js6s9c6c() {
    assertEquals(
      "3cKs7sTd 3h6hAhJc Js6s9c6c 8s7hQdTc",
      Solver.process("omaha-holdem 4d4s5h5s8d 8s7hQdTc 3h6hAhJc 3cKs7sTd Js6s9c6c"));
  }

  @Test
  public void test_omaha_holdem_243_2c5s8h9sKs_3h4c4h7d_6s7sTdQc_Js6d9dAs_Th8s5cKd_7hTs5h4s_5d9h2s8d_8c6hAh4d_Kc7cQdTc_6cQhJh3s() {
    assertEquals(
      "6cQhJh3s 3h4c4h7d 8c6hAh4d Kc7cQdTc 5d9h2s8d Th8s5cKd 6s7sTdQc 7hTs5h4s Js6d9dAs",
      Solver.process("omaha-holdem 2c5s8h9sKs 3h4c4h7d 6s7sTdQc Js6d9dAs Th8s5cKd 7hTs5h4s 5d9h2s8d 8c6hAh4d Kc7cQdTc 6cQhJh3s"));
  }

  @Test
  public void test_omaha_holdem_244_2dJsQcQhQs_5sTdAs8d_8c3s4cKh_Ad6c2hAc_6d3h3c7c_8hTs6s9s_9h6h2sKd_2c5c9dJc_Qd4s3dTc() {
    assertEquals(
      "8hTs6s9s 2c5c9dJc 8c3s4cKh 9h6h2sKd 5sTdAs8d 6d3h3c7c Ad6c2hAc Qd4s3dTc",
      Solver.process("omaha-holdem 2dJsQcQhQs 5sTdAs8d 8c3s4cKh Ad6c2hAc 6d3h3c7c 8hTs6s9s 9h6h2sKd 2c5c9dJc Qd4s3dTc"));
  }

  @Test
  public void test_omaha_holdem_245_2d3d7d8cKs_4h8s7h9d_9hTc9s8h_4s6s4d5h_7s2s2h7c() {
    assertEquals(
      "4s6s4d5h 9hTc9s8h 4h8s7h9d 7s2s2h7c",
      Solver.process("omaha-holdem 2d3d7d8cKs 4h8s7h9d 9hTc9s8h 4s6s4d5h 7s2s2h7c"));
  }

  @Test
  public void test_omaha_holdem_246_2d3s7c9dJd_Jh3cTs8h_7d5d6h8c() {
    assertEquals(
      "Jh3cTs8h 7d5d6h8c",
      Solver.process("omaha-holdem 2d3s7c9dJd Jh3cTs8h 7d5d6h8c"));
  }

  @Test
  public void test_omaha_holdem_247_6h7cJcJsTc_4c7s6s8d_8h4d6c2c_Ks6d8s5d() {
    assertEquals(
      "Ks6d8s5d 4c7s6s8d 8h4d6c2c",
      Solver.process("omaha-holdem 6h7cJcJsTc 4c7s6s8d 8h4d6c2c Ks6d8s5d"));
  }

  @Test
  public void test_omaha_holdem_248_2d7dAdKcTh_8d9d9s2c_5hAc6hJc_5cQcAh3h_4s8c4c3d_AsKsKhTs_2sTdQs7h() {
    assertEquals(
      "4s8c4c3d 5hAc6hJc 5cQcAh3h 2sTdQs7h AsKsKhTs 8d9d9s2c",
      Solver.process("omaha-holdem 2d7dAdKcTh 8d9d9s2c 5hAc6hJc 5cQcAh3h 4s8c4c3d AsKsKhTs 2sTdQs7h"));
  }

  @Test
  public void test_omaha_holdem_249_4s6d6hAcJd_AsQc6s7h_7s5dKh5h() {
    assertEquals(
      "7s5dKh5h AsQc6s7h",
      Solver.process("omaha-holdem 4s6d6hAcJd AsQc6s7h 7s5dKh5h"));
  }

}
