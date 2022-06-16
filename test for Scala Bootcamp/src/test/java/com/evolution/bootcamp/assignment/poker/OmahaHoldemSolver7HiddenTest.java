
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver7HiddenTest {


  @Test
  public void test_omaha_holdem_1750_2d4h5hJcQd_9h8h7s2h_8d2sAcTc_3hQc9sTd_8c4d3dAs() {
    assertEquals(
      "9h8h7s2h 8d2sAcTc 3hQc9sTd 8c4d3dAs",
      Solver.process("omaha-holdem 2d4h5hJcQd 9h8h7s2h 8d2sAcTc 3hQc9sTd 8c4d3dAs"));
  }

  @Test
  public void test_omaha_holdem_1751_2h2s3sJdTh_QsKh4d7c_3cJc6sQc_JhKc6h3h_Ks9h3dAh_9c9d4h6c() {
    assertEquals(
      "QsKh4d7c Ks9h3dAh 9c9d4h6c 3cJc6sQc=JhKc6h3h",
      Solver.process("omaha-holdem 2h2s3sJdTh QsKh4d7c 3cJc6sQc JhKc6h3h Ks9h3dAh 9c9d4h6c"));
  }

  @Test
  public void test_omaha_holdem_1752_3h6d7s8sQh_Tc5s5d2d_Th7cKd4s_2h9d6h7d_5h3s8c6s_Kh2s7h9s_Kc3dAsJs_3cQc9cTd_9h6c4dQd() {
    assertEquals(
      "Kc3dAsJs Tc5s5d2d Kh2s7h9s=Th7cKd4s 2h9d6h7d 5h3s8c6s 9h6c4dQd 3cQc9cTd",
      Solver.process("omaha-holdem 3h6d7s8sQh Tc5s5d2d Th7cKd4s 2h9d6h7d 5h3s8c6s Kh2s7h9s Kc3dAsJs 3cQc9cTd 9h6c4dQd"));
  }

  @Test
  public void test_omaha_holdem_1753_2c5h6h8dQs_3h7d4s4h_KhTc6d2s_Td4dAh5c_9s7sTs5s_Js8sKs6c_9cAs8c2d_Qd8h2h9h_7cQcKd3d() {
    assertEquals(
      "Td4dAh5c 7cQcKd3d KhTc6d2s 9cAs8c2d Js8sKs6c Qd8h2h9h 3h7d4s4h 9s7sTs5s",
      Solver.process("omaha-holdem 2c5h6h8dQs 3h7d4s4h KhTc6d2s Td4dAh5c 9s7sTs5s Js8sKs6c 9cAs8c2d Qd8h2h9h 7cQcKd3d"));
  }

  @Test
  public void test_omaha_holdem_1754_5cJdKcQhTs_3h4cAd6h_Jh5d3sQc_3d4s2s8s_2cTh4h7c_7sKh6s9h_9sJc3cKs() {
    assertEquals(
      "3d4s2s8s 3h4cAd6h 2cTh4h7c Jh5d3sQc 7sKh6s9h=9sJc3cKs",
      Solver.process("omaha-holdem 5cJdKcQhTs 3h4cAd6h Jh5d3sQc 3d4s2s8s 2cTh4h7c 7sKh6s9h 9sJc3cKs"));
  }

  @Test
  public void test_omaha_holdem_1755_2hJdKdKsTd_Kh2d7c7d_7s9h9d5h_4hAc6c8c_9c5s7h2c_9s6s4s8d_Jh5cAs6h_KcQsAdAh_TcJcTs8h() {
    assertEquals(
      "9s6s4s8d 4hAc6c8c 9c5s7h2c 7s9h9d5h Jh5cAs6h KcQsAdAh TcJcTs8h Kh2d7c7d",
      Solver.process("omaha-holdem 2hJdKdKsTd Kh2d7c7d 7s9h9d5h 4hAc6c8c 9c5s7h2c 9s6s4s8d Jh5cAs6h KcQsAdAh TcJcTs8h"));
  }

  @Test
  public void test_omaha_holdem_1756_7c7hQcQhTh_3c5s3d6d_Jc7d4s4c_Kh8h8sTd_Qd8dKdTc_5hKs2sKc() {
    assertEquals(
      "3c5s3d6d 5hKs2sKc Jc7d4s4c Kh8h8sTd Qd8dKdTc",
      Solver.process("omaha-holdem 7c7hQcQhTh 3c5s3d6d Jc7d4s4c Kh8h8sTd Qd8dKdTc 5hKs2sKc"));
  }

  @Test
  public void test_omaha_holdem_1757_2s8c8h9cTd_4hKd2h7s_8sTcKc2d_9s7hQs4s_Qc5h6dAs_Js8d5c6c_7d3d2c4d_JcQh6s6h_Ah9hQd9d() {
    assertEquals(
      "Qc5h6dAs 7d3d2c4d 4hKd2h7s 9s7hQs4s Js8d5c6c JcQh6s6h 8sTcKc2d Ah9hQd9d",
      Solver.process("omaha-holdem 2s8c8h9cTd 4hKd2h7s 8sTcKc2d 9s7hQs4s Qc5h6dAs Js8d5c6c 7d3d2c4d JcQh6s6h Ah9hQd9d"));
  }

  @Test
  public void test_omaha_holdem_1758_3d4h5c7d7h_6cJhQc2c_Kh7cTd2d_8s9c5d6d_2hTs5h9h_Th3h3cAs_6sQhKcJs_2sJcAc9s() {
    assertEquals(
      "6sQhKcJs 2hTs5h9h Kh7cTd2d 2sJcAc9s 6cJhQc2c 8s9c5d6d Th3h3cAs",
      Solver.process("omaha-holdem 3d4h5c7d7h 6cJhQc2c Kh7cTd2d 8s9c5d6d 2hTs5h9h Th3h3cAs 6sQhKcJs 2sJcAc9s"));
  }

  @Test
  public void test_omaha_holdem_1759_4c5c7c8sQs_Jd9c5sAs_3sTh2sAc_4s9hTsJs_3cQdAd2h_3dTc4dJh_9sQhTd8c_5h8hQc6d_8d4hKc7s_6hKd6s5d() {
    assertEquals(
      "3sTh2sAc 3dTc4dJh=4s9hTsJs Jd9c5sAs 3cQdAd2h 8d4hKc7s 9sQhTd8c 5h8hQc6d=6hKd6s5d",
      Solver.process("omaha-holdem 4c5c7c8sQs Jd9c5sAs 3sTh2sAc 4s9hTsJs 3cQdAd2h 3dTc4dJh 9sQhTd8c 5h8hQc6d 8d4hKc7s 6hKd6s5d"));
  }

  @Test
  public void test_omaha_holdem_1760_2d2h6sAhTd_3dQh8c3s_Kd6hJhAc_5d7hQs4s_5h6c3c7s_Ts8d9dKh() {
    assertEquals(
      "5d7hQs4s 3dQh8c3s 5h6c3c7s Ts8d9dKh Kd6hJhAc",
      Solver.process("omaha-holdem 2d2h6sAhTd 3dQh8c3s Kd6hJhAc 5d7hQs4s 5h6c3c7s Ts8d9dKh"));
  }

  @Test
  public void test_omaha_holdem_1761_4h6c6sAhAs_8s5h8d3c_Qd9d2dTd_5sTcAdJh() {
    assertEquals(
      "Qd9d2dTd 8s5h8d3c 5sTcAdJh",
      Solver.process("omaha-holdem 4h6c6sAhAs 8s5h8d3c Qd9d2dTd 5sTcAdJh"));
  }

  @Test
  public void test_omaha_holdem_1762_4c4h7c7dJd_KsQc2s2c_AhQs9c8d_TdTsKc8c() {
    assertEquals(
      "AhQs9c8d KsQc2s2c TdTsKc8c",
      Solver.process("omaha-holdem 4c4h7c7dJd KsQc2s2c AhQs9c8d TdTsKc8c"));
  }

  @Test
  public void test_omaha_holdem_1763_5d5hJcKdTc_2c5sAs6d_9cQh9dQd() {
    assertEquals(
      "2c5sAs6d 9cQh9dQd",
      Solver.process("omaha-holdem 5d5hJcKdTc 2c5sAs6d 9cQh9dQd"));
  }

  @Test
  public void test_omaha_holdem_1764_6h7s8dKcQd_9d4hAhQh_Jc9cKs6c_Th4s2c4c_As7h8c7c_6sKh8s4d_3cKd2d5s_3s5hTcQc_6dAcJh7d_Js9h8hTs() {
    assertEquals(
      "Th4s2c4c 3s5hTcQc 9d4hAhQh 3cKd2d5s 6dAcJh7d Jc9cKs6c 6sKh8s4d As7h8c7c Js9h8hTs",
      Solver.process("omaha-holdem 6h7s8dKcQd 9d4hAhQh Jc9cKs6c Th4s2c4c As7h8c7c 6sKh8s4d 3cKd2d5s 3s5hTcQc 6dAcJh7d Js9h8hTs"));
  }

  @Test
  public void test_omaha_holdem_1765_2c7d8hJcJs_2h9s7cAd_AcTsJh4s_5s3cAs5d_4h2d7sKh_5hTdKd5c() {
    assertEquals(
      "5hTdKd5c=5s3cAs5d 4h2d7sKh 2h9s7cAd AcTsJh4s",
      Solver.process("omaha-holdem 2c7d8hJcJs 2h9s7cAd AcTsJh4s 5s3cAs5d 4h2d7sKh 5hTdKd5c"));
  }

  @Test
  public void test_omaha_holdem_1766_4c6c8dAhKh_KcTh5sAd_Ac3h2sKd_JsQdJhQs_TsJc4s4d_5c6h8h5h() {
    assertEquals(
      "JsQdJhQs 5c6h8h5h Ac3h2sKd=KcTh5sAd TsJc4s4d",
      Solver.process("omaha-holdem 4c6c8dAhKh KcTh5sAd Ac3h2sKd JsQdJhQs TsJc4s4d 5c6h8h5h"));
  }

  @Test
  public void test_omaha_holdem_1767_3dAdJsQhQs_7s4h5d6s_8hQcTd4s_5hKc9s3h_Ks2hTh6c_Jc2c5c3s_Jd8s3c5s_7c8d2s9c_7d2d6hAs() {
    assertEquals(
      "7s4h5d6s 7c8d2s9c 5hKc9s3h Jc2c5c3s Jd8s3c5s 7d2d6hAs 8hQcTd4s Ks2hTh6c",
      Solver.process("omaha-holdem 3dAdJsQhQs 7s4h5d6s 8hQcTd4s 5hKc9s3h Ks2hTh6c Jc2c5c3s Jd8s3c5s 7c8d2s9c 7d2d6hAs"));
  }

  @Test
  public void test_omaha_holdem_1768_3d3hAcAsJh_3cKdAd4d_2dTh8d8h() {
    assertEquals(
      "2dTh8d8h 3cKdAd4d",
      Solver.process("omaha-holdem 3d3hAcAsJh 3cKdAd4d 2dTh8d8h"));
  }

  @Test
  public void test_omaha_holdem_1769_3c5c6s7dAc_7hTd4sKd_9dKh5s9c_6cTcQh8s_8cKc3d8h_5hJdQs3s() {
    assertEquals(
      "9dKh5s9c 5hJdQs3s 7hTd4sKd 6cTcQh8s 8cKc3d8h",
      Solver.process("omaha-holdem 3c5c6s7dAc 7hTd4sKd 9dKh5s9c 6cTcQh8s 8cKc3d8h 5hJdQs3s"));
  }

  @Test
  public void test_omaha_holdem_1770_3c4s5s7c9d_3dAh3s3h_2s6c2c4c_KhQhQd5c_KsAd7s2d_9h6s6h6d_9s8hTcAc() {
    assertEquals(
      "9h6s6h6d 9s8hTcAc KhQhQd5c 3dAh3s3h KsAd7s2d 2s6c2c4c",
      Solver.process("omaha-holdem 3c4s5s7c9d 3dAh3s3h 2s6c2c4c KhQhQd5c KsAd7s2d 9h6s6h6d 9s8hTcAc"));
  }

  @Test
  public void test_omaha_holdem_1771_2h6d7s8d9c_4h9hJdQc_5c2s2c3c_Ts2d3d8c_8hAdTcKh_7cThQdJc_Ks6hKcTd() {
    assertEquals(
      "4h9hJdQc 5c2s2c3c 8hAdTcKh=Ks6hKcTd=Ts2d3d8c 7cThQdJc",
      Solver.process("omaha-holdem 2h6d7s8d9c 4h9hJdQc 5c2s2c3c Ts2d3d8c 8hAdTcKh 7cThQdJc Ks6hKcTd"));
  }

  @Test
  public void test_omaha_holdem_1772_2d4d8h9cJs_2c9sKsQh_3hKd8sJd_Kc6dTdJc() {
    assertEquals(
      "Kc6dTdJc 2c9sKsQh 3hKd8sJd",
      Solver.process("omaha-holdem 2d4d8h9cJs 2c9sKsQh 3hKd8sJd Kc6dTdJc"));
  }

  @Test
  public void test_omaha_holdem_1773_2h7h9dKsTc_Qd6c7d8c_Qs5sKh6d_2dQc7c8h_Jc4s4c2c() {
    assertEquals(
      "Jc4s4c2c Qs5sKh6d 2dQc7c8h Qd6c7d8c",
      Solver.process("omaha-holdem 2h7h9dKsTc Qd6c7d8c Qs5sKh6d 2dQc7c8h Jc4s4c2c"));
  }

  @Test
  public void test_omaha_holdem_1774_7h8c8s9hKs_6dTd5hJs_8h3hTs9d_Tc6h4h8d_Th9s5s7d_6sAcJcKd_7s5dQh4d() {
    assertEquals(
      "7s5dQh4d Th9s5s7d 6sAcJcKd Tc6h4h8d 6dTd5hJs 8h3hTs9d",
      Solver.process("omaha-holdem 7h8c8s9hKs 6dTd5hJs 8h3hTs9d Tc6h4h8d Th9s5s7d 6sAcJcKd 7s5dQh4d"));
  }

  @Test
  public void test_omaha_holdem_1775_2s3c7c9cKc_QhKsTcJd_9s5s5d6s_QcKd8sTh_2cTd5c5h_9dQs3hJs_Ah6h4c8h_4hKh2d3d_Jh7dQd6c_8d7sAs9h() {
    assertEquals(
      "Ah6h4c8h Jh7dQd6c 9s5s5d6s QcKd8sTh=QhKsTcJd 9dQs3hJs 8d7sAs9h 4hKh2d3d 2cTd5c5h",
      Solver.process("omaha-holdem 2s3c7c9cKc QhKsTcJd 9s5s5d6s QcKd8sTh 2cTd5c5h 9dQs3hJs Ah6h4c8h 4hKh2d3d Jh7dQd6c 8d7sAs9h"));
  }

  @Test
  public void test_omaha_holdem_1776_2s3d5h6h9s_TsJdQc7c_Ad8hKc3h_8c5c6c2c_4cKhAcTc() {
    assertEquals(
      "TsJdQc7c Ad8hKc3h 8c5c6c2c 4cKhAcTc",
      Solver.process("omaha-holdem 2s3d5h6h9s TsJdQc7c Ad8hKc3h 8c5c6c2c 4cKhAcTc"));
  }

  @Test
  public void test_omaha_holdem_1777_2d7c7d8dAh_Qs6hTsAs_Jh3s9h2h_3hAcKh5d_Tc4hJd4s_JcKs5hQd_2sQhJs9d() {
    assertEquals(
      "JcKs5hQd Jh3s9h2h 2sQhJs9d Tc4hJd4s Qs6hTsAs 3hAcKh5d",
      Solver.process("omaha-holdem 2d7c7d8dAh Qs6hTsAs Jh3s9h2h 3hAcKh5d Tc4hJd4s JcKs5hQd 2sQhJs9d"));
  }

  @Test
  public void test_omaha_holdem_1778_2d4d6cAsTc_QcQh8c7h_6sQs7d5s_6h2c6dJh() {
    assertEquals(
      "6sQs7d5s QcQh8c7h 6h2c6dJh",
      Solver.process("omaha-holdem 2d4d6cAsTc QcQh8c7h 6sQs7d5s 6h2c6dJh"));
  }

  @Test
  public void test_omaha_holdem_1779_2h4h5d7s9h_ThQd2c5s_KcJsTc7d_9c9d7hJc_6sKs8s5c_4cJhTd7c_Ad2dAh3s_AcJdKhAs() {
    assertEquals(
      "KcJsTc7d AcJdKhAs ThQd2c5s 4cJhTd7c 9c9d7hJc Ad2dAh3s 6sKs8s5c",
      Solver.process("omaha-holdem 2h4h5d7s9h ThQd2c5s KcJsTc7d 9c9d7hJc 6sKs8s5c 4cJhTd7c Ad2dAh3s AcJdKhAs"));
  }

  @Test
  public void test_omaha_holdem_1780_3d4hAdJcKh_2d6cQs7s_9d9s5cAs_8h4sJh2h_2c6d5s3s_TsAh2s9h_Tc6h7cKd_5d6sQcKs() {
    assertEquals(
      "2d6cQs7s Tc6h7cKd 5d6sQcKs 9d9s5cAs TsAh2s9h 8h4sJh2h 2c6d5s3s",
      Solver.process("omaha-holdem 3d4hAdJcKh 2d6cQs7s 9d9s5cAs 8h4sJh2h 2c6d5s3s TsAh2s9h Tc6h7cKd 5d6sQcKs"));
  }

  @Test
  public void test_omaha_holdem_1781_3d5c6cQcTc_Qh3s7hTh_7c3cJc4h_5d8d6s6d_Ad4dTd5s_8sAc2dKs_2hJh7dJd() {
    assertEquals(
      "8sAc2dKs 2hJh7dJd Ad4dTd5s Qh3s7hTh 5d8d6s6d 7c3cJc4h",
      Solver.process("omaha-holdem 3d5c6cQcTc Qh3s7hTh 7c3cJc4h 5d8d6s6d Ad4dTd5s 8sAc2dKs 2hJh7dJd"));
  }

  @Test
  public void test_omaha_holdem_1782_9dAdJcKcKd_6s2h4s8c_Ts5d5c9h_QcJhTcTh_QsQh8s7d_6h3s7sQd_3h5sJsAs() {
    assertEquals(
      "6s2h4s8c 6h3s7sQd Ts5d5c9h QsQh8s7d 3h5sJsAs QcJhTcTh",
      Solver.process("omaha-holdem 9dAdJcKcKd 6s2h4s8c Ts5d5c9h QcJhTcTh QsQh8s7d 6h3s7sQd 3h5sJsAs"));
  }

  @Test
  public void test_omaha_holdem_1783_2s4d5d8d8s_8hJcAcTc_3s5sQh8c_9h6c2d6s_3hThQs5c() {
    assertEquals(
      "3hThQs5c 9h6c2d6s 8hJcAcTc 3s5sQh8c",
      Solver.process("omaha-holdem 2s4d5d8d8s 8hJcAcTc 3s5sQh8c 9h6c2d6s 3hThQs5c"));
  }

  @Test
  public void test_omaha_holdem_1784_7h8c9dAsQc_JcQhJdJs_5s8s9s3s_Ac8dJh5d_Qs6s7s6c_4s2h2d4c_5hKd4hKh() {
    assertEquals(
      "4s2h2d4c JcQhJdJs 5hKd4hKh 5s8s9s3s Qs6s7s6c Ac8dJh5d",
      Solver.process("omaha-holdem 7h8c9dAsQc JcQhJdJs 5s8s9s3s Ac8dJh5d Qs6s7s6c 4s2h2d4c 5hKd4hKh"));
  }

  @Test
  public void test_omaha_holdem_1785_2c4s7s9cQd_6c4h2sTc_Kc9h5s8c() {
    assertEquals(
      "Kc9h5s8c 6c4h2sTc",
      Solver.process("omaha-holdem 2c4s7s9cQd 6c4h2sTc Kc9h5s8c"));
  }

  @Test
  public void test_omaha_holdem_1786_3s4h7d8cQc_Js6dKh3d_2h9sKdJh_Kc6s8h6c_9dTsQd7s_Jc2s9h5s() {
    assertEquals(
      "Jc2s9h5s 2h9sKdJh Js6dKh3d Kc6s8h6c 9dTsQd7s",
      Solver.process("omaha-holdem 3s4h7d8cQc Js6dKh3d 2h9sKdJh Kc6s8h6c 9dTsQd7s Jc2s9h5s"));
  }

  @Test
  public void test_omaha_holdem_1787_3s7c7d8hTh_KsJd8s2s_6c2hJh9c_6sTs8c8d_9h5c7h4c_2c5hAhAd_Js3d4sAc_4d3cQc6h() {
    assertEquals(
      "4d3cQc6h Js3d4sAc KsJd8s2s 2c5hAhAd 9h5c7h4c 6c2hJh9c 6sTs8c8d",
      Solver.process("omaha-holdem 3s7c7d8hTh KsJd8s2s 6c2hJh9c 6sTs8c8d 9h5c7h4c 2c5hAhAd Js3d4sAc 4d3cQc6h"));
  }

  @Test
  public void test_omaha_holdem_1788_3d6c7h8hTh_3cKsTc9c_4dKhJh9d_2c4s7dQd_Js4c9s6h_8cJc5dQc_6sKc2hKd_2d3s5s8d_Ts8s7sAc() {
    assertEquals(
      "2c4s7dQd 8cJc5dQc 6sKc2hKd 2d3s5s8d Ts8s7sAc 3cKsTc9c Js4c9s6h 4dKhJh9d",
      Solver.process("omaha-holdem 3d6c7h8hTh 3cKsTc9c 4dKhJh9d 2c4s7dQd Js4c9s6h 8cJc5dQc 6sKc2hKd 2d3s5s8d Ts8s7sAc"));
  }

  @Test
  public void test_omaha_holdem_1789_7c8h9sAhTd_Jd6s2s6c_2hJcThKc_2d8dAdQc_Ks8c4d5s_4cAs4h3s_5dQhTs7d_5h9c2c5c_6hJh4s7s_9h3cTcKh() {
    assertEquals(
      "Jd6s2s6c Ks8c4d5s 5h9c2c5c 4cAs4h3s 5dQhTs7d 9h3cTcKh 2d8dAdQc 2hJcThKc=6hJh4s7s",
      Solver.process("omaha-holdem 7c8h9sAhTd Jd6s2s6c 2hJcThKc 2d8dAdQc Ks8c4d5s 4cAs4h3s 5dQhTs7d 5h9c2c5c 6hJh4s7s 9h3cTcKh"));
  }

  @Test
  public void test_omaha_holdem_1790_4h6c6h8sAc_Ts5h9c4d_7dJhQcAd_6sJs5c9d() {
    assertEquals(
      "Ts5h9c4d 7dJhQcAd 6sJs5c9d",
      Solver.process("omaha-holdem 4h6c6h8sAc Ts5h9c4d 7dJhQcAd 6sJs5c9d"));
  }

  @Test
  public void test_omaha_holdem_1791_5d7hJsKdKs_JhAc5c6c_Qh6d3h2h_9d2dQs4s_5h8h6s8c_8sKhTd6h_AhQd5sTc() {
    assertEquals(
      "Qh6d3h2h 9d2dQs4s AhQd5sTc 5h8h6s8c JhAc5c6c 8sKhTd6h",
      Solver.process("omaha-holdem 5d7hJsKdKs JhAc5c6c Qh6d3h2h 9d2dQs4s 5h8h6s8c 8sKhTd6h AhQd5sTc"));
  }

  @Test
  public void test_omaha_holdem_1792_2c2s3c4hAc_Jc4dKdJd_5h8h5d2h_3hJh7dAs_9c5c3sKc_Qh7h8sKs_5sTh9sJs_AdTd2d9h() {
    assertEquals(
      "5sTh9sJs Qh7h8sKs Jc4dKdJd 3hJh7dAs 5h8h5d2h 9c5c3sKc AdTd2d9h",
      Solver.process("omaha-holdem 2c2s3c4hAc Jc4dKdJd 5h8h5d2h 3hJh7dAs 9c5c3sKc Qh7h8sKs 5sTh9sJs AdTd2d9h"));
  }

  @Test
  public void test_omaha_holdem_1793_6d9hAsJsTs_8c6s2d7s_5cTc3s9c_3d8h8d8s_JdThAh9s_6hQhJh9d_Td7dKd7h_JcKh3c7c() {
    assertEquals(
      "3d8h8d8s Td7dKd7h JcKh3c7c 5cTc3s9c 6hQhJh9d JdThAh9s 8c6s2d7s",
      Solver.process("omaha-holdem 6d9hAsJsTs 8c6s2d7s 5cTc3s9c 3d8h8d8s JdThAh9s 6hQhJh9d Td7dKd7h JcKh3c7c"));
  }

  @Test
  public void test_omaha_holdem_1794_3h5d9sJcTh_Ts8c6c9c_4hTdKhQs_5sKdQc5h_Ks6s3dKc_4s9dAd7d_6h2s7c2c_Js4d9h5c_8d2dAh8s_Jd8h7sQh() {
    assertEquals(
      "6h2s7c2c 8d2dAh8s 4s9dAd7d Ks6s3dKc Ts8c6c9c Js4d9h5c Jd8h7sQh 4hTdKhQs=5sKdQc5h",
      Solver.process("omaha-holdem 3h5d9sJcTh Ts8c6c9c 4hTdKhQs 5sKdQc5h Ks6s3dKc 4s9dAd7d 6h2s7c2c Js4d9h5c 8d2dAh8s Jd8h7sQh"));
  }

  @Test
  public void test_omaha_holdem_1795_2d4s5c5hAd_7c3dKsQd_4dTd6hAc() {
    assertEquals(
      "7c3dKsQd 4dTd6hAc",
      Solver.process("omaha-holdem 2d4s5c5hAd 7c3dKsQd 4dTd6hAc"));
  }

  @Test
  public void test_omaha_holdem_1796_3s5dKdQsTh_8dKs2h9s_3dTc7s6c_9cJs4c9d_Td9hAc3c_TsQc4s5h_2d5s6s7d_QdAh2c6h_Qh8hAs6d() {
    assertEquals(
      "2d5s6s7d QdAh2c6h=Qh8hAs6d 8dKs2h9s 3dTc7s6c=Td9hAc3c TsQc4s5h 9cJs4c9d",
      Solver.process("omaha-holdem 3s5dKdQsTh 8dKs2h9s 3dTc7s6c 9cJs4c9d Td9hAc3c TsQc4s5h 2d5s6s7d QdAh2c6h Qh8hAs6d"));
  }

  @Test
  public void test_omaha_holdem_1797_3d5dJhQcQh_7c6d8s2c_7hTh4d3c_Jd6c5hTd_Tc6h4cKc() {
    assertEquals(
      "7c6d8s2c Tc6h4cKc 7hTh4d3c Jd6c5hTd",
      Solver.process("omaha-holdem 3d5dJhQcQh 7c6d8s2c 7hTh4d3c Jd6c5hTd Tc6h4cKc"));
  }

  @Test
  public void test_omaha_holdem_1798_6c7sKcTcTd_8dJh5cAs_7h4dAc6s_9s2cQd2d_2hKsAdKh_Kd3s5d7d_8c4s5s3h() {
    assertEquals(
      "8c4s5s3h 8dJh5cAs 9s2cQd2d 7h4dAc6s Kd3s5d7d 2hKsAdKh",
      Solver.process("omaha-holdem 6c7sKcTcTd 8dJh5cAs 7h4dAc6s 9s2cQd2d 2hKsAdKh Kd3s5d7d 8c4s5s3h"));
  }

  @Test
  public void test_omaha_holdem_1799_2c4h5s9dQh_9cKh6c8c_2d9s8hAd_3c5d5c8s_3d2sAsTh_AhJh5hJc_Js7cAcKc_Tc9h7h6h_3sJd4sKs_QdTs8dQc() {
    assertEquals(
      "Js7cAcKc 3sJd4sKs Tc9h7h6h 9cKh6c8c AhJh5hJc 2d9s8hAd 3c5d5c8s QdTs8dQc 3d2sAsTh",
      Solver.process("omaha-holdem 2c4h5s9dQh 9cKh6c8c 2d9s8hAd 3c5d5c8s 3d2sAsTh AhJh5hJc Js7cAcKc Tc9h7h6h 3sJd4sKs QdTs8dQc"));
  }

  @Test
  public void test_omaha_holdem_1800_6d8d9hQhTd_Ks3cTs8s_8cAcKd7h_2c8h7cTh_Kh6h9sTc_Js5c7d4s_7s9d4dQd() {
    assertEquals(
      "Ks3cTs8s Kh6h9sTc 2c8h7cTh=8cAcKd7h Js5c7d4s 7s9d4dQd",
      Solver.process("omaha-holdem 6d8d9hQhTd Ks3cTs8s 8cAcKd7h 2c8h7cTh Kh6h9sTc Js5c7d4s 7s9d4dQd"));
  }

  @Test
  public void test_omaha_holdem_1801_2c3s6h7hTc_4s3d5sQh_Jd9hAd9d_ThQc5c5h() {
    assertEquals(
      "Jd9hAd9d ThQc5c5h 4s3d5sQh",
      Solver.process("omaha-holdem 2c3s6h7hTc 4s3d5sQh Jd9hAd9d ThQc5c5h"));
  }

  @Test
  public void test_omaha_holdem_1802_7c8c9hQhTd_Ah2d9sTc_Ac8sKs5d_JcKcTh4s_2c5h3s2s_4d3dQsQc() {
    assertEquals(
      "2c5h3s2s Ac8sKs5d Ah2d9sTc 4d3dQsQc JcKcTh4s",
      Solver.process("omaha-holdem 7c8c9hQhTd Ah2d9sTc Ac8sKs5d JcKcTh4s 2c5h3s2s 4d3dQsQc"));
  }

  @Test
  public void test_omaha_holdem_1803_2c7c8c9cKd_4s5sAdQs_QdKs6s3h_Ah8sJsTd() {
    assertEquals(
      "4s5sAdQs QdKs6s3h Ah8sJsTd",
      Solver.process("omaha-holdem 2c7c8c9cKd 4s5sAdQs QdKs6s3h Ah8sJsTd"));
  }

  @Test
  public void test_omaha_holdem_1804_3d3h5c6hAd_4cJc7d6c_Ks9d5hJs_As7h8hQs_4s8d2h2c_2d7s8s4h() {
    assertEquals(
      "Ks9d5hJs As7h8hQs 4s8d2h2c 2d7s8s4h=4cJc7d6c",
      Solver.process("omaha-holdem 3d3h5c6hAd 4cJc7d6c Ks9d5hJs As7h8hQs 4s8d2h2c 2d7s8s4h"));
  }

  @Test
  public void test_omaha_holdem_1805_5c6d6s7cKc_Ah4h9d9h_Jd6h7hJc_4s8s8c3h_4c6cTd7s() {
    assertEquals(
      "Ah4h9d9h 4s8s8c3h 4c6cTd7s=Jd6h7hJc",
      Solver.process("omaha-holdem 5c6d6s7cKc Ah4h9d9h Jd6h7hJc 4s8s8c3h 4c6cTd7s"));
  }

  @Test
  public void test_omaha_holdem_1806_3d5d7c8h9s_Jd2d5c7h_8cAcKh8s() {
    assertEquals(
      "Jd2d5c7h 8cAcKh8s",
      Solver.process("omaha-holdem 3d5d7c8h9s Jd2d5c7h 8cAcKh8s"));
  }

  @Test
  public void test_omaha_holdem_1807_2h6cJhKhTs_Ac5sQsTc_7h7cKd8d_9h6h3h2d_9c5d7d9s_Kc2s8cTd_9d3d5c4c_5h4h3c2c_KsQhAdAs_6d8s4dTh() {
    assertEquals(
      "9d3d5c4c 9c5d7d9s 7h7cKd8d 6d8s4dTh Kc2s8cTd Ac5sQsTc=KsQhAdAs 5h4h3c2c 9h6h3h2d",
      Solver.process("omaha-holdem 2h6cJhKhTs Ac5sQsTc 7h7cKd8d 9h6h3h2d 9c5d7d9s Kc2s8cTd 9d3d5c4c 5h4h3c2c KsQhAdAs 6d8s4dTh"));
  }

  @Test
  public void test_omaha_holdem_1808_4c5sAsJhQd_ThTc3s2h_Kd6c9sAd_QcAc7h8s_Qh9hJs6d_2d8cKs9c() {
    assertEquals(
      "2d8cKs9c Kd6c9sAd Qh9hJs6d QcAc7h8s ThTc3s2h",
      Solver.process("omaha-holdem 4c5sAsJhQd ThTc3s2h Kd6c9sAd QcAc7h8s Qh9hJs6d 2d8cKs9c"));
  }

  @Test
  public void test_omaha_holdem_1809_6c7d9cAsKc_7cJdKd4s_7s2cJcAd_7hQsJh5d() {
    assertEquals(
      "7hQsJh5d 7cJdKd4s 7s2cJcAd",
      Solver.process("omaha-holdem 6c7d9cAsKc 7cJdKd4s 7s2cJcAd 7hQsJh5d"));
  }

  @Test
  public void test_omaha_holdem_1810_2c2d3d3s5c_6h9hQh4h_5d6cQd7d_5hTcTd7h_8c4c5s9s_Qs8hJhKh_6d4d8sKd_2sKsQcAh_6sAdKc2h() {
    assertEquals(
      "Qs8hJhKh 8c4c5s9s 5d6cQd7d 5hTcTd7h 2sKsQcAh=6sAdKc2h 6d4d8sKd=6h9hQh4h",
      Solver.process("omaha-holdem 2c2d3d3s5c 6h9hQh4h 5d6cQd7d 5hTcTd7h 8c4c5s9s Qs8hJhKh 6d4d8sKd 2sKsQcAh 6sAdKc2h"));
  }

  @Test
  public void test_omaha_holdem_1811_3s8hAcQhTh_5s7s4sKh_4cKc5h2h_6d6sTcKs_JsAhKdAs_9hJd2c2s_9s5c7d3c_6h8sJhQd_5d7h3dTd_8cAdJc9c() {
    assertEquals(
      "5s7s4sKh 9s5c7d3c 6d6sTcKs 5d7h3dTd 8cAdJc9c=9hJd2c2s JsAhKdAs 4cKc5h2h 6h8sJhQd",
      Solver.process("omaha-holdem 3s8hAcQhTh 5s7s4sKh 4cKc5h2h 6d6sTcKs JsAhKdAs 9hJd2c2s 9s5c7d3c 6h8sJhQd 5d7h3dTd 8cAdJc9c"));
  }

  @Test
  public void test_omaha_holdem_1812_3c5sAcJsQd_6d3s2sTs_QsJc3d5d_Kc8dKh9h_9s6h4cKs() {
    assertEquals(
      "9s6h4cKs 6d3s2sTs Kc8dKh9h QsJc3d5d",
      Solver.process("omaha-holdem 3c5sAcJsQd 6d3s2sTs QsJc3d5d Kc8dKh9h 9s6h4cKs"));
  }

  @Test
  public void test_omaha_holdem_1813_2c2s8hJsTc_3hAdQhJc_Jd4d5d3s_Qs2d8c7s_7dQc8dJh_6s2h5s5h_Ac9s4h3d() {
    assertEquals(
      "Ac9s4h3d Jd4d5d3s 3hAdQhJc 7dQc8dJh 6s2h5s5h Qs2d8c7s",
      Solver.process("omaha-holdem 2c2s8hJsTc 3hAdQhJc Jd4d5d3s Qs2d8c7s 7dQc8dJh 6s2h5s5h Ac9s4h3d"));
  }

  @Test
  public void test_omaha_holdem_1814_7d8hJsQhTs_3h8c4sAs_2dKdTcAd_8d6s3s7c_9c3c5h2c_6cTh5d7s() {
    assertEquals(
      "9c3c5h2c 3h8c4sAs 8d6s3s7c 6cTh5d7s 2dKdTcAd",
      Solver.process("omaha-holdem 7d8hJsQhTs 3h8c4sAs 2dKdTcAd 8d6s3s7c 9c3c5h2c 6cTh5d7s"));
  }

  @Test
  public void test_omaha_holdem_1815_5hKsQcQhTc_4h7d5d8d_6c3s6hAc_3hQsAh6s_3c9c2s6d_5c2d3d9s_AdTs4s2h_9hTdAs8s_Jd8hQd2c_JsKc7h4c() {
    assertEquals(
      "3c9c2s6d 4h7d5d8d 5c2d3d9s 6c3s6hAc 9hTdAs8s=AdTs4s2h JsKc7h4c Jd8hQd2c 3hQsAh6s",
      Solver.process("omaha-holdem 5hKsQcQhTc 4h7d5d8d 6c3s6hAc 3hQsAh6s 3c9c2s6d 5c2d3d9s AdTs4s2h 9hTdAs8s Jd8hQd2c JsKc7h4c"));
  }

  @Test
  public void test_omaha_holdem_1816_3d4hJdQcTc_6cAsAcKh_Td8d4s8h_3cQdQsAd_7h9c7d5s_Qh2h4c5d_9hTs4d5h() {
    assertEquals(
      "7h9c7d5s 9hTs4d5h=Td8d4s8h Qh2h4c5d 3cQdQsAd 6cAsAcKh",
      Solver.process("omaha-holdem 3d4hJdQcTc 6cAsAcKh Td8d4s8h 3cQdQsAd 7h9c7d5s Qh2h4c5d 9hTs4d5h"));
  }

  @Test
  public void test_omaha_holdem_1817_4s6dAhJdQs_8c7dKs2s_Qh7h3h4d_2h3sKhAs_ThAd4h2c_JcJs4c5s_5h8d5dTd_QcKc6sTc_9h8h8s5c() {
    assertEquals(
      "8c7dKs2s 5h8d5dTd 9h8h8s5c 2h3sKhAs Qh7h3h4d ThAd4h2c JcJs4c5s QcKc6sTc",
      Solver.process("omaha-holdem 4s6dAhJdQs 8c7dKs2s Qh7h3h4d 2h3sKhAs ThAd4h2c JcJs4c5s 5h8d5dTd QcKc6sTc 9h8h8s5c"));
  }

  @Test
  public void test_omaha_holdem_1818_2c2s4h7s9h_Ks6sQc8d_Jc3cTs5h_JsThKd6h_5cKh6dJh_9c7d8c4c() {
    assertEquals(
      "Jc3cTs5h 5cKh6dJh=JsThKd6h Ks6sQc8d 9c7d8c4c",
      Solver.process("omaha-holdem 2c2s4h7s9h Ks6sQc8d Jc3cTs5h JsThKd6h 5cKh6dJh 9c7d8c4c"));
  }

  @Test
  public void test_omaha_holdem_1819_6d7d8sKcQc_3hQs7h2s_9h6s3s8d_5hAc3d6h_4cKd5s4h_6c2dJcJh_4dKs9dAd_8hTcKhTs() {
    assertEquals(
      "5hAc3d6h 6c2dJcJh 4dKs9dAd 9h6s3s8d 3hQs7h2s 8hTcKhTs 4cKd5s4h",
      Solver.process("omaha-holdem 6d7d8sKcQc 3hQs7h2s 9h6s3s8d 5hAc3d6h 4cKd5s4h 6c2dJcJh 4dKs9dAd 8hTcKhTs"));
  }

  @Test
  public void test_omaha_holdem_1820_5d8h8s9hTc_JcJh2hTh_2c7sQsKd_6d4cKs6h_2d8d7h5h_7cQc4sQd_6cTd3s6s_AcAh3d4h_JdKc9sAs() {
    assertEquals(
      "2c7sQsKd 6d4cKs6h JdKc9sAs 6cTd3s6s JcJh2hTh 7cQc4sQd AcAh3d4h 2d8d7h5h",
      Solver.process("omaha-holdem 5d8h8s9hTc JcJh2hTh 2c7sQsKd 6d4cKs6h 2d8d7h5h 7cQc4sQd 6cTd3s6s AcAh3d4h JdKc9sAs"));
  }

  @Test
  public void test_omaha_holdem_1821_2s6s8cAsTc_4c2c6h4h_8d6cTsQd_5cQs7d5s_3sQhJd2d_KdJs5h4s_Kh7h3h3c_9cQcJhAh() {
    assertEquals(
      "3sQhJd2d Kh7h3h3c 9cQcJhAh 4c2c6h4h 8d6cTsQd KdJs5h4s 5cQs7d5s",
      Solver.process("omaha-holdem 2s6s8cAsTc 4c2c6h4h 8d6cTsQd 5cQs7d5s 3sQhJd2d KdJs5h4s Kh7h3h3c 9cQcJhAh"));
  }

  @Test
  public void test_omaha_holdem_1822_2s3c8d9dAd_3dAs4s2c_8sQcTsTd_KcThQhTc_4d7dKdAc_Kh2dJcAh_9c2hQd7c_4h8h9h6d_5c8cJs7s_3hQs6sKs() {
    assertEquals(
      "3hQs6sKs 5c8cJs7s 8sQcTsTd=KcThQhTc 9c2hQd7c 4h8h9h6d Kh2dJcAh 3dAs4s2c 4d7dKdAc",
      Solver.process("omaha-holdem 2s3c8d9dAd 3dAs4s2c 8sQcTsTd KcThQhTc 4d7dKdAc Kh2dJcAh 9c2hQd7c 4h8h9h6d 5c8cJs7s 3hQs6sKs"));
  }

  @Test
  public void test_omaha_holdem_1823_3s4s8sAdQh_4hJc5hQc_6hQdQs2d() {
    assertEquals(
      "4hJc5hQc 6hQdQs2d",
      Solver.process("omaha-holdem 3s4s8sAdQh 4hJc5hQc 6hQdQs2d"));
  }

  @Test
  public void test_omaha_holdem_1824_2c4s5c6s8c_Kc2s6hJc_3s8dQs4c_QdQh5h3h_Ad7hQcKd() {
    assertEquals(
      "Ad7hQcKd 3s8dQs4c=QdQh5h3h Kc2s6hJc",
      Solver.process("omaha-holdem 2c4s5c6s8c Kc2s6hJc 3s8dQs4c QdQh5h3h Ad7hQcKd"));
  }

  @Test
  public void test_omaha_holdem_1825_2h3cKcQsTh_8dAhKd9d_Ts7s2sQc_Ac6dQdJh_2cTd3dTc_5c4sKh7h_4c4dAd8c_4h6sJd3h() {
    assertEquals(
      "4h6sJd3h 4c4dAd8c 5c4sKh7h 8dAhKd9d Ts7s2sQc 2cTd3dTc Ac6dQdJh",
      Solver.process("omaha-holdem 2h3cKcQsTh 8dAhKd9d Ts7s2sQc Ac6dQdJh 2cTd3dTc 5c4sKh7h 4c4dAd8c 4h6sJd3h"));
  }

  @Test
  public void test_omaha_holdem_1826_3h8sAsJcTc_7s4hKc2h_TsKdTdAd() {
    assertEquals(
      "7s4hKc2h TsKdTdAd",
      Solver.process("omaha-holdem 3h8sAsJcTc 7s4hKc2h TsKdTdAd"));
  }

  @Test
  public void test_omaha_holdem_1827_3d4s5s6hAs_8d7hQdTh_5dKc9h6c_5c9s8sJs_Kd4h7dKh_AcJh4c2h() {
    assertEquals(
      "5dKc9h6c AcJh4c2h Kd4h7dKh 8d7hQdTh 5c9s8sJs",
      Solver.process("omaha-holdem 3d4s5s6hAs 8d7hQdTh 5dKc9h6c 5c9s8sJs Kd4h7dKh AcJh4c2h"));
  }

  @Test
  public void test_omaha_holdem_1828_2s3c5c8sQc_AcQh8h9c_4s7dKd6d_4hAd6s2c_Ts6h5s5h_Jh3s9d3h_2dAh7hQd_JsJcTdKc_Tc7s9h7c_3dThAsKs() {
    assertEquals(
      "3dThAsKs 2dAh7hQd Jh3s9d3h Ts6h5s5h 4hAd6s2c=4s7dKd6d Tc7s9h7c JsJcTdKc AcQh8h9c",
      Solver.process("omaha-holdem 2s3c5c8sQc AcQh8h9c 4s7dKd6d 4hAd6s2c Ts6h5s5h Jh3s9d3h 2dAh7hQd JsJcTdKc Tc7s9h7c 3dThAsKs"));
  }

  @Test
  public void test_omaha_holdem_1829_2d4d5hJhTs_AcKs8d2s_3d8sAdQd() {
    assertEquals(
      "AcKs8d2s 3d8sAdQd",
      Solver.process("omaha-holdem 2d4d5hJhTs AcKs8d2s 3d8sAdQd"));
  }

  @Test
  public void test_omaha_holdem_1830_2h2s3sKdTh_6cAc7h7s_5c8hAhQh_JdJh6hKh_TcAd3d4h_5h9d2d8d_7dAs5s5d_3c2c4d9s() {
    assertEquals(
      "5c8hAhQh 7dAs5s5d 6cAc7h7s TcAd3d4h JdJh6hKh 5h9d2d8d 3c2c4d9s",
      Solver.process("omaha-holdem 2h2s3sKdTh 6cAc7h7s 5c8hAhQh JdJh6hKh TcAd3d4h 5h9d2d8d 7dAs5s5d 3c2c4d9s"));
  }

  @Test
  public void test_omaha_holdem_1831_6s8hAcAdQh_2c4s5cTc_Ah3h4dQs_8sAs6dKd_2h4h8cJh_7c2d9sQd_4c8dQc3d_6hJsKhJc_Td3s5hKc() {
    assertEquals(
      "2c4s5cTc Td3s5hKc 2h4h8cJh 6hJsKhJc 4c8dQc3d 7c2d9sQd 8sAs6dKd Ah3h4dQs",
      Solver.process("omaha-holdem 6s8hAcAdQh 2c4s5cTc Ah3h4dQs 8sAs6dKd 2h4h8cJh 7c2d9sQd 4c8dQc3d 6hJsKhJc Td3s5hKc"));
  }

  @Test
  public void test_omaha_holdem_1832_5d7s9dAdQd_TcJc6h2d_QhJdAsKh_3sTd2h4h_3dKs9cQc_7dThTs2s() {
    assertEquals(
      "3sTd2h4h TcJc6h2d 7dThTs2s 3dKs9cQc QhJdAsKh",
      Solver.process("omaha-holdem 5d7s9dAdQd TcJc6h2d QhJdAsKh 3sTd2h4h 3dKs9cQc 7dThTs2s"));
  }

  @Test
  public void test_omaha_holdem_1833_6c7d8c8sQd_3c9dTs7s_KdAd3h2c_6hQh5cJd_Kh6s3s2h_ThJs2sAh_AsQcAc8h_KsTdQsJc_4h7h6d3d_4s5h4c9c() {
    assertEquals(
      "ThJs2sAh KdAd3h2c Kh6s3s2h 4h7h6d3d 6hQh5cJd KsTdQsJc 4s5h4c9c 3c9dTs7s AsQcAc8h",
      Solver.process("omaha-holdem 6c7d8c8sQd 3c9dTs7s KdAd3h2c 6hQh5cJd Kh6s3s2h ThJs2sAh AsQcAc8h KsTdQsJc 4h7h6d3d 4s5h4c9c"));
  }

  @Test
  public void test_omaha_holdem_1834_3c3d9cAhKs_KhQh6c2d_8c4cJs3h_Ts5s8d8h() {
    assertEquals(
      "Ts5s8d8h KhQh6c2d 8c4cJs3h",
      Solver.process("omaha-holdem 3c3d9cAhKs KhQh6c2d 8c4cJs3h Ts5s8d8h"));
  }

  @Test
  public void test_omaha_holdem_1835_2c4d7c7sQd_Ks6hJhQs_5c2s9c5s_9s7d3h4c() {
    assertEquals(
      "5c2s9c5s Ks6hJhQs 9s7d3h4c",
      Solver.process("omaha-holdem 2c4d7c7sQd Ks6hJhQs 5c2s9c5s 9s7d3h4c"));
  }

  @Test
  public void test_omaha_holdem_1836_2c3s4d8s9c_Kh4hQc6c_AsJs5d8h_Jc4sJdJh_9hAcKs8d() {
    assertEquals(
      "Kh4hQc6c Jc4sJdJh 9hAcKs8d AsJs5d8h",
      Solver.process("omaha-holdem 2c3s4d8s9c Kh4hQc6c AsJs5d8h Jc4sJdJh 9hAcKs8d"));
  }

  @Test
  public void test_omaha_holdem_1837_2h4d7sQhTd_9d7h2sKc_9s8sAcKd_JdKs8c5s_4sAh6s8h_7c3sJcTh_2cJh5hJs_6c7d6h3c_9c6d3d2d_Kh4hQd5c() {
    assertEquals(
      "JdKs8c5s 9s8sAcKd 9c6d3d2d 4sAh6s8h 6c7d6h3c 2cJh5hJs 9d7h2sKc 7c3sJcTh Kh4hQd5c",
      Solver.process("omaha-holdem 2h4d7sQhTd 9d7h2sKc 9s8sAcKd JdKs8c5s 4sAh6s8h 7c3sJcTh 2cJh5hJs 6c7d6h3c 9c6d3d2d Kh4hQd5c"));
  }

  @Test
  public void test_omaha_holdem_1838_5cKhKsQcQh_Tc8s6d4s_Qs4c6sKd_As7c9d9h_7d5sAh5h_Ac3cThAd_2dTd5d3s() {
    assertEquals(
      "Tc8s6d4s 2dTd5d3s As7c9d9h Ac3cThAd 7d5sAh5h Qs4c6sKd",
      Solver.process("omaha-holdem 5cKhKsQcQh Tc8s6d4s Qs4c6sKd As7c9d9h 7d5sAh5h Ac3cThAd 2dTd5d3s"));
  }

  @Test
  public void test_omaha_holdem_1839_8h8sAdAhJd_5d6s7s5h_5cQd8c6h_Qs2cJh7c_4dQcKh3c_3h9h6cKs_ThAsKc8d_Qh4s3d5s_4c2d3s9s() {
    assertEquals(
      "4c2d3s9s Qh4s3d5s 3h9h6cKs 4dQcKh3c 5d6s7s5h Qs2cJh7c 5cQd8c6h ThAsKc8d",
      Solver.process("omaha-holdem 8h8sAdAhJd 5d6s7s5h 5cQd8c6h Qs2cJh7c 4dQcKh3c 3h9h6cKs ThAsKc8d Qh4s3d5s 4c2d3s9s"));
  }

  @Test
  public void test_omaha_holdem_1840_3d4s8c9dAs_8h5hTc2c_8sQdJsKc() {
    assertEquals(
      "8sQdJsKc 8h5hTc2c",
      Solver.process("omaha-holdem 3d4s8c9dAs 8h5hTc2c 8sQdJsKc"));
  }

  @Test
  public void test_omaha_holdem_1841_5d8d9hQcQh_2c5h5c7d_9s2sKsAc() {
    assertEquals(
      "9s2sKsAc 2c5h5c7d",
      Solver.process("omaha-holdem 5d8d9hQcQh 2c5h5c7d 9s2sKsAc"));
  }

  @Test
  public void test_omaha_holdem_1842_2s6d8dAdQs_As2h3h5d_9cTd2c3d_QdAcKs5c_7sJd2d9s_4h5hJs6s_TcThTsJc() {
    assertEquals(
      "4h5hJs6s TcThTsJc As2h3h5d QdAcKs5c 9cTd2c3d 7sJd2d9s",
      Solver.process("omaha-holdem 2s6d8dAdQs As2h3h5d 9cTd2c3d QdAcKs5c 7sJd2d9s 4h5hJs6s TcThTsJc"));
  }

  @Test
  public void test_omaha_holdem_1843_2d2h5d9dKc_6hAd5h2c_3s7d7h8d_AsQd4c8c_Js9s3c5s() {
    assertEquals(
      "AsQd4c8c Js9s3c5s 3s7d7h8d 6hAd5h2c",
      Solver.process("omaha-holdem 2d2h5d9dKc 6hAd5h2c 3s7d7h8d AsQd4c8c Js9s3c5s"));
  }

  @Test
  public void test_omaha_holdem_1844_5d5h5s8dKc_6c2sQc7c_Ts6d9hAs_KhAc5c4h_2c6s3c2d() {
    assertEquals(
      "6c2sQc7c Ts6d9hAs 2c6s3c2d KhAc5c4h",
      Solver.process("omaha-holdem 5d5h5s8dKc 6c2sQc7c Ts6d9hAs KhAc5c4h 2c6s3c2d"));
  }

  @Test
  public void test_omaha_holdem_1845_5c8c9c9hQs_5hJh2hQc_4c3sTh7c_As4h6dQd_8dKsJd5s_8s4s9dTs_Td9s2c4d_3cKh2dKc() {
    assertEquals(
      "8dKsJd5s 5hJh2hQc As4h6dQd Td9s2c4d 4c3sTh7c 3cKh2dKc 8s4s9dTs",
      Solver.process("omaha-holdem 5c8c9c9hQs 5hJh2hQc 4c3sTh7c As4h6dQd 8dKsJd5s 8s4s9dTs Td9s2c4d 3cKh2dKc"));
  }

  @Test
  public void test_omaha_holdem_1846_2d3d4h8h9h_2h5c5d4c_4d9d7d9s_As6sKd8c_QdAhKh5s_7s9c2c2s() {
    assertEquals(
      "As6sKd8c 2h5c5d4c 7s9c2c2s 4d9d7d9s QdAhKh5s",
      Solver.process("omaha-holdem 2d3d4h8h9h 2h5c5d4c 4d9d7d9s As6sKd8c QdAhKh5s 7s9c2c2s"));
  }

  @Test
  public void test_omaha_holdem_1847_7h8c9hQcTd_KdAh4c2h_QsTc2d9s_Ad5cQhKs() {
    assertEquals(
      "KdAh4c2h Ad5cQhKs QsTc2d9s",
      Solver.process("omaha-holdem 7h8c9hQcTd KdAh4c2h QsTc2d9s Ad5cQhKs"));
  }

  @Test
  public void test_omaha_holdem_1848_2c7h8d9dKc_2dJs8h4h_3h5cJd6c_5h7d4cKh_6d3dTc8c_QhQs2sKd_4d2hQd5s_As6h4s5d() {
    assertEquals(
      "4d2hQd5s 2dJs8h4h QhQs2sKd 5h7d4cKh 3h5cJd6c=As6h4s5d 6d3dTc8c",
      Solver.process("omaha-holdem 2c7h8d9dKc 2dJs8h4h 3h5cJd6c 5h7d4cKh 6d3dTc8c QhQs2sKd 4d2hQd5s As6h4s5d"));
  }

  @Test
  public void test_omaha_holdem_1849_5d7c7d9sJs_2s2d9h6s_ThAsKh5s_5c9cTd9d_Qc4cTc7s_Ac8dJh8h_2h6cTs3d_QdAd8c6d_8s4sQs6h() {
    assertEquals(
      "2h6cTs3d ThAsKh5s 2s2d9h6s Ac8dJh8h Qc4cTc7s 8s4sQs6h=QdAd8c6d 5c9cTd9d",
      Solver.process("omaha-holdem 5d7c7d9sJs 2s2d9h6s ThAsKh5s 5c9cTd9d Qc4cTc7s Ac8dJh8h 2h6cTs3d QdAd8c6d 8s4sQs6h"));
  }

  @Test
  public void test_omaha_holdem_1850_2d2s7s8hJs_4hJc4c4d_Qh2h3s8c_Ad6s5h8d_6dQc3cKh_Th9h9d9s_Td3hKs5s_Ts6h3d5c_AhTc9cQd() {
    assertEquals(
      "Ts6h3d5c 6dQc3cKh Ad6s5h8d 4hJc4c4d AhTc9cQd=Th9h9d9s Td3hKs5s Qh2h3s8c",
      Solver.process("omaha-holdem 2d2s7s8hJs 4hJc4c4d Qh2h3s8c Ad6s5h8d 6dQc3cKh Th9h9d9s Td3hKs5s Ts6h3d5c AhTc9cQd"));
  }

  @Test
  public void test_omaha_holdem_1851_3c4h9cKdTd_6c5d4dTh_8s3s8c2c_TcKc4s6d_Qd3d9sTs_7c7hKs8h_2hAh4c9h_5cQsJh5h_7dQc6sQh() {
    assertEquals(
      "8s3s8c2c 7dQc6sQh 7c7hKs8h 2hAh4c9h 6c5d4dTh Qd3d9sTs TcKc4s6d 5cQsJh5h",
      Solver.process("omaha-holdem 3c4h9cKdTd 6c5d4dTh 8s3s8c2c TcKc4s6d Qd3d9sTs 7c7hKs8h 2hAh4c9h 5cQsJh5h 7dQc6sQh"));
  }

  @Test
  public void test_omaha_holdem_1852_4d6hAdQcQh_TsAhKh2d_Qd9d6s5d_9c3sJcKd_8s9h9s5h_Tc2s5cTd_8hJdAs4h_7sKc2hAc_3h8cThJs() {
    assertEquals(
      "3h8cThJs 9c3sJcKd 8s9h9s5h Tc2s5cTd 8hJdAs4h 7sKc2hAc=TsAhKh2d Qd9d6s5d",
      Solver.process("omaha-holdem 4d6hAdQcQh TsAhKh2d Qd9d6s5d 9c3sJcKd 8s9h9s5h Tc2s5cTd 8hJdAs4h 7sKc2hAc 3h8cThJs"));
  }

  @Test
  public void test_omaha_holdem_1853_2h2sAcQdTd_3d6s3s9c_Ts7s4d5c_Kc4c2d5s_KdJhQhKs() {
    assertEquals(
      "3d6s3s9c Ts7s4d5c Kc4c2d5s KdJhQhKs",
      Solver.process("omaha-holdem 2h2sAcQdTd 3d6s3s9c Ts7s4d5c Kc4c2d5s KdJhQhKs"));
  }

  @Test
  public void test_omaha_holdem_1854_3s5c5h9hKs_Js6d5s4d_Td6c9d5d_8c7s2cJh_Qs2sQdQh_8d7cTcKd() {
    assertEquals(
      "8c7s2cJh Qs2sQdQh 8d7cTcKd Js6d5s4d Td6c9d5d",
      Solver.process("omaha-holdem 3s5c5h9hKs Js6d5s4d Td6c9d5d 8c7s2cJh Qs2sQdQh 8d7cTcKd"));
  }

  @Test
  public void test_omaha_holdem_1855_5s9dJsKdQc_JcQd8d2c_Ad5hAs2d_3cKh2sTd_Qh8h2hTh() {
    assertEquals(
      "Ad5hAs2d JcQd8d2c 3cKh2sTd=Qh8h2hTh",
      Solver.process("omaha-holdem 5s9dJsKdQc JcQd8d2c Ad5hAs2d 3cKh2sTd Qh8h2hTh"));
  }

  @Test
  public void test_omaha_holdem_1856_3d7c9sTcTs_Th8d9h6h_9d8h6c3h_7sAsQh7h_9cAh6sKc_Qd7d8s5d_Jd5s3cAd_TdJcKs2s() {
    assertEquals(
      "Jd5s3cAd Qd7d8s5d 9cAh6sKc TdJcKs2s 9d8h6c3h 7sAsQh7h Th8d9h6h",
      Solver.process("omaha-holdem 3d7c9sTcTs Th8d9h6h 9d8h6c3h 7sAsQh7h 9cAh6sKc Qd7d8s5d Jd5s3cAd TdJcKs2s"));
  }

  @Test
  public void test_omaha_holdem_1857_2c2s6dKcTs_8dAc9dAh_7d9sJsJc_5dKd3s9c_6c4cQd8s_8hKh3hAd() {
    assertEquals(
      "6c4cQd8s 7d9sJsJc 5dKd3s9c 8hKh3hAd 8dAc9dAh",
      Solver.process("omaha-holdem 2c2s6dKcTs 8dAc9dAh 7d9sJsJc 5dKd3s9c 6c4cQd8s 8hKh3hAd"));
  }

  @Test
  public void test_omaha_holdem_1858_2h5h9sJdKd_9cThTd2c_4c6dQc5d_AhJc8sQh() {
    assertEquals(
      "4c6dQc5d AhJc8sQh 9cThTd2c",
      Solver.process("omaha-holdem 2h5h9sJdKd 9cThTd2c 4c6dQc5d AhJc8sQh"));
  }

  @Test
  public void test_omaha_holdem_1859_4d4h6c6dTs_8cQsAh8s_2d9dQhJh_Ks7d9c6h_4c7sTc7h_QcAc8h3s_5s3dJdTh_9s2sJs4s_3c5d6s5c() {
    assertEquals(
      "2d9dQhJh QcAc8h3s 8cQsAh8s 5s3dJdTh 9s2sJs4s 3c5d6s5c Ks7d9c6h 4c7sTc7h",
      Solver.process("omaha-holdem 4d4h6c6dTs 8cQsAh8s 2d9dQhJh Ks7d9c6h 4c7sTc7h QcAc8h3s 5s3dJdTh 9s2sJs4s 3c5d6s5c"));
  }

  @Test
  public void test_omaha_holdem_1860_4hAhJdKsQc_5hAc6hJs_7d5c4d3c_JcTh9d8d_8c9cQs6c_9s7cKd2d() {
    assertEquals(
      "7d5c4d3c 8c9cQs6c 9s7cKd2d 5hAc6hJs JcTh9d8d",
      Solver.process("omaha-holdem 4hAhJdKsQc 5hAc6hJs 7d5c4d3c JcTh9d8d 8c9cQs6c 9s7cKd2d"));
  }

  @Test
  public void test_omaha_holdem_1861_3c5c5sAhQd_Ks2hQs6d_3hKc4dAc_Jh6s5d7h_8cTd8sQc_9c6c9d4h_4c2d2c7s_7dAdKd6h_3sTc9s4s() {
    assertEquals(
      "3sTc9s4s 9c6c9d4h 8cTd8sQc Ks2hQs6d 3hKc4dAc=7dAdKd6h Jh6s5d7h 4c2d2c7s",
      Solver.process("omaha-holdem 3c5c5sAhQd Ks2hQs6d 3hKc4dAc Jh6s5d7h 8cTd8sQc 9c6c9d4h 4c2d2c7s 7dAdKd6h 3sTc9s4s"));
  }

  @Test
  public void test_omaha_holdem_1862_2h3h5s6hAh_9c2s6dJc_8c7dAd3c_5c8dAc8s_3d7sKc5h_Td7cJdKh_7hQdKd9d() {
    assertEquals(
      "Td7cJdKh 7hQdKd9d 3d7sKc5h 9c2s6dJc 8c7dAd3c 5c8dAc8s",
      Solver.process("omaha-holdem 2h3h5s6hAh 9c2s6dJc 8c7dAd3c 5c8dAc8s 3d7sKc5h Td7cJdKh 7hQdKd9d"));
  }

  @Test
  public void test_omaha_holdem_1863_3h6c7c9dTh_4c5dJhKd_7h7d6d4s_Qs3dQdAs_5s9hTd4d_5hTsAd2s() {
    assertEquals(
      "5hTsAd2s Qs3dQdAs 7h7d6d4s 4c5dJhKd=5s9hTd4d",
      Solver.process("omaha-holdem 3h6c7c9dTh 4c5dJhKd 7h7d6d4s Qs3dQdAs 5s9hTd4d 5hTsAd2s"));
  }

  @Test
  public void test_omaha_holdem_1864_3d4c8sTdTs_8dQd5c6c_Jc7c9d6d_AdJs9c4s_Tc7d4h8c_2h7s5h3s_3h3c5sQc_2s6s8hTh_9sKs4d9h() {
    assertEquals(
      "Jc7c9d6d 2h7s5h3s AdJs9c4s 8dQd5c6c 9sKs4d9h 3h3c5sQc 2s6s8hTh=Tc7d4h8c",
      Solver.process("omaha-holdem 3d4c8sTdTs 8dQd5c6c Jc7c9d6d AdJs9c4s Tc7d4h8c 2h7s5h3s 3h3c5sQc 2s6s8hTh 9sKs4d9h"));
  }

  @Test
  public void test_omaha_holdem_1865_4s6c9cJsTc_6sAd7s4c_JcTd6hJd_Qd3dAs8d_KcTh4d5h_Kd5d8c2s_QhTsJh8s_5c5sKhQs_AcAh9d8h() {
    assertEquals(
      "Kd5d8c2s AcAh9d8h 6sAd7s4c KcTh4d5h JcTd6hJd Qd3dAs8d=QhTsJh8s 5c5sKhQs",
      Solver.process("omaha-holdem 4s6c9cJsTc 6sAd7s4c JcTd6hJd Qd3dAs8d KcTh4d5h Kd5d8c2s QhTsJh8s 5c5sKhQs AcAh9d8h"));
  }

  @Test
  public void test_omaha_holdem_1866_3d9cAcKhTd_AsTs4s4d_Ad2c4c8s_2s8h2h3h_6h7c5s3s_3c7sAh5c_7dJs5h9s() {
    assertEquals(
      "6h7c5s3s 2s8h2h3h 7dJs5h9s Ad2c4c8s 3c7sAh5c AsTs4s4d",
      Solver.process("omaha-holdem 3d9cAcKhTd AsTs4s4d Ad2c4c8s 2s8h2h3h 6h7c5s3s 3c7sAh5c 7dJs5h9s"));
  }

  @Test
  public void test_omaha_holdem_1867_2c4d9cJsQh_Qs9sQc8s_Ac9h5c8d() {
    assertEquals(
      "Ac9h5c8d Qs9sQc8s",
      Solver.process("omaha-holdem 2c4d9cJsQh Qs9sQc8s Ac9h5c8d"));
  }

  @Test
  public void test_omaha_holdem_1868_3s7sAdAsJc_6c4hJs2c_Ac9sKc4s_TcKhTh4d_5c5hQcTd_Jh7dKd8h_8c4c9hQd_8dTs3c8s() {
    assertEquals(
      "8c4c9hQd 5c5hQcTd TcKhTh4d 6c4hJs2c Jh7dKd8h Ac9sKc4s 8dTs3c8s",
      Solver.process("omaha-holdem 3s7sAdAsJc 6c4hJs2c Ac9sKc4s TcKhTh4d 5c5hQcTd Jh7dKd8h 8c4c9hQd 8dTs3c8s"));
  }

  @Test
  public void test_omaha_holdem_1869_8d9dAdJhKs_As2s5dTh_7h6c6hQh_5s2dJc7d_3hQd7sJs_Qs3c6s4s() {
    assertEquals(
      "Qs3c6s4s 7h6c6hQh 3hQd7sJs As2s5dTh 5s2dJc7d",
      Solver.process("omaha-holdem 8d9dAdJhKs As2s5dTh 7h6c6hQh 5s2dJc7d 3hQd7sJs Qs3c6s4s"));
  }

  @Test
  public void test_omaha_holdem_1870_5c5s8c9hKh_7c7sJs3h_JdAdQs6d_5d3dTc5h_7h8d9sKs() {
    assertEquals(
      "JdAdQs6d 7c7sJs3h 7h8d9sKs 5d3dTc5h",
      Solver.process("omaha-holdem 5c5s8c9hKh 7c7sJs3h JdAdQs6d 5d3dTc5h 7h8d9sKs"));
  }

  @Test
  public void test_omaha_holdem_1871_3d5c5d8cQd_6sAd8d4d_QsAs2sAh_6h4c9dQc_4hKsJsKd_3s6cJd9h_2c2dTc7c_9s5h3cAc_5s7dKc4s() {
    assertEquals(
      "2c2dTc7c 3s6cJd9h 6h4c9dQc 4hKsJsKd QsAs2sAh 5s7dKc4s 6sAd8d4d 9s5h3cAc",
      Solver.process("omaha-holdem 3d5c5d8cQd 6sAd8d4d QsAs2sAh 6h4c9dQc 4hKsJsKd 3s6cJd9h 2c2dTc7c 9s5h3cAc 5s7dKc4s"));
  }

  @Test
  public void test_omaha_holdem_1872_3s4h7c9sAs_KsTsJs8s_8d7dKhAd() {
    assertEquals(
      "8d7dKhAd KsTsJs8s",
      Solver.process("omaha-holdem 3s4h7c9sAs KsTsJs8s 8d7dKhAd"));
  }

  @Test
  public void test_omaha_holdem_1873_3d4cKcKhQh_JhTcJsQc_5c9c7s9h_2c2h3s8d_Jd5d3c7c_9s4dAd3h() {
    assertEquals(
      "2c2h3s8d Jd5d3c7c 9s4dAd3h 5c9c7s9h JhTcJsQc",
      Solver.process("omaha-holdem 3d4cKcKhQh JhTcJsQc 5c9c7s9h 2c2h3s8d Jd5d3c7c 9s4dAd3h"));
  }

  @Test
  public void test_omaha_holdem_1874_4c5d9dAcKh_3h5h9s9h_7c2c3c4d_Jc2h6dKc_9c6sQc6c_Kd4h2sJh_8hTsTdTc_Ah4s6h8c_3s8s2dTh_QdQh3d7h() {
    assertEquals(
      "9c6sQc6c 8hTsTdTc QdQh3d7h Jc2h6dKc Kd4h2sJh Ah4s6h8c 3h5h9s9h 3s8s2dTh=7c2c3c4d",
      Solver.process("omaha-holdem 4c5d9dAcKh 3h5h9s9h 7c2c3c4d Jc2h6dKc 9c6sQc6c Kd4h2sJh 8hTsTdTc Ah4s6h8c 3s8s2dTh QdQh3d7h"));
  }

  @Test
  public void test_omaha_holdem_1875_3c5s6dJdQd_TsJcQsTc_5h8dAc2d() {
    assertEquals(
      "TsJcQsTc 5h8dAc2d",
      Solver.process("omaha-holdem 3c5s6dJdQd TsJcQsTc 5h8dAc2d"));
  }

  @Test
  public void test_omaha_holdem_1876_4s5c7cKhTc_4d2c6dJc_Th2dQdTd_QhAhQc5h_3c2s3s8s() {
    assertEquals(
      "3c2s3s8s QhAhQc5h Th2dQdTd 4d2c6dJc",
      Solver.process("omaha-holdem 4s5c7cKhTc 4d2c6dJc Th2dQdTd QhAhQc5h 3c2s3s8s"));
  }

  @Test
  public void test_omaha_holdem_1877_3s9hQdQsTs_9d7sAhKh_Jh5hAsQc_7d3c6hKd_6d8c4d2h_AcKc3d2c_Th4h5s6s_8d6cKs4c() {
    assertEquals(
      "6d8c4d2h 8d6cKs4c 7d3c6hKd AcKc3d2c 9d7sAhKh Jh5hAsQc Th4h5s6s",
      Solver.process("omaha-holdem 3s9hQdQsTs 9d7sAhKh Jh5hAsQc 7d3c6hKd 6d8c4d2h AcKc3d2c Th4h5s6s 8d6cKs4c"));
  }

  @Test
  public void test_omaha_holdem_1878_3d5h6sJhJs_8c5d4hJc_9s6hQs5s_KdTc2s8d_3c7h4d4s_7sAcKc2c() {
    assertEquals(
      "KdTc2s8d 7sAcKc2c 9s6hQs5s 3c7h4d4s 8c5d4hJc",
      Solver.process("omaha-holdem 3d5h6sJhJs 8c5d4hJc 9s6hQs5s KdTc2s8d 3c7h4d4s 7sAcKc2c"));
  }

  @Test
  public void test_omaha_holdem_1879_3s4h4s8hQh_3c3hQcKd_Qs4c5s9d_Ks8d7sQd_6c5hJs8c_JhAcTcAh_2cKc9sJd_As5cJc2h_6d9cAd7d_Td3d6sTs() {
    assertEquals(
      "2cKc9sJd 6d9cAd7d As5cJc2h 6c5hJs8c Td3d6sTs Ks8d7sQd JhAcTcAh 3c3hQcKd Qs4c5s9d",
      Solver.process("omaha-holdem 3s4h4s8hQh 3c3hQcKd Qs4c5s9d Ks8d7sQd 6c5hJs8c JhAcTcAh 2cKc9sJd As5cJc2h 6d9cAd7d Td3d6sTs"));
  }

  @Test
  public void test_omaha_holdem_1880_2c3h5hJhKc_Tc7dAdJd_QsTd8c6d_9dQc8h9s_Qh9c5d2d_7h6h6c2s_AcJcAh4h_4d5s8s8d_Qd3cJsTh_6sKhKsTs() {
    assertEquals(
      "QsTd8c6d 4d5s8s8d 9dQc8h9s Tc7dAdJd Qh9c5d2d Qd3cJsTh 6sKhKsTs 7h6h6c2s AcJcAh4h",
      Solver.process("omaha-holdem 2c3h5hJhKc Tc7dAdJd QsTd8c6d 9dQc8h9s Qh9c5d2d 7h6h6c2s AcJcAh4h 4d5s8s8d Qd3cJsTh 6sKhKsTs"));
  }

  @Test
  public void test_omaha_holdem_1881_2h5cJsTcTh_4hQd9hJh_Jd6cTsKh_7s9sAh7h_4d7cAs8c_8s4cJc8h() {
    assertEquals(
      "4d7cAs8c 7s9sAh7h 8s4cJc8h 4hQd9hJh Jd6cTsKh",
      Solver.process("omaha-holdem 2h5cJsTcTh 4hQd9hJh Jd6cTsKh 7s9sAh7h 4d7cAs8c 8s4cJc8h"));
  }

  @Test
  public void test_omaha_holdem_1882_9c9d9hQcTd_QsQdAs6d_2c5h2h6c_Ts3s8h4c_2sJhKd4h_5dKc3h4s_AdKh3c7d() {
    assertEquals(
      "Ts3s8h4c 5dKc3h4s AdKh3c7d 2sJhKd4h 2c5h2h6c QsQdAs6d",
      Solver.process("omaha-holdem 9c9d9hQcTd QsQdAs6d 2c5h2h6c Ts3s8h4c 2sJhKd4h 5dKc3h4s AdKh3c7d"));
  }

  @Test
  public void test_omaha_holdem_1883_3c3h5d7cQd_2sJdJh8d_3dTsAd6s_5sQc2c3s() {
    assertEquals(
      "2sJdJh8d 3dTsAd6s 5sQc2c3s",
      Solver.process("omaha-holdem 3c3h5d7cQd 2sJdJh8d 3dTsAd6s 5sQc2c3s"));
  }

  @Test
  public void test_omaha_holdem_1884_3c5d6s9cQc_2cKs7cTc_5c7d3hTs() {
    assertEquals(
      "5c7d3hTs 2cKs7cTc",
      Solver.process("omaha-holdem 3c5d6s9cQc 2cKs7cTc 5c7d3hTs"));
  }

  @Test
  public void test_omaha_holdem_1885_2s5h7cJcQh_TsKh2h2c_Qs6h4s8s_3h4hJdQd_Kd9h6cTh_Kc3c6s3d_7h7dAh5s_3s8c4dTd_Tc7s8h9d_5d6d8d9s() {
    assertEquals(
      "3s8c4dTd Kd9h6cTh Kc3c6s3d 5d6d8d9s Tc7s8h9d Qs6h4s8s 3h4hJdQd TsKh2h2c 7h7dAh5s",
      Solver.process("omaha-holdem 2s5h7cJcQh TsKh2h2c Qs6h4s8s 3h4hJdQd Kd9h6cTh Kc3c6s3d 7h7dAh5s 3s8c4dTd Tc7s8h9d 5d6d8d9s"));
  }

  @Test
  public void test_omaha_holdem_1886_2d4cAsKsTc_9s3h7h3d_Kd5d9d3s_Jc4hTd9c_Jh6h8d8c_5cJd6c3c_Ad2sAh8h_QhKhQdQc_Th2h6d5h_Kc9h4d7c() {
    assertEquals(
      "9s3h7h3d Jh6h8d8c QhKhQdQc Th2h6d5h Jc4hTd9c Kc9h4d7c Ad2sAh8h 5cJd6c3c=Kd5d9d3s",
      Solver.process("omaha-holdem 2d4cAsKsTc 9s3h7h3d Kd5d9d3s Jc4hTd9c Jh6h8d8c 5cJd6c3c Ad2sAh8h QhKhQdQc Th2h6d5h Kc9h4d7c"));
  }

  @Test
  public void test_omaha_holdem_1887_3s4d8s9hAs_4h7hKhKs_Kd6c2hAd_5h5cQdTs_8d7d6s9d_KcQsTcJd_Js5dAhJc_3c9cQh3d_6hTd7s8h_Ac8c5s2c() {
    assertEquals(
      "KcQsTcJd 5h5cQdTs 6hTd7s8h 4h7hKhKs Js5dAhJc Kd6c2hAd 8d7d6s9d 3c9cQh3d Ac8c5s2c",
      Solver.process("omaha-holdem 3s4d8s9hAs 4h7hKhKs Kd6c2hAd 5h5cQdTs 8d7d6s9d KcQsTcJd Js5dAhJc 3c9cQh3d 6hTd7s8h Ac8c5s2c"));
  }

  @Test
  public void test_omaha_holdem_1888_4c4d9c9hAc_Kc2h3sJd_6s5d6hTc_4h7s9sKd_2s4s6dJc() {
    assertEquals(
      "Kc2h3sJd 6s5d6hTc 2s4s6dJc 4h7s9sKd",
      Solver.process("omaha-holdem 4c4d9c9hAc Kc2h3sJd 6s5d6hTc 4h7s9sKd 2s4s6dJc"));
  }

  @Test
  public void test_omaha_holdem_1889_2c3d6h8hTh_AdAc2hTs_7dJc5c4d_9h8dKdQh_5sAs7s2s_5hJd6d3h_9d4hQd4s() {
    assertEquals(
      "5sAs7s2s 9d4hQd4s AdAc2hTs 7dJc5c4d 5hJd6d3h 9h8dKdQh",
      Solver.process("omaha-holdem 2c3d6h8hTh AdAc2hTs 7dJc5c4d 9h8dKdQh 5sAs7s2s 5hJd6d3h 9d4hQd4s"));
  }

  @Test
  public void test_omaha_holdem_1890_2s4d4h8sJs_QcAh9h3s_6s6hAdKs_2c9c4sKh_As2h9sAc_2d5d8hQd_5cQs5hJd_JcQh7s3c_8d8c6cTc() {
    assertEquals(
      "QcAh9h3s 2d5d8hQd 5cQs5hJd=JcQh7s3c 6s6hAdKs As2h9sAc 2c9c4sKh 8d8c6cTc",
      Solver.process("omaha-holdem 2s4d4h8sJs QcAh9h3s 6s6hAdKs 2c9c4sKh As2h9sAc 2d5d8hQd 5cQs5hJd JcQh7s3c 8d8c6cTc"));
  }

  @Test
  public void test_omaha_holdem_1891_3d5s6cQsTd_Qh5h5c5d_AcAdQc9h() {
    assertEquals(
      "AcAdQc9h Qh5h5c5d",
      Solver.process("omaha-holdem 3d5s6cQsTd Qh5h5c5d AcAdQc9h"));
  }

  @Test
  public void test_omaha_holdem_1892_5h6cJsQsTh_3d8s3s4d_2sAs6sQd_4cJdAh3h() {
    assertEquals(
      "3d8s3s4d 4cJdAh3h 2sAs6sQd",
      Solver.process("omaha-holdem 5h6cJsQsTh 3d8s3s4d 2sAs6sQd 4cJdAh3h"));
  }

  @Test
  public void test_omaha_holdem_1893_2d3s5h7s9s_ThQs8hQc_8s8c3c3d_6sKsTdKd_2sQhJc3h_4hAs9hAd_Ac4sTcKh() {
    assertEquals(
      "ThQs8hQc 2sQhJc3h 8s8c3c3d 4hAs9hAd=Ac4sTcKh 6sKsTdKd",
      Solver.process("omaha-holdem 2d3s5h7s9s ThQs8hQc 8s8c3c3d 6sKsTdKd 2sQhJc3h 4hAs9hAd Ac4sTcKh"));
  }

  @Test
  public void test_omaha_holdem_1894_4c8c8dAhTh_6sTdAd3c_9h7hQcJh_Ac8hJc7d() {
    assertEquals(
      "9h7hQcJh 6sTdAd3c Ac8hJc7d",
      Solver.process("omaha-holdem 4c8c8dAhTh 6sTdAd3c 9h7hQcJh Ac8hJc7d"));
  }

  @Test
  public void test_omaha_holdem_1895_5s9dAhAsTh_AcJc2d4h_5cTd4d6s_Qd8c9sQs_9h3c3dJd_3sAd2sKc() {
    assertEquals(
      "9h3c3dJd 5cTd4d6s Qd8c9sQs AcJc2d4h 3sAd2sKc",
      Solver.process("omaha-holdem 5s9dAhAsTh AcJc2d4h 5cTd4d6s Qd8c9sQs 9h3c3dJd 3sAd2sKc"));
  }

  @Test
  public void test_omaha_holdem_1896_6h9hAhKcQc_5h9s6cAc_7d9c6s2c_4d4h8s3h_Tc2hQhTd_3s6d3d4c_QdTh2s7c_2d8cKhAd_7h5d9d4s() {
    assertEquals(
      "3s6d3d4c 7h5d9d4s QdTh2s7c 7d9c6s2c 5h9s6cAc 2d8cKhAd 4d4h8s3h Tc2hQhTd",
      Solver.process("omaha-holdem 6h9hAhKcQc 5h9s6cAc 7d9c6s2c 4d4h8s3h Tc2hQhTd 3s6d3d4c QdTh2s7c 2d8cKhAd 7h5d9d4s"));
  }

  @Test
  public void test_omaha_holdem_1897_4h4s5c7hTh_9d2dKhTc_Jh4c8d7d_Qs6s9hJd_Td5s6cQh_3s8h5hAd() {
    assertEquals(
      "Qs6s9hJd 9d2dKhTc Td5s6cQh 3s8h5hAd Jh4c8d7d",
      Solver.process("omaha-holdem 4h4s5c7hTh 9d2dKhTc Jh4c8d7d Qs6s9hJd Td5s6cQh 3s8h5hAd"));
  }

  @Test
  public void test_omaha_holdem_1898_7s9cKcQdQh_8h2s7hJc_6c4h8d6s_6d3dTc7d_Ac5d3c2d_KdJdTh5s_4d3s9s2h() {
    assertEquals(
      "Ac5d3c2d 6c4h8d6s 6d3dTc7d 8h2s7hJc 4d3s9s2h KdJdTh5s",
      Solver.process("omaha-holdem 7s9cKcQdQh 8h2s7hJc 6c4h8d6s 6d3dTc7d Ac5d3c2d KdJdTh5s 4d3s9s2h"));
  }

  @Test
  public void test_omaha_holdem_1899_2c2h4d7h9s_5sTh2s6h_5c6c8d3c_8h3dJcAh_9d8c8sKh_4cKd7cJd_Ac5hAdQh() {
    assertEquals(
      "5c6c8d3c 8h3dJcAh 4cKd7cJd 9d8c8sKh Ac5hAdQh 5sTh2s6h",
      Solver.process("omaha-holdem 2c2h4d7h9s 5sTh2s6h 5c6c8d3c 8h3dJcAh 9d8c8sKh 4cKd7cJd Ac5hAdQh"));
  }

  @Test
  public void test_omaha_holdem_1900_2s3d5hKcQd_4dKh9d6h_2d4sAc4c_7c5s3cTd_5cTc8hKs_3hJh5d9s_2h8sJdJs() {
    assertEquals(
      "2h8sJdJs 3hJh5d9s=7c5s3cTd 5cTc8hKs 2d4sAc4c 4dKh9d6h",
      Solver.process("omaha-holdem 2s3d5hKcQd 4dKh9d6h 2d4sAc4c 7c5s3cTd 5cTc8hKs 3hJh5d9s 2h8sJdJs"));
  }

  @Test
  public void test_omaha_holdem_1901_3d5h6dAdAs_Ac9hJd6h_Tc5d4d3c_Qh2sKd9d_4h7sQs8c_9s4s5cAh_Qc7c9c8h() {
    assertEquals(
      "Qc7c9c8h 4h7sQs8c Tc5d4d3c Qh2sKd9d 9s4s5cAh Ac9hJd6h",
      Solver.process("omaha-holdem 3d5h6dAdAs Ac9hJd6h Tc5d4d3c Qh2sKd9d 4h7sQs8c 9s4s5cAh Qc7c9c8h"));
  }

  @Test
  public void test_omaha_holdem_1902_7s8hAsJdQd_TsAcQs6h_9d5cJcKc_QcKd2h2s_2cAh2d6s_5d5s4h4s() {
    assertEquals(
      "5d5s4h4s 9d5cJcKc QcKd2h2s 2cAh2d6s TsAcQs6h",
      Solver.process("omaha-holdem 7s8hAsJdQd TsAcQs6h 9d5cJcKc QcKd2h2s 2cAh2d6s 5d5s4h4s"));
  }

  @Test
  public void test_omaha_holdem_1903_3d7dJdQcQd_KcKdThKh_TdKs2sTs_6h8dAh2h_2c4s5sJs_4cJc8h3s_8s4dJh6s() {
    assertEquals(
      "6h8dAh2h TdKs2sTs 2c4s5sJs 4cJc8h3s=8s4dJh6s KcKdThKh",
      Solver.process("omaha-holdem 3d7dJdQcQd KcKdThKh TdKs2sTs 6h8dAh2h 2c4s5sJs 4cJc8h3s 8s4dJh6s"));
  }

  @Test
  public void test_omaha_holdem_1904_3d4hAdJdQd_9dJh5s2d_3hKd4d5d_7h5cKc8d_9hJc6s7c() {
    assertEquals(
      "7h5cKc8d 9hJc6s7c 9dJh5s2d 3hKd4d5d",
      Solver.process("omaha-holdem 3d4hAdJdQd 9dJh5s2d 3hKd4d5d 7h5cKc8d 9hJc6s7c"));
  }

  @Test
  public void test_omaha_holdem_1905_8sAsJhKcKd_6sJd8c4d_2c3d8h8d_2h7c6h9d_Jc9c4cQs_2s4hAdAc_KhTcTh9h_Ah5h7d5s_Td4sQd5c() {
    assertEquals(
      "2h7c6h9d 6sJd8c4d Jc9c4cQs Ah5h7d5s KhTcTh9h Td4sQd5c 2c3d8h8d 2s4hAdAc",
      Solver.process("omaha-holdem 8sAsJhKcKd 6sJd8c4d 2c3d8h8d 2h7c6h9d Jc9c4cQs 2s4hAdAc KhTcTh9h Ah5h7d5s Td4sQd5c"));
  }

  @Test
  public void test_omaha_holdem_1906_2s4c5hKcKh_7sTs2h6c_Ac4hQhAd_As3c5c6h_QdQc7dTh() {
    assertEquals(
      "7sTs2h6c QdQc7dTh Ac4hQhAd As3c5c6h",
      Solver.process("omaha-holdem 2s4c5hKcKh 7sTs2h6c Ac4hQhAd As3c5c6h QdQc7dTh"));
  }

  @Test
  public void test_omaha_holdem_1907_2d4hAcAsTc_Qh3d6dKs_7h8s7s2c_4d8h2h6c_3h5d2sTs() {
    assertEquals(
      "Qh3d6dKs 4d8h2h6c 7h8s7s2c 3h5d2sTs",
      Solver.process("omaha-holdem 2d4hAcAsTc Qh3d6dKs 7h8s7s2c 4d8h2h6c 3h5d2sTs"));
  }

  @Test
  public void test_omaha_holdem_1908_2d3sAsKsTs_Qd9h3hAh_Td7hQh2c_Jh5c8h8s_4d3dTcKc_5s9c4s7c_2hAc7d4c_Qs3c6cJc_7s9d6s6d() {
    assertEquals(
      "Jh5c8h8s Td7hQh2c 4d3dTcKc 2hAc7d4c Qd9h3hAh Qs3c6cJc 5s9c4s7c 7s9d6s6d",
      Solver.process("omaha-holdem 2d3sAsKsTs Qd9h3hAh Td7hQh2c Jh5c8h8s 4d3dTcKc 5s9c4s7c 2hAc7d4c Qs3c6cJc 7s9d6s6d"));
  }

  @Test
  public void test_omaha_holdem_1909_2c2h2s6d8h_QsAh4h5s_Jc9dJsKc_3c8c7d8d_9s5cTdAd_9hQhTc7s_JdTs6s5d_6h3hJh4d_2dAs3d6c_Qd4c5h7h() {
    assertEquals(
      "6h3hJh4d JdTs6s5d Qd4c5h7h 9hQhTc7s 9s5cTdAd QsAh4h5s Jc9dJsKc 3c8c7d8d 2dAs3d6c",
      Solver.process("omaha-holdem 2c2h2s6d8h QsAh4h5s Jc9dJsKc 3c8c7d8d 9s5cTdAd 9hQhTc7s JdTs6s5d 6h3hJh4d 2dAs3d6c Qd4c5h7h"));
  }

  @Test
  public void test_omaha_holdem_1910_4c5c8h9cKc_3h2cQsQh_Ah5s5hKd_7hJcAs2s_Qc7sKsJd() {
    assertEquals(
      "7hJcAs2s 3h2cQsQh Qc7sKsJd Ah5s5hKd",
      Solver.process("omaha-holdem 4c5c8h9cKc 3h2cQsQh Ah5s5hKd 7hJcAs2s Qc7sKsJd"));
  }

  @Test
  public void test_omaha_holdem_1911_3s6h9dQdQh_Kh4sJhAh_Ts3c4cJd_9h3dJs5h_AsTc3hTh_2s8cKc5s_4d5d7d9s() {
    assertEquals(
      "2s8cKc5s Kh4sJhAh Ts3c4cJd 4d5d7d9s 9h3dJs5h AsTc3hTh",
      Solver.process("omaha-holdem 3s6h9dQdQh Kh4sJhAh Ts3c4cJd 9h3dJs5h AsTc3hTh 2s8cKc5s 4d5d7d9s"));
  }

  @Test
  public void test_omaha_holdem_1912_2d4c4d5d8s_5cKsTcQd_Kd7s9hTd_6h6d6cKh() {
    assertEquals(
      "5cKsTcQd 6h6d6cKh Kd7s9hTd",
      Solver.process("omaha-holdem 2d4c4d5d8s 5cKsTcQd Kd7s9hTd 6h6d6cKh"));
  }

  @Test
  public void test_omaha_holdem_1913_4s6h7d9hAc_JdQc9s6c_5cQh5s5h_Kc2hJsAs_ThAhQd7c_3d2cJc8s_9c9d8d4h_2d8hTsTd_7hAdQsKh() {
    assertEquals(
      "3d2cJc8s 5cQh5s5h Kc2hJsAs JdQc9s6c 7hAdQsKh=ThAhQd7c 9c9d8d4h 2d8hTsTd",
      Solver.process("omaha-holdem 4s6h7d9hAc JdQc9s6c 5cQh5s5h Kc2hJsAs ThAhQd7c 3d2cJc8s 9c9d8d4h 2d8hTsTd 7hAdQsKh"));
  }

  @Test
  public void test_omaha_holdem_1914_2h5hJdJsKc_Ah3s6cAc_KhAd2d2c_Jh8s8cTs_8h9h4dKd_3c5s4sQs_9c7s9d3d_3h2s4cTd_4hKs6d7c() {
    assertEquals(
      "3h2s4cTd 3c5s4sQs 9c7s9d3d 4hKs6d7c 8h9h4dKd Ah3s6cAc Jh8s8cTs KhAd2d2c",
      Solver.process("omaha-holdem 2h5hJdJsKc Ah3s6cAc KhAd2d2c Jh8s8cTs 8h9h4dKd 3c5s4sQs 9c7s9d3d 3h2s4cTd 4hKs6d7c"));
  }

  @Test
  public void test_omaha_holdem_1915_7h8c8d8s9c_Qs2d6dTh_5d8hTcJc_Td5s6c3d() {
    assertEquals(
      "Qs2d6dTh=Td5s6c3d 5d8hTcJc",
      Solver.process("omaha-holdem 7h8c8d8s9c Qs2d6dTh 5d8hTcJc Td5s6c3d"));
  }

  @Test
  public void test_omaha_holdem_1916_2s5h7c9sTd_9h4sQdTs_Jc8h3d7d_2hQc8cKc_4c5d6s7h_8s3sJhQh_QsJd4h9d() {
    assertEquals(
      "2hQc8cKc QsJd4h9d 4c5d6s7h 9h4sQdTs 8s3sJhQh=Jc8h3d7d",
      Solver.process("omaha-holdem 2s5h7c9sTd 9h4sQdTs Jc8h3d7d 2hQc8cKc 4c5d6s7h 8s3sJhQh QsJd4h9d"));
  }

  @Test
  public void test_omaha_holdem_1917_3dAhJhQcTd_JcQsJsKs_8dQd4cAd_Kh8s7h9d_7s6dKc3h_7c2c2d4h_4d2h2sTh_3c5h4sJd_5d3s6sAs() {
    assertEquals(
      "7c2c2d4h 7s6dKc3h 4d2h2sTh 3c5h4sJd 5d3s6sAs 8dQd4cAd Kh8s7h9d JcQsJsKs",
      Solver.process("omaha-holdem 3dAhJhQcTd JcQsJsKs 8dQd4cAd Kh8s7h9d 7s6dKc3h 7c2c2d4h 4d2h2sTh 3c5h4sJd 5d3s6sAs"));
  }

  @Test
  public void test_omaha_holdem_1918_2d3c3d4h6h_Ac3h2c7c_Ks4d5h6s_KdTd2h9d_Tc6c6dAh_9c8d4sKh() {
    assertEquals(
      "KdTd2h9d 9c8d4sKh Ks4d5h6s Ac3h2c7c Tc6c6dAh",
      Solver.process("omaha-holdem 2d3c3d4h6h Ac3h2c7c Ks4d5h6s KdTd2h9d Tc6c6dAh 9c8d4sKh"));
  }

  @Test
  public void test_omaha_holdem_1919_3d5s8cJcKd_Ks5d4d5c_Jd6dQdTs_4c8dAd9h_3s9dTc7s_As6sJs6h() {
    assertEquals(
      "3s9dTc7s 4c8dAd9h Jd6dQdTs As6sJs6h Ks5d4d5c",
      Solver.process("omaha-holdem 3d5s8cJcKd Ks5d4d5c Jd6dQdTs 4c8dAd9h 3s9dTc7s As6sJs6h"));
  }

  @Test
  public void test_omaha_holdem_1920_4h4s5dAcAs_3h5h7sJc_4cTd2c5s() {
    assertEquals(
      "3h5h7sJc 4cTd2c5s",
      Solver.process("omaha-holdem 4h4s5dAcAs 3h5h7sJc 4cTd2c5s"));
  }

  @Test
  public void test_omaha_holdem_1921_6c8dAcKdQc_ThQsQhJs_9dAdJh9c_7sQd5h8s_4c5s9h5c_9s2h6dKc() {
    assertEquals(
      "9dAdJh9c 7sQd5h8s 9s2h6dKc ThQsQhJs 4c5s9h5c",
      Solver.process("omaha-holdem 6c8dAcKdQc ThQsQhJs 9dAdJh9c 7sQd5h8s 4c5s9h5c 9s2h6dKc"));
  }

  @Test
  public void test_omaha_holdem_1922_2d2h9c9sKc_7d2c4hJc_Jd9dQdTs_8d2s4d5d_4s8c3c7h_KhTcQc5s_6dKsJs5c_3dAd6hAc() {
    assertEquals(
      "4s8c3c7h 6dKsJs5c KhTcQc5s 3dAd6hAc 8d2s4d5d 7d2c4hJc Jd9dQdTs",
      Solver.process("omaha-holdem 2d2h9c9sKc 7d2c4hJc Jd9dQdTs 8d2s4d5d 4s8c3c7h KhTcQc5s 6dKsJs5c 3dAd6hAc"));
  }

  @Test
  public void test_omaha_holdem_1923_4d4s6c9d9h_JcAd8sTd_5d2cAcAs_Ah3d8hQh_6h3c6sTs() {
    assertEquals(
      "JcAd8sTd Ah3d8hQh 5d2cAcAs 6h3c6sTs",
      Solver.process("omaha-holdem 4d4s6c9d9h JcAd8sTd 5d2cAcAs Ah3d8hQh 6h3c6sTs"));
  }

  @Test
  public void test_omaha_holdem_1924_AdAsJhQhTs_4c5s6cKh_7s6s5d6d_TdAcKs8c_Ah3d7c3c() {
    assertEquals(
      "4c5s6cKh 7s6s5d6d Ah3d7c3c TdAcKs8c",
      Solver.process("omaha-holdem AdAsJhQhTs 4c5s6cKh 7s6s5d6d TdAcKs8c Ah3d7c3c"));
  }

  @Test
  public void test_omaha_holdem_1925_3d7dAcQcQs_9h6d2c8s_6hJhJc6c() {
    assertEquals(
      "9h6d2c8s 6hJhJc6c",
      Solver.process("omaha-holdem 3d7dAcQcQs 9h6d2c8s 6hJhJc6c"));
  }

  @Test
  public void test_omaha_holdem_1926_AhJcKcQcTh_8c4s3h2d_7cJhAs8h_6s3s8dTc_9s7h9c2h_Ad2c5dTs_3c2s7d4c_9d6hJdAc_5h5s6cTd_3dKs7s4h() {
    assertEquals(
      "8c4s3h2d 9s7h9c2h 5h5s6cTd 6s3s8dTc 3dKs7s4h 7cJhAs8h=9d6hJdAc=Ad2c5dTs 3c2s7d4c",
      Solver.process("omaha-holdem AhJcKcQcTh 8c4s3h2d 7cJhAs8h 6s3s8dTc 9s7h9c2h Ad2c5dTs 3c2s7d4c 9d6hJdAc 5h5s6cTd 3dKs7s4h"));
  }

  @Test
  public void test_omaha_holdem_1927_2c3s8dKsTh_4s7dAc7c_TcKdQsKc_4c9d2d3d_As2h9s3c() {
    assertEquals(
      "4s7dAc7c 4c9d2d3d=As2h9s3c TcKdQsKc",
      Solver.process("omaha-holdem 2c3s8dKsTh 4s7dAc7c TcKdQsKc 4c9d2d3d As2h9s3c"));
  }

  @Test
  public void test_omaha_holdem_1928_5c8s9c9sJd_5d9h7cAh_6cQcJcTd_7s4h6d4d_4s8cTs8h_3hJhKdQd_7h3d6s6h_4c9dAs2c() {
    assertEquals(
      "3hJhKdQd 4c9dAs2c 7h3d6s6h=7s4h6d4d 6cQcJcTd 4s8cTs8h 5d9h7cAh",
      Solver.process("omaha-holdem 5c8s9c9sJd 5d9h7cAh 6cQcJcTd 7s4h6d4d 4s8cTs8h 3hJhKdQd 7h3d6s6h 4c9dAs2c"));
  }

  @Test
  public void test_omaha_holdem_1929_3c3s9sAhJh_2sTdQd4d_4cTc8h4h_AsKc6dQh() {
    assertEquals(
      "2sTdQd4d 4cTc8h4h AsKc6dQh",
      Solver.process("omaha-holdem 3c3s9sAhJh 2sTdQd4d 4cTc8h4h AsKc6dQh"));
  }

  @Test
  public void test_omaha_holdem_1930_6dJcJdJhTc_7dQh2h6s_7s2s3s8s_8hAd5h4h_AhTd7cKh_9d3dKs8d_3c9sAs2c_Qc4dQs6h_Kc5cQd5s_8cTs2d6c() {
    assertEquals(
      "7s2s3s8s 8cTs2d6c 7dQh2h6s 9d3dKs8d 8hAd5h4h 3c9sAs2c AhTd7cKh Kc5cQd5s Qc4dQs6h",
      Solver.process("omaha-holdem 6dJcJdJhTc 7dQh2h6s 7s2s3s8s 8hAd5h4h AhTd7cKh 9d3dKs8d 3c9sAs2c Qc4dQs6h Kc5cQd5s 8cTs2d6c"));
  }

  @Test
  public void test_omaha_holdem_1931_6d7h8hJcKd_3cAdTd4s_4dTs2s5h_8cTc8d5c_2dQc3sQh_6h5s9sAh() {
    assertEquals(
      "3cAdTd4s 2dQc3sQh 8cTc8d5c 4dTs2s5h 6h5s9sAh",
      Solver.process("omaha-holdem 6d7h8hJcKd 3cAdTd4s 4dTs2s5h 8cTc8d5c 2dQc3sQh 6h5s9sAh"));
  }

  @Test
  public void test_omaha_holdem_1932_3c6cJhQcTs_4d9cKs4s_TcKcAs6h() {
    assertEquals(
      "4d9cKs4s TcKcAs6h",
      Solver.process("omaha-holdem 3c6cJhQcTs 4d9cKs4s TcKcAs6h"));
  }

  @Test
  public void test_omaha_holdem_1933_4d4s6hQcQs_9h8c4h2d_KhTs7h3d_7s2c5s9c_Ac3hKc4c_7c7d3cTd() {
    assertEquals(
      "7s2c5s9c KhTs7h3d 7c7d3cTd 9h8c4h2d Ac3hKc4c",
      Solver.process("omaha-holdem 4d4s6hQcQs 9h8c4h2d KhTs7h3d 7s2c5s9c Ac3hKc4c 7c7d3cTd"));
  }

  @Test
  public void test_omaha_holdem_1934_4s5c6sQcTs_2dTd9cQs_7c6h4dKs_8sJd3h3s_Jh8cAc5d_Ah2h2s7s_KhAdJsTc_KcQh2c7h_6c3d4h5h_9s9h5s6d() {
    assertEquals(
      "Jh8cAc5d KhAdJsTc KcQh2c7h 7c6h4dKs 6c3d4h5h 2dTd9cQs Ah2h2s7s 8sJd3h3s 9s9h5s6d",
      Solver.process("omaha-holdem 4s5c6sQcTs 2dTd9cQs 7c6h4dKs 8sJd3h3s Jh8cAc5d Ah2h2s7s KhAdJsTc KcQh2c7h 6c3d4h5h 9s9h5s6d"));
  }

  @Test
  public void test_omaha_holdem_1935_4s7h9sAsTd_8d6h4h3s_TsKh5c7c_3h4c9cTc() {
    assertEquals(
      "TsKh5c7c 3h4c9cTc 8d6h4h3s",
      Solver.process("omaha-holdem 4s7h9sAsTd 8d6h4h3s TsKh5c7c 3h4c9cTc"));
  }

  @Test
  public void test_omaha_holdem_1936_5h6d9hQhTd_Th6cKdJc_Ad9d3d8d_7sTc5d3h_7c2d5c4d_Kh8s8c3s_8h6h4s2s_2hAsQc7h() {
    assertEquals(
      "7c2d5c4d Kh8s8c3s Ad9d3d8d 7sTc5d3h Th6cKdJc 2hAsQc7h 8h6h4s2s",
      Solver.process("omaha-holdem 5h6d9hQhTd Th6cKdJc Ad9d3d8d 7sTc5d3h 7c2d5c4d Kh8s8c3s 8h6h4s2s 2hAsQc7h"));
  }

  @Test
  public void test_omaha_holdem_1937_2d6d9cJdKc_5s9s3c6s_4d8sTc9d_7s6hAdKs_KdQs5hJc_3s8d5d5c_2hQc4cAc_Jh9h8c4s() {
    assertEquals(
      "2hQc4cAc 5s9s3c6s Jh9h8c4s 7s6hAdKs KdQs5hJc 3s8d5d5c 4d8sTc9d",
      Solver.process("omaha-holdem 2d6d9cJdKc 5s9s3c6s 4d8sTc9d 7s6hAdKs KdQs5hJc 3s8d5d5c 2hQc4cAc Jh9h8c4s"));
  }

  @Test
  public void test_omaha_holdem_1938_2d3c4d6cKh_4h7d2s4s_Qh6dAd7h_Kd8c8hQc() {
    assertEquals(
      "Qh6dAd7h Kd8c8hQc 4h7d2s4s",
      Solver.process("omaha-holdem 2d3c4d6cKh 4h7d2s4s Qh6dAd7h Kd8c8hQc"));
  }

  @Test
  public void test_omaha_holdem_1939_5c6h8sKdTs_7sKcTc6d_JdQh5d3c_7d6sJcAc_9s5h9h6c() {
    assertEquals(
      "JdQh5d3c 7d6sJcAc 9s5h9h6c 7sKcTc6d",
      Solver.process("omaha-holdem 5c6h8sKdTs 7sKcTc6d JdQh5d3c 7d6sJcAc 9s5h9h6c"));
  }

  @Test
  public void test_omaha_holdem_1940_2c6c7s9c9s_3h5sKs4c_5dJhKd7c_4d6sQdJd_Kc5cAc5h_AdTh3cTd_2sKhQc2d_9h9d6d2h_As4s4h8h_QsJc8dTs() {
    assertEquals(
      "3h5sKs4c As4s4h8h 4d6sQdJd 5dJhKd7c AdTh3cTd QsJc8dTs Kc5cAc5h 2sKhQc2d 9h9d6d2h",
      Solver.process("omaha-holdem 2c6c7s9c9s 3h5sKs4c 5dJhKd7c 4d6sQdJd Kc5cAc5h AdTh3cTd 2sKhQc2d 9h9d6d2h As4s4h8h QsJc8dTs"));
  }

  @Test
  public void test_omaha_holdem_1941_2s9d9hAcJc_9s7sQh8d_QcQs7dAh_JhTsTc6s_3d3cJs2h_8c4h8s5d_Kd5c2d9c_3s6cAd6d_Th4cKcQd_7c4d6h7h() {
    assertEquals(
      "Th4cKcQd 7c4d6h7h 8c4h8s5d 3d3cJs2h JhTsTc6s 3s6cAd6d QcQs7dAh 9s7sQh8d Kd5c2d9c",
      Solver.process("omaha-holdem 2s9d9hAcJc 9s7sQh8d QcQs7dAh JhTsTc6s 3d3cJs2h 8c4h8s5d Kd5c2d9c 3s6cAd6d Th4cKcQd 7c4d6h7h"));
  }

  @Test
  public void test_omaha_holdem_1942_2h4d9sTdTs_AsJh9c6d_6sQc9d7d() {
    assertEquals(
      "6sQc9d7d AsJh9c6d",
      Solver.process("omaha-holdem 2h4d9sTdTs AsJh9c6d 6sQc9d7d"));
  }

  @Test
  public void test_omaha_holdem_1943_2s4c9dJhQs_4d8d6d3h_5dAd5cQc_6hAh3sTs_4h2h7d3d_QhKdTcAs_JsKs8c8h_2c6cJd5h() {
    assertEquals(
      "6hAh3sTs 4d8d6d3h JsKs8c8h 5dAd5cQc 4h2h7d3d 2c6cJd5h QhKdTcAs",
      Solver.process("omaha-holdem 2s4c9dJhQs 4d8d6d3h 5dAd5cQc 6hAh3sTs 4h2h7d3d QhKdTcAs JsKs8c8h 2c6cJd5h"));
  }

  @Test
  public void test_omaha_holdem_1944_2d6d8dKsQh_2hTc6sJh_Ad2s5h6h_3h3c8hJc_4cKh8sJs_4s7d6cTd_7h9d5dAc_Th9c5cQc_As7c3dJd() {
    assertEquals(
      "3h3c8hJc Th9c5cQc 2hTc6sJh=Ad2s5h6h 4cKh8sJs 7h9d5dAc 4s7d6cTd As7c3dJd",
      Solver.process("omaha-holdem 2d6d8dKsQh 2hTc6sJh Ad2s5h6h 3h3c8hJc 4cKh8sJs 4s7d6cTd 7h9d5dAc Th9c5cQc As7c3dJd"));
  }

  @Test
  public void test_omaha_holdem_1945_2c3c5sJsTd_As6d8c5h_JdKsTc4s_8hKh7h3h_9s7d4cTs_3d4hAh5c_6h9dQs6s_AcQcKc8d() {
    assertEquals(
      "AcQcKc8d 8hKh7h3h As6d8c5h 6h9dQs6s 9s7d4cTs JdKsTc4s 3d4hAh5c",
      Solver.process("omaha-holdem 2c3c5sJsTd As6d8c5h JdKsTc4s 8hKh7h3h 9s7d4cTs 3d4hAh5c 6h9dQs6s AcQcKc8d"));
  }

  @Test
  public void test_omaha_holdem_1946_2d5s8sJsTh_5hTdKs2h_Qc7cJhTc_6c3hQh4h_Jc4d7dAd_Qd6h3sKd_7h9s8h4s_Kh3c2s3d_9hTs7s9c() {
    assertEquals(
      "6c3hQh4h Qd6h3sKd Kh3c2s3d Jc4d7dAd 5hTdKs2h Qc7cJhTc 7h9s8h4s 9hTs7s9c",
      Solver.process("omaha-holdem 2d5s8sJsTh 5hTdKs2h Qc7cJhTc 6c3hQh4h Jc4d7dAd Qd6h3sKd 7h9s8h4s Kh3c2s3d 9hTs7s9c"));
  }

  @Test
  public void test_omaha_holdem_1947_2s3sJcJsTs_2cJd7sQs_6s8cKhAh() {
    assertEquals(
      "6s8cKhAh 2cJd7sQs",
      Solver.process("omaha-holdem 2s3sJcJsTs 2cJd7sQs 6s8cKhAh"));
  }

  @Test
  public void test_omaha_holdem_1948_2s5c5s6s7c_5d3h4h8c_8h7sKdQh_KhQcTdJs_5h3d6cAd_TcJc3c4d_2cTs8dAc_4sAs6d9s_7h8s9hJh() {
    assertEquals(
      "KhQcTdJs 2cTs8dAc 8h7sKdQh TcJc3c4d 5d3h4h8c 7h8s9hJh 4sAs6d9s 5h3d6cAd",
      Solver.process("omaha-holdem 2s5c5s6s7c 5d3h4h8c 8h7sKdQh KhQcTdJs 5h3d6cAd TcJc3c4d 2cTs8dAc 4sAs6d9s 7h8s9hJh"));
  }

  @Test
  public void test_omaha_holdem_1949_3h5d5h9dJc_AcQcJd3d_7s6s9hQd_3sTcJs6h_5s8sQhKc_8hTh6c8d_AdTsKd2d_9c6d2s4c() {
    assertEquals(
      "AdTsKd2d 8hTh6c8d 9c6d2s4c 7s6s9hQd 3sTcJs6h AcQcJd3d 5s8sQhKc",
      Solver.process("omaha-holdem 3h5d5h9dJc AcQcJd3d 7s6s9hQd 3sTcJs6h 5s8sQhKc 8hTh6c8d AdTsKd2d 9c6d2s4c"));
  }

  @Test
  public void test_omaha_holdem_1950_4h4s6hJdTc_9s7h4c9c_QhJsTh5d_2hQsKdJc_6s3s2s2c_QdAd7dKs_7c3h9d8c() {
    assertEquals(
      "7c3h9d8c QdAd7dKs 6s3s2s2c 2hQsKdJc QhJsTh5d 9s7h4c9c",
      Solver.process("omaha-holdem 4h4s6hJdTc 9s7h4c9c QhJsTh5d 2hQsKdJc 6s3s2s2c QdAd7dKs 7c3h9d8c"));
  }

  @Test
  public void test_omaha_holdem_1951_2h4dJdKsQc_Qh3c7d7h_Ts3h3s8c_2dJc3dTc_KdJsQd5h_9d5s4s4c_7c7sTd6d_5c8d9hJh_AcKh8h6s() {
    assertEquals(
      "Ts3h3s8c 7c7sTd6d 5c8d9hJh Qh3c7d7h AcKh8h6s 2dJc3dTc KdJsQd5h 9d5s4s4c",
      Solver.process("omaha-holdem 2h4dJdKsQc Qh3c7d7h Ts3h3s8c 2dJc3dTc KdJsQd5h 9d5s4s4c 7c7sTd6d 5c8d9hJh AcKh8h6s"));
  }

  @Test
  public void test_omaha_holdem_1952_5c7hAdAsJh_QdQc9c3d_5d3hJdJc_4cKd3c8s() {
    assertEquals(
      "4cKd3c8s QdQc9c3d 5d3hJdJc",
      Solver.process("omaha-holdem 5c7hAdAsJh QdQc9c3d 5d3hJdJc 4cKd3c8s"));
  }

  @Test
  public void test_omaha_holdem_1953_5d6hQsTdTs_Ac3dAs4h_Jh6dTc2s_2cTh3sKd_7s5sJc9s_QhJd5h2h_7d4d7cAd_4sAh8d2d() {
    assertEquals(
      "4sAh8d2d 7s5sJc9s 7d4d7cAd QhJd5h2h Ac3dAs4h 2cTh3sKd Jh6dTc2s",
      Solver.process("omaha-holdem 5d6hQsTdTs Ac3dAs4h Jh6dTc2s 2cTh3sKd 7s5sJc9s QhJd5h2h 7d4d7cAd 4sAh8d2d"));
  }

  @Test
  public void test_omaha_holdem_1954_4s7d8s9dJd_Ts7c9s5d_8h2s5c2h_3cJs5hQc_JcKh9hAc_QdKdAdQs_7s4d2d3h_QhTh3d6s() {
    assertEquals(
      "8h2s5c2h 3cJs5hQc JcKh9hAc Ts7c9s5d QhTh3d6s 7s4d2d3h QdKdAdQs",
      Solver.process("omaha-holdem 4s7d8s9dJd Ts7c9s5d 8h2s5c2h 3cJs5hQc JcKh9hAc QdKdAdQs 7s4d2d3h QhTh3d6s"));
  }

  @Test
  public void test_omaha_holdem_1955_3c9c9d9hQd_Ac3d8s8h_5d5cJdAh_5s9s6dTd_KhKd7cTs_QhQcJsJh_6hQs4h2c_5h6s8d2h_Kc7sKsTh_7hAdTc7d() {
    assertEquals(
      "5h6s8d2h 6hQs4h2c 5d5cJdAh 7hAdTc7d Ac3d8s8h Kc7sKsTh=KhKd7cTs QhQcJsJh 5s9s6dTd",
      Solver.process("omaha-holdem 3c9c9d9hQd Ac3d8s8h 5d5cJdAh 5s9s6dTd KhKd7cTs QhQcJsJh 6hQs4h2c 5h6s8d2h Kc7sKsTh 7hAdTc7d"));
  }

  @Test
  public void test_omaha_holdem_1956_3c8h9dThTs_9h7dJh4d_4s7hAs4c_3h8s7cJc_Td3s4h6h() {
    assertEquals(
      "4s7hAs4c 3h8s7cJc=9h7dJh4d Td3s4h6h",
      Solver.process("omaha-holdem 3c8h9dThTs 9h7dJh4d 4s7hAs4c 3h8s7cJc Td3s4h6h"));
  }

  @Test
  public void test_omaha_holdem_1957_3c6c9sJsQc_Ad8h2sKs_ThQdQsAc_2c9h4s6h_7s7hKhKc_2h4c2d3s_Ts8d5h5c() {
    assertEquals(
      "Ad8h2sKs 2h4c2d3s 7s7hKhKc 2c9h4s6h ThQdQsAc Ts8d5h5c",
      Solver.process("omaha-holdem 3c6c9sJsQc Ad8h2sKs ThQdQsAc 2c9h4s6h 7s7hKhKc 2h4c2d3s Ts8d5h5c"));
  }

  @Test
  public void test_omaha_holdem_1958_2d4d6cTcTh_Ks9cTs3s_8cAc6s5d_6d2c4h5s_Kd3c9dAh_Ad4sJc7d_7s8dQcKc() {
    assertEquals(
      "7s8dQcKc Kd3c9dAh Ad4sJc7d 6d2c4h5s 8cAc6s5d Ks9cTs3s",
      Solver.process("omaha-holdem 2d4d6cTcTh Ks9cTs3s 8cAc6s5d 6d2c4h5s Kd3c9dAh Ad4sJc7d 7s8dQcKc"));
  }

  @Test
  public void test_omaha_holdem_1959_4c4d7s8hAc_6sJd7d4h_9c2d5h2s_9hKcKsTd_9dAh8s5d_Ts6dQsKd_3h2hTcJc_JsKh3dJh_2cAs3c9s_QdThQcAd() {
    assertEquals(
      "3h2hTcJc Ts6dQsKd 9c2d5h2s JsKh3dJh 9hKcKsTd 2cAs3c9s QdThQcAd 9dAh8s5d 6sJd7d4h",
      Solver.process("omaha-holdem 4c4d7s8hAc 6sJd7d4h 9c2d5h2s 9hKcKsTd 9dAh8s5d Ts6dQsKd 3h2hTcJc JsKh3dJh 2cAs3c9s QdThQcAd"));
  }

  @Test
  public void test_omaha_holdem_1960_6d6h7d8hQd_9h8c8s3h_Th6c5h3c_JhKc6sTd_Jc3dTcAs_3sAdQs5s_2s9c4s7c_JsAhAcKd() {
    assertEquals(
      "Jc3dTcAs 2s9c4s7c 3sAdQs5s JsAhAcKd Th6c5h3c JhKc6sTd 9h8c8s3h",
      Solver.process("omaha-holdem 6d6h7d8hQd 9h8c8s3h Th6c5h3c JhKc6sTd Jc3dTcAs 3sAdQs5s 2s9c4s7c JsAhAcKd"));
  }

  @Test
  public void test_omaha_holdem_1961_4h7c8hAsKc_9h4c3s6s_KhKd3d2c_Jh8c2h6h_AdQsJs5s_Ah7sAc2d_Th2s6dTs_JcJd6c4s_Td5c3hTc_7hQc3c4d() {
    assertEquals(
      "9h4c3s6s Jh8c2h6h Td5c3hTc=Th2s6dTs JcJd6c4s AdQsJs5s 7hQc3c4d KhKd3d2c Ah7sAc2d",
      Solver.process("omaha-holdem 4h7c8hAsKc 9h4c3s6s KhKd3d2c Jh8c2h6h AdQsJs5s Ah7sAc2d Th2s6dTs JcJd6c4s Td5c3hTc 7hQc3c4d"));
  }

  @Test
  public void test_omaha_holdem_1962_2s7c7h9sAc_Td6h2dJc_2h3sQdQh_QsKd7sTh_9h3d3h4s() {
    assertEquals(
      "Td6h2dJc 9h3d3h4s 2h3sQdQh QsKd7sTh",
      Solver.process("omaha-holdem 2s7c7h9sAc Td6h2dJc 2h3sQdQh QsKd7sTh 9h3d3h4s"));
  }

  @Test
  public void test_omaha_holdem_1963_2h6d8hKsTc_KhAc3sQd_9d8dKc7d_7cQhTdJc_Js4h5cAs_Qs7h2s3h_6c8s9s5d_3d4d7sKd_JdTs2c6h() {
    assertEquals(
      "Js4h5cAs Qs7h2s3h 7cQhTdJc 3d4d7sKd KhAc3sQd 6c8s9s5d JdTs2c6h 9d8dKc7d",
      Solver.process("omaha-holdem 2h6d8hKsTc KhAc3sQd 9d8dKc7d 7cQhTdJc Js4h5cAs Qs7h2s3h 6c8s9s5d 3d4d7sKd JdTs2c6h"));
  }

  @Test
  public void test_omaha_holdem_1964_2sAsKsTcTs_JhKh6h9h_8d9d3d5h() {
    assertEquals(
      "8d9d3d5h JhKh6h9h",
      Solver.process("omaha-holdem 2sAsKsTcTs JhKh6h9h 8d9d3d5h"));
  }

  @Test
  public void test_omaha_holdem_1965_6h8hAdJdTc_9s3h5d6s_Kc3s7dAc_6d4h2d2c_9dTs2sQc() {
    assertEquals(
      "6d4h2d2c 9s3h5d6s Kc3s7dAc 9dTs2sQc",
      Solver.process("omaha-holdem 6h8hAdJdTc 9s3h5d6s Kc3s7dAc 6d4h2d2c 9dTs2sQc"));
  }

  @Test
  public void test_omaha_holdem_1966_6d9sJdKcQc_Qd3cTs5d_6hQsAcAd_6s9h4s9c_3h2h7sQh_AsJh8s5h_2d5s9dJs_Ks7h4c4d_4h7c2s3d() {
    assertEquals(
      "4h7c2s3d AsJh8s5h 3h2h7sQh Ks7h4c4d 2d5s9dJs 6hQsAcAd 6s9h4s9c Qd3cTs5d",
      Solver.process("omaha-holdem 6d9sJdKcQc Qd3cTs5d 6hQsAcAd 6s9h4s9c 3h2h7sQh AsJh8s5h 2d5s9dJs Ks7h4c4d 4h7c2s3d"));
  }

  @Test
  public void test_omaha_holdem_1967_2d2h9sAdJh_3c5sJs9h_2s5d6cJd_8hAs6hKs_3s7hKdAc() {
    assertEquals(
      "3c5sJs9h 3s7hKdAc=8hAs6hKs 2s5d6cJd",
      Solver.process("omaha-holdem 2d2h9sAdJh 3c5sJs9h 2s5d6cJd 8hAs6hKs 3s7hKdAc"));
  }

  @Test
  public void test_omaha_holdem_1968_3d7d7h7sTc_2c3s9d4h_Ah6sKcAd_Qc3h8cQs_Jh5s4cKd_2sJd5h9h_Td6c5cAs_Qh9s8sTh() {
    assertEquals(
      "2c3s9d4h 2sJd5h9h Qh9s8sTh Jh5s4cKd Td6c5cAs Qc3h8cQs Ah6sKcAd",
      Solver.process("omaha-holdem 3d7d7h7sTc 2c3s9d4h Ah6sKcAd Qc3h8cQs Jh5s4cKd 2sJd5h9h Td6c5cAs Qh9s8sTh"));
  }

  @Test
  public void test_omaha_holdem_1969_6h6s7s8hQs_3s4sJcTh_7hAdJs5c_6d5s6cQc_Ah4dKhJh() {
    assertEquals(
      "Ah4dKhJh 7hAdJs5c 3s4sJcTh 6d5s6cQc",
      Solver.process("omaha-holdem 6h6s7s8hQs 3s4sJcTh 7hAdJs5c 6d5s6cQc Ah4dKhJh"));
  }

  @Test
  public void test_omaha_holdem_1970_3c5c5d7h8h_6sKcJd5h_9s7c2hQd_7dJsTh8c_3d2d4d2s() {
    assertEquals(
      "3d2d4d2s 9s7c2hQd 7dJsTh8c 6sKcJd5h",
      Solver.process("omaha-holdem 3c5c5d7h8h 6sKcJd5h 9s7c2hQd 7dJsTh8c 3d2d4d2s"));
  }

  @Test
  public void test_omaha_holdem_1971_3c8c8hAhKs_QsJhJd9h_4hTsKh3d_8s3sQh2s_Qc4c7s8d_6sJs5h2c_Qd9sAs6c() {
    assertEquals(
      "6sJs5h2c QsJhJd9h 4hTsKh3d Qd9sAs6c Qc4c7s8d 8s3sQh2s",
      Solver.process("omaha-holdem 3c8c8hAhKs QsJhJd9h 4hTsKh3d 8s3sQh2s Qc4c7s8d 6sJs5h2c Qd9sAs6c"));
  }

  @Test
  public void test_omaha_holdem_1972_2d2h4c4h9s_Qh3hTsJd_5hKc6sAh_8h9cTcAd_6d9d2s4s_3s5s4d6c_Th8s9hTd_2c7h5d7s_7cQs3dAs_7dJh3c8d() {
    assertEquals(
      "7dJh3c8d Qh3hTsJd 7cQs3dAs 5hKc6sAh 8h9cTcAd Th8s9hTd 2c7h5d7s 3s5s4d6c 6d9d2s4s",
      Solver.process("omaha-holdem 2d2h4c4h9s Qh3hTsJd 5hKc6sAh 8h9cTcAd 6d9d2s4s 3s5s4d6c Th8s9hTd 2c7h5d7s 7cQs3dAs 7dJh3c8d"));
  }

  @Test
  public void test_omaha_holdem_1973_2h4s5c9dTd_TcQs6c2d_5h5sQc9s_4hJc6dQh_AsKdAd3h() {
    assertEquals(
      "4hJc6dQh TcQs6c2d 5h5sQc9s AsKdAd3h",
      Solver.process("omaha-holdem 2h4s5c9dTd TcQs6c2d 5h5sQc9s 4hJc6dQh AsKdAd3h"));
  }

  @Test
  public void test_omaha_holdem_1974_4d7h8h9sQd_3h3c4cQc_2d6dAsTs_2hJcJh7c_Tc5hJsAc_TdKs8c3d_Kc3s9h5s_8sJd6s5d_Th7sKh2s() {
    assertEquals(
      "Th7sKh2s TdKs8c3d Kc3s9h5s 2hJcJh7c 3h3c4cQc 8sJd6s5d 2d6dAsTs Tc5hJsAc",
      Solver.process("omaha-holdem 4d7h8h9sQd 3h3c4cQc 2d6dAsTs 2hJcJh7c Tc5hJsAc TdKs8c3d Kc3s9h5s 8sJd6s5d Th7sKh2s"));
  }

  @Test
  public void test_omaha_holdem_1975_2c2h4d6c7d_KsQhTsAs_3dKhAc9h() {
    assertEquals(
      "3dKhAc9h=KsQhTsAs",
      Solver.process("omaha-holdem 2c2h4d6c7d KsQhTsAs 3dKhAc9h"));
  }

  @Test
  public void test_omaha_holdem_1976_2d7c7d8cJc_3hAhAc5h_5c6c6d2c_4cJs9sQc_3cQdAdJd() {
    assertEquals(
      "3cQdAdJd 3hAhAc5h 5c6c6d2c 4cJs9sQc",
      Solver.process("omaha-holdem 2d7c7d8cJc 3hAhAc5h 5c6c6d2c 4cJs9sQc 3cQdAdJd"));
  }

  @Test
  public void test_omaha_holdem_1977_7s8d9dAsJc_7h3cJdKs_Kd4dTs6h_TcTd6c4h_Qs4s9h5d_QcJs2sAh() {
    assertEquals(
      "Qs4s9h5d 7h3cJdKs QcJs2sAh Kd4dTs6h=TcTd6c4h",
      Solver.process("omaha-holdem 7s8d9dAsJc 7h3cJdKs Kd4dTs6h TcTd6c4h Qs4s9h5d QcJs2sAh"));
  }

  @Test
  public void test_omaha_holdem_1978_4s7d8c8d9c_AcTh2sKh_7c8sKd6h_3sTd7hAs() {
    assertEquals(
      "AcTh2sKh 3sTd7hAs 7c8sKd6h",
      Solver.process("omaha-holdem 4s7d8c8d9c AcTh2sKh 7c8sKd6h 3sTd7hAs"));
  }

  @Test
  public void test_omaha_holdem_1979_3h4d6s8dAh_3dTc2dTh_Kc2h9cAd_4sKh6cQs_Ks9hAc5h_8s5s6h9s_3s8h2cJh_2s7c4hKd_TdJdTsQd() {
    assertEquals(
      "2s7c4hKd 3dTc2dTh=TdJdTsQd Kc2h9cAd=Ks9hAc5h 4sKh6cQs 3s8h2cJh 8s5s6h9s",
      Solver.process("omaha-holdem 3h4d6s8dAh 3dTc2dTh Kc2h9cAd 4sKh6cQs Ks9hAc5h 8s5s6h9s 3s8h2cJh 2s7c4hKd TdJdTsQd"));
  }

  @Test
  public void test_omaha_holdem_1980_3h5c5s7sAh_Kc2d8d4c_7hQh4hJc_7c9sJdQc_Kd8hKh2h_3sTdJsQs() {
    assertEquals(
      "3sTdJsQs 7c9sJdQc=7hQh4hJc Kd8hKh2h Kc2d8d4c",
      Solver.process("omaha-holdem 3h5c5s7sAh Kc2d8d4c 7hQh4hJc 7c9sJdQc Kd8hKh2h 3sTdJsQs"));
  }

  @Test
  public void test_omaha_holdem_1981_2c3s8dJhJs_5s7dJd2d_4c5c6c9h_QhAh3d6h_2sKs8s7h_6s8hTh2h_8c7c5h4d() {
    assertEquals(
      "4c5c6c9h QhAh3d6h 8c7c5h4d 6s8hTh2h 2sKs8s7h 5s7dJd2d",
      Solver.process("omaha-holdem 2c3s8dJhJs 5s7dJd2d 4c5c6c9h QhAh3d6h 2sKs8s7h 6s8hTh2h 8c7c5h4d"));
  }

  @Test
  public void test_omaha_holdem_1982_3h4s6h6sKh_KsAs8sKd_QcKcTh9s() {
    assertEquals(
      "QcKcTh9s KsAs8sKd",
      Solver.process("omaha-holdem 3h4s6h6sKh KsAs8sKd QcKcTh9s"));
  }

  @Test
  public void test_omaha_holdem_1983_3h6s7h8d9c_Jd9d3d4d_2h4s9sJc_3s5h9h8c() {
    assertEquals(
      "2h4s9sJc Jd9d3d4d 3s5h9h8c",
      Solver.process("omaha-holdem 3h6s7h8d9c Jd9d3d4d 2h4s9sJc 3s5h9h8c"));
  }

  @Test
  public void test_omaha_holdem_1984_6c6h9sAdQc_7hTcJs4c_Ah3h9d3c_Ac7sTh4d_JdQs9h7d_8hJh8d2s_Kd7c3sTs_6dQdAs5s_6sKhKc2h_JcQh8c8s() {
    assertEquals(
      "7hTcJs4c Kd7c3sTs 8hJh8d2s JcQh8c8s JdQs9h7d Ac7sTh4d Ah3h9d3c 6sKhKc2h 6dQdAs5s",
      Solver.process("omaha-holdem 6c6h9sAdQc 7hTcJs4c Ah3h9d3c Ac7sTh4d JdQs9h7d 8hJh8d2s Kd7c3sTs 6dQdAs5s 6sKhKc2h JcQh8c8s"));
  }

  @Test
  public void test_omaha_holdem_1985_5s8c9sAdKc_7s7c3d2h_5c9d9h2s_Qc9cJc7h_8d3cKs2c_TcQdKhTs_Js8sTh2d() {
    assertEquals(
      "7s7c3d2h Js8sTh2d Qc9cJc7h TcQdKhTs 8d3cKs2c 5c9d9h2s",
      Solver.process("omaha-holdem 5s8c9sAdKc 7s7c3d2h 5c9d9h2s Qc9cJc7h 8d3cKs2c TcQdKhTs Js8sTh2d"));
  }

  @Test
  public void test_omaha_holdem_1986_3h5c8c9hJh_Jd2d4h4c_Th4d5h5s_Ad8hQc7c_7s5dJsKd_AcQh2c8d_2s7d6cAh_3dTcQd3s_Kc2h6d7h() {
    assertEquals(
      "AcQh2c8d=Ad8hQc7c Jd2d4h4c 7s5dJsKd 2s7d6cAh 3dTcQd3s Kc2h6d7h Th4d5h5s",
      Solver.process("omaha-holdem 3h5c8c9hJh Jd2d4h4c Th4d5h5s Ad8hQc7c 7s5dJsKd AcQh2c8d 2s7d6cAh 3dTcQd3s Kc2h6d7h"));
  }

  @Test
  public void test_omaha_holdem_1987_5d6s7s9cKh_AsJd4dQs_Jh3cAd7h_Qh2s2dJs_Ah6dKcTh_8h6cAc3h_Qc3s8d5c_4c7cTd7d() {
    assertEquals(
      "AsJd4dQs Qh2s2dJs Jh3cAd7h Ah6dKcTh 4c7cTd7d 8h6cAc3h=Qc3s8d5c",
      Solver.process("omaha-holdem 5d6s7s9cKh AsJd4dQs Jh3cAd7h Qh2s2dJs Ah6dKcTh 8h6cAc3h Qc3s8d5c 4c7cTd7d"));
  }

  @Test
  public void test_omaha_holdem_1988_6h9cAcKhTh_AsTs7sJs_8s3c5sTc_5c9hAd4d_7hKcJh6s_2cAh4hJc_Qh2h8cQc_Kd8d9d7c() {
    assertEquals(
      "8s3c5sTc 5c9hAd4d AsTs7sJs Kd8d9d7c 7hKcJh6s Qh2h8cQc 2cAh4hJc",
      Solver.process("omaha-holdem 6h9cAcKhTh AsTs7sJs 8s3c5sTc 5c9hAd4d 7hKcJh6s 2cAh4hJc Qh2h8cQc Kd8d9d7c"));
  }

  @Test
  public void test_omaha_holdem_1989_3h5c9dKhQc_3cJdKs6h_AcJs8s5s_2h9s9hAh() {
    assertEquals(
      "AcJs8s5s 3cJdKs6h 2h9s9hAh",
      Solver.process("omaha-holdem 3h5c9dKhQc 3cJdKs6h AcJs8s5s 2h9s9hAh"));
  }

  @Test
  public void test_omaha_holdem_1990_2c3sAhKcTc_Qs2d4s6c_6sAs7d3d_Jh4d8s7s_Jd8h6d4h() {
    assertEquals(
      "Jd8h6d4h=Jh4d8s7s Qs2d4s6c 6sAs7d3d",
      Solver.process("omaha-holdem 2c3sAhKcTc Qs2d4s6c 6sAs7d3d Jh4d8s7s Jd8h6d4h"));
  }

  @Test
  public void test_omaha_holdem_1991_2h4h6hJcJh_8dKhQc4d_5d7c3d5c() {
    assertEquals(
      "8dKhQc4d 5d7c3d5c",
      Solver.process("omaha-holdem 2h4h6hJcJh 8dKhQc4d 5d7c3d5c"));
  }

  @Test
  public void test_omaha_holdem_1992_7c7sKcKsQh_QsJsKhJh_4h9h7d6h_JcJdQc6d_2s4s3sAc_5dAsTc9c() {
    assertEquals(
      "2s4s3sAc 5dAsTc9c JcJdQc6d 4h9h7d6h QsJsKhJh",
      Solver.process("omaha-holdem 7c7sKcKsQh QsJsKhJh 4h9h7d6h JcJdQc6d 2s4s3sAc 5dAsTc9c"));
  }

  @Test
  public void test_omaha_holdem_1993_2h4h8dQhQs_Jd5s9h6h_7sAc7cTs() {
    assertEquals(
      "7sAc7cTs Jd5s9h6h",
      Solver.process("omaha-holdem 2h4h8dQhQs Jd5s9h6h 7sAc7cTs"));
  }

  @Test
  public void test_omaha_holdem_1994_3c9dJhKhQs_4h7h9cAh_5d9s7sKd_8c8d2sTd_Js3sQd6c_4c2d7d8s_9h6h5cAd_KcThAsTs_6dJdJc5s() {
    assertEquals(
      "4c2d7d8s 4h7h9cAh=9h6h5cAd Js3sQd6c 5d9s7sKd 6dJdJc5s 8c8d2sTd KcThAsTs",
      Solver.process("omaha-holdem 3c9dJhKhQs 4h7h9cAh 5d9s7sKd 8c8d2sTd Js3sQd6c 4c2d7d8s 9h6h5cAd KcThAsTs 6dJdJc5s"));
  }

  @Test
  public void test_omaha_holdem_1995_7c8h8sJcQc_2s9sKs2c_7h2hAdQh_Kh5d6dAh_9c6h5sJd_5h2dTs7s_5cTd6cQd_4cKd9h6s() {
    assertEquals(
      "4cKd9h6s Kh5d6dAh 2s9sKs2c 5h2dTs7s 9c6h5sJd 7h2hAdQh 5cTd6cQd",
      Solver.process("omaha-holdem 7c8h8sJcQc 2s9sKs2c 7h2hAdQh Kh5d6dAh 9c6h5sJd 5h2dTs7s 5cTd6cQd 4cKd9h6s"));
  }

  @Test
  public void test_omaha_holdem_1996_5d6h8s9dTd_Ts9h6d3c_Tc3h4h3s_AcJs2d8c_6c9s5h7s_6sQc7d8d_JdThAd8h_4s2c5cQs_4dJcKhAh() {
    assertEquals(
      "4dJcKhAh 4s2c5cQs AcJs2d8c Tc3h4h3s Ts9h6d3c 6c9s5h7s 6sQc7d8d JdThAd8h",
      Solver.process("omaha-holdem 5d6h8s9dTd Ts9h6d3c Tc3h4h3s AcJs2d8c 6c9s5h7s 6sQc7d8d JdThAd8h 4s2c5cQs 4dJcKhAh"));
  }

  @Test
  public void test_omaha_holdem_1997_2d6d8h9c9h_7c5h8cKs_TdQh7sAd() {
    assertEquals(
      "7c5h8cKs TdQh7sAd",
      Solver.process("omaha-holdem 2d6d8h9c9h 7c5h8cKs TdQh7sAd"));
  }

  @Test
  public void test_omaha_holdem_1998_4c5d6d7sKs_9h8h5sTc_7d8s9s9c_4dAdQsQc_3dTh5cQh_2h2c8d5h_JcKd7hTd_Ac6c6s7c_Ts9dKh8c() {
    assertEquals(
      "4dAdQsQc JcKd7hTd Ac6c6s7c 3dTh5cQh 2h2c8d5h 7d8s9s9c=9h8h5sTc=Ts9dKh8c",
      Solver.process("omaha-holdem 4c5d6d7sKs 9h8h5sTc 7d8s9s9c 4dAdQsQc 3dTh5cQh 2h2c8d5h JcKd7hTd Ac6c6s7c Ts9dKh8c"));
  }

  @Test
  public void test_omaha_holdem_1999_5d5h6c9cTc_5cKd4cTd_Th2h7cJs_5sAc7hQd_Ks8c8sTs_2cJdQs3s_Kh7s8h2d_AhKcAd3d_9d9h6d4h() {
    assertEquals(
      "2cJdQs3s Th2h7cJs Ks8c8sTs AhKcAd3d 5sAc7hQd Kh7s8h2d 5cKd4cTd 9d9h6d4h",
      Solver.process("omaha-holdem 5d5h6c9cTc 5cKd4cTd Th2h7cJs 5sAc7hQd Ks8c8sTs 2cJdQs3s Kh7s8h2d AhKcAd3d 9d9h6d4h"));
  }

}
